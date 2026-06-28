package Visitor;

import AST.ASTNode;
import AST.Program;
import AST.PyFlask.Block;
import AST.PyFlask.Expression;
import AST.PyFlask.Expressions.*;
import AST.PyFlask.Statements.*;
import AST.Statement;
import PyFlaskGrammar.PyFlaskGrammar.PythonParser;
import PyFlaskGrammar.PyFlaskGrammar.PythonParserBaseVisitor;
import org.antlr.v4.runtime.tree.TerminalNode;

import java.util.ArrayList;
import java.util.List;

public class PythonVisitor extends PythonParserBaseVisitor<ASTNode> {
    @Override
    public ASTNode visitProg(PythonParser.ProgContext ctx) {
        List<Statement> stmts = new ArrayList<>();
        for (PythonParser.StatContext stat : ctx.stat()) {
            ASTNode stmt = visit(stat);
            if (stmt instanceof Statement)
                stmts.add((Statement) stmt);
        }
        int line = ctx.getStart().getLine();
        return new Program(line, stmts);
    }

    @Override
    public ASTNode visitPrintStatement(PythonParser.PrintStatementContext ctx) {
        Expression expr = (Expression) visit(ctx.expr());
        int line = ctx.getStart().getLine();

        return new PrintStmt(line, expr);
    }

    @Override
    public ASTNode visitAssignment(PythonParser.AssignmentContext ctx) {
        int line = ctx.getStart().getLine();

        Expression target =
                (Expression) visit(ctx.expr(0));

        Expression value =
                (Expression) visit(ctx.expr(1));

        return new AssignStmt(line, target, value);
    }

    @Override
    public ASTNode visitArrayAssignment(PythonParser.ArrayAssignmentContext ctx) {
        Expression target = (Expression) visit(ctx.expr(0));
        Expression index = (Expression) visit(ctx.expr(1));
        Expression value = (Expression) visit(ctx.expr(2));
        int line = ctx.getStart().getLine();

        IndexExpr idxTarget = new IndexExpr(line, target, index);
        return new AssignStmt(line, idxTarget, value);
    }

    @Override
    public ASTNode visitExprStat(PythonParser.ExprStatContext ctx) {
        Expression e = (Expression) visit(ctx.expr());
        int line = ctx.getStart().getLine();

        return new ExprStmt(line, e);
    }

    @Override
    public ASTNode visitReturnStatement(PythonParser.ReturnStatementContext ctx) {
        Expression e = (Expression) visit(ctx.expr());
        int line = ctx.getStart().getLine();

        return new ReturnStmt(line, e);
    }

    @Override
    public ASTNode visitIfStat(PythonParser.IfStatContext ctx) {
        Expression condition = (Expression) visit(ctx.expr());
        Block thenBlock = (Block) visit(ctx.block(0));
        Block elseBlock = null;
        if (ctx.block().size() > 1) {
            elseBlock = (Block) visit(ctx.block(1));
        }
        int line = ctx.getStart().getLine();

        return new IfStmt(line, condition, thenBlock, elseBlock);
    }

    @Override
    public ASTNode visitWhileStatement(PythonParser.WhileStatementContext ctx) {
        Expression cond = (Expression) visit(ctx.expr());
        Block block = (Block) visit(ctx.block());
        int line = ctx.getStart().getLine();

        return new WhileStmt(line, cond, block);
    }

    @Override
    public ASTNode visitForStatement(PythonParser.ForStatementContext ctx) {
        Expression loopVar = (Expression) visit(ctx.expr(0));  // Loop variable
        Expression iterable = (Expression) visit(ctx.expr(1));  // Iterable expression
        Block body = (Block) visit(ctx.block());
        int line = ctx.getStart().getLine();

        return new ForStmt(line, loopVar, iterable, body);
    }

    @Override
    public ASTNode visitGeneratorExpression(PythonParser.GeneratorExpressionContext ctx) {
        int line = ctx.getStart().getLine();

        IdentifierExpr yieldVar =
                new IdentifierExpr(line, ctx.ID(0).getText());

        IdentifierExpr loopVar =
                new IdentifierExpr(line, ctx.ID(1).getText());

        Expression iterable =
                (Expression) visit(ctx.expr(0));

        Expression filter = null;
        if (ctx.expr().size() == 2) {
            filter = (Expression) visit(ctx.expr(1));
        }

        return new GeneratorExpr(
                line,
                yieldVar,
                loopVar,
                iterable,
                filter
        );
    }

