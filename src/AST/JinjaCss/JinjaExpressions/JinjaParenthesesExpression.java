package AST.JinjaCss.JinjaExpressions;

import AST.JinjaCss.JinjaExpression;

public class JinjaParenthesesExpression extends JinjaExpression {
    public JinjaExpression expression;
    public JinjaParenthesesExpression(int line, JinjaExpression expression) {
        super(line, "JinjaParenthesesExpression");
        this.expression=expression;
    }

    @Override
    public String toString() {
        if (expression == null) return "()";
        return "(" + expression.toString() + ")";
    }
    @Override
    public String prettyPrint(int level) {
        StringBuilder sb = new StringBuilder();
        sb.append(indent(level)).append(nodeName).append(" (line ").append(line).append(")\n");
        if (expression != null) {
            sb.append(indent(level + 1)).append("Expression:\n");
            sb.append(expression.prettyPrint(level + 2));
        }
        return sb.toString();
    }
}
