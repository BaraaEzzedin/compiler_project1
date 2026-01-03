package AST.PyFlask.Statements;

public class ImportItem {
    public final String name;
    public final String alias; // null if none

    public ImportItem(String name, String alias) {
        this.name = name;
        this.alias = alias;
    }
}