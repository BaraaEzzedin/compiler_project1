package AST.PyFlask.Expressions;

import AST.PyFlask.Expression;

public class StringExpr extends Expression {
    public String value;

    public StringExpr(int line, String value) {
        super(line, "StringExpr");
        this.value = value;
    }

    @Override
    public String toString() {
        return "\"" + value + "\"";
    }

    public String prettyPrint(int level) {
        return indent(level) + nodeName + " (line " + line + ") \"" + value + "\"\n";
    }
}