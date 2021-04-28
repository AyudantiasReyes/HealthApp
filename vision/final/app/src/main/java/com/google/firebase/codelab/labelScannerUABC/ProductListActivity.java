package com.google.firebase.codelab.labelScannerUABC;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.DefaultItemAnimator;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Spinner;
import android.widget.Toast;

import com.android.volley.Request;
import com.android.volley.RequestQueue;
import com.android.volley.Response;
import com.android.volley.VolleyError;
import com.android.volley.toolbox.StringRequest;
import com.android.volley.toolbox.Volley;
import com.google.firebase.codelab.labelScannerUABC.Class.FoodItem;
import com.google.firebase.codelab.labelScannerUABC.databinding.ActivityProductListBinding;
import com.google.firebase.codelab.mlkitUABC.NutrientsActivity;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ProductListActivity extends AppCompatActivity{

    public static final int ALPHABETICAL = 1;
    public static final int ALPHABETICAL_INVERTED = 2;
    public static final int DATE_MODIFIED_RECENT = 3;
    public static final int DATE_MODIFIED_OLDER = 4;
    private static final String URL = "http://conisoft.org/HealthApp/App/allProduct.php";
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
    private List<FoodItem> foodItems;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityProductListBinding.inflate(getLayoutInflater());
        setContentView(binding.root4);
        mydb = new DBHelper(this);
        recyclerView = binding.myRecyclerView;


        foodItems = new ArrayList<FoodItem>();

        allProduct();
        updateRecyclerView(DATE_MODIFIED_RECENT);
        SpinnerValues();
    }

    @Override
    public void onResume()
    {  // After a pause OR at startup
        super.onResume();
        //Refresh your stuff here
        //updateRecyclerView(DATE_MODIFIED_RECENT);
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

    private void allProduct(){
        StringRequest request = new StringRequest(Request.Method.POST, URL, new Response.Listener<String>() {
            @Override
            public void onResponse(String response) {
                if(response.equals("false"))
                    Toast.makeText(ProductListActivity.this,"No se han agregado productos",Toast.LENGTH_SHORT).show();
                else {
                    try {
                        JSONObject jsonObj = new JSONObject(response);
                        JSONArray publication = jsonObj.getJSONArray("Publication");
                        for (int i = 0; i < publication.length(); i++) {
                            JSONObject catObj = (JSONObject) publication.get(i);
                           // FoodItem food = new FoodItem(catObj.getString("title"),catObj.getString("phone"),catObj.getString("description"),catObj.getString("fecha"));
                            //foodItems.add(food);
                        }
                        /*LinearLayoutManager managerPublicacion = new LinearLayoutManager(getContext());
                        rvPublicacion.setLayoutManager(managerPublicacion);
                        AdapterPublication adapterPublicacion = new AdapterPublication(publicacionList);
                        rvPublicacion.setAdapter(adapterPublicacion);*/
                    } catch (JSONException e) {
                        e.printStackTrace();
                    }
                }
            }
        }, new Response.ErrorListener() {
            @Override
            public void onErrorResponse(VolleyError error) {
                Toast.makeText(ProductListActivity.this, error.toString(), Toast.LENGTH_SHORT).show();
            }
        }){
            @Override
            protected Map<String, String> getParams() {
                Map<String,String> parameter = new HashMap<>();
                return parameter;
            }
        };
        RequestQueue requestQueue = Volley.newRequestQueue(this);
        requestQueue.add(request);
    }
}
