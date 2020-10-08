package com.google.firebase.codelab.labelScannerUABC;

import java.io.Serializable;
import java.util.Calendar;
import java.util.Date;

public class FoodItem implements Serializable {
    private String product_name;
    private int id;
    private float portion_size;
    private float portions;
    private float calories;
    private float sodium;
    private float carbs;
    private float fat;
    private float sugar;
    private float transfat;
    private float protein;
    private long dateAdded;
    private long dateModified;

    public FoodItem(String product_name, float portion_size, float portions, float calories, float sodium, float carbs, float fat, float sugar, float transfat, float protein){
        this.id = -1;  //valor temporal, no se almacena en la base de datos
        this.product_name = product_name;
        this.portion_size = portion_size;
        this.portions = portions;
        this.calories = calories;
        this.sodium = sodium;
        this.carbs = carbs;
        this.fat = fat;
        this.sugar = sugar;
        this.transfat = transfat;
        this.protein = protein;
        this.dateAdded = System.currentTimeMillis();
        this.dateModified = System.currentTimeMillis();
    }

    public FoodItem(){
        this.id = -1; //valor temporal, no se almacena en la base de datos
        this.product_name = "";
        this.portion_size = 0;
        this.portions = 1;
        this.calories = 0;
        this.sodium = 0;
        this.carbs = 0;
        this.fat = 0;
        this.sugar = 0;
        this.transfat = 0;
        this.protein = 0;
        this.dateAdded = System.currentTimeMillis();
        this.dateModified = System.currentTimeMillis();
    }

    @Override
    public String toString(){
        return product_name;
    }

    //getters & setters
    public String getProduct_name() {
        return product_name;
    }

    public void setProduct_name(String product_name) {
        this.product_name = product_name;
    }

    public float getPortion_size() {
        return portion_size;
    }

    public void setPortion_size(float portion_size) {
        this.portion_size = portion_size;
    }

    public float getPortions() {
        return portions;
    }

    public void setPortions(float portions) {
        this.portions = portions;
    }

    public float getCalories() {
        return calories;
    }

    public void setCalories(float calories) {
        this.calories = calories;
    }

    public float getSodium() {
        return sodium;
    }

    public void setSodium(float sodium) {
        this.sodium = sodium;
    }

    public float getCarbs() {
        return carbs;
    }

    public void setCarbs(float carbs) {
        this.carbs = carbs;
    }

    public float getFat() {
        return fat;
    }

    public void setFat(float fat) {
        this.fat = fat;
    }

    public float getSugar() {
        return sugar;
    }

    public void setSugar(float sugar) {
        this.sugar = sugar;
    }

    public float getTransfat() {
        return transfat;
    }

    public void setTransfat(float transfat) {
        this.transfat = transfat;
    }

    public float getProtein() {
        return protein;
    }

    public void setProtein(float protein) {
        this.protein = protein;
    }

    public long getDateAdded() {
        return dateAdded;
    }

    public void setDateAdded(long dateAdded) {
        this.dateAdded = dateAdded;
    }

    public long getDateModified() {
        return dateModified;
    }

    public void setDateModified(long dateModified) {
        this.dateModified = dateModified;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }


}

