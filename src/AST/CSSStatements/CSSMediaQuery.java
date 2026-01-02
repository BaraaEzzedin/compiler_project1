package AST.CSSStatements;

import AST.ASTNode;

public class CSSMediaQuery extends ASTNode {
    public CSSMediaExpression expression;

    public CSSMediaQuery(int line, CSSMediaExpression expression) {
        super(line, "CSSMediaQuery");
        this.expression = expression;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("(");
        if (expression != null) {
            sb.append(expression.toString());
        }
        sb.append(")");
        return sb.toString();
    }

    @Override
    public String prettyPrint(int level) {
        StringBuilder sb = new StringBuilder();
        sb.append(indent(level))
                .append(nodeName)
                .append(" (line ")
                .append(line)
                .append(")\n");

        if (expression != null) {
            sb.append(indent(level + 1)).append("Expression:\n");
            sb.append(expression.prettyPrint(level + 2));
        }

        return sb.toString();
    }
}