package Generator;

import AST.PyFlask.Block;
import AST.PyFlask.Expression;
import AST.PyFlask.Expressions.*;
import AST.PyFlask.Statements.*;
import AST.Program;
import AST.Statement;
import SymbolTable.PyFlask.ASTVisitor;
import SymbolTable.PyFlask.TemplateContext;

import java.util.List;

public class PythonCodeGenerator extends ASTVisitor {

    private final CodeGenerationContext context;
    private final StringBuilder topLevel = new StringBuilder();
    private final StringBuilder routes = new StringBuilder();

    private final StringBuilder extraImports = new StringBuilder();

    private boolean insideRoute = false;
    private int indentLevel = 1;

    public PythonCodeGenerator(CodeGenerationContext context) {
        this.context = context;
    }

    public String generate() {
        context.pythonAst.accept(this);
        return buildAppPy();
    }

    private String buildAppPy() {
        StringBuilder out = new StringBuilder();
        out.append("from flask import Flask, render_template, redirect, url_for, request\n");
        if (extraImports.length() > 0) {
            out.append(extraImports);
        }
        out.append("\n");
        out.append("app = Flask(__name__)\n\n");
        out.append(topLevel);
        if (topLevel.length() > 0) {
            out.append("\n");
        }
        out.append(routes);
        out.append("\nif __name__ == \"__main__\":\n");
        out.append("    app.run(debug=True)\n");
        return out.toString();
    }

    private String indent() {
        return "    ".repeat(indentLevel);
    }

    @Override
    public void visit(Program node) {
        visitStatements(node.getStatements());
    }

    @Override
    public void visit(Block node) {
        visitStatements(node.getStatements());
    }

    private void visitStatements(List<Statement> statements) {
        if (statements == null) {
            return;
        }
        int i = 0;
        while (i < statements.size()) {
            Statement stmt = statements.get(i);
            String bareName = bareIdentifierName(stmt);

            if ("global".equals(bareName) && i + 1 < statements.size()) {
                String target = bareIdentifierName(statements.get(i + 1));
                if (target != null) {
                    if (insideRoute) {
                        routes.append(indent()).append("global ").append(target).append("\n");
                    }
                    i += 2;
                    continue;
                }
            }

            stmt.accept(this);
            i++;
        }
    }

    private String bareIdentifierName(Statement stmt) {
        if (stmt instanceof ExprStmt exprStmt && exprStmt.expr instanceof IdentifierExpr id) {
            return id.name;
        }
        return null;
    }
    @Override
    public void visit(ImportStmt node) {
        if (node.isFrom) {
            if (node.fromModule != null && node.fromModule.equals("flask")) {
                return;
            }
            extraImports.append("from ")
                    .append(node.fromModule)
                    .append(" import ")
                    .append(String.join(", ", node.imports))
                    .append("\n");
        } else {
            if (node.fromModule != null && node.fromModule.equals("flask")) {
                return;
            }
            extraImports.append("import ").append(node.fromModule).append("\n");
        }
    }

    @Override
    public void visit(AssignStmt node) {
        if (insideRoute) {
            routes.append(indent())
                    .append(renderTarget(node.name))
                    .append(" = ")
                    .append(renderExpr(node.value))
                    .append("\n");
            return;
        }

        if (node.name instanceof IdentifierExpr id) {
            if (id.name.equals("app") && isFlaskConstructorCall(node.value)) {
                return;
            }
            context.topLevelVariables.add(id.name);
            topLevel.append(id.name)
                    .append(" = ")
                    .append(renderExpr(node.value))
                    .append("\n");
        }
    }

    private boolean isFlaskConstructorCall(Expression value) {
        return value instanceof FunctionCallExpr call
                && call.callee instanceof IdentifierExpr callee
                && callee.name.equals("Flask");
    }

    @Override
    public void visit(ArrayAssignStmt node) {
        String line = renderExpr(node.array) + "[" + renderExpr(node.index) + "] = " + renderExpr(node.value);
        if (insideRoute) {
            routes.append(indent()).append(line).append("\n");
        } else {
            topLevel.append(line).append("\n");
        }
    }

    @Override
    public void visit(FunctionDef node) {
        DecoratorExpr routeDecorator = findRouteDecorator(node);

        if (routeDecorator != null) {
            String path = routePath(routeDecorator);
            routes.append("@app.route(\"").append(path).append("\")\n");
        }
        routes.append("def ").append(node.name).append("(")
                .append(String.join(", ", node.parameters))
                .append("):\n");

        boolean prevInsideRoute = insideRoute;
        insideRoute = true;
        indentLevel++;

        int before = routes.length();
        if (node.body != null) {
            node.body.accept(this);
        }
        if (routes.length() == before) {
            routes.append(indent()).append("pass\n");
        }

        indentLevel--;
        insideRoute = prevInsideRoute;
        routes.append("\n");
    }

    private DecoratorExpr findRouteDecorator(FunctionDef node) {
        if (node.decorators == null) {
            return null;
        }
        for (DecoratorExpr d : node.decorators) {
            if (d.nameParts != null && d.nameParts.size() >= 2
                    && d.nameParts.get(0).equals("app")
                    && d.nameParts.get(1).equals("route")) {
                return d;
            }
        }
        return null;
    }


    private String routePath(DecoratorExpr decorator) {
        if (decorator.arguments != null && !decorator.arguments.isEmpty()) {
            Expression first = decorator.arguments.get(0);
            if (first instanceof StringExpr s) {
                return s.value;
            }
        }
        return "/";
    }


