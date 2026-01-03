package SymbolTable.JijnaCss;

class HTMLIdSymbol extends Symbol {
    public HTMLIdSymbol(String name, int line) {
        super(name, SymbolType.HTML_ID, line);
    }
}