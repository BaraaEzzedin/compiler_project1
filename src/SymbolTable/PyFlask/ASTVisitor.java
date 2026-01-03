package SymbolTable.PyFlask;

import AST.PyFlask.Expressions.*;
import AST.Program;
import AST.Statement;
import AST.PyFlask.Statements.*;
import AST.PyFlask.Expression;
import AST.PyFlask.Block;
/**
 * Base visitor class for traversing the AST.
 * Provides default implementations that can be overridden.
 */
public abstract class ASTVisitor {
    // Program
    public void visit(Program node) {
        if (node.getStatements() != null) {
            for (Statement stmt : node.getStatements()) {
                visit(stmt);
            }
        }
    }

    // Statements
    public void visit(Statement node) {
        // Dispatch to specific statement types
        if (node instanceof FunctionDef) {
            visit((FunctionDef) node);
        } else if (node instanceof ClassDef) {
            visit((ClassDef) node);
        }else if (node instanceof AssignStmt) {
            visit((AssignStmt) node);
        } else if (node instanceof PrintStmt) {
            visit((PrintStmt) node);
        } else if (node instanceof IfStmt) {
            visit((IfStmt) node);
        } else if (node instanceof WhileStmt) {
            visit((WhileStmt) node);
        } else if (node instanceof ForStmt) {
            visit((ForStmt) node);
        } else if (node instanceof ReturnStmt) {
            visit((ReturnStmt) node);
        } else if (node instanceof ImportStmt) {
            visit((ImportStmt) node);
        } else if (node instanceof ExprStmt) {
            visit((ExprStmt) node);
        } else if (node instanceof ArrayAssignStmt) {
            visit((ArrayAssignStmt) node);
        }
    }

    public void visit(FunctionDef node) {
        if (node.body != null) {
            visit(node.body);
        }
    }

    public void visit(ClassDef node) {
        if (node.body != null) {
            for(Statement stm: node.body){
                visit(stm);
            }
        }
    }

    public void visit(AssignStmt node) {
        if (node.value != null) {
            visit(node.value);
        }
    }

    public void visit(PrintStmt node) {
        if (node.expr != null) {
            visit(node.expr);
        }
    }

    public void visit(IfStmt node) {
        if (node.condition != null) {
            visit(node.condition);
        }
        if (node.thenBlock != null) {
            visit(node.thenBlock);
        }
        if (node.elseBlock != null) {
            visit(node.elseBlock);
        }
    }

    public void visit(WhileStmt node) {
        if (node.condition != null) {
            visit(node.condition);
        }
        if (node.body != null) {
            visit(node.body);
        }
    }

    public void visit(ForStmt node) {
        if (node.loopVariable != null) {
            visit(node.loopVariable);
        }
        if (node.iterable != null) {
            visit(node.iterable);
        }
        if (node.body != null) {
            visit(node.body);
        }
    }

    public void visit(ReturnStmt node) {
        if (node.expr != null) {
            visit(node.expr);
        }
    }

    public void visit(ImportStmt node) {
        // No children to visit
    }

    public void visit(ExprStmt node) {
        if (node.expr != null) {
            visit(node.expr);
        }
    }

    public void visit(ArrayAssignStmt node) {
        if (node.array != null) {
            visit(node.array);
        }
        if (node.index != null) {
            visit(node.index);
        }
        if (node.value != null) {
            visit(node.value);
        }
    }

    // Expressions
    public void visit(Expression node) {
        // Dispatch to specific expression types
        if (node instanceof BinaryExpr) {
            visit((BinaryExpr) node);
        } else if (node instanceof IdentifierExpr) {
            visit((IdentifierExpr) node);
        } else if (node instanceof NumberExpr) {
            visit((NumberExpr) node);
        } else if (node instanceof StringExpr) {
            visit((StringExpr) node);
        } else if (node instanceof BooleanExpr) {
            visit((BooleanExpr) node);
        } else if (node instanceof FunctionCallExpr) {
            visit((FunctionCallExpr) node);
        } else if (node instanceof ArrayLiteral) {
            visit((ArrayLiteral) node);
        } else if (node instanceof DictLiteral) {
            visit((DictLiteral) node);
        } else if (node instanceof IndexExpr) {
            visit((IndexExpr) node);
        } else if (node instanceof AttributeExpr) {
            visit((AttributeExpr) node);
        }
    }

    public void visit(BinaryExpr node) {
        if (node.left != null) {
            visit(node.left);
        }
        if (node.right != null) {
            visit(node.right);
        }
    }

    public void visit(IdentifierExpr node) {
        // Leaf node
    }

    public void visit(NumberExpr node) {
        // Leaf node
    }

    public void visit(StringExpr node) {
        // Leaf node
    }

    public void visit(BooleanExpr node) {
        // Leaf node
    }

    public void visit(FunctionCallExpr node) {
        if (node.callee != null) {
            visit(node.callee);
        }
        if (node.args != null) {
            for (Expression arg : node.args) {
                visit(arg);
            }
        }
    }

    public void visit(ArrayLiteral node) {
        if (node.elements != null) {
            for (Expression item : node.elements) {
                visit(item);
            }
        }
    }

    public void visit(DictLiteral node) {
        if (node.entries != null) {
            for (KeyValue pair : node.entries) {
                visit(pair.key);
                visit(pair.value);
            }
        }
    }

    public void visit(IndexExpr node) {
        if (node.array != null) {
            visit(node.array);
        }
        if (node.index != null) {
            visit(node.index);
        }
    }

    public void visit(AttributeExpr node) {
        if (node.target != null) {
            visit(node.target);
        }
    }

    public void visit(KeyValue node) {
        if (node.key != null) {
            visit(node.key);
        }
        if (node.value != null) {
            visit(node.value);
        }
    }

    // Block
    public void visit(Block node) {
        if (node.getStatements() != null) {
            for (Statement stmt : node.getStatements()) {
                visit(stmt);
            }
        }
    }
}