package com.google.firebase.codelab.UI;

import android.content.SharedPreferences;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.Toast;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import com.google.firebase.codelab.labelScannerUABC.Class.SharedPreference;
import com.google.firebase.codelab.labelScannerUABC.R;

import java.util.ArrayList;
import java.util.Arrays;

public class DailyIntakeActivity extends AppCompatActivity {
    private EditText edtCal;
    private Spinner sp_carbs, sp_prot, sp_fat;
    private SharedPreferences preferences;
    private String calorias, carbs, protein, fat;
    private int suma;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_daily_intake);

        //Get the EditText from the layout
        edtCal = findViewById(R.id.edit_cal);

        //Get the Spinners from the layout
        sp_carbs = findViewById(R.id.sp_carbs);
        sp_prot = findViewById(R.id.sp_proteina);
        sp_fat = findViewById(R.id.sp_fat);

        String[] values = {"0", "5", "10", "15", "20","25", "30", "35", "40", "45","50",
                            "55","60","65","70","75","80","85","90","95","100"};
        ArrayList<String> arrayListVal = new ArrayList<>(Arrays.asList(values));
        ArrayAdapter<String> arrayAdapterVal = new ArrayAdapter<>(this, R.layout.style_spinner,arrayListVal);
        sp_carbs.setAdapter(arrayAdapterVal);
        sp_prot.setAdapter(arrayAdapterVal);
        sp_fat.setAdapter(arrayAdapterVal);

        sp_carbs.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> adapterView, View view, int i, long l) {
                carbs = sp_carbs.getItemAtPosition(i).toString();
            }

            @Override
            public void onNothingSelected(AdapterView<?> adapterView) {

            }
        });

        sp_prot.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> adapterView, View view, int i, long l) {
                protein = sp_prot.getItemAtPosition(i).toString();
            }

            @Override
            public void onNothingSelected(AdapterView<?> adapterView) {

            }
        });

        sp_fat.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> adapterView, View view, int i, long l) {
                fat = sp_fat.getItemAtPosition(i).toString();
            }

            @Override
            public void onNothingSelected(AdapterView<?> adapterView) {

            }
        });
        //Get the BUTTONS from the Layout
        Button btnSave = findViewById(R.id.button_save);

        //preferences = getSharedPreferences(SharedPreference.namePreference, MODE_PRIVATE);

        btnSave.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view) {
                calorias = edtCal.getText().toString();
                suma = 0;
                suma = Integer.parseInt(carbs) + Integer.parseInt(protein) + Integer.parseInt(fat);
                if(calorias.isEmpty()) {
                    Toast.makeText(DailyIntakeActivity.this,"Rellenar todos los campos",Toast.LENGTH_SHORT).show();
                }
                else if(suma != 100){
                    Toast.makeText(DailyIntakeActivity.this,"La suma de los porcentajes debe de ser 100%",Toast.LENGTH_SHORT).show();
                }else{

                }

            }
        });
    }


}
