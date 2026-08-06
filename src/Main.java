//
//public class Main {
//    public static void main(String[] args) throws Exception {
/// /        SymbolTableBuilder jinjaBuilder = null;
/// /        try {
/// /            String path = "samples/test.txt";
/// /            CharStream input = fromFileName(path);
/// /            PythonLexer lexer = new PythonLexer(input);
/// /            CommonTokenStream token = new CommonTokenStream(lexer);
/// /
/// /            PythonParser parser = new PythonParser(token);
/// /            ParseTree tree = parser.prog();
/// /            PythonVisitor programVisitor = new PythonVisitor();
/// /            AST.Program ast = (AST.Program) programVisitor.visit(tree);
/// /
/// /            System.out.println(ast);
/// /
/// /            // Build symbol table
/// /            SymbolTable.PyFlask.SymbolTableBuilder symbolTableBuilder = new SymbolTable.PyFlask.SymbolTableBuilder();
/// /            ast.accept(symbolTableBuilder);
/// /
/// /            // Print symbol table
/// ///            System.out.println("symbol table");
/// /            System.out.println("\n" + symbolTableBuilder.getSymbolTable());
/// /            SemanticAnalyzer analyzer = new SemanticAnalyzer(symbolTableBuilder.getSymbolTable());
/// /
/// /            ast.accept(analyzer);
/// /
/// /            assert jinjaBuilder != null;
/// /            analyzer.validateTemplateVariables(jinjaBuilder.getTemplateInfo());
/// /
/// /            analyzer.printErrors();
/// /
/// ///            analyzer.printTemplateContexts();
/// /
//
//        /// /
/// /        } catch (IOException e) {
/// /            e.printStackTrace();
/// /        }
/// /    }
/// /    public static void main(String[] args) {
/// /
/// /        try {
/// /
/// ///            /*
/// ///             * ==========================================
/// ///             * Parse Jinja Templates
/// ///             * ==========================================
/// ///             */
/// ///            Map<String, JinjaTemplateInfo> templates =
/// ///                    new HashMap<>();
/// ///
/// ///            File templateDir =
/// ///                    new File("templates");
/// ///
/// ///            File[] templateFiles =
/// ///                    templateDir.listFiles();
/// ///
/// ///            if (templateFiles != null) {
/// ///
/// ///                for (File file : templateFiles) {
/// ///
/// ///                    if (!file.getName()
/// ///                            .endsWith(".html")) {
/// ///                        continue;
/// ///                    }
/// ///
/// ///                    System.out.println(
/// ///                            "\n==============================");
/// ///                    System.out.println(
/// ///                            "Template: " +
/// ///                                    file.getName());
/// ///                    System.out.println(
/// ///                            "==============================");
/// ///
/// ///                    CharStream input =
/// ///                            CharStreams.fromFileName(
/// ///                                    file.getPath());
/// ///
/// ///                    ProjectLexer lexer =
/// ///                            new ProjectLexer(input);
/// ///
/// ///                    CommonTokenStream tokens =
/// ///                            new CommonTokenStream(
/// ///                                    lexer);
/// ///
/// ///                    ProjectParser parser =
/// ///                            new ProjectParser(tokens);
/// ///
/// ///                    ParseTree tree =
/// ///                            parser.program();
/// ///
/// ///                    ProjectVisitor visitor =
/// ///                            new ProjectVisitor();
/// ///
/// ///                    Program ast =
/// ///                            (Program) visitor.visit(tree);
/// ///
/// ///                    System.out.println(
/// ///                            ast.prettyPrint(0));
/// ///
/// ///                    SymbolTableBuilder builder =
/// ///                            new SymbolTableBuilder(
/// ///                                    file.getName());
/// ///
/// ///                    builder.build(ast);
/// ///
/// ///                    templates.put(
/// ///                            file.getName(),
/// ///                            builder.getTemplateInfo());
/// ///                }
/// ///            }
/// /
//        /*
//         * ==========================================
//         * Parse Flask / Python
//         * ==========================================
//         */
//        String pythonPath =
//                "samples/test.py";
//
//        CharStream pythonInput =
//                CharStreams.fromFileName(
//                        pythonPath);
//
//        PythonLexer pythonLexer =
//                new PythonLexer(
//                        pythonInput);
//
//        CommonTokenStream pythonTokens =
//                new CommonTokenStream(
//                        pythonLexer);
//
//        PythonParser pythonParser =
//                new PythonParser(
//                        pythonTokens);
//
//        ParseTree pythonTree =
//                pythonParser.prog();
//
//        PythonVisitor pythonVisitor =
//                new PythonVisitor();
//
//        AST.Program pythonAst =
//                (AST.Program)
//                        pythonVisitor.visit(
//                                pythonTree);
//
//        System.out.println(
//                "\n=== Python AST ===");
//
//        System.out.println(
//                pythonAst);
//
//        /*
//         * ==========================================
//         * Build Python Symbol Table
//         * ==========================================
//         */
//        SymbolTable.PyFlask.SymbolTableBuilder
//                symbolTableBuilder =
//                new SymbolTable.PyFlask
//                        .SymbolTableBuilder();
//
//        pythonAst.accept(
//                symbolTableBuilder);
//
//        PythonCodeGeneration generator =
//                new PythonCodeGeneration();
//
//        generator.generate(pythonAst);
//        generator.writeToFile("test.py");
//
/// /        System.out.println(generated);
/// /        GenerationContext context = new GenerationContext();
/// /
/// /        RuntimeExtractor extractor =
/// /                new RuntimeExtractor(context);
/// /
/// /        pythonAst.accept(extractor);
//
////        String path = "samples/html-test.txt";
////        CharStream input = CharStreams.fromFileName(path);
////        ProjectLexer lexer = new ProjectLexer(input);
////        CommonTokenStream token = new CommonTokenStream(lexer);
////        ProjectParser parser = new ProjectParser(token);
////        ParseTree tree = parser.program();
////        ProjectVisitor visitor = new ProjectVisitor();
////        Program program = (Program) visitor.visit(tree);
////        System.out.println(program.prettyPrint(0));
////        JinjaCodeGenerator generator =
////                new JinjaCodeGenerator(context);
////
////        String output =
////                generator.generate(program);
////        System.out.println(output);
////                System.out.println("\n=== Buildinbg Symbol Table ===");
////                jinjaBuilder = new SymbolTableBuilder("products.html");
////                jinjaBuilder.build(program);
////            symbolTableBuilder.printStatistics();
//

