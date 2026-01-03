package AST.PyFlask.Expressions;

import AST.PyFlask.Expression;

import java.util.List;

public class FunctionCallExpr extends Expression {
    public Expression callee;
    public List<Expression> args;

    public FunctionCallExpr(int line, Expression callee, List<Expression> args) {
        super(line, "FunctionCallExpr");
        this.callee = callee;
        this.args = args;
    }

    // @Override public String toString() { return name + "(" + args + ")"; }
    @Override
    public String prettyPrint(int indent) {
        StringBuilder sb = new StringBuilder();
        sb.append(indent(indent)).append(nodeName).append(" (line ").append(line).append(")\n");
        if (callee != null) {
            sb.append(indent(indent + 1)).append("Callee:\n");
            sb.append(callee.prettyPrint(indent + 2));
        }
        if (!args.isEmpty()) {
            sb.append(indent(indent + 1)).append("Args:\n");
            for (Expression arg : args) {
                if(arg != null) {
                sb.append(arg.prettyPrint(indent + 2));
                }
            }
        }
        return sb.toString();
    }
}
