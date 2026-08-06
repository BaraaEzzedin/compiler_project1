package CodeGeneration;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

/**
 * The URL rules collected from the @app.route decorators of the Flask program.
 * It is what lets url_for(...) be resolved while generating code, so the output
 * never has to ask Flask for a URL at runtime.
 */
public class RouteTable {

    /**
     * A single rule, e.g. "/products/&lt;int:product_id&gt;" split into the text
     * around its converters and the parameter names those converters bind.
     */
    public static class Route {
        public final String endpoint;
        public final String rule;

        /**
         * The literal pieces of the rule; there is always one more of these
         * than there are parameters.
         */
        public final List<String> literals = new ArrayList<>();

        /**
         * The parameter name of every &lt;converter:name&gt; in the rule.
         */
        public final List<String> parameters = new ArrayList<>();

        Route(String endpoint, String rule) {
            this.endpoint = endpoint;
            this.rule = rule;
            split();
        }

        private void split() {
            int index = 0;

            while (index < rule.length()) {

                int open = rule.indexOf('<', index);

                if (open < 0) {
                    literals.add(rule.substring(index));
                    return;
                }

                int close = rule.indexOf('>', open);

                if (close < 0) {
                    literals.add(rule.substring(index));
                    return;
                }

                literals.add(rule.substring(index, open));

                String converter = rule.substring(open + 1, close);

                int colon = converter.indexOf(':');

                parameters.add(
                        colon < 0
                                ? converter
                                : converter.substring(colon + 1));

                index = close + 1;
            }

            literals.add("");
        }
    }

    private final Map<String, Route> routes = new LinkedHashMap<>();

    public void add(String endpoint, String rule) {
        routes.put(endpoint, new Route(endpoint, rule));
    }

    public Route get(String endpoint) {
        return routes.get(endpoint);
    }

    public boolean contains(String endpoint) {
        return routes.containsKey(endpoint);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();

        for (Route route : routes.values()) {
            sb.append(route.endpoint)
                    .append(" -> ")
                    .append(route.rule)
                    .append(System.lineSeparator());
        }

        return sb.toString();
    }
}
