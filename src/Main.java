import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.tree.*;

import grammer.lexer.ProjectLexer;
import grammer.lexer.ProjectParser;
import Visitor.ProjectVisitor;
import AST.ASTNode;

public class Main {
    public static void main(String[] args) throws Exception {

        String input = """
        <style>
          div {
            width: calc(100% - 20px);
          }
        </style>
        """;

        // 1. Create lexer
        CharStream charStream = CharStreams.fromString(input);
        ProjectLexer lexer = new ProjectLexer(charStream);

        // 2. Create token stream
        CommonTokenStream tokens = new CommonTokenStream(lexer);

        // 3. Create parser
        ProjectParser parser = new ProjectParser(tokens);

        // 4. Parse starting rule
        ParseTree tree = parser.program();

        // 5. Visit parse tree (THIS runs visitCssCalc)
        ProjectVisitor visitor = new ProjectVisitor();
        ASTNode ast = visitor.visit(tree);

        // 6. Print AST
        System.out.println(ast.prettyPrint(0));
    }
}
