package CodeGeneration;

import AST.JinjaCss.JinjaExpression;
import AST.JinjaCss.JinjaExpressions.JinjaIdentifier;

import java.util.List;
import java.util.Map;

public class JinjaExpressionEvaluator {

    private GenerationContext context;

    public JinjaExpressionEvaluator(
            GenerationContext context) {

        this.context = context;
    }

//    public Object evaluate(
//            JinjaExpression expr) {
//        if (expr instanceof JinjaIdentifier id) {
//

    /// /            Object current =
    /// /                    context.get(id.parts.get(0));
    /// /
    /// /            for (int i = 1; i < id.parts.size(); i++) {
    /// /
    /// /                if (!(current instanceof Map<?, ?> map))
    /// /                    return null;
    /// /
    /// /                current =
    /// /                        map.get(id.parts.get(i));
    /// /
    /// /            }
    /// /
    /// /            return current;
//            Object firstObject = context.get(id.parts.get(0));
//
//            if (firstObject instanceof List<?>) {
//                // Case 2: It's a list
//                List<?> list = (List<?>) firstObject;
//
//                for (Object item : list) {
//                    Object current = item;
//                    for (int i = 1; i < id.parts.size(); i++) {
//                        if (current instanceof Map<?, ?> map) {
//                            current = map.get(id.parts.get(i));
//                        } else {
//                            current = null;
//                            break;
//                        }
//                    }
//                    return current;
//                }
//            } else {
//                // Case 1: It's a single object
//                Object current = firstObject;
//                for (int i = 1; i < id.parts.size(); i++) {
//                    if (!(current instanceof Map<?, ?> map))
//                        return null;
//                    current = map.get(id.parts.get(i));
//                }
//                return current;
//            }
//        }
//        return null;
//    }
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

        return null;
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
