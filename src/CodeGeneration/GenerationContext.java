package CodeGeneration;

import java.util.HashMap;
import java.util.Map;

public class GenerationContext {
    Map<String, Object> variables =
            new HashMap<>();

    public void put(String name, Object value) {
        variables.put(name, value);
    }

    public Object get(String name) {
        return variables.get(name);
    }

    public boolean contains(String name) {
        return variables.containsKey(name);
    }

    public void remove(String name) {
        variables.remove(name);
    }

    @Override
    public String toString() {
        return variables.toString();
    }
}