    @Override
    public void visit(ReturnStmt node) {
        if (!insideRoute) {
            return;
        }
        routes.append(indent()).append("return ").append(renderExpr(node.expr)).append("\n");
    }

    @Override
    public void visit(IfStmt node) {
        if (!insideRoute) {
            super.visit(node);
            return;
        }
        routes.append(indent()).append("if ").append(renderExpr(node.condition)).append(":\n");
        indentLevel++;
        int before = routes.length();
        if (node.thenBlock != null) {
            node.thenBlock.accept(this);
        }
        if (routes.length() == before) {
            routes.append(indent()).append("pass\n");
        }
        indentLevel--;

        if (node.elseBlock != null) {
            routes.append(indent()).append("else:\n");
            indentLevel++;
            int beforeElse = routes.length();
            node.elseBlock.accept(this);
            if (routes.length() == beforeElse) {
                routes.append(indent()).append("pass\n");
            }
            indentLevel--;
        }
    }

    @Override
    public void visit(ForStmt node) {
        if (!insideRoute) {
            super.visit(node);
            return;
        }
        routes.append(indent())
                .append("for ")
                .append(renderExpr(node.loopVariable))
                .append(" in ")
                .append(renderExpr(node.iterable))
                .append(":\n");
        indentLevel++;
        int before = routes.length();
        if (node.body != null) {
            node.body.accept(this);
        }
        if (routes.length() == before) {
            routes.append(indent()).append("pass\n");
        }
        indentLevel--;
    }

    @Override
    public void visit(ExprStmt node) {
        if (!insideRoute || node.expr == null) {
            return;
        }
        routes.append(indent()).append(renderExpr(node.expr)).append("\n");
    }

    @Override
    public void visit(PrintStmt node) {
        if (!insideRoute) {
            return;
        }
        routes.append(indent()).append("print(").append(renderExpr(node.expr)).append(")\n");
    }

    @Override
    public void visit(FunctionCallExpr node) {
        if (node.callee instanceof IdentifierExpr id && id.name.equals("render_template")) {
            TemplateContext ctx = new TemplateContext();
            if (node.args != null && !node.args.isEmpty()) {
                Expression first = node.args.get(0);
                if (first instanceof StringExpr s) {
                    ctx.templateName = s.value;
                }
                for (Expression arg : node.args) {
                    if (arg instanceof KeyValue kv && kv.key instanceof IdentifierExpr keyId) {
                        ctx.passedVariables.add(keyId.name);
                    }
                }
            }
            if (ctx.templateName != null) {
                context.linkCallSite(ctx);
            }
        }
        super.visit(node);
    }

    private String renderTarget(Expression target) {
        return renderExpr(target);
    }

    private String renderExpr(Expression expr) {
        if (expr == null) {
            return "None";
        }
        if (expr instanceof IdentifierExpr id) {
            return id.name;
        }
        if (expr instanceof StringExpr s) {
            return "\"" + s.value.replace("\"", "\\\"") + "\"";
        }
        if (expr instanceof NumberExpr n) {
            double v = n.value;
            if (v == Math.floor(v) && !Double.isInfinite(v)) {
                return Long.toString((long) v);
            }
            return Double.toString(v);
        }
        if (expr instanceof BooleanExpr b) {
            return b.value ? "True" : "False";
        }
        if (expr instanceof ArrayLiteral arr) {
            StringBuilder sb = new StringBuilder("[");
            for (int i = 0; i < arr.elements.size(); i++) {
                if (i > 0) sb.append(", ");
                sb.append(renderExpr(arr.elements.get(i)));
            }
            return sb.append("]").toString();
        }
        if (expr instanceof DictLiteral dict) {
            StringBuilder sb = new StringBuilder("{");
            for (int i = 0; i < dict.entries.size(); i++) {
                if (i > 0) sb.append(", ");
                KeyValue kv = dict.entries.get(i);
                sb.append(renderExpr(kv.key)).append(": ").append(renderExpr(kv.value));
            }
            return sb.append("}").toString();
        }
        if (expr instanceof KeyValue kv) {
            return renderExpr(kv.key) + "=" + renderExpr(kv.value);
        }
        if (expr instanceof BinaryExpr bin) {
            return renderExpr(bin.left) + " " + bin.op + " " + renderExpr(bin.right);
        }
        if (expr instanceof LogicalExpr log) {
            return renderExpr(log.left) + " " + log.op + " " + renderExpr(log.right);
        }
        if (expr instanceof AttributeExpr attr) {
            return renderExpr(attr.target) + "." + renderExpr(attr.attr);
        }
        if (expr instanceof IndexExpr idx) {
            return renderExpr(idx.array) + "[" + renderExpr(idx.index) + "]";
        }
        if (expr instanceof FunctionCallExpr call) {
            StringBuilder sb = new StringBuilder(renderExpr(call.callee)).append("(");
            if (call.args != null) {
                for (int i = 0; i < call.args.size(); i++) {
                    if (i > 0) sb.append(", ");
                    sb.append(renderExpr(call.args.get(i)));
                }
            }
            return sb.append(")").toString();
        }
        if (expr instanceof GeneratorExpr gen) {
            StringBuilder sb = new StringBuilder("(")
                    .append(renderExpr(gen.yieldVar))
                    .append(" for ")
                    .append(renderExpr(gen.loopVar))
                    .append(" in ")
                    .append(renderExpr(gen.iterable));
            if (gen.filter != null) {
                sb.append(" if ").append(renderExpr(gen.filter));
            }
            return sb.append(")").toString();
        }
        return expr.toString();
    }
}