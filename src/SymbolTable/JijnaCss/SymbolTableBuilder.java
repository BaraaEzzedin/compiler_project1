package SymbolTable.JijnaCss;

import AST.*;
import AST.JinjaCss.CSSDeclarations.CSSDeclaration;
import AST.JinjaCss.CSSSelectors.*;
import AST.JinjaCss.CSSSimpleSelector;
import AST.JinjaCss.CSSStatement;
import AST.JinjaCss.CSSStatements.*;
import AST.JinjaCss.HtmlElement;
import AST.JinjaCss.HtmlElements.*;
import AST.JinjaCss.JinjaExpression;
import AST.JinjaCss.Statements.*;
import AST.JinjaCss.JinjaExpressions.*;
public class SymbolTableBuilder {
    private ProjectSymbolTable symbolTable;
    private SymbolTable currentJinjaScope;

    public SymbolTableBuilder() {
        this.symbolTable = new ProjectSymbolTable();
        this.currentJinjaScope = symbolTable.getJinjaVariables();

        addPredefinedVariable("section");
        addPredefinedVariable("products");
        addPredefinedVariable("product");
    }

    private void addPredefinedVariable(String name) {
        currentJinjaScope.define(name, new JinjaVariableSymbol(name, 0));
    }

    public ProjectSymbolTable getSymbolTable() {
        return symbolTable;
    }

    public void build(Program program) {
        for (Statement stmt : program.statements) {
            visitStatement(stmt);
        }
    }

    private void visitStatement(Statement stmt) {
        if (stmt instanceof HtmlElement) {
            visitHtmlElement((HtmlElement) stmt);
        } else if (stmt instanceof JinjaIfStatement) {
            visitJinjaIfStatement((JinjaIfStatement) stmt);
        } else if (stmt instanceof JinjaForStatement) {
            visitJinjaForStatement((JinjaForStatement) stmt);
        } else if (stmt instanceof JinjaVariableStatement) {
            visitJinjaVariableStatement((JinjaVariableStatement) stmt);
        }
    }

    private void visitHtmlElement(HtmlElement element) {
        if (element instanceof NormalHtmlElement) {
            visitNormalHtmlElement((NormalHtmlElement) element);
        } else if (element instanceof StyleElement) {
            visitStyleElement((StyleElement) element);
        } else if (element instanceof SelfClosingHtmlElement) {
            visitSelfClosingHtmlElement((SelfClosingHtmlElement) element);
        }
    }

    private void visitSelfClosingHtmlElement(SelfClosingHtmlElement element) {
        for (HtmlAttribute attr : element.attributes) {
            if (attr.name.equals("id")) {
                symbolTable.getHtmlIds().define(
                        attr.value,
                        new HTMLIdSymbol(attr.value, attr.line)
                );
            } else if (attr.name.equals("class")) {
                 String[] classes = attr.value.split("\\s+");
                for (String className : classes) {
                    CSSClassSymbol symbol = (CSSClassSymbol) symbolTable.getCssClasses().resolve(className);
                    if (symbol != null) {
                        symbol.isUsed = true;
                    } else {
                        System.err.println("Warning: CSS class '" + className + "' used but not defined (line " + attr.line + ")");
                    }
                }
            }
        }
    }

    private void visitNormalHtmlElement(NormalHtmlElement element) {
        for (HtmlAttribute attr : element.attributes) {
            if (attr.name.equals("id")) {
                symbolTable.getHtmlIds().define(
                        attr.value,
                        new HTMLIdSymbol(attr.value, attr.line)
                );
            } else if (attr.name.equals("class")) {
                String[] classes = attr.value.split("\\s+");
                for (String className : classes) {
                    CSSClassSymbol symbol = (CSSClassSymbol) symbolTable.getCssClasses().resolve(className);
                    if (symbol != null) {
                        symbol.isUsed = true;
                    } else {
                        System.err.println("Warning: CSS class '" + className + "' used but not defined (line " + attr.line + ")");
                    }
                }
            }
        }

        for (Statement stmt : element.content) {
            visitStatement(stmt);
        }
    }

    private void visitStyleElement(StyleElement element) {
        for (CSSStatement stmt : element.cssStatements) {
            if (stmt instanceof CSSRule) {
                visitCSSRule((CSSRule) stmt);
            } else if (stmt instanceof CSSMediaRule) {
                visitCSSMediaRule((CSSMediaRule) stmt);
            }
        }
    }

