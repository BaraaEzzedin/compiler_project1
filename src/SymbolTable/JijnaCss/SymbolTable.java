package SymbolTable.JijnaCss;

import java.util.HashMap;
import java.util.Map;

public class SymbolTable {
    Map<String, Symbol> symbols;
    private SymbolTable parent;
    private String scopeName;

    public SymbolTable(String scopeName, SymbolTable parent) {
        this.symbols = new HashMap<>();
        this.parent = parent;
        this.scopeName = scopeName;
    }

    public void define(String name, Symbol symbol) {
        symbols.put(name, symbol);
    }

    public Symbol resolve(String name) {
        Symbol symbol = symbols.get(name);
        if (symbol != null) return symbol;
        if (parent != null) return parent.resolve(name);
        return null;
    }

    public boolean existsInCurrentScope(String name) {
        return symbols.containsKey(name);
    }

    public String getScopeName() {
        return scopeName;
    }
}
