// Generated from C:/Users/Omar Valdivia/Documents/GitHub/HealthApp/vision/final/app/src/main/java/com/google/firebase/codelab/textExtractor\labelGrammar.g4 by ANTLR 4.9.1
package labelParser;
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link labelGrammarParser}.
 */
public interface labelGrammarListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link labelGrammarParser#init}.
	 * @param ctx the parse tree
	 */
	void enterInit(labelGrammarParser.InitContext ctx);
	/**
	 * Exit a parse tree produced by {@link labelGrammarParser#init}.
	 * @param ctx the parse tree
	 */
	void exitInit(labelGrammarParser.InitContext ctx);
	/**
	 * Enter a parse tree produced by {@link labelGrammarParser#statements}.
	 * @param ctx the parse tree
	 */
	void enterStatements(labelGrammarParser.StatementsContext ctx);
	/**
	 * Exit a parse tree produced by {@link labelGrammarParser#statements}.
	 * @param ctx the parse tree
	 */
	void exitStatements(labelGrammarParser.StatementsContext ctx);
	/**
	 * Enter a parse tree produced by {@link labelGrammarParser#grasaTotal_statement}.
	 * @param ctx the parse tree
	 */
	void enterGrasaTotal_statement(labelGrammarParser.GrasaTotal_statementContext ctx);
	/**
	 * Exit a parse tree produced by {@link labelGrammarParser#grasaTotal_statement}.
	 * @param ctx the parse tree
	 */
	void exitGrasaTotal_statement(labelGrammarParser.GrasaTotal_statementContext ctx);
}