package CodeGeneration;

import AST.JinjaCss.CSSDeclarations.CSSDeclaration;
import AST.JinjaCss.CSSSelectors.*;
import AST.JinjaCss.CSSStatement;
import AST.JinjaCss.CSSStatements.CSSMediaExpression;
import AST.JinjaCss.CSSStatements.CSSMediaQuery;
import AST.JinjaCss.CSSStatements.CSSMediaRule;
import AST.JinjaCss.CSSStatements.CSSRule;
import AST.JinjaCss.CSSTerm;
import AST.JinjaCss.CSSTerms.*;
import AST.JinjaCss.CSSValue;
import AST.JinjaCss.CSSSimpleSelector;
import AST.JinjaCss.HtmlElements.StyleElement;

import java.util.List;

/**
 * Turns the CSS half of a template back into stylesheet text. A stylesheet holds
 * no Jinja, so this is the same job whether the caller is producing HTML directly
 * or producing Python that will produce HTML.
 */
public class CssSerializer {

    private final StringBuilder out = new StringBuilder();

    public static String serialize(StyleElement node) {
        return serialize(node.cssStatements);
    }

    public static String serialize(List<CSSStatement> statements) {
        CssSerializer serializer = new CssSerializer();

        for (CSSStatement stmt : statements) {
            serializer.visitCSSStatement(stmt);
        }

        return serializer.out.toString();
    }

    private void visitCSSStatement(CSSStatement stmt) {
        if (stmt instanceof CSSRule node) {
            visitCSSRule(node);
        } else if (stmt instanceof CSSMediaRule node) {
            visitCSSMediaRule(node);
        }
    }

    private void visitCSSMediaRule(CSSMediaRule node) {
        out.append("@media ");

        visitCSSMediaQuery(node.mediaQuery);

        out.append(" {\n");

        for (CSSRule rule : node.rules) {
            visitCSSRule(rule);
        }

        out.append("}\n");
    }

    private void visitCSSMediaQuery(CSSMediaQuery node) {
        visitCSSMediaExpression(node.expression);
    }

    private void visitCSSMediaExpression(CSSMediaExpression node) {
        out.append("(");

        out.append(node.feature);

        if (node.value != null) {

            out.append(": ");

            visitCSSValue(node.value);
        }

        out.append(")");
    }

    private void visitCSSRule(CSSRule node) {
        visitCSSSelector(node.selector);

        out.append(" {\n");

        for (CSSDeclaration decl : node.declarations) {
            visitCSSDeclaration(decl);
        }

        out.append("}\n");
    }

    private void visitCSSDeclaration(CSSDeclaration node) {
        out.append("    ");

        out.append(node.property);

        out.append(": ");

        visitCSSValue(node.value);

        out.append(";\n");
    }

    private void visitCSSValue(CSSValue value) {
        if (value instanceof CSSSingleValue node) {
            visitCSSSingleValue(node);
        } else if (value instanceof CSSMultipleValues node) {
            visitCSSMultipleValues(node);
        } else if (value instanceof CSSValueList node) {
            visitCSSValueList(node);
        }
    }

    private void visitCSSValueList(CSSValueList node) {
        for (int i = 0; i < node.values.size(); i++) {

            visitCSSValue(node.values.get(i));

            if (i < node.values.size() - 1) {
                out.append(", ");
            }
        }
    }

    private void visitCSSMultipleValues(CSSMultipleValues node) {
        for (int i = 0; i < node.terms.size(); i++) {

            visitCSSTerm(node.terms.get(i));

            if (i < node.terms.size() - 1) {
                out.append(" ");
            }
        }
    }

    private void visitCSSSingleValue(CSSSingleValue node) {
        visitCSSTerm(node.term);
    }

    private void visitCSSTerm(CSSTerm node) {
        if (node instanceof CSSIdentifier t) {
            visitCSSIdentifier(t);
        } else if (node instanceof CSSColor t) {
            visitCSSColor(t);
        } else if (node instanceof CSSString t) {
            visitCSSString(t);
        } else if (node instanceof CSSVariable t) {
            visitCSSVariable(t);
        } else if (node instanceof CSSNumberTerm t) {
            visitCSSNumberTerm(t);
        } else if (node instanceof CSSFunctionTerm t) {
            visitCSSFunctionTerm(t);
        }
    }

    private void visitCSSString(CSSString t) {
        out.append(t.value);
    }

    private void visitCSSVariable(CSSVariable t) {
        out.append(t.name);
    }

    private void visitCSSNumberTerm(CSSNumberTerm node) {
        if (node.number == Math.floor(node.number))
            out.append((int) node.number);
        else
            out.append(node.number);
        if (node.unit != null) {
            out.append(node.unit);
        }
    }

    private void visitCSSFunctionTerm(CSSFunctionTerm node) {
        out.append(node.functionName);
        out.append("(");

        if (node.arguments.values.size() == 1 &&
                node.arguments.values.get(0) instanceof CSSMultipleValues multi) {

            for (int i = 0; i < multi.terms.size(); i++) {

                visitCSSTerm(multi.terms.get(i));

                if (i < multi.terms.size() - 1) {
                    out.append(", ");
                }
            }

        } else {

            visitCSSValueList(node.arguments);
        }

        out.append(")");
    }

    private void visitCSSColor(CSSColor t) {
        out.append(t.value);
    }

    private void visitCSSIdentifier(CSSIdentifier node) {
        out.append(node.name);
    }

    private void visitCSSSelector(CSSSelector node) {
        for (int i = 0; i < node.selectorSequences.size(); i++) {

            visitCSSSelectorSequence(
                    node.selectorSequences.get(i));

            if (i < node.selectorSequences.size() - 1) {
                out.append(", ");
            }
        }
    }

    private void visitCSSSelectorSequence(CSSSelectorSequence node) {
        for (int i = 0; i < node.compoundSelectors.size(); i++) {

            visitCSSCompoundSelector(node.compoundSelectors.get(i));

            if (i < node.compoundSelectors.size() - 1) {
                out.append(" ");
            }
        }
    }

    private void visitCSSCompoundSelector(CSSCompoundSelector node) {
        for (CSSSimpleSelector selector :
                node.simpleSelectors) {

            visitCSSSimpleSelector(selector);
        }
    }

    private void visitCSSSimpleSelector(CSSSimpleSelector selector) {

        if (selector instanceof CSSClassSelector node) {
            visitCSSClassSelector(node);
        } else if (selector instanceof CSSTypeSelector node) {
            visitCSSTypeSelector(node);
        } else if (selector instanceof CSSUniversalSelector node) {
            visitCSSUniversalSelector(node);
        } else if (selector instanceof CSSPseudoSelector node) {
            visitCSSPseudoSelector(node);
        }
    }

    private void visitCSSUniversalSelector(CSSUniversalSelector node) {
        out.append("*");
    }

    private void visitCSSPseudoSelector(CSSPseudoSelector node) {
        out.append(":").append(node.pseudoName);
    }

    private void visitCSSTypeSelector(CSSTypeSelector node) {
        out.append(node.elementName);
    }

    private void visitCSSClassSelector(CSSClassSelector node) {
        out.append('.').append(node.className);

        if (node.pseudoSelector != null) {
            visitCSSPseudoSelector(node.pseudoSelector);
        }
    }
}
