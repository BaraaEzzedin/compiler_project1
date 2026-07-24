import AST.Program;
import CodeGeneration.JinjaCodeGenerator;
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
import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.tree.ParseTree;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import static org.antlr.v4.runtime.CharStreams.fromFileName;

public class TestMain {
    public static void main(String[] args) {
        try {
//            Map<String, JinjaTemplateInfo> templates =
//                    new HashMap<>();
//            String path = "samples/products.html";
//            CharStream input = fromFileName(path);
//            ProjectLexer lexer = new ProjectLexer(input);
//            CommonTokenStream token = new CommonTokenStream(lexer);
//            ProjectParser parser = new ProjectParser(token);
//            ParseTree tree = parser.program();
//            ProjectVisitor visitor = new ProjectVisitor();
//            AST.JinjaCss.Program program = (AST.JinjaCss.Program) visitor.visit(tree);
//            System.out.println(program.prettyPrint(0));
//            System.out.println("\n=== Buildinbg Symbol Table ===");
//            SymbolTableBuilder symbolTableBuilder = new SymbolTableBuilder("products.html");
//            symbolTableBuilder.build(program);
//
//            templates.put(
//                    "products.html",
//                    symbolTableBuilder.getTemplateInfo());
            Map<String, JinjaTemplateInfo> templates = new HashMap<>();
            Map<String, AST.JinjaCss.Program> templatePrograms = new HashMap<>();

            String[] templateFiles = {
                    "first.html",
                    "second.html"
            };

            for (String fileName : templateFiles) {

                String path = "samples/" + fileName;

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

            System.out.println(ast);

            // Build symbol table
            SymbolTable.PyFlask.SymbolTableBuilder pythonSymbolTableBuilder = new SymbolTable.PyFlask.SymbolTableBuilder();
            ast.accept(pythonSymbolTableBuilder);

            // Print symbol table
//            System.out.println("symbol table");
            SemanticAnalyzer analyzer = new SemanticAnalyzer(pythonSymbolTableBuilder.getSymbolTable());
            ast.accept(analyzer);

//            analyzer.validateTemplateVariables(templates);

            analyzer.printErrors();

//            analyzer.printTemplateContexts();
//            GenerationContext context = new GenerationContext();
//            ExpressionEvaluator evaluator = new ExpressionEvaluator(context);
//            RuntimeExtractor extractor = new RuntimeExtractor(context);
//            ast.accept(extractor);
//            System.out.println(context);
//
//            JinjaCodeGenerator generator = new JinjaCodeGenerator(context);
//            String generatedHtml = generator.generate(program);
//            Files.writeString(Path.of("./templates", "productss.html"), generatedHtml);
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
                                invocation.getContext());

                String html =
                        generator.generate(program);

                Files.writeString(
                        Path.of(
                                "templates",
                                invocation.getTemplateName()),
                        html
                );
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
