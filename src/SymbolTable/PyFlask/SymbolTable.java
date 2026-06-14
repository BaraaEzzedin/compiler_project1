package SymbolTable.PyFlask;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;
public class SymbolTable {

    private final Scope globalScope;

    public SymbolTable() {
        globalScope =
                new Scope("global", null);
    }

    public Scope getGlobalScope() {
        return globalScope;
    }
    @Override
    public String toString() {

        StringBuilder sb = new StringBuilder();

        printScope(globalScope, sb, 0);

        return sb.toString();
    }
    private void printScope(
            Scope scope,
            StringBuilder sb,
            int indent
    ) {

        sb.append(" ".repeat(indent))
                .append("Scope: ")
                .append(scope.getName())
                .append("\n");

        for (Symbol symbol : scope.getSymbols()) {

            sb.append(" ".repeat(indent + 2))
                    .append(symbol)
                    .append("\n");
        }

        for (Scope child : scope.getChildren()) {

            printScope(
                    child,
                    sb,
                    indent + 4
            );
        }
    }
}