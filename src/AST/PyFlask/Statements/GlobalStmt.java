package AST.PyFlask.Statements;

import AST.Statement;
import SymbolTable.PyFlask.ASTVisitor;

import java.util.List;

public class GlobalStmt extends Statement {
    public List<String> names;

    public GlobalStmt(int line, List<String> names) {
        super(line, "Global");
        this.names = names;
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

        for (String name : names) {

            sb.append(indent(indent + 1))
                    .append("Name: ")
                    .append(name)
                    .append("\n");
        }

        return sb.toString();
    }
}
