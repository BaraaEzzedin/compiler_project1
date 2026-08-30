import AST.Program;
import CodeGeneration.*;
import JinjaCssGrammar.ProjectLexer;
import JinjaCssGrammar.ProjectParser;
import PyFlaskGrammar.PyFlaskGrammar.PythonLexer;
import PyFlaskGrammar.PyFlaskGrammar.PythonParser;
import SymbolTable.JijnaCss.JinjaTemplateInfo;
import SymbolTable.JijnaCss.SymbolTableBuilder;
import SymbolTable.PyFlask.SemanticAnalyzer;
import Visitor.ProjectVisitor;
import Visitor.PythonVisitor;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.tree.ParseTree;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.*;
import java.util.stream.Stream;

import static org.antlr.v4.runtime.CharStreams.fromFileName;

public class Compiler {
    public void generate() throws IOException {
        try {
            clearProductsDirectory();
            
            Path outputDir = Path.of("compiler_output");

            Files.createDirectories(outputDir);
            Files.createDirectories(outputDir.resolve("ast_jinja"));
            Files.createDirectories(outputDir.resolve("templates"));
            Files.createDirectories(outputDir.resolve("templates/products"));

            Map<String, JinjaTemplateInfo> templates = new HashMap<>();
            Map<String, AST.JinjaCss.Program> templatePrograms = new HashMap<>();

            String[] templateFiles = {
                    "add.html",
                    "list.html",
                    "view.html"
            };

            for (String fileName : templateFiles) {

                String path = "templates/" + fileName;

                CharStream input = CharStreams.fromFileName(path);

                ProjectLexer lexer = new ProjectLexer(input);

                CommonTokenStream token =
                        new CommonTokenStream(lexer);

                ProjectParser parser =
                        new ProjectParser(token);

                ParseTree tree = parser.program();

                ProjectVisitor visitor =
                        new ProjectVisitor();

                AST.JinjaCss.Program program =
                        (AST.JinjaCss.Program) visitor.visit(tree);

                Files.writeString(
                        outputDir.resolve("ast_jinja")
                                .resolve(fileName.replace(".html", "_ast.txt")),
                        program.prettyPrint(0)
                );

                SymbolTableBuilder builder =
                        new SymbolTableBuilder(fileName);

                builder.build(program);

                templates.put(
                        fileName,
                        builder.getTemplateInfo()
                );

                templatePrograms.put(
                        fileName,
                        program
                );
            }

            String pythonPath = "samples/test.py";
            CharStream pythonInput = fromFileName(pythonPath);
            PythonLexer pythonLexer = new PythonLexer(pythonInput);
            CommonTokenStream pythonToken = new CommonTokenStream(pythonLexer);

            PythonParser pythonParser = new PythonParser(pythonToken);
            ParseTree pythonTree = pythonParser.prog();
            PythonVisitor programVisitor = new PythonVisitor();
            AST.Program ast = (Program) programVisitor.visit(pythonTree);

            Files.writeString(
                    outputDir.resolve("ast_python.txt"),
                    ast.toString()
            );

            // Build symbol table
            SymbolTable.PyFlask.SymbolTableBuilder pythonSymbolTableBuilder = new SymbolTable.PyFlask.SymbolTableBuilder();
            ast.accept(pythonSymbolTableBuilder);

            // Print symbol table
            SemanticAnalyzer analyzer = new SemanticAnalyzer(pythonSymbolTableBuilder.getSymbolTable());
            ast.accept(analyzer);

//            analyzer.validateTemplateVariables(templates);

//            analyzer.printErrors();
            Files.writeString(
                    outputDir.resolve("semantic_report.txt"),
                    analyzer.getReport()
            );

            List<TemplateInvocation> templateInvocations =
                    new ArrayList<>();
            RuntimeExtractor extractor =
                    new RuntimeExtractor(templateInvocations);

            ast.accept(extractor);

            for (TemplateInvocation invocation : templateInvocations) {

                if (invocation.getTemplateName().equals("view.html")) {
                    continue;
                }
                AST.JinjaCss.Program program =
                        templatePrograms.get(
                                invocation.getTemplateName());

                JinjaCodeGenerator generator =
                        new JinjaCodeGenerator(
                                invocation.getContext());

                String html =
                        generator.generate(program);

                Files.writeString(
                        outputDir.resolve("templates")
                                .resolve(invocation.getTemplateName()),
                        html
                );
            }
            TemplateInvocation listInvocation =
                    findInvocation(templateInvocations, "list.html");

            List<?> products =
                    (List<?>) listInvocation
                            .getContext()
                            .get("products");

            for (Object item : products) {

                GenerationContext ctx =
                        new GenerationContext();

                ctx.put("product", item);

                JinjaCodeGenerator generator =
                        new JinjaCodeGenerator(ctx);

                String html =
                        generator.generate(templatePrograms.get("view.html"));

                Map<?, ?> map =
                        (Map<?, ?>) item;

                Object id =
                        map.get("id");

                String filename;

                if (id instanceof Double d) {
                    filename = String.valueOf(d.intValue());
                } else {
                    filename = id.toString();
                }

                Files.writeString(
                        outputDir.resolve(
                                "templates/products/" + filename + ".html"),
                        html);
            }
            StringBuilder sb = new StringBuilder();

            for (TemplateInvocation invocation : templateInvocations) {

                sb.append("Template: ")
                        .append(invocation.getTemplateName())
                        .append(System.lineSeparator());

                sb.append(invocation.getContext())
                        .append(System.lineSeparator())
                        .append(System.lineSeparator());
            }

            Files.writeString(
                    outputDir.resolve("runtime_context.txt"),
                    sb.toString()
            );
            PythonCodeGeneration generator = new PythonCodeGeneration();
            generator.generate(ast);
            generator.writeToFile("app.py");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void clearProductsDirectory() throws IOException {
        Path productsDir = Path.of("compiler_output", "templates", "products");
        if (!Files.exists(productsDir)) {
            Files.createDirectories(productsDir);
            return;
        }
        try (Stream<Path> paths = Files.walk(productsDir)) {
            paths.sorted(Comparator.reverseOrder())
                    .forEach(path -> {
                        try {
                            if (!path.equals(productsDir)) {
                                Files.delete(path);
                            }
                        } catch (IOException e) {
                            throw new RuntimeException(e);
                        }
                    });
        }
    }

    public TemplateInvocation findInvocation(List<TemplateInvocation> invocations, String template) {
        for (TemplateInvocation invocation : invocations) {
            if (invocation.getTemplateName().equals(template)) {
                return invocation;
            }
        }
        return null;
    }
}
