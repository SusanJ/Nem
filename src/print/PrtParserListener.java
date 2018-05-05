// Generated from PrtParser.g4 by ANTLR 4.7.1
 package print; 
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link PrtParser}.
 */
public interface PrtParserListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link PrtParser#document}.
	 * @param ctx the parse tree
	 */
	void enterDocument(PrtParser.DocumentContext ctx);
	/**
	 * Exit a parse tree produced by {@link PrtParser#document}.
	 * @param ctx the parse tree
	 */
	void exitDocument(PrtParser.DocumentContext ctx);
	/**
	 * Enter a parse tree produced by {@link PrtParser#prolog}.
	 * @param ctx the parse tree
	 */
	void enterProlog(PrtParser.PrologContext ctx);
	/**
	 * Exit a parse tree produced by {@link PrtParser#prolog}.
	 * @param ctx the parse tree
	 */
	void exitProlog(PrtParser.PrologContext ctx);
	/**
	 * Enter a parse tree produced by {@link PrtParser#content}.
	 * @param ctx the parse tree
	 */
	void enterContent(PrtParser.ContentContext ctx);
	/**
	 * Exit a parse tree produced by {@link PrtParser#content}.
	 * @param ctx the parse tree
	 */
	void exitContent(PrtParser.ContentContext ctx);
	/**
	 * Enter a parse tree produced by {@link PrtParser#tfiment}.
	 * @param ctx the parse tree
	 */
	void enterTfiment(PrtParser.TfimentContext ctx);
	/**
	 * Exit a parse tree produced by {@link PrtParser#tfiment}.
	 * @param ctx the parse tree
	 */
	void exitTfiment(PrtParser.TfimentContext ctx);
	/**
	 * Enter a parse tree produced by {@link PrtParser#element}.
	 * @param ctx the parse tree
	 */
	void enterElement(PrtParser.ElementContext ctx);
	/**
	 * Exit a parse tree produced by {@link PrtParser#element}.
	 * @param ctx the parse tree
	 */
	void exitElement(PrtParser.ElementContext ctx);
	/**
	 * Enter a parse tree produced by {@link PrtParser#reference}.
	 * @param ctx the parse tree
	 */
	void enterReference(PrtParser.ReferenceContext ctx);
	/**
	 * Exit a parse tree produced by {@link PrtParser#reference}.
	 * @param ctx the parse tree
	 */
	void exitReference(PrtParser.ReferenceContext ctx);
	/**
	 * Enter a parse tree produced by {@link PrtParser#attribute}.
	 * @param ctx the parse tree
	 */
	void enterAttribute(PrtParser.AttributeContext ctx);
	/**
	 * Exit a parse tree produced by {@link PrtParser#attribute}.
	 * @param ctx the parse tree
	 */
	void exitAttribute(PrtParser.AttributeContext ctx);
	/**
	 * Enter a parse tree produced by {@link PrtParser#justWS}.
	 * @param ctx the parse tree
	 */
	void enterJustWS(PrtParser.JustWSContext ctx);
	/**
	 * Exit a parse tree produced by {@link PrtParser#justWS}.
	 * @param ctx the parse tree
	 */
	void exitJustWS(PrtParser.JustWSContext ctx);
	/**
	 * Enter a parse tree produced by {@link PrtParser#chardata}.
	 * @param ctx the parse tree
	 */
	void enterChardata(PrtParser.ChardataContext ctx);
	/**
	 * Exit a parse tree produced by {@link PrtParser#chardata}.
	 * @param ctx the parse tree
	 */
	void exitChardata(PrtParser.ChardataContext ctx);
	/**
	 * Enter a parse tree produced by {@link PrtParser#misc}.
	 * @param ctx the parse tree
	 */
	void enterMisc(PrtParser.MiscContext ctx);
	/**
	 * Exit a parse tree produced by {@link PrtParser#misc}.
	 * @param ctx the parse tree
	 */
	void exitMisc(PrtParser.MiscContext ctx);
	/**
	 * Enter a parse tree produced by {@link PrtParser#prtstuff}.
	 * @param ctx the parse tree
	 */
	void enterPrtstuff(PrtParser.PrtstuffContext ctx);
	/**
	 * Exit a parse tree produced by {@link PrtParser#prtstuff}.
	 * @param ctx the parse tree
	 */
	void exitPrtstuff(PrtParser.PrtstuffContext ctx);
}