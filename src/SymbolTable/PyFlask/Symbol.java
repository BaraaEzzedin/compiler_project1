package SymbolTable.PyFlask;

public class Symbol {

    private final String name;
    private final SymbolKind kind;
    private Type type;
    int parameterCount;
    private final int line;

    public Symbol(String name,
                  SymbolKind kind,
                  int line) {
        this.name = name;
        this.kind = kind;
        this.line = line;
    }

    public Type getType() {
        return type;
    }

    public void setType(Type type) {
        this.type = type;
    }
    public String getName() {
        return name;
    }

    public SymbolKind getKind() {
        return kind;
    }

    public int getLine() {
        return line;
    }

    @Override
    public String toString() {
        return kind + " " + name;
    }
}
