package com.google.firebase.codelab.UI;

import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
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
import com.google.firebase.codelab.labelScannerUABC.MainMenuActivity;
import com.google.firebase.codelab.labelScannerUABC.R;
import java.util.HashMap;
import java.util.Map;

public class LoginActivity extends AppCompatActivity {
    EditText edt_email, edt_pass;
    Button login_button, register_button;
    String email, pass;

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

        login_button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                email = edt_email.getText().toString();
                pass = edt_pass.getText().toString();
                //Verificar campos vacios
                if(email.isEmpty() || pass.isEmpty())
                    Toast.makeText(LoginActivity.this,"Llenar todos los campos",Toast.LENGTH_SHORT).show();
                else
                    ValidateUser();
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
        String URL = "http://conisoft.org/HealthApp/validateUser.php";
        StringRequest request = new StringRequest(Request.Method.POST, URL, new Response.Listener<String>() {
            @Override
            public void onResponse(String response) {
                if(!response.isEmpty())                                                         //response contiene json de la consulta en bd
                    startActivity(new Intent(getApplicationContext(), MainMenuActivity.class));
                else
                    Toast.makeText(LoginActivity.this,"Correo o contraseña invalido",Toast.LENGTH_SHORT).show();
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
                parametros.put("email",edt_email.getText().toString());
                parametros.put("pass",edt_pass.getText().toString());
                return parametros;
            }
        };
        RequestQueue requestQueue = Volley.newRequestQueue(this);
        requestQueue.add(request);
    }
}