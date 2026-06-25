import AST.JinjaCss.Program;
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

import java.io.File;
import java.util.HashMap;
import java.util.Map;

public class Main {
//    public static void main(String[] args) throws Exception {
//        SymbolTableBuilder jinjaBuilder = null;
//        try {
//            File dir =
//                    new File("samples");
//
//            for (File file :
//                    dir.listFiles()) {
//
//                if (!file.getName()
//                        .endsWith(".html")) {
//                    continue;
//                }
//                CharStream input = fromFileName(file.getPath());
//                ProjectLexer lexer = new ProjectLexer(input);
//                CommonTokenStream token = new CommonTokenStream(lexer);
//                ProjectParser parser = new ProjectParser(token);
//                ParseTree tree = parser.program();
//                ProjectVisitor visitor = new ProjectVisitor();
//                Program program = (Program) visitor.visit(tree);
//                System.out.println(program.prettyPrint(0));
//                System.out.println("\n=== Buildinbg Symbol Table ===");
//                jinjaBuilder = new SymbolTableBuilder("products.html");
//                jinjaBuilder.build(program);
//            }
////            symbolTableBuilder.printStatistics();
//        } catch (IOException e) {
//            e.printStackTrace();
//        }
//        try {
//            String path = "samples/test.txt";
//            CharStream input = fromFileName(path);
//            PythonLexer lexer = new PythonLexer(input);
//            CommonTokenStream token = new CommonTokenStream(lexer);
//
//            PythonParser parser = new PythonParser(token);
//            ParseTree tree = parser.prog();
//            PythonVisitor programVisitor = new PythonVisitor();
//            AST.Program ast = (AST.Program) programVisitor.visit(tree);
//
//            System.out.println(ast);
//
//            // Build symbol table
//            SymbolTable.PyFlask.SymbolTableBuilder symbolTableBuilder = new SymbolTable.PyFlask.SymbolTableBuilder();
//            ast.accept(symbolTableBuilder);
//
//            // Print symbol table
////            System.out.println("symbol table");
//            System.out.println("\n" + symbolTableBuilder.getSymbolTable());
//            SemanticAnalyzer analyzer = new SemanticAnalyzer(symbolTableBuilder.getSymbolTable());
//
//            ast.accept(analyzer);
//
//            assert jinjaBuilder != null;
//            analyzer.validateTemplateVariables(jinjaBuilder.getTemplateInfo());
//
//            analyzer.printErrors();
//
////            analyzer.printTemplateContexts();
//

    /// /
//        } catch (IOException e) {
//            e.printStackTrace();
//        }
//    }
    public static void main(String[] args) {

        try {

            /*
             * ==========================================
             * Parse Jinja Templates
             * ==========================================
             */
            Map<String, JinjaTemplateInfo> templates =
                    new HashMap<>();

            File templateDir =
                    new File("templates");

            File[] templateFiles =
                    templateDir.listFiles();

            if (templateFiles != null) {

                for (File file : templateFiles) {

                    if (!file.getName()
                            .endsWith(".html")) {
                        continue;
                    }

                    System.out.println(
                            "\n==============================");
                    System.out.println(
                            "Template: " +
                                    file.getName());
                    System.out.println(
                            "==============================");

                    CharStream input =
                            CharStreams.fromFileName(
                                    file.getPath());

                    ProjectLexer lexer =
                            new ProjectLexer(input);

                    CommonTokenStream tokens =
                            new CommonTokenStream(
                                    lexer);

                    ProjectParser parser =
                            new ProjectParser(tokens);

                    ParseTree tree =
                            parser.program();

                    ProjectVisitor visitor =
                            new ProjectVisitor();

                    Program ast =
                            (Program) visitor.visit(tree);

                    System.out.println(
                            ast.prettyPrint(0));

                    SymbolTableBuilder builder =
                            new SymbolTableBuilder(
                                    file.getName());

                    builder.build(ast);

                    templates.put(
                            file.getName(),
                            builder.getTemplateInfo());
                }
            }

            /*
             * ==========================================
             * Parse Flask / Python
             * ==========================================
             */
            String pythonPath =
                    "samples/python_test.txt";

            CharStream pythonInput =
                    CharStreams.fromFileName(
                            pythonPath);

            PythonLexer pythonLexer =
                    new PythonLexer(
                            pythonInput);

            CommonTokenStream pythonTokens =
                    new CommonTokenStream(
                            pythonLexer);

            PythonParser pythonParser =
                    new PythonParser(
                            pythonTokens);

            ParseTree pythonTree =
                    pythonParser.prog();

            PythonVisitor pythonVisitor =
                    new PythonVisitor();

            AST.Program pythonAst =
                    (AST.Program)
                            pythonVisitor.visit(
                                    pythonTree);

            System.out.println(
                    "\n=== Python AST ===");

            System.out.println(
                    pythonAst);

            /*
             * ==========================================
             * Build Python Symbol Table
             * ==========================================
             */
            SymbolTable.PyFlask.SymbolTableBuilder
                    symbolTableBuilder =
                    new SymbolTable.PyFlask
                            .SymbolTableBuilder();

            pythonAst.accept(
                    symbolTableBuilder);

            System.out.println(
                    "\n=== Python Symbol Table ===");

            System.out.println(
                    symbolTableBuilder
                            .getSymbolTable());

            /*
             * ==========================================
             * Semantic Analysis
             * ==========================================
             */
            SemanticAnalyzer analyzer =
                    new SemanticAnalyzer(
                            symbolTableBuilder
                                    .getSymbolTable());

            pythonAst.accept(analyzer);

            analyzer.validateTemplateVariables(templates);

            /*
             * ==========================================
             * Print Errors
             * ==========================================
             */
            analyzer.printErrors();

        } catch (Exception e) {

            e.printStackTrace();
        }
    }
}
