// Generated from xmlParser.g4 by ANTLR 4.7.1
 package xml; 
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class xmlParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.7.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		COMMENT=1, CDATA=2, DTD=3, EntityRef=4, CharRef=5, SEA_WS=6, OPEN=7, XMLDeclOpen=8, 
		TEXT=9, CLOSE=10, SPECIAL_CLOSE=11, SLASH_CLOSE=12, SLASH=13, EQUALS=14, 
		STRING=15, LAY=16, ROW=17, TOK=18, Name=19, S=20, PI=21;
	public static final int
		RULE_document = 0, RULE_prolog = 1, RULE_content = 2, RULE_layment = 3, 
		RULE_rowment = 4, RULE_tokment = 5, RULE_element = 6, RULE_reference = 7, 
		RULE_attribute = 8, RULE_justWS = 9, RULE_chardata = 10, RULE_misc = 11;
	public static final String[] ruleNames = {
		"document", "prolog", "content", "layment", "rowment", "tokment", "element", 
		"reference", "attribute", "justWS", "chardata", "misc"
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

	@Override
	public String getGrammarFileName() { return "xmlParser.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public xmlParser(TokenStream input) {
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
			if ( listener instanceof xmlParserListener ) ((xmlParserListener)listener).enterDocument(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof xmlParserListener ) ((xmlParserListener)listener).exitDocument(this);
		}
	}

	public final DocumentContext document() throws RecognitionException {
		DocumentContext _localctx = new DocumentContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_document);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(25);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==XMLDeclOpen) {
				{
				setState(24);
				prolog();
				}
			}

			setState(30);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << COMMENT) | (1L << SEA_WS) | (1L << PI))) != 0)) {
				{
				{
				setState(27);
				misc();
				}
				}
				setState(32);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(33);
			element();
			setState(37);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << COMMENT) | (1L << SEA_WS) | (1L << PI))) != 0)) {
				{
				{
				setState(34);
				misc();
				}
				}
				setState(39);
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
		public TerminalNode XMLDeclOpen() { return getToken(xmlParser.XMLDeclOpen, 0); }
		public TerminalNode SPECIAL_CLOSE() { return getToken(xmlParser.SPECIAL_CLOSE, 0); }
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
			if ( listener instanceof xmlParserListener ) ((xmlParserListener)listener).enterProlog(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof xmlParserListener ) ((xmlParserListener)listener).exitProlog(this);
		}
	}

	public final PrologContext prolog() throws RecognitionException {
		PrologContext _localctx = new PrologContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_prolog);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(40);
			match(XMLDeclOpen);
			setState(44);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==Name) {
				{
				{
				setState(41);
				attribute();
				}
				}
				setState(46);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(47);
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
		public List<LaymentContext> layment() {
			return getRuleContexts(LaymentContext.class);
		}
		public LaymentContext layment(int i) {
			return getRuleContext(LaymentContext.class,i);
		}
		public List<RowmentContext> rowment() {
			return getRuleContexts(RowmentContext.class);
		}
		public RowmentContext rowment(int i) {
			return getRuleContext(RowmentContext.class,i);
		}
		public List<TokmentContext> tokment() {
			return getRuleContexts(TokmentContext.class);
		}
		public TokmentContext tokment(int i) {
			return getRuleContext(TokmentContext.class,i);
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
		public List<TerminalNode> CDATA() { return getTokens(xmlParser.CDATA); }
		public TerminalNode CDATA(int i) {
			return getToken(xmlParser.CDATA, i);
		}
		public List<TerminalNode> PI() { return getTokens(xmlParser.PI); }
		public TerminalNode PI(int i) {
			return getToken(xmlParser.PI, i);
		}
		public List<TerminalNode> COMMENT() { return getTokens(xmlParser.COMMENT); }
		public TerminalNode COMMENT(int i) {
			return getToken(xmlParser.COMMENT, i);
		}
		public ContentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_content; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof xmlParserListener ) ((xmlParserListener)listener).enterContent(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof xmlParserListener ) ((xmlParserListener)listener).exitContent(this);
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
			setState(50);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==SEA_WS || _la==TEXT) {
				{
				setState(49);
				chardata();
				}
			}

			setState(67);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,7,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(60);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,5,_ctx) ) {
					case 1:
						{
						setState(52);
						layment();
						}
						break;
					case 2:
						{
						setState(53);
						rowment();
						}
						break;
					case 3:
						{
						setState(54);
						tokment();
						}
						break;
					case 4:
						{
						setState(55);
						element();
						}
						break;
					case 5:
						{
						setState(56);
						reference();
						}
						break;
					case 6:
						{
						setState(57);
						match(CDATA);
						}
						break;
					case 7:
						{
						setState(58);
						match(PI);
						}
						break;
					case 8:
						{
						setState(59);
						match(COMMENT);
						}
						break;
					}
					setState(63);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==SEA_WS || _la==TEXT) {
						{
						setState(62);
						chardata();
						}
					}

					}
					} 
				}
				setState(69);
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

	public static class LaymentContext extends ParserRuleContext {
		public List<TerminalNode> LAY() { return getTokens(xmlParser.LAY); }
		public TerminalNode LAY(int i) {
			return getToken(xmlParser.LAY, i);
		}
		public ContentContext content() {
			return getRuleContext(ContentContext.class,0);
		}
		public List<AttributeContext> attribute() {
			return getRuleContexts(AttributeContext.class);
		}
		public AttributeContext attribute(int i) {
			return getRuleContext(AttributeContext.class,i);
		}
		public LaymentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_layment; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof xmlParserListener ) ((xmlParserListener)listener).enterLayment(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof xmlParserListener ) ((xmlParserListener)listener).exitLayment(this);
		}
	}

	public final LaymentContext layment() throws RecognitionException {
		LaymentContext _localctx = new LaymentContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_layment);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(70);
			match(OPEN);
			setState(71);
			match(LAY);
			setState(75);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==Name) {
				{
				{
				setState(72);
				attribute();
				}
				}
				setState(77);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(78);
			match(CLOSE);
			setState(79);
			content();
			setState(80);
			match(OPEN);
			setState(81);
			match(SLASH);
			setState(82);
			match(LAY);
			setState(83);
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

	public static class RowmentContext extends ParserRuleContext {
		public List<TerminalNode> ROW() { return getTokens(xmlParser.ROW); }
		public TerminalNode ROW(int i) {
			return getToken(xmlParser.ROW, i);
		}
		public ContentContext content() {
			return getRuleContext(ContentContext.class,0);
		}
		public List<AttributeContext> attribute() {
			return getRuleContexts(AttributeContext.class);
		}
		public AttributeContext attribute(int i) {
			return getRuleContext(AttributeContext.class,i);
		}
		public RowmentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_rowment; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof xmlParserListener ) ((xmlParserListener)listener).enterRowment(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof xmlParserListener ) ((xmlParserListener)listener).exitRowment(this);
		}
	}

	public final RowmentContext rowment() throws RecognitionException {
		RowmentContext _localctx = new RowmentContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_rowment);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(85);
			match(OPEN);
			setState(86);
			match(ROW);
			setState(90);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==Name) {
				{
				{
				setState(87);
				attribute();
				}
				}
				setState(92);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(93);
			match(CLOSE);
			setState(94);
			content();
			setState(95);
			match(OPEN);
			setState(96);
			match(SLASH);
			setState(97);
			match(ROW);
			setState(98);
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

	public static class TokmentContext extends ParserRuleContext {
		public List<TerminalNode> TOK() { return getTokens(xmlParser.TOK); }
		public TerminalNode TOK(int i) {
			return getToken(xmlParser.TOK, i);
		}
		public ContentContext content() {
			return getRuleContext(ContentContext.class,0);
		}
		public List<AttributeContext> attribute() {
			return getRuleContexts(AttributeContext.class);
		}
		public AttributeContext attribute(int i) {
			return getRuleContext(AttributeContext.class,i);
		}
		public TokmentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_tokment; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof xmlParserListener ) ((xmlParserListener)listener).enterTokment(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof xmlParserListener ) ((xmlParserListener)listener).exitTokment(this);
		}
	}

	public final TokmentContext tokment() throws RecognitionException {
		TokmentContext _localctx = new TokmentContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_tokment);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(100);
			match(OPEN);
			setState(101);
			match(TOK);
			setState(105);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==Name) {
				{
				{
				setState(102);
				attribute();
				}
				}
				setState(107);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(108);
			match(CLOSE);
			setState(109);
			content();
			setState(110);
			match(OPEN);
			setState(111);
			match(SLASH);
			setState(112);
			match(TOK);
			setState(113);
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
		public List<TerminalNode> Name() { return getTokens(xmlParser.Name); }
		public TerminalNode Name(int i) {
			return getToken(xmlParser.Name, i);
		}
		public ContentContext content() {
			return getRuleContext(ContentContext.class,0);
		}
		public List<AttributeContext> attribute() {
			return getRuleContexts(AttributeContext.class);
		}
		public AttributeContext attribute(int i) {
			return getRuleContext(AttributeContext.class,i);
		}
		public ElementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_element; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof xmlParserListener ) ((xmlParserListener)listener).enterElement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof xmlParserListener ) ((xmlParserListener)listener).exitElement(this);
		}
	}

	public final ElementContext element() throws RecognitionException {
		ElementContext _localctx = new ElementContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_element);
		int _la;
		try {
			setState(139);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,13,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(115);
				match(OPEN);
				setState(116);
				match(Name);
				setState(120);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==Name) {
					{
					{
					setState(117);
					attribute();
					}
					}
					setState(122);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(123);
				match(CLOSE);
				setState(124);
				content();
				setState(125);
				match(OPEN);
				setState(126);
				match(SLASH);
				setState(127);
				match(Name);
				setState(128);
				match(CLOSE);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(130);
				match(OPEN);
				setState(131);
				match(Name);
				setState(135);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==Name) {
					{
					{
					setState(132);
					attribute();
					}
					}
					setState(137);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(138);
				match(SLASH_CLOSE);
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
		public TerminalNode EntityRef() { return getToken(xmlParser.EntityRef, 0); }
		public TerminalNode CharRef() { return getToken(xmlParser.CharRef, 0); }
		public ReferenceContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_reference; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof xmlParserListener ) ((xmlParserListener)listener).enterReference(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof xmlParserListener ) ((xmlParserListener)listener).exitReference(this);
		}
	}

	public final ReferenceContext reference() throws RecognitionException {
		ReferenceContext _localctx = new ReferenceContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_reference);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(141);
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
		public TerminalNode Name() { return getToken(xmlParser.Name, 0); }
		public TerminalNode STRING() { return getToken(xmlParser.STRING, 0); }
		public AttributeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_attribute; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof xmlParserListener ) ((xmlParserListener)listener).enterAttribute(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof xmlParserListener ) ((xmlParserListener)listener).exitAttribute(this);
		}
	}

	public final AttributeContext attribute() throws RecognitionException {
		AttributeContext _localctx = new AttributeContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_attribute);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(143);
			match(Name);
			setState(144);
			match(EQUALS);
			setState(145);
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
		public TerminalNode SEA_WS() { return getToken(xmlParser.SEA_WS, 0); }
		public JustWSContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_justWS; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof xmlParserListener ) ((xmlParserListener)listener).enterJustWS(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof xmlParserListener ) ((xmlParserListener)listener).exitJustWS(this);
		}
	}

	public final JustWSContext justWS() throws RecognitionException {
		JustWSContext _localctx = new JustWSContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_justWS);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(147);
			match(SEA_WS);
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
		public TerminalNode TEXT() { return getToken(xmlParser.TEXT, 0); }
		public JustWSContext justWS() {
			return getRuleContext(JustWSContext.class,0);
		}
		public ChardataContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_chardata; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof xmlParserListener ) ((xmlParserListener)listener).enterChardata(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof xmlParserListener ) ((xmlParserListener)listener).exitChardata(this);
		}
	}

	public final ChardataContext chardata() throws RecognitionException {
		ChardataContext _localctx = new ChardataContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_chardata);
		try {
			setState(151);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case TEXT:
				enterOuterAlt(_localctx, 1);
				{
				setState(149);
				match(TEXT);
				}
				break;
			case SEA_WS:
				enterOuterAlt(_localctx, 2);
				{
				setState(150);
				justWS();
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

	public static class MiscContext extends ParserRuleContext {
		public TerminalNode COMMENT() { return getToken(xmlParser.COMMENT, 0); }
		public TerminalNode PI() { return getToken(xmlParser.PI, 0); }
		public TerminalNode SEA_WS() { return getToken(xmlParser.SEA_WS, 0); }
		public MiscContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_misc; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof xmlParserListener ) ((xmlParserListener)listener).enterMisc(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof xmlParserListener ) ((xmlParserListener)listener).exitMisc(this);
		}
	}

	public final MiscContext misc() throws RecognitionException {
		MiscContext _localctx = new MiscContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_misc);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(153);
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

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3\27\u009e\4\2\t\2"+
		"\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\3\2\5\2\34\n\2\3\2\7\2\37\n\2\f\2\16\2\"\13\2\3"+
		"\2\3\2\7\2&\n\2\f\2\16\2)\13\2\3\3\3\3\7\3-\n\3\f\3\16\3\60\13\3\3\3\3"+
		"\3\3\4\5\4\65\n\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\5\4?\n\4\3\4\5\4B\n"+
		"\4\7\4D\n\4\f\4\16\4G\13\4\3\5\3\5\3\5\7\5L\n\5\f\5\16\5O\13\5\3\5\3\5"+
		"\3\5\3\5\3\5\3\5\3\5\3\6\3\6\3\6\7\6[\n\6\f\6\16\6^\13\6\3\6\3\6\3\6\3"+
		"\6\3\6\3\6\3\6\3\7\3\7\3\7\7\7j\n\7\f\7\16\7m\13\7\3\7\3\7\3\7\3\7\3\7"+
		"\3\7\3\7\3\b\3\b\3\b\7\by\n\b\f\b\16\b|\13\b\3\b\3\b\3\b\3\b\3\b\3\b\3"+
		"\b\3\b\3\b\3\b\7\b\u0088\n\b\f\b\16\b\u008b\13\b\3\b\5\b\u008e\n\b\3\t"+
		"\3\t\3\n\3\n\3\n\3\n\3\13\3\13\3\f\3\f\5\f\u009a\n\f\3\r\3\r\3\r\2\2\16"+
		"\2\4\6\b\n\f\16\20\22\24\26\30\2\4\3\2\6\7\5\2\3\3\b\b\27\27\2\u00a6\2"+
		"\33\3\2\2\2\4*\3\2\2\2\6\64\3\2\2\2\bH\3\2\2\2\nW\3\2\2\2\ff\3\2\2\2\16"+
		"\u008d\3\2\2\2\20\u008f\3\2\2\2\22\u0091\3\2\2\2\24\u0095\3\2\2\2\26\u0099"+
		"\3\2\2\2\30\u009b\3\2\2\2\32\34\5\4\3\2\33\32\3\2\2\2\33\34\3\2\2\2\34"+
		" \3\2\2\2\35\37\5\30\r\2\36\35\3\2\2\2\37\"\3\2\2\2 \36\3\2\2\2 !\3\2"+
		"\2\2!#\3\2\2\2\" \3\2\2\2#\'\5\16\b\2$&\5\30\r\2%$\3\2\2\2&)\3\2\2\2\'"+
		"%\3\2\2\2\'(\3\2\2\2(\3\3\2\2\2)\'\3\2\2\2*.\7\n\2\2+-\5\22\n\2,+\3\2"+
		"\2\2-\60\3\2\2\2.,\3\2\2\2./\3\2\2\2/\61\3\2\2\2\60.\3\2\2\2\61\62\7\r"+
		"\2\2\62\5\3\2\2\2\63\65\5\26\f\2\64\63\3\2\2\2\64\65\3\2\2\2\65E\3\2\2"+
		"\2\66?\5\b\5\2\67?\5\n\6\28?\5\f\7\29?\5\16\b\2:?\5\20\t\2;?\7\4\2\2<"+
		"?\7\27\2\2=?\7\3\2\2>\66\3\2\2\2>\67\3\2\2\2>8\3\2\2\2>9\3\2\2\2>:\3\2"+
		"\2\2>;\3\2\2\2><\3\2\2\2>=\3\2\2\2?A\3\2\2\2@B\5\26\f\2A@\3\2\2\2AB\3"+
		"\2\2\2BD\3\2\2\2C>\3\2\2\2DG\3\2\2\2EC\3\2\2\2EF\3\2\2\2F\7\3\2\2\2GE"+
		"\3\2\2\2HI\7\t\2\2IM\7\22\2\2JL\5\22\n\2KJ\3\2\2\2LO\3\2\2\2MK\3\2\2\2"+
		"MN\3\2\2\2NP\3\2\2\2OM\3\2\2\2PQ\7\f\2\2QR\5\6\4\2RS\7\t\2\2ST\7\17\2"+
		"\2TU\7\22\2\2UV\7\f\2\2V\t\3\2\2\2WX\7\t\2\2X\\\7\23\2\2Y[\5\22\n\2ZY"+
		"\3\2\2\2[^\3\2\2\2\\Z\3\2\2\2\\]\3\2\2\2]_\3\2\2\2^\\\3\2\2\2_`\7\f\2"+
		"\2`a\5\6\4\2ab\7\t\2\2bc\7\17\2\2cd\7\23\2\2de\7\f\2\2e\13\3\2\2\2fg\7"+
		"\t\2\2gk\7\24\2\2hj\5\22\n\2ih\3\2\2\2jm\3\2\2\2ki\3\2\2\2kl\3\2\2\2l"+
		"n\3\2\2\2mk\3\2\2\2no\7\f\2\2op\5\6\4\2pq\7\t\2\2qr\7\17\2\2rs\7\24\2"+
		"\2st\7\f\2\2t\r\3\2\2\2uv\7\t\2\2vz\7\25\2\2wy\5\22\n\2xw\3\2\2\2y|\3"+
		"\2\2\2zx\3\2\2\2z{\3\2\2\2{}\3\2\2\2|z\3\2\2\2}~\7\f\2\2~\177\5\6\4\2"+
		"\177\u0080\7\t\2\2\u0080\u0081\7\17\2\2\u0081\u0082\7\25\2\2\u0082\u0083"+
		"\7\f\2\2\u0083\u008e\3\2\2\2\u0084\u0085\7\t\2\2\u0085\u0089\7\25\2\2"+
		"\u0086\u0088\5\22\n\2\u0087\u0086\3\2\2\2\u0088\u008b\3\2\2\2\u0089\u0087"+
		"\3\2\2\2\u0089\u008a\3\2\2\2\u008a\u008c\3\2\2\2\u008b\u0089\3\2\2\2\u008c"+
		"\u008e\7\16\2\2\u008du\3\2\2\2\u008d\u0084\3\2\2\2\u008e\17\3\2\2\2\u008f"+
		"\u0090\t\2\2\2\u0090\21\3\2\2\2\u0091\u0092\7\25\2\2\u0092\u0093\7\20"+
		"\2\2\u0093\u0094\7\21\2\2\u0094\23\3\2\2\2\u0095\u0096\7\b\2\2\u0096\25"+
		"\3\2\2\2\u0097\u009a\7\13\2\2\u0098\u009a\5\24\13\2\u0099\u0097\3\2\2"+
		"\2\u0099\u0098\3\2\2\2\u009a\27\3\2\2\2\u009b\u009c\t\3\2\2\u009c\31\3"+
		"\2\2\2\21\33 \'.\64>AEM\\kz\u0089\u008d\u0099";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}