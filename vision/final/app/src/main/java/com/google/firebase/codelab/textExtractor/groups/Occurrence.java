package com.google.firebase.codelab.textExtractor.groups;

public class Occurrence {
    private int number = -1;
    private int ocurrences = 1;

    public Occurrence(){
    }

    public int getNumber() {
        return number;
    }

    public int getOcurrences() {
        return ocurrences;
    }

    public void setNumber(int number){
        this.number = number;
    }

    public void incrementOcurrencies() {
        this.ocurrences++;
    }
}
