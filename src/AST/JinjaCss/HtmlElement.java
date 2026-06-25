package AST.JinjaCss;

import AST.JinjaCss.Statement;

public abstract class HtmlElement extends Statement {
    protected HtmlElement(int line, String nodeName) {
        super(line, nodeName);
    }
}
