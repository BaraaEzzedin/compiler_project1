package AST.PyFlask.Statements;

import AST.PyFlask.Expression;
import AST.Statement;
import SymbolTable.PyFlask.ASTVisitor;

public class ReturnStmt extends Statement {
    public Expression expr;
    public ReturnStmt(int line ,Expression expr) {
        super(line, "Return");
        this.expr = expr;
    }
    @Override
    public void accept(ASTVisitor visitor) {
        visitor.visit(this);
    }

    public String prettyPrint(int indent) {
        return indent(indent) + "Return" + " (line " + line + ")\n"
                + expr.prettyPrint(indent + 1);
    }
    @Override public String toString() { return "Return(" + expr + ")"; }
}