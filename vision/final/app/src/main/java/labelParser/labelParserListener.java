// Generated from C:/Users/Omar Valdivia/Documents/GitHub/HealthApp/vision/final/app/src/main/java/com/google/firebase/codelab/parserPackage\labelParser.g4 by ANTLR 4.9.1
package labelParser;
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link labelParserParser}.
 */
public interface labelParserListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link labelParserParser#init}.
	 * @param ctx the parse tree
	 */
	void enterInit(labelParserParser.InitContext ctx);
	/**
	 * Exit a parse tree produced by {@link labelParserParser#init}.
	 * @param ctx the parse tree
	 */
	void exitInit(labelParserParser.InitContext ctx);
	/**
	 * Enter a parse tree produced by {@link labelParserParser#statements}.
	 * @param ctx the parse tree
	 */
	void enterStatements(labelParserParser.StatementsContext ctx);
	/**
	 * Exit a parse tree produced by {@link labelParserParser#statements}.
	 * @param ctx the parse tree
	 */
	void exitStatements(labelParserParser.StatementsContext ctx);
	/**
	 * Enter a parse tree produced by {@link labelParserParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterStatement(labelParserParser.StatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link labelParserParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitStatement(labelParserParser.StatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link labelParserParser#grasaTotal_statement}.
	 * @param ctx the parse tree
	 */
	void enterGrasaTotal_statement(labelParserParser.GrasaTotal_statementContext ctx);
	/**
	 * Exit a parse tree produced by {@link labelParserParser#grasaTotal_statement}.
	 * @param ctx the parse tree
	 */
	void exitGrasaTotal_statement(labelParserParser.GrasaTotal_statementContext ctx);
	/**
	 * Enter a parse tree produced by {@link labelParserParser#carbohidratos_statement}.
	 * @param ctx the parse tree
	 */
	void enterCarbohidratos_statement(labelParserParser.Carbohidratos_statementContext ctx);
	/**
	 * Exit a parse tree produced by {@link labelParserParser#carbohidratos_statement}.
	 * @param ctx the parse tree
	 */
	void exitCarbohidratos_statement(labelParserParser.Carbohidratos_statementContext ctx);
	/**
	 * Enter a parse tree produced by {@link labelParserParser#proteinas_statement}.
	 * @param ctx the parse tree
	 */
	void enterProteinas_statement(labelParserParser.Proteinas_statementContext ctx);
	/**
	 * Exit a parse tree produced by {@link labelParserParser#proteinas_statement}.
	 * @param ctx the parse tree
	 */
	void exitProteinas_statement(labelParserParser.Proteinas_statementContext ctx);
	/**
	 * Enter a parse tree produced by {@link labelParserParser#azucares_statement}.
	 * @param ctx the parse tree
	 */
	void enterAzucares_statement(labelParserParser.Azucares_statementContext ctx);
	/**
	 * Exit a parse tree produced by {@link labelParserParser#azucares_statement}.
	 * @param ctx the parse tree
	 */
	void exitAzucares_statement(labelParserParser.Azucares_statementContext ctx);
	/**
	 * Enter a parse tree produced by {@link labelParserParser#sodio_statement}.
	 * @param ctx the parse tree
	 */
	void enterSodio_statement(labelParserParser.Sodio_statementContext ctx);
	/**
	 * Exit a parse tree produced by {@link labelParserParser#sodio_statement}.
	 * @param ctx the parse tree
	 */
	void exitSodio_statement(labelParserParser.Sodio_statementContext ctx);
}