import AST.JinjaCss.Program;
import CodeGeneration.JinjaCodeGenerator;
import CodeGeneration.PythonCodeGeneration;
import CodeGeneration.PythonTemplateGenerator;
import CodeGeneration.RouteExtractor;
import CodeGeneration.RouteTable;
import CodeGeneration.RuntimeExtractor;
import CodeGeneration.TemplateInvocation;
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
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.tree.ParseTree;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TreeSet;

import static org.antlr.v4.runtime.CharStreams.fromFileName;

//////            System.out.println(
//////                    "\n=== Python Symbol Table ===");
//////
//////            System.out.println(
//////                    symbolTableBuilder
//////                            .getSymbolTable());
////
//////            /*
//////             * ==========================================
//////             * Semantic Analysis
//////             * ==========================================
//////             */
//////            SemanticAnalyzer analyzer =
//////                    new SemanticAnalyzer(
//////                            symbolTableBuilder
//////                                    .getSymbolTable());
//////
//////            pythonAst.accept(analyzer);
//////
//////            analyzer.validateTemplateVariables(templates);
//////
//////            /*
//////             * ==========================================
//////             * Print Errors
//////             * ==========================================
//////             */
//////            analyzer.printErrors();
////
////        } catch (Exception e) {
////
////            e.printStackTrace();
////        }
////    }
//    }
//}

