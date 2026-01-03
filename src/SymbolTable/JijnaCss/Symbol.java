package SymbolTable.JijnaCss;

public abstract class Symbol {
    protected String name;
    protected SymbolType type;
    protected int line;

    public Symbol(String name, SymbolType type, int line) {
        this.name = name;
        this.type = type;
        this.line = line;
    }

    public String getName() {
        return name;
    }

    public SymbolType getType() {
        return type;
    }

    public int getLine() {
        return line;
    }
}