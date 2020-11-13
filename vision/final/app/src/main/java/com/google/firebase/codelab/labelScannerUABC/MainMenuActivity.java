package com.google.firebase.codelab.labelScannerUABC;

import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.Point;
import android.graphics.Rect;
import android.net.Uri;
import android.provider.MediaStore;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import com.google.android.gms.tasks.OnFailureListener;
import com.google.android.gms.tasks.OnSuccessListener;
import com.google.android.gms.tasks.Task;
import com.google.firebase.codelab.labelScannerUABC.R;
import com.google.firebase.codelab.labelScannerUABC.databinding.ActivityMainMenuBinding;
import com.google.firebase.ml.vision.FirebaseVision;
import com.google.firebase.ml.vision.common.FirebaseVisionImage;
import com.google.firebase.ml.vision.text.FirebaseVisionCloudTextRecognizerOptions;
import com.google.firebase.ml.vision.text.FirebaseVisionText;
import com.google.firebase.ml.vision.text.FirebaseVisionTextRecognizer;

import java.io.IOException;
import java.io.Serializable;
import java.util.Arrays;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class MainMenuActivity extends AppCompatActivity implements View.OnClickListener {
    Bitmap img;
    int PICK_IMAGE_REQUEST=1;
    static final int REQUEST_IMAGE_CAPTURE = 1;
    ActivityMainMenuBinding binding;
    FoodItem foodItem;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityMainMenuBinding.inflate(getLayoutInflater());
        setContentView(binding.root);
        binding.productoButton.setOnClickListener(this);
        binding.cameraButton.setOnClickListener(this);
        binding.inputButton.setOnClickListener(this);
        binding.galleryButton.setOnClickListener(this);
    }

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
                dispatchTakePictureIntent();
                break;
            case R.id.galleryButton:
                getImage();
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

        if ((requestCode == PICK_IMAGE_REQUEST || requestCode == REQUEST_IMAGE_CAPTURE) && resultCode == RESULT_OK && data != null && data.getData() != null) {
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
    }


    private void runTextRecognition() {
        FirebaseVisionImage image = FirebaseVisionImage.fromBitmap(img);
        FirebaseVisionTextRecognizer recognizer = FirebaseVision.getInstance()
                .getOnDeviceTextRecognizer();
        //mTextButton.setEnabled(false);
        recognizer.processImage(image)
                .addOnSuccessListener(
                        new OnSuccessListener<FirebaseVisionText>() {
                            @Override
                            public void onSuccess(FirebaseVisionText texts) {
                                //mTextButton.setEnabled(true);
                                processTextRecognitionResult(texts);
                            }
                        })
                .addOnFailureListener(
                        new OnFailureListener() {
                            @Override
                            public void onFailure(@NonNull Exception e) {
                                // Task failed with an exception
                                //mTextButton.setEnabled(true);
                                e.printStackTrace();
                            }
                        });
    }

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

    private void processTextRecognitionResult(FirebaseVisionText texts) {
        String content = "";
        List<FirebaseVisionText.TextBlock> blocks = texts.getTextBlocks();
        if (blocks.size() == 0) {
            showToast("No text found");
            return;
        }
        //mGraphicOverlay.clear();
        for (int i = 0; i < blocks.size(); i++) {
            List<FirebaseVisionText.Line> lines = blocks.get(i).getLines();
            for (int j = 0; j < lines.size(); j++) {
                List<FirebaseVisionText.Element> elements = lines.get(j).getElements();
                for (int k = 0; k < elements.size(); k++) {
                    content = content + " " + elements.get(k).getText();
                    //return;
                }
            }
        }

        System.out.println(content);
        parseText(content);
    }

    private void processCloudTextRecognitionResult(FirebaseVisionText texts) {
        String content = "";
        List<FirebaseVisionText.TextBlock> blocks = texts.getTextBlocks();
        if (blocks.size() == 0) {
            showToast("No text found");
            return;
        }
        //mGraphicOverlay.clear();
        for (int i = 0; i < blocks.size(); i++) {
            List<FirebaseVisionText.Line> lines = blocks.get(i).getLines();
            for (int j = 0; j < lines.size(); j++) {
                List<FirebaseVisionText.Element> elements = lines.get(j).getElements();
                for (int k = 0; k < elements.size(); k++) {
                    content = content + " " + elements.get(k).getText();
                    //return;
                }
            }
        }

        System.out.println(content);
        parseText(content);
    }


    private void parseText(String s) {
        // Expresiones regulares que analizan el texto obtenido de FirebaseVision y busca cada una de las frases indicadas, por lo general
        // nutriente -> numero -> unidad.
        foodItem = new FoodItem();
        System.out.println(s);
        String regex_cal = "(?i)(calorias|calorías|calories|calories\\/calorías|calories\\/calorias|contenido energético|contenido energetico)(:|-)?([\\s]|[a-z])*(\\d+)([\\s+]?)(kcal|cal|kJ|kj|kilojoule)?";
        Pattern pattern = Pattern.compile(regex_cal);
        Matcher matcher = pattern.matcher(s);

        while (matcher.find()) {
            if(matcher.group(6)!=null){
                if(matcher.group(6).toLowerCase().equals("kj")||matcher.group(6).toLowerCase().equals("kilojoule"))
                    foodItem.setCalories(Float.valueOf(matcher.group(4))*0.239006f);
                else
                    foodItem.setCalories(Float.valueOf(matcher.group(4)));
                System.out.println(matcher.group(6).toLowerCase());
                System.out.println("calorías: " + foodItem.getCalories());
            }
        }

        String regex_porcion = "(?i)(por porción|la porción|por porcion|la porcion|por ración|por racion)(:|-)?([\\s]|[a-z])*(\\d+)([.,]\\d)?([\\s+]?)(gr|ml|g|\\sg|\\sgr)?";
        pattern = Pattern.compile(regex_porcion);
        matcher = pattern.matcher(s);

        while (matcher.find()) {
            if(matcher.group(5)!=null)
                foodItem.setPortion_size(Float.valueOf(matcher.group(4)+matcher.group(5)));
            else
                foodItem.setPortion_size(Float.valueOf(matcher.group(4)));
            System.out.println("tamaño de porcion: " + foodItem.getPortion_size());
        }

        String regex_numPorciones = "(?i)(porciones por envase|porciones por empaque|porciones por paquete|raciones por envase|raciones por empaque|porciones totales)(:|-)?([\\s]|[a-z])*(\\d+)([.,]\\d)?([\\s+]?)(gr|ml|g|\\sg|\\sgr)?";
        pattern = Pattern.compile(regex_numPorciones);
        matcher = pattern.matcher(s);

        while (matcher.find()) {
            //System.out.println("ERRRRRROR" + matcher.group(4));
            if(matcher.group(5)!=null) {
                String temp = matcher.group(5).replaceAll(",",".");
                foodItem.setPortions(Float.valueOf(matcher.group(4) + temp));
            }
            else
                foodItem.setPortions(Float.valueOf(matcher.group(4)));
            System.out.println("numero de porciones: " + foodItem.getPortions());
        }

        String regex_azucar = "(?i)(az[uú]car|az[uú]cares)(:|-)?([\\s]|[a-z])*(\\d+)([\\s+]?)([.,]\\d)?([\\s+]?)(gr|ml|g|\\sg|\\sgr)?";
        pattern = Pattern.compile(regex_azucar);
        matcher = pattern.matcher(s);

        while (matcher.find()) {
            if(matcher.group(5)!=null)
                foodItem.setSugar(Float.valueOf(matcher.group(4)+matcher.group(5)));
            else
                foodItem.setSugar(Float.valueOf(matcher.group(4)));
            System.out.println("Azucar: " + foodItem.getSugar());
        }

        String regex_carbs = "(?i)(carbohidratos|hidratos de carbono|carbohidratos \\(hidratos de carbono\\))(:|-)?([\\s]|[a-z])*(\\d+)([.,]\\d)?([\\s+]?)(gr|ml|g|\\sg|\\sgr)?";
        pattern = Pattern.compile(regex_carbs);
        matcher = pattern.matcher(s);

        while (matcher.find()) {
            if(matcher.group(5)!=null)
                foodItem.setCarbs(Float.valueOf(matcher.group(4)+matcher.group(5)));
            else
                foodItem.setCarbs(Float.valueOf(matcher.group(4)));
            System.out.println("calorías: " + foodItem.getCalories());
        }

        String regex_proteina = "(?i)(prote[ií]na|prote[ií]nas)(:|-)?([\\s]|[a-z])*(\\d+)([.,]\\d)?([\\s+]?)(gr|ml|g|\\sg|\\sgr)?";
        pattern = Pattern.compile(regex_proteina);
        matcher = pattern.matcher(s);

        while (matcher.find()) {
            if(matcher.group(5)!=null)
                foodItem.setProtein(Float.valueOf(matcher.group(4)+matcher.group(5)));
            else
                foodItem.setProtein(Float.valueOf(matcher.group(4)));
            System.out.println("calorías: " + foodItem.getCalories());
        }

        String regex_lipidos = "(?i)(grasas|grasa|l[ií]pidos|grasas \\(l[ií]pidos\\))(:|-)?([\\s]|[a-z])*(\\d+)([.,]\\d)?([\\s+]?)(gr|ml|g|\\sg|\\sgr)?";
        pattern = Pattern.compile(regex_lipidos);
        matcher = pattern.matcher(s);

        while (matcher.find()) {
            if(matcher.group(5)!=null)
                foodItem.setFat(Float.valueOf(matcher.group(4)+matcher.group(5)));
            else
                foodItem.setFat(Float.valueOf(matcher.group(4)));
            System.out.println("calorías: " + foodItem.getCalories());
        }

        String regex_sodio = "(?i)(sodio|sodium)(:|-)?([\\s]|[a-z])*(\\d+)([.,]\\d)?([\\s+]?)(mg|\\smg)?";
        pattern = Pattern.compile(regex_sodio);
        matcher = pattern.matcher(s);

        while (matcher.find()) {
            if(matcher.group(5)!=null)
                foodItem.setSodium(Float.valueOf(matcher.group(4)+matcher.group(5)));
            else
                foodItem.setSodium(Float.valueOf(matcher.group(4)));
            System.out.println("calorías: " + foodItem.getCalories());
        }

        //String regex_protein = "(Sodio|sodio|\\/Sodio)([\\s]+)?(?<calorias>\\d+)([\\s]+?)(g|G|gr|Gr|mg|Mg|MG)?";
        Intent intent = new Intent(this, DataEntryActivity.class);
        intent.setFlags(Intent.FLAG_ACTIVITY_REORDER_TO_FRONT);
        intent.putExtra("foodItem", (Serializable) foodItem);
        System.out.println(foodItem.getProduct_name());
        startActivity(intent);
    }

    private void showToast(String message) {
        Toast.makeText(getApplicationContext(), message, Toast.LENGTH_SHORT).show();
    }


}
