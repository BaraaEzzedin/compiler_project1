package SymbolTable.PyFlask;

import SymbolTable.PyFlask.Symbol;

import java.util.*;

/**
 * Represents a scope in the symbol table.
 * Scopes can be nested (global -> function -> block).
 */
public class Scope {

    private final String name;

    private final Scope parent;
    private final List<Scope> children =
            new ArrayList<>();
    private final Map<String, Symbol> symbols =
            new LinkedHashMap<>();

    public Scope(String name, Scope parent) {
        this.name = name;
        this.parent = parent;
        if (parent != null) {
            parent.children.add(this);
        }
    }

    public Scope getParent() {
        return parent;
    }
    public List<Scope> getChildren() {
        return children;
    }
    public String getName() {
        return name;
    }

    public boolean define(Symbol symbol) {

        if (symbols.containsKey(symbol.getName())) {
            return false;
        }

        symbols.put(symbol.getName(), symbol);
        return true;
    }

    public Symbol lookupLocal(String name) {
        return symbols.get(name);
    }

    public Symbol resolve(String name) {

        Symbol local = symbols.get(name);

        if (local != null) {
            return local;
        }

        if (parent != null) {
            return parent.resolve(name);
        }

        return null;
    }

    public Collection<Symbol> getSymbols() {
        return symbols.values();
    }
}