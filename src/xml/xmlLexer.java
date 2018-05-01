// Generated from xmlLexer.g4 by ANTLR 4.7.1
 package xml; 
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class xmlLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.7.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		COMMENT=1, CDATA=2, DTD=3, EntityRef=4, CharRef=5, SEA_WS=6, OPEN=7, XMLDeclOpen=8, 
		TEXT=9, CLOSE=10, SPECIAL_CLOSE=11, SLASH_CLOSE=12, SLASH=13, EQUALS=14, 
		STRING=15, LAY=16, ROW=17, TOK=18, Name=19, S=20, PI=21;
	public static final int
		INSIDE=1, PROC_INSTR=2;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE", "INSIDE", "PROC_INSTR"
	};

	public static final String[] ruleNames = {
		"COMMENT", "CDATA", "DTD", "EntityRef", "CharRef", "SEA_WS", "OPEN", "XMLDeclOpen", 
		"SPECIAL_OPEN", "TEXT", "CLOSE", "SPECIAL_CLOSE", "SLASH_CLOSE", "SLASH", 
		"EQUALS", "STRING", "LAY", "ROW", "TOK", "Name", "S", "HEXDIGIT", "DIGIT", 
		"NameChar", "NameStartChar", "PI", "IGNORE"
	};

	private static final String[] _LITERAL_NAMES = {
		null, null, null, null, null, null, null, "'<'", null, null, "'>'", null, 
		"'/>'", "'/'", "'='", null, null, "'mrow'"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, "COMMENT", "CDATA", "DTD", "EntityRef", "CharRef", "SEA_WS", "OPEN", 
		"XMLDeclOpen", "TEXT", "CLOSE", "SPECIAL_CLOSE", "SLASH_CLOSE", "SLASH", 
		"EQUALS", "STRING", "LAY", "ROW", "TOK", "Name", "S", "PI"
	};
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


	public xmlLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "xmlLexer.g4"; }

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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2\27\u010d\b\1\b\1"+
		"\b\1\4\2\t\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4"+
		"\n\t\n\4\13\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t"+
		"\21\4\22\t\22\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t"+
		"\30\4\31\t\31\4\32\t\32\4\33\t\33\4\34\t\34\3\2\3\2\3\2\3\2\3\2\3\2\7"+
		"\2B\n\2\f\2\16\2E\13\2\3\2\3\2\3\2\3\2\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3"+
		"\3\3\3\3\3\3\7\3V\n\3\f\3\16\3Y\13\3\3\3\3\3\3\3\3\3\3\4\3\4\3\4\3\4\7"+
		"\4c\n\4\f\4\16\4f\13\4\3\4\3\4\3\4\3\4\3\5\3\5\3\5\3\5\3\6\3\6\3\6\3\6"+
		"\6\6t\n\6\r\6\16\6u\3\6\3\6\3\6\3\6\3\6\3\6\3\6\6\6\177\n\6\r\6\16\6\u0080"+
		"\3\6\3\6\5\6\u0085\n\6\3\7\3\7\5\7\u0089\n\7\3\7\6\7\u008c\n\7\r\7\16"+
		"\7\u008d\3\b\3\b\3\b\3\b\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\n\3"+
		"\n\3\n\3\n\3\n\3\n\3\n\3\n\3\13\6\13\u00a7\n\13\r\13\16\13\u00a8\3\f\3"+
		"\f\3\f\3\f\3\r\3\r\3\r\3\r\3\r\3\16\3\16\3\16\3\16\3\16\3\17\3\17\3\20"+
		"\3\20\3\21\3\21\7\21\u00bf\n\21\f\21\16\21\u00c2\13\21\3\21\3\21\3\21"+
		"\7\21\u00c7\n\21\f\21\16\21\u00ca\13\21\3\21\5\21\u00cd\n\21\3\22\3\22"+
		"\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\5\22"+
		"\u00de\n\22\3\23\3\23\3\23\3\23\3\23\3\24\3\24\3\24\3\24\3\24\3\24\5\24"+
		"\u00eb\n\24\3\25\3\25\7\25\u00ef\n\25\f\25\16\25\u00f2\13\25\3\26\3\26"+
		"\3\26\3\26\3\27\3\27\3\30\3\30\3\31\3\31\3\31\3\31\5\31\u0100\n\31\3\32"+
		"\5\32\u0103\n\32\3\33\3\33\3\33\3\33\3\33\3\34\3\34\3\34\3\34\5CWd\2\35"+
		"\5\3\7\4\t\5\13\6\r\7\17\b\21\t\23\n\25\2\27\13\31\f\33\r\35\16\37\17"+
		"!\20#\21%\22\'\23)\24+\25-\26/\2\61\2\63\2\65\2\67\279\2\5\2\3\4\f\4\2"+
		"\13\13\"\"\4\2((>>\4\2$$>>\4\2))>>\5\2\13\f\17\17\"\"\5\2\62;CHch\3\2"+
		"\62;\4\2/\60aa\5\2\u00b9\u00b9\u0302\u0371\u2041\u2042\n\2<<C\\c|\u2072"+
		"\u2191\u2c02\u2ff1\u3003\ud801\uf902\ufdd1\ufdf2\uffff\2\u011b\2\5\3\2"+
		"\2\2\2\7\3\2\2\2\2\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2\2\2\2\17\3\2\2\2\2\21"+
		"\3\2\2\2\2\23\3\2\2\2\2\25\3\2\2\2\2\27\3\2\2\2\3\31\3\2\2\2\3\33\3\2"+
		"\2\2\3\35\3\2\2\2\3\37\3\2\2\2\3!\3\2\2\2\3#\3\2\2\2\3%\3\2\2\2\3\'\3"+
		"\2\2\2\3)\3\2\2\2\3+\3\2\2\2\3-\3\2\2\2\4\67\3\2\2\2\49\3\2\2\2\5;\3\2"+
		"\2\2\7J\3\2\2\2\t^\3\2\2\2\13k\3\2\2\2\r\u0084\3\2\2\2\17\u008b\3\2\2"+
		"\2\21\u008f\3\2\2\2\23\u0093\3\2\2\2\25\u009d\3\2\2\2\27\u00a6\3\2\2\2"+
		"\31\u00aa\3\2\2\2\33\u00ae\3\2\2\2\35\u00b3\3\2\2\2\37\u00b8\3\2\2\2!"+
		"\u00ba\3\2\2\2#\u00cc\3\2\2\2%\u00dd\3\2\2\2\'\u00df\3\2\2\2)\u00ea\3"+
		"\2\2\2+\u00ec\3\2\2\2-\u00f3\3\2\2\2/\u00f7\3\2\2\2\61\u00f9\3\2\2\2\63"+
		"\u00ff\3\2\2\2\65\u0102\3\2\2\2\67\u0104\3\2\2\29\u0109\3\2\2\2;<\7>\2"+
		"\2<=\7#\2\2=>\7/\2\2>?\7/\2\2?C\3\2\2\2@B\13\2\2\2A@\3\2\2\2BE\3\2\2\2"+
		"CD\3\2\2\2CA\3\2\2\2DF\3\2\2\2EC\3\2\2\2FG\7/\2\2GH\7/\2\2HI\7@\2\2I\6"+
		"\3\2\2\2JK\7>\2\2KL\7#\2\2LM\7]\2\2MN\7E\2\2NO\7F\2\2OP\7C\2\2PQ\7V\2"+
		"\2QR\7C\2\2RS\7]\2\2SW\3\2\2\2TV\13\2\2\2UT\3\2\2\2VY\3\2\2\2WX\3\2\2"+
		"\2WU\3\2\2\2XZ\3\2\2\2YW\3\2\2\2Z[\7_\2\2[\\\7_\2\2\\]\7@\2\2]\b\3\2\2"+
		"\2^_\7>\2\2_`\7#\2\2`d\3\2\2\2ac\13\2\2\2ba\3\2\2\2cf\3\2\2\2de\3\2\2"+
		"\2db\3\2\2\2eg\3\2\2\2fd\3\2\2\2gh\7@\2\2hi\3\2\2\2ij\b\4\2\2j\n\3\2\2"+
		"\2kl\7(\2\2lm\5+\25\2mn\7=\2\2n\f\3\2\2\2op\7(\2\2pq\7%\2\2qs\3\2\2\2"+
		"rt\5\61\30\2sr\3\2\2\2tu\3\2\2\2us\3\2\2\2uv\3\2\2\2vw\3\2\2\2wx\7=\2"+
		"\2x\u0085\3\2\2\2yz\7(\2\2z{\7%\2\2{|\7z\2\2|~\3\2\2\2}\177\5/\27\2~}"+
		"\3\2\2\2\177\u0080\3\2\2\2\u0080~\3\2\2\2\u0080\u0081\3\2\2\2\u0081\u0082"+
		"\3\2\2\2\u0082\u0083\7=\2\2\u0083\u0085\3\2\2\2\u0084o\3\2\2\2\u0084y"+
		"\3\2\2\2\u0085\16\3\2\2\2\u0086\u008c\t\2\2\2\u0087\u0089\7\17\2\2\u0088"+
		"\u0087\3\2\2\2\u0088\u0089\3\2\2\2\u0089\u008a\3\2\2\2\u008a\u008c\7\f"+
		"\2\2\u008b\u0086\3\2\2\2\u008b\u0088\3\2\2\2\u008c\u008d\3\2\2\2\u008d"+
		"\u008b\3\2\2\2\u008d\u008e\3\2\2\2\u008e\20\3\2\2\2\u008f\u0090\7>\2\2"+
		"\u0090\u0091\3\2\2\2\u0091\u0092\b\b\3\2\u0092\22\3\2\2\2\u0093\u0094"+
		"\7>\2\2\u0094\u0095\7A\2\2\u0095\u0096\7z\2\2\u0096\u0097\7o\2\2\u0097"+
		"\u0098\7n\2\2\u0098\u0099\3\2\2\2\u0099\u009a\5-\26\2\u009a\u009b\3\2"+
		"\2\2\u009b\u009c\b\t\3\2\u009c\24\3\2\2\2\u009d\u009e\7>\2\2\u009e\u009f"+
		"\7A\2\2\u009f\u00a0\3\2\2\2\u00a0\u00a1\5+\25\2\u00a1\u00a2\3\2\2\2\u00a2"+
		"\u00a3\b\n\4\2\u00a3\u00a4\b\n\5\2\u00a4\26\3\2\2\2\u00a5\u00a7\n\3\2"+
		"\2\u00a6\u00a5\3\2\2\2\u00a7\u00a8\3\2\2\2\u00a8\u00a6\3\2\2\2\u00a8\u00a9"+
		"\3\2\2\2\u00a9\30\3\2\2\2\u00aa\u00ab\7@\2\2\u00ab\u00ac\3\2\2\2\u00ac"+
		"\u00ad\b\f\6\2\u00ad\32\3\2\2\2\u00ae\u00af\7A\2\2\u00af\u00b0\7@\2\2"+
		"\u00b0\u00b1\3\2\2\2\u00b1\u00b2\b\r\6\2\u00b2\34\3\2\2\2\u00b3\u00b4"+
		"\7\61\2\2\u00b4\u00b5\7@\2\2\u00b5\u00b6\3\2\2\2\u00b6\u00b7\b\16\6\2"+
		"\u00b7\36\3\2\2\2\u00b8\u00b9\7\61\2\2\u00b9 \3\2\2\2\u00ba\u00bb\7?\2"+
		"\2\u00bb\"\3\2\2\2\u00bc\u00c0\7$\2\2\u00bd\u00bf\n\4\2\2\u00be\u00bd"+
		"\3\2\2\2\u00bf\u00c2\3\2\2\2\u00c0\u00be\3\2\2\2\u00c0\u00c1\3\2\2\2\u00c1"+
		"\u00c3\3\2\2\2\u00c2\u00c0\3\2\2\2\u00c3\u00cd\7$\2\2\u00c4\u00c8\7)\2"+
		"\2\u00c5\u00c7\n\5\2\2\u00c6\u00c5\3\2\2\2\u00c7\u00ca\3\2\2\2\u00c8\u00c6"+
		"\3\2\2\2\u00c8\u00c9\3\2\2\2\u00c9\u00cb\3\2\2\2\u00ca\u00c8\3\2\2\2\u00cb"+
		"\u00cd\7)\2\2\u00cc\u00bc\3\2\2\2\u00cc\u00c4\3\2\2\2\u00cd$\3\2\2\2\u00ce"+
		"\u00cf\7o\2\2\u00cf\u00d0\7u\2\2\u00d0\u00d1\7w\2\2\u00d1\u00de\7d\2\2"+
		"\u00d2\u00d3\7o\2\2\u00d3\u00d4\7u\2\2\u00d4\u00d5\7w\2\2\u00d5\u00de"+
		"\7r\2\2\u00d6\u00d7\7o\2\2\u00d7\u00d8\7u\2\2\u00d8\u00d9\7w\2\2\u00d9"+
		"\u00da\7d\2\2\u00da\u00db\7u\2\2\u00db\u00dc\7w\2\2\u00dc\u00de\7r\2\2"+
		"\u00dd\u00ce\3\2\2\2\u00dd\u00d2\3\2\2\2\u00dd\u00d6\3\2\2\2\u00de&\3"+
		"\2\2\2\u00df\u00e0\7o\2\2\u00e0\u00e1\7t\2\2\u00e1\u00e2\7q\2\2\u00e2"+
		"\u00e3\7y\2\2\u00e3(\3\2\2\2\u00e4\u00e5\7o\2\2\u00e5\u00eb\7p\2\2\u00e6"+
		"\u00e7\7o\2\2\u00e7\u00eb\7k\2\2\u00e8\u00e9\7o\2\2\u00e9\u00eb\7q\2\2"+
		"\u00ea\u00e4\3\2\2\2\u00ea\u00e6\3\2\2\2\u00ea\u00e8\3\2\2\2\u00eb*\3"+
		"\2\2\2\u00ec\u00f0\5\65\32\2\u00ed\u00ef\5\63\31\2\u00ee\u00ed\3\2\2\2"+
		"\u00ef\u00f2\3\2\2\2\u00f0\u00ee\3\2\2\2\u00f0\u00f1\3\2\2\2\u00f1,\3"+
		"\2\2\2\u00f2\u00f0\3\2\2\2\u00f3\u00f4\t\6\2\2\u00f4\u00f5\3\2\2\2\u00f5"+
		"\u00f6\b\26\2\2\u00f6.\3\2\2\2\u00f7\u00f8\t\7\2\2\u00f8\60\3\2\2\2\u00f9"+
		"\u00fa\t\b\2\2\u00fa\62\3\2\2\2\u00fb\u0100\5\65\32\2\u00fc\u0100\t\t"+
		"\2\2\u00fd\u0100\5\61\30\2\u00fe\u0100\t\n\2\2\u00ff\u00fb\3\2\2\2\u00ff"+
		"\u00fc\3\2\2\2\u00ff\u00fd\3\2\2\2\u00ff\u00fe\3\2\2\2\u0100\64\3\2\2"+
		"\2\u0101\u0103\t\13\2\2\u0102\u0101\3\2\2\2\u0103\66\3\2\2\2\u0104\u0105"+
		"\7A\2\2\u0105\u0106\7@\2\2\u0106\u0107\3\2\2\2\u0107\u0108\b\33\6\2\u0108"+
		"8\3\2\2\2\u0109\u010a\13\2\2\2\u010a\u010b\3\2\2\2\u010b\u010c\b\34\4"+
		"\2\u010c:\3\2\2\2\27\2\3\4CWdu\u0080\u0084\u0088\u008b\u008d\u00a8\u00c0"+
		"\u00c8\u00cc\u00dd\u00ea\u00f0\u00ff\u0102\7\b\2\2\7\3\2\5\2\2\7\4\2\6"+
		"\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}