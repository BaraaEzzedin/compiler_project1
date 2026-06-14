package AST.JinjaCss;

import AST.JinjaCss.ASTNode;


public abstract class CSSValue extends ASTNode {
    protected CSSValue(int line, String nodeName) {
        super(line, nodeName);
    }
}
