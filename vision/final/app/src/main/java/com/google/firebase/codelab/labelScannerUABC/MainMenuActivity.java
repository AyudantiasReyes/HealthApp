package com.google.firebase.codelab.labelScannerUABC;

import android.Manifest;
import android.app.Activity;
import android.content.Intent;
import android.content.SharedPreferences;
import android.content.pm.PackageManager;
import android.graphics.Bitmap;
import android.graphics.Point;
import android.graphics.Rect;
import android.hardware.Camera;
import android.hardware.camera2.CameraAccessException;
import android.hardware.camera2.CameraCharacteristics;
import android.hardware.camera2.CameraManager;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.provider.MediaStore;
import android.util.Log;
import android.util.SparseIntArray;
import android.view.Surface;
import android.view.View;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.annotation.RequiresApi;
import androidx.appcompat.app.AppCompatActivity;

import com.google.android.gms.tasks.OnFailureListener;
import com.google.android.gms.tasks.OnSuccessListener;
import com.google.android.gms.tasks.Task;
import com.google.firebase.codelab.UI.LoginActivity;
import com.google.firebase.codelab.labelScannerUABC.Class.FoodItem;
import com.google.firebase.codelab.labelScannerUABC.Class.SharedPreference;
import com.google.firebase.codelab.labelScannerUABC.Class.User;
import com.google.firebase.codelab.labelScannerUABC.databinding.ActivityMainMenuBinding;
import com.google.firebase.codelab.parserActivity.TextElements;
import com.google.firebase.ml.vision.FirebaseVision;
import com.google.firebase.ml.vision.common.FirebaseVisionImage;
import com.google.firebase.ml.vision.text.FirebaseVisionCloudTextRecognizerOptions;
import com.google.firebase.ml.vision.text.FirebaseVisionText;
import com.google.firebase.ml.vision.text.FirebaseVisionTextRecognizer;
import com.google.mlkit.vision.common.InputImage;
import com.google.mlkit.vision.text.Text;
import com.google.mlkit.vision.text.TextRecognition;
import com.google.mlkit.vision.text.TextRecognizer;

