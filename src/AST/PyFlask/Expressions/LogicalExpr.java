package AST.PyFlask.Expressions;

import AST.PyFlask.Expression;

public class LogicalExpr extends Expression {
    public Expression left;
    public String op;
    public Expression right;

    public LogicalExpr(int line, Expression left, String op, Expression right) {
        super(line, "LogicalExpr");
        this.left = left;
        this.op = op;
        this.right = right;
    }

    @Override
    public String toString() {
        return "(" + left + " " + op + " " + right + ")";
    }

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
