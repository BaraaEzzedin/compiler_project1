package AST.JinjaCss;

import AST.JinjaCss.ASTNode;

public abstract class CSSSimpleSelector extends ASTNode {
    protected CSSSimpleSelector(int line, String nodeName) {
        super(line, nodeName);
    }
}
