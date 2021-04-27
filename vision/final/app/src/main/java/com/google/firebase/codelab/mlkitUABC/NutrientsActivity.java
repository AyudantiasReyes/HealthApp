package com.google.firebase.codelab.mlkitUABC;

import android.annotation.SuppressLint;
import android.app.ProgressDialog;
import android.content.Intent;
import android.content.SharedPreferences;
import android.graphics.Color;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.text.Editable;
import android.text.TextWatcher;
import android.util.Log;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;
import androidx.constraintlayout.widget.ConstraintLayout;

import com.android.volley.Request;
import com.android.volley.RequestQueue;
import com.android.volley.Response;
import com.android.volley.VolleyError;
import com.android.volley.toolbox.StringRequest;
import com.android.volley.toolbox.Volley;
import com.google.firebase.codelab.labelScannerUABC.Class.SharedPreference;
import com.google.firebase.codelab.labelScannerUABC.DataEntryActivity;
import com.google.firebase.codelab.labelScannerUABC.MainMenuActivity;
import com.google.firebase.codelab.labelScannerUABC.R;
import com.google.firebase.codelab.labelScannerUABC.databinding.ActivityNutrientsBinding;
import com.google.firebase.codelab.labelScannerUABC.Class.FoodItem;
import com.google.firebase.codelab.labelScannerUABC.Porciones;
import com.google.firebase.codelab.labelScannerUABC.TipoPorcion;
import com.mikhaellopez.circularprogressbar.CircularProgressBar;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Locale;
import java.util.Map;

import static android.view.View.GONE;

public class NutrientsActivity extends AppCompatActivity implements View.OnClickListener, AdapterView.OnItemSelectedListener {
    private static final String URL = "http://conisoft.org/HealthApp/App/insertFood.php";
    private ActivityNutrientsBinding binding;
    private FoodItem foodItem;


    private final String cantidadBajaString = "Este alimento contiene una cantidad baja de ";
    private final String cantidadRegularString = "Este alimento contiene una cantidad regular de ";
    private final String cantidadAltaString = "Este alimento contiene una cantidad alta de ";
    private final String [] nutrimentNotes = new String[]{cantidadBajaString, cantidadRegularString, cantidadAltaString};
    private int [] statusColors = new int[]{Color.GREEN, Color.YELLOW, Color.RED};
    private int [] proteinStatusColors = new int[]{Color.rgb(152, 251, 152), Color.rgb(0, 250, 14), Color.rgb(0, 255, 0)};


    private SharedPreferences preferences;
    String id;

    /*
    private final String cantidadExcesivaString = "Este alimento contiene una dosis superior a la recomendada para el consumo diario, considera reducir la porción";
    ArrayList<TipoPorcion> tiposPorciones;
    int position = 0;
    private float tamPorcionEnG;
    private float azucarDiaria = 90, caloriasDiarias = 2000, carbsDiarios = 120, proteinaDiara = 150, lipidosDiarios = 70, sodiosDiarios = 2300f;
                    //gramos            //kcal                  //gramos            //gramos                //gramos            //gramos

    ArrayAdapter<TipoPorcion> spinnerAdapter;
    private ProgressDialog progressDialog;

    */
    //suponiendo que llegan las calorias al mero millon


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        foodItem = new FoodItem();

        Bundle extras = getIntent().getExtras();

        if (extras != null) {
            foodItem = (FoodItem) extras.getSerializable("foodItem");
            System.out.println(foodItem.getProduct_name());
        }

        preferences = getSharedPreferences(SharedPreference.namePreference, MODE_PRIVATE);
        id = preferences.getString(SharedPreference.KeyId,null);

