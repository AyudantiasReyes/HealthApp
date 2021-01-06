package com.google.firebase.codelab.UI;

import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;
import com.android.volley.AuthFailureError;
import com.android.volley.Request;
import com.android.volley.RequestQueue;
import com.android.volley.Response;
import com.android.volley.VolleyError;
import com.android.volley.toolbox.StringRequest;
import com.android.volley.toolbox.Volley;
import com.google.firebase.codelab.labelScannerUABC.Class.User;
import com.google.firebase.codelab.labelScannerUABC.MainMenuActivity;
import com.google.firebase.codelab.labelScannerUABC.R;

import org.json.JSONException;
import org.json.JSONObject;

import java.util.HashMap;
import java.util.Map;

public class LoginActivity extends AppCompatActivity {
    private EditText edt_email, edt_pass;
    private Button login_button, register_button;
    private String email, pass;
    private static final String URL = "http://conisoft.org/HealthApp/validateUser.php";
    private static final String namePreference = "SettingsHealthApp";
    private static final String KeyId = "idUser";
    private static final String KeyName = "name";
    private static final String KeyLastname = "lastname";
    private static final String KeyEmail = "email";
    private static final String KeyPassword = "password";
    private SharedPreferences preferences;
    private User user;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        //Get the EditTexts from the Layout
        edt_email = findViewById(R.id.et_email);
        edt_pass = findViewById(R.id.et_password);

        //Get the BUTTONS from the Layout
        login_button = findViewById(R.id.button_login);
        register_button = findViewById(R.id.button_register);

        preferences = getSharedPreferences(namePreference, MODE_PRIVATE);
        email = preferences.getString(KeyEmail,null);
        pass = preferences.getString(KeyPassword,null);

        if(email != null && pass != null){
            startActivity(new Intent(LoginActivity.this, MainMenuActivity.class));
        }

        login_button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                email = edt_email.getText().toString();
                pass = edt_pass.getText().toString();
                //Verificar campos vacios
                if(email.isEmpty() || pass.isEmpty())
                    Toast.makeText(LoginActivity.this,R.string.error1,Toast.LENGTH_SHORT).show();
                else{
                    ValidateUser();
                }
            }
        });

        register_button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(getApplicationContext(), RegisterActivity.class));
            }
        });
    }

    private void ValidateUser(){
        StringRequest request = new StringRequest(Request.Method.POST, URL, new Response.Listener<String>() {
            @Override
            public void onResponse(String response) {
                if(!response.isEmpty()) {
                    try {
                        JSONObject jsonObj = new JSONObject(response);
                        user = new User(jsonObj.getString("id_user"), jsonObj.getString("name"),jsonObj.getString("lastname"), jsonObj.getString("email"),jsonObj.getString("pass"));
                        SharedPreferences.Editor edit = preferences.edit();
                        edit.putString(KeyId,user.getId());
                        edit.putString(KeyName,user.getName());
                        edit.putString(KeyLastname,user.getLastname());
                        edit.putString(KeyEmail,user.getEmail());
                        edit.putString(KeyPassword,user.getPassword());
                        edit.commit();
                        startActivity(new Intent(getApplicationContext(), MainMenuActivity.class));
                        finish();
                    } catch (JSONException e) {
                        e.printStackTrace();
                    }
                }
                else
                    Toast.makeText(LoginActivity.this,R.string.errorUser,Toast.LENGTH_SHORT).show();
            }
        }, new Response.ErrorListener() {
            @Override
            public void onErrorResponse(VolleyError error) {
                Toast.makeText(LoginActivity.this, error.toString(), Toast.LENGTH_SHORT).show();
            }
        }){
            @Override
            protected Map<String, String> getParams() throws AuthFailureError {             //parametros que se envian con metodo POST
                Map<String,String> parametros = new HashMap<String,String>();
                parametros.put("email",email);
                parametros.put("pass",pass);
                return parametros;
            }
        };
        RequestQueue requestQueue = Volley.newRequestQueue(this);
        requestQueue.add(request);
    }
}