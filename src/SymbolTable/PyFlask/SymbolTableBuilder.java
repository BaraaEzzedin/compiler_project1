package SymbolTable.PyFlask;

import AST.PyFlask.Block;
import AST.PyFlask.Expressions.*;
import AST.Program;
import AST.Statement;
import AST.PyFlask.Statements.*;
import SymbolTable.PyFlask.ASTVisitor;
import SymbolTable.PyFlask.SymbolTable;
import AST.PyFlask.Expression;


/**
 * Visitor that builds a symbol table by traversing the AST.
 * Tracks variables, functions, parameters, and imports.
 */
public class SymbolTableBuilder extends ASTVisitor {
    private SymbolTable symbolTable;

    public SymbolTableBuilder() {
        this.symbolTable = new SymbolTable();
    }

    public SymbolTable getSymbolTable() {
        return symbolTable;
    }

    @Override
    public void visit(Program node) {
        // Visit all statements in the global scope
        for (Statement stmt : node.getStatements()) {
            visit(stmt);
        }
    }

    @Override
    public void visit(Block node) {
        // Enter a new block scope
        String scopeName = "block_" + node.getLine();
        symbolTable.enterScope(scopeName, Scope.ScopeType.BLOCK, node.getLine());

        // Visit all statements in the block
        for (Statement stmt : node.getStatements()) {
            visit(stmt);
        }

        // Exit the block scope
        symbolTable.exitScope();
    }

    @Override
    public void visit(FunctionDef node) {
        // Add function to current scope
        symbolTable.addSymbol(node.name, SymbolKind.FUNCTION, node.getLine());

        // Enter function scope
        String scopeName = "func_" + node.name;
        symbolTable.enterScope(scopeName, Scope.ScopeType.FUNCTION, node.getLine());

        // Add parameters to function scope
        if (node.parameters != null) {
            for (String param : node.parameters) {
                // Parameters might be comma-separated in a single string, need to parse
                String[] params = param.split(",");
                for (String p : params) {
                    String trimmed = p.trim();
                    if (!trimmed.isEmpty()) {
                        symbolTable.addSymbol(trimmed, SymbolKind.PARAMETER, node.getLine());
                    }
                }
            }
        }

        // Visit function body statements directly without creating a block scope
        // In Python, function bodies don't create separate scopes - they're part of the function scope
        if (node.body != null) {
            for (Statement stmt : node.body.getStatements()) {
                visit(stmt);
            }
        }

        // Exit function scope
        symbolTable.exitScope();
    }

    @Override
    public void visit(ClassDef node) {
        symbolTable.addSymbol(node.name, SymbolKind.CLASS, node.getLine());
        String scopeName = "class_" + node.name;
        symbolTable.enterScope(scopeName, Scope.ScopeType.CLASS, node.getLine());
        if (node.body != null) {
            for (Statement stmt : node.body) {
                visit(stmt);
            }
        }
        symbolTable.exitScope();
    }

    @Override
    public void visit(AssignStmt node) {
        // Check if assignment target is an identifier
        if (node.name instanceof IdentifierExpr) {
            IdentifierExpr id = (IdentifierExpr) node.name;
            // Check if variable already exists (might be a re-assignment)
            Symbol existing = symbolTable.lookupLocal(id.name);

            if (existing == null) {
                // New variable declaration
                symbolTable.addSymbol(id.name, SymbolKind.VARIABLE, node.getLine());
            }
            // If it exists, it's a re-assignment, which is fine
        }
        // For index expressions (array assignments), we don't add new symbols

        // Visit the value expression
        visit(node.value);
    }

    @Override
    public void visit(IfStmt node) {
        // Visit condition
        visit(node.condition);

        // In Python, if blocks don't create new scopes - variables are in the parent scope
        // So we visit the statements directly without creating a new scope
        if (node.thenBlock != null) {
            // Visit statements in the block without creating a new scope
            for (Statement stmt : node.thenBlock.getStatements()) {
                visit(stmt);
            }
        }

        // Visit else block statements without creating a new scope
        if (node.elseBlock != null) {
            for (Statement stmt : node.elseBlock.getStatements()) {
                visit(stmt);
            }
        }
    }

    @Override
    public void visit(WhileStmt node) {
        // Visit condition
        visit(node.condition);

        // In Python, while loop bodies don't create new scopes - variables are in the parent scope
        // So we visit the statements directly without creating a new scope
        if (node.body != null) {
            for (Statement stmt : node.body.getStatements()) {
                visit(stmt);
            }
        }
    }

