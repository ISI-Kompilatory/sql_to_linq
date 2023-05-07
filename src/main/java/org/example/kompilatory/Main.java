package org.example.kompilatory;

import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.tree.ParseTree;
import org.antlr.v4.runtime.tree.ParseTreeWalker;

import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {
        String inputString = "SELECT column1, column2 FROM table1";
        CharStream input = CharStreams.fromString(inputString);
        // stwórz obiekt SQLLexer
        SQLLexer lexer = new SQLLexer(input);

        // stwórz obiekt CommonTokenStream
        CommonTokenStream tokens = new CommonTokenStream(lexer);

        // stwórz obiekt SQLParser
        SQLParser parser = new SQLParser(tokens);

        // wywołaj metodę compilationUnit parsera
        ParseTree tree = parser.parse();

        // stwórz obiekt ParseTreeWalker i obiekt MyListener
        ParseTreeWalker walker = new ParseTreeWalker();
        MyListener listener = new MyListener();

        // przetwórz drzewo składniowe z użyciem ParseTreeWalker i MyListener
        walker.walk(listener, tree);
    }
}
