package SymbolTable.PyFlask;

import AST.ASTNode;
import AST.Program;
import AST.PyFlask.Block;
import AST.PyFlask.Expression;
import AST.PyFlask.Expressions.*;
import AST.PyFlask.Statements.*;
import AST.Statement;

public class SymbolTableBuilder
        extends ASTVisitor {

    private final SymbolTable symbolTable;

    private Scope currentScope;

    public SymbolTableBuilder() {

        symbolTable = new SymbolTable();

        currentScope =
                symbolTable.getGlobalScope();
        installBuiltins();
    }

    public SymbolTable getSymbolTable() {
        return symbolTable;
    }

    private void installBuiltins() {

        currentScope.define(
                new Symbol(
                        "__name__",
                        SymbolKind.BUILTIN,
                        0));
        currentScope.define(
                new Symbol(
                        "render_template",
                        SymbolKind.BUILTIN,
                        0));

        currentScope.define(
                new Symbol(
                        "print",
                        SymbolKind.BUILTIN,
                        0));

        currentScope.define(
                new Symbol(
                        "len",
                        SymbolKind.BUILTIN,
                        0));

        currentScope.define(
                new Symbol(
                        "range",
                        SymbolKind.BUILTIN,
                        0));
        currentScope.define(
                new Symbol(
                        "True",
                        SymbolKind.BUILTIN,
                        0));
        currentScope.define(
                new Symbol(
                        "False",
                        SymbolKind.BUILTIN,
                        0));
        currentScope.define(
                new Symbol(
                        "None",
                        SymbolKind.BUILTIN,
                        0));
        currentScope.define(
                new Symbol(
                        "next",
                        SymbolKind.BUILTIN,
                        0));
        currentScope.define(
                new Symbol(
                        "global",
                        SymbolKind.BUILTIN,
                        0));
        currentScope.define(
                new Symbol(
                        "continue",
                        SymbolKind.BUILTIN,
                        0));
        currentScope.define(
                new Symbol(
                        "break",
                        SymbolKind.BUILTIN,
                        0));
        currentScope.define(
                new Symbol(
                        "pass",
                        SymbolKind.BUILTIN,
                        0));
    }


    private void bind(ASTNode node) {
        node.setScope(currentScope);
    }

    private void enterScope(String name) {
        currentScope =
                new Scope(name, currentScope);
    }

    private void exitScope() {
        if (currentScope.getParent() != null) {
            currentScope = currentScope.getParent();
        }
    }

    @Override
    public void visit(Program node) {

        bind(node);

        super.visit(node);
    }

    @Override
    public void visit(Block node) {

        bind(node);

//        enterScope("block");

        super.visit(node);

//        exitScope();
    }

    @Override
    public void visit(FunctionDef node) {

        bind(node);

        Symbol symbol = new Symbol(node.name,SymbolKind.FUNCTION,node.line);
        symbol.parameterCount = node.parameters.size();
        if(!currentScope.define(symbol)){
            SemanticAnalyzer.report(node.line,"Duplicate definition of function '" + node.name + "'");
            return;
        }


        enterScope(
                "function:" + node.name);

        for (String param : node.parameters) {
            Symbol params = new Symbol(
                    param,
                    SymbolKind.PARAMETER,
                    node.line);
            if(!currentScope.define(params)){
                SemanticAnalyzer.report(
                        node.line,
                        "Duplicate definition for param '" + param + "'"
                );
            }
        }

        if (node.body != null) {
            node.body.accept(this);
        }

        exitScope();
    }

    @Override
    public void visit(IfStmt node) {
        bind(node);

        if (node.condition != null) {
            node.condition.accept(this);
        }

        enterScope("if");

        if (node.thenBlock != null) {
            node.thenBlock.accept(this);
        }

        exitScope();

        if (node.elseBlock != null) {

            enterScope("else");

            node.elseBlock.accept(this);

            exitScope();
        }
    }

    @Override
    public void visit(ClassDef node) {

        bind(node);

        Symbol symbol = new Symbol(node.name,SymbolKind.CLASS,node.line);

        if(!currentScope.define(symbol)){
            SemanticAnalyzer.report(
                    node.line,
                    "Duplicate definition of class '" + node.name + "'"
            );
        }

        enterScope(
                "class:" + node.name);

        if (node.body != null) {
            for (Statement stmt : node.body) {
                stmt.accept(this);
            }
        }
        exitScope();
    }

    @Override
    public void visit(AssignStmt node) {

        bind(node);


        if (node.name instanceof IdentifierExpr id) {

            Symbol symbol =new Symbol(id.name,SymbolKind.VARIABLE,node.line);
            currentScope.define(symbol);
        }

        if (node.value != null) {
            node.value.accept(this);
        }
    }

    @Override
    public void visit(ImportStmt node) {

        bind(node);

        if (node.isFrom) {

            for (String name : node.imports) {

                currentScope.define(
                        new Symbol(
                                name,
                                SymbolKind.IMPORT,
                                node.line
                        )
                );
            }
        }
        else {

            currentScope.define(
                    new Symbol(
                            node.fromModule,
                            SymbolKind.IMPORT,
                            node.line
                    )
            );

            for (String name : node.imports) {

                currentScope.define(
                        new Symbol(
                                name,
                                SymbolKind.IMPORT,
                                node.line
                        )
                );
            }
        }
    }
    @Override
    public void visit(ForStmt node) {

        bind(node);

        enterScope("for");

        if (node.loopVariable instanceof IdentifierExpr id) {
            currentScope.define(
                    new Symbol(
                            id.name,
                            SymbolKind.VARIABLE,
                            node.line
                    )
            );
        }

        super.visit(node);

        exitScope();
    }

    @Override
    public void visit(GeneratorExpr node) {

        bind(node);

        enterScope("generator");

        currentScope.define(
                new Symbol(
                        node.loopVar.name,
                        SymbolKind.VARIABLE,
                        node.line));

        node.loopVar.accept(this);

        if (node.iterable != null) {
            node.iterable.accept(this);
        }

        if (node.filter != null) {
            node.filter.accept(this);
        }

        if (node.yieldVar != null) {
            node.yieldVar.accept(this);
        }

        exitScope();
    }

    @Override
    public void visit(KeyValue node) {
        bind(node);

        if (node.key != null) {
            node.key.accept(this);
        }

        if (node.value != null) {
            node.value.accept(this);
        }
    }

    @Override
    public void visit(IdentifierExpr node) {
        bind(node);
    }

    @Override
    public void visit(NumberExpr node) {
        bind(node);
    }

    @Override
    public void visit(StringExpr node) {
        bind(node);
    }

    @Override
    public void visit(BooleanExpr node) {
        bind(node);
    }
    @Override
    public void visit(BinaryExpr node) {

        bind(node);

        if (node.left != null)
            node.left.accept(this);

        if (node.right != null)
            node.right.accept(this);
    }
    @Override
    public void visit(FunctionCallExpr node) {

        bind(node);



        if (node.callee != null)
            node.callee.accept(this);

        if (node.args != null) {
            for (Expression arg : node.args) {
                arg.accept(this);
            }
        }
    }
    @Override
    public void visit(AttributeExpr node) {

        bind(node);

        if (node.target != null)
            node.target.accept(this);
    }
    @Override
    public void visit(ArrayLiteral node) {

        bind(node);

        for (Expression e : node.elements) {
            e.accept(this);
        }
    }
    @Override
    public void visit(DictLiteral node) {
        bind(node);
        super.visit(node);
    }
    @Override
    public void visit(IndexExpr node) {
        bind(node);
        super.visit(node);
    }

}