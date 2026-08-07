package CodeGeneration;

import AST.PyFlask.Expression;
import AST.PyFlask.Expressions.*;
import helper.JsonFunctions;

import java.nio.file.Path;
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
        if (expr instanceof TupleExpr list) {
            List<Object> result =
                    new ArrayList<>();

            for (Expression e : list.elements) {

                result.add(
                        evaluate(e));

            }

            return result;
        }

        if (expr instanceof FunctionCallExpr call) {
            return evaluateFunctionCall(call);
        }
        return null;
    }

    private Object evaluateFunctionCall(FunctionCallExpr node) {

        if (!(node.callee instanceof IdentifierExpr id)) {
            return null;
        }

        switch (id.name) {

            case "jsonLoad": {

//                String path =
//                        (String) evaluate(node.args.get(0));
                Path pythonFile = Path.of("compiler_output/app.py");

                Path jsonPath = pythonFile
                        .getParent()
                        .resolve("products.json")
                        .normalize();

                return JsonFunctions.json_load(jsonPath.toString());
//                return JsonFunctions.json_load(path);
            }

            default:
                return null;
        }
    }
}
