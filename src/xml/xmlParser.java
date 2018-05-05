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
		TEXT=9, APLUSstag=10, CLOSE=11, SPECIAL_CLOSE=12, SLASH_CLOSE=13, SLASH=14, 
		EQUALS=15, STRING=16, LAY=17, ROW=18, TOK=19, Name=20, S=21, PI=22, UEB_DONE=23, 
		THE=24, A=25, C=26, T=27, XSEA_WS=28, MY_OPEN=29, END_APLUS=30, ZERO=31, 
		ONE=32, TWO=33, THREE=34, FOUR=35, FIVE=36, SIX=37, SEVEN=38, EIGHT=39, 
		NINE=40, OFENCE=41, CFENCE=42, NEU=43, PERIODorDEC=44, SEMICOLON=45, PUNC=46, 
		SPEC=47, FSLASH=48, BACK_TICK=49, SEP=50, WEIRD=51, WEIRD_TC=52, WEIRD_UC=53, 
		LARGE=54, LARGE_TC=55, LARGE_UC=56, ILC45=57, ILC45_TC=58, ILC45_UC=59, 
		ILC456=60, ILC456_TC=61, ILC456_UC=62, ILC5=63, ILC5_TC=64, LETTERA=65, 
		LETTERB=66, LETTERC=67, LETTERD=68, LETTERE=69, LETTERF=70, LETTERG=71, 
		LETTERH=72, LETTERI=73, LETTERJ=74, LETTERK=75, LETTERL=76, LETTERM=77, 
		LETTERN=78, LETTERO=79, LETTERP=80, LETTERQ=81, LETTERR=82, LETTERS=83, 
		LETTERT=84, LETTERU=85, LETTERV=86, LETTERW=87, LETTERX=88, LETTERY=89, 
		LETTERZ=90, CAPS=91, BE_TC=92, IN=93, IN_TC=94, IN_UC=95, EN=96, EN_TC=97, 
		EN_UC=98, STRONG_GS=99, STRONG_GS_TC=100, STRONG_GS_UC=101, FLC=102, BEGCON_TC=103, 
		MIDCON=104, MIDCON_TC=105, MIDCON_UC=106, MDASH=107, NDASH=108, ODQUO=109, 
		CDQUO=110, OSQUO=111, CSQUO=112, SPACE=113, NEWLINE=114, APLUS=115;
	public static final int
		RULE_document = 0, RULE_prolog = 1, RULE_content = 2, RULE_layment = 3, 
		RULE_rowment = 4, RULE_tokment = 5, RULE_element = 6, RULE_reference = 7, 
		RULE_attribute = 8, RULE_justWS = 9, RULE_chardata = 10, RULE_misc = 11, 
		RULE_brlstuff = 12;
	public static final String[] ruleNames = {
		"document", "prolog", "content", "layment", "rowment", "tokment", "element", 
		"reference", "attribute", "justWS", "chardata", "misc", "brlstuff"
	};

	private static final String[] _LITERAL_NAMES = {
		null, null, null, null, null, null, null, null, null, null, "'<aplus>'", 
		"'>'", null, "'/>'", null, "'='", null, null, "'mrow'", null, null, null, 
		null, null, null, null, null, null, null, "'<'", null, "'0'", "'1'", "'2'", 
		"'3'", "'4'", "'5'", "'6'", "'7'", "'8'", "'9'", null, null, null, "'.'", 
		"';'", null, null, null, "'`'", null, null, null, null, null, null, null, 
		null, null, null, null, null, null, null, null, null, "'b'", null, "'d'", 
		"'e'", "'f'", "'g'", "'h'", "'i'", "'j'", "'k'", "'l'", "'m'", "'n'", 
		"'o'", "'p'", "'q'", "'r'", "'s'", null, "'u'", "'v'", "'w'", "'x'", "'y'", 
		"'z'", null, "'Be'", "'in'", "'In'", "'IN'", "'en'", "'En'", "'EN'", null, 
		null, null, null, null, null, null, null, "'\u2014'", "'\u2013'", "'\u201C'", 
		"'\u201D'", "'\u2018'", "'\u2019'"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, "COMMENT", "CDATA", "DTD", "EntityRef", "CharRef", "SEA_WS", "OPEN", 
		"XMLDeclOpen", "TEXT", "APLUSstag", "CLOSE", "SPECIAL_CLOSE", "SLASH_CLOSE", 
		"SLASH", "EQUALS", "STRING", "LAY", "ROW", "TOK", "Name", "S", "PI", "UEB_DONE", 
		"THE", "A", "C", "T", "XSEA_WS", "MY_OPEN", "END_APLUS", "ZERO", "ONE", 
		"TWO", "THREE", "FOUR", "FIVE", "SIX", "SEVEN", "EIGHT", "NINE", "OFENCE", 
		"CFENCE", "NEU", "PERIODorDEC", "SEMICOLON", "PUNC", "SPEC", "FSLASH", 
		"BACK_TICK", "SEP", "WEIRD", "WEIRD_TC", "WEIRD_UC", "LARGE", "LARGE_TC", 
		"LARGE_UC", "ILC45", "ILC45_TC", "ILC45_UC", "ILC456", "ILC456_TC", "ILC456_UC", 
		"ILC5", "ILC5_TC", "LETTERA", "LETTERB", "LETTERC", "LETTERD", "LETTERE", 
		"LETTERF", "LETTERG", "LETTERH", "LETTERI", "LETTERJ", "LETTERK", "LETTERL", 
		"LETTERM", "LETTERN", "LETTERO", "LETTERP", "LETTERQ", "LETTERR", "LETTERS", 
		"LETTERT", "LETTERU", "LETTERV", "LETTERW", "LETTERX", "LETTERY", "LETTERZ", 
		"CAPS", "BE_TC", "IN", "IN_TC", "IN_UC", "EN", "EN_TC", "EN_UC", "STRONG_GS", 
		"STRONG_GS_TC", "STRONG_GS_UC", "FLC", "BEGCON_TC", "MIDCON", "MIDCON_TC", 
		"MIDCON_UC", "MDASH", "NDASH", "ODQUO", "CDQUO", "OSQUO", "CSQUO", "SPACE", 
		"NEWLINE", "APLUS"
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
			setState(27);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==XMLDeclOpen) {
				{
				setState(26);
				prolog();
				}
			}

			setState(32);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << COMMENT) | (1L << SEA_WS) | (1L << PI))) != 0)) {
				{
				{
				setState(29);
				misc();
				}
				}
				setState(34);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(35);
			element();
			setState(39);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << COMMENT) | (1L << SEA_WS) | (1L << PI))) != 0)) {
				{
				{
				setState(36);
				misc();
				}
				}
				setState(41);
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
			setState(42);
			match(XMLDeclOpen);
			setState(46);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==Name) {
				{
				{
				setState(43);
				attribute();
				}
				}
				setState(48);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(49);
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
			setState(52);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << SEA_WS) | (1L << TEXT) | (1L << THE) | (1L << A) | (1L << C) | (1L << T) | (1L << XSEA_WS))) != 0)) {
				{
				setState(51);
				chardata();
				}
			}

			setState(69);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,7,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(62);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,5,_ctx) ) {
					case 1:
						{
						setState(54);
						layment();
						}
						break;
					case 2:
						{
						setState(55);
						rowment();
						}
						break;
					case 3:
						{
						setState(56);
						tokment();
						}
						break;
					case 4:
						{
						setState(57);
						element();
						}
						break;
					case 5:
						{
						setState(58);
						reference();
						}
						break;
					case 6:
						{
						setState(59);
						match(CDATA);
						}
						break;
					case 7:
						{
						setState(60);
						match(PI);
						}
						break;
					case 8:
						{
						setState(61);
						match(COMMENT);
						}
						break;
					}
					setState(65);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << SEA_WS) | (1L << TEXT) | (1L << THE) | (1L << A) | (1L << C) | (1L << T) | (1L << XSEA_WS))) != 0)) {
						{
						setState(64);
						chardata();
						}
					}

					}
					} 
				}
				setState(71);
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
		public List<TerminalNode> OPEN() { return getTokens(xmlParser.OPEN); }
		public TerminalNode OPEN(int i) {
			return getToken(xmlParser.OPEN, i);
		}
		public List<TerminalNode> LAY() { return getTokens(xmlParser.LAY); }
		public TerminalNode LAY(int i) {
			return getToken(xmlParser.LAY, i);
		}
		public ContentContext content() {
			return getRuleContext(ContentContext.class,0);
		}
		public TerminalNode SLASH() { return getToken(xmlParser.SLASH, 0); }
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
			setState(72);
			match(OPEN);
			setState(73);
			match(LAY);
			setState(77);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==Name) {
				{
				{
				setState(74);
				attribute();
				}
				}
				setState(79);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(80);
			match(CLOSE);
			setState(81);
			content();
			setState(82);
			match(OPEN);
			setState(83);
			match(SLASH);
			setState(84);
			match(LAY);
			setState(85);
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
		public List<TerminalNode> OPEN() { return getTokens(xmlParser.OPEN); }
		public TerminalNode OPEN(int i) {
			return getToken(xmlParser.OPEN, i);
		}
		public List<TerminalNode> ROW() { return getTokens(xmlParser.ROW); }
		public TerminalNode ROW(int i) {
			return getToken(xmlParser.ROW, i);
		}
		public ContentContext content() {
			return getRuleContext(ContentContext.class,0);
		}
		public TerminalNode SLASH() { return getToken(xmlParser.SLASH, 0); }
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
			setState(87);
			match(OPEN);
			setState(88);
			match(ROW);
			setState(92);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==Name) {
				{
				{
				setState(89);
				attribute();
				}
				}
				setState(94);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(95);
			match(CLOSE);
			setState(96);
			content();
			setState(97);
			match(OPEN);
			setState(98);
			match(SLASH);
			setState(99);
			match(ROW);
			setState(100);
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
		public List<TerminalNode> OPEN() { return getTokens(xmlParser.OPEN); }
		public TerminalNode OPEN(int i) {
			return getToken(xmlParser.OPEN, i);
		}
		public List<TerminalNode> TOK() { return getTokens(xmlParser.TOK); }
		public TerminalNode TOK(int i) {
			return getToken(xmlParser.TOK, i);
		}
		public ContentContext content() {
			return getRuleContext(ContentContext.class,0);
		}
		public TerminalNode SLASH() { return getToken(xmlParser.SLASH, 0); }
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
			setState(102);
			match(OPEN);
			setState(103);
			match(TOK);
			setState(107);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==Name) {
				{
				{
				setState(104);
				attribute();
				}
				}
				setState(109);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(110);
			match(CLOSE);
			setState(111);
			content();
			setState(112);
			match(OPEN);
			setState(113);
			match(SLASH);
			setState(114);
			match(TOK);
			setState(115);
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
		public TerminalNode SLASH() { return getToken(xmlParser.SLASH, 0); }
		public List<TerminalNode> OPEN() { return getTokens(xmlParser.OPEN); }
		public TerminalNode OPEN(int i) {
			return getToken(xmlParser.OPEN, i);
		}
		public List<TerminalNode> MY_OPEN() { return getTokens(xmlParser.MY_OPEN); }
		public TerminalNode MY_OPEN(int i) {
			return getToken(xmlParser.MY_OPEN, i);
		}
		public List<AttributeContext> attribute() {
			return getRuleContexts(AttributeContext.class);
		}
		public AttributeContext attribute(int i) {
			return getRuleContext(AttributeContext.class,i);
		}
		public TerminalNode APLUS() { return getToken(xmlParser.APLUS, 0); }
		public TerminalNode UEB_DONE() { return getToken(xmlParser.UEB_DONE, 0); }
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
			setState(145);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,13,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(117);
				_la = _input.LA(1);
				if ( !(_la==OPEN || _la==MY_OPEN) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(118);
				match(Name);
				setState(122);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==Name) {
					{
					{
					setState(119);
					attribute();
					}
					}
					setState(124);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(125);
				match(CLOSE);
				setState(126);
				content();
				setState(127);
				_la = _input.LA(1);
				if ( !(_la==OPEN || _la==MY_OPEN) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(128);
				match(SLASH);
				setState(129);
				match(Name);
				setState(130);
				match(CLOSE);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(132);
				_la = _input.LA(1);
				if ( !(_la==OPEN || _la==MY_OPEN) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(133);
				match(Name);
				setState(137);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==Name) {
					{
					{
					setState(134);
					attribute();
					}
					}
					setState(139);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(140);
				match(SLASH_CLOSE);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(141);
				match(APLUS);
				setState(142);
				content();
				setState(143);
				match(UEB_DONE);
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
			setState(147);
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
			setState(149);
			match(Name);
			setState(150);
			match(EQUALS);
			setState(151);
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
		public TerminalNode XSEA_WS() { return getToken(xmlParser.XSEA_WS, 0); }
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
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(153);
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
		public TerminalNode TEXT() { return getToken(xmlParser.TEXT, 0); }
		public JustWSContext justWS() {
			return getRuleContext(JustWSContext.class,0);
		}
		public BrlstuffContext brlstuff() {
			return getRuleContext(BrlstuffContext.class,0);
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
			setState(158);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,14,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(155);
				match(TEXT);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(156);
				justWS();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(157);
				brlstuff();
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
			setState(160);
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

	public static class BrlstuffContext extends ParserRuleContext {
		public List<TerminalNode> THE() { return getTokens(xmlParser.THE); }
		public TerminalNode THE(int i) {
			return getToken(xmlParser.THE, i);
		}
		public List<TerminalNode> XSEA_WS() { return getTokens(xmlParser.XSEA_WS); }
		public TerminalNode XSEA_WS(int i) {
			return getToken(xmlParser.XSEA_WS, i);
		}
		public List<TerminalNode> C() { return getTokens(xmlParser.C); }
		public TerminalNode C(int i) {
			return getToken(xmlParser.C, i);
		}
		public List<TerminalNode> A() { return getTokens(xmlParser.A); }
		public TerminalNode A(int i) {
			return getToken(xmlParser.A, i);
		}
		public List<TerminalNode> T() { return getTokens(xmlParser.T); }
		public TerminalNode T(int i) {
			return getToken(xmlParser.T, i);
		}
		public BrlstuffContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_brlstuff; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof xmlParserListener ) ((xmlParserListener)listener).enterBrlstuff(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof xmlParserListener ) ((xmlParserListener)listener).exitBrlstuff(this);
		}
	}

	public final BrlstuffContext brlstuff() throws RecognitionException {
		BrlstuffContext _localctx = new BrlstuffContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_brlstuff);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(163); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(162);
				_la = _input.LA(1);
				if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << THE) | (1L << A) | (1L << C) | (1L << T) | (1L << XSEA_WS))) != 0)) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				}
				}
				setState(165); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << THE) | (1L << A) | (1L << C) | (1L << T) | (1L << XSEA_WS))) != 0) );
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3u\u00aa\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\3\2\5\2\36\n\2\3\2\7\2!\n\2\f\2\16\2$\13"+
		"\2\3\2\3\2\7\2(\n\2\f\2\16\2+\13\2\3\3\3\3\7\3/\n\3\f\3\16\3\62\13\3\3"+
		"\3\3\3\3\4\5\4\67\n\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\5\4A\n\4\3\4\5\4"+
		"D\n\4\7\4F\n\4\f\4\16\4I\13\4\3\5\3\5\3\5\7\5N\n\5\f\5\16\5Q\13\5\3\5"+
		"\3\5\3\5\3\5\3\5\3\5\3\5\3\6\3\6\3\6\7\6]\n\6\f\6\16\6`\13\6\3\6\3\6\3"+
		"\6\3\6\3\6\3\6\3\6\3\7\3\7\3\7\7\7l\n\7\f\7\16\7o\13\7\3\7\3\7\3\7\3\7"+
		"\3\7\3\7\3\7\3\b\3\b\3\b\7\b{\n\b\f\b\16\b~\13\b\3\b\3\b\3\b\3\b\3\b\3"+
		"\b\3\b\3\b\3\b\3\b\7\b\u008a\n\b\f\b\16\b\u008d\13\b\3\b\3\b\3\b\3\b\3"+
		"\b\5\b\u0094\n\b\3\t\3\t\3\n\3\n\3\n\3\n\3\13\3\13\3\f\3\f\3\f\5\f\u00a1"+
		"\n\f\3\r\3\r\3\16\6\16\u00a6\n\16\r\16\16\16\u00a7\3\16\2\2\17\2\4\6\b"+
		"\n\f\16\20\22\24\26\30\32\2\7\4\2\t\t\37\37\3\2\6\7\4\2\b\b\36\36\5\2"+
		"\3\3\b\b\30\30\3\2\32\36\2\u00b4\2\35\3\2\2\2\4,\3\2\2\2\6\66\3\2\2\2"+
		"\bJ\3\2\2\2\nY\3\2\2\2\fh\3\2\2\2\16\u0093\3\2\2\2\20\u0095\3\2\2\2\22"+
		"\u0097\3\2\2\2\24\u009b\3\2\2\2\26\u00a0\3\2\2\2\30\u00a2\3\2\2\2\32\u00a5"+
		"\3\2\2\2\34\36\5\4\3\2\35\34\3\2\2\2\35\36\3\2\2\2\36\"\3\2\2\2\37!\5"+
		"\30\r\2 \37\3\2\2\2!$\3\2\2\2\" \3\2\2\2\"#\3\2\2\2#%\3\2\2\2$\"\3\2\2"+
		"\2%)\5\16\b\2&(\5\30\r\2\'&\3\2\2\2(+\3\2\2\2)\'\3\2\2\2)*\3\2\2\2*\3"+
		"\3\2\2\2+)\3\2\2\2,\60\7\n\2\2-/\5\22\n\2.-\3\2\2\2/\62\3\2\2\2\60.\3"+
		"\2\2\2\60\61\3\2\2\2\61\63\3\2\2\2\62\60\3\2\2\2\63\64\7\16\2\2\64\5\3"+
		"\2\2\2\65\67\5\26\f\2\66\65\3\2\2\2\66\67\3\2\2\2\67G\3\2\2\28A\5\b\5"+
		"\29A\5\n\6\2:A\5\f\7\2;A\5\16\b\2<A\5\20\t\2=A\7\4\2\2>A\7\30\2\2?A\7"+
		"\3\2\2@8\3\2\2\2@9\3\2\2\2@:\3\2\2\2@;\3\2\2\2@<\3\2\2\2@=\3\2\2\2@>\3"+
		"\2\2\2@?\3\2\2\2AC\3\2\2\2BD\5\26\f\2CB\3\2\2\2CD\3\2\2\2DF\3\2\2\2E@"+
		"\3\2\2\2FI\3\2\2\2GE\3\2\2\2GH\3\2\2\2H\7\3\2\2\2IG\3\2\2\2JK\7\t\2\2"+
		"KO\7\23\2\2LN\5\22\n\2ML\3\2\2\2NQ\3\2\2\2OM\3\2\2\2OP\3\2\2\2PR\3\2\2"+
		"\2QO\3\2\2\2RS\7\r\2\2ST\5\6\4\2TU\7\t\2\2UV\7\20\2\2VW\7\23\2\2WX\7\r"+
		"\2\2X\t\3\2\2\2YZ\7\t\2\2Z^\7\24\2\2[]\5\22\n\2\\[\3\2\2\2]`\3\2\2\2^"+
		"\\\3\2\2\2^_\3\2\2\2_a\3\2\2\2`^\3\2\2\2ab\7\r\2\2bc\5\6\4\2cd\7\t\2\2"+
		"de\7\20\2\2ef\7\24\2\2fg\7\r\2\2g\13\3\2\2\2hi\7\t\2\2im\7\25\2\2jl\5"+
		"\22\n\2kj\3\2\2\2lo\3\2\2\2mk\3\2\2\2mn\3\2\2\2np\3\2\2\2om\3\2\2\2pq"+
		"\7\r\2\2qr\5\6\4\2rs\7\t\2\2st\7\20\2\2tu\7\25\2\2uv\7\r\2\2v\r\3\2\2"+
		"\2wx\t\2\2\2x|\7\26\2\2y{\5\22\n\2zy\3\2\2\2{~\3\2\2\2|z\3\2\2\2|}\3\2"+
		"\2\2}\177\3\2\2\2~|\3\2\2\2\177\u0080\7\r\2\2\u0080\u0081\5\6\4\2\u0081"+
		"\u0082\t\2\2\2\u0082\u0083\7\20\2\2\u0083\u0084\7\26\2\2\u0084\u0085\7"+
		"\r\2\2\u0085\u0094\3\2\2\2\u0086\u0087\t\2\2\2\u0087\u008b\7\26\2\2\u0088"+
		"\u008a\5\22\n\2\u0089\u0088\3\2\2\2\u008a\u008d\3\2\2\2\u008b\u0089\3"+
		"\2\2\2\u008b\u008c\3\2\2\2\u008c\u008e\3\2\2\2\u008d\u008b\3\2\2\2\u008e"+
		"\u0094\7\17\2\2\u008f\u0090\7u\2\2\u0090\u0091\5\6\4\2\u0091\u0092\7\31"+
		"\2\2\u0092\u0094\3\2\2\2\u0093w\3\2\2\2\u0093\u0086\3\2\2\2\u0093\u008f"+
		"\3\2\2\2\u0094\17\3\2\2\2\u0095\u0096\t\3\2\2\u0096\21\3\2\2\2\u0097\u0098"+
		"\7\26\2\2\u0098\u0099\7\21\2\2\u0099\u009a\7\22\2\2\u009a\23\3\2\2\2\u009b"+
		"\u009c\t\4\2\2\u009c\25\3\2\2\2\u009d\u00a1\7\13\2\2\u009e\u00a1\5\24"+
		"\13\2\u009f\u00a1\5\32\16\2\u00a0\u009d\3\2\2\2\u00a0\u009e\3\2\2\2\u00a0"+
		"\u009f\3\2\2\2\u00a1\27\3\2\2\2\u00a2\u00a3\t\5\2\2\u00a3\31\3\2\2\2\u00a4"+
		"\u00a6\t\6\2\2\u00a5\u00a4\3\2\2\2\u00a6\u00a7\3\2\2\2\u00a7\u00a5\3\2"+
		"\2\2\u00a7\u00a8\3\2\2\2\u00a8\33\3\2\2\2\22\35\")\60\66@CGO^m|\u008b"+
		"\u0093\u00a0\u00a7";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}