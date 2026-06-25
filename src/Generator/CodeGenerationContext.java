package Generator;

import AST.Program;
import SymbolTable.JijnaCss.JinjaTemplateInfo;
import SymbolTable.PyFlask.TemplateContext;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class CodeGenerationContext {

    public final Program pythonAst;

    public final Map<String, TemplateInfo> templates = new HashMap<>();

    public final Set<String> topLevelVariables = new HashSet<>();

    public CodeGenerationContext(Program pythonAst) {
        this.pythonAst = pythonAst;
    }

    public static class TemplateInfo {
        public final String templateName;
        public final AST.JinjaCss.Program jinjaAst;
        public final Set<String> requiredVariables;

        public final Set<String> suppliedVariables = new HashSet<>();

        public final List<TemplateContext> callSites = new ArrayList<>();

        public TemplateInfo(String templateName, AST.JinjaCss.Program jinjaAst, JinjaTemplateInfo info) {
            this.templateName = templateName;
            this.jinjaAst = jinjaAst;
            this.requiredVariables = info != null ? info.getTemplateVariables() : new HashSet<>();
        }

        public Set<String> missingVariables() {
            Set<String> missing = new HashSet<>(requiredVariables);
            missing.removeAll(suppliedVariables);
            return missing;
        }
    }

    public void registerTemplate(String templateName, AST.JinjaCss.Program jinjaAst, JinjaTemplateInfo info) {
        templates.put(templateName, new TemplateInfo(templateName, jinjaAst, info));
    }

    public void linkCallSite(TemplateContext callSite) {
        TemplateInfo info = templates.get(callSite.templateName);
        if (info == null) {
            return;
        }
        info.callSites.add(callSite);
        info.suppliedVariables.addAll(callSite.passedVariables);
    }

    public TemplateInfo getTemplate(String templateName) {
        return templates.get(templateName);
    }
}
