package AST.PyFlask.Expressions;

import AST.PyFlask.Expression;
import SymbolTable.PyFlask.ASTVisitor;

public class NumberExpr extends Expression {
    public double value;

    public NumberExpr(int line, String value) {
        super(line, "NumberExpr");
        this.value = Double.parseDouble(value);
    }
    @Override
    public void accept(ASTVisitor visitor) {
        visitor.visit(this);
    }
//    @Override
//    public String toString() {
//        return value;
//    }

    public String prettyPrint(int level) {
        return indent(level) + nodeName + " (line " + line + ") " + value + "\n";
    }
}