    public void visitCSSRule(CSSRule node) {
        for (CSSSelectorSequence sequence : node.selector.selectorSequences) {
            for (CSSCompoundSelector compound : sequence.compoundSelectors) {
                for (CSSSimpleSelector simple : compound.simpleSelectors) {
                    if (simple instanceof CSSClassSelector) {
                        CSSClassSelector classSelector = (CSSClassSelector) simple;
                        symbolTable.getCssClasses().define(
                                classSelector.className,
                                new CSSClassSymbol(classSelector.className, classSelector.line)
                        );
                    } else if (simple instanceof CSSIdSelector) {
                        CSSIdSelector idSelector = (CSSIdSelector) simple;
                        symbolTable.getCssIds().define(
                                idSelector.idName,
                                new CSSIdSymbol(idSelector.idName, idSelector.line)
                        );
                    }
                }
            }
        }

        for (CSSDeclaration decl : node.declarations) {
            if (decl.property.startsWith("--")) {
                symbolTable.getCssVariables().define(
                        decl.property,
                        new CSSVariableSymbol(decl.property, decl.value.toString(), decl.line)
                );
            }
        }
    }

    private void visitCSSMediaRule(CSSMediaRule node) {
        for (CSSRule rule : node.rules) {
            visitCSSRule(rule);
        }
    }

    public void visitJinjaForStatement(JinjaForStatement node) {
        visitJinjaExpression(node.iterable);

        SymbolTable loopScope = new SymbolTable("for-loop", currentJinjaScope);
        loopScope.define(
                node.variable,
                new JinjaVariableSymbol(node.variable, node.line)
        );
        SymbolTable prevScope = currentJinjaScope;
        currentJinjaScope = loopScope;

        for (Statement stmt : node.body) {
            visitStatement(stmt);
        }

        currentJinjaScope = prevScope;
    }

    private void visitJinjaIfStatement(JinjaIfStatement node) {

        visitJinjaExpression(node.condition);

        for (Statement stmt : node.thenBody) {
            visitStatement(stmt);
        }

        for (JinjaElifStatement elif : node.elifStatements) {
            visitJinjaExpression(elif.condition);
            for (Statement stmt : elif.body) {
                visitStatement(stmt);
            }
        }
        if (node.elseStatement != null) {
            for (Statement stmt : node.elseStatement.body) {
                visitStatement(stmt);
            }
        }
    }

    private void visitJinjaVariableStatement(JinjaVariableStatement node) {
        visitJinjaExpression(node.expression);
    }

    private void visitJinjaExpression(JinjaExpression expr) {
        if (expr instanceof JinjaIdentifier) {
            visitJinjaIdentifier((JinjaIdentifier) expr);
        } else if (expr instanceof JinjaBinaryExpression) {
            JinjaBinaryExpression binExpr = (JinjaBinaryExpression) expr;
            visitJinjaExpression(binExpr.left);
            visitJinjaExpression(binExpr.right);
        } else if (expr instanceof JinjaFilterExpression) {
            JinjaFilterExpression filterExpr = (JinjaFilterExpression) expr;
            visitJinjaExpression(filterExpr.expression);
        } else if (expr instanceof JinjaParenthesesExpression) {
            JinjaParenthesesExpression parenExpr = (JinjaParenthesesExpression) expr;
            visitJinjaExpression(parenExpr.expression);
        }

    }

    public void visitJinjaIdentifier(JinjaIdentifier node) {
        String baseVar = node.parts.get(0);
        Symbol symbol = currentJinjaScope.resolve(baseVar);
        if (symbol == null) {
            System.out.println("Info: Variable '" + baseVar + "' (line " + node.line + ") - assumed from template context");
        }
    }

    public void printStatistics() {
        System.out.println("\n=== Symbol Table Statistics ===");

        System.out.println("\nCSS Classes Defined: " + symbolTable.getCssClasses().symbols.size());
        for (var entry : symbolTable.getCssClasses().symbols.entrySet()) {
            CSSClassSymbol symbol = (CSSClassSymbol) entry.getValue();
            String status = symbol.isUsed ? "USED" : "UNUSED";
            System.out.println("  ." + entry.getKey() + " (line " + symbol.line + ") - " + status);
        }

        System.out.println("\nCSS Variables Defined: " + symbolTable.getCssVariables().symbols.size());
        for (var entry : symbolTable.getCssVariables().symbols.entrySet()) {
            Symbol symbol = entry.getValue();
            System.out.println("  " + entry.getKey() + " (line " + symbol.line + ")");
        }

        System.out.println("\nCSS IDs Defined: " + symbolTable.getCssIds().symbols.size());
        for (var entry : symbolTable.getCssIds().symbols.entrySet()) {
            Symbol symbol = entry.getValue();
            System.out.println("  #" + entry.getKey() + " (line " + symbol.line + ")");
        }

        System.out.println("\nHTML IDs: " + symbolTable.getHtmlIds().symbols.size());
        for (var entry : symbolTable.getHtmlIds().symbols.entrySet()) {
            Symbol symbol = entry.getValue();
            System.out.println("  #" + entry.getKey() + " (line " + symbol.line + ")");
        }
    }
}