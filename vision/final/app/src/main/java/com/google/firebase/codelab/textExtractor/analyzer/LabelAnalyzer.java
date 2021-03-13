package com.google.firebase.codelab.textExtractor.analyzer;

import android.util.Log;

import com.google.firebase.codelab.textExtractor.listeners.LabelDataListener;

import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.tree.ParseTree;
import org.antlr.v4.runtime.tree.ParseTreeWalker;
import labelParser.labelGrammarLexer;
import labelParser.labelGrammarParser;

public class LabelAnalyzer {

    public final static int TAM_PORCION = 0;
    public final static int PORCIONES = 1;
    public final static int CALORIAS = 2;
    public final static int GRASAS = 3;
    public final static int CARBOHIDRATOS = 4;
    public final static int AZUCARES = 5;
    public final static int SODIO = 6;
    public final static int PROTEINAS = 7;
    private final static int SIZE = 8;


    public static int[] analyze(String textFiltered){
        int [] cantidadNutrientes = new int[SIZE];

        CharStream input = CharStreams.fromString(textFiltered); //crear charstream
        labelGrammarLexer lexer = new labelGrammarLexer(input); //crear analizador lexico
        CommonTokenStream tokens = new CommonTokenStream(lexer); //crear los tokens
        labelGrammarParser parser = new labelGrammarParser(tokens); //crear analizador sintactico

        ParseTree tree = parser.init(); //crear arbol para obtener nutrientes
        LabelDataListener listener = new LabelDataListener(); //crear un listener para recorrer

        ParseTreeWalker walker = new ParseTreeWalker(); //crear un caminante
        walker.walk(listener, tree); //recorrer el arbol para obtener los nutrientes

        //obtener los nutrientes
        cantidadNutrientes[TAM_PORCION] = listener.getTamanoPorcion();
        cantidadNutrientes[CALORIAS] = listener.getCalorias();
        cantidadNutrientes[PORCIONES] = listener.getPorciones();
        cantidadNutrientes[GRASAS] = listener.getGrasas();
        cantidadNutrientes[CARBOHIDRATOS] = listener.getCarbohidratos();
        cantidadNutrientes[PROTEINAS] = listener.getProteinas();
        cantidadNutrientes[AZUCARES] = listener.getAzucares();
        cantidadNutrientes[SODIO] = listener.getSodio();
        cantidadNutrientes[PROTEINAS] = listener.getProteinas();

        Log.d("NUTRIENTES", "TAM = " + cantidadNutrientes[TAM_PORCION]);
        Log.d("NUTRIENTES", "PORCIONES = " + cantidadNutrientes[PORCIONES]);
        Log.d("NUTRIENTES", "CALORIAS = " + cantidadNutrientes[CALORIAS]);
        Log.d("NUTRIENTES", "GRASAS = " + cantidadNutrientes[GRASAS]);
        Log.d("NUTRIENTES", "CARBOHIDRATOS = " + cantidadNutrientes[CARBOHIDRATOS]);
        Log.d("NUTRIENTES", "PROTEINAS = " + cantidadNutrientes[PROTEINAS]);
        Log.d("NUTRIENTES", "AZUCARES = " + cantidadNutrientes[AZUCARES]);
        Log.d("NUTRIENTES", "SODIO = " + cantidadNutrientes[SODIO]);

        return cantidadNutrientes;
    }
}
