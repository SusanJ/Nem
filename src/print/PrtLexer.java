// Generated from PrtLexer.g4 by ANTLR 4.7.1
 package print; 
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class PrtLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.7.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		COMMENT=1, CDATA=2, DTD=3, EntityRef=4, CharRef=5, SEA_WS=6, APLUS=7, 
		OPEN=8, XMLDeclOpen=9, TEXT=10, CLOSE=11, SPECIAL_CLOSE=12, SLASH_CLOSE=13, 
		SLASH=14, EQUALS=15, STRING=16, TFI=17, Name=18, S=19, PI=20, PRINT_DONE=21, 
		MY_OPEN=22, THE=23, LETTERA=24, LETTERC=25, LETTERB=26, XSEA_WS=27;
	public static final int
		INSIDE=1, PROC_INSTR=2, PRINT=3;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE", "INSIDE", "PROC_INSTR", "PRINT"
	};

	public static final String[] ruleNames = {
		"COMMENT", "CDATA", "DTD", "EntityRef", "CharRef", "WHITE_SPACE", "SEA_WS", 
		"APLUS", "LESS_THAN", "OPEN", "XMLDeclOpen", "SPECIAL_OPEN", "TEXT", "CLOSE", 
		"SPECIAL_CLOSE", "SLASH_CLOSE", "SLASH", "EQUALS", "STRING", "TFI", "Name", 
		"S", "HEXDIGIT", "DIGIT", "NameChar", "NameStartChar", "PI", "IGNORE", 
		"PRINT_DONE", "MY_OPEN", "THE", "LETTERA", "LETTERC", "LETTERB", "XSEA_WS"
	};

	private static final String[] _LITERAL_NAMES = {
		null, null, null, null, null, null, null, "'<aplus>'", null, null, null, 
		"'>'", null, "'/>'", "'/'", "'='", null, null, null, null, null, "'</aplus>'", 
		"'<'", null, "'a'", "'c'", "'b'"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, "COMMENT", "CDATA", "DTD", "EntityRef", "CharRef", "SEA_WS", "APLUS", 
		"OPEN", "XMLDeclOpen", "TEXT", "CLOSE", "SPECIAL_CLOSE", "SLASH_CLOSE", 
		"SLASH", "EQUALS", "STRING", "TFI", "Name", "S", "PI", "PRINT_DONE", "MY_OPEN", 
		"THE", "LETTERA", "LETTERC", "LETTERB", "XSEA_WS"
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


	public PrtLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "PrtLexer.g4"; }

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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2\35\u012f\b\1\b\1"+
		"\b\1\b\1\4\2\t\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t"+
		"\t\4\n\t\n\4\13\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21"+
		"\t\21\4\22\t\22\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30"+
		"\t\30\4\31\t\31\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37"+
		"\t\37\4 \t \4!\t!\4\"\t\"\4#\t#\4$\t$\3\2\3\2\3\2\3\2\3\2\3\2\7\2S\n\2"+
		"\f\2\16\2V\13\2\3\2\3\2\3\2\3\2\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3"+
		"\3\3\3\7\3g\n\3\f\3\16\3j\13\3\3\3\3\3\3\3\3\3\3\4\3\4\3\4\3\4\7\4t\n"+
		"\4\f\4\16\4w\13\4\3\4\3\4\3\4\3\4\3\5\3\5\3\5\3\5\3\6\3\6\3\6\3\6\6\6"+
		"\u0085\n\6\r\6\16\6\u0086\3\6\3\6\3\6\3\6\3\6\3\6\3\6\6\6\u0090\n\6\r"+
		"\6\16\6\u0091\3\6\3\6\5\6\u0096\n\6\3\7\3\7\5\7\u009a\n\7\3\7\6\7\u009d"+
		"\n\7\r\7\16\7\u009e\3\b\3\b\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3"+
		"\n\3\n\3\13\3\13\3\13\3\13\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\r"+
		"\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\16\6\16\u00c6\n\16\r\16\16\16\u00c7\3\17"+
		"\3\17\3\17\3\17\3\20\3\20\3\20\3\20\3\20\3\21\3\21\3\21\3\21\3\21\3\22"+
		"\3\22\3\23\3\23\3\24\3\24\7\24\u00de\n\24\f\24\16\24\u00e1\13\24\3\24"+
		"\3\24\3\24\7\24\u00e6\n\24\f\24\16\24\u00e9\13\24\3\24\5\24\u00ec\n\24"+
		"\3\25\3\25\3\26\3\26\7\26\u00f2\n\26\f\26\16\26\u00f5\13\26\3\27\3\27"+
		"\3\27\3\27\3\30\3\30\3\31\3\31\3\32\3\32\3\32\3\32\5\32\u0103\n\32\3\33"+
		"\5\33\u0106\n\33\3\34\3\34\3\34\3\34\3\34\3\35\3\35\3\35\3\35\3\36\3\36"+
		"\3\36\3\36\3\36\3\36\3\36\3\36\3\36\3\36\3\36\3\37\3\37\3\37\3\37\3 \3"+
		" \3 \3 \3 \3 \5 \u0126\n \3!\3!\3\"\3\"\3#\3#\3$\3$\5Thu\2%\6\3\b\4\n"+
		"\5\f\6\16\7\20\2\22\b\24\t\26\2\30\n\32\13\34\2\36\f \r\"\16$\17&\20("+
		"\21*\22,\23.\24\60\25\62\2\64\2\66\28\2:\26<\2>\27@\30B\31D\32F\33H\34"+
		"J\35\6\2\3\4\5\r\4\2\13\13\"\"\4\2((>>\4\2$$>>\4\2))>>\6\2ddkkuuww\5\2"+
		"\13\f\17\17\"\"\5\2\62;CHch\3\2\62;\4\2/\60aa\5\2\u00b9\u00b9\u0302\u0371"+
		"\u2041\u2042\n\2<<C\\c|\u2072\u2191\u2c02\u2ff1\u3003\ud801\uf902\ufdd1"+
		"\ufdf2\uffff\2\u0137\2\6\3\2\2\2\2\b\3\2\2\2\2\n\3\2\2\2\2\f\3\2\2\2\2"+
		"\16\3\2\2\2\2\22\3\2\2\2\2\24\3\2\2\2\2\30\3\2\2\2\2\32\3\2\2\2\2\34\3"+
		"\2\2\2\2\36\3\2\2\2\3 \3\2\2\2\3\"\3\2\2\2\3$\3\2\2\2\3&\3\2\2\2\3(\3"+
		"\2\2\2\3*\3\2\2\2\3,\3\2\2\2\3.\3\2\2\2\3\60\3\2\2\2\4:\3\2\2\2\4<\3\2"+
		"\2\2\5>\3\2\2\2\5@\3\2\2\2\5B\3\2\2\2\5D\3\2\2\2\5F\3\2\2\2\5H\3\2\2\2"+
		"\5J\3\2\2\2\6L\3\2\2\2\b[\3\2\2\2\no\3\2\2\2\f|\3\2\2\2\16\u0095\3\2\2"+
		"\2\20\u009c\3\2\2\2\22\u00a0\3\2\2\2\24\u00a2\3\2\2\2\26\u00ac\3\2\2\2"+
		"\30\u00ae\3\2\2\2\32\u00b2\3\2\2\2\34\u00bc\3\2\2\2\36\u00c5\3\2\2\2 "+
		"\u00c9\3\2\2\2\"\u00cd\3\2\2\2$\u00d2\3\2\2\2&\u00d7\3\2\2\2(\u00d9\3"+
		"\2\2\2*\u00eb\3\2\2\2,\u00ed\3\2\2\2.\u00ef\3\2\2\2\60\u00f6\3\2\2\2\62"+
		"\u00fa\3\2\2\2\64\u00fc\3\2\2\2\66\u0102\3\2\2\28\u0105\3\2\2\2:\u0107"+
		"\3\2\2\2<\u010c\3\2\2\2>\u0110\3\2\2\2@\u011b\3\2\2\2B\u0125\3\2\2\2D"+
		"\u0127\3\2\2\2F\u0129\3\2\2\2H\u012b\3\2\2\2J\u012d\3\2\2\2LM\7>\2\2M"+
		"N\7#\2\2NO\7/\2\2OP\7/\2\2PT\3\2\2\2QS\13\2\2\2RQ\3\2\2\2SV\3\2\2\2TU"+
		"\3\2\2\2TR\3\2\2\2UW\3\2\2\2VT\3\2\2\2WX\7/\2\2XY\7/\2\2YZ\7@\2\2Z\7\3"+
		"\2\2\2[\\\7>\2\2\\]\7#\2\2]^\7]\2\2^_\7E\2\2_`\7F\2\2`a\7C\2\2ab\7V\2"+
		"\2bc\7C\2\2cd\7]\2\2dh\3\2\2\2eg\13\2\2\2fe\3\2\2\2gj\3\2\2\2hi\3\2\2"+
		"\2hf\3\2\2\2ik\3\2\2\2jh\3\2\2\2kl\7_\2\2lm\7_\2\2mn\7@\2\2n\t\3\2\2\2"+
		"op\7>\2\2pq\7#\2\2qu\3\2\2\2rt\13\2\2\2sr\3\2\2\2tw\3\2\2\2uv\3\2\2\2"+
		"us\3\2\2\2vx\3\2\2\2wu\3\2\2\2xy\7@\2\2yz\3\2\2\2z{\b\4\2\2{\13\3\2\2"+
		"\2|}\7(\2\2}~\5.\26\2~\177\7=\2\2\177\r\3\2\2\2\u0080\u0081\7(\2\2\u0081"+
		"\u0082\7%\2\2\u0082\u0084\3\2\2\2\u0083\u0085\5\64\31\2\u0084\u0083\3"+
		"\2\2\2\u0085\u0086\3\2\2\2\u0086\u0084\3\2\2\2\u0086\u0087\3\2\2\2\u0087"+
		"\u0088\3\2\2\2\u0088\u0089\7=\2\2\u0089\u0096\3\2\2\2\u008a\u008b\7(\2"+
		"\2\u008b\u008c\7%\2\2\u008c\u008d\7z\2\2\u008d\u008f\3\2\2\2\u008e\u0090"+
		"\5\62\30\2\u008f\u008e\3\2\2\2\u0090\u0091\3\2\2\2\u0091\u008f\3\2\2\2"+
		"\u0091\u0092\3\2\2\2\u0092\u0093\3\2\2\2\u0093\u0094\7=\2\2\u0094\u0096"+
		"\3\2\2\2\u0095\u0080\3\2\2\2\u0095\u008a\3\2\2\2\u0096\17\3\2\2\2\u0097"+
		"\u009d\t\2\2\2\u0098\u009a\7\17\2\2\u0099\u0098\3\2\2\2\u0099\u009a\3"+
		"\2\2\2\u009a\u009b\3\2\2\2\u009b\u009d\7\f\2\2\u009c\u0097\3\2\2\2\u009c"+
		"\u0099\3\2\2\2\u009d\u009e\3\2\2\2\u009e\u009c\3\2\2\2\u009e\u009f\3\2"+
		"\2\2\u009f\21\3\2\2\2\u00a0\u00a1\5\20\7\2\u00a1\23\3\2\2\2\u00a2\u00a3"+
		"\7>\2\2\u00a3\u00a4\7c\2\2\u00a4\u00a5\7r\2\2\u00a5\u00a6\7n\2\2\u00a6"+
		"\u00a7\7w\2\2\u00a7\u00a8\7u\2\2\u00a8\u00a9\7@\2\2\u00a9\u00aa\3\2\2"+
		"\2\u00aa\u00ab\b\t\3\2\u00ab\25\3\2\2\2\u00ac\u00ad\7>\2\2\u00ad\27\3"+
		"\2\2\2\u00ae\u00af\5\26\n\2\u00af\u00b0\3\2\2\2\u00b0\u00b1\b\13\4\2\u00b1"+
		"\31\3\2\2\2\u00b2\u00b3\7>\2\2\u00b3\u00b4\7A\2\2\u00b4\u00b5\7z\2\2\u00b5"+
		"\u00b6\7o\2\2\u00b6\u00b7\7n\2\2\u00b7\u00b8\3\2\2\2\u00b8\u00b9\5\60"+
		"\27\2\u00b9\u00ba\3\2\2\2\u00ba\u00bb\b\f\4\2\u00bb\33\3\2\2\2\u00bc\u00bd"+
		"\7>\2\2\u00bd\u00be\7A\2\2\u00be\u00bf\3\2\2\2\u00bf\u00c0\5.\26\2\u00c0"+
		"\u00c1\3\2\2\2\u00c1\u00c2\b\r\5\2\u00c2\u00c3\b\r\6\2\u00c3\35\3\2\2"+
		"\2\u00c4\u00c6\n\3\2\2\u00c5\u00c4\3\2\2\2\u00c6\u00c7\3\2\2\2\u00c7\u00c5"+
		"\3\2\2\2\u00c7\u00c8\3\2\2\2\u00c8\37\3\2\2\2\u00c9\u00ca\7@\2\2\u00ca"+
		"\u00cb\3\2\2\2\u00cb\u00cc\b\17\7\2\u00cc!\3\2\2\2\u00cd\u00ce\7A\2\2"+
		"\u00ce\u00cf\7@\2\2\u00cf\u00d0\3\2\2\2\u00d0\u00d1\b\20\7\2\u00d1#\3"+
		"\2\2\2\u00d2\u00d3\7\61\2\2\u00d3\u00d4\7@\2\2\u00d4\u00d5\3\2\2\2\u00d5"+
		"\u00d6\b\21\7\2\u00d6%\3\2\2\2\u00d7\u00d8\7\61\2\2\u00d8\'\3\2\2\2\u00d9"+
		"\u00da\7?\2\2\u00da)\3\2\2\2\u00db\u00df\7$\2\2\u00dc\u00de\n\4\2\2\u00dd"+
		"\u00dc\3\2\2\2\u00de\u00e1\3\2\2\2\u00df\u00dd\3\2\2\2\u00df\u00e0\3\2"+
		"\2\2\u00e0\u00e2\3\2\2\2\u00e1\u00df\3\2\2\2\u00e2\u00ec\7$\2\2\u00e3"+
		"\u00e7\7)\2\2\u00e4\u00e6\n\5\2\2\u00e5\u00e4\3\2\2\2\u00e6\u00e9\3\2"+
		"\2\2\u00e7\u00e5\3\2\2\2\u00e7\u00e8\3\2\2\2\u00e8\u00ea\3\2\2\2\u00e9"+
		"\u00e7\3\2\2\2\u00ea\u00ec\7)\2\2\u00eb\u00db\3\2\2\2\u00eb\u00e3\3\2"+
		"\2\2\u00ec+\3\2\2\2\u00ed\u00ee\t\6\2\2\u00ee-\3\2\2\2\u00ef\u00f3\58"+
		"\33\2\u00f0\u00f2\5\66\32\2\u00f1\u00f0\3\2\2\2\u00f2\u00f5\3\2\2\2\u00f3"+
		"\u00f1\3\2\2\2\u00f3\u00f4\3\2\2\2\u00f4/\3\2\2\2\u00f5\u00f3\3\2\2\2"+
		"\u00f6\u00f7\t\7\2\2\u00f7\u00f8\3\2\2\2\u00f8\u00f9\b\27\2\2\u00f9\61"+
		"\3\2\2\2\u00fa\u00fb\t\b\2\2\u00fb\63\3\2\2\2\u00fc\u00fd\t\t\2\2\u00fd"+
		"\65\3\2\2\2\u00fe\u0103\58\33\2\u00ff\u0103\t\n\2\2\u0100\u0103\5\64\31"+
		"\2\u0101\u0103\t\13\2\2\u0102\u00fe\3\2\2\2\u0102\u00ff\3\2\2\2\u0102"+
		"\u0100\3\2\2\2\u0102\u0101\3\2\2\2\u0103\67\3\2\2\2\u0104\u0106\t\f\2"+
		"\2\u0105\u0104\3\2\2\2\u01069\3\2\2\2\u0107\u0108\7A\2\2\u0108\u0109\7"+
		"@\2\2\u0109\u010a\3\2\2\2\u010a\u010b\b\34\7\2\u010b;\3\2\2\2\u010c\u010d"+
		"\13\2\2\2\u010d\u010e\3\2\2\2\u010e\u010f\b\35\5\2\u010f=\3\2\2\2\u0110"+
		"\u0111\7>\2\2\u0111\u0112\7\61\2\2\u0112\u0113\7c\2\2\u0113\u0114\7r\2"+
		"\2\u0114\u0115\7n\2\2\u0115\u0116\7w\2\2\u0116\u0117\7u\2\2\u0117\u0118"+
		"\7@\2\2\u0118\u0119\3\2\2\2\u0119\u011a\b\36\7\2\u011a?\3\2\2\2\u011b"+
		"\u011c\7>\2\2\u011c\u011d\3\2\2\2\u011d\u011e\b\37\4\2\u011eA\3\2\2\2"+
		"\u011f\u0120\7v\2\2\u0120\u0121\7j\2\2\u0121\u0126\7g\2\2\u0122\u0123"+
		"\7V\2\2\u0123\u0124\7j\2\2\u0124\u0126\7g\2\2\u0125\u011f\3\2\2\2\u0125"+
		"\u0122\3\2\2\2\u0126C\3\2\2\2\u0127\u0128\7c\2\2\u0128E\3\2\2\2\u0129"+
		"\u012a\7e\2\2\u012aG\3\2\2\2\u012b\u012c\7d\2\2\u012cI\3\2\2\2\u012d\u012e"+
		"\5\20\7\2\u012eK\3\2\2\2\27\2\3\4\5Thu\u0086\u0091\u0095\u0099\u009c\u009e"+
		"\u00c7\u00df\u00e7\u00eb\u00f3\u0102\u0105\u0125\b\b\2\2\7\5\2\7\3\2\5"+
		"\2\2\7\4\2\6\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}