package CodeGeneration;

import AST.PyFlask.Expression;
import AST.PyFlask.Expressions.DecoratorExpr;
import AST.PyFlask.Expressions.StringExpr;
import AST.PyFlask.Statements.FunctionDef;
import SymbolTable.PyFlask.ASTVisitor;

/**
 * Walks the Flask program and records every @app.route("...") rule against the
 * function it decorates.
 */
public class RouteExtractor extends ASTVisitor {

    private final RouteTable routes;

    public RouteExtractor(RouteTable routes) {
        this.routes = routes;
    }

    @Override
    public void visit(FunctionDef node) {

        if (node.decorators != null) {

            for (DecoratorExpr decorator : node.decorators) {

                if (!isRoute(decorator)) {
                    continue;
                }

                if (decorator.arguments == null || decorator.arguments.isEmpty()) {
                    continue;
                }

                Expression firstArg = decorator.arguments.get(0);

                if (firstArg instanceof StringExpr rule) {
                    routes.add(node.name, rule.value);
                }
            }
        }

        super.visit(node);
    }

    private boolean isRoute(DecoratorExpr decorator) {

        if (decorator.nameParts == null || decorator.nameParts.isEmpty()) {
            return false;
        }

        String last =
                decorator.nameParts.get(decorator.nameParts.size() - 1);

        return last.equals("route");
    }
}
