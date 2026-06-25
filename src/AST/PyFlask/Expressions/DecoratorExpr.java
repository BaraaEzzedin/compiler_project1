package AST.PyFlask.Expressions;

import AST.PyFlask.Expression;
import SymbolTable.PyFlask.ASTVisitor;

import java.util.List;

public class DecoratorExpr extends Expression {
    public final List<String> nameParts;                // dotted name as text
    public final List<Expression> arguments; // may be empty

    public DecoratorExpr(
            int line,
            List<String> nameParts,
            List<Expression> arguments
    ) {
        super(line, "DecoratorExpr");
        this.nameParts = nameParts;
        this.arguments = arguments;
    }
    @Override
    public void accept(ASTVisitor visitor) {
        visitor.visit(this);
    }
    @Override
    public String prettyPrint(int indent) {
        StringBuilder sb = new StringBuilder();
        sb.append(indent(indent))
                .append("DecoratorExpr (line ").append(line).append(")\n");

        sb.append(indent(indent + 1))
                .append("Name: ").append(String.join(".", nameParts)).append("\n");

        if (!arguments.isEmpty()) {
            sb.append(indent(indent + 1))
                    .append("Args:\n");
            for (Expression arg : arguments) {
                sb.append(arg.prettyPrint(indent + 2));
            }
        }

        return sb.toString();
    }
}