import java.io.IOException;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class MainMenuActivity extends AppCompatActivity implements View.OnClickListener {
    private Bitmap img;
    private final int PICK_IMAGE_REQUEST= 1;
    private static final int REQUEST_IMAGE_CAPTURE = 2;
    private SharedPreferences preferences;


   //*******************************************//
    private ArrayList<TextElements> elements;

    private static final SparseIntArray ORIENTATIONS = new SparseIntArray();

    static {
        ORIENTATIONS.append(Surface.ROTATION_0, 0);
        ORIENTATIONS.append(Surface.ROTATION_90, 90);
        ORIENTATIONS.append(Surface.ROTATION_180, 180);
        ORIENTATIONS.append(Surface.ROTATION_270, 270);
    }

    //****************************************//

    @RequiresApi(api = Build.VERSION_CODES.M)
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        preferences = getSharedPreferences(SharedPreference.namePreference, MODE_PRIVATE);
        User user = LoadSharedPreferences();

        //*********************************************//
        elements = new ArrayList<>();
        //Checamos permisos de la camara
        if (checkSelfPermission(Manifest.permission.CAMERA) != PackageManager.PERMISSION_GRANTED) {
            //Pedimos permiso si no lo tenemos
            requestPermissions(new String[]{Manifest.permission.CAMERA}, 101);
        }

        //********************************************//

        Log.d("name",user.getName());
        Log.d("email",user.getEmail());

        com.google.firebase.codelab.labelScannerUABC.databinding.ActivityMainMenuBinding binding = ActivityMainMenuBinding.inflate(getLayoutInflater());
        setContentView(binding.root);
        binding.productoButton.setOnClickListener(this);
        binding.cameraButton.setOnClickListener(this);
        binding.inputButton.setOnClickListener(this);
        binding.galleryButton.setOnClickListener(this);
        binding.buttonLogout.setOnClickListener(this);
        binding.textView14.setText(user.getEmail());
        binding.textView15.setText(user.getName());
    }

    //**************************************************//
    public void openCamera(View view) {
        //Abrimos la camara
        Intent intent = new Intent(MediaStore.ACTION_IMAGE_CAPTURE);
        startActivityForResult(intent, REQUEST_IMAGE_CAPTURE);
    }


    //***********************************************///

    @Override
    public void onClick(View view) {
        Intent intent;
        switch (view.getId()) {
            case R.id.productoButton:
                intent = new Intent(this, ProductListActivity.class);
                startActivity(intent);
                break;
            case R.id.inputButton:
                intent = new Intent(this, DataEntryActivity.class);
                startActivity(intent);
                break;
            case R.id.cameraButton:
                //*******************************//
                openCamera(view);
                //*****************************//

                //dispatchTakePictureIntent();
                break;
            case R.id.galleryButton:
                getImage();
                break;
            case R.id.button_logout:
                logout();
                break;
        }
    }

    void getImage(){
        Intent intent = new Intent();
        intent.setType("image/*");
        intent.setAction(Intent.ACTION_GET_CONTENT);
        startActivityForResult(Intent.createChooser(intent, "Select Picture"), PICK_IMAGE_REQUEST);
    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, Intent data) {
        super.onActivityResult(requestCode, resultCode, data);

        if ((requestCode == REQUEST_IMAGE_CAPTURE) && resultCode == RESULT_OK && data != null && data.getData() != null) {
            Uri filePath = data.getData();

            try {
                img = MediaStore.Images.Media.getBitmap(getContentResolver(), filePath);
                showToast("Analizando");
                runCloudTextRecognition();
                //runTextRecognition();
            } catch (IOException e) {
                e.printStackTrace();
            }

            if(img!= null) {
                Log.i("IMAGE: ","Changing image!");
                //userIcon.setImageBitmap(img);
            }
        }
        //**********************************************************//
        if(requestCode == REQUEST_IMAGE_CAPTURE){
            assert data != null;
            Bundle bundle = data.getExtras();   //De bundle, extraer imagen
            Bitmap bitmap = (Bitmap) bundle.get("data"); //Los datos byte se convierten a un bitmap


            InputImage image = null; //Creamos una Imagen para ser procesada
            try {
                int degree = getRotationCompensation(getCameraid(), this, false);
                Log.d("RESULTADO", String.valueOf(degree));

                image = InputImage.fromBitmap(bitmap, degree - 90);
            } catch (CameraAccessException e) {
                e.printStackTrace();
            }
            TextRecognizer recognizer = TextRecognition.getClient(); //Obtener reconocedor de texto


            //a
            Task<Text> result =
                    recognizer.process(image) //Procesar la Imagen para obtener texto
                            .addOnSuccessListener(new OnSuccessListener<Text>() {
                                @RequiresApi(api = Build.VERSION_CODES.N)
                                @Override
                                public void onSuccess(Text visionText) { //visionText es el texto que regresa la app

                                    extractText(visionText);
                                }
                            })
                            .addOnFailureListener(
                                    new OnFailureListener() {
                                        @Override
                                        public void onFailure(@NonNull Exception e) {
                                            // Task failed with an exception
                                            // ...
                                        }
                                    });
        }

        //***************************************************///
    }


    //*************************************************//
    @RequiresApi(api = Build.VERSION_CODES.LOLLIPOP)
    private int getRotationCompensation(String cameraId, Activity activity, boolean isFrontFacing) //Metodo para obtener la rotacion del dispositivo
            throws CameraAccessException {
        // Get the device's current rotation relative to its "native" orientation.
        // Then, from the ORIENTATIONS table, look up the angle the image must be
        // rotated to compensate for the device's rotation.
        int deviceRotation = activity.getWindowManager().getDefaultDisplay().getRotation();
        int rotationCompensation = ORIENTATIONS.get(deviceRotation);

        // Get the device's sensor orientation.
        CameraManager cameraManager = (CameraManager) activity.getSystemService(CAMERA_SERVICE);
        int sensorOrientation = cameraManager
                .getCameraCharacteristics(cameraId)
                .get(CameraCharacteristics.SENSOR_ORIENTATION);

        if (isFrontFacing) {
            rotationCompensation = (sensorOrientation + rotationCompensation) % 360;
        } else { // back-facing
            rotationCompensation = (sensorOrientation - rotationCompensation + 360) % 360;
        }
        return rotationCompensation;
    }

    @RequiresApi(api = Build.VERSION_CODES.N)
    public void extractText(Text result) {
        String resultText = result.getText();
        for (Text.TextBlock block : result.getTextBlocks()) {
            String blockText = block.getText();
            Point[] blockCornerPoints = block.getCornerPoints();
            Rect blockFrame = block.getBoundingBox();
            for (Text.Line line : block.getLines()) {
                String lineText = line.getText();
                Point[] lineCornerPoints = line.getCornerPoints();
                Rect lineFrame = line.getBoundingBox();
                for (Text.Element element : line.getElements()) {
                    String elementText = element.getText();
                    Point[] elementCornerPoints = element.getCornerPoints();
                    Rect elementFrame = element.getBoundingBox();

                    elements.add(new TextElements(elementText, elementFrame)); //añadir elementos al arreglo elements
                }
            }
        }
        sortElements(); //Se ordenan los resultados

        for (TextElements element : elements) { //Imprimir resultados de los elementos

            Log.d("RESULTADO", element.getText() + " | " + element.getFrame());
        }

        elements.clear();
    }

    private String getCameraid(){ //Metodo para obtener el id de la cámara
        int cameraId = -1;
        int numberOfCameras = Camera.getNumberOfCameras();
        for (int i = 0; i < numberOfCameras; i++) {
            Camera.CameraInfo info = new Camera.CameraInfo();
            Camera.getCameraInfo(i, info);
            if (info.facing == Camera.CameraInfo.CAMERA_FACING_BACK) {
                Log.d("RESULTADO", "Camera found " + i);
                cameraId = i;
                break;
            }
        }

        return String.valueOf(cameraId);
    }

    @RequiresApi(api = Build.VERSION_CODES.N)
    private void sortElements() {
        int i = 0;
        TextElements aux;
        ArrayList<TextElements> group = new ArrayList<>(); //arraylist para guardar pequeños renglones
        ArrayList<TextElements> sortedGroups = new ArrayList<>();//arraylist para guardar los grupos ordenados
        StringBuilder builder = new StringBuilder();

        elements.sort((o1, o2) -> Integer.compare(o1.getFrame().top, o2.getFrame().top)); //ordenamiento por Y a los elementos
        /*
            Funcion lambda, o1 y o2 son objetos tipo TextElement y se agrega la condicion de que quieres comparar
            En este caso se esta tomando el top del rect de ambos objetos para que el arraylist los ordene usando QuickSort
        */

        while(i < elements.size() - 1){
            Log.d("SALIDA", "PRIMER WHILE ");
            aux = elements.get(i);
            group.add(aux);

            try{
                int resta = Math.abs(aux.getFrame().top - elements.get(i + 1).getFrame().top);
                Log.d("SALIDA", "RESTA = " + resta);
                if(resta <= 5){
                    do{
                        Log.d("SALIDA", "DENTRO DEL DO WHILE ");
                        group.add(elements.get(i + 1));
                        i++;
                        resta = Math.abs(aux.getFrame().top - elements.get(i + 1).getFrame().top);
                    }while (resta <= 5);
                    i++;

                    group.sort((o1, o2) -> Integer.compare(o1.getFrame().left, o2.getFrame().left)); //ordenamiento por X a los elementos
                    sortedGroups.addAll(group);
                    group.clear();
                }
                else
                    i++;

            }catch (Exception e){

            }


            Log.d("SALIDA", "size = " + elements.size() + " i = " + i);

        }

        elements.clear();
        elements.addAll(sortedGroups);
        Log.d("SALIDA", "AWEBO ");

    }

    //************************************************//


    private void runCloudTextRecognition() {
        FirebaseVisionImage image = FirebaseVisionImage.fromBitmap(img);
        FirebaseVisionTextRecognizer detector = FirebaseVision.getInstance()
                .getCloudTextRecognizer();
        FirebaseVisionCloudTextRecognizerOptions options = new FirebaseVisionCloudTextRecognizerOptions.Builder()
                .setLanguageHints(Arrays.asList("es"))
                .build();
        //mTextButton.setEnabled(false);
        String text = "";
        Task<FirebaseVisionText> result = detector.processImage(image)
                .addOnSuccessListener(new OnSuccessListener<FirebaseVisionText>() {
                    @Override
                    public void onSuccess(FirebaseVisionText result) {
                        String text = "";
                        // Task completed successfully
                        // [START_EXCLUDE]
                        // [START get_text_cloud]
                        for (FirebaseVisionText.TextBlock block : result.getTextBlocks()) {
                            Rect boundingBox = block.getBoundingBox();
                            Point[] cornerPoints = block.getCornerPoints();
                            text = text + " " + block.getText();
                            //System.out.println(text);
                            for (FirebaseVisionText.Line line: block.getLines()) {
                                // ...
                                for (FirebaseVisionText.Element element: line.getElements()) {

                                }
                            }
                        }
                        parseText(text);
                        // [END get_text_cloud]
                        // [END_EXCLUDE]
                    }
                })
                .addOnFailureListener(new OnFailureListener() {
                    @Override
                    public void onFailure(@NonNull Exception e) {
                        // Task failed with an exception
                        // ...
                    }
                });
    }


    private void dispatchTakePictureIntent() {
        Intent takePictureIntent = new Intent(MediaStore.ACTION_IMAGE_CAPTURE);
        if (takePictureIntent.resolveActivity(getPackageManager()) != null) {
            startActivityForResult(takePictureIntent, REQUEST_IMAGE_CAPTURE);
        }
    }



    private void parseText(String s) {
        // Expresiones regulares que analizan el texto obtenido de FirebaseVision y busca cada una de las frases indicadas, por lo general
        // nutriente -> numero -> unidad.
        FoodItem foodItem = new FoodItem();
        System.out.println(s);
        String regex_cal = "(?i)()(:|-)?([\\s]|[a-z])*(\\d+)([\\s+]?)(kcal|cal|kJ|kj|kl|kilojoule)?";
        Pattern pattern = Pattern.compile(regex_cal);
        Matcher matcher = pattern.matcher(s);

        while (matcher.find()) {
            if(matcher.group(6)!=null){
                if(matcher.group(6).toLowerCase().equals("kj")||matcher.group(6).toLowerCase().equals("kilojoule")||matcher.group(6).toLowerCase().equals("kl"))
                    foodItem.setCalories(Float.parseFloat(matcher.group(4))*0.239006f);
                else
                    foodItem.setCalories(Float.parseFloat(matcher.group(4)));
                System.out.println(matcher.group(6).toLowerCase());
                System.out.println("calorías: " + foodItem.getCalories());
            }
        }

        String regex_porcion = "(?i)(por porci[oó]n|la porci[oó]n|por raci[oó]n|porcióön|de porci[oó]n)(:|-)?([\\s]|[a-z])*(\\d+)([.,]\\d)?([\\s+]?)(gr|ml|g|\\sg|\\sgr|)?";
        pattern = Pattern.compile(regex_porcion);
        matcher = pattern.matcher(s);

        while (matcher.find()) {
            if(matcher.group(5)!=null)
                foodItem.setPortion_size(Float.parseFloat(matcher.group(4)+matcher.group(5)));
            else
                foodItem.setPortion_size(Float.parseFloat(matcher.group(4)));
            System.out.println("tamaño de porcion: " + foodItem.getPortion_size());
        }

        String regex_numPorciones = "(?i)(porciones por envase|porciones por empaque|porciones por paquete|raciones por envase|raciones por empaque|porciones totales|porciones por sobre)(:|-)?([\\s]|[a-z])*(\\d+)([.,]\\d)?([\\s+]?)(gr|ml|g|\\sg|\\sgr|)?";
        pattern = Pattern.compile(regex_numPorciones);
        matcher = pattern.matcher(s);

        while (matcher.find()) {
            //System.out.println("ERRRRRROR" + matcher.group(4));
            if(matcher.group(5)!=null) {
                String temp = matcher.group(5).replaceAll(",",".");
                foodItem.setPortions(Float.parseFloat(matcher.group(4) + temp));
            }
            else
                foodItem.setPortions(Float.parseFloat(matcher.group(4)));
            System.out.println("numero de porciones: " + foodItem.getPortions());
        }

        String regex_azucar = "(?i)(az[uú]car|az[uú]cares)(:|-)?([\\s]|[a-z])*(\\d+)([\\s+]?)([.,]\\d)?([\\s+]?)(gr|ml|g|\\sg|\\sgr)?";
        pattern = Pattern.compile(regex_azucar);
        matcher = pattern.matcher(s);

        while (matcher.find()) {
            if(matcher.group(5)!=null)
                foodItem.setSugar(Float.parseFloat(matcher.group(4)+matcher.group(5)));
            else
                foodItem.setSugar(Float.parseFloat(matcher.group(4)));
            System.out.println("Azucar: " + foodItem.getSugar());
        }

        String regex_carbs = "(?i)(carbohidratos|carbohidratos totales|hidratos de carbono|carbohidratos \\(hidratos de carbono\\))(:|-)?([\\s]|[a-z])*(\\d+)([.,]\\d)?([\\s+]?)(gr|ml|g|\\sg|\\sgr|)?";
        pattern = Pattern.compile(regex_carbs);
        matcher = pattern.matcher(s);

        while (matcher.find()) {
            if(matcher.group(5)!=null)
                foodItem.setCarbs(Float.parseFloat(matcher.group(4)+matcher.group(5)));
            else
                foodItem.setCarbs(Float.parseFloat(matcher.group(4)));
            System.out.println("carbs: " + foodItem.getCarbs());
        }

        String regex_proteina = "(?i)(prote[ií]na|prote[ií]nas)(:|-)?([\\s]|[a-z])*(\\d+)([.,]\\d)?([\\s+]?)(gr|ml|g|\\sg|\\sgr|)?";
        pattern = Pattern.compile(regex_proteina);
        matcher = pattern.matcher(s);

        while (matcher.find()) {
            if(matcher.group(5)!=null)
                foodItem.setProtein(Float.parseFloat(matcher.group(4)+matcher.group(5)));
            else
                foodItem.setProtein(Float.parseFloat(matcher.group(4)));
            System.out.println("proteina: " + foodItem.getProtein());
        }

        String regex_lipidos = "(?i)(grasas|grasa|l[ií]pidos|grasas\\(l[ií]pidos\\))(:|-)?([\\s]|[a-z])*(\\d+)([.,]\\d)?([\\s+]?)(gr|ml|g|\\sg|\\sgr|)?";
        pattern = Pattern.compile(regex_lipidos);
        matcher = pattern.matcher(s);

        while (matcher.find()) {
            if(matcher.group(5)!=null)
                foodItem.setFat(Float.parseFloat(matcher.group(4)+matcher.group(5)));
            else
                foodItem.setFat(Float.parseFloat(matcher.group(4)));
            System.out.println("grasas: " + foodItem.getFat());
        }

        String regex_sodio = "(?i)()(:|-)?([\\s]|[a-z])*(\\d+)([.,]\\d)?([\\s+]?)(mg|\\smg)?";
        pattern = Pattern.compile(regex_sodio);
        matcher = pattern.matcher(s);

        while (matcher.find()) {
            if(matcher.group(5)!=null)
                foodItem.setSodium(Float.parseFloat(matcher.group(4)+matcher.group(5)));
            else
                foodItem.setSodium(Float.parseFloat(matcher.group(4)));
            System.out.println("sodio: " + foodItem.getSodium());
        }

        Intent intent = new Intent(this, DataEntryActivity.class);
        intent.setFlags(Intent.FLAG_ACTIVITY_REORDER_TO_FRONT);
        intent.putExtra("foodItem", (Serializable) foodItem);
        System.out.println(foodItem.getProduct_name());
        startActivity(intent);
    }

    private void showToast(String message) {
        Toast.makeText(getApplicationContext(), message, Toast.LENGTH_SHORT).show();
    }

    private void logout(){
        preferences.edit().clear().apply();
        startActivity(new Intent(MainMenuActivity.this, LoginActivity.class));
        finish();
    }

    private User LoadSharedPreferences(){
        String name, lastname, email, id, pass;
        name = preferences.getString(SharedPreference.KeyName,null);
        lastname = preferences.getString(SharedPreference.KeyLastname,null);
        email = preferences.getString(SharedPreference.KeyEmail,null);
        id = preferences.getString(SharedPreference.KeyName,null);
        pass = preferences.getString(SharedPreference.KeyLastname,null);
        return new User(id,name,lastname,email,pass);
    }
}
