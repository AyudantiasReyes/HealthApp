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
import com.google.firebase.codelab.labelScannerUABC.R;
import java.util.HashMap;
import java.util.Map;

public class RegisterActivity extends AppCompatActivity {
    private EditText edtName, edtLastName, edtEmail, edtPass;
    private Button btnRegister;
    private String id, name, lastname, email, pass;
    private static final String URL = "http://conisoft.org/HealthApp/registerUser.php";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register);

        //Get the EditTexts from the Layout
        edtName = findViewById(R.id.editTextTextPersonName);
        edtLastName = findViewById(R.id.editTextTextPersonName2);
        edtEmail = findViewById(R.id.editTextTextEmailAddress);
        edtPass = findViewById(R.id.editTextTextPassword);

        //Get the BUTTONS from the Layout
        btnRegister = findViewById(R.id.button);

        btnRegister.setOnClickListener(new View.OnClickListener() {
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
                        if(isValidEmail(email))
                            RegisterUser(name,lastname,email,pass);
                        else
                            Toast.makeText(RegisterActivity.this,R.string.msjRegister1,Toast.LENGTH_SHORT).show();
                    }
                    else
                        Toast.makeText(RegisterActivity.this, R.string.msjRegister3, Toast.LENGTH_SHORT).show();

                }
            }
        });
    }

    public final static boolean isValidEmail(CharSequence email) {
        if (email == null)
            return false;
        return android.util.Patterns.EMAIL_ADDRESS.matcher(email).matches();
    }

    private void RegisterUser(final String name, final String lastname, final String email, final String password){
        StringRequest request = new StringRequest(Request.Method.POST, URL, new Response.Listener<String>() {
            @Override
            public void onResponse(String response) {
                if(response.equals("true")){
                    Toast.makeText(RegisterActivity.this,R.string.msjRegister,Toast.LENGTH_SHORT).show();
                    startActivity(new Intent(getApplicationContext(), LoginActivity.class));
                }
                else
                    Toast.makeText(RegisterActivity.this,R.string.msjRegister2,Toast.LENGTH_SHORT).show();
            }
        }, new Response.ErrorListener() {
            @Override
            public void onErrorResponse(VolleyError error) {
                Toast.makeText(RegisterActivity.this, error.toString(), Toast.LENGTH_SHORT).show();
            }
        }){
            @Override
            protected Map<String, String> getParams() throws AuthFailureError {
                Map<String,String> parametros = new HashMap<String,String>();
                parametros.put("name",name);
                parametros.put("lastname",lastname);
                parametros.put("email",email);
                parametros.put("pass",password);
                return parametros;
            }
        };
        RequestQueue requestQueue = Volley.newRequestQueue(this);
        requestQueue.add(request);
    }
}