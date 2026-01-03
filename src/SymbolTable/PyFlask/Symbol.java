package SymbolTable.PyFlask;

public class Symbol {

    private final String name;
    private final SymbolKind type;
    private final int line;           // Line where symbol is defined
    private final String scopeName;    // Name of the scope where symbol is defined
    private final boolean isDefined;   // Whether symbol is fully defined (for functions)

    public Symbol(String name, SymbolKind type, int line, String scopeName) {
        this(name, type, line, scopeName, true);
    }

    public Symbol(String name, SymbolKind type, int line, String scopeName, boolean isDefined) {
        this.name = name;
        this.type = type;
        this.line = line;
        this.scopeName = scopeName;
        this.isDefined = isDefined;
    }

    public String getName() {
        return name;
    }

    public SymbolKind getType() {
        return type;
    }

    public int getLine() {
        return line;
    }

    public String getScopeName() {
        return scopeName;
    }

    public boolean isDefined() {
        return isDefined;
    }

    @Override
    public String toString() {
        return String.format("Symbol{name='%s', type=%s, line=%d, scope='%s'}",
                name, type, line, scopeName);
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        Symbol symbol = (Symbol) obj;
        return name.equals(symbol.name) && type == symbol.type;
    }

    @Override
    public int hashCode() {
        return name.hashCode() * 31 + type.hashCode();
    }
}
