package com.google.firebase.codelab.labelScannerUABC;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.DefaultItemAnimator;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Spinner;
import com.google.firebase.codelab.labelScannerUABC.databinding.ActivityProductListBinding;
import java.util.ArrayList;

public class ProductListActivity extends AppCompatActivity{

    public static final int ALPHABETICAL = 1;
    public static final int ALPHABETICAL_INVERTED = 2;
    public static final int DATE_MODIFIED_RECENT = 3;
    public static final int DATE_MODIFIED_OLDER = 4;

    public static final String A_TO_Z = "A→Z";
    public static final String Z_TO_A = "Z→A";
    public static final String RECENT = "Recientes";
    public static final String OLDER = "Antiguos";

    DBHelper mydb;
    FoodAdapter foodAdapter;
    Spinner porcionSpinner;
    ActivityProductListBinding binding;
    ArrayAdapter<String> spinnerAdapter;
    RecyclerView recyclerView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityProductListBinding.inflate(getLayoutInflater());
        setContentView(binding.root);
        mydb = new DBHelper(this);
        porcionSpinner = binding.porcionSpinner;
        recyclerView = binding.myRecyclerView;

        //test insertions
        //FoodItem foodItem = new FoodItem("AntiChoco", 100, 3, 400, 3, 120, 20, 12, 20, 6);
        //FoodItem foodItem2 = new FoodItem("BetaChoco", 100, 3, 400, 3, 120, 20, 12, 20, 6);
        //FoodItem foodItem3 = new FoodItem("ChocoChoco", 100, 3, 400, 3, 120, 20, 12, 20, 6);
        //foodItems = new ArrayList<FoodItem>();
        //mydb.insertFood(foodItem);
        //mydb.insertFood(foodItem2);
        //mydb.insertFood(foodItem3);

        updateRecyclerView(DATE_MODIFIED_RECENT);
        SpinnerValues();
    }

    @Override
    public void onResume()
    {  // After a pause OR at startup
        super.onResume();
        //Refresh your stuff here
        updateRecyclerView(DATE_MODIFIED_RECENT);
    }

    public void updateRecyclerView(int orderBy){
        mydb = new DBHelper(this);
        /*
        if(mydb.insertFood(foodItem))
            System.out.println("INSERTADOOOOOOOOO");
        */
        ArrayList array_list = mydb.getAllFoods(orderBy);
        //System.out.println(array_list);

        foodAdapter = new FoodAdapter(array_list);

        RecyclerView recyclerView = binding.myRecyclerView;
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        recyclerView.setItemAnimator(new DefaultItemAnimator());
        recyclerView.setAdapter(foodAdapter);
    }

    private void SpinnerValues() {
        ArrayList<String> orderList = new ArrayList<String>();

        orderList.add(A_TO_Z);
        orderList.add(Z_TO_A);
        orderList.add(RECENT);
        orderList.add(OLDER);

        spinnerAdapter = new ArrayAdapter<>(this, R.layout.spinner_item, orderList);
        spinnerAdapter.setDropDownViewResource(R.layout.spinner_item);
        porcionSpinner.setAdapter(spinnerAdapter);

        porcionSpinner.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                String selected = parent.getItemAtPosition(position).toString();
                switch(selected){
                    case A_TO_Z:
                        updateRecyclerView(ALPHABETICAL);
                        break;
                    case Z_TO_A:
                        updateRecyclerView(ALPHABETICAL_INVERTED);
                        break;
                    case RECENT:
                        updateRecyclerView(DATE_MODIFIED_RECENT);
                        break;
                    case OLDER:
                        updateRecyclerView(DATE_MODIFIED_OLDER);
                        break;
                }
                System.out.println(selected);
            }
            public void onNothingSelected(AdapterView<?> parent) {
            }
        });
    }
}
