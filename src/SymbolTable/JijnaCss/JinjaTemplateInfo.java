package SymbolTable.JijnaCss;

import java.util.HashSet;
import java.util.Set;

public class JinjaTemplateInfo {
    private final String templateName;

    private final Set<String> templateVariables =
            new HashSet<>();

    public JinjaTemplateInfo(String templateName) {
        this.templateName = templateName;
    }

    public String getTemplateName() {
        return templateName;
    }

    public Set<String> getTemplateVariables() {
        return templateVariables;
    }
}
