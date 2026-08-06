package SymbolTable.PyFlask;

import AST.PyFlask.Expression;
import AST.PyFlask.Expressions.*;
import AST.PyFlask.Statements.AssignStmt;
import AST.PyFlask.Statements.IfStmt;
import SymbolTable.JijnaCss.JinjaTemplateInfo;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class SemanticAnalyzer extends ASTVisitor {
    private final SymbolTable symbolTable;

    private static List<CompilerError> errors = new ArrayList<>();

    private final List<TemplateContext> templateContexts = new ArrayList<>();


    public List<CompilerError> getErrors() {
        return errors;
    }

    public static void report(int line, String message) {
        errors.add(new CompilerError(line, message));
    }

    public SemanticAnalyzer(
            SymbolTable symbolTable) {

        this.symbolTable = symbolTable;
    }

    public Type inferType(Expression expr) {
        if (expr instanceof NumberExpr)
            return Type.FLOAT;
        if (expr instanceof StringExpr)
            return Type.STRING;
        if (expr instanceof BooleanExpr)
            return Type.BOOL;
        if (expr instanceof ArrayLiteral)
            return Type.LIST;
        if (expr instanceof DictLiteral)
            return Type.DICT;
        if (expr instanceof IdentifierExpr id) {
            Symbol symbol =
                    id.getScope()
                            .resolve(id.name);
            if (symbol != null)
                return symbol.getType();
        }
        if (expr instanceof FunctionCallExpr id) {
            if (id.callee instanceof IdentifierExpr id2) {
                if (id2.name.equals("len"))
                    return Type.FLOAT;
            }
        }
        return Type.UNKNOWN;
    }

    private int levenshtein(String a, String b) {

        int[][] dp =
                new int[a.length() + 1]
                        [b.length() + 1];

        for (int i = 0; i <= a.length(); i++)
            dp[i][0] = i;

        for (int j = 0; j <= b.length(); j++)
            dp[0][j] = j;

        for (int i = 1; i <= a.length(); i++) {

            for (int j = 1; j <= b.length(); j++) {

                int cost =
                        a.charAt(i - 1) ==
                                b.charAt(j - 1)
                                ? 0 : 1;

                dp[i][j] =
                        Math.min(
                                Math.min(
                                        dp[i - 1][j] + 1,
                                        dp[i][j - 1] + 1
                                ),
                                dp[i - 1][j - 1] + cost
                        );
            }
        }

        return dp[a.length()][b.length()];
    }

    private String findClosestName(
            Scope scope,
            String unknownName) {

        String bestMatch = null;
        int bestDistance = Integer.MAX_VALUE;

        Scope current = scope;

        while (current != null) {

            for (Symbol symbol :
                    current.getSymbols()) {

                int distance =
                        levenshtein(
                                unknownName,
                                symbol.getName());

                if (distance < bestDistance) {

                    bestDistance = distance;
                    bestMatch = symbol.getName();
                }
            }

            current = current.getParent();
        }

        return bestDistance <= 2
                ? bestMatch
                : null;
    }

    @Override
    public void visit(AssignStmt node) {
        if (!(node.name instanceof IdentifierExpr id))
            return;

        Symbol symbol = node.getScope().resolve(id.name);
        Type newType = inferType(node.value);

        if (symbol.getType() == null) {
            symbol.setType(newType);
        } else if (symbol.getType() != newType) {
            report(
                    node.line,
                    "Type mismatch for variable '"
                            + id.name
                            + "'"
            );
        }

        if (node.value != null) {
            node.value.accept(this);
        }
    }

    @Override
    public void visit(FunctionCallExpr node) {
        if (!(node.callee instanceof IdentifierExpr id)) {
            super.visit(node);
            return;
        }
        if (id.name.equals("render_template")) {
            TemplateContext ctx = new TemplateContext();
            if (node.args != null && !node.args.isEmpty()) {

                Expression firstArg =
                        node.args.get(0);

                if (firstArg instanceof StringExpr s) {
                    ctx.templateName = s.value;
                }
            }
            if (node.args != null) {
                for (Expression arg : node.args) {

                    if (arg instanceof KeyValue kv) {

                        if (kv.key instanceof IdentifierExpr key && kv.value instanceof IdentifierExpr value) {

                            ctx.passedVariables
                                    .put(key.name, value.name);
                        }
                    }
                }
                templateContexts.add(ctx);
                super.visit(node);
                return;
            }
        }
        Symbol function =
                node.getScope()
                        .resolve(id.name);

        if (function == null) {
            super.visit(node);
            return;
        }

        if (function.getKind() == SymbolKind.BUILTIN) {
            super.visit(node);
            return;
        }

        if (function.getKind() == SymbolKind.FUNCTION) {
            int expected =
                    function.parameterCount;

            int actual =
                    node.args == null
                            ? 0
                            : node.args.size();
            if (expected != actual) {
                report(node.line, "Function '" +
                        id.name +
                        "' expects " +
                        expected +
                        " arguments but got " +
                        actual);
            }
        }
        super.visit(node);
    }

    @Override
    public void visit(BinaryExpr node) {
        Type left =
                inferType(node.left);

        Type right =
                inferType(node.right);

        if (node.op.equals("+")) {

            if (left != right) {

                report(
                        node.line,
                        "Cannot apply '+' to "
                                + left
                                + " and "
                                + right
                );
            }
        }
        super.visit(node);
    }

    @Override
    public void visit(IfStmt node) {
        if (node.condition instanceof BooleanExpr b) {
            if (b.value) {
                node.thenBlock.accept(this);
            } else {
                if (node.elseBlock != null)
                    node.elseBlock.accept(this);
            }
            return;
        }
        super.visit(node);
    }

    @Override
    public void visit(KeyValue node) {
        if (node.value != null) {
            node.value.accept(this);
        }
    }

    @Override
    public void visit(IdentifierExpr node) {
        if (node.getScope() == null) {
            System.out.println(
                    "NULL SCOPE IDENTIFIER -> "
                            + node.name
                            + " line "
                            + node.line
            );

            return;
        }
        Symbol symbol =
                node.getScope()
                        .resolve(node.name);
        if (symbol == null) {
            String suggestion = findClosestName(node.getScope(), node.name);

            if (suggestion != null) {
                report(
                        node.line,
                        "Undefined variable '"
                                + node.name
                                + "'. Did you mean '"
                                + suggestion
                                + "'?"
                );

            } else {

                report(
                        node.line,
                        "Undefined variable '"
                                + node.name
                                + "'"
                );
            }
        }
    }

//    public void printTemplateContexts() {
//
//        System.out.println("\n=== Flask Template Contexts ===");
//
//        if (templateContexts.isEmpty()) {
//            System.out.println("No render_template() calls found.");
//            return;
//        }
//
//        for (TemplateContext ctx : templateContexts) {
//
//            System.out.println(
//                    "Template: " +
//                            ctx.templateName);
//
//            System.out.println(
//                    "Passed Variables:");
//
//            if (ctx.passedVariables.isEmpty()) {
//
//                System.out.println(
//                        "  <none>");
//
//            } else {
//
//                for (String variable :
//                        ctx.passedVariables) {
//
//                    System.out.println(
//                            "  " + variable);
//                }
//            }
//
//            System.out.println();
//        }
//    }

    public void validateTemplateVariables(
            Map<String, JinjaTemplateInfo> templates) {

        for (JinjaTemplateInfo info : templates.values()) {

            System.out.println(
                    "\nTemplate: " +
                            info.getTemplateName());

            System.out.println(
                    info.getTemplateVariables());
        }
        for (TemplateContext ctx : templateContexts) {

            JinjaTemplateInfo template =
                    templates.get(
                            ctx.templateName);
            // Skip if this render_template call is for another template
            if (!ctx.templateName.equals(
                    template.getTemplateName())) {
                continue;
            }

            Set<String> usedVariables =
                    template.getTemplateVariables();

            for (String variable : usedVariables) {

                if (!ctx.passedVariables.containsKey(variable)) {

                    report(
                            0,
                            "Template variable '" +
                                    variable +
                                    "' is used in template '" +
                                    ctx.templateName +
                                    "' but was not passed to render_template()"
                    );
                }
            }
        }
    }

    public String getReport() {

        StringBuilder sb = new StringBuilder();

        sb.append("Semantic Errors:")
                .append(System.lineSeparator());

        List<CompilerError> errors = this.getErrors();

        if (errors.isEmpty()) {

            sb.append("No semantic errors.")
                    .append(System.lineSeparator());

            return sb.toString();
        }

        for (CompilerError error : errors) {

            sb.append(error)
                    .append(System.lineSeparator());
        }

        sb.append(System.lineSeparator())
                .append("Total: ")
                .append(errors.size())
                .append(" error(s)")
                .append(System.lineSeparator());

        return sb.toString();
    }

    public void printErrors() {
        System.out.println("\nSemantic Errors:");
        if (this.getErrors().isEmpty()) {
            System.out.println("No semantic errors.");
        } else {
            for (CompilerError error : this.getErrors()) {
                System.err.println(error);
            }
        }
    }
}
