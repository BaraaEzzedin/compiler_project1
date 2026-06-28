package CodeGeneration;

import AST.PyFlask.Expressions.IdentifierExpr;
import AST.PyFlask.Statements.AssignStmt;
import SymbolTable.PyFlask.ASTVisitor;

public class RuntimeExtractor extends ASTVisitor {
    private final GenerationContext context;
    private final ExpressionEvaluator evaluator;

    public RuntimeExtractor(
            GenerationContext context) {

        this.context = context;
        this.evaluator =
                new ExpressionEvaluator(context);
    }

    @Override
    public void visit(AssignStmt node) {

        if (node.name instanceof IdentifierExpr id) {

            Object value =
                    evaluator.evaluate(node.value);

            context.put(
                    id.name,
                    value);
        }

        super.visit(node);
    }
}
