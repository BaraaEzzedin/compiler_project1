package CodeGeneration;

import AST.Program;
import AST.PyFlask.Block;
import AST.PyFlask.Expression;
import AST.PyFlask.Expressions.*;
import AST.PyFlask.Statements.*;
import AST.Statement;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.TreeSet;

public class PythonCodeGeneration {
    /**
     * Module the generated render functions live in.
     */
    public static final String RENDER_MODULE = "render_html";

    private final StringBuilder code =
            new StringBuilder();

    private int indent = 0;

    /**
     * Template file name to the render function compiled for it, e.g.
     * "list.html" -> "render_list". Every render_template call is redirected to
     * one of these, which is how Jinja leaves the generated program.
     */
    private final Map<String, String> renderFunctions;

    public PythonCodeGeneration() {
        this(new LinkedHashMap<>());
    }

    public PythonCodeGeneration(Map<String, String> renderFunctions) {
        this.renderFunctions = renderFunctions;
    }

    public String generate(Program program) {

        emitRenderImport();

        visitProgram(program);

        return code.toString();
    }

    private void emitRenderImport() {

        if (renderFunctions.isEmpty()) {
            return;
        }

        emit("from ");
        emit(RENDER_MODULE);
        emit(" import ");
        emit(String.join(", ", new TreeSet<>(renderFunctions.values())));
        emit("\n");
    }

    public void visitProgram(Program program) {
        for (Statement stmt : program.statements) {
            visitStatement(stmt);
        }
    }

    public void visitStatement(Statement stmt) {

        if (stmt instanceof ImportStmt node) {

            visitImport(node);

        } else if (stmt instanceof AssignStmt node) {
            visitAssign(node);

        } else if (stmt instanceof FunctionDef node) {

            visitFunction(node);

        } else if (stmt instanceof ReturnStmt node) {

            visitReturn(node);

        } else if (stmt instanceof ExprStmt node) {
            emitIndent();
            visitExpression(node.expr);
            emit("\n");
        } else if (stmt instanceof PrintStmt node) {
            emitIndent();
            emit("print(");
            visitExpression(node.expr);
            emit(")\n");
        } else if (stmt instanceof IfStmt node) {
            visitIf(node);
        } else if (stmt instanceof ForStmt node) {
            visitFor(node);
        } else if (stmt instanceof GlobalStmt node) {
            visitGlobal(node);
        }
    }

    private void visitGlobal(GlobalStmt node) {
        emitIndent();

        emit("global ");

        for (int i = 0; i < node.names.size(); i++) {

            emit(node.names.get(i));

            if (i < node.names.size() - 1) {
                emit(", ");
            }
        }

        emit("\n");
    }

    private void visitFor(ForStmt node) {

        emitIndent();

        emit("for ");

        visitExpression(node.loopVariable);

        emit(" in ");

        visitExpression(node.iterable);

        emit(":\n");

        indent();

        visitBlock(node.body);

        outdent();

        emit("\n");
    }

    private void visitIf(IfStmt node) {
        emitIndent();

        emit("if ");

        visitExpression(node.condition);

        emit(":\n");

        indent();

        visitBlock(node.thenBlock);

        outdent();

        if (node.elseBlock != null) {
            emitIndent();

            emit("else:\n");

            indent();
            visitBlock(node.elseBlock);
            outdent();
        }
        emit("\n");
    }


    private void visitFunction(FunctionDef node) {
        if (node.decorators != null) {
            for (DecoratorExpr decorator : node.decorators) {
                visitDecoratorExpr(decorator);
            }
        }
        emit("def ");
        emit(node.name);
        emit("(");

        for (int i = 0; i < node.parameters.size(); i++) {

            emit(node.parameters.get(i));

            if (i != node.parameters.size() - 1)
                emit(", ");

        }

        emit("):\n");

        indent();

        visitBlock(node.body);

        outdent();

        emit("\n");
    }

    private void visitBlock(Block block) {
        if (block == null)
            return;

        for (Statement stmt : block.getStatements()) {

            visitStatement(stmt);

        }
    }

    private void visitImport(ImportStmt node) {

        List<String> imports = new ArrayList<>(node.imports);

        // the compiled templates replaced it, so Flask's renderer is no longer needed
        if (node.isFrom && "flask".equals(node.fromModule) && !renderFunctions.isEmpty()) {
            imports.remove("render_template");
        }

        if (imports.isEmpty()) {
            return;
        }

        emitIndent();

        if (node.isFrom) {

            emit("from ");
            emit(node.fromModule);
            emit(" import ");

        } else {

            emit("import ");

        }

        for (int i = 0; i < imports.size(); i++) {

            emit(imports.get(i));

            if (i < imports.size() - 1) {
                emit(", ");
            }
        }

        emit("\n");
    }

    private void visitAssign(AssignStmt node) {

        emitIndent();

        visitExpression(node.name);

        emit(" = ");

        visitExpression(node.value);

        emit("\n");
    }

    private void visitExpression(Expression expr) {
        if (expr instanceof IdentifierExpr node) {
            emit(node.name);
        } else if (expr instanceof StringExpr node) {
            emit("\"");
            emit(node.value);
            emit("\"");
        } else if (expr instanceof NumberExpr node) {
            emit(formatNumber(node.value));
        } else if (expr instanceof BooleanExpr node) {
            emit(node.value ? "True" : "False");
        } else if (expr instanceof DictLiteral node) {
            visitDictLiteral(node);
        } else if (expr instanceof ArrayLiteral node) {
            visitArray(node);
        } else if (expr instanceof FunctionCallExpr node) {
            visitFunctionCallExpr(node);
        } else if (expr instanceof AttributeExpr node) {
            visitAttributeExpr(node);
        } else if (expr instanceof DecoratorExpr node) {
            visitDecoratorExpr(node);
        } else if (expr instanceof BinaryExpr node) {
            visitBinaryExpr(node);
        } else if (expr instanceof LogicalExpr node) {
            visitLogicalExpr(node);
        } else if (expr instanceof IndexExpr node) {
            visitIndexExpr(node);
        } else if (expr instanceof GeneratorExpr node) {
            visitGeneratorExpr(node);
        } else if (expr instanceof TupleExpr node) {
            visitTupleExpr(node);
        }
    }

