package SymbolTable.PyFlask;

import AST.PyFlask.Expressions.*;
import AST.Program;
import AST.Statement;
import AST.PyFlask.Statements.*;
import AST.PyFlask.Expression;
import AST.PyFlask.Block;

public abstract class ASTVisitor {
    // Program
    public void visit(Program node) {
        if (node.getStatements() != null) {
            for (Statement stmt : node.getStatements()) {
                stmt.accept(this);
            }
        }
    }


    public void visit(FunctionDef node) {
        if (node.body != null) {
            node.body.accept(this);
        }
    }

    public void visit(ClassDef node) {
        if (node.body != null) {
            for(Statement stm: node.body){
                stm.accept(this);
            }
        }
    }

    public void visit(AssignStmt node) {
        if (node.value != null) {
            node.value.accept(this);
        }
    }

    public void visit(PrintStmt node) {
        if (node.expr != null) {
            node.expr.accept(this);
        }
    }

    public void visit(IfStmt node) {
        if (node.condition != null) {
            node.condition.accept(this);
        }
        if (node.thenBlock != null) {
            node.thenBlock.accept(this);
        }
        if (node.elseBlock != null) {
            node.elseBlock.accept(this);
        }
    }


    public void visit(WhileStmt node) {
        if (node.condition != null) {
            node.condition.accept(this);
        }
        if (node.body != null) {
            node.body.accept(this);
        }
    }
    public void visit(DecoratorExpr node) {
        if (node.arguments != null) {
            for (Expression arg : node.arguments) {
                if (arg != null) {
                    arg.accept(this);
                }
            }
        }
    }
    public void visit(LogicalExpr node) {
        if (node.left != null) {
            node.left.accept(this);
        }
        if (node.right != null) {
            node.right.accept(this);
        }
    }

    public void visit(GeneratorExpr node) {

        if (node.yieldVar != null) {
            node.yieldVar.accept(this);
        }

        if (node.loopVar != null) {
            node.loopVar.accept(this);
        }

        if (node.iterable != null) {
            node.iterable.accept(this);
        }

        if (node.filter != null) {
            node.filter.accept(this);
        }
    }
    public void visit(ForStmt node) {
        if (node.loopVariable != null) {
            node.loopVariable.accept(this);
        }
        if (node.iterable != null) {
            node.iterable.accept(this);
        }
        if (node.body != null) {
            node.body.accept(this);
        }
    }

    public void visit(ReturnStmt node) {
        if (node.expr != null) {
            node.expr.accept(this);
        }
    }

    public void visit(ImportStmt node) {
        // No children to visit
    }

    public void visit(ExprStmt node) {
        if (node.expr != null) {
            node.expr.accept(this);
        }
    }

    public void visit(ArrayAssignStmt node) {
        if (node.array != null) {
            node.array.accept(this);
        }
        if (node.index != null) {
            node.index.accept(this);
        }
        if (node.value != null) {
            node.value.accept(this);
        }
    }

    public void visit(BinaryExpr node) {
        if (node.left != null) {
            node.left.accept(this);
        }
        if (node.right != null) {
            node.right.accept(this);
        }
    }

    public void visit(IdentifierExpr node) {
        // Leaf node
//        node.accept(this);
    }

    public void visit(NumberExpr node) {
        // Leaf node
//        node.accept(this);
    }

    public void visit(StringExpr node) {
        // Leaf node
//        node.accept(this);
    }

    public void visit(BooleanExpr node) {
        // Leaf node
//        node.accept(this);
    }

    public void visit(FunctionCallExpr node) {
        if (node.callee != null) {
            node.callee.accept(this);
        }
        if (node.args != null) {
            for (Expression arg : node.args) {
                arg.accept(this);
            }
        }
    }

    public void visit(ArrayLiteral node) {
        if (node.elements != null) {
            for (Expression item : node.elements) {
                item.accept(this);
            }
        }
    }

    public void visit(DictLiteral node) {
        if (node.entries != null) {
            for (KeyValue pair : node.entries) {
                pair.key.accept(this);
                pair.value.accept(this);
            }
        }
    }

    public void visit(IndexExpr node) {
        if (node.array != null) {
            node.array.accept(this);
        }
        if (node.index != null) {
            node.index.accept(this);
        }
    }

    public void visit(AttributeExpr node) {
        if (node.target != null) {
            node.target.accept(this);
        }
    }

    public void visit(KeyValue node) {
        if (node.key != null) {
            node.key.accept(this);
        }
        if (node.value != null) {
            node.value.accept(this);
        }
    }

    // Block
    public void visit(Block node) {
        if (node.getStatements() != null) {
            for (Statement stmt : node.getStatements()) {
                stmt.accept(this);
            }
        }
    }
}