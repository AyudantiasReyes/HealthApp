package com.google.firebase.codelab.textExtractor.BarcodeAnalyzer;

import android.util.Log;
import android.util.Size;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.URL;
import java.net.URLConnection;
import java.util.Objects;

import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;


public class JsonParser extends Thread{
    //https://world.openfoodfacts.org/api/v0/product/[barcode].json

    private String url;
    private volatile boolean isFinished;


    public int TAMANO_PORCION = 0;
    public int PORCION = 1;
    public int CALORIAS = 2;
    public int GRASAS_TOTALES = 3;
    public int GRASAS_SATURADAS = 4;
    public int GRASAS_TRANS = 5;
    public int CARBOHIDRATOS = 6;
    public int AZUCARES = 7;
    public int COLESTEROL = 8;
    public int SODIO = 9;
    public int PROTEINAS = 10;
    public int SIZE = 11;

    private float[] label_data;

    private final String[] fields = new String[]{
            "serving_size",
            "serving_quantity",
            "energy-kcal_serving",
            "fat_serving",
            "saturated-fat_serving",
            "trans-fat_serving",
            "carbohydrates_serving",
            "sugars_serving",
            "cholesterol_serving",
            "sodium_serving",
            "proteins_serving"
    };

    public JsonParser(){
        isFinished = false;
        label_data = new float[SIZE];
        setBarUrl("7501030419037");

    }

    public void setBarUrl(String barcode) {
        this.url = "https://world.openfoodfacts.org/api/v0/product/" + barcode + ".json";
    }

    public boolean isFinished() {
        return isFinished;
    }

    public float[] getLabel_data() {
        isFinished = false;
        return label_data;
    }

    @Override
    public void run() {
        super.run();
        executeRequest(url);
        isFinished = true;
    }

    private void executeRequest(String url){
        JSONParser parser = new JSONParser();
        Log.d("ESTADO", "BEGIN");
        try {
            URL oracle = new URL(url); // URL to Parse
            URLConnection yc = oracle.openConnection();
            BufferedReader in = new BufferedReader(new InputStreamReader(yc.getInputStream()));

            String inputLine;

            if((inputLine = in.readLine()) != null) {
                JSONObject jsonObject = (JSONObject) parser.parse(inputLine); //obtener el objeto
                JSONObject product;
                JSONObject nutriments;

                if(jsonObject.get("product") != null){
                    //el producto existe
                    product = (JSONObject) jsonObject.get("product");

                    if(product.get("nutriments") != null){
                        nutriments = (JSONObject) product.get("nutriments");
                       //Los nutrientes existen
                        for(int i = 0; i < SIZE; i++){
                            if(fields[i].equals("serving_size") || fields[i].equals("serving_quantity")){
                                Log.d("NUTRIENT", fields[i] + " " + getNutrient(fields[i], product));

                                label_data[i] = getNutrient(fields[i], product);
                            }
                            else{
                                assert nutriments != null;
                                Log.d("NUTRIENT", fields[i] + " " + getNutrient(fields[i], nutriments));
                                label_data[i] = getNutrient(fields[i], nutriments);
                            }
                        }


                    }
                    else{
                        //los nutrientes no existen
                    }

                }
                else{
                    //no existe el producto
                }


            }
            in.close();

            isFinished = true;

        } catch (Exception e) {
            Log.d("STR_RESPONSE", e.toString());
        }
    }

    private float getNutrient(String nutrient, JSONObject json){

        if(json.get(nutrient) != null)
            return Float.parseFloat(json.get(nutrient).toString().replace("g", ""));
        else
            return 0; //No se encontro el valor
    }
}
