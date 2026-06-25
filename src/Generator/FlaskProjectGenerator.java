package Generator;

import AST.JinjaCss.HtmlElements.NormalHtmlElement;
import AST.JinjaCss.HtmlElements.StyleElement;
import AST.JinjaCss.Program;
import AST.JinjaCss.Statement;

import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import java.util.TreeSet;

public class FlaskProjectGenerator {

    private final CodeGenerationContext context;

    private final Map<String, String> generatedTemplates = new LinkedHashMap<>();

    private final Map<String, Set<String>> missingVariablesByTemplate = new LinkedHashMap<>();

    private String generatedAppPy;
    private String generatedCss;

    public FlaskProjectGenerator(CodeGenerationContext context) {
        this.context = context;
    }

    public void generate() {
        generatedAppPy = new PythonCodeGenerator(context).generate();

        JinjaCodeGenerator jinjaGenerator = new JinjaCodeGenerator(context);
        StringBuilder css = new StringBuilder();

        for (Map.Entry<String, CodeGenerationContext.TemplateInfo> entry : context.templates.entrySet()) {
            String templateName = entry.getKey();
            Program jinjaAst = entry.getValue().jinjaAst;

            Set<String> missing = new TreeSet<>();
            String html = jinjaGenerator.generate(templateName, jinjaAst, missing);

            generatedTemplates.put(templateName, html);
            if (!missing.isEmpty()) {
                missingVariablesByTemplate.put(templateName, missing);
            }

            collectCss(jinjaAst, css);
        }

        generatedCss = css.toString();
    }

    private void collectCss(Program jinjaAst, StringBuilder css) {
        for (Statement stmt : jinjaAst.getStatements()) {
            collectCssFromStatement(stmt, css);
        }
    }

    private void collectCssFromStatement(Statement stmt, StringBuilder css) {
        if (stmt instanceof StyleElement style) {
            if (css.length() > 0) {
                css.append("\n\n");
            }
            css.append(style.toString());
        } else if (stmt instanceof NormalHtmlElement normal && normal.content != null) {
            for (Statement child : normal.content) {
                collectCssFromStatement(child, css);
            }
        }
    }

    public void writeTo(Path outputDir) throws IOException {
        if (generatedAppPy == null) {
            generate();
        }

        Files.createDirectories(outputDir);
        Files.writeString(outputDir.resolve("app.py"), generatedAppPy, StandardCharsets.UTF_8);

        Path templatesDir = outputDir.resolve("templates");
        Files.createDirectories(templatesDir);
        for (Map.Entry<String, String> entry : generatedTemplates.entrySet()) {
            Files.writeString(templatesDir.resolve(entry.getKey()), entry.getValue(), StandardCharsets.UTF_8);
        }

        Path staticDir = outputDir.resolve("static");
        Files.createDirectories(staticDir);
        Files.writeString(staticDir.resolve("style.css"), generatedCss, StandardCharsets.UTF_8);
    }

    public String getGeneratedAppPy() {
        return generatedAppPy;
    }

    public Map<String, String> getGeneratedTemplates() {
        return generatedTemplates;
    }

    public String getGeneratedCss() {
        return generatedCss;
    }

    public Map<String, Set<String>> getMissingVariablesByTemplate() {
        return missingVariablesByTemplate;
    }

    public void printSummary() {
        System.out.println("\n=== Code Generation Summary ===");
        System.out.println("Top-level Python variables discovered: " + new TreeSet<>(context.topLevelVariables));
        System.out.println("Templates generated: " + new TreeSet<>(generatedTemplates.keySet()));

        if (missingVariablesByTemplate.isEmpty()) {
            System.out.println("All template variables are supplied by a render_template() call.");
        } else {
            System.out.println("Templates referencing variables not supplied by any render_template() call:");
            for (Map.Entry<String, Set<String>> entry : missingVariablesByTemplate.entrySet()) {
                System.out.println("  " + entry.getKey() + ": " + entry.getValue());
            }
        }
    }
}