    private void visitTupleExpr(TupleExpr node) {
        for (int i = 0; i < node.elements.size(); i++) {

            visitExpression(node.elements.get(i));

            if (i < node.elements.size() - 1) {
                emit(", ");
            }
        }
    }

    private void visitGeneratorExpr(GeneratorExpr node) {
        emit("(");

        visitExpression(node.yieldVar);

        emit(" for ");

        visitExpression(node.loopVar);

        emit(" in ");

        visitExpression(node.iterable);

        if (node.filter != null) {
            emit(" if ");
            visitExpression(node.filter);
        }

        emit(")");
    }

    private void visitIndexExpr(IndexExpr node) {
        visitExpression(node.array);

        emit("[");
        visitExpression(node.index);
        emit("]");
    }

    private void visitLogicalExpr(LogicalExpr node) {
        visitExpression(node.left);

        emit(" ");
        emit(node.op);
        emit(" ");

        visitExpression(node.right);
    }

    private void visitBinaryExpr(BinaryExpr node) {
        visitExpression(node.left);

        emit(" ");
        emit(node.op);
        emit(" ");

        visitExpression(node.right);

    }

    private void visitDecoratorExpr(DecoratorExpr node) {

        emitIndent();

        emit("@");

        emit(String.join(".", node.nameParts));

        emit("(");

        for (int i = 0; i < node.arguments.size(); i++) {

            Expression arg = node.arguments.get(i);

            if (arg instanceof KeyValue kv) {
                visitKeyValue(kv);
            } else {
                visitExpression(arg);
            }

            if (i < node.arguments.size() - 1) {
                emit(", ");
            }
        }

        emit(")");

        emit("\n");
    }

    private void visitAttributeExpr(AttributeExpr node) {

        visitExpression(node.target);

        emit(".");

        visitExpression(node.attr);
    }

    private void visitFunctionCallExpr(FunctionCallExpr node) {

        if (visitRenderTemplateCall(node)) {
            return;
        }

        visitExpression(node.callee);

        emit("(");

        if (node.args != null) {

            for (int i = 0; i < node.args.size(); i++) {
                Expression arg = node.args.get(i);

                if (arg instanceof KeyValue kv) {
                    visitKeyValue(kv);
                } else {
                    visitExpression(arg);
                }

                if (i != node.args.size() - 1) {
                    emit(", ");
                }
            }
        }
        emit(")");
    }

    /**
     * Rewrites render_template("list.html", products=products) as the call to the
     * function compiled from that template, dropping the template name because the
     * generated function already knows which file it rewrites.
     *
     * @return true when the call was handled here
     */
    private boolean visitRenderTemplateCall(FunctionCallExpr node) {

        if (!(node.callee instanceof IdentifierExpr callee)
                || !callee.name.equals("render_template")) {
            return false;
        }

        if (node.args == null || node.args.isEmpty()
                || !(node.args.get(0) instanceof StringExpr template)) {
            return false;
        }

        String function = renderFunctions.get(template.value);

        if (function == null) {
            return false;
        }

        emit(function);
        emit("(");

        for (int i = 1; i < node.args.size(); i++) {

            Expression arg = node.args.get(i);

            if (arg instanceof KeyValue kv) {
                visitKeyValue(kv);
            } else {
                visitExpression(arg);
            }

            if (i != node.args.size() - 1) {
                emit(", ");
            }
        }

        emit(")");

        return true;
    }

    private void visitKeyValue(KeyValue kv) {
        visitExpression(kv.key);

        emit("=");

        visitExpression(kv.value);
    }

    private void visitReturn(ReturnStmt node) {

        emitIndent();

        emit("return ");

        visitExpression(node.expr);

        emit("\n");
    }

    private void visitDictLiteral(DictLiteral node) {

        emit("{");

        for (int i = 0; i < node.entries.size(); i++) {

            visitDictionaryKeyValue(node.entries.get(i));

            if (i != node.entries.size() - 1)
                emit(", ");

        }

        emit("}");
    }

    private void visitDictionaryKeyValue(KeyValue kv) {
        visitExpression(kv.key);

        emit(": ");

        visitExpression(kv.value);
    }

    private void visitArray(ArrayLiteral node) {

        emit("[");

        for (int i = 0; i < node.elements.size(); i++) {

            visitExpression(node.elements.get(i));

            if (i != node.elements.size() - 1)
                emit(", ");

        }

        emit("]");
    }

    private void emitIndent() {
        for (int i = 0; i < indent; i++) {
            emit("    ");
        }
    }

    private void emit(String text) {

        code.append(text);

    }

    private void emitLine(String text) {

        for (int i = 0; i < indent; i++)
            code.append("    ");

        code.append(text);

        code.append("\n");

    }

    private String formatNumber(double value) {

        if (value == Math.floor(value)) {
            return String.valueOf((int) value);
        }

        return String.valueOf(value);
    }

    private void indent() {
        indent++;
    }

    private void outdent() {
        indent--;
    }

    public void writeToFile(String filename) throws IOException {
        Files.createDirectories(Path.of("/home/mohee/compiler_project1/compiler_output/"));
        Files.writeString(Path.of("/home/mohee/compiler_project1/compiler_output/", filename), code.toString());
    }
}
