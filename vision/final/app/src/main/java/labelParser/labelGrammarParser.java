// Generated from C:/Users/Omar Valdivia/Documents/GitHub/HealthApp/vision/final/app/src/main/java/com/google/firebase/codelab/textExtractor/analyzer\labelGrammar.g4 by ANTLR 4.9.1
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
public class labelGrammarParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.9.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		NUMERO=1, ACCENT=2, NOACCENT=3, VOWEL=4, TAMANODEPORCION=5, OZ=6, EMPAQUE=7, 
		CALORIAS=8, GRASA=9, TOTAL=10, CARBOHIDRATOS=11, AZUCARES=12, SODIO=13, 
		PROTEINAS=14, G=15, WS=16, ANY=17;
	public static final int
		RULE_init = 0, RULE_statements = 1, RULE_tamanoPorcion_statement = 2, 
		RULE_porcionesEmpaque_statement = 3, RULE_caloriasStatement = 4, RULE_grasaTotal_statement = 5, 
		RULE_carbs_statement = 6, RULE_azucar_statement = 7, RULE_sodio_statement = 8, 
		RULE_proteina_statement = 9;
	private static String[] makeRuleNames() {
		return new String[] {
			"init", "statements", "tamanoPorcion_statement", "porcionesEmpaque_statement", 
			"caloriasStatement", "grasaTotal_statement", "carbs_statement", "azucar_statement", 
			"sodio_statement", "proteina_statement"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "NUMERO", "ACCENT", "NOACCENT", "VOWEL", "TAMANODEPORCION", "OZ", 
			"EMPAQUE", "CALORIAS", "GRASA", "TOTAL", "CARBOHIDRATOS", "AZUCARES", 
			"SODIO", "PROTEINAS", "G", "WS", "ANY"
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
	public String getGrammarFileName() { return "labelGrammar.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public labelGrammarParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	public static class InitContext extends ParserRuleContext {
		public List<StatementsContext> statements() {
			return getRuleContexts(StatementsContext.class);
		}
		public StatementsContext statements(int i) {
			return getRuleContext(StatementsContext.class,i);
		}
		public InitContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_init; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof labelGrammarListener ) ((labelGrammarListener)listener).enterInit(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof labelGrammarListener ) ((labelGrammarListener)listener).exitInit(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof labelGrammarVisitor ) return ((labelGrammarVisitor<? extends T>)visitor).visitInit(this);
			else return visitor.visitChildren(this);
		}
	}

	public final InitContext init() throws RecognitionException {
		InitContext _localctx = new InitContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_init);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(23);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << TAMANODEPORCION) | (1L << EMPAQUE) | (1L << CALORIAS) | (1L << GRASA) | (1L << CARBOHIDRATOS) | (1L << AZUCARES) | (1L << SODIO) | (1L << PROTEINAS))) != 0)) {
				{
				{
				setState(20);
				statements();
				}
				}
				setState(25);
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

	public static class StatementsContext extends ParserRuleContext {
		public GrasaTotal_statementContext grasaTotal_statement() {
			return getRuleContext(GrasaTotal_statementContext.class,0);
		}
		public Carbs_statementContext carbs_statement() {
			return getRuleContext(Carbs_statementContext.class,0);
		}
		public Azucar_statementContext azucar_statement() {
			return getRuleContext(Azucar_statementContext.class,0);
		}
		public Sodio_statementContext sodio_statement() {
			return getRuleContext(Sodio_statementContext.class,0);
		}
		public Proteina_statementContext proteina_statement() {
			return getRuleContext(Proteina_statementContext.class,0);
		}
		public TamanoPorcion_statementContext tamanoPorcion_statement() {
			return getRuleContext(TamanoPorcion_statementContext.class,0);
		}
		public PorcionesEmpaque_statementContext porcionesEmpaque_statement() {
			return getRuleContext(PorcionesEmpaque_statementContext.class,0);
		}
		public CaloriasStatementContext caloriasStatement() {
			return getRuleContext(CaloriasStatementContext.class,0);
		}
		public StatementsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_statements; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof labelGrammarListener ) ((labelGrammarListener)listener).enterStatements(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof labelGrammarListener ) ((labelGrammarListener)listener).exitStatements(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof labelGrammarVisitor ) return ((labelGrammarVisitor<? extends T>)visitor).visitStatements(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StatementsContext statements() throws RecognitionException {
		StatementsContext _localctx = new StatementsContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_statements);
		try {
			setState(34);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case GRASA:
				enterOuterAlt(_localctx, 1);
				{
				setState(26);
				grasaTotal_statement();
				}
				break;
			case CARBOHIDRATOS:
				enterOuterAlt(_localctx, 2);
				{
				setState(27);
				carbs_statement();
				}
				break;
			case AZUCARES:
				enterOuterAlt(_localctx, 3);
				{
				setState(28);
				azucar_statement();
				}
				break;
			case SODIO:
				enterOuterAlt(_localctx, 4);
				{
				setState(29);
				sodio_statement();
				}
				break;
			case PROTEINAS:
				enterOuterAlt(_localctx, 5);
				{
				setState(30);
				proteina_statement();
				}
				break;
			case TAMANODEPORCION:
				enterOuterAlt(_localctx, 6);
				{
				setState(31);
				tamanoPorcion_statement();
				}
				break;
			case EMPAQUE:
				enterOuterAlt(_localctx, 7);
				{
				setState(32);
				porcionesEmpaque_statement();
				}
				break;
			case CALORIAS:
				enterOuterAlt(_localctx, 8);
				{
				setState(33);
				caloriasStatement();
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

	public static class TamanoPorcion_statementContext extends ParserRuleContext {
		public TerminalNode TAMANODEPORCION() { return getToken(labelGrammarParser.TAMANODEPORCION, 0); }
		public List<TerminalNode> NUMERO() { return getTokens(labelGrammarParser.NUMERO); }
		public TerminalNode NUMERO(int i) {
			return getToken(labelGrammarParser.NUMERO, i);
		}
		public TerminalNode OZ() { return getToken(labelGrammarParser.OZ, 0); }
		public TerminalNode G() { return getToken(labelGrammarParser.G, 0); }
		public TamanoPorcion_statementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_tamanoPorcion_statement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof labelGrammarListener ) ((labelGrammarListener)listener).enterTamanoPorcion_statement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof labelGrammarListener ) ((labelGrammarListener)listener).exitTamanoPorcion_statement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof labelGrammarVisitor ) return ((labelGrammarVisitor<? extends T>)visitor).visitTamanoPorcion_statement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TamanoPorcion_statementContext tamanoPorcion_statement() throws RecognitionException {
		TamanoPorcion_statementContext _localctx = new TamanoPorcion_statementContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_tamanoPorcion_statement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(36);
			match(TAMANODEPORCION);
			setState(38);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,2,_ctx) ) {
			case 1:
				{
				setState(37);
				match(NUMERO);
				}
				break;
			}
			setState(41);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==OZ) {
				{
				setState(40);
				match(OZ);
				}
			}

			setState(43);
			match(NUMERO);
			setState(45);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==G) {
				{
				setState(44);
				match(G);
				}
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

	public static class PorcionesEmpaque_statementContext extends ParserRuleContext {
		public TerminalNode EMPAQUE() { return getToken(labelGrammarParser.EMPAQUE, 0); }
		public TerminalNode NUMERO() { return getToken(labelGrammarParser.NUMERO, 0); }
		public PorcionesEmpaque_statementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_porcionesEmpaque_statement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof labelGrammarListener ) ((labelGrammarListener)listener).enterPorcionesEmpaque_statement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof labelGrammarListener ) ((labelGrammarListener)listener).exitPorcionesEmpaque_statement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof labelGrammarVisitor ) return ((labelGrammarVisitor<? extends T>)visitor).visitPorcionesEmpaque_statement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PorcionesEmpaque_statementContext porcionesEmpaque_statement() throws RecognitionException {
		PorcionesEmpaque_statementContext _localctx = new PorcionesEmpaque_statementContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_porcionesEmpaque_statement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(47);
			match(EMPAQUE);
			setState(48);
			match(NUMERO);
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

	public static class CaloriasStatementContext extends ParserRuleContext {
		public TerminalNode CALORIAS() { return getToken(labelGrammarParser.CALORIAS, 0); }
		public TerminalNode NUMERO() { return getToken(labelGrammarParser.NUMERO, 0); }
		public CaloriasStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_caloriasStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof labelGrammarListener ) ((labelGrammarListener)listener).enterCaloriasStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof labelGrammarListener ) ((labelGrammarListener)listener).exitCaloriasStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof labelGrammarVisitor ) return ((labelGrammarVisitor<? extends T>)visitor).visitCaloriasStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CaloriasStatementContext caloriasStatement() throws RecognitionException {
		CaloriasStatementContext _localctx = new CaloriasStatementContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_caloriasStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(50);
			match(CALORIAS);
			setState(51);
			match(NUMERO);
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
		public TerminalNode GRASA() { return getToken(labelGrammarParser.GRASA, 0); }
		public TerminalNode TOTAL() { return getToken(labelGrammarParser.TOTAL, 0); }
		public TerminalNode NUMERO() { return getToken(labelGrammarParser.NUMERO, 0); }
		public TerminalNode G() { return getToken(labelGrammarParser.G, 0); }
		public GrasaTotal_statementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_grasaTotal_statement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof labelGrammarListener ) ((labelGrammarListener)listener).enterGrasaTotal_statement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof labelGrammarListener ) ((labelGrammarListener)listener).exitGrasaTotal_statement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof labelGrammarVisitor ) return ((labelGrammarVisitor<? extends T>)visitor).visitGrasaTotal_statement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final GrasaTotal_statementContext grasaTotal_statement() throws RecognitionException {
		GrasaTotal_statementContext _localctx = new GrasaTotal_statementContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_grasaTotal_statement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(53);
			match(GRASA);
			setState(54);
			match(TOTAL);
			setState(55);
			match(NUMERO);
			setState(57);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==G) {
				{
				setState(56);
				match(G);
				}
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

	public static class Carbs_statementContext extends ParserRuleContext {
		public TerminalNode CARBOHIDRATOS() { return getToken(labelGrammarParser.CARBOHIDRATOS, 0); }
		public TerminalNode NUMERO() { return getToken(labelGrammarParser.NUMERO, 0); }
		public TerminalNode TOTAL() { return getToken(labelGrammarParser.TOTAL, 0); }
		public TerminalNode G() { return getToken(labelGrammarParser.G, 0); }
		public Carbs_statementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_carbs_statement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof labelGrammarListener ) ((labelGrammarListener)listener).enterCarbs_statement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof labelGrammarListener ) ((labelGrammarListener)listener).exitCarbs_statement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof labelGrammarVisitor ) return ((labelGrammarVisitor<? extends T>)visitor).visitCarbs_statement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Carbs_statementContext carbs_statement() throws RecognitionException {
		Carbs_statementContext _localctx = new Carbs_statementContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_carbs_statement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(59);
			match(CARBOHIDRATOS);
			setState(61);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==TOTAL) {
				{
				setState(60);
				match(TOTAL);
				}
			}

			setState(63);
			match(NUMERO);
			setState(65);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==G) {
				{
				setState(64);
				match(G);
				}
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

	public static class Azucar_statementContext extends ParserRuleContext {
		public TerminalNode AZUCARES() { return getToken(labelGrammarParser.AZUCARES, 0); }
		public TerminalNode NUMERO() { return getToken(labelGrammarParser.NUMERO, 0); }
		public TerminalNode G() { return getToken(labelGrammarParser.G, 0); }
		public Azucar_statementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_azucar_statement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof labelGrammarListener ) ((labelGrammarListener)listener).enterAzucar_statement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof labelGrammarListener ) ((labelGrammarListener)listener).exitAzucar_statement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof labelGrammarVisitor ) return ((labelGrammarVisitor<? extends T>)visitor).visitAzucar_statement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Azucar_statementContext azucar_statement() throws RecognitionException {
		Azucar_statementContext _localctx = new Azucar_statementContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_azucar_statement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(67);
			match(AZUCARES);
			setState(68);
			match(NUMERO);
			setState(70);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==G) {
				{
				setState(69);
				match(G);
				}
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

	public static class Sodio_statementContext extends ParserRuleContext {
		public TerminalNode SODIO() { return getToken(labelGrammarParser.SODIO, 0); }
		public TerminalNode NUMERO() { return getToken(labelGrammarParser.NUMERO, 0); }
		public TerminalNode G() { return getToken(labelGrammarParser.G, 0); }
		public Sodio_statementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_sodio_statement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof labelGrammarListener ) ((labelGrammarListener)listener).enterSodio_statement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof labelGrammarListener ) ((labelGrammarListener)listener).exitSodio_statement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof labelGrammarVisitor ) return ((labelGrammarVisitor<? extends T>)visitor).visitSodio_statement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Sodio_statementContext sodio_statement() throws RecognitionException {
		Sodio_statementContext _localctx = new Sodio_statementContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_sodio_statement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(72);
			match(SODIO);
			setState(73);
			match(NUMERO);
			setState(75);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==G) {
				{
				setState(74);
				match(G);
				}
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

	public static class Proteina_statementContext extends ParserRuleContext {
		public TerminalNode PROTEINAS() { return getToken(labelGrammarParser.PROTEINAS, 0); }
		public TerminalNode NUMERO() { return getToken(labelGrammarParser.NUMERO, 0); }
		public TerminalNode G() { return getToken(labelGrammarParser.G, 0); }
		public Proteina_statementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_proteina_statement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof labelGrammarListener ) ((labelGrammarListener)listener).enterProteina_statement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof labelGrammarListener ) ((labelGrammarListener)listener).exitProteina_statement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof labelGrammarVisitor ) return ((labelGrammarVisitor<? extends T>)visitor).visitProteina_statement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Proteina_statementContext proteina_statement() throws RecognitionException {
		Proteina_statementContext _localctx = new Proteina_statementContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_proteina_statement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(77);
			match(PROTEINAS);
			setState(78);
			match(NUMERO);
			setState(80);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==G) {
				{
				setState(79);
				match(G);
				}
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

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3\23U\4\2\t\2\4\3\t"+
		"\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t\13\3"+
		"\2\7\2\30\n\2\f\2\16\2\33\13\2\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\5\3%\n"+
		"\3\3\4\3\4\5\4)\n\4\3\4\5\4,\n\4\3\4\3\4\5\4\60\n\4\3\5\3\5\3\5\3\6\3"+
		"\6\3\6\3\7\3\7\3\7\3\7\5\7<\n\7\3\b\3\b\5\b@\n\b\3\b\3\b\5\bD\n\b\3\t"+
		"\3\t\3\t\5\tI\n\t\3\n\3\n\3\n\5\nN\n\n\3\13\3\13\3\13\5\13S\n\13\3\13"+
		"\2\2\f\2\4\6\b\n\f\16\20\22\24\2\2\2[\2\31\3\2\2\2\4$\3\2\2\2\6&\3\2\2"+
		"\2\b\61\3\2\2\2\n\64\3\2\2\2\f\67\3\2\2\2\16=\3\2\2\2\20E\3\2\2\2\22J"+
		"\3\2\2\2\24O\3\2\2\2\26\30\5\4\3\2\27\26\3\2\2\2\30\33\3\2\2\2\31\27\3"+
		"\2\2\2\31\32\3\2\2\2\32\3\3\2\2\2\33\31\3\2\2\2\34%\5\f\7\2\35%\5\16\b"+
		"\2\36%\5\20\t\2\37%\5\22\n\2 %\5\24\13\2!%\5\6\4\2\"%\5\b\5\2#%\5\n\6"+
		"\2$\34\3\2\2\2$\35\3\2\2\2$\36\3\2\2\2$\37\3\2\2\2$ \3\2\2\2$!\3\2\2\2"+
		"$\"\3\2\2\2$#\3\2\2\2%\5\3\2\2\2&(\7\7\2\2\')\7\3\2\2(\'\3\2\2\2()\3\2"+
		"\2\2)+\3\2\2\2*,\7\b\2\2+*\3\2\2\2+,\3\2\2\2,-\3\2\2\2-/\7\3\2\2.\60\7"+
		"\21\2\2/.\3\2\2\2/\60\3\2\2\2\60\7\3\2\2\2\61\62\7\t\2\2\62\63\7\3\2\2"+
		"\63\t\3\2\2\2\64\65\7\n\2\2\65\66\7\3\2\2\66\13\3\2\2\2\678\7\13\2\28"+
		"9\7\f\2\29;\7\3\2\2:<\7\21\2\2;:\3\2\2\2;<\3\2\2\2<\r\3\2\2\2=?\7\r\2"+
		"\2>@\7\f\2\2?>\3\2\2\2?@\3\2\2\2@A\3\2\2\2AC\7\3\2\2BD\7\21\2\2CB\3\2"+
		"\2\2CD\3\2\2\2D\17\3\2\2\2EF\7\16\2\2FH\7\3\2\2GI\7\21\2\2HG\3\2\2\2H"+
		"I\3\2\2\2I\21\3\2\2\2JK\7\17\2\2KM\7\3\2\2LN\7\21\2\2ML\3\2\2\2MN\3\2"+
		"\2\2N\23\3\2\2\2OP\7\20\2\2PR\7\3\2\2QS\7\21\2\2RQ\3\2\2\2RS\3\2\2\2S"+
		"\25\3\2\2\2\r\31$(+/;?CHMR";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}