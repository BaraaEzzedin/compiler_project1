package SymbolTable.PyFlask;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

/**
 * Manages the symbol table with scoping support.
 * Provides methods to enter/exit scopes and manage symbols.
 */
public class SymbolTable {
    private Scope globalScope;
    private Stack<Scope> scopeStack;
    private List<Scope> allScopes;  // Track all scopes for printing
    private List<String> errors;

    public SymbolTable() {
        this.globalScope = new Scope("global", Scope.ScopeType.GLOBAL, null, 1);
        this.scopeStack = new Stack<>();
        this.scopeStack.push(globalScope);
        this.allScopes = new ArrayList<>();
        this.allScopes.add(globalScope);
        this.errors = new ArrayList<>();
    }

    /**
     * Enter a new scope.
     */
    public void enterScope(String name, Scope.ScopeType type, int startLine) {
        Scope currentScope = scopeStack.peek();
        Scope newScope = new Scope(name, type, currentScope, startLine);
        scopeStack.push(newScope);
        allScopes.add(newScope);  // Track all scopes
    }

    /**
     * Exit the current scope.
     */
    public void exitScope() {
        if (scopeStack.size() > 1) {
            scopeStack.pop();
        }
    }

    /**
     * Get the current scope.
     */
    public Scope getCurrentScope() {
        return scopeStack.peek();
    }

    /**
     * Get the global scope.
     */
    public Scope getGlobalScope() {
        return globalScope;
    }

    /**
     * Add a symbol to the current scope.
     * Returns true if successful, false if symbol already exists.
     */
    public boolean addSymbol(String name, SymbolKind type, int line) {
        Scope currentScope = getCurrentScope();
        String scopeName = currentScope.getName();
        Symbol symbol = new Symbol(name, type, line, scopeName);

        if (!currentScope.addSymbol(symbol)) {
            // Symbol already exists in current scope
            errors.add(String.format("Error at line %d: Symbol '%s' already defined in scope '%s'",
                    line, name, scopeName));
            return false;
        }
        return true;
    }

    /**
     * Add a symbol directly to the global scope.
     * Returns true if successful, false if symbol already exists.
     */
    public boolean addSymbolToGlobal(String name, SymbolKind type, int line) {
        String scopeName = globalScope.getName();
        Symbol symbol = new Symbol(name, type, line, scopeName);

        if (!globalScope.addSymbol(symbol)) {
            // Symbol already exists in global scope
            return false;
        }
        return true;
    }

    /**
     * Look up a symbol starting from the current scope.
     */
    public Symbol lookup(String name) {
        return getCurrentScope().lookup(name);
    }

    /**
     * Look up a symbol in the current scope only.
     */
    public Symbol lookupLocal(String name) {
        return getCurrentScope().lookupLocal(name);
    }

    /**
     * Check if a symbol exists.
     */
    public boolean contains(String name) {
        return getCurrentScope().contains(name);
    }

    /**
     * Get all errors collected during symbol table construction.
     */
    public List<String> getErrors() {
        return new ArrayList<>(errors);
    }

    /**
     * Add an error message.
     */
    public void addError(String error) {
        errors.add(error);
    }

    /**
     * Check if there are any errors.
     */
    public boolean hasErrors() {
        return !errors.isEmpty();
    }

    /**
     * Print the symbol table structure.
     */
    public void print() {
        System.out.println("=== Symbol Table ===");
        printScope(globalScope, 0);
        if (hasErrors()) {
            System.out.println("\n=== Errors ===");
            for (String error : errors) {
                System.out.println(error);
            }
        }
    }

    private void printScope(Scope scope, int indent) {
        String indentStr = "  ".repeat(indent);
        System.out.println(indentStr + scope);

        for (Symbol symbol : scope.getSymbols().values()) {
            System.out.println(indentStr + "  " + symbol);
        }

        // Print child scopes recursively
        for (Scope childScope : allScopes) {
            if (childScope.getParent() == scope) {
                printScope(childScope, indent + 1);
            }
        }
    }

    /**
     * Get a string representation of the symbol table.
     */
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("=== Symbol Table ===\n");
        sb.append(toStringScope(globalScope, 0));
        if (hasErrors()) {
            sb.append("\n=== Errors ===\n");
            for (String error : errors) {
                sb.append(error).append("\n");
            }
        }
        return sb.toString();
    }

    private String toStringScope(Scope scope, int indent) {
        StringBuilder sb = new StringBuilder();
        String indentStr = "  ".repeat(indent);
        sb.append(indentStr).append(scope).append("\n");

        for (Symbol symbol : scope.getSymbols().values()) {
            sb.append(indentStr).append("  ").append(symbol).append("\n");
        }

        // Print child scopes recursively
        for (Scope childScope : allScopes) {
            if (childScope.getParent() == scope) {
                sb.append(toStringScope(childScope, indent + 1));
            }
        }

        return sb.toString();
    }
}