    //    @Override
//    public ASTNode visitFunctionDefinition(PythonParser.FunctionDefinitionContext ctx) {
//        String name = ctx.ID().getText();
//        List<String> params = new ArrayList<>();
//        if (ctx.paramList() != null) {
//            params.add(ctx.paramList().getText());
//        }
//        Block body = (Block) visit(ctx.block());
//        int line = ctx.getStart().getLine();
//        return new FunctionDef(line, name, params, body);
//    }
    @Override
    public ASTNode visitFunctionDefinition(PythonParser.FunctionDefinitionContext ctx) {
        int line = ctx.getStart().getLine();
        String name = ctx.ID().getText();

//        symbolTable.define(name, "Function", line);

//        symbolTable = new PythonSymbolTable(symbolTable);
//        System.out.println(">>> Entering New Scope for function: " + name);

        List<String> params = new ArrayList<>();
        if (ctx.paramList() != null) {
            for (TerminalNode id : ctx.paramList().ID()) {
                params.add(id.getText());
            }
        }

        List<DecoratorExpr> decorators = new ArrayList<>();
        for (PythonParser.DecoratorContext dctx : ctx.decorator()) {
            decorators.add((DecoratorExpr) visit(dctx));
        }

        Block body = (Block) visit(ctx.block());

//        symbolTable.printScope("Function: " + name);
//
//        symbolTable = symbolTable.getParent();
//        System.out.println("<<< Returning to Parent Scope.");
        return new FunctionDef(line, name, decorators, params, body);
    }

    @Override
    public ASTNode visitDecoratorExpr(PythonParser.DecoratorExprContext ctx) {
        int line = ctx.getStart().getLine();

        // Extract dotted name parts
        List<String> nameParts = new ArrayList<>();
        for (TerminalNode id : ctx.dottedName().ID()) {
            nameParts.add(id.getText());
        }

        // Extract arguments (if any)
        List<Expression> args = new ArrayList<>();
        if (ctx.argList() != null) {
            for (PythonParser.ArgContext ectx : ctx.argList().arg()) {
                args.add((Expression) visit(ectx));
            }
        }

        return new DecoratorExpr(line, nameParts, args);
    }

    @Override
    public ASTNode visitClassDefinition(PythonParser.ClassDefinitionContext ctx) {
        String name = ctx.ID(0).getText();
        String superClass = null;

        if (ctx.ID().size() > 1) {
            superClass = ctx.ID(1).getText();
        }

        Block block = (Block) visit(ctx.block());
        int line = ctx.getStart().getLine();

        return new ClassDef(line, name, superClass, block.getStatements());
    }

    @Override
    public ASTNode visitImportFrom(PythonParser.ImportFromContext ctx) {
        String module = ctx.dottedName().getText();
        List<String> names = new ArrayList<>();
        for (TerminalNode id : ctx.ID())
            names.add(id.getText());
        int line = ctx.getStart().getLine();

        return new ImportStmt(line, true, module, names);
    }

    @Override
    public ASTNode visitGlobalStat(PythonParser.GlobalStatContext ctx) {
        List<String> names = new ArrayList<>();

        for (TerminalNode id : ctx.ID()) {
            names.add(id.getText());
        }

        return new GlobalStmt(
                ctx.getStart().getLine(),
                names
        );
    }

    @Override
    public ASTNode visitTupleExpr(PythonParser.TupleExprContext ctx) {
        List<Expression> elements = new ArrayList<>();

        for (PythonParser.ExprContext expr : ctx.expr()) {
            elements.add((Expression) visit(expr));
        }

        return new TupleExpr(
                ctx.getStart().getLine(),
                elements
        );
    }

    @Override
    public ASTNode visitImportModule(PythonParser.ImportModuleContext ctx) {
        List<String> imports = new ArrayList<>();

        for (PythonParser.DottedNameContext dn : ctx.dottedName()) {
            imports.add(dn.getText());
        }

        return new ImportStmt(
                ctx.getStart().getLine(),
                false,
                null,
                imports
        );
    }

    @Override
    public ASTNode visitBlock(PythonParser.BlockContext ctx) {
        List<Statement> statements = new ArrayList<>();
        for (PythonParser.StatContext s : ctx.stat()) {
            ASTNode node = visit(s);
            if (node instanceof Statement) {
                statements.add((Statement) node);
            } else if (node instanceof Block) {
                // Flatten nested blocks defensively
                statements.addAll(((Block) node).getStatements());
            }
        }
        int line = ctx.getStart().getLine();

        return new Block(line, statements);
    }

    @Override
    public ASTNode visitNumberLiteral(PythonParser.NumberLiteralContext ctx) {
        int line = ctx.getStart().getLine();

        return new NumberExpr(line, ctx.getText());
    }

    @Override
    public ASTNode visitStringLiteral(PythonParser.StringLiteralContext ctx) {
        String raw = ctx.STRING().getText();
        String inner = raw.substring(1, raw.length() - 1);
        int line = ctx.getStart().getLine();

        return new StringExpr(line, unescape(inner));
    }

