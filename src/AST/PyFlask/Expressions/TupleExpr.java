package AST.PyFlask.Expressions;

import AST.PyFlask.Expression;
import SymbolTable.PyFlask.ASTVisitor;

import java.util.List;

public class TupleExpr extends Expression {

    public final List<Expression> elements;

    public TupleExpr(int line, List<Expression> elements) {

        super(line, "TupleExpr");

        this.elements = elements;
    }

    @Override
    public void accept(ASTVisitor visitor) {
        visitor.visit(this);
    }

    @Override
    public String prettyPrint(int indent) {
        StringBuilder sb = new StringBuilder();

        sb.append(indent(indent))
                .append(nodeName)
                .append(" (line ")
                .append(line)
                .append(")\n");

        for (Expression element : elements) {

            sb.append(indent(indent + 1))
                    .append("Element:\n")
                    .append(element.prettyPrint(indent + 2));
        }

        return sb.toString();
    }
}