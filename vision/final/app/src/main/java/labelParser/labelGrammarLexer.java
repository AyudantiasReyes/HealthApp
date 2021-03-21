// Generated from C:/Users/Omar Valdivia/Documents/GitHub/HealthApp/vision/final/app/src/main/java/com/google/firebase/codelab/textExtractor/analyzer\labelGrammar.g4 by ANTLR 4.9.1
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
		TOTAL=8, CARBOHIDRATOS=9, AZUCARES=10, SODIO=11, PROTEINAS=12, G=13, WS=14, 
		ANY=15;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"NUMERO", "VOWEL", "TAMANODEPORCION", "OZ", "EMPAQUE", "CALORIAS", "GRASA", 
			"TOTAL", "CARBOHIDRATOS", "AZUCARES", "SODIO", "PROTEINAS", "G", "WS", 
			"ANY"
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
			"GRASA", "TOTAL", "CARBOHIDRATOS", "AZUCARES", "SODIO", "PROTEINAS", 
			"G", "WS", "ANY"
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2\21\u009d\b\1\4\2"+
		"\t\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4"+
		"\13\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\3\2\6\2#\n\2\r"+
		"\2\16\2$\3\3\5\3(\n\3\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4"+
		"\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\5\3\5\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3"+
		"\6\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\b\3\b\3\b\3\b\3\b\3\b\5\bW\n"+
		"\b\3\t\3\t\3\t\3\t\3\t\3\t\5\t_\n\t\3\t\5\tb\n\t\3\n\3\n\3\n\3\n\3\n\3"+
		"\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\5\nt\n\n\3\13\3\13\3\13\3\13"+
		"\3\13\3\13\3\13\3\13\3\13\3\f\3\f\3\f\3\f\3\f\3\f\3\r\3\r\3\r\3\r\3\r"+
		"\3\r\3\r\3\r\3\r\3\16\5\16\u008f\n\16\3\16\3\16\3\17\3\17\3\17\3\17\3"+
		"\20\6\20\u0098\n\20\r\20\16\20\u0099\3\20\3\20\3\u0099\2\21\3\3\5\4\7"+
		"\5\t\6\13\7\r\b\17\t\21\n\23\13\25\f\27\r\31\16\33\17\35\20\37\21\3\2"+
		"\21\3\2\62;\r\2CCGGKKQQWWccggkkqqww~~\5\2VVvv~~\5\2RRrr~~\4\2qq||\5\2"+
		"GGgg~~\5\2EEee~~\5\2NNnn~~\5\2TTtt~~\5\2UUuu~~\5\2IIii~~\5\2CCcc~~\5\2"+
		"pp||~~\3\2oo\b\2\13\f\17\17\"\"\'\'//<=\2\u00a3\2\3\3\2\2\2\2\5\3\2\2"+
		"\2\2\7\3\2\2\2\2\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2\2\2\2\17\3\2\2\2\2\21"+
		"\3\2\2\2\2\23\3\2\2\2\2\25\3\2\2\2\2\27\3\2\2\2\2\31\3\2\2\2\2\33\3\2"+
		"\2\2\2\35\3\2\2\2\2\37\3\2\2\2\3\"\3\2\2\2\5\'\3\2\2\2\7)\3\2\2\2\t<\3"+
		"\2\2\2\13>\3\2\2\2\rG\3\2\2\2\17P\3\2\2\2\21X\3\2\2\2\23c\3\2\2\2\25u"+
		"\3\2\2\2\27~\3\2\2\2\31\u0084\3\2\2\2\33\u008e\3\2\2\2\35\u0092\3\2\2"+
		"\2\37\u0097\3\2\2\2!#\t\2\2\2\"!\3\2\2\2#$\3\2\2\2$\"\3\2\2\2$%\3\2\2"+
		"\2%\4\3\2\2\2&(\t\3\2\2\'&\3\2\2\2(\6\3\2\2\2)*\t\4\2\2*+\5\5\3\2+,\7"+
		"o\2\2,-\5\5\3\2-.\7p\2\2./\5\5\3\2/\60\7f\2\2\60\61\5\5\3\2\61\62\7n\2"+
		"\2\62\63\5\5\3\2\63\64\t\5\2\2\64\65\5\5\3\2\65\66\7t\2\2\66\67\7e\2\2"+
		"\678\3\2\2\289\5\5\3\29:\5\5\3\2:;\7p\2\2;\b\3\2\2\2<=\t\6\2\2=\n\3\2"+
		"\2\2>?\t\7\2\2?@\7o\2\2@A\7r\2\2AB\3\2\2\2BC\5\5\3\2CD\7s\2\2DE\5\5\3"+
		"\2EF\5\5\3\2F\f\3\2\2\2GH\t\b\2\2HI\5\5\3\2IJ\t\t\2\2JK\5\5\3\2KL\t\n"+
		"\2\2LM\5\5\3\2MN\5\5\3\2NO\t\13\2\2O\16\3\2\2\2PQ\t\f\2\2QR\7t\2\2RS\5"+
		"\5\3\2ST\7u\2\2TV\5\5\3\2UW\7u\2\2VU\3\2\2\2VW\3\2\2\2W\20\3\2\2\2XY\t"+
		"\4\2\2YZ\5\5\3\2Z[\7v\2\2[\\\5\5\3\2\\^\7n\2\2]_\5\5\3\2^]\3\2\2\2^_\3"+
		"\2\2\2_a\3\2\2\2`b\7u\2\2a`\3\2\2\2ab\3\2\2\2b\22\3\2\2\2cd\t\b\2\2de"+
		"\5\5\3\2ef\7t\2\2fg\7d\2\2gs\3\2\2\2hi\5\5\3\2ij\7j\2\2jk\5\5\3\2kl\7"+
		"f\2\2lm\7t\2\2mn\3\2\2\2no\5\5\3\2op\7v\2\2pq\5\5\3\2qr\7u\2\2rt\3\2\2"+
		"\2sh\3\2\2\2st\3\2\2\2t\24\3\2\2\2uv\t\r\2\2vw\t\16\2\2wx\5\5\3\2xy\7"+
		"e\2\2yz\5\5\3\2z{\7t\2\2{|\5\5\3\2|}\7u\2\2}\26\3\2\2\2~\177\t\13\2\2"+
		"\177\u0080\5\5\3\2\u0080\u0081\7f\2\2\u0081\u0082\5\5\3\2\u0082\u0083"+
		"\5\5\3\2\u0083\30\3\2\2\2\u0084\u0085\t\5\2\2\u0085\u0086\7t\2\2\u0086"+
		"\u0087\5\5\3\2\u0087\u0088\7v\2\2\u0088\u0089\5\5\3\2\u0089\u008a\5\5"+
		"\3\2\u008a\u008b\7p\2\2\u008b\u008c\5\5\3\2\u008c\32\3\2\2\2\u008d\u008f"+
		"\t\17\2\2\u008e\u008d\3\2\2\2\u008e\u008f\3\2\2\2\u008f\u0090\3\2\2\2"+
		"\u0090\u0091\7i\2\2\u0091\34\3\2\2\2\u0092\u0093\t\20\2\2\u0093\u0094"+
		"\3\2\2\2\u0094\u0095\b\17\2\2\u0095\36\3\2\2\2\u0096\u0098\13\2\2\2\u0097"+
		"\u0096\3\2\2\2\u0098\u0099\3\2\2\2\u0099\u009a\3\2\2\2\u0099\u0097\3\2"+
		"\2\2\u009a\u009b\3\2\2\2\u009b\u009c\b\20\2\2\u009c \3\2\2\2\13\2$\'V"+
		"^as\u008e\u0099\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}