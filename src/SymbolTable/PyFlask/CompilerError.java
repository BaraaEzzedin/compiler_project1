package SymbolTable.PyFlask;

public class CompilerError {
    private final int line;
    private final String message;

    public CompilerError(int line, String message) {
        this.line = line;
        this.message = message;
    }

    @Override
    public String toString() {
        return "Line " + line + ": " + message;
    }
}
