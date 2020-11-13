package com.google.firebase.codelab.UI;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import com.google.firebase.codelab.labelScannerUABC.MainMenuActivity;
import com.google.firebase.codelab.labelScannerUABC.R;

public class LoginActivity extends AppCompatActivity {
    Button login_button;
    Button register_button;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        //Get the BUTTONS from the Layout
        login_button = findViewById(R.id.button_login);
        register_button = findViewById(R.id.button_register);

        login_button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                /*
                * Aqui va el codigo necesario para validar que los
                * datos ingresados en el Login sean correctos
                */
                Toast.makeText(LoginActivity.this, "Sesión Iniciada",Toast.LENGTH_SHORT).show();
                startActivity(new Intent(getApplicationContext(), MainMenuActivity.class));
            }
        });

        register_button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(getApplicationContext(), RegisterActivity.class));
            }
        });
    }
}