public class Main {
    public static void main(String[] args) {

        try {
            Path outputDir = Path.of("compiler_output");

            Files.createDirectories(outputDir);
            Files.createDirectories(outputDir.resolve("ast_jinja"));
            Files.createDirectories(outputDir.resolve("templates"));

            Map<String, JinjaTemplateInfo> templates = new HashMap<>();
            Map<String, AST.JinjaCss.Program> templatePrograms = new HashMap<>();

            String[] templateFiles = {
                    "add.html",
                    "list.html",
                    "view.html"
            };

            for (String fileName : templateFiles) {

                String path = "templates/" + fileName;

                CharStream input = fromFileName(path);

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
            AST.Program ast = (AST.Program) programVisitor.visit(pythonTree);

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

            /*
             * ==========================================
             * Routes, so url_for can be resolved
             * ==========================================
             */
            RouteTable routes = new RouteTable();
            ast.accept(new RouteExtractor(routes));

            Files.writeString(
                    outputDir.resolve("routes.txt"),
                    routes.toString()
            );

            List<TemplateInvocation> templateInvocations =
                    new ArrayList<>();
            RuntimeExtractor extractor =
                    new RuntimeExtractor(templateInvocations);

            ast.accept(extractor);

            for (TemplateInvocation invocation : templateInvocations) {

                AST.JinjaCss.Program program =
                        templatePrograms.get(
                                invocation.getTemplateName());

                JinjaCodeGenerator generator =
                        new JinjaCodeGenerator(
                                invocation.getContext(),
                                routes);

                String html =
                        generator.generate(program);

                Files.writeString(
                        outputDir.resolve("templates")
                                .resolve(invocation.getTemplateName()),
                        html
                );
            }

            /*
             * ==========================================
             * Compile each template into a Python renderer
             * ==========================================
             */
            Map<String, String> renderFunctions = new LinkedHashMap<>();

            for (String fileName : templateFiles) {
                renderFunctions.put(fileName, renderFunctionName(fileName));
            }

            List<String> warnings = new ArrayList<>();

            StringBuilder renderModule = new StringBuilder();
            renderModule.append(PythonTemplateGenerator.prelude());

            for (String fileName : templateFiles) {

                PythonTemplateGenerator templateGenerator =
                        new PythonTemplateGenerator(routes, warnings);

                renderModule.append("\n\n")
                        .append(templateGenerator.generate(
                                fileName,
                                renderFunctions.get(fileName),
                                contextNames(templateInvocations, fileName),
                                templatePrograms.get(fileName)
                        ));
            }

            Files.writeString(
                    outputDir.resolve(PythonCodeGeneration.RENDER_MODULE + ".py"),
                    renderModule.toString()
            );

            for (String warning : warnings) {
                System.out.println("Warning: " + warning);
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
            PythonCodeGeneration generator =
                    new PythonCodeGeneration(renderFunctions);

            generator.generate(ast);
            generator.writeToFile("test.py");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    /**
     * "list.html" -> "render_list"
     */
    private static String renderFunctionName(String templateName) {

        String base = templateName;

        int dot = base.lastIndexOf('.');

        if (dot > 0) {
            base = base.substring(0, dot);
        }

        return "render_" + base.replaceAll("[^A-Za-z0-9_]", "_");
    }

    /**
     * The context names a template is rendered with, taken from the render_template
     * calls found in the Flask program. They become the parameters of the generated
     * render function.
     */
    private static List<String> contextNames(
            List<TemplateInvocation> invocations,
            String templateName) {

        Set<String> names = new TreeSet<>();

        for (TemplateInvocation invocation : invocations) {

            if (templateName.equals(invocation.getTemplateName())) {
                names.addAll(invocation.getContext().names());
            }
        }

        return new ArrayList<>(names);
    }
}