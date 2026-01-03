package SymbolTable.JijnaCss;

public class JinjaVariableSymbol extends Symbol{

    public JinjaVariableSymbol(String name, int line) {
        super(name, SymbolType.JINJA_VARIABLE, line);
    }
}
