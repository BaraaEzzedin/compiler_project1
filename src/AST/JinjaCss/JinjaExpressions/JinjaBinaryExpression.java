package AST.JinjaCss.JinjaExpressions;

import AST.JinjaCss.JinjaExpression;

public class JinjaBinaryExpression extends JinjaExpression {
    public JinjaExpression left;
    public JinjaExpression right;
    public String op;
    public JinjaBinaryExpression(int line, JinjaExpression left, JinjaExpression right, String op) {
        super(line, "JinjaBinaryExpression");
        this.left=left;
        this.right=right;
        this.op=op;
    }
    public String toString() {
        return "(" + left + " " + op + " " + right + ")";
    }
    @Override
    public String prettyPrint(int level) {
        StringBuilder sb = new StringBuilder();
        sb.append(indent(level)).append(nodeName).append(" '").append(op).append("' (line ").append(line).append(")\n");
        sb.append(indent(level + 1)).append("Left:\n");
        sb.append(left.prettyPrint(level + 2));
        sb.append(indent(level + 1)).append("Right:\n");
        sb.append(right.prettyPrint(level + 2));
        return sb.toString();
    }
}
