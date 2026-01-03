package AST.JinjaCss;

import AST.ASTNode;

public abstract class CSSTerm extends ASTNode {
    protected CSSTerm(int line, String nodeName) {
        super(line, nodeName);
    }
}
