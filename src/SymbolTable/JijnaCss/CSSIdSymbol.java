package SymbolTable.JijnaCss;

class CSSIdSymbol extends Symbol {
    public CSSIdSymbol(String name, int line) {
        super(name, SymbolType.CSS_ID, line);
    }
}