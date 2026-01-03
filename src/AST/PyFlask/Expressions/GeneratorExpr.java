package AST.PyFlask.Expressions;

import AST.PyFlask.Expression;

public class GeneratorExpr extends Expression{
    public final IdentifierExpr yieldVar;
    public final IdentifierExpr loopVar;
    public final Expression iterable;
    public final Expression filter; // nullable

    public GeneratorExpr(
            int line,
            IdentifierExpr yieldVar,
            IdentifierExpr loopVar,
            Expression iterable,
            Expression filter
    ) {
        super(line, "GeneratorExpr");
        this.yieldVar = yieldVar;
        this.loopVar = loopVar;
        this.iterable = iterable;
        this.filter = filter;
    }

    @Override
    public String prettyPrint(int indent) {
        StringBuilder sb = new StringBuilder();
        sb.append(indent(indent))
                .append(nodeName).append(" (line ").append(line).append(")\n");

        sb.append(indent(indent + 1))
                .append("Yield:\n")
                .append(yieldVar.prettyPrint(indent + 2));

        sb.append(indent(indent + 1))
                .append("LoopVar:\n")
                .append(loopVar.prettyPrint(indent + 2));

        sb.append(indent(indent + 1))
                .append("Iterable:\n")
                .append(iterable.prettyPrint(indent + 2));

        if (filter != null) {
            sb.append(indent(indent + 1))
                    .append("Filter:\n")
                    .append(filter.prettyPrint(indent + 2));
        }

        return sb.toString();
    }
}
