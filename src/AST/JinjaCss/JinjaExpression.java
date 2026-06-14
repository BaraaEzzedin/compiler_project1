package AST.JinjaCss;

import AST.JinjaCss.ASTNode;


public abstract class JinjaExpression extends ASTNode {

    protected JinjaExpression(int line, String nodeName) {
        super(line, nodeName);
    }
}
