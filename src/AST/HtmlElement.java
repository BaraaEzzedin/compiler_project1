package AST;

public abstract class HtmlElement extends Statement {
    protected HtmlElement(int line, String nodeName) {
        super(line, nodeName);
    }
}
