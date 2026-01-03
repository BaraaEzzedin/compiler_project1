package AST.PyFlask;

import AST.ASTNode;

public abstract class Expression extends ASTNode {
    protected Expression(int line, String name) {
        super(line, name);
    }

}