    @Override
    public void visit(ForStmt node) {
        // Add loop variable to current scope BEFORE visiting it
        // This prevents "undefined identifier" warnings
        if (node.loopVariable instanceof IdentifierExpr) {
            IdentifierExpr loopVar = (IdentifierExpr) node.loopVariable;
            // Check if variable already exists (might be a re-assignment)
            Symbol existing = symbolTable.lookupLocal(loopVar.name);
            if (existing == null) {
                // New loop variable - use LOOP_VAR type
                symbolTable.addSymbol(loopVar.name, SymbolKind.LOOP_VAR, node.getLine());
            }
        }

        // Visit iterable expression (may reference the loop variable in nested cases, but usually doesn't)
        visit(node.iterable);

        // In Python, for loop bodies don't create new scopes - variables are in the parent scope
        // So we visit the statements directly without creating a new scope
        if (node.body != null) {
            for (Statement stmt : node.body.getStatements()) {
                visit(stmt);
            }
        }
    }

    @Override
    public void visit(ImportStmt node) {
        // Add imported names to symbol table
        if (node.names != null) {
            for (String name : node.names) {
                symbolTable.addSymbol(name, SymbolKind.IMPORT, node.getLine());
            }
        }
    }

    @Override
    public void visit(IdentifierExpr node) {
        // Handle built-in variables like __name__
        if ("__name__".equals(node.name)) {
            // Check if __name__ is already in the symbol table
            Symbol existing = symbolTable.getGlobalScope().lookupLocal("__name__");
            if (existing == null) {
                // Add __name__ as a BUILTIN to the global scope
                symbolTable.addSymbolToGlobal("__name__", SymbolKind.BUILTIN, node.getLine());
            }
            return; // Don't check for undefined error for built-ins
        }

        // Check if identifier is defined
        Symbol symbol = symbolTable.lookup(node.name);
        if (symbol == null) {
            // Undefined variable - add error
            symbolTable.addError(String.format("Warning at line %d: Undefined identifier '%s'",
                    node.getLine(), node.name));
        }
    }

    @Override
    public void visit(FunctionCallExpr node) {
        // Check if function is defined
        if (node.callee instanceof IdentifierExpr) {
            IdentifierExpr id = (IdentifierExpr) node.callee;
            Symbol symbol = symbolTable.lookup(id.name);
            if (symbol == null || symbol.getType() != SymbolKind.FUNCTION) {
                symbolTable.addError(String.format("Warning at line %d: Function '%s' may not be defined",
                        node.getLine(), id.name));
            }
        }

        // Visit arguments
        if (node.args != null) {
            for (Expression arg : node.args) {
                visit(arg);
            }
        }
    }


    // For other expression types, just visit their children
    @Override
    public void visit(BinaryExpr node) {
        visit(node.left);
        visit(node.right);
    }

    @Override
    public void visit(ArrayLiteral node) {
        if (node.elements != null) {
            for (Expression item : node.elements) {
                visit(item);
            }
        }
    }

    @Override
    public void visit(DictLiteral node) {
        if (node.entries != null) {
            for (KeyValue pair : node.entries) {
                visit(pair.key);
                visit(pair.value);
            }
        }
    }

    @Override
    public void visit(IndexExpr node) {
        visit(node.array);
        visit(node.index);
    }

    @Override
    public void visit(AttributeExpr node) {
        visit(node.target);
    }

    @Override
    public void visit(KeyValue node) {
        visit(node.key);
        visit(node.value);
    }

    // Leaf nodes - no children to visit
    @Override
    public void visit(NumberExpr node) {
        // No children
    }

    @Override
    public void visit(StringExpr node) {
        // No children
    }

    @Override
    public void visit(BooleanExpr node) {
        // No children
    }

    // Other statements
    @Override
    public void visit(PrintStmt node) {
        visit(node.expr);
    }

    @Override
    public void visit(ReturnStmt node) {
        if (node.expr != null) {
            visit(node.expr);
        }
    }

    @Override
    public void visit(ExprStmt node) {
        visit(node.expr);
    }

    @Override
    public void visit(ArrayAssignStmt node) {
        // Visit array expression, index, and value
        visit(node.array);
        visit(node.index);
        visit(node.value);
    }
}