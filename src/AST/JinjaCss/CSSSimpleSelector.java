package AST.JinjaCss;

import AST.ASTNode;

public abstract class CSSSimpleSelector extends ASTNode {
    protected CSSSimpleSelector(int line, String nodeName) {
        super(line, nodeName);
    }
}
