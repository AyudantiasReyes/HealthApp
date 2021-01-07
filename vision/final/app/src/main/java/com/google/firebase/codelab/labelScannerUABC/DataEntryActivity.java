package com.google.firebase.codelab.labelScannerUABC;

import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.content.SharedPreferences;
import android.graphics.Color;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.Toast;

import com.android.volley.Request;
import com.android.volley.RequestQueue;
import com.android.volley.Response;
import com.android.volley.VolleyError;
import com.android.volley.toolbox.StringRequest;
import com.android.volley.toolbox.Volley;
import com.google.firebase.codelab.UI.LoginActivity;
import com.google.firebase.codelab.labelScannerUABC.Class.FoodItem;
import com.google.firebase.codelab.labelScannerUABC.Class.SharedPreference;
import com.google.firebase.codelab.labelScannerUABC.Class.User;
import com.google.firebase.codelab.labelScannerUABC.databinding.ActivityDataEntryBinding;
import com.google.firebase.codelab.mlkitUABC.NutrientsActivity;

import org.json.JSONException;
import org.json.JSONObject;

import java.io.Serializable;
import java.util.HashMap;
import java.util.Map;
/*
*   Esta clase recibe los datos obtenidos de la etiqueta escaneada, o permite al usuario ingresar
*   los datos de manera manual. Los campos se almacenan en un FoodItem que es enviado a NutrientsACtivity
*   como un extra.
*
*/

public class DataEntryActivity extends AppCompatActivity{
    FoodItem foodItem;
    EditText etname,etporcion,etnoPorcion,etcalorias,etazucar,etcarbs,etproteina,etlipidos,etsodio;
    Button btn1;
    ImageButton btn2;
    private static final String URL = "http://conisoft.org/HealthApp/insertFood.php";
    private SharedPreferences preferences;
    String id;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_data_entry);

        preferences = getSharedPreferences(SharedPreference.namePreference, MODE_PRIVATE);
        id = preferences.getString(SharedPreference.KeyEmail,null);

        etname= findViewById(R.id.nombreEditText);
        etporcion = findViewById(R.id.porcionEditText);
        etnoPorcion = findViewById(R.id.numeroPorcionesEditText);
        etcalorias = findViewById(R.id.caloriasEditText);
        etazucar = findViewById(R.id.azucarEditText);
        etcarbs = findViewById(R.id.carbsEditText);
        etproteina = findViewById(R.id.proteinaEditText);
        etlipidos = findViewById(R.id.lipidosEditText);
        etsodio = findViewById(R.id.sodioEditText);
        btn1 = findViewById(R.id.acceptButton);
        btn2 = findViewById(R.id.backButton);

        Bundle extras = getIntent().getExtras();

        //Revisamos si nos llegó un extra de otra actividad.
        if (extras != null) {
            foodItem = (FoodItem) extras.getSerializable("foodItem");
            System.out.println(foodItem.getProduct_name());
            setData(foodItem);
        }

        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                BtnAccept();
            }
        });

        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });

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
        etname.setText(foodItem.getProduct_name());
        if(foodItem.getPortion_size() != 0)
            etporcion.setText(String.valueOf(foodItem.getPortion_size()));
        if(foodItem.getPortions() != 0)
            etnoPorcion.setText(String.valueOf(foodItem.getPortions()));
        if(foodItem.getCalories() != 0)
            etcalorias.setText(String.valueOf(foodItem.getCalories()));
        if(foodItem.getSugar() != 0)
            etazucar.setText(String.valueOf(foodItem.getSugar()));
        if(foodItem.getCarbs() != 0)
            etcarbs.setText(String.valueOf(foodItem.getCarbs()));
        if(foodItem.getProtein() != 0)
            etproteina.setText(String.valueOf(foodItem.getProtein()));
        if(foodItem.getFat() != 0)
            etlipidos.setText(String.valueOf(foodItem.getFat()));
        if(foodItem.getSodium() != 0)
            etsodio.setText(String.valueOf(foodItem.getSodium()));
    }

    private void BtnAccept(){
        String product_name = etname.getText().toString();
        String portion_size = etporcion.getText().toString();
        boolean next = true;
        if (product_name.trim().equals("")){
            etname.setTextColor(Color.rgb(255, 0, 55));
            Toast.makeText(this, "Ingrese un nombre de producto", Toast.LENGTH_SHORT).show();
            next = false;
        }
        if(portion_size.equals("")){
            portion_size = "0";
        }
        if (Float.parseFloat(portion_size) == 0){
            etporcion.setTextColor(Color.rgb(255, 0, 55));
            Toast.makeText(this, "Ingrese un tamaño de porción", Toast.LENGTH_SHORT).show();
            next = false;
        }

        if(next) {
            Intent intent = new Intent(DataEntryActivity.this, NutrientsActivity.class);
            //DBHelper mydb = new DBHelper(this);
            Log.d("a", product_name);
            foodItem.setProduct_name(product_name);
            if (portion_size.length() > 0)
                foodItem.setPortion_size(Float.parseFloat(portion_size));
            if (etnoPorcion.getText().toString().length() > 0)
                foodItem.setPortions(Float.parseFloat(etnoPorcion.getText().toString()));
            if (etcalorias.getText().toString().length() > 0)
                foodItem.setCalories(Float.parseFloat(etcalorias.getText().toString()));
            if (etazucar.getText().toString().length() > 0)
                foodItem.setSugar(Float.parseFloat(etazucar.getText().toString()));
            if (etcarbs.getText().toString().length() > 0)
                foodItem.setCarbs(Float.parseFloat(etcarbs.getText().toString()));
            if (etproteina.getText().toString().length() > 0)
                foodItem.setProtein(Float.parseFloat(etproteina.getText().toString()));
            if (etlipidos.getText().toString().length() > 0)
                foodItem.setFat(Float.parseFloat(etlipidos.getText().toString()));
            if (etsodio.toString().length() > 0)
                foodItem.setSodium(Float.parseFloat(etsodio.getText().toString()));
            intent.putExtra("foodItem", (Serializable) foodItem);
            intent.setFlags(Intent.FLAG_ACTIVITY_REORDER_TO_FRONT);
            //Insertamos el alimento en la base de datos
                        /*if(foodItem.getId() == -1)
                            mydb.insertFood(foodItem);
                        else
                            mydb.updateContact (foodItem);*/

            insertFood(foodItem);
            startActivity(intent);
            finish();
        }
    }

    private void insertFood(final FoodItem food){
        StringRequest request = new StringRequest(Request.Method.POST, URL, new Response.Listener<String>() {
            @Override
            public void onResponse(String response) {

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
