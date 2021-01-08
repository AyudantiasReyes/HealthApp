package com.google.firebase.codelab.labelScannerUABC;

import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.content.SharedPreferences;
import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;
import java.io.Serializable;
import java.util.HashMap;
import java.util.Map;

import com.android.volley.Request;
import com.android.volley.RequestQueue;
import com.android.volley.Response;
import com.android.volley.VolleyError;
import com.android.volley.toolbox.StringRequest;
import com.android.volley.toolbox.Volley;
import com.google.firebase.codelab.UI.RegisterActivity;
import com.google.firebase.codelab.labelScannerUABC.Class.*;
import com.google.firebase.codelab.labelScannerUABC.databinding.ActivityDataEntryBinding;
import com.google.firebase.codelab.mlkitUABC.*;
/*
*   Esta clase recibe los datos obtenidos de la etiqueta escaneada, o permite al usuario ingresar
*   los datos de manera manual. Los campos se almacenan en un FoodItem que es enviado a NutrientsACtivity
*   como un extra.
*
*/

public class DataEntryActivity extends AppCompatActivity implements View.OnClickListener{
    private ActivityDataEntryBinding binding;
    FoodItem foodItem;
    private static final String URL = "http://conisoft.org/HealthApp/insertFood.php";
    private SharedPreferences preferences;
    String id;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        //setContentView(R.layout.activity_data_entry);
        binding = ActivityDataEntryBinding.inflate(getLayoutInflater());
        setContentView(binding.root1);

        Bundle extras = getIntent().getExtras();

        //Revisamos si nos llegó un extra de otra actividad.
        if (extras != null) {
            foodItem = (FoodItem) extras.getSerializable("foodItem");
            System.out.println(foodItem.getProduct_name());
            setData(foodItem);
        }

        preferences = getSharedPreferences(SharedPreference.namePreference, MODE_PRIVATE);
        id = preferences.getString(SharedPreference.KeyEmail,null);

