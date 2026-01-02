package SymbolTable;

public class CSSVariableSymbol extends Symbol{
    public String value;
    public CSSVariableSymbol(String name, String value, int line) {
        super(name, SymbolType.CSS_VARIABLE, line);
        this.value=value;
    }
}
