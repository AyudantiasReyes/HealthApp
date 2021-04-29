package com.google.firebase.codelab.UI;

import android.app.ProgressDialog;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.util.Log;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import com.android.volley.Request;
import com.android.volley.RequestQueue;
import com.android.volley.Response;
import com.android.volley.VolleyError;
import com.android.volley.toolbox.StringRequest;
import com.android.volley.toolbox.Volley;
import com.google.firebase.codelab.labelScannerUABC.Class.SharedPreference;
import com.google.firebase.codelab.labelScannerUABC.Class.User;
import com.google.firebase.codelab.labelScannerUABC.MainMenuActivity;
import com.google.firebase.codelab.labelScannerUABC.R;

import org.json.JSONException;
import org.json.JSONObject;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class RegisterData extends AppCompatActivity {
    private EditText edtEst, edtEdad, edtPeso;
    private String estatura, edad, peso;
    private String gen;
    private static final String URL = "http://conisoft.org/HealthApp/App/RegisterUser.php";
    private SharedPreferences preferences;
    private User user;
    private ProgressDialog progressDialog;
    private Spinner sp_genero;
    private Spinner sp_actividad;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register_data);

        //Get the EditTexts from the Layout
        edtEst = findViewById(R.id.edit_edad);
        edtEdad = findViewById(R.id.edit_edad);
        edtPeso = findViewById(R.id.edit_peso);

        //Get the Spinners from the Layout
        sp_genero = findViewById(R.id.sp_genero);
        sp_actividad = findViewById(R.id.sp_actividad);

        String[] valueGen = {"Hombre", "Mujer"};
        ArrayList<String> arrayListGen = new ArrayList<>(Arrays.asList(valueGen));
        ArrayAdapter<String> arrayAdapterGen = new ArrayAdapter<>(this, R.layout.style_spinner,arrayListGen);
        sp_genero.setAdapter(arrayAdapterGen);

        String[] valueAct = {"Sedentario", "Ligero", "Moderado", "Intenso"};
        ArrayList<String> arrayList = new ArrayList<>(Arrays.asList(valueAct));
        ArrayAdapter<String> arrayAdapterAct = new ArrayAdapter<>(this, R.layout.style_spinner,arrayList);
        sp_actividad.setAdapter(arrayAdapterAct);

        //Get the BUTTONS from the Layout
        Button btnRegister = findViewById(R.id.button_registro);

        preferences = getSharedPreferences(SharedPreference.namePreference, MODE_PRIVATE);

        btnRegister.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                estatura = edtEst.getText().toString();
                edad = edtEdad.getText().toString();
                peso = edtPeso.getText().toString();
                //gen = edtGen.getText().toString();

                if(estatura.isEmpty()  || edad.isEmpty() || peso.isEmpty())
                    Toast.makeText(RegisterData.this,R.string.error1,Toast.LENGTH_SHORT).show();
                else{
                    progressDialog = new ProgressDialog(RegisterData.this);
                    progressDialog.show();
                    progressDialog.setContentView(R.layout.progress_layout);
                    progressDialog.setCancelable(false);
                    progressDialog.getWindow().setBackgroundDrawableResource(android.R.color.transparent);
                    new Handler(Looper.getMainLooper()).postDelayed(new Runnable() {
                        @Override
                        public void run() {
                            RegisterInfo(estatura, edad, peso);
                        }
                    }, 1000);
                }
            }
        });
    }

    private void RegisterInfo(final String estatura, final String edad, final String peso){
        StringRequest request = new StringRequest(Request.Method.POST, URL, new Response.Listener<String>() {

            @Override
            public void onResponse(String response) {
                if(response.equals("false")){
                    Toast.makeText(RegisterData.this,R.string.msjRegister2,Toast.LENGTH_SHORT).show();
                }
                else{
                    try {
                        Log.d("response",response);
                        JSONObject jsonObj = new JSONObject(response);
                        user = new User(jsonObj.getString("estatura"), jsonObj.getString("edad"),jsonObj.getString("peso"));
                        SaveSharedPreferences();
                        Toast.makeText(RegisterData.this,R.string.msjRegister,Toast.LENGTH_SHORT).show();
                        startActivity(new Intent(RegisterData.this, MainMenuActivity.class));
                        finish();
                    } catch (JSONException e) {
                        e.printStackTrace();
                    }
                }
                progressDialog.dismiss();
            }
        }, new Response.ErrorListener() {
            @Override
            public void onErrorResponse(VolleyError error) {
                progressDialog.dismiss();
                Toast.makeText(RegisterData.this, error.toString(), Toast.LENGTH_SHORT).show();
            }
        }){
            @Override
            protected Map<String, String> getParams() {
                Map<String,String> parametros = new HashMap<>();
                parametros.put("estatura",estatura);
                parametros.put("edad",edad);
                parametros.put("peso",peso);
                return parametros;
            }
        };
        RequestQueue requestQueue = Volley.newRequestQueue(this);
        requestQueue.add(request);
    }

    private void SaveSharedPreferences(){
        SharedPreferences.Editor edit = preferences.edit();
        edit.putString(SharedPreference.KeyEstatura, user.getEstatura());
        edit.putString(SharedPreference.KeyEdad, user.getEdad());
        edit.putString(SharedPreference.KeyPeso, user.getPeso());
        edit.apply();
    }

}
