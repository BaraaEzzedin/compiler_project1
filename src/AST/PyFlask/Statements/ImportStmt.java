package AST.PyFlask.Statements;

import AST.Statement;

import java.util.List;

public class ImportStmt extends Statement {
    public final String module;
    public final List<String> names; // for from-import, names may be empty
    public final boolean isFrom; // true if "from X import Y"

    public ImportStmt(int line, boolean isFrom, String module, List<String> names) {
        super(line, "Import");
        this.isFrom = isFrom;
        this.module = module;
        this.names = names;
    }

    @Override
    public String toString() {
        return (isFrom ? "From " : "Import ") + module + " " + names;
    }

    @Override
    public String prettyPrint(int level) {
        StringBuilder sb = new StringBuilder();
        sb.append(indent(level)).append(nodeName).append(" (line ").append(line).append(")\n");
        sb.append(indent(level + 1)).append(isFrom ? "From: " : "Module: ").append(module).append("\n");
        if (!names.isEmpty()) {
            sb.append(indent(level + 1)).append("Names: ").append(String.join(", ", names)).append("\n");
        }
        return sb.toString();
    }
}
