package SymbolTable.JijnaCss;

public class CSSClassSymbol extends Symbol{
    public boolean isDefined;
    public boolean isUsed;
    public CSSClassSymbol(String name, int line) {
        super(name, SymbolType.CSS_CLASS, line);
    }
}
