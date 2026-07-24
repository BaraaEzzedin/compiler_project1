package SymbolTable.PyFlask;

import java.util.HashMap;
import java.util.Map;

public class TemplateContext {
    public String templateName;

    public Map<String, Object> passedVariables =
            new HashMap<>();
}
