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

public class PythonCodeGeneration {
    private final StringBuilder code =
            new StringBuilder();

    private int indent = 0;

    public String generate(Program program) {

        visitProgram(program);

        return code.toString();
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
        emitIndent();

        if (node.isFrom) {

            emit("from ");
            emit(node.fromModule);
            emit(" import ");

        } else {

            emit("import ");

        }

        for (int i = 0; i < node.imports.size(); i++) {

            emit(node.imports.get(i));

            if (i < node.imports.size() - 1) {
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
