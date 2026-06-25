package AST.PyFlask.Expressions;

import AST.PyFlask.Expression;
import SymbolTable.PyFlask.ASTVisitor;

public class BooleanExpr extends Expression {
    public boolean value;

    public BooleanExpr(int line, boolean value) {
        super(line, "BooleanExpr");
        this.value = value;
    }
    @Override
    public void accept(ASTVisitor visitor) {
        visitor.visit(this);
    }
    @Override
    public String toString() {
        return Boolean.toString(value);
    }

    public String prettyPrint(int level) {
        return indent(level) + nodeName + " (line " + line + ") " + value + "\n";
    }
}
