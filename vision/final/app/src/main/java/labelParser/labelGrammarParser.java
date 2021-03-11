// Generated from C:/Users/Omar Valdivia/Documents/GitHub/HealthApp/vision/final/app/src/main/java/com/google/firebase/codelab/textExtractor\labelGrammar.g4 by ANTLR 4.9.1
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
		NUMERO=1, GRASA=2, TOTALES=3, TOTAL=4, PROTEINAS=5, CARBOHIDRATOS=6, AZUCARES=7, 
		G=8, SODIO=9, WS=10, ANY=11;
	public static final int
		RULE_init = 0, RULE_statements = 1, RULE_grasaTotal_statement = 2, RULE_carbs_statement = 3, 
		RULE_azucar_statement = 4, RULE_sodio_statement = 5, RULE_proteina_statement = 6;
	private static String[] makeRuleNames() {
		return new String[] {
			"init", "statements", "grasaTotal_statement", "carbs_statement", "azucar_statement", 
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
			null, "NUMERO", "GRASA", "TOTALES", "TOTAL", "PROTEINAS", "CARBOHIDRATOS", 
			"AZUCARES", "G", "SODIO", "WS", "ANY"
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
			setState(17);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << GRASA) | (1L << PROTEINAS) | (1L << CARBOHIDRATOS) | (1L << AZUCARES) | (1L << SODIO))) != 0)) {
				{
				{
				setState(14);
				statements();
				}
				}
				setState(19);
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
			setState(25);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case GRASA:
				enterOuterAlt(_localctx, 1);
				{
				setState(20);
				grasaTotal_statement();
				}
				break;
			case CARBOHIDRATOS:
				enterOuterAlt(_localctx, 2);
				{
				setState(21);
				carbs_statement();
				}
				break;
			case AZUCARES:
				enterOuterAlt(_localctx, 3);
				{
				setState(22);
				azucar_statement();
				}
				break;
			case SODIO:
				enterOuterAlt(_localctx, 4);
				{
				setState(23);
				sodio_statement();
				}
				break;
			case PROTEINAS:
				enterOuterAlt(_localctx, 5);
				{
				setState(24);
				proteina_statement();
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
		enterRule(_localctx, 4, RULE_grasaTotal_statement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(27);
			match(GRASA);
			setState(28);
			match(TOTAL);
			setState(29);
			match(NUMERO);
			setState(31);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==G) {
				{
				setState(30);
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
		public TerminalNode TOTALES() { return getToken(labelGrammarParser.TOTALES, 0); }
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
		enterRule(_localctx, 6, RULE_carbs_statement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(33);
			match(CARBOHIDRATOS);
			setState(35);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==TOTALES) {
				{
				setState(34);
				match(TOTALES);
				}
			}

			setState(37);
			match(NUMERO);
			setState(39);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==G) {
				{
				setState(38);
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
		enterRule(_localctx, 8, RULE_azucar_statement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(41);
			match(AZUCARES);
			setState(42);
			match(NUMERO);
			setState(44);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==G) {
				{
				setState(43);
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
		enterRule(_localctx, 10, RULE_sodio_statement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(46);
			match(SODIO);
			setState(47);
			match(NUMERO);
			setState(49);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==G) {
				{
				setState(48);
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
		enterRule(_localctx, 12, RULE_proteina_statement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(51);
			match(PROTEINAS);
			setState(52);
			match(NUMERO);
			setState(54);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==G) {
				{
				setState(53);
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3\r;\4\2\t\2\4\3\t"+
		"\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\3\2\7\2\22\n\2\f\2\16\2\25"+
		"\13\2\3\3\3\3\3\3\3\3\3\3\5\3\34\n\3\3\4\3\4\3\4\3\4\5\4\"\n\4\3\5\3\5"+
		"\5\5&\n\5\3\5\3\5\5\5*\n\5\3\6\3\6\3\6\5\6/\n\6\3\7\3\7\3\7\5\7\64\n\7"+
		"\3\b\3\b\3\b\5\b9\n\b\3\b\2\2\t\2\4\6\b\n\f\16\2\2\2>\2\23\3\2\2\2\4\33"+
		"\3\2\2\2\6\35\3\2\2\2\b#\3\2\2\2\n+\3\2\2\2\f\60\3\2\2\2\16\65\3\2\2\2"+
		"\20\22\5\4\3\2\21\20\3\2\2\2\22\25\3\2\2\2\23\21\3\2\2\2\23\24\3\2\2\2"+
		"\24\3\3\2\2\2\25\23\3\2\2\2\26\34\5\6\4\2\27\34\5\b\5\2\30\34\5\n\6\2"+
		"\31\34\5\f\7\2\32\34\5\16\b\2\33\26\3\2\2\2\33\27\3\2\2\2\33\30\3\2\2"+
		"\2\33\31\3\2\2\2\33\32\3\2\2\2\34\5\3\2\2\2\35\36\7\4\2\2\36\37\7\6\2"+
		"\2\37!\7\3\2\2 \"\7\n\2\2! \3\2\2\2!\"\3\2\2\2\"\7\3\2\2\2#%\7\b\2\2$"+
		"&\7\5\2\2%$\3\2\2\2%&\3\2\2\2&\'\3\2\2\2\')\7\3\2\2(*\7\n\2\2)(\3\2\2"+
		"\2)*\3\2\2\2*\t\3\2\2\2+,\7\t\2\2,.\7\3\2\2-/\7\n\2\2.-\3\2\2\2./\3\2"+
		"\2\2/\13\3\2\2\2\60\61\7\13\2\2\61\63\7\3\2\2\62\64\7\n\2\2\63\62\3\2"+
		"\2\2\63\64\3\2\2\2\64\r\3\2\2\2\65\66\7\7\2\2\668\7\3\2\2\679\7\n\2\2"+
		"8\67\3\2\2\289\3\2\2\29\17\3\2\2\2\n\23\33!%).\638";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}