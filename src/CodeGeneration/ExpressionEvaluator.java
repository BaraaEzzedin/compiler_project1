package CodeGeneration;

import AST.PyFlask.Expression;
import AST.PyFlask.Expressions.*;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ExpressionEvaluator {
    private GenerationContext context;

    public ExpressionEvaluator(
            GenerationContext context) {

        this.context = context;

    }

    public Object evaluate(Expression expr) {
        if (expr instanceof NumberExpr n)
            return n.value;
        if (expr instanceof StringExpr n)
            return n.value;
        if (expr instanceof BooleanExpr b)
            return b.value;
        if (expr instanceof ArrayLiteral list) {

            List<Object> result =
                    new ArrayList<>();

            for (Expression e : list.elements) {

                result.add(
                        evaluate(e));

            }

            return result;
        }
        if (expr instanceof DictLiteral dict) {
            Map<String, Object> result =
                    new HashMap<>();
            for (KeyValue kv : dict.entries) {
                String key =
                        (String) evaluate(kv.key);

                Object value =
                        evaluate(kv.value);

                result.put(key, value);
            }
            return result;
        }
        if (expr instanceof IdentifierExpr id) {

            return this.context.get(id.name);

        }
        return null;
    }
}