        binding.acceptButton.setOnClickListener(this);
        binding.backButton.setOnClickListener(this);
    }

    @Override
    public void onResume() {
        super.onResume();
        Bundle extras = getIntent().getExtras();

        if (extras != null) {
            foodItem = (FoodItem) extras.getSerializable("foodItem");
            System.out.println(foodItem.getProduct_name());
            setData(foodItem);
            // and get whatever type user account id is
        }
    }

    //En caso de tener haber recibido un FoodItem, llenamos todas las TextBoxes posibles
    public void setData(FoodItem foodItem){

        binding.nombreEditText.setText(foodItem.getProduct_name());
        if(foodItem.getPortion_size() != 0)
            binding.porcionEditText.setText(String.valueOf(foodItem.getPortion_size()));
        if(foodItem.getPortions() != 0)
            binding.numeroPorcionesEditText.setText(String.valueOf(foodItem.getPortions()));
        if(foodItem.getCalories() != 0)
            binding.caloriasEditText.setText(String.valueOf(foodItem.getCalories()));
        if(foodItem.getSugar() != 0)
            binding.azucarEditText.setText(String.valueOf(foodItem.getSugar()));
        if(foodItem.getCarbs() != 0)
            binding.carbsEditText.setText(String.valueOf(foodItem.getCarbs()));
        if(foodItem.getProtein() != 0)
            binding.proteinaEditText.setText(String.valueOf(foodItem.getProtein()));
        if(foodItem.getFat() != 0)
            binding.lipidosEditText.setText(String.valueOf(foodItem.getFat()));
        if(foodItem.getSodium() != 0)
            binding.sodioEditText.setText(String.valueOf(foodItem.getSodium()));
    }

    @Override
    public void onClick(View view) {
        switch (view.getId()) {
            case R.id.acceptButton:
                String product_name = binding.nombreEditText.getText().toString();
                String portion_size = binding.porcionEditText.getText().toString();
                boolean next = true;
                if (product_name.trim().equals("")){
                    binding.nombreTitle.setTextColor(Color.rgb(255, 0, 55));
                    Toast.makeText(this, "Ingrese un nombre de producto", Toast.LENGTH_SHORT).show();
                    next = false;
                }
                if(portion_size.equals("")){
                    portion_size = "0";
                }
                if (Float.parseFloat(portion_size) == 0){
                    binding.porcionTitle.setTextColor(Color.rgb(255, 0, 55));
                    Toast.makeText(this, "Ingrese un tamaño de porción", Toast.LENGTH_SHORT).show();
                    next = false;
                }

                if(next){
                    Intent intent = new Intent(this, NutrientsActivity.class);
                    foodItem = new FoodItem();
                    foodItem.setProduct_name(binding.nombreEditText.getText().toString());
                    if(binding.porcionEditText.getText().toString().length() > 0)
                        foodItem.setPortion_size(Float.parseFloat(binding.porcionEditText.getText().toString()));
                    if(binding.numeroPorcionesEditText.getText().toString().length() > 0)
                        foodItem.setPortions(Float.parseFloat(binding.numeroPorcionesEditText.getText().toString()));
                    if(binding.caloriasEditText.getText().toString().length() > 0)
                        foodItem.setCalories(Float.parseFloat(binding.caloriasEditText.getText().toString()));
                    if(binding.azucarEditText.getText().toString().length() > 0)
                        foodItem.setSugar(Float.parseFloat(binding.azucarEditText.getText().toString()));
                    if(binding.carbsEditText.getText().toString().length() > 0)
                        foodItem.setCarbs(Float.parseFloat(binding.carbsEditText.getText().toString()));
                    if(binding.proteinaEditText.getText().toString().length() > 0)
                        foodItem.setProtein(Float.parseFloat(binding.proteinaEditText.getText().toString()));
                    if(binding.lipidosEditText.getText().toString().length() > 0)
                        foodItem.setFat(Float.parseFloat(binding.lipidosEditText.getText().toString()));
                    if(binding.sodioEditText.getText().toString().length() > 0)
                        foodItem.setSodium(Float.parseFloat(binding.sodioEditText.getText().toString()));
                    intent.putExtra("foodItem", (Serializable) foodItem);
                    intent.setFlags(Intent.FLAG_ACTIVITY_REORDER_TO_FRONT);
                    //Insertamos el alimento en la base de datos
                    insertFood(foodItem);
                    startActivity(intent);
                    finish();
                }
                break;

            case R.id.backButton:
                finish();
                break;
        }
    }

    private void insertFood(final FoodItem food){
        StringRequest request = new StringRequest(Request.Method.POST, URL, new Response.Listener<String>() {
            @Override
            public void onResponse(String response) {
                if(response.equals("true"))
                    Toast.makeText(DataEntryActivity.this,R.string.update,Toast.LENGTH_SHORT).show();
                else
                    Toast.makeText(DataEntryActivity.this,R.string.add,Toast.LENGTH_SHORT).show();
            }
        }, new Response.ErrorListener() {
            @Override
            public void onErrorResponse(VolleyError error) {
                Toast.makeText(DataEntryActivity.this, error.toString(), Toast.LENGTH_SHORT).show();
            }
        }){
            @Override
            protected Map<String, String> getParams() {
                Map<String,String> parameter = new HashMap<>();
                parameter.put("id",id);
                parameter.put("name",food.getProduct_name());
                parameter.put("tamano",String.valueOf(food.getPortion_size()));
                parameter.put("porcion",String.valueOf(food.getPortions()));
                parameter.put("caloria",String.valueOf(food.getCalories()));
                parameter.put("azucar",String.valueOf(food.getSugar()));
                parameter.put("carbohidrato",String.valueOf(food.getCarbs()));
                parameter.put("proteina",String.valueOf(food.getProtein()));
                parameter.put("lipido",String.valueOf(food.getFat()));
                parameter.put("sodio",String.valueOf(food.getSodium()));
                return parameter;
            }
        };
        RequestQueue requestQueue = Volley.newRequestQueue(this);
        requestQueue.add(request);
    }

}