package AST.PyFlask.Statements;

import AST.Statement;

import java.util.List;

public class ClassDef extends Statement {
    public final String name;
    public final String superClass;   // null if no inheritance
    public final List<Statement> body;

    public ClassDef(int line, String name, String superClass, List<Statement> body) {
        super(line,"Class Definition");
        this.name = name;
        this.superClass = superClass;
        this.body = body;
    }

    @Override
    public String prettyPrint(int indent) {
        StringBuilder sb = new StringBuilder();

        sb.append(indent(indent))
                .append("ClassDef (line ")
                .append(line)
                .append(") ")
                .append(name);

        if (superClass != null) {
            sb.append(" extends ").append(superClass);
        }
        sb.append("\n");

        for (Statement stmt : body) {
            sb.append(stmt.prettyPrint(indent + 1));
        }

        return sb.toString();
    }
}