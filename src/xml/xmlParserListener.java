// Generated from xmlParser.g4 by ANTLR 4.7.1
 package xml; 
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link xmlParser}.
 */
public interface xmlParserListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link xmlParser#document}.
	 * @param ctx the parse tree
	 */
	void enterDocument(xmlParser.DocumentContext ctx);
	/**
	 * Exit a parse tree produced by {@link xmlParser#document}.
	 * @param ctx the parse tree
	 */
	void exitDocument(xmlParser.DocumentContext ctx);
	/**
	 * Enter a parse tree produced by {@link xmlParser#prolog}.
	 * @param ctx the parse tree
	 */
	void enterProlog(xmlParser.PrologContext ctx);
	/**
	 * Exit a parse tree produced by {@link xmlParser#prolog}.
	 * @param ctx the parse tree
	 */
	void exitProlog(xmlParser.PrologContext ctx);
	/**
	 * Enter a parse tree produced by {@link xmlParser#content}.
	 * @param ctx the parse tree
	 */
	void enterContent(xmlParser.ContentContext ctx);
	/**
	 * Exit a parse tree produced by {@link xmlParser#content}.
	 * @param ctx the parse tree
	 */
	void exitContent(xmlParser.ContentContext ctx);
	/**
	 * Enter a parse tree produced by {@link xmlParser#layment}.
	 * @param ctx the parse tree
	 */
	void enterLayment(xmlParser.LaymentContext ctx);
	/**
	 * Exit a parse tree produced by {@link xmlParser#layment}.
	 * @param ctx the parse tree
	 */
	void exitLayment(xmlParser.LaymentContext ctx);
	/**
	 * Enter a parse tree produced by {@link xmlParser#rowment}.
	 * @param ctx the parse tree
	 */
	void enterRowment(xmlParser.RowmentContext ctx);
	/**
	 * Exit a parse tree produced by {@link xmlParser#rowment}.
	 * @param ctx the parse tree
	 */
	void exitRowment(xmlParser.RowmentContext ctx);
	/**
	 * Enter a parse tree produced by {@link xmlParser#tokment}.
	 * @param ctx the parse tree
	 */
	void enterTokment(xmlParser.TokmentContext ctx);
	/**
	 * Exit a parse tree produced by {@link xmlParser#tokment}.
	 * @param ctx the parse tree
	 */
	void exitTokment(xmlParser.TokmentContext ctx);
	/**
	 * Enter a parse tree produced by {@link xmlParser#element}.
	 * @param ctx the parse tree
	 */
	void enterElement(xmlParser.ElementContext ctx);
	/**
	 * Exit a parse tree produced by {@link xmlParser#element}.
	 * @param ctx the parse tree
	 */
	void exitElement(xmlParser.ElementContext ctx);
	/**
	 * Enter a parse tree produced by {@link xmlParser#reference}.
	 * @param ctx the parse tree
	 */
	void enterReference(xmlParser.ReferenceContext ctx);
	/**
	 * Exit a parse tree produced by {@link xmlParser#reference}.
	 * @param ctx the parse tree
	 */
	void exitReference(xmlParser.ReferenceContext ctx);
	/**
	 * Enter a parse tree produced by {@link xmlParser#attribute}.
	 * @param ctx the parse tree
	 */
	void enterAttribute(xmlParser.AttributeContext ctx);
	/**
	 * Exit a parse tree produced by {@link xmlParser#attribute}.
	 * @param ctx the parse tree
	 */
	void exitAttribute(xmlParser.AttributeContext ctx);
	/**
	 * Enter a parse tree produced by {@link xmlParser#justWS}.
	 * @param ctx the parse tree
	 */
	void enterJustWS(xmlParser.JustWSContext ctx);
	/**
	 * Exit a parse tree produced by {@link xmlParser#justWS}.
	 * @param ctx the parse tree
	 */
	void exitJustWS(xmlParser.JustWSContext ctx);
	/**
	 * Enter a parse tree produced by {@link xmlParser#chardata}.
	 * @param ctx the parse tree
	 */
	void enterChardata(xmlParser.ChardataContext ctx);
	/**
	 * Exit a parse tree produced by {@link xmlParser#chardata}.
	 * @param ctx the parse tree
	 */
	void exitChardata(xmlParser.ChardataContext ctx);
	/**
	 * Enter a parse tree produced by {@link xmlParser#misc}.
	 * @param ctx the parse tree
	 */
	void enterMisc(xmlParser.MiscContext ctx);
	/**
	 * Exit a parse tree produced by {@link xmlParser#misc}.
	 * @param ctx the parse tree
	 */
	void exitMisc(xmlParser.MiscContext ctx);
}