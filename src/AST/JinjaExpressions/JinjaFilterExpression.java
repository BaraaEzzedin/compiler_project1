package AST.JinjaExpressions;

import AST.JinjaExpression;

public class JinjaFilterExpression extends JinjaExpression {
    public JinjaExpression expression;
    public String filterName;

    public JinjaFilterExpression(int line, JinjaExpression expression, String filterName) {
        super(line, "JinjaFilterExpression");
        this.expression = expression;
        this.filterName = filterName;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        if (expression != null) {
            sb.append(expression.toString());
        }
        sb.append(" | ");
        if (filterName != null) {
            sb.append(filterName);
        }
        return sb.toString();
    }

    @Override
    public String prettyPrint(int level) {
        StringBuilder sb = new StringBuilder();
        sb.append(indent(level))
                .append(nodeName)
                .append(" '")
                .append(filterName != null ? filterName : "")
                .append("' (line ")
                .append(line)
                .append(")\n");

        if (expression != null) {
            sb.append(indent(level + 1)).append("Expression:\n");
            sb.append(expression.prettyPrint(level + 2));
        }

        return sb.toString();
    }
}