package AST.PyFlask.Expressions;

import AST.PyFlask.Expression;

import java.util.List;

public class ArrayLiteral extends Expression {
    public List<Expression> elements;

    public ArrayLiteral(int line, List<Expression> elements) {
        super(line, "ArrayLiteral");
        this.elements = elements;
    }

    @Override
    public String toString() {
        return elements.toString();
    }

    public String prettyPrint(int level) {
        StringBuilder sb = new StringBuilder();
        sb.append(indent(level)).append(nodeName).append(" (line ").append(line).append(")\n");
        for (Expression el : elements) {
            sb.append(el.prettyPrint(level + 1));
        }
        return sb.toString();
    }
}
