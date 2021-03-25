// Generated from C:/Users/ricar/Documents/GitHub/HealthApp/vision/final/app/src/main/java/com/google/firebase/codelab/textExtractor/analyzer\labelGrammar.g4 by ANTLR 4.9.1
package labelParser;
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class labelGrammarLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.9.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		NUMERO=1, VOWEL=2, TAMANODEPORCION=3, OZ=4, EMPAQUE=5, CALORIAS=6, GRASA=7, 
		TOTAL=8, SATURADAS=9, TRANS=10, CARBOHIDRATOS=11, AZUCARES=12, COLESTEROL=13, 
		SODIO=14, PROTEINAS=15, G=16, WS=17, ANY=18;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"NUMERO", "VOWEL", "TAMANODEPORCION", "OZ", "EMPAQUE", "CALORIAS", "GRASA", 
			"TOTAL", "SATURADAS", "TRANS", "CARBOHIDRATOS", "AZUCARES", "COLESTEROL", 
			"SODIO", "PROTEINAS", "G", "WS", "ANY"
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
			null, "NUMERO", "VOWEL", "TAMANODEPORCION", "OZ", "EMPAQUE", "CALORIAS", 
			"GRASA", "TOTAL", "SATURADAS", "TRANS", "CARBOHIDRATOS", "AZUCARES", 
			"COLESTEROL", "SODIO", "PROTEINAS", "G", "WS", "ANY"
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


	public labelGrammarLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "labelGrammar.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public String[] getChannelNames() { return channelNames; }

	@Override
	public String[] getModeNames() { return modeNames; }

	@Override
	public ATN getATN() { return _ATN; }

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2\24\u00bf\b\1\4\2"+
		"\t\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4"+
		"\13\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22"+
		"\t\22\4\23\t\23\3\2\6\2)\n\2\r\2\16\2*\3\3\5\3.\n\3\3\4\3\4\3\4\3\4\3"+
		"\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\5\3\5\3\6"+
		"\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3"+
		"\b\3\b\3\b\3\b\3\b\3\b\5\b]\n\b\3\t\3\t\3\t\3\t\3\t\3\t\5\te\n\t\3\t\5"+
		"\th\n\t\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\13\3\13\3\13\3\13\3"+
		"\13\3\13\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3"+
		"\f\5\f\u008a\n\f\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\16\3\16\3\16\3"+
		"\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\17\3\17\3\17\3\17\3\17\3"+
		"\17\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\21\5\21\u00b1\n\21"+
		"\3\21\3\21\3\22\3\22\3\22\3\22\3\23\6\23\u00ba\n\23\r\23\16\23\u00bb\3"+
		"\23\3\23\3\u00bb\2\24\3\3\5\4\7\5\t\6\13\7\r\b\17\t\21\n\23\13\25\f\27"+
		"\r\31\16\33\17\35\20\37\21!\22#\23%\24\3\2\21\3\2\62;\r\2CCGGKKQQWWcc"+
		"ggkkqqww~~\5\2VVvv~~\5\2RRrr~~\4\2qq||\5\2GGgg~~\5\2EEee~~\5\2NNnn~~\5"+
		"\2TTtt~~\5\2UUuu~~\5\2IIii~~\5\2CCcc~~\5\2pp||~~\3\2oo\b\2\13\f\17\17"+
		"\"\"\'\'//<=\2\u00c5\2\3\3\2\2\2\2\5\3\2\2\2\2\7\3\2\2\2\2\t\3\2\2\2\2"+
		"\13\3\2\2\2\2\r\3\2\2\2\2\17\3\2\2\2\2\21\3\2\2\2\2\23\3\2\2\2\2\25\3"+
		"\2\2\2\2\27\3\2\2\2\2\31\3\2\2\2\2\33\3\2\2\2\2\35\3\2\2\2\2\37\3\2\2"+
		"\2\2!\3\2\2\2\2#\3\2\2\2\2%\3\2\2\2\3(\3\2\2\2\5-\3\2\2\2\7/\3\2\2\2\t"+
		"B\3\2\2\2\13D\3\2\2\2\rM\3\2\2\2\17V\3\2\2\2\21^\3\2\2\2\23i\3\2\2\2\25"+
		"s\3\2\2\2\27y\3\2\2\2\31\u008b\3\2\2\2\33\u0094\3\2\2\2\35\u00a0\3\2\2"+
		"\2\37\u00a6\3\2\2\2!\u00b0\3\2\2\2#\u00b4\3\2\2\2%\u00b9\3\2\2\2\')\t"+
		"\2\2\2(\'\3\2\2\2)*\3\2\2\2*(\3\2\2\2*+\3\2\2\2+\4\3\2\2\2,.\t\3\2\2-"+
		",\3\2\2\2.\6\3\2\2\2/\60\t\4\2\2\60\61\5\5\3\2\61\62\7o\2\2\62\63\5\5"+
		"\3\2\63\64\7p\2\2\64\65\5\5\3\2\65\66\7f\2\2\66\67\5\5\3\2\678\7n\2\2"+
		"89\5\5\3\29:\t\5\2\2:;\5\5\3\2;<\7t\2\2<=\7e\2\2=>\3\2\2\2>?\5\5\3\2?"+
		"@\5\5\3\2@A\7p\2\2A\b\3\2\2\2BC\t\6\2\2C\n\3\2\2\2DE\t\7\2\2EF\7o\2\2"+
		"FG\7r\2\2GH\3\2\2\2HI\5\5\3\2IJ\7s\2\2JK\5\5\3\2KL\5\5\3\2L\f\3\2\2\2"+
		"MN\t\b\2\2NO\5\5\3\2OP\t\t\2\2PQ\5\5\3\2QR\t\n\2\2RS\5\5\3\2ST\5\5\3\2"+
		"TU\t\13\2\2U\16\3\2\2\2VW\t\f\2\2WX\7t\2\2XY\5\5\3\2YZ\7u\2\2Z\\\5\5\3"+
		"\2[]\7u\2\2\\[\3\2\2\2\\]\3\2\2\2]\20\3\2\2\2^_\t\4\2\2_`\5\5\3\2`a\7"+
		"v\2\2ab\5\5\3\2bd\7n\2\2ce\5\5\3\2dc\3\2\2\2de\3\2\2\2eg\3\2\2\2fh\7u"+
		"\2\2gf\3\2\2\2gh\3\2\2\2h\22\3\2\2\2ij\t\13\2\2jk\5\5\3\2kl\7v\2\2lm\5"+
		"\5\3\2mn\7t\2\2no\5\5\3\2op\7f\2\2pq\5\5\3\2qr\7u\2\2r\24\3\2\2\2st\t"+
		"\4\2\2tu\7t\2\2uv\5\5\3\2vw\7p\2\2wx\7u\2\2x\26\3\2\2\2yz\t\b\2\2z{\5"+
		"\5\3\2{|\7t\2\2|}\7d\2\2}\u0089\3\2\2\2~\177\5\5\3\2\177\u0080\7j\2\2"+
		"\u0080\u0081\5\5\3\2\u0081\u0082\7f\2\2\u0082\u0083\7t\2\2\u0083\u0084"+
		"\3\2\2\2\u0084\u0085\5\5\3\2\u0085\u0086\7v\2\2\u0086\u0087\5\5\3\2\u0087"+
		"\u0088\7u\2\2\u0088\u008a\3\2\2\2\u0089~\3\2\2\2\u0089\u008a\3\2\2\2\u008a"+
		"\30\3\2\2\2\u008b\u008c\t\r\2\2\u008c\u008d\t\16\2\2\u008d\u008e\5\5\3"+
		"\2\u008e\u008f\7e\2\2\u008f\u0090\5\5\3\2\u0090\u0091\7t\2\2\u0091\u0092"+
		"\5\5\3\2\u0092\u0093\7u\2\2\u0093\32\3\2\2\2\u0094\u0095\t\b\2\2\u0095"+
		"\u0096\5\5\3\2\u0096\u0097\7n\2\2\u0097\u0098\5\5\3\2\u0098\u0099\7u\2"+
		"\2\u0099\u009a\7v\2\2\u009a\u009b\3\2\2\2\u009b\u009c\5\5\3\2\u009c\u009d"+
		"\7t\2\2\u009d\u009e\5\5\3\2\u009e\u009f\7n\2\2\u009f\34\3\2\2\2\u00a0"+
		"\u00a1\t\13\2\2\u00a1\u00a2\5\5\3\2\u00a2\u00a3\7f\2\2\u00a3\u00a4\5\5"+
		"\3\2\u00a4\u00a5\5\5\3\2\u00a5\36\3\2\2\2\u00a6\u00a7\t\5\2\2\u00a7\u00a8"+
		"\7t\2\2\u00a8\u00a9\5\5\3\2\u00a9\u00aa\7v\2\2\u00aa\u00ab\5\5\3\2\u00ab"+
		"\u00ac\5\5\3\2\u00ac\u00ad\7p\2\2\u00ad\u00ae\5\5\3\2\u00ae \3\2\2\2\u00af"+
		"\u00b1\t\17\2\2\u00b0\u00af\3\2\2\2\u00b0\u00b1\3\2\2\2\u00b1\u00b2\3"+
		"\2\2\2\u00b2\u00b3\7i\2\2\u00b3\"\3\2\2\2\u00b4\u00b5\t\20\2\2\u00b5\u00b6"+
		"\3\2\2\2\u00b6\u00b7\b\22\2\2\u00b7$\3\2\2\2\u00b8\u00ba\13\2\2\2\u00b9"+
		"\u00b8\3\2\2\2\u00ba\u00bb\3\2\2\2\u00bb\u00bc\3\2\2\2\u00bb\u00b9\3\2"+
		"\2\2\u00bc\u00bd\3\2\2\2\u00bd\u00be\b\23\2\2\u00be&\3\2\2\2\13\2*-\\"+
		"dg\u0089\u00b0\u00bb\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}