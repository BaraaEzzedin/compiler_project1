package AST;

public abstract class CSSStatement extends ASTNode {
    protected CSSStatement(int line, String nodeName) {
        super(line, nodeName);
    }
}
