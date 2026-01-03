package AST.PyFlask.Statements;

import AST.PyFlask.Block;
import AST.Statement;

import java.util.List;

public class FunctionDef extends Statement {
    public String name;
    public List<String> parameters;
    public Block body;

    public FunctionDef(int line,String name, List<String> parameters, Block body) {
        super(line,"FunctionDef");
        this.name = name;
        this.parameters = parameters;
        this.body = body;
    }
    @Override
    public String prettyPrint(int indent) {
        StringBuilder sb = new StringBuilder();
        sb.append(indent(indent))
                .append(nodeName)
                .append(" ")
                .append(name)
                .append(parameters)
                .append(" (line ")
                .append(line)
                .append(")\n");

        sb.append(body.prettyPrint(indent + 1));
        return sb.toString();
    }
    @Override public String toString() { return "Func " + name + parameters + " => " + body; }
}
