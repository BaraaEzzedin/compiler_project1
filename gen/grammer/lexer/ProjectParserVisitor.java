// Generated from C:/Users/ASUSD/IdeaProjects/compiler_project1/src/grammer/lexer/ProjectParser.g4 by ANTLR 4.13.2
package grammer.lexer;
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link ProjectParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface ProjectParserVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by the {@code Program}
	 * labeled alternative in {@link ProjectParser#document}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitProgram(ProjectParser.ProgramContext ctx);
	/**
	 * Visit a parse tree produced by the {@code HtmlNode}
	 * labeled alternative in {@link ProjectParser#node}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitHtmlNode(ProjectParser.HtmlNodeContext ctx);
	/**
	 * Visit a parse tree produced by the {@code JinjaNode}
	 * labeled alternative in {@link ProjectParser#node}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitJinjaNode(ProjectParser.JinjaNodeContext ctx);
	/**
	 * Visit a parse tree produced by the {@code TextNode}
	 * labeled alternative in {@link ProjectParser#node}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTextNode(ProjectParser.TextNodeContext ctx);
	/**
	 * Visit a parse tree produced by the {@code HtmlNormalElement}
	 * labeled alternative in {@link ProjectParser#htmlElement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitHtmlNormalElement(ProjectParser.HtmlNormalElementContext ctx);
	/**
	 * Visit a parse tree produced by the {@code HtmlSelfClosingElement}
	 * labeled alternative in {@link ProjectParser#htmlElement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitHtmlSelfClosingElement(ProjectParser.HtmlSelfClosingElementContext ctx);
	/**
	 * Visit a parse tree produced by the {@code HtmlScriptElement}
	 * labeled alternative in {@link ProjectParser#htmlElement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitHtmlScriptElement(ProjectParser.HtmlScriptElementContext ctx);
	/**
	 * Visit a parse tree produced by the {@code HtmlStyleElement}
	 * labeled alternative in {@link ProjectParser#htmlElement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitHtmlStyleElement(ProjectParser.HtmlStyleElementContext ctx);
	/**
	 * Visit a parse tree produced by {@link ProjectParser#normalElement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNormalElement(ProjectParser.NormalElementContext ctx);
	/**
	 * Visit a parse tree produced by {@link ProjectParser#selfClosingElement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSelfClosingElement(ProjectParser.SelfClosingElementContext ctx);
	/**
	 * Visit a parse tree produced by {@link ProjectParser#htmlContent}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitHtmlContent(ProjectParser.HtmlContentContext ctx);
	/**
	 * Visit a parse tree produced by {@link ProjectParser#htmlAttribute}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitHtmlAttribute(ProjectParser.HtmlAttributeContext ctx);
	/**
	 * Visit a parse tree produced by {@link ProjectParser#htmlChardata}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitHtmlChardata(ProjectParser.HtmlChardataContext ctx);
	/**
	 * Visit a parse tree produced by {@link ProjectParser#htmlMisc}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitHtmlMisc(ProjectParser.HtmlMiscContext ctx);
	/**
	 * Visit a parse tree produced by {@link ProjectParser#script}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitScript(ProjectParser.ScriptContext ctx);
	/**
	 * Visit a parse tree produced by {@link ProjectParser#style}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStyle(ProjectParser.StyleContext ctx);
	/**
	 * Visit a parse tree produced by {@link ProjectParser#jinjaElement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitJinjaElement(ProjectParser.JinjaElementContext ctx);
	/**
	 * Visit a parse tree produced by {@link ProjectParser#jinjaVariable}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitJinjaVariable(ProjectParser.JinjaVariableContext ctx);
	/**
	 * Visit a parse tree produced by {@link ProjectParser#jinjaBlock}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitJinjaBlock(ProjectParser.JinjaBlockContext ctx);
	/**
	 * Visit a parse tree produced by {@link ProjectParser#jinjaBody}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitJinjaBody(ProjectParser.JinjaBodyContext ctx);
	/**
	 * Visit a parse tree produced by {@link ProjectParser#jinjaExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitJinjaExpression(ProjectParser.JinjaExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link ProjectParser#jinjaPrimary}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitJinjaPrimary(ProjectParser.JinjaPrimaryContext ctx);
	/**
	 * Visit a parse tree produced by {@link ProjectParser#forStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitForStatement(ProjectParser.ForStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link ProjectParser#ifStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIfStatement(ProjectParser.IfStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link ProjectParser#elifBlock}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitElifBlock(ProjectParser.ElifBlockContext ctx);
	/**
	 * Visit a parse tree produced by {@link ProjectParser#elseBlock}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitElseBlock(ProjectParser.ElseBlockContext ctx);
	/**
	 * Visit a parse tree produced by {@link ProjectParser#cssStyle}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCssStyle(ProjectParser.CssStyleContext ctx);
	/**
	 * Visit a parse tree produced by {@link ProjectParser#cssStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCssStatement(ProjectParser.CssStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link ProjectParser#cssRule}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCssRule(ProjectParser.CssRuleContext ctx);
	/**
	 * Visit a parse tree produced by {@link ProjectParser#cssSelector}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCssSelector(ProjectParser.CssSelectorContext ctx);
	/**
	 * Visit a parse tree produced by {@link ProjectParser#selectorGroup}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSelectorGroup(ProjectParser.SelectorGroupContext ctx);
	/**
	 * Visit a parse tree produced by {@link ProjectParser#selector}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSelector(ProjectParser.SelectorContext ctx);
	/**
	 * Visit a parse tree produced by {@link ProjectParser#compoundSelector}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCompoundSelector(ProjectParser.CompoundSelectorContext ctx);
	/**
	 * Visit a parse tree produced by {@link ProjectParser#simpleSelector}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSimpleSelector(ProjectParser.SimpleSelectorContext ctx);
	/**
	 * Visit a parse tree produced by {@link ProjectParser#typeSelector}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTypeSelector(ProjectParser.TypeSelectorContext ctx);
	/**
	 * Visit a parse tree produced by {@link ProjectParser#classSelector}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitClassSelector(ProjectParser.ClassSelectorContext ctx);
	/**
	 * Visit a parse tree produced by {@link ProjectParser#idSelector}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIdSelector(ProjectParser.IdSelectorContext ctx);
	/**
	 * Visit a parse tree produced by {@link ProjectParser#pseudoSelector}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPseudoSelector(ProjectParser.PseudoSelectorContext ctx);
	/**
	 * Visit a parse tree produced by {@link ProjectParser#cssDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCssDeclaration(ProjectParser.CssDeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link ProjectParser#cssFunction}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCssFunction(ProjectParser.CssFunctionContext ctx);
	/**
	 * Visit a parse tree produced by {@link ProjectParser#cssValueList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCssValueList(ProjectParser.CssValueListContext ctx);
	/**
	 * Visit a parse tree produced by {@link ProjectParser#cssValue}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCssValue(ProjectParser.CssValueContext ctx);
	/**
	 * Visit a parse tree produced by {@link ProjectParser#cssTerm}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCssTerm(ProjectParser.CssTermContext ctx);
	/**
	 * Visit a parse tree produced by {@link ProjectParser#cssAtRule}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCssAtRule(ProjectParser.CssAtRuleContext ctx);
	/**
	 * Visit a parse tree produced by {@link ProjectParser#cssMedia}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCssMedia(ProjectParser.CssMediaContext ctx);
	/**
	 * Visit a parse tree produced by {@link ProjectParser#cssMediaQuery}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCssMediaQuery(ProjectParser.CssMediaQueryContext ctx);
	/**
	 * Visit a parse tree produced by {@link ProjectParser#cssMediaExpr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCssMediaExpr(ProjectParser.CssMediaExprContext ctx);
}