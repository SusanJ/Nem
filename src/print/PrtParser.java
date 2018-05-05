// Generated from PrtParser.g4 by ANTLR 4.7.1
 package print; 
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class PrtParser extends Parser {
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
		RULE_document = 0, RULE_prolog = 1, RULE_content = 2, RULE_tfiment = 3, 
		RULE_element = 4, RULE_reference = 5, RULE_attribute = 6, RULE_justWS = 7, 
		RULE_chardata = 8, RULE_misc = 9, RULE_prtstuff = 10;
	public static final String[] ruleNames = {
		"document", "prolog", "content", "tfiment", "element", "reference", "attribute", 
		"justWS", "chardata", "misc", "prtstuff"
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

	@Override
	public String getGrammarFileName() { return "PrtParser.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public PrtParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}
	public static class DocumentContext extends ParserRuleContext {
		public ElementContext element() {
			return getRuleContext(ElementContext.class,0);
		}
		public PrologContext prolog() {
			return getRuleContext(PrologContext.class,0);
		}
		public List<MiscContext> misc() {
			return getRuleContexts(MiscContext.class);
		}
		public MiscContext misc(int i) {
			return getRuleContext(MiscContext.class,i);
		}
		public DocumentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_document; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PrtParserListener ) ((PrtParserListener)listener).enterDocument(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PrtParserListener ) ((PrtParserListener)listener).exitDocument(this);
		}
	}

	public final DocumentContext document() throws RecognitionException {
		DocumentContext _localctx = new DocumentContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_document);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(23);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==XMLDeclOpen) {
				{
				setState(22);
				prolog();
				}
			}

			setState(28);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << COMMENT) | (1L << SEA_WS) | (1L << PI))) != 0)) {
				{
				{
				setState(25);
				misc();
				}
				}
				setState(30);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(31);
			element();
			setState(35);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << COMMENT) | (1L << SEA_WS) | (1L << PI))) != 0)) {
				{
				{
				setState(32);
				misc();
				}
				}
				setState(37);
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

	public static class PrologContext extends ParserRuleContext {
		public TerminalNode XMLDeclOpen() { return getToken(PrtParser.XMLDeclOpen, 0); }
		public TerminalNode SPECIAL_CLOSE() { return getToken(PrtParser.SPECIAL_CLOSE, 0); }
		public List<AttributeContext> attribute() {
			return getRuleContexts(AttributeContext.class);
		}
		public AttributeContext attribute(int i) {
			return getRuleContext(AttributeContext.class,i);
		}
		public PrologContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_prolog; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PrtParserListener ) ((PrtParserListener)listener).enterProlog(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PrtParserListener ) ((PrtParserListener)listener).exitProlog(this);
		}
	}

	public final PrologContext prolog() throws RecognitionException {
		PrologContext _localctx = new PrologContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_prolog);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(38);
			match(XMLDeclOpen);
			setState(42);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==Name) {
				{
				{
				setState(39);
				attribute();
				}
				}
				setState(44);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(45);
			match(SPECIAL_CLOSE);
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

	public static class ContentContext extends ParserRuleContext {
		public List<ChardataContext> chardata() {
			return getRuleContexts(ChardataContext.class);
		}
		public ChardataContext chardata(int i) {
			return getRuleContext(ChardataContext.class,i);
		}
		public List<TfimentContext> tfiment() {
			return getRuleContexts(TfimentContext.class);
		}
		public TfimentContext tfiment(int i) {
			return getRuleContext(TfimentContext.class,i);
		}
		public List<ElementContext> element() {
			return getRuleContexts(ElementContext.class);
		}
		public ElementContext element(int i) {
			return getRuleContext(ElementContext.class,i);
		}
		public List<ReferenceContext> reference() {
			return getRuleContexts(ReferenceContext.class);
		}
		public ReferenceContext reference(int i) {
			return getRuleContext(ReferenceContext.class,i);
		}
		public List<TerminalNode> CDATA() { return getTokens(PrtParser.CDATA); }
		public TerminalNode CDATA(int i) {
			return getToken(PrtParser.CDATA, i);
		}
		public List<TerminalNode> PI() { return getTokens(PrtParser.PI); }
		public TerminalNode PI(int i) {
			return getToken(PrtParser.PI, i);
		}
		public List<TerminalNode> COMMENT() { return getTokens(PrtParser.COMMENT); }
		public TerminalNode COMMENT(int i) {
			return getToken(PrtParser.COMMENT, i);
		}
		public ContentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_content; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PrtParserListener ) ((PrtParserListener)listener).enterContent(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PrtParserListener ) ((PrtParserListener)listener).exitContent(this);
		}
	}

	public final ContentContext content() throws RecognitionException {
		ContentContext _localctx = new ContentContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_content);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(48);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << SEA_WS) | (1L << TEXT) | (1L << THE) | (1L << LETTERA) | (1L << LETTERC) | (1L << LETTERB) | (1L << XSEA_WS))) != 0)) {
				{
				setState(47);
				chardata();
				}
			}

			setState(63);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,7,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(56);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,5,_ctx) ) {
					case 1:
						{
						setState(50);
						tfiment();
						}
						break;
					case 2:
						{
						setState(51);
						element();
						}
						break;
					case 3:
						{
						setState(52);
						reference();
						}
						break;
					case 4:
						{
						setState(53);
						match(CDATA);
						}
						break;
					case 5:
						{
						setState(54);
						match(PI);
						}
						break;
					case 6:
						{
						setState(55);
						match(COMMENT);
						}
						break;
					}
					setState(59);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << SEA_WS) | (1L << TEXT) | (1L << THE) | (1L << LETTERA) | (1L << LETTERC) | (1L << LETTERB) | (1L << XSEA_WS))) != 0)) {
						{
						setState(58);
						chardata();
						}
					}

					}
					} 
				}
				setState(65);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,7,_ctx);
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

	public static class TfimentContext extends ParserRuleContext {
		public List<TerminalNode> TFI() { return getTokens(PrtParser.TFI); }
		public TerminalNode TFI(int i) {
			return getToken(PrtParser.TFI, i);
		}
		public ContentContext content() {
			return getRuleContext(ContentContext.class,0);
		}
		public TerminalNode SLASH() { return getToken(PrtParser.SLASH, 0); }
		public List<TerminalNode> OPEN() { return getTokens(PrtParser.OPEN); }
		public TerminalNode OPEN(int i) {
			return getToken(PrtParser.OPEN, i);
		}
		public List<TerminalNode> MY_OPEN() { return getTokens(PrtParser.MY_OPEN); }
		public TerminalNode MY_OPEN(int i) {
			return getToken(PrtParser.MY_OPEN, i);
		}
		public List<AttributeContext> attribute() {
			return getRuleContexts(AttributeContext.class);
		}
		public AttributeContext attribute(int i) {
			return getRuleContext(AttributeContext.class,i);
		}
		public TfimentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_tfiment; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PrtParserListener ) ((PrtParserListener)listener).enterTfiment(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PrtParserListener ) ((PrtParserListener)listener).exitTfiment(this);
		}
	}

	public final TfimentContext tfiment() throws RecognitionException {
		TfimentContext _localctx = new TfimentContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_tfiment);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(66);
			_la = _input.LA(1);
			if ( !(_la==OPEN || _la==MY_OPEN) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(67);
			match(TFI);
			setState(71);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==Name) {
				{
				{
				setState(68);
				attribute();
				}
				}
				setState(73);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(74);
			match(CLOSE);
			setState(75);
			content();
			setState(76);
			_la = _input.LA(1);
			if ( !(_la==OPEN || _la==MY_OPEN) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(77);
			match(SLASH);
			setState(78);
			match(TFI);
			setState(79);
			match(CLOSE);
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

	public static class ElementContext extends ParserRuleContext {
		public List<TerminalNode> Name() { return getTokens(PrtParser.Name); }
		public TerminalNode Name(int i) {
			return getToken(PrtParser.Name, i);
		}
		public ContentContext content() {
			return getRuleContext(ContentContext.class,0);
		}
		public TerminalNode SLASH() { return getToken(PrtParser.SLASH, 0); }
		public List<TerminalNode> OPEN() { return getTokens(PrtParser.OPEN); }
		public TerminalNode OPEN(int i) {
			return getToken(PrtParser.OPEN, i);
		}
		public List<TerminalNode> MY_OPEN() { return getTokens(PrtParser.MY_OPEN); }
		public TerminalNode MY_OPEN(int i) {
			return getToken(PrtParser.MY_OPEN, i);
		}
		public List<AttributeContext> attribute() {
			return getRuleContexts(AttributeContext.class);
		}
		public AttributeContext attribute(int i) {
			return getRuleContext(AttributeContext.class,i);
		}
		public TerminalNode APLUS() { return getToken(PrtParser.APLUS, 0); }
		public TerminalNode PRINT_DONE() { return getToken(PrtParser.PRINT_DONE, 0); }
		public ElementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_element; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PrtParserListener ) ((PrtParserListener)listener).enterElement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PrtParserListener ) ((PrtParserListener)listener).exitElement(this);
		}
	}

	public final ElementContext element() throws RecognitionException {
		ElementContext _localctx = new ElementContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_element);
		int _la;
		try {
			setState(109);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,11,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(81);
				_la = _input.LA(1);
				if ( !(_la==OPEN || _la==MY_OPEN) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(82);
				match(Name);
				setState(86);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==Name) {
					{
					{
					setState(83);
					attribute();
					}
					}
					setState(88);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(89);
				match(CLOSE);
				setState(90);
				content();
				setState(91);
				_la = _input.LA(1);
				if ( !(_la==OPEN || _la==MY_OPEN) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(92);
				match(SLASH);
				setState(93);
				match(Name);
				setState(94);
				match(CLOSE);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(96);
				_la = _input.LA(1);
				if ( !(_la==OPEN || _la==MY_OPEN) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(97);
				match(Name);
				setState(101);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==Name) {
					{
					{
					setState(98);
					attribute();
					}
					}
					setState(103);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(104);
				match(SLASH_CLOSE);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(105);
				match(APLUS);
				setState(106);
				content();
				setState(107);
				match(PRINT_DONE);
				}
				break;
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

	public static class ReferenceContext extends ParserRuleContext {
		public TerminalNode EntityRef() { return getToken(PrtParser.EntityRef, 0); }
		public TerminalNode CharRef() { return getToken(PrtParser.CharRef, 0); }
		public ReferenceContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_reference; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PrtParserListener ) ((PrtParserListener)listener).enterReference(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PrtParserListener ) ((PrtParserListener)listener).exitReference(this);
		}
	}

	public final ReferenceContext reference() throws RecognitionException {
		ReferenceContext _localctx = new ReferenceContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_reference);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(111);
			_la = _input.LA(1);
			if ( !(_la==EntityRef || _la==CharRef) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
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

	public static class AttributeContext extends ParserRuleContext {
		public TerminalNode Name() { return getToken(PrtParser.Name, 0); }
		public TerminalNode STRING() { return getToken(PrtParser.STRING, 0); }
		public AttributeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_attribute; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PrtParserListener ) ((PrtParserListener)listener).enterAttribute(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PrtParserListener ) ((PrtParserListener)listener).exitAttribute(this);
		}
	}

	public final AttributeContext attribute() throws RecognitionException {
		AttributeContext _localctx = new AttributeContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_attribute);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(113);
			match(Name);
			setState(114);
			match(EQUALS);
			setState(115);
			match(STRING);
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

	public static class JustWSContext extends ParserRuleContext {
		public TerminalNode SEA_WS() { return getToken(PrtParser.SEA_WS, 0); }
		public TerminalNode XSEA_WS() { return getToken(PrtParser.XSEA_WS, 0); }
		public JustWSContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_justWS; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PrtParserListener ) ((PrtParserListener)listener).enterJustWS(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PrtParserListener ) ((PrtParserListener)listener).exitJustWS(this);
		}
	}

	public final JustWSContext justWS() throws RecognitionException {
		JustWSContext _localctx = new JustWSContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_justWS);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(117);
			_la = _input.LA(1);
			if ( !(_la==SEA_WS || _la==XSEA_WS) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
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

	public static class ChardataContext extends ParserRuleContext {
		public TerminalNode TEXT() { return getToken(PrtParser.TEXT, 0); }
		public JustWSContext justWS() {
			return getRuleContext(JustWSContext.class,0);
		}
		public PrtstuffContext prtstuff() {
			return getRuleContext(PrtstuffContext.class,0);
		}
		public ChardataContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_chardata; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PrtParserListener ) ((PrtParserListener)listener).enterChardata(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PrtParserListener ) ((PrtParserListener)listener).exitChardata(this);
		}
	}

	public final ChardataContext chardata() throws RecognitionException {
		ChardataContext _localctx = new ChardataContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_chardata);
		try {
			setState(122);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,12,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(119);
				match(TEXT);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(120);
				justWS();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(121);
				prtstuff();
				}
				break;
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

	public static class MiscContext extends ParserRuleContext {
		public TerminalNode COMMENT() { return getToken(PrtParser.COMMENT, 0); }
		public TerminalNode PI() { return getToken(PrtParser.PI, 0); }
		public TerminalNode SEA_WS() { return getToken(PrtParser.SEA_WS, 0); }
		public MiscContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_misc; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PrtParserListener ) ((PrtParserListener)listener).enterMisc(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PrtParserListener ) ((PrtParserListener)listener).exitMisc(this);
		}
	}

	public final MiscContext misc() throws RecognitionException {
		MiscContext _localctx = new MiscContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_misc);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(124);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << COMMENT) | (1L << SEA_WS) | (1L << PI))) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
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

	public static class PrtstuffContext extends ParserRuleContext {
		public List<TerminalNode> THE() { return getTokens(PrtParser.THE); }
		public TerminalNode THE(int i) {
			return getToken(PrtParser.THE, i);
		}
		public List<TerminalNode> LETTERA() { return getTokens(PrtParser.LETTERA); }
		public TerminalNode LETTERA(int i) {
			return getToken(PrtParser.LETTERA, i);
		}
		public List<TerminalNode> LETTERB() { return getTokens(PrtParser.LETTERB); }
		public TerminalNode LETTERB(int i) {
			return getToken(PrtParser.LETTERB, i);
		}
		public List<TerminalNode> LETTERC() { return getTokens(PrtParser.LETTERC); }
		public TerminalNode LETTERC(int i) {
			return getToken(PrtParser.LETTERC, i);
		}
		public List<TerminalNode> XSEA_WS() { return getTokens(PrtParser.XSEA_WS); }
		public TerminalNode XSEA_WS(int i) {
			return getToken(PrtParser.XSEA_WS, i);
		}
		public PrtstuffContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_prtstuff; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PrtParserListener ) ((PrtParserListener)listener).enterPrtstuff(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PrtParserListener ) ((PrtParserListener)listener).exitPrtstuff(this);
		}
	}

	public final PrtstuffContext prtstuff() throws RecognitionException {
		PrtstuffContext _localctx = new PrtstuffContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_prtstuff);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(127); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(126);
				_la = _input.LA(1);
				if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << THE) | (1L << LETTERA) | (1L << LETTERC) | (1L << LETTERB) | (1L << XSEA_WS))) != 0)) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				}
				}
				setState(129); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << THE) | (1L << LETTERA) | (1L << LETTERC) | (1L << LETTERB) | (1L << XSEA_WS))) != 0) );
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3\35\u0086\4\2\t\2"+
		"\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\3\2\5\2\32\n\2\3\2\7\2\35\n\2\f\2\16\2 \13\2\3\2\3\2\7\2"+
		"$\n\2\f\2\16\2\'\13\2\3\3\3\3\7\3+\n\3\f\3\16\3.\13\3\3\3\3\3\3\4\5\4"+
		"\63\n\4\3\4\3\4\3\4\3\4\3\4\3\4\5\4;\n\4\3\4\5\4>\n\4\7\4@\n\4\f\4\16"+
		"\4C\13\4\3\5\3\5\3\5\7\5H\n\5\f\5\16\5K\13\5\3\5\3\5\3\5\3\5\3\5\3\5\3"+
		"\5\3\6\3\6\3\6\7\6W\n\6\f\6\16\6Z\13\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6"+
		"\3\6\3\6\7\6f\n\6\f\6\16\6i\13\6\3\6\3\6\3\6\3\6\3\6\5\6p\n\6\3\7\3\7"+
		"\3\b\3\b\3\b\3\b\3\t\3\t\3\n\3\n\3\n\5\n}\n\n\3\13\3\13\3\f\6\f\u0082"+
		"\n\f\r\f\16\f\u0083\3\f\2\2\r\2\4\6\b\n\f\16\20\22\24\26\2\7\4\2\n\n\30"+
		"\30\3\2\6\7\4\2\b\b\35\35\5\2\3\3\b\b\26\26\3\2\31\35\2\u008e\2\31\3\2"+
		"\2\2\4(\3\2\2\2\6\62\3\2\2\2\bD\3\2\2\2\no\3\2\2\2\fq\3\2\2\2\16s\3\2"+
		"\2\2\20w\3\2\2\2\22|\3\2\2\2\24~\3\2\2\2\26\u0081\3\2\2\2\30\32\5\4\3"+
		"\2\31\30\3\2\2\2\31\32\3\2\2\2\32\36\3\2\2\2\33\35\5\24\13\2\34\33\3\2"+
		"\2\2\35 \3\2\2\2\36\34\3\2\2\2\36\37\3\2\2\2\37!\3\2\2\2 \36\3\2\2\2!"+
		"%\5\n\6\2\"$\5\24\13\2#\"\3\2\2\2$\'\3\2\2\2%#\3\2\2\2%&\3\2\2\2&\3\3"+
		"\2\2\2\'%\3\2\2\2(,\7\13\2\2)+\5\16\b\2*)\3\2\2\2+.\3\2\2\2,*\3\2\2\2"+
		",-\3\2\2\2-/\3\2\2\2.,\3\2\2\2/\60\7\16\2\2\60\5\3\2\2\2\61\63\5\22\n"+
		"\2\62\61\3\2\2\2\62\63\3\2\2\2\63A\3\2\2\2\64;\5\b\5\2\65;\5\n\6\2\66"+
		";\5\f\7\2\67;\7\4\2\28;\7\26\2\29;\7\3\2\2:\64\3\2\2\2:\65\3\2\2\2:\66"+
		"\3\2\2\2:\67\3\2\2\2:8\3\2\2\2:9\3\2\2\2;=\3\2\2\2<>\5\22\n\2=<\3\2\2"+
		"\2=>\3\2\2\2>@\3\2\2\2?:\3\2\2\2@C\3\2\2\2A?\3\2\2\2AB\3\2\2\2B\7\3\2"+
		"\2\2CA\3\2\2\2DE\t\2\2\2EI\7\23\2\2FH\5\16\b\2GF\3\2\2\2HK\3\2\2\2IG\3"+
		"\2\2\2IJ\3\2\2\2JL\3\2\2\2KI\3\2\2\2LM\7\r\2\2MN\5\6\4\2NO\t\2\2\2OP\7"+
		"\20\2\2PQ\7\23\2\2QR\7\r\2\2R\t\3\2\2\2ST\t\2\2\2TX\7\24\2\2UW\5\16\b"+
		"\2VU\3\2\2\2WZ\3\2\2\2XV\3\2\2\2XY\3\2\2\2Y[\3\2\2\2ZX\3\2\2\2[\\\7\r"+
		"\2\2\\]\5\6\4\2]^\t\2\2\2^_\7\20\2\2_`\7\24\2\2`a\7\r\2\2ap\3\2\2\2bc"+
		"\t\2\2\2cg\7\24\2\2df\5\16\b\2ed\3\2\2\2fi\3\2\2\2ge\3\2\2\2gh\3\2\2\2"+
		"hj\3\2\2\2ig\3\2\2\2jp\7\17\2\2kl\7\t\2\2lm\5\6\4\2mn\7\27\2\2np\3\2\2"+
		"\2oS\3\2\2\2ob\3\2\2\2ok\3\2\2\2p\13\3\2\2\2qr\t\3\2\2r\r\3\2\2\2st\7"+
		"\24\2\2tu\7\21\2\2uv\7\22\2\2v\17\3\2\2\2wx\t\4\2\2x\21\3\2\2\2y}\7\f"+
		"\2\2z}\5\20\t\2{}\5\26\f\2|y\3\2\2\2|z\3\2\2\2|{\3\2\2\2}\23\3\2\2\2~"+
		"\177\t\5\2\2\177\25\3\2\2\2\u0080\u0082\t\6\2\2\u0081\u0080\3\2\2\2\u0082"+
		"\u0083\3\2\2\2\u0083\u0081\3\2\2\2\u0083\u0084\3\2\2\2\u0084\27\3\2\2"+
		"\2\20\31\36%,\62:=AIXgo|\u0083";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}