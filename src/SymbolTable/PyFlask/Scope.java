package SymbolTable.PyFlask;

import SymbolTable.PyFlask.Symbol;

import java.util.HashMap;
import java.util.Map;

/**
 * Represents a scope in the symbol table.
 * Scopes can be nested (global -> function -> block).
 */
public class Scope {
    private final String name;
    private final ScopeType type;
    private final Scope parent;
    private final Map<String, Symbol> symbols;
    private final int startLine;

    public enum ScopeType {
        GLOBAL,      // Global scope
        FUNCTION,    // Function scope
        CLASS,
        BLOCK        // Block scope (if, while, for, etc.)
    }

    public Scope(String name, ScopeType type, Scope parent, int startLine) {
        this.name = name;
        this.type = type;
        this.parent = parent;
        this.symbols = new HashMap<>();
        this.startLine = startLine;
    }

    /**
     * Add a symbol to this scope.
     * Returns true if symbol was added, false if it already exists.
     */
    public boolean addSymbol(Symbol symbol) {
        if (symbols.containsKey(symbol.getName())) {
            return false; // Symbol already exists in this scope
        }
        symbols.put(symbol.getName(), symbol);
        return true;
    }

    /**
     * Look up a symbol in this scope only (does not check parent scopes).
     */
    public Symbol lookupLocal(String name) {
        return symbols.get(name);
    }

    /**
     * Look up a symbol in this scope and all parent scopes.
     */
    public Symbol lookup(String name) {
        Symbol symbol = symbols.get(name);
        if (symbol != null) {
            return symbol;
        }
        if (parent != null) {
            return parent.lookup(name);
        }
        return null;
    }

    /**
     * Check if a symbol exists in this scope only.
     */
    public boolean containsLocal(String name) {
        return symbols.containsKey(name);
    }

    /**
     * Check if a symbol exists in this scope or any parent scope.
     */
    public boolean contains(String name) {
        return lookup(name) != null;
    }

    public String getName() {
        return name;
    }

    public ScopeType getType() {
        return type;
    }

    public Scope getParent() {
        return parent;
    }

    public Map<String, Symbol> getSymbols() {
        return new HashMap<>(symbols); // Return a copy for safety
    }

    public int getStartLine() {
        return startLine;
    }

    @Override
    public String toString() {
        return String.format("Scope{name='%s', type=%s, symbols=%d, startLine=%d}",
                name, type, symbols.size(), startLine);
    }
}