package AST.PyFlask.Statements;

import AST.PyFlask.Expression;
import AST.Statement;

public class ReturnStmt extends Statement {
    public Expression expr;
    public ReturnStmt(int line ,Expression expr) {
        super(line, "Return");
        this.expr = expr;
    }

    public String prettyPrint(int indent) {
        return indent(indent) + "Return" + " (line " + line + ")\n"
                + expr.prettyPrint(indent + 1);
    }
    @Override public String toString() { return "Return(" + expr + ")"; }
}