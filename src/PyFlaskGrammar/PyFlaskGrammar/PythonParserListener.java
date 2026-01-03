// Generated from /home/mohee/compiler_project1/src/PyFlaskGrammar/PythonParser.g4 by ANTLR 4.13.2
package PyFlaskGrammar;
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link PythonParser}.
 */
public interface PythonParserListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link PythonParser#prog}.
	 * @param ctx the parse tree
	 */
	void enterProg(PythonParser.ProgContext ctx);
	/**
	 * Exit a parse tree produced by {@link PythonParser#prog}.
	 * @param ctx the parse tree
	 */
	void exitProg(PythonParser.ProgContext ctx);
	/**
	 * Enter a parse tree produced by {@link PythonParser#stat}.
	 * @param ctx the parse tree
	 */
	void enterStat(PythonParser.StatContext ctx);
	/**
	 * Exit a parse tree produced by {@link PythonParser#stat}.
	 * @param ctx the parse tree
	 */
	void exitStat(PythonParser.StatContext ctx);
	/**
	 * Enter a parse tree produced by the {@code PrintStatement}
	 * labeled alternative in {@link PythonParser#printStat}.
	 * @param ctx the parse tree
	 */
	void enterPrintStatement(PythonParser.PrintStatementContext ctx);
	/**
	 * Exit a parse tree produced by the {@code PrintStatement}
	 * labeled alternative in {@link PythonParser#printStat}.
	 * @param ctx the parse tree
	 */
	void exitPrintStatement(PythonParser.PrintStatementContext ctx);
	/**
	 * Enter a parse tree produced by the {@code Assignment}
	 * labeled alternative in {@link PythonParser#assignStat}.
	 * @param ctx the parse tree
	 */
	void enterAssignment(PythonParser.AssignmentContext ctx);
	/**
	 * Exit a parse tree produced by the {@code Assignment}
	 * labeled alternative in {@link PythonParser#assignStat}.
	 * @param ctx the parse tree
	 */
	void exitAssignment(PythonParser.AssignmentContext ctx);
	/**
	 * Enter a parse tree produced by {@link PythonParser#exprStat}.
	 * @param ctx the parse tree
	 */
	void enterExprStat(PythonParser.ExprStatContext ctx);
	/**
	 * Exit a parse tree produced by {@link PythonParser#exprStat}.
	 * @param ctx the parse tree
	 */
	void exitExprStat(PythonParser.ExprStatContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ReturnStatement}
	 * labeled alternative in {@link PythonParser#returnStat}.
	 * @param ctx the parse tree
	 */
	void enterReturnStatement(PythonParser.ReturnStatementContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ReturnStatement}
	 * labeled alternative in {@link PythonParser#returnStat}.
	 * @param ctx the parse tree
	 */
	void exitReturnStatement(PythonParser.ReturnStatementContext ctx);
	/**
	 * Enter a parse tree produced by the {@code BreakStatement}
	 * labeled alternative in {@link PythonParser#breakStat}.
	 * @param ctx the parse tree
	 */
	void enterBreakStatement(PythonParser.BreakStatementContext ctx);
	/**
	 * Exit a parse tree produced by the {@code BreakStatement}
	 * labeled alternative in {@link PythonParser#breakStat}.
	 * @param ctx the parse tree
	 */
	void exitBreakStatement(PythonParser.BreakStatementContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ContinueStatement}
	 * labeled alternative in {@link PythonParser#continueStat}.
	 * @param ctx the parse tree
	 */
	void enterContinueStatement(PythonParser.ContinueStatementContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ContinueStatement}
	 * labeled alternative in {@link PythonParser#continueStat}.
	 * @param ctx the parse tree
	 */
	void exitContinueStatement(PythonParser.ContinueStatementContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ArrayAssignment}
	 * labeled alternative in {@link PythonParser#arrayAssignStat}.
	 * @param ctx the parse tree
	 */
	void enterArrayAssignment(PythonParser.ArrayAssignmentContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ArrayAssignment}
	 * labeled alternative in {@link PythonParser#arrayAssignStat}.
	 * @param ctx the parse tree
	 */
	void exitArrayAssignment(PythonParser.ArrayAssignmentContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ImportModule}
	 * labeled alternative in {@link PythonParser#importStat}.
	 * @param ctx the parse tree
	 */
	void enterImportModule(PythonParser.ImportModuleContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ImportModule}
	 * labeled alternative in {@link PythonParser#importStat}.
	 * @param ctx the parse tree
	 */
	void exitImportModule(PythonParser.ImportModuleContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ImportFrom}
	 * labeled alternative in {@link PythonParser#importStat}.
	 * @param ctx the parse tree
	 */
	void enterImportFrom(PythonParser.ImportFromContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ImportFrom}
	 * labeled alternative in {@link PythonParser#importStat}.
	 * @param ctx the parse tree
	 */
	void exitImportFrom(PythonParser.ImportFromContext ctx);
	/**
	 * Enter a parse tree produced by {@link PythonParser#dottedName}.
	 * @param ctx the parse tree
	 */
	void enterDottedName(PythonParser.DottedNameContext ctx);
	/**
	 * Exit a parse tree produced by {@link PythonParser#dottedName}.
	 * @param ctx the parse tree
	 */
	void exitDottedName(PythonParser.DottedNameContext ctx);
	/**
	 * Enter a parse tree produced by the {@code FunctionDefinition}
	 * labeled alternative in {@link PythonParser#funcDef}.
	 * @param ctx the parse tree
	 */
	void enterFunctionDefinition(PythonParser.FunctionDefinitionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code FunctionDefinition}
	 * labeled alternative in {@link PythonParser#funcDef}.
	 * @param ctx the parse tree
	 */
	void exitFunctionDefinition(PythonParser.FunctionDefinitionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ParameterList}
	 * labeled alternative in {@link PythonParser#paramList}.
	 * @param ctx the parse tree
	 */
	void enterParameterList(PythonParser.ParameterListContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ParameterList}
	 * labeled alternative in {@link PythonParser#paramList}.
	 * @param ctx the parse tree
	 */
	void exitParameterList(PythonParser.ParameterListContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ClassDefinition}
	 * labeled alternative in {@link PythonParser#classDef}.
	 * @param ctx the parse tree
	 */
	void enterClassDefinition(PythonParser.ClassDefinitionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ClassDefinition}
	 * labeled alternative in {@link PythonParser#classDef}.
	 * @param ctx the parse tree
	 */
	void exitClassDefinition(PythonParser.ClassDefinitionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code DecoratorWithArgs}
	 * labeled alternative in {@link PythonParser#decorator}.
	 * @param ctx the parse tree
	 */
	void enterDecoratorWithArgs(PythonParser.DecoratorWithArgsContext ctx);
	/**
	 * Exit a parse tree produced by the {@code DecoratorWithArgs}
	 * labeled alternative in {@link PythonParser#decorator}.
	 * @param ctx the parse tree
	 */
	void exitDecoratorWithArgs(PythonParser.DecoratorWithArgsContext ctx);
	/**
	 * Enter a parse tree produced by the {@code DecoratorNoArgs}
	 * labeled alternative in {@link PythonParser#decorator}.
	 * @param ctx the parse tree
	 */
	void enterDecoratorNoArgs(PythonParser.DecoratorNoArgsContext ctx);
	/**
	 * Exit a parse tree produced by the {@code DecoratorNoArgs}
	 * labeled alternative in {@link PythonParser#decorator}.
	 * @param ctx the parse tree
	 */
	void exitDecoratorNoArgs(PythonParser.DecoratorNoArgsContext ctx);
	/**
	 * Enter a parse tree produced by {@link PythonParser#ifStat}.
	 * @param ctx the parse tree
	 */
	void enterIfStat(PythonParser.IfStatContext ctx);
	/**
	 * Exit a parse tree produced by {@link PythonParser#ifStat}.
	 * @param ctx the parse tree
	 */
	void exitIfStat(PythonParser.IfStatContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ForStatement}
	 * labeled alternative in {@link PythonParser#forStat}.
	 * @param ctx the parse tree
	 */
	void enterForStatement(PythonParser.ForStatementContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ForStatement}
	 * labeled alternative in {@link PythonParser#forStat}.
	 * @param ctx the parse tree
	 */
	void exitForStatement(PythonParser.ForStatementContext ctx);
	/**
	 * Enter a parse tree produced by the {@code WhileStatement}
	 * labeled alternative in {@link PythonParser#whileStat}.
	 * @param ctx the parse tree
	 */
	void enterWhileStatement(PythonParser.WhileStatementContext ctx);
	/**
	 * Exit a parse tree produced by the {@code WhileStatement}
	 * labeled alternative in {@link PythonParser#whileStat}.
	 * @param ctx the parse tree
	 */
	void exitWhileStatement(PythonParser.WhileStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link PythonParser#block}.
	 * @param ctx the parse tree
	 */
	void enterBlock(PythonParser.BlockContext ctx);
	/**
	 * Exit a parse tree produced by {@link PythonParser#block}.
	 * @param ctx the parse tree
	 */
	void exitBlock(PythonParser.BlockContext ctx);
	/**
	 * Enter a parse tree produced by the {@code MultDivExpr}
	 * labeled alternative in {@link PythonParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterMultDivExpr(PythonParser.MultDivExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code MultDivExpr}
	 * labeled alternative in {@link PythonParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitMultDivExpr(PythonParser.MultDivExprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code KeyValue}
	 * labeled alternative in {@link PythonParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterKeyValue(PythonParser.KeyValueContext ctx);
	/**
	 * Exit a parse tree produced by the {@code KeyValue}
	 * labeled alternative in {@link PythonParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitKeyValue(PythonParser.KeyValueContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ComparisonExpr}
	 * labeled alternative in {@link PythonParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterComparisonExpr(PythonParser.ComparisonExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ComparisonExpr}
	 * labeled alternative in {@link PythonParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitComparisonExpr(PythonParser.ComparisonExprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code BooleanLiteral}
	 * labeled alternative in {@link PythonParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterBooleanLiteral(PythonParser.BooleanLiteralContext ctx);
	/**
	 * Exit a parse tree produced by the {@code BooleanLiteral}
	 * labeled alternative in {@link PythonParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitBooleanLiteral(PythonParser.BooleanLiteralContext ctx);
	/**
	 * Enter a parse tree produced by the {@code AttributeExpr}
	 * labeled alternative in {@link PythonParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterAttributeExpr(PythonParser.AttributeExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code AttributeExpr}
	 * labeled alternative in {@link PythonParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitAttributeExpr(PythonParser.AttributeExprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code GeneratorExpression}
	 * labeled alternative in {@link PythonParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterGeneratorExpression(PythonParser.GeneratorExpressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code GeneratorExpression}
	 * labeled alternative in {@link PythonParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitGeneratorExpression(PythonParser.GeneratorExpressionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ArrayLiteral}
	 * labeled alternative in {@link PythonParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterArrayLiteral(PythonParser.ArrayLiteralContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ArrayLiteral}
	 * labeled alternative in {@link PythonParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitArrayLiteral(PythonParser.ArrayLiteralContext ctx);
	/**
	 * Enter a parse tree produced by the {@code IndexExpr}
	 * labeled alternative in {@link PythonParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterIndexExpr(PythonParser.IndexExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code IndexExpr}
	 * labeled alternative in {@link PythonParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitIndexExpr(PythonParser.IndexExprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code DictLiteral}
	 * labeled alternative in {@link PythonParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterDictLiteral(PythonParser.DictLiteralContext ctx);
	/**
	 * Exit a parse tree produced by the {@code DictLiteral}
	 * labeled alternative in {@link PythonParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitDictLiteral(PythonParser.DictLiteralContext ctx);
	/**
	 * Enter a parse tree produced by the {@code FunctionCallExpr}
	 * labeled alternative in {@link PythonParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterFunctionCallExpr(PythonParser.FunctionCallExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code FunctionCallExpr}
	 * labeled alternative in {@link PythonParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitFunctionCallExpr(PythonParser.FunctionCallExprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code StringLiteral}
	 * labeled alternative in {@link PythonParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterStringLiteral(PythonParser.StringLiteralContext ctx);
	/**
	 * Exit a parse tree produced by the {@code StringLiteral}
	 * labeled alternative in {@link PythonParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitStringLiteral(PythonParser.StringLiteralContext ctx);
	/**
	 * Enter a parse tree produced by the {@code IdentifierExpr}
	 * labeled alternative in {@link PythonParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterIdentifierExpr(PythonParser.IdentifierExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code IdentifierExpr}
	 * labeled alternative in {@link PythonParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitIdentifierExpr(PythonParser.IdentifierExprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ParenExpr}
	 * labeled alternative in {@link PythonParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterParenExpr(PythonParser.ParenExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ParenExpr}
	 * labeled alternative in {@link PythonParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitParenExpr(PythonParser.ParenExprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code LogicalExpr}
	 * labeled alternative in {@link PythonParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterLogicalExpr(PythonParser.LogicalExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code LogicalExpr}
	 * labeled alternative in {@link PythonParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitLogicalExpr(PythonParser.LogicalExprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code AddSubExpr}
	 * labeled alternative in {@link PythonParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterAddSubExpr(PythonParser.AddSubExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code AddSubExpr}
	 * labeled alternative in {@link PythonParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitAddSubExpr(PythonParser.AddSubExprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code NumberLiteral}
	 * labeled alternative in {@link PythonParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterNumberLiteral(PythonParser.NumberLiteralContext ctx);
	/**
	 * Exit a parse tree produced by the {@code NumberLiteral}
	 * labeled alternative in {@link PythonParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitNumberLiteral(PythonParser.NumberLiteralContext ctx);
	/**
	 * Enter a parse tree produced by {@link PythonParser#dictBody}.
	 * @param ctx the parse tree
	 */
	void enterDictBody(PythonParser.DictBodyContext ctx);
	/**
	 * Exit a parse tree produced by {@link PythonParser#dictBody}.
	 * @param ctx the parse tree
	 */
	void exitDictBody(PythonParser.DictBodyContext ctx);
	/**
	 * Enter a parse tree produced by {@link PythonParser#pair}.
	 * @param ctx the parse tree
	 */
	void enterPair(PythonParser.PairContext ctx);
	/**
	 * Exit a parse tree produced by {@link PythonParser#pair}.
	 * @param ctx the parse tree
	 */
	void exitPair(PythonParser.PairContext ctx);
	/**
	 * Enter a parse tree produced by {@link PythonParser#argList}.
	 * @param ctx the parse tree
	 */
	void enterArgList(PythonParser.ArgListContext ctx);
	/**
	 * Exit a parse tree produced by {@link PythonParser#argList}.
	 * @param ctx the parse tree
	 */
	void exitArgList(PythonParser.ArgListContext ctx);
	/**
	 * Enter a parse tree produced by {@link PythonParser#arg}.
	 * @param ctx the parse tree
	 */
	void enterArg(PythonParser.ArgContext ctx);
	/**
	 * Exit a parse tree produced by {@link PythonParser#arg}.
	 * @param ctx the parse tree
	 */
	void exitArg(PythonParser.ArgContext ctx);
}