// Generated from C:/Users/Omar Valdivia/Documents/GitHub/HealthApp/vision/final/app/src/main/java/com/google/firebase/codelab/parserPackage\labelParser.g4 by ANTLR 4.9.1
package labelParser;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class labelParserParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.9.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		NUMERO=1, CALORIAS=2, GRASA=3, TOTAL=4, PROTEINAS=5, CARBOHIDRATOS=6, 
		AZUCARES=7, G=8, SODIO=9, SEMICOLON=10;
	public static final int
		RULE_init = 0, RULE_statements = 1, RULE_statement = 2, RULE_grasaTotal_statement = 3, 
		RULE_carbohidratos_statement = 4, RULE_proteinas_statement = 5, RULE_azucares_statement = 6, 
		RULE_sodio_statement = 7;
	private static String[] makeRuleNames() {
		return new String[] {
			"init", "statements", "statement", "grasaTotal_statement", "carbohidratos_statement", 
			"proteinas_statement", "azucares_statement", "sodio_statement"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, null, null, null, null, null, null, null, null, null, "';'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "NUMERO", "CALORIAS", "GRASA", "TOTAL", "PROTEINAS", "CARBOHIDRATOS", 
			"AZUCARES", "G", "SODIO", "SEMICOLON"
		};
	}
	private static final String[] _SYMBOLIC_NAMES = makeSymbolicNames();
	public static final Vocabulary VOCABULARY = new VocabularyImpl(_LITERAL_NAMES, _SYMBOLIC_NAMES);

	/**
	 * @deprecated Use {@link #VOCABULARY} instead.
	 */
	@Deprecated
	public static final String[] tokenNames;
	static {
		tokenNames = new String[_SYMBOLIC_NAMES.length];
		for (int i = 0; i < tokenNames.length; i++) {
			tokenNames[i] = VOCABULARY.getLiteralName(i);
			if (tokenNames[i] == null) {
				tokenNames[i] = VOCABULARY.getSymbolicName(i);
			}

			if (tokenNames[i] == null) {
				tokenNames[i] = "<INVALID>";
			}
		}
	}

	@Override
	@Deprecated
	public String[] getTokenNames() {
		return tokenNames;
	}

	@Override

	public Vocabulary getVocabulary() {
		return VOCABULARY;
	}

	@Override
	public String getGrammarFileName() { return "labelParser.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public labelParserParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	public static class InitContext extends ParserRuleContext {
		public StatementsContext statements() {
			return getRuleContext(StatementsContext.class,0);
		}
		public InitContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_init; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof labelParserListener ) ((labelParserListener)listener).enterInit(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof labelParserListener ) ((labelParserListener)listener).exitInit(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof labelParserVisitor ) return ((labelParserVisitor<? extends T>)visitor).visitInit(this);
			else return visitor.visitChildren(this);
		}
	}

	public final InitContext init() throws RecognitionException {
		InitContext _localctx = new InitContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_init);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(16);
			statements();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class StatementsContext extends ParserRuleContext {
		public List<StatementContext> statement() {
			return getRuleContexts(StatementContext.class);
		}
		public StatementContext statement(int i) {
			return getRuleContext(StatementContext.class,i);
		}
		public StatementsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_statements; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof labelParserListener ) ((labelParserListener)listener).enterStatements(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof labelParserListener ) ((labelParserListener)listener).exitStatements(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof labelParserVisitor ) return ((labelParserVisitor<? extends T>)visitor).visitStatements(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StatementsContext statements() throws RecognitionException {
		StatementsContext _localctx = new StatementsContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_statements);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(21);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << GRASA) | (1L << PROTEINAS) | (1L << CARBOHIDRATOS) | (1L << AZUCARES) | (1L << SODIO))) != 0)) {
				{
				{
				setState(18);
				statement();
				}
				}
				setState(23);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class StatementContext extends ParserRuleContext {
		public GrasaTotal_statementContext grasaTotal_statement() {
			return getRuleContext(GrasaTotal_statementContext.class,0);
		}
		public Carbohidratos_statementContext carbohidratos_statement() {
			return getRuleContext(Carbohidratos_statementContext.class,0);
		}
		public Proteinas_statementContext proteinas_statement() {
			return getRuleContext(Proteinas_statementContext.class,0);
		}
		public Azucares_statementContext azucares_statement() {
			return getRuleContext(Azucares_statementContext.class,0);
		}
		public Sodio_statementContext sodio_statement() {
			return getRuleContext(Sodio_statementContext.class,0);
		}
		public StatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_statement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof labelParserListener ) ((labelParserListener)listener).enterStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof labelParserListener ) ((labelParserListener)listener).exitStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof labelParserVisitor ) return ((labelParserVisitor<? extends T>)visitor).visitStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StatementContext statement() throws RecognitionException {
		StatementContext _localctx = new StatementContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_statement);
		try {
			setState(29);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case GRASA:
				enterOuterAlt(_localctx, 1);
				{
				setState(24);
				grasaTotal_statement();
				}
				break;
			case CARBOHIDRATOS:
				enterOuterAlt(_localctx, 2);
				{
				setState(25);
				carbohidratos_statement();
				}
				break;
			case PROTEINAS:
				enterOuterAlt(_localctx, 3);
				{
				setState(26);
				proteinas_statement();
				}
				break;
			case AZUCARES:
				enterOuterAlt(_localctx, 4);
				{
				setState(27);
				azucares_statement();
				}
				break;
			case SODIO:
				enterOuterAlt(_localctx, 5);
				{
				setState(28);
				sodio_statement();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class GrasaTotal_statementContext extends ParserRuleContext {
		public TerminalNode GRASA() { return getToken(labelParserParser.GRASA, 0); }
		public TerminalNode TOTAL() { return getToken(labelParserParser.TOTAL, 0); }
		public TerminalNode NUMERO() { return getToken(labelParserParser.NUMERO, 0); }
		public TerminalNode G() { return getToken(labelParserParser.G, 0); }
		public GrasaTotal_statementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_grasaTotal_statement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof labelParserListener ) ((labelParserListener)listener).enterGrasaTotal_statement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof labelParserListener ) ((labelParserListener)listener).exitGrasaTotal_statement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof labelParserVisitor ) return ((labelParserVisitor<? extends T>)visitor).visitGrasaTotal_statement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final GrasaTotal_statementContext grasaTotal_statement() throws RecognitionException {
		GrasaTotal_statementContext _localctx = new GrasaTotal_statementContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_grasaTotal_statement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(31);
			match(GRASA);
			setState(32);
			match(TOTAL);
			setState(33);
			match(NUMERO);
			setState(34);
			match(G);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Carbohidratos_statementContext extends ParserRuleContext {
		public TerminalNode CARBOHIDRATOS() { return getToken(labelParserParser.CARBOHIDRATOS, 0); }
		public TerminalNode NUMERO() { return getToken(labelParserParser.NUMERO, 0); }
		public TerminalNode G() { return getToken(labelParserParser.G, 0); }
		public Carbohidratos_statementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_carbohidratos_statement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof labelParserListener ) ((labelParserListener)listener).enterCarbohidratos_statement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof labelParserListener ) ((labelParserListener)listener).exitCarbohidratos_statement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof labelParserVisitor ) return ((labelParserVisitor<? extends T>)visitor).visitCarbohidratos_statement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Carbohidratos_statementContext carbohidratos_statement() throws RecognitionException {
		Carbohidratos_statementContext _localctx = new Carbohidratos_statementContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_carbohidratos_statement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(36);
			match(CARBOHIDRATOS);
			setState(37);
			match(NUMERO);
			setState(38);
			match(G);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Proteinas_statementContext extends ParserRuleContext {
		public TerminalNode PROTEINAS() { return getToken(labelParserParser.PROTEINAS, 0); }
		public TerminalNode NUMERO() { return getToken(labelParserParser.NUMERO, 0); }
		public TerminalNode G() { return getToken(labelParserParser.G, 0); }
		public Proteinas_statementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_proteinas_statement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof labelParserListener ) ((labelParserListener)listener).enterProteinas_statement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof labelParserListener ) ((labelParserListener)listener).exitProteinas_statement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof labelParserVisitor ) return ((labelParserVisitor<? extends T>)visitor).visitProteinas_statement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Proteinas_statementContext proteinas_statement() throws RecognitionException {
		Proteinas_statementContext _localctx = new Proteinas_statementContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_proteinas_statement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(40);
			match(PROTEINAS);
			setState(41);
			match(NUMERO);
			setState(42);
			match(G);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Azucares_statementContext extends ParserRuleContext {
		public TerminalNode AZUCARES() { return getToken(labelParserParser.AZUCARES, 0); }
		public TerminalNode NUMERO() { return getToken(labelParserParser.NUMERO, 0); }
		public TerminalNode G() { return getToken(labelParserParser.G, 0); }
		public Azucares_statementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_azucares_statement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof labelParserListener ) ((labelParserListener)listener).enterAzucares_statement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof labelParserListener ) ((labelParserListener)listener).exitAzucares_statement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof labelParserVisitor ) return ((labelParserVisitor<? extends T>)visitor).visitAzucares_statement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Azucares_statementContext azucares_statement() throws RecognitionException {
		Azucares_statementContext _localctx = new Azucares_statementContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_azucares_statement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(44);
			match(AZUCARES);
			setState(45);
			match(NUMERO);
			setState(46);
			match(G);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Sodio_statementContext extends ParserRuleContext {
		public TerminalNode SODIO() { return getToken(labelParserParser.SODIO, 0); }
		public TerminalNode NUMERO() { return getToken(labelParserParser.NUMERO, 0); }
		public TerminalNode G() { return getToken(labelParserParser.G, 0); }
		public Sodio_statementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_sodio_statement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof labelParserListener ) ((labelParserListener)listener).enterSodio_statement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof labelParserListener ) ((labelParserListener)listener).exitSodio_statement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof labelParserVisitor ) return ((labelParserVisitor<? extends T>)visitor).visitSodio_statement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Sodio_statementContext sodio_statement() throws RecognitionException {
		Sodio_statementContext _localctx = new Sodio_statementContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_sodio_statement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(48);
			match(SODIO);
			setState(49);
			match(NUMERO);
			setState(50);
			match(G);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3\f\67\4\2\t\2\4\3"+
		"\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\3\2\3\2\3\3\7\3\26"+
		"\n\3\f\3\16\3\31\13\3\3\4\3\4\3\4\3\4\3\4\5\4 \n\4\3\5\3\5\3\5\3\5\3\5"+
		"\3\6\3\6\3\6\3\6\3\7\3\7\3\7\3\7\3\b\3\b\3\b\3\b\3\t\3\t\3\t\3\t\3\t\2"+
		"\2\n\2\4\6\b\n\f\16\20\2\2\2\63\2\22\3\2\2\2\4\27\3\2\2\2\6\37\3\2\2\2"+
		"\b!\3\2\2\2\n&\3\2\2\2\f*\3\2\2\2\16.\3\2\2\2\20\62\3\2\2\2\22\23\5\4"+
		"\3\2\23\3\3\2\2\2\24\26\5\6\4\2\25\24\3\2\2\2\26\31\3\2\2\2\27\25\3\2"+
		"\2\2\27\30\3\2\2\2\30\5\3\2\2\2\31\27\3\2\2\2\32 \5\b\5\2\33 \5\n\6\2"+
		"\34 \5\f\7\2\35 \5\16\b\2\36 \5\20\t\2\37\32\3\2\2\2\37\33\3\2\2\2\37"+
		"\34\3\2\2\2\37\35\3\2\2\2\37\36\3\2\2\2 \7\3\2\2\2!\"\7\5\2\2\"#\7\6\2"+
		"\2#$\7\3\2\2$%\7\n\2\2%\t\3\2\2\2&\'\7\b\2\2\'(\7\3\2\2()\7\n\2\2)\13"+
		"\3\2\2\2*+\7\7\2\2+,\7\3\2\2,-\7\n\2\2-\r\3\2\2\2./\7\t\2\2/\60\7\3\2"+
		"\2\60\61\7\n\2\2\61\17\3\2\2\2\62\63\7\13\2\2\63\64\7\3\2\2\64\65\7\n"+
		"\2\2\65\21\3\2\2\2\4\27\37";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}