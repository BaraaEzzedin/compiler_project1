package AST.PyFlask.Statements;

import AST.PyFlask.Block;
import AST.PyFlask.Expressions.DecoratorExpr;
import AST.Statement;
import SymbolTable.PyFlask.ASTVisitor;

import java.util.List;

public class FunctionDef extends Statement {
    public String name;
    public List<String> parameters;
    public List<DecoratorExpr> decorators;
    public Block body;
    @Override
    public void accept(ASTVisitor visitor) {
        visitor.visit(this);
    }
public FunctionDef(int line, String name, List<DecoratorExpr> decorators, List<String> parameters, Block body) {
    super(line,"FunctionDef");
    this.name = name;
    this.parameters = parameters;
    this.decorators = decorators;
    this.body = body;
}
    @Override
    public String prettyPrint(int indent) {
        StringBuilder sb = new StringBuilder();

        sb.append(indent(indent))
                .append("FunctionDef ").append(name)
                .append(" (line ").append(line).append(")\n");

        // Decorators
        if (decorators != null && !decorators.isEmpty()) {
            sb.append(indent(indent + 1))
                    .append("Decorators:\n");
            for (DecoratorExpr d : decorators) {
                sb.append(d.prettyPrint(indent + 2));
            }
        }

        // Parameters
        sb.append(indent(indent + 1))
                .append("Params: ").append(parameters).append("\n");

        // Body
        if (body != null) {
            sb.append(indent(indent + 1))
                    .append("Body:\n");
            sb.append(body.prettyPrint(indent + 2));
        }

//        sb.append(body.prettyPrint(indent + 1));
        return sb.toString();
    }
    @Override public String toString() { return "Func " + name + parameters + " => " + body; }
}
