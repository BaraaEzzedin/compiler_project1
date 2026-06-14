package AST.PyFlask.Expressions;

import AST.PyFlask.Expression;
import SymbolTable.PyFlask.ASTVisitor;

public class StringExpr extends Expression {
    public String value;

    public StringExpr(int line, String value) {
        super(line, "StringExpr");
        this.value = value;
    }
    @Override
    public void accept(ASTVisitor visitor) {
        visitor.visit(this);
    }
    @Override
    public String toString() {
        return "\"" + value + "\"";
    }

    public String prettyPrint(int level) {
        return indent(level) + nodeName + " (line " + line + ") \"" + value + "\"\n";
    }
}