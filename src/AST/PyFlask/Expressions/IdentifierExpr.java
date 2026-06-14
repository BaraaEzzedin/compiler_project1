package AST.PyFlask.Expressions;

import AST.PyFlask.Expression;
import SymbolTable.PyFlask.ASTVisitor;

public class IdentifierExpr extends Expression {
    public String name;

    public IdentifierExpr(int line, String name) {
        super(line, "IdentifierExpr");
        this.name = name;
    }
    @Override
    public void accept(ASTVisitor visitor) {
        visitor.visit(this);
    }
    @Override
    public String toString() {
        return name;
    }

    public String prettyPrint(int indent) {
        return indent(indent) + nodeName + " (line " + line + ") " + name + "\n";
    }
}
