package com.google.firebase.codelab.textExtractor.BarcodeAnalyzer;

import android.util.Log;
import android.widget.ArrayAdapter;

import com.android.volley.Request;
import com.android.volley.RequestQueue;
import com.android.volley.Response;
import com.android.volley.VolleyError;
import com.android.volley.toolbox.JsonObjectRequest;
import com.android.volley.toolbox.StringRequest;
import com.android.volley.toolbox.Volley;
import com.google.firebase.codelab.labelScannerUABC.MainMenuActivity;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import java.util.ArrayList;

import javax.json.JsonArray;

public class JsonParser {

    private RequestQueue mQueue;

    public void execute(MainMenuActivity mainMenuActivity){

        String url = "https://world.openfoodfacts.org/api/v0/product/737628064502.json";
        mQueue = Volley.newRequestQueue(mainMenuActivity);

        JsonObjectRequest request = new JsonObjectRequest(Request.Method.GET,
                url, null, new Response.Listener<JSONObject>() {
            @Override
            public void onResponse(JSONObject response) {
                try {
                    JsonArray jsonArray = (JsonArray) response.getJSONArray("code");
                    Log.d("JSON", jsonArray.toString());
                } catch (JSONException e) {
                    e.printStackTrace();
                }
            }
        }, new Response.ErrorListener() {
            @Override
            public void onErrorResponse(VolleyError error) {

            }
        });

        mQueue.add(request);

    }
    void parseJsonData(String jsonString) {
        try {
            JSONObject object = new JSONObject(jsonString);

            Log.d("JSON", object.toString());
        } catch (JSONException e) {
            e.printStackTrace();
        }


    }

}
