// Generated from C:/Users/Omar Valdivia/Documents/GitHub/HealthApp/vision/final/app/src/main/java/com/google/firebase/codelab/textExtractor\labelGrammar.g4 by ANTLR 4.9.1
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
		NUMERO=1, GRASA=2, TOTAL=3, PROTEINAS=4, CARBOHIDRATOS=5, AZUCARES=6, 
		G=7, SODIO=8, WS=9, ANY=10;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"NUMERO", "GRASA", "TOTAL", "PROTEINAS", "CARBOHIDRATOS", "AZUCARES", 
			"G", "SODIO", "WS", "ANY"
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
			null, "NUMERO", "GRASA", "TOTAL", "PROTEINAS", "CARBOHIDRATOS", "AZUCARES", 
			"G", "SODIO", "WS", "ANY"
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2\fc\b\1\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\3\2\6\2\31\n\2\r\2\16\2\32\3\3\3\3\3\3\3\3\3\3\3\3\3\4\3\4\3\4\3\4"+
		"\3\4\3\4\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\5\5\63\n\5\3\6\3\6\3"+
		"\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\5\6C\n\6\3\7\3\7\3\7\3"+
		"\7\3\7\3\7\3\7\3\7\3\7\5\7N\n\7\3\b\5\bQ\n\b\3\b\3\b\3\t\3\t\3\t\3\t\3"+
		"\t\3\t\3\n\3\n\3\n\3\n\3\13\6\13`\n\13\r\13\16\13a\3a\2\f\3\3\5\4\7\5"+
		"\t\6\13\7\r\b\17\t\21\n\23\13\25\f\3\2\f\3\2\62;\5\2IIii~~\5\2VVvv~~\5"+
		"\2RRrr~~\3\2uu\5\2EEee~~\5\2UUuu~~\5\2CCcc~~\3\2oo\6\2\13\f\17\17\"\""+
		"<=\2h\2\3\3\2\2\2\2\5\3\2\2\2\2\7\3\2\2\2\2\t\3\2\2\2\2\13\3\2\2\2\2\r"+
		"\3\2\2\2\2\17\3\2\2\2\2\21\3\2\2\2\2\23\3\2\2\2\2\25\3\2\2\2\3\30\3\2"+
		"\2\2\5\34\3\2\2\2\7\"\3\2\2\2\t(\3\2\2\2\13\64\3\2\2\2\rD\3\2\2\2\17P"+
		"\3\2\2\2\21T\3\2\2\2\23Z\3\2\2\2\25_\3\2\2\2\27\31\t\2\2\2\30\27\3\2\2"+
		"\2\31\32\3\2\2\2\32\30\3\2\2\2\32\33\3\2\2\2\33\4\3\2\2\2\34\35\t\3\2"+
		"\2\35\36\7t\2\2\36\37\7c\2\2\37 \7u\2\2 !\7c\2\2!\6\3\2\2\2\"#\t\4\2\2"+
		"#$\7q\2\2$%\7v\2\2%&\7c\2\2&\'\7n\2\2\'\b\3\2\2\2()\t\5\2\2)*\7t\2\2*"+
		"+\7q\2\2+,\7v\2\2,-\7g\2\2-.\7k\2\2./\7p\2\2/\60\7c\2\2\60\62\3\2\2\2"+
		"\61\63\t\6\2\2\62\61\3\2\2\2\62\63\3\2\2\2\63\n\3\2\2\2\64\65\t\7\2\2"+
		"\65\66\7c\2\2\66\67\7t\2\2\678\7d\2\289\7q\2\29:\7j\2\2:;\7k\2\2;<\7f"+
		"\2\2<=\7t\2\2=>\7c\2\2>?\7v\2\2?@\7q\2\2@B\3\2\2\2AC\t\b\2\2BA\3\2\2\2"+
		"BC\3\2\2\2C\f\3\2\2\2DE\t\t\2\2EF\7|\2\2FG\7w\2\2GH\7e\2\2HI\7c\2\2IJ"+
		"\7t\2\2JK\7g\2\2KM\3\2\2\2LN\t\6\2\2ML\3\2\2\2MN\3\2\2\2N\16\3\2\2\2O"+
		"Q\t\n\2\2PO\3\2\2\2PQ\3\2\2\2QR\3\2\2\2RS\7i\2\2S\20\3\2\2\2TU\t\b\2\2"+
		"UV\7q\2\2VW\7f\2\2WX\7k\2\2XY\7q\2\2Y\22\3\2\2\2Z[\t\13\2\2[\\\3\2\2\2"+
		"\\]\b\n\2\2]\24\3\2\2\2^`\13\2\2\2_^\3\2\2\2`a\3\2\2\2ab\3\2\2\2a_\3\2"+
		"\2\2b\26\3\2\2\2\t\2\32\62BMPa\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}