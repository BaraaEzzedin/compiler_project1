// Generated from /home/mohee/compiler_project1/src/PyFlaskGrammar/PythonParser.g4 by ANTLR 4.13.2
package PyFlaskGrammar;
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link PythonParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface PythonParserVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link PythonParser#prog}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitProg(PythonParser.ProgContext ctx);
	/**
	 * Visit a parse tree produced by {@link PythonParser#stat}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStat(PythonParser.StatContext ctx);
	/**
	 * Visit a parse tree produced by the {@code PrintStatement}
	 * labeled alternative in {@link PythonParser#printStat}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPrintStatement(PythonParser.PrintStatementContext ctx);
	/**
	 * Visit a parse tree produced by the {@code Assignment}
	 * labeled alternative in {@link PythonParser#assignStat}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAssignment(PythonParser.AssignmentContext ctx);
	/**
	 * Visit a parse tree produced by {@link PythonParser#exprStat}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExprStat(PythonParser.ExprStatContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ReturnStatement}
	 * labeled alternative in {@link PythonParser#returnStat}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitReturnStatement(PythonParser.ReturnStatementContext ctx);
	/**
	 * Visit a parse tree produced by the {@code BreakStatement}
	 * labeled alternative in {@link PythonParser#breakStat}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBreakStatement(PythonParser.BreakStatementContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ContinueStatement}
	 * labeled alternative in {@link PythonParser#continueStat}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitContinueStatement(PythonParser.ContinueStatementContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ArrayAssignment}
	 * labeled alternative in {@link PythonParser#arrayAssignStat}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArrayAssignment(PythonParser.ArrayAssignmentContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ImportModule}
	 * labeled alternative in {@link PythonParser#importStat}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitImportModule(PythonParser.ImportModuleContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ImportFrom}
	 * labeled alternative in {@link PythonParser#importStat}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitImportFrom(PythonParser.ImportFromContext ctx);
	/**
	 * Visit a parse tree produced by {@link PythonParser#dottedName}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDottedName(PythonParser.DottedNameContext ctx);
	/**
	 * Visit a parse tree produced by the {@code FunctionDefinition}
	 * labeled alternative in {@link PythonParser#funcDef}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunctionDefinition(PythonParser.FunctionDefinitionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ParameterList}
	 * labeled alternative in {@link PythonParser#paramList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParameterList(PythonParser.ParameterListContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ClassDefinition}
	 * labeled alternative in {@link PythonParser#classDef}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitClassDefinition(PythonParser.ClassDefinitionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code DecoratorWithArgs}
	 * labeled alternative in {@link PythonParser#decorator}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDecoratorWithArgs(PythonParser.DecoratorWithArgsContext ctx);
	/**
	 * Visit a parse tree produced by the {@code DecoratorNoArgs}
	 * labeled alternative in {@link PythonParser#decorator}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDecoratorNoArgs(PythonParser.DecoratorNoArgsContext ctx);
	/**
	 * Visit a parse tree produced by {@link PythonParser#ifStat}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIfStat(PythonParser.IfStatContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ForStatement}
	 * labeled alternative in {@link PythonParser#forStat}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitForStatement(PythonParser.ForStatementContext ctx);
	/**
	 * Visit a parse tree produced by the {@code WhileStatement}
	 * labeled alternative in {@link PythonParser#whileStat}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitWhileStatement(PythonParser.WhileStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link PythonParser#block}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBlock(PythonParser.BlockContext ctx);
	/**
	 * Visit a parse tree produced by the {@code MultDivExpr}
	 * labeled alternative in {@link PythonParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMultDivExpr(PythonParser.MultDivExprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code KeyValue}
	 * labeled alternative in {@link PythonParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitKeyValue(PythonParser.KeyValueContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ComparisonExpr}
	 * labeled alternative in {@link PythonParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitComparisonExpr(PythonParser.ComparisonExprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code BooleanLiteral}
	 * labeled alternative in {@link PythonParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBooleanLiteral(PythonParser.BooleanLiteralContext ctx);
	/**
	 * Visit a parse tree produced by the {@code AttributeExpr}
	 * labeled alternative in {@link PythonParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAttributeExpr(PythonParser.AttributeExprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code GeneratorExpression}
	 * labeled alternative in {@link PythonParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitGeneratorExpression(PythonParser.GeneratorExpressionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ArrayLiteral}
	 * labeled alternative in {@link PythonParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArrayLiteral(PythonParser.ArrayLiteralContext ctx);
	/**
	 * Visit a parse tree produced by the {@code IndexExpr}
	 * labeled alternative in {@link PythonParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIndexExpr(PythonParser.IndexExprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code DictLiteral}
	 * labeled alternative in {@link PythonParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDictLiteral(PythonParser.DictLiteralContext ctx);
	/**
	 * Visit a parse tree produced by the {@code FunctionCallExpr}
	 * labeled alternative in {@link PythonParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunctionCallExpr(PythonParser.FunctionCallExprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code StringLiteral}
	 * labeled alternative in {@link PythonParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStringLiteral(PythonParser.StringLiteralContext ctx);
	/**
	 * Visit a parse tree produced by the {@code IdentifierExpr}
	 * labeled alternative in {@link PythonParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIdentifierExpr(PythonParser.IdentifierExprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ParenExpr}
	 * labeled alternative in {@link PythonParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParenExpr(PythonParser.ParenExprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code LogicalExpr}
	 * labeled alternative in {@link PythonParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLogicalExpr(PythonParser.LogicalExprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code AddSubExpr}
	 * labeled alternative in {@link PythonParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAddSubExpr(PythonParser.AddSubExprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code NumberLiteral}
	 * labeled alternative in {@link PythonParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNumberLiteral(PythonParser.NumberLiteralContext ctx);
	/**
	 * Visit a parse tree produced by {@link PythonParser#dictBody}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDictBody(PythonParser.DictBodyContext ctx);
	/**
	 * Visit a parse tree produced by {@link PythonParser#pair}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPair(PythonParser.PairContext ctx);
	/**
	 * Visit a parse tree produced by {@link PythonParser#argList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArgList(PythonParser.ArgListContext ctx);
	/**
	 * Visit a parse tree produced by {@link PythonParser#arg}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArg(PythonParser.ArgContext ctx);
}