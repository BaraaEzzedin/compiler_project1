import AST.Program;
import JinjaCssGrammar.ProjectLexer;
import JinjaCssGrammar.ProjectParser;
import PyFlaskGrammar.PythonLexer;
import PyFlaskGrammar.PythonParser;
import SymbolTable.JijnaCss.SymbolTableBuilder;
import Visitor.ProjectVisitor;

import Visitor.PythonVisitor;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.tree.ParseTree;
import java.io.IOException;

import static org.antlr.v4.runtime.CharStreams.fromFileName;

public class Main {
    public static void main(String[] args) throws Exception {
        try{
            String path = "samples/html_test.txt";
            CharStream input =fromFileName(path);
            ProjectLexer lexer = new ProjectLexer(input);
            CommonTokenStream token = new CommonTokenStream(lexer);
            ProjectParser parser = new ProjectParser(token);
            ParseTree tree= parser.program();
            ProjectVisitor visitor = new ProjectVisitor();
            Program program = (Program) visitor.visit(tree);
            System.out.println(program.prettyPrint(0));
            System.out.println("\n=== Buildinbg Symbol Table ===");
            SymbolTableBuilder symbolTableBuilder = new SymbolTableBuilder();
            symbolTableBuilder.build(program);
            symbolTableBuilder.printStatistics();
        } catch (IOException e) {
            e.printStackTrace();
        }
        try {
            String path = "samples/python_test.txt";
            CharStream input = fromFileName(path);
            PythonLexer lexer = new PythonLexer(input);
            CommonTokenStream token = new CommonTokenStream(lexer);

            PythonParser parser = new PythonParser(token);
            ParseTree tree = parser.prog();
            PythonVisitor programVisitor = new PythonVisitor();
            Program ast = (Program) programVisitor.visit(tree);

            System.out.println(ast);

            // Build symbol table
            SymbolTable.PyFlask.SymbolTableBuilder symbolTableBuilder = new SymbolTable.PyFlask.SymbolTableBuilder();
            symbolTableBuilder.visit(ast);

            // Print symbol table
            System.out.println("symbol table");
            System.out.println("\n" + symbolTableBuilder.getSymbolTable().toString());

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
