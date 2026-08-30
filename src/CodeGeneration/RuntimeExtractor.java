package CodeGeneration;

import AST.PyFlask.Expression;
import AST.PyFlask.Expressions.FunctionCallExpr;
import AST.PyFlask.Expressions.IdentifierExpr;
import AST.PyFlask.Expressions.KeyValue;
import AST.PyFlask.Expressions.StringExpr;
import AST.PyFlask.Statements.AssignStmt;
import SymbolTable.PyFlask.ASTVisitor;

import java.util.List;

public class RuntimeExtractor extends ASTVisitor {
    private final GenerationContext currentContext;
    private final List<TemplateInvocation> templateInvocations;
    private final ExpressionEvaluator evaluator;

    public RuntimeExtractor(
            List<TemplateInvocation> templateInvocations) {
        this.currentContext = new GenerationContext();
        this.templateInvocations = templateInvocations;
        this.evaluator = new ExpressionEvaluator(currentContext);
    }

    @Override
    public void visit(AssignStmt node) {

        if (node.name instanceof IdentifierExpr id) {

            Object value =
                    evaluator.evaluate(node.value);

            currentContext.put(
                    id.name,
                    value);
        }

        super.visit(node);
    }


    @Override
    public void visit(FunctionCallExpr node) {
        if (!(node.callee instanceof IdentifierExpr id)) {
            super.visit(node);
            return;
        }
        if (id.name.equals("render_template")) {
            String templateName = null;
            GenerationContext templateContext =
                    new GenerationContext();
            if (node.args != null && !node.args.isEmpty()) {

                Expression firstArg =
                        node.args.get(0);

                if (firstArg instanceof StringExpr s) {
                    templateName = s.value;
                }
            }
            String templateVariable = null;
            String pythonVariable = null;
            if (node.args != null) {
                for (Expression arg : node.args) {

                    if (arg instanceof KeyValue kv) {

                        if (kv.key instanceof IdentifierExpr key) {

                            Object runtimeValue =
                                    evaluator.evaluate(kv.value);

                            templateContext.put(
                                    key.name,
                                    runtimeValue
                            );
                        }
                    }
                }
                templateInvocations.add(

                        new TemplateInvocation(
                                templateName,
                                templateContext
                        )
                );
                super.visit(node);
            }
        }
    }
}