    @Override
    public ASTNode visitBooleanLiteral(PythonParser.BooleanLiteralContext ctx) {
        int line = ctx.getStart().getLine();

        boolean value = ctx.BOOL().getText().equalsIgnoreCase("true");
        return new BooleanExpr(line, value);
    }

    @Override
    public ASTNode visitIdentifierExpr(PythonParser.IdentifierExprContext ctx) {
        int line = ctx.getStart().getLine();

        return new IdentifierExpr(line, ctx.ID().getText());
    }


    @Override
    public ASTNode visitFunctionCallExpr(PythonParser.FunctionCallExprContext ctx) {
        int line = ctx.getStart().getLine();

        Expression callee = new IdentifierExpr(
                line,
                ctx.ID().getText());

        List<Expression> args = new ArrayList<>();

        if (ctx.argList() != null) {
            for (PythonParser.ArgContext ectx : ctx.argList().arg()) {
                args.add((Expression) visit(ectx));
            }
        }
        return new FunctionCallExpr(line, callee, args);
    }

    @Override
    public ASTNode visitArg(PythonParser.ArgContext ctx) {
        if (ctx.ASSIGN() != null) {

            int line = ctx.getStart().getLine();

            return new KeyValue(
                    line,
                    new IdentifierExpr(line, ctx.ID().getText()),
                    (Expression) visit(ctx.expr())
            );
        }

        return visit(ctx.expr());
    }

    @Override
    public ASTNode visitAttributeExpr(PythonParser.AttributeExprContext ctx) {
        Expression target = (Expression) visit(ctx.expr(0));
        Expression attr = (Expression) visit(ctx.expr(1));
        int line = ctx.getStart().getLine();

        return new AttributeExpr(line, target, attr);
    }

    @Override
    public ASTNode visitIndexExpr(PythonParser.IndexExprContext ctx) {
        Expression target = (Expression) visit(ctx.expr(0));
        Expression index = (Expression) visit(ctx.expr(1));
        int line = ctx.getStart().getLine();

        return new IndexExpr(line, target, index);
    }


    @Override
    public ASTNode visitArrayLiteral(PythonParser.ArrayLiteralContext ctx) {
        List<Expression> items = new ArrayList<>();
        if (ctx.argList() != null) {
            for (PythonParser.ArgContext e : ctx.argList().arg())
                items.add((Expression) visit(e));
        }
        int line = ctx.getStart().getLine();
        return new ArrayLiteral(line, items);
    }

    @Override
    public ASTNode visitDictLiteral(PythonParser.DictLiteralContext ctx) {
        List<KeyValue> pairs = new ArrayList<>();
        int line = ctx.getStart().getLine();

        if (ctx.dictBody() != null) {
            for (PythonParser.PairContext p : ctx.dictBody().pair()) {
                // Keys are STRING tokens in the grammar; build a StringExpr directly.
                String raw = p.STRING().getText();
                String inner = raw.substring(1, raw.length() - 1);
                Expression key = new StringExpr(line, unescape(inner));
                Expression value = (Expression) visit(p.expr());
                pairs.add(new KeyValue(line, key, value));
            }
        }
        return new DictLiteral(line, pairs);
    }

    @Override
    public ASTNode visitMultDivExpr(PythonParser.MultDivExprContext ctx) {
        Expression left = (Expression) visit(ctx.expr(0));
        Expression right = (Expression) visit(ctx.expr(1));
        int line = ctx.getStart().getLine();

        return new BinaryExpr(line, left, ctx.op.getText(), right);
    }

    @Override
    public ASTNode visitAddSubExpr(PythonParser.AddSubExprContext ctx) {
        Expression left = (Expression) visit(ctx.expr(0));
        Expression right = (Expression) visit(ctx.expr(1));
        int line = ctx.getStart().getLine();

        return new BinaryExpr(line, left, ctx.op.getText(), right);
    }

    @Override
    public ASTNode visitLogicalExpr(PythonParser.LogicalExprContext ctx) {
        Expression left = (Expression) visit(ctx.expr(0));
        Expression right = (Expression) visit(ctx.expr(1));
        int line = ctx.getStart().getLine();
        return new LogicalExpr(line, left, ctx.op.getText(), right);
    }

    @Override
    public ASTNode visitComparisonExpr(PythonParser.ComparisonExprContext ctx) {
        Expression left = (Expression) visit(ctx.expr(0));
        Expression right = (Expression) visit(ctx.expr(1));
        int line = ctx.getStart().getLine();

        return new BinaryExpr(line, left, ctx.op.getText(), right);
    }

    @Override
    public ASTNode visitParenExpr(PythonParser.ParenExprContext ctx) {
        return visit(ctx.expr());
    }

    private String unescape(String s) {
        return s.replace("\\n", "\n").replace("\\t", "\t").replace("\\\"", "\"").replace("\\\\", "\\");
    }
}
