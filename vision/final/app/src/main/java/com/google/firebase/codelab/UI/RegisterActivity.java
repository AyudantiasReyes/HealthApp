package com.google.firebase.codelab.UI;

import androidx.appcompat.app.AppCompatActivity;

import android.app.ProgressDialog;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Toast;
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

import java.util.HashMap;
import java.util.Map;

public class RegisterActivity extends AppCompatActivity {
    private EditText edtName, edtLastName, edtEmail, edtPass, edtEdad;
    private RadioGroup radioGroup;
    private RadioButton radioButton;
    private String name, lastname, email, pass, gen;
    private static final String URL = "http://conisoft.org/HealthApp/App/RegisterUser.php";
    private SharedPreferences preferences;
    private User user;
    private ProgressDialog progressDialog;
    private int[] dailyMacros;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register);

        //Get the EditTexts from the Layout
        edtName = findViewById(R.id.editTextTextPersonName);
        edtLastName = findViewById(R.id.editTextTextPersonName2);
        edtEmail = findViewById(R.id.editTextTextEmailAddress);
        edtPass = findViewById(R.id.editTextTextPassword);

        //Daily Intakes of calories and macros
        dailyMacros = new int[3];

        //Get the BUTTONS from the Layout
        Button btnSiguiente = findViewById(R.id.button_siguiente);


        preferences = getSharedPreferences(SharedPreference.namePreference, MODE_PRIVATE);

        btnSiguiente.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                name = edtName.getText().toString();
                lastname = edtLastName.getText().toString();
                email = edtEmail.getText().toString();
                pass = edtPass.getText().toString();
                if(name.isEmpty() || lastname.isEmpty() || email.isEmpty() || pass.isEmpty())
                    Toast.makeText(RegisterActivity.this,R.string.error1,Toast.LENGTH_SHORT).show();
                else{
                    if(pass.length() >= 8){
                        if(isValidEmail(email)) {
                            progressDialog = new ProgressDialog(RegisterActivity.this);
                            progressDialog.show();
                            progressDialog.setContentView(R.layout.progress_layout);
                            progressDialog.setCancelable(false);
                            progressDialog.getWindow().setBackgroundDrawableResource(android.R.color.transparent);
                            new Handler(Looper.getMainLooper()).postDelayed(new Runnable() {
                                @Override
                                public void run() {
                                    RegisterUser(name,lastname,email,pass);
                                }
                            }, 1000);
                        }
                        else
                            Toast.makeText(RegisterActivity.this,R.string.msjRegister1,Toast.LENGTH_SHORT).show();
                    }
                    else
                        Toast.makeText(RegisterActivity.this, R.string.msjRegister3, Toast.LENGTH_SHORT).show();
                }
            }
        });
    }

    public static boolean isValidEmail(CharSequence email) {
        if (email == null)
            return false;
        return android.util.Patterns.EMAIL_ADDRESS.matcher(email).matches();
    }

    private void RegisterUser(final String name, final String lastname, final String email, final String password){
        StringRequest request = new StringRequest(Request.Method.POST, URL, new Response.Listener<String>() {

            @Override
            public void onResponse(String response) {
                if(response.equals("false")){
                    Toast.makeText(RegisterActivity.this,R.string.msjRegister2,Toast.LENGTH_SHORT).show();
                }
                else{
                    try {
                        Log.d("response",response);
                        JSONObject jsonObj = new JSONObject(response);
                        user = new User(jsonObj.getString("id_user"), jsonObj.getString("name"),jsonObj.getString("lastname"), jsonObj.getString("email"),jsonObj.getString("pass"));
                        SaveSharedPreferences();
                        Toast.makeText(RegisterActivity.this,R.string.msjRegister,Toast.LENGTH_SHORT).show();
                        startActivity(new Intent(RegisterActivity.this, RegisterData.class));
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
                Toast.makeText(RegisterActivity.this, error.toString(), Toast.LENGTH_SHORT).show();
            }
        }){
            @Override
            protected Map<String, String> getParams() {
                Map<String,String> parametros = new HashMap<>();
                parametros.put("name",name);
                parametros.put("lastname",lastname);
                parametros.put("email",email);
                parametros.put("pass",password);
                parametros.put("gen",gen);
                return parametros;
            }
        };
        RequestQueue requestQueue = Volley.newRequestQueue(this);
        requestQueue.add(request);
    }

    private void SaveSharedPreferences(){
        SharedPreferences.Editor edit = preferences.edit();
        edit.putString(SharedPreference.KeyId,user.getId());
        edit.putString(SharedPreference.KeyName,user.getName());
        edit.putString(SharedPreference.KeyLastname,user.getLastname());
        edit.putString(SharedPreference.KeyEmail,user.getEmail());
        edit.putString(SharedPreference.KeyPassword,user.getPassword());
        edit.putString(SharedPreference.KeyGen,user.getGen());
        edit.apply();
    }

    private int calculateDailyCalories(char gender, float weight, float height, int age) {
        int calories = (int) ((10 * weight) + (6.25 * height) - (5 * age));
        if(gender == 'H') {
            return calories+5;
        } else if(gender == 'M') {
            return calories-161;
        } else
            return 0;
    }

    private void calculateDailyIntakes(int calories, int weight) {
        int FAT = 0;
        int CARBS = 1;
        int PROTEIN = 2;
        dailyMacros[PROTEIN] = weight;
        dailyMacros[FAT] = (int) ((calories*0.25) / 9) ;
        dailyMacros[CARBS] = (calories - (dailyMacros[PROTEIN]*4) - (dailyMacros[FAT]*9)) / 4;
    }
}