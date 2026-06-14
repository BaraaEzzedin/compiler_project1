import AST.Program;
import PyFlaskGrammar.PyFlaskGrammar.PythonLexer;
import PyFlaskGrammar.PyFlaskGrammar.PythonParser;
import SymbolTable.PyFlask.CompilerError;
import SymbolTable.PyFlask.SemanticAnalyzer;
import Visitor.PythonVisitor;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.tree.ParseTree;

import java.io.IOException;

import static org.antlr.v4.runtime.CharStreams.fromFileName;

public class Main {
    public static void main(String[] args) throws Exception {
//        try {
//            String path = "samples/html_test.txt";
//            CharStream input = fromFileName(path);
//            ProjectLexer lexer = new ProjectLexer(input);
//            CommonTokenStream token = new CommonTokenStream(lexer);
//            ProjectParser parser = new ProjectParser(token);
//            ParseTree tree = parser.program();
//            ProjectVisitor visitor = new ProjectVisitor();
//            AST.JinjaCss.Program program = (Program) visitor.visit(tree);
//            System.out.println(program.prettyPrint(0));
//            System.out.println("\n=== Buildinbg Symbol Table ===");
//            SymbolTableBuilder symbolTableBuilder = new SymbolTableBuilder();
//            symbolTableBuilder.build(program);
//            symbolTableBuilder.printStatistics();
//        } catch (IOException e) {
//            e.printStackTrace();
//        }
        try {
            String path = "samples/test.txt";
            CharStream input = fromFileName(path);
            PythonLexer lexer = new PythonLexer(input);
            CommonTokenStream token = new CommonTokenStream(lexer);

            PythonParser parser = new PythonParser(token);
            ParseTree tree = parser.prog();
            PythonVisitor programVisitor = new PythonVisitor();
            AST.Program ast = (Program) programVisitor.visit(tree);

            System.out.println(ast);

            // Build symbol table
            SymbolTable.PyFlask.SymbolTableBuilder symbolTableBuilder = new SymbolTable.PyFlask.SymbolTableBuilder();
            ast.accept(symbolTableBuilder);

            // Print symbol table
//            System.out.println("symbol table");
            System.out.println("\n" + symbolTableBuilder.getSymbolTable());
            SemanticAnalyzer analyzer = new SemanticAnalyzer(symbolTableBuilder.getSymbolTable());
            ast.accept(analyzer);
            System.out.println("\nSemantic Errors:");

            if (analyzer.getErrors().isEmpty()) {

                System.out.println("No semantic errors.");
            } else {

                for (CompilerError error : analyzer.getErrors()) {

                    System.err.println(error);
                }
            }
            analyzer.printTemplateContexts();

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
