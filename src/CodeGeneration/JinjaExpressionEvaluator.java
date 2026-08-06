package CodeGeneration;

import AST.JinjaCss.JinjaExpression;
import AST.JinjaCss.JinjaExpressions.*;

import java.util.List;
import java.util.Map;

/**
 * Evaluates a Jinja expression against the values the compiler knows about, which
 * is what the compile-time snapshot of each template is rendered with.
 */
public class JinjaExpressionEvaluator {

    private final GenerationContext context;
    private final RouteTable routes;

    public JinjaExpressionEvaluator(GenerationContext context) {
        this(context, new RouteTable());
    }

    public JinjaExpressionEvaluator(GenerationContext context, RouteTable routes) {
        this.context = context;
        this.routes = routes;
    }

    public Object evaluate(JinjaExpression expr) {

        if (expr instanceof JinjaIdentifier id) {

            Object current = context.get(id.parts.get(0));

            for (int i = 1; i < id.parts.size(); i++) {

                if (!(current instanceof Map<?, ?> map)) {
                    return null;
                }

                current = map.get(id.parts.get(i));
            }

            return current;
        }

        if (expr instanceof JinjaString string) {
            return string.value;
        }

        if (expr instanceof JinjaNumber number) {
            return number.value;
        }

        if (expr instanceof JinjaBooleanExpression bool) {
            return bool.value;
        }

        if (expr instanceof JinjaParenthesesExpression paren) {
            return evaluate(paren.expression);
        }

        if (expr instanceof JinjaBinaryExpression binary) {
            return evaluateBinary(binary);
        }

        if (expr instanceof JinjaCallExpression call) {
            return evaluateCall(call);
        }

        return null;
    }

    private Object evaluateBinary(JinjaBinaryExpression node) {

        Object left = evaluate(node.left);
        Object right = evaluate(node.right);

        switch (node.op) {
            case "==":
                return left == null ? right == null : left.equals(right);
            case "!=":
                return left == null ? right != null : !left.equals(right);
            default:
                break;
        }

        if (left instanceof String || right instanceof String) {

            if (node.op.equals("+")) {
                return text(left) + text(right);
            }

            return null;
        }

        if (!(left instanceof Number leftNumber) || !(right instanceof Number rightNumber)) {
            return null;
        }

        double a = leftNumber.doubleValue();
        double b = rightNumber.doubleValue();

        return switch (node.op) {
            case "+" -> a + b;
            case "-" -> a - b;
            case "*" -> a * b;
            default -> null;
        };
    }

    /**
     * url_for is resolved from the routes collected off the @app.route decorators,
     * so the snapshot points at the same URLs the running app will use.
     */
    private Object evaluateCall(JinjaCallExpression node) {

        if (!node.name.equals("url_for") || node.positional.isEmpty()) {
            return null;
        }

        if (!(node.positional.get(0) instanceof JinjaString endpoint)) {
            return null;
        }

        if (endpoint.value.equals("static")) {

            JinjaExpression filename = node.keyword.get("filename");

            return "/static/" + text(filename == null ? null : evaluate(filename));
        }

        RouteTable.Route route = routes.get(endpoint.value);

        if (route == null) {
            return null;
        }

        StringBuilder url = new StringBuilder();

        for (int i = 0; i < route.literals.size(); i++) {

            url.append(route.literals.get(i));

            if (i < route.parameters.size()) {

                JinjaExpression argument =
                        node.keyword.get(route.parameters.get(i));

                url.append(text(argument == null ? null : evaluate(argument)));
            }
        }

        return url.toString();
    }

    private String text(Object value) {

        if (value == null) {
            return "";
        }

        if (value instanceof Double d && d == Math.floor(d)) {
            return String.valueOf(d.intValue());
        }

        return value.toString();
    }

    public boolean isTruthy(Object value) {

        if (value == null)
            return false;

        if (value instanceof Boolean b)
            return b;

        if (value instanceof String s)
            return !s.isEmpty();

        if (value instanceof Number n)
            return n.doubleValue() != 0;

        if (value instanceof List<?> l)
            return !l.isEmpty();

        if (value instanceof Map<?, ?> m)
            return !m.isEmpty();

        return true;
    }
}
