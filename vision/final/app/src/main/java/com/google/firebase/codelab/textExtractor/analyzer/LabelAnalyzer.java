package com.google.firebase.codelab.textExtractor.analyzer;

import android.util.Log;

import com.google.firebase.codelab.textExtractor.listeners.LabelDataListener;

import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.tree.ParseTree;
import org.antlr.v4.runtime.tree.ParseTreeWalker;

import java.io.Serializable;
import java.util.Arrays;

import labelParser.labelGrammarLexer;
import labelParser.labelGrammarParser;

public class LabelAnalyzer implements Serializable {

    public final static int TAM_PORCION = 0;
    public final static int PORCIONES = 1;
    public final static int CALORIAS = 2;
    public final static int GRASAS = 3;
    public final static int CARBOHIDRATOS = 4;
    public final static int AZUCARES = 5;
    public final static int SODIO = 6;
    public final static int PROTEINAS = 7;
    private final static int SIZE = 8;

    private int[] amountNutrients;
    private boolean[] blockNutrients;

    public LabelAnalyzer() {
        amountNutrients = new int[SIZE];
        blockNutrients = new boolean[SIZE];

        resetFilters();
    }

    public boolean analyze(String textFiltered){

        boolean exitAnalyze = false;

        CharStream input = CharStreams.fromString(textFiltered); //crear charstream
        labelGrammarLexer lexer = new labelGrammarLexer(input); //crear analizador lexico
        CommonTokenStream tokens = new CommonTokenStream(lexer); //crear los tokens
        labelGrammarParser parser = new labelGrammarParser(tokens); //crear analizador sintactico

        ParseTree tree = parser.init(); //crear arbol para obtener nutrientes
        LabelDataListener listener = new LabelDataListener(); //crear un listener para recorrer

        ParseTreeWalker walker = new ParseTreeWalker(); //crear un caminante
        walker.walk(listener, tree); //recorrer el arbol para obtener los nutrientes


        labelChecker(TAM_PORCION, listener.getTamanoPorcion(),"Tamano de la porcion: ");
        labelChecker(PORCIONES, listener.getPorciones(), "Porciones por empaque: ");
        labelChecker(CALORIAS, listener.getCalorias(), "Calorias: ");
        labelChecker(GRASAS, listener.getGrasas(), "Grasa Total: ");
        labelChecker(CARBOHIDRATOS, listener.getCarbs(), "Carbohidratos: ");
        labelChecker(AZUCARES, listener.getAzucares(), "Azucares: ");
        labelChecker(SODIO, listener.getSodio(), "Sodio: ");
        labelChecker(PROTEINAS, listener.getProteinas(), "Proteina: ");

        for(boolean block : blockNutrients){
            exitAnalyze &= block;
        }

        return exitAnalyze;

    }

    private void labelChecker(int labelItem, int listenerData, String label){
        if(!blockNutrients[labelItem]){
            if(listenerData != -1){
                blockNutrients[labelItem] = true;
                amountNutrients[labelItem] = listenerData;
                Log.d("final_label_data", label  + amountNutrients[labelItem]);
            }
        }
    }

    public int[] getAmountNutrients() {
        return amountNutrients;
    }

    public void resetFilters(){
        for(int i = 0; i < SIZE; i++){
            blockNutrients[i] = false;
        }
    }
}