        binding = ActivityNutrientsBinding.inflate(getLayoutInflater());
        setContentView(binding.root3);
    }

    @Override
    protected void onStart() {
        super.onStart();

        setBindingStatus();
    }
    /*
        SpinnerValues();
        binding.root3.setOnClickListener(this);
        binding.cantidadEditText.setText("1");
        binding.porcionSpinner.setOnItemSelectedListener(this);
        binding.porcionSpinner.setSelection(3);
        binding.backButton.setOnClickListener(this);
        binding.editButton.setOnClickListener(this);
        binding.acceptButton.setOnClickListener(this);
        binding.cantidadEditText.addTextChangedListener(new TextWatcher() {

            public void afterTextChanged(Editable s) {
                //si el usuario edita la cantidad del alimento se debe actualizar los gráficos y el texto en tiempo real
                if(binding.cantidadEditText.getText().toString().length() > 0) {
                    //binding.azucarBar.setProgress(Float.parseFloat(binding.cantidadEditText.getText().toString()));
                    Float amount = Float.parseFloat(binding.cantidadEditText.getText().toString());
                    Float unit = tiposPorciones.get(position).getValorEnGramos();
                    tamPorcionEnG = amount * unit;
                    System.out.println("SELECTED" + tamPorcionEnG);
                    //updateUIUnits();
                }
                else{
                    Float amount = 0f;
                    Float unit = tiposPorciones.get(position).getValorEnGramos();
                    tamPorcionEnG = amount * unit;
                    System.out.println("SELECTED" + tamPorcionEnG);
                   // updateUIUnits();
                }
            }

            public void beforeTextChanged(CharSequence s, int start, int count, int after) {}

            public void onTextChanged(CharSequence s, int start, int before, int count) {}
        });
        */


    @Override
    public void onResume(){
        super.onResume();

        Bundle extras = getIntent().getExtras();

        if (extras != null) {
            foodItem = (FoodItem) extras.getSerializable("foodItem");
            System.out.println(foodItem.getProduct_name());
            // and get whatever type user account id is
        }
        //updateUI();
    }

    /*
    private void updateUI(){
        binding.nombreAlimento.setText(foodItem.getProduct_name());
        binding.azucarLayout.setVisibility(GONE);
        binding.caloriasLayout.setVisibility(GONE);
        binding.carbsLayout.setVisibility(GONE);
        binding.proteinaLayout.setVisibility(GONE);
        binding.lipidosLayout.setVisibility(GONE);
        binding.sodioLayout.setVisibility(GONE);
        if(foodItem.getSugar()>0){
            setNutrientLayout(foodItem.getSugar(), azucarDiaria, binding.azucarLayout, binding.azucarBar, binding.azucarPercentage, binding.azucarAmount, binding.azucarNotes);
        }
        if(foodItem.getCalories()>0){
            setNutrientLayout(foodItem.getCalories(), caloriasDiarias, binding.caloriasLayout, binding.caloriasBar, binding.caloriasPercentage, binding.caloriasAmount, binding.caloriasNotes);
        }
        if(foodItem.getCarbs()>0){
            setNutrientLayout(foodItem.getCarbs(), carbsDiarios, binding.carbsLayout, binding.carbsBar, binding.carbsPercentage, binding.carbsAmount, binding.carbsNotes);
        }
        if(foodItem.getProtein()>0){
            setNutrientLayout(foodItem.getProtein(), proteinaDiara, binding.proteinaLayout, binding.proteinaBar, binding.proteinaPercentage, binding.proteinaAmount, binding.proteinaNotes);
        }
        if(foodItem.getSodium()>0){
            setNutrientLayout(foodItem.getSodium(), sodiosDiarios, binding.sodioLayout, binding.sodioBar, binding.sodioPercentage, binding.sodioAmount, binding.sodioNotes);
        }
    }

    private void updateUIUnits(){
        System.out.println("UPDATE UI");
        binding.nombreAlimento.setText(foodItem.getProduct_name());
        binding.azucarLayout.setVisibility(GONE);
        binding.caloriasLayout.setVisibility(GONE);
        binding.carbsLayout.setVisibility(GONE);
        binding.proteinaLayout.setVisibility(GONE);
        binding.lipidosLayout.setVisibility(GONE);
        binding.sodioLayout.setVisibility(GONE);
        if(foodItem.getSugar()>0){
            setNutrientLayoutDivided(foodItem.getSugar()/foodItem.getPortion_size(), azucarDiaria, binding.azucarLayout, binding.azucarBar, binding.azucarPercentage, binding.azucarAmount, binding.azucarNotes);
        }
        if(foodItem.getCalories()>0){
            setNutrientLayoutDivided(foodItem.getCalories()/foodItem.getPortion_size(), caloriasDiarias, binding.caloriasLayout, binding.caloriasBar, binding.caloriasPercentage, binding.caloriasAmount, binding.caloriasNotes);
        }
        if(foodItem.getCarbs()>0){
            setNutrientLayoutDivided(foodItem.getCarbs()/foodItem.getPortion_size(), carbsDiarios, binding.carbsLayout, binding.carbsBar, binding.carbsPercentage, binding.carbsAmount, binding.carbsNotes);
        }
        if(foodItem.getProtein()>0){
            setNutrientLayoutDivided(foodItem.getProtein()/foodItem.getPortion_size(), proteinaDiara, binding.proteinaLayout, binding.proteinaBar, binding.proteinaPercentage, binding.proteinaAmount, binding.proteinaNotes);
        }
        if(foodItem.getSodium()>0){
            setNutrientLayoutDivided(foodItem.getSodium()/foodItem.getPortion_size(), sodiosDiarios, binding.sodioLayout, binding.sodioBar, binding.sodioPercentage, binding.sodioAmount, binding.sodioNotes);
        }
    }

    private void SpinnerValues() {
        //poblamos el spinner con los diferentes tipos de unidades (porcion, gramo, taza, etc.)
        tiposPorciones = new ArrayList<TipoPorcion>();
        tiposPorciones = Porciones.getTiposDePorciones();
        tiposPorciones.add(new TipoPorcion("porción",foodItem.getPortion_size()));
        if(foodItem.getPortions()!=0)
            tiposPorciones.add(new TipoPorcion("empaque",foodItem.getPortion_size() * foodItem.getPortions()));

        spinnerAdapter = new ArrayAdapter<>(this, R.layout.spinner_item, tiposPorciones);
        spinnerAdapter.setDropDownViewResource(R.layout.spinner_item);
        binding.porcionSpinner.setAdapter(spinnerAdapter);
    }

    private int getSpinnerItemIndex(Spinner spinner, String myString){
        for (int i=0;i<spinner.getCount();i++){
            if (spinner.getItemAtPosition(i).toString().equalsIgnoreCase(myString)){
                return i;
            }
        }

        return 0;
    }

    public void onItemSelected(AdapterView<?> parent, View view, int pos, long id) {
        Float amount = Float.parseFloat(binding.cantidadEditText.getText().toString());
        Float unit = tiposPorciones.get(pos).getValorEnGramos();
        position = pos;
        tamPorcionEnG = amount * unit;
        System.out.println("SELECTED" + tamPorcionEnG);
        updateUIUnits();
    }

    @Override
    public void onNothingSelected(AdapterView<?> adapterView) {

    }

    private void setNutrientLayout(float nutrientValue, float nutrientRecommendedValue, ConstraintLayout nutrientLayout, CircularProgressBar nutrientBar, TextView nutrientPercentage, TextView nutrientAmount, TextView nutrientNotes){
        float percentage = 0;
        percentage = (nutrientValue/nutrientRecommendedValue)*100;
        nutrientLayout.setVisibility(View.VISIBLE);
        nutrientBar.setProgress(percentage);
        nutrientPercentage.setText(String.format("%.0f", percentage)+"%");
        nutrientAmount.setText(String.format("%.1f", nutrientValue));
        //desplegamos texto de acuerdo al porcentaje del nutriente
        if(percentage<25){
            nutrientBar.setProgressBarColor(Color.rgb(0, 196, 255));
            nutrientNotes.setText(cantidadBajaString);
        }else if(percentage<75){
            nutrientBar.setProgressBarColor(Color.rgb(0, 255, 115));
            nutrientNotes.setText(cantidadRegularString);
        }else if(percentage<=100){
            nutrientBar.setProgressBarColor(Color.rgb(255, 221, 0));
            nutrientNotes.setText(cantidadAltaString);
        }else if (percentage>100){
            nutrientBar.setProgressBarColor(Color.rgb(255, 0, 47));
            nutrientNotes.setText(cantidadExcesivaString);
        }
    }

    private void setNutrientLayoutDivided(float nutrientValue, float nutrientRecommendedValue, ConstraintLayout nutrientLayout, CircularProgressBar nutrientBar, TextView nutrientPercentage, TextView nutrientAmount, TextView nutrientNotes){
        //dibujar los gráficos circulares de acuerdo a la cantidad de nutriente, asignarle colores a los rangos
        float percentage = 0;
        nutrientValue = nutrientValue * tamPorcionEnG;
        percentage = (nutrientValue/nutrientRecommendedValue)*100;
        nutrientLayout.setVisibility(View.VISIBLE);
        nutrientBar.setProgress(percentage);
        nutrientPercentage.setText(String.format("%.0f", percentage)+"%");
        nutrientAmount.setText(String.format("%.1f", nutrientValue));
        if(percentage<25){
            nutrientBar.setProgressBarColor(Color.rgb(0, 196, 255));
            nutrientNotes.setText(cantidadBajaString);
        }else if(percentage<75){
            nutrientBar.setProgressBarColor(Color.rgb(0, 255, 115));
            nutrientNotes.setText(cantidadRegularString);
        }else if(percentage<=100){
            nutrientBar.setProgressBarColor(Color.rgb(255, 221, 0));
            nutrientNotes.setText(cantidadAltaString);
        }else if (percentage>100){
            nutrientBar.setProgressBarColor(Color.rgb(255, 0, 47));
            nutrientNotes.setText(cantidadExcesivaString);
        }
    }

    @Override
    public void onClick(View view) {
        switch (view.getId()) {
            //TODO: agregar los métodos onClick de cada nutriente
            case R.id.azucarLayout:
                break;
            case R.id.backButton:
                finish();
                break;
            case R.id.editButton:
                System.out.println(foodItem);
                Intent intent = new Intent(this, DataEntryActivity.class);
                intent.setFlags(Intent.FLAG_ACTIVITY_REORDER_TO_FRONT);
                intent.putExtra("foodItem", (Serializable) foodItem);
                System.out.println(foodItem.getProduct_name());
                startActivity(intent);
                break;
            case R.id.acceptButton:
                progressDialog = new ProgressDialog(NutrientsActivity.this);
                progressDialog.show();
                progressDialog.setContentView(R.layout.progress_layout);
                progressDialog.setCancelable(false);
                progressDialog.getWindow().setBackgroundDrawableResource(android.R.color.transparent);
                new Handler(Looper.getMainLooper()).postDelayed(new Runnable() {
                    @Override
                    public void run() {
                        insertFood(foodItem);
                    }
                },1000);

        }
    }

    private void insertFood(final FoodItem food){
        StringRequest request = new StringRequest(Request.Method.POST, URL, new Response.Listener<String>() {
            @Override
            public void onResponse(String response) {
                if(response.equals("true")) {
                    Toast.makeText(NutrientsActivity.this, "nuevo registro", Toast.LENGTH_SHORT).show();
                    startActivity(new Intent(NutrientsActivity.this, MainMenuActivity.class));
                    finish();
                }
                else
                    Toast.makeText(NutrientsActivity.this,"Ya existe",Toast.LENGTH_SHORT).show();
                progressDialog.dismiss();
            }
        }, new Response.ErrorListener() {
            @Override
            public void onErrorResponse(VolleyError error) {
                progressDialog.dismiss();
                Toast.makeText(NutrientsActivity.this, error.toString(), Toast.LENGTH_SHORT).show();
            }
        }){
            @Override
            protected Map<String, String> getParams() {
                Map<String,String> parameter = new HashMap<>();
                parameter.put("id_user",id);
                parameter.put("name",food.getProduct_name());
                parameter.put("tamano",String.valueOf(food.getPortion_size()));
                parameter.put("porcion",String.valueOf(food.getPortions()));
                parameter.put("caloria",String.valueOf(food.getCalories()));
                parameter.put("azucar",String.valueOf(food.getSugar()));
                parameter.put("carbohidrato",String.valueOf(food.getCarbs()));
                parameter.put("proteina",String.valueOf(food.getProtein()));
                parameter.put("lipido",String.valueOf(food.getTotalFat()));
                parameter.put("sodio",String.valueOf(food.getSodium()));
                return parameter;
            }
        };
        RequestQueue requestQueue = Volley.newRequestQueue(this);
        requestQueue.add(request);
    }

     */


    @SuppressLint("SetTextI18n")
    private void setBindingStatus(){

        float servingSize = foodItem.getPortion_size();
        float sodiumPerDay = 2300;

        int fatPercentage = (int) getNutrimentPercentage(foodItem.getTotalFat(), servingSize);
        int carbsPercentage = (int)getNutrimentPercentage(foodItem.getCarbs(), servingSize);
        int sugarPercentage = (int)getNutrimentPercentage(foodItem.getSugar(), servingSize);
        int proteinPercentage = (int)getNutrimentPercentage(foodItem.getProtein(), servingSize);
        float sodiumPercentage = getNutrimentPercentage(foodItem.getSodium(), sodiumPerDay);

        //Set de calorias en base a los etiquetados de aliments

        //Mostramos calorias
        binding.caloriasAmount.setText(String.format(Locale.getDefault(), "%d", (int)foodItem.getCalories()));

        //Un producto que por cada 100g contiene 275kcal o mas es alto en calorias
        //Un producto que por cada 100ml contiene 70kcal o mas es alto en calorias
        //Un producto que por cada 100g no supera las 40 kcal es bajo en calorias
        //Un producto que por cada 100ml no supera las 20kcal es bajo en calorias

        //Si el producto se mide en gramos
        if(foodItem.getMeasurementUnit() == "g") {
            //Calculamos las calorias por cada 100g para categorizar
            int caloriesPer100g = (int) ((foodItem.getCalories()*100) / foodItem.getPortion_size());
            Log.d("CALORIAS", caloriesPer100g+"");
            //Si el product excede o es equivalente a 275 calorias
            if(caloriesPer100g >= 275) {
                binding.caloriasNotes.setText("Este producto tiene una cantidad alta de calorías.");
                binding.caloriasPercentage.setText("ALTO");
                setProgressBarStatus(binding.caloriasBar, 275,275);
            //Si el producto excede o es equivalente a 40 calorias
            } else if(caloriesPer100g >= 40) {
                binding.caloriasNotes.setText("Este producto tiene una cantidad regular de calorías.");
                binding.caloriasPercentage.setText("REGULAR");
                setProgressBarStatus(binding.caloriasBar, caloriesPer100g,275);
            //Si el producto no califica en las anteriores es bajo en calorias
            } else {
                binding.caloriasNotes.setText("Este producto tiene una cantidad baja de calorías.");
                binding.caloriasPercentage.setText("Baja");
                setProgressBarStatus(binding.caloriasBar, caloriesPer100g,275);
            }
        } else if(foodItem.getMeasurementUnit() == "ml") {
            //Calculamos las calorias por cada 100ml para categorizar
            int caloriesPer100ml = (int) ((foodItem.getCalories()*foodItem.getPortion_size()) / 100);
            //Si el product excede o es equivalente a 70 calorias
            if(caloriesPer100ml >= 275) {
                binding.caloriasNotes.setText("Este producto tiene una cantidad alta de calorías.");
                binding.caloriasPercentage.setText("ALTO");
                setProgressBarStatus(binding.caloriasBar, 70,70);
                //Si el producto excede o es equivalente a 20 calorias
            } else if(caloriesPer100ml >= 20) {
                binding.caloriasNotes.setText("Este producto tiene una cantidad regular de calorías.");
                binding.caloriasPercentage.setText("REGULAR");
                setProgressBarStatus(binding.caloriasBar, caloriesPer100ml,275);
                //Si el producto no califica en las anteriores es bajo en calorias
            } else {
                binding.caloriasNotes.setText("Este producto tiene una cantidad baja de calorías.");
                binding.caloriasPercentage.setText("Baja");
                setProgressBarStatus(binding.caloriasBar, caloriesPer100ml,275);
            }
        }

        binding.lipidosNotes.setText(nutrimentNotes[getNutrimentStatus(fatPercentage, 20)]+"grasa.");
        binding.carbsNotes.setText(nutrimentNotes[getNutrimentStatus(carbsPercentage, 49)]+"carbohidratos.");
        binding.azucarNotes.setText(nutrimentNotes[getNutrimentStatus(sugarPercentage, 10)]+"azucar.");
        binding.proteinaNotes.setText(nutrimentNotes[getNutrimentStatus(proteinPercentage, 14)]+"proteina.");
        binding.sodioNotes.setText(nutrimentNotes[getNutrimentStatus(sodiumPercentage, 20)]+"sodio.");


        binding.lipidosPercentage.setText(String.format(Locale.getDefault(), "%d",fatPercentage) + "%");
        binding.carbsPercentage.setText(String.format(Locale.getDefault(), "%d",carbsPercentage) + "%");
        binding.azucarPercentage.setText(String.format(Locale.getDefault(), "%d",sugarPercentage) + "%");
        binding.proteinaPercentage.setText(String.format(Locale.getDefault(), "%d",proteinPercentage) + "%");
        binding.sodioPercentage.setText(String.format(Locale.getDefault(), "%d", (int)Math.ceil(sodiumPercentage)) + "%");

        setProgressBarStatus(binding.lipidosBar, fatPercentage, 20);
        setProgressBarStatus(binding.carbsBar, carbsPercentage, 49);
        setProgressBarStatus(binding.azucarBar, sugarPercentage, 10);
        setProgressBarStatus(binding.sodioBar, (int) sodiumPercentage, 20);
        binding.proteinaBar.setProgressBarColor(proteinStatusColors[getNutrimentStatus(proteinPercentage, 14)]);
        binding.proteinaBar.setProgress(proteinPercentage);


        binding.lipidosAmount.setText(String.format(Locale.getDefault(), "%d", (int)foodItem.getTotalFat()));
        binding.carbsAmount.setText(String.format(Locale.getDefault(), "%d", (int)foodItem.getCarbs()));
        binding.azucarAmount.setText(String.format(Locale.getDefault(), "%d", (int)foodItem.getSugar()));
        binding.proteinaAmount.setText(String.format(Locale.getDefault(), "%d", (int)foodItem.getProtein()));
        binding.sodioAmount.setText(String.format(Locale.getDefault(), "%d", (int)foodItem.getSodium()));





    }

    private void setProgressBarStatus(CircularProgressBar nutrientBar, int percentage, int limit){
        nutrientBar.setProgress(percentage);
        nutrientBar.setProgressBarColor(statusColors[getNutrimentStatus(percentage, limit)]);
    }


    //recibe gramos de los nutrientes y el tamaño de la porcion y retorna el porcentaje
    private float getNutrimentPercentage(float nutrientG, float serving){


        return (nutrientG / serving) * 100;
    }

    private int getNutrimentStatus(float percentage, float limit){
        // 0 bajo
        // 1 moderado
        // 2 alto
        Log.d("FOOD_ITEM", percentage + "<---" + " | " + limit + "<--");
        if(percentage >= limit){
            return 2;
        }
        else if(percentage >= limit / 2){
            return 1;
        }
        else{
            return 0;
        }

    }

    @Override
    public void onClick(View v) {

    }

    @Override
    public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {

    }

    @Override
    public void onNothingSelected(AdapterView<?> parent) {

    }
}
