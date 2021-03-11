package com.google.firebase.codelab.textExtractor;

import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.tree.ParseTree;
import org.antlr.v4.runtime.tree.ParseTreeWalker;

import labelParser.labelGrammarLexer;
import labelParser.labelGrammarParser;

public class LabelAnalyzer {

    private String text;

    public LabelAnalyzer(String text) {
        this.text = text;
    }

    public void analyze(){
        CharStream input = CharStreams.fromString(text); //crear charstream
        labelGrammarLexer lexer = new labelGrammarLexer(input); //crear analizador lexico
        CommonTokenStream tokens = new CommonTokenStream(lexer); //crear los tokens
        labelGrammarParser parser = new labelGrammarParser(tokens); //crear analizador sintactico

        ParseTree tree = parser.init();
        LabelDataListener listener = new LabelDataListener();

        ParseTreeWalker walker = new ParseTreeWalker();
        walker.walk(listener, tree);
    }
}
