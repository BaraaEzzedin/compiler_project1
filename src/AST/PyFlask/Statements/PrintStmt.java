package AST.PyFlask.Statements;

import AST.PyFlask.Expression;
import AST.Statement;

public class PrintStmt extends Statement {
    public Expression expr;

    public PrintStmt(int line, Expression expr) {
        super(line, "Print");
        this.expr = expr;
    }

    @Override
    public String prettyPrint(int level) {
        StringBuilder sb = new StringBuilder();
        sb.append(indent(level)).append(nodeName).append(" (line ").append(line).append(")\n");
        sb.append(expr.prettyPrint(level + 1));
        return sb.toString();
    }

    @Override
    public String toString() {
        return "Print(" + expr + ")";
    }
}
