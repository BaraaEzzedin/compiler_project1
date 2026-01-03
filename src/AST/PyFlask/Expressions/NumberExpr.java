package AST.PyFlask.Expressions;

import AST.PyFlask.Expression;

public class NumberExpr extends Expression {
    public double value;

    public NumberExpr(int line, String value) {
        super(line, "NumberExpr");
        this.value = Double.parseDouble(value);
    }

//    @Override
//    public String toString() {
//        return value;
//    }

    public String prettyPrint(int level) {
        return indent(level) + nodeName + " (line " + line + ") " + value + "\n";
    }
}
