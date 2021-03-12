package com.google.firebase.codelab.textExtractor.listeners;

import android.util.Log;

import org.antlr.v4.runtime.ParserRuleContext;
import org.antlr.v4.runtime.tree.ErrorNode;
import org.antlr.v4.runtime.tree.TerminalNode;

import labelParser.labelGrammarBaseListener;
import labelParser.labelGrammarParser;

public class LabelDataListener extends labelGrammarBaseListener {

    private int grasas = 0;
    private int sodio = 0;
    private int carbohidratos = 0;
    private int proteinas = 0;
    private int azucares = 0;

    public LabelDataListener() {

    }



    @Override
    public void enterInit(labelGrammarParser.InitContext ctx) {
        super.enterInit(ctx);
    }

    @Override
    public void exitInit(labelGrammarParser.InitContext ctx) {
        super.exitInit(ctx);


    }

    @Override
    public void enterStatements(labelGrammarParser.StatementsContext ctx) {
        super.enterStatements(ctx);
    }

    @Override
    public void exitStatements(labelGrammarParser.StatementsContext ctx) {
        super.exitStatements(ctx);
    }

    @Override
    public void enterTamanoPorcion_statement(labelGrammarParser.TamanoPorcion_statementContext ctx) {
        super.enterTamanoPorcion_statement(ctx);

        Log.d("ENTER_TAMANO", "enterTamanoPorcion_statement: ");

    }

    @Override
    public void exitTamanoPorcion_statement(labelGrammarParser.TamanoPorcion_statementContext ctx) {
        super.exitTamanoPorcion_statement(ctx);
    }

    @Override
    public void enterGrasaTotal_statement(labelGrammarParser.GrasaTotal_statementContext ctx) {
        super.enterGrasaTotal_statement(ctx);

        if(ctx.G() == null){
            grasas = Integer.parseInt(ctx.NUMERO().getText()) / 10;
        }
        else{
            grasas = Integer.parseInt(ctx.NUMERO().getText());
        }
    }

    @Override
    public void enterCarbs_statement(labelGrammarParser.Carbs_statementContext ctx) {
        super.enterCarbs_statement(ctx);
        if(ctx.G() == null){
            carbohidratos = Integer.parseInt(ctx.NUMERO().getText()) / 10;
        }
        else{
            carbohidratos = Integer.parseInt(ctx.NUMERO().getText());
        }
    }

    @Override
    public void exitCarbs_statement(labelGrammarParser.Carbs_statementContext ctx) {
        super.exitCarbs_statement(ctx);
    }

    @Override
    public void enterAzucar_statement(labelGrammarParser.Azucar_statementContext ctx) {
        super.enterAzucar_statement(ctx);
        if(ctx.G() == null){
            azucares = Integer.parseInt(ctx.NUMERO().getText()) / 10;
        }
        else{
            azucares = Integer.parseInt(ctx.NUMERO().getText());
        }
    }

    @Override
    public void exitAzucar_statement(labelGrammarParser.Azucar_statementContext ctx) {
        super.exitAzucar_statement(ctx);
    }

    @Override
    public void enterSodio_statement(labelGrammarParser.Sodio_statementContext ctx) {
        super.enterSodio_statement(ctx);
    }

    @Override
    public void exitSodio_statement(labelGrammarParser.Sodio_statementContext ctx) {
        super.exitSodio_statement(ctx);
    }

    @Override
    public void enterProteina_statement(labelGrammarParser.Proteina_statementContext ctx) {
        super.enterProteina_statement(ctx);
    }

    @Override
    public void exitProteina_statement(labelGrammarParser.Proteina_statementContext ctx) {
        super.exitProteina_statement(ctx);
    }

    @Override
    public void exitGrasaTotal_statement(labelGrammarParser.GrasaTotal_statementContext ctx) {
        super.exitGrasaTotal_statement(ctx);
    }

    @Override
    public void enterEveryRule(ParserRuleContext ctx) {
        super.enterEveryRule(ctx);
    }

    @Override
    public void exitEveryRule(ParserRuleContext ctx) {
        super.exitEveryRule(ctx);
    }

    @Override
    public void visitTerminal(TerminalNode node) {
        super.visitTerminal(node);
    }

    @Override
    public void visitErrorNode(ErrorNode node) {
        super.visitErrorNode(node);
    }

    public int getGrasas() {
        return grasas;
    }

    public int getSodio() {
        return sodio;
    }

    public int getCarbohidratos() {
        return carbohidratos;
    }

    public int getProteinas() {
        return proteinas;
    }

    public int getAzucares() {
        return azucares;
    }
}
