package AST.PyFlask.Statements;

import AST.Statement;
import SymbolTable.PyFlask.ASTVisitor;

import java.util.List;

public class ImportStmt extends Statement {
    public final boolean isFrom;

    public final String fromModule; // null for normal import

    public final List<String> imports;

    public ImportStmt(int line, boolean isFrom, String fromModule, List<String> imports) {
        super(line, "Import");
        this.isFrom = isFrom;
        this.fromModule = fromModule;
        this.imports = imports;
    }
    @Override
    public void accept(ASTVisitor visitor) {
        visitor.visit(this);
    }
    @Override
    public String toString() {
        return (isFrom ? "From " : "Import ") + fromModule + " " + imports;
    }

    @Override
    public String prettyPrint(int level) {
        StringBuilder sb = new StringBuilder();
        sb.append(indent(level)).append(nodeName).append(" (line ").append(line).append(")\n");
        sb.append(indent(level + 1)).append(isFrom ? "From: " : "Module: ").append(fromModule).append("\n");
        if (!imports.isEmpty()) {
            sb.append(indent(level + 1)).append("Names: ").append(String.join(", ", imports)).append("\n");
        }
        return sb.toString();
    }
}
