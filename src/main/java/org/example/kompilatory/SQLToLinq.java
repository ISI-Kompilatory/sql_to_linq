package org.example.kompilatory;

import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;

public class SQLToLinq {
    public static void main(String[] args) {
        String inputString = "SELECT column1, column2, table1.col3 FROM table1 WHERE column1 > 10 AND column1 < 20 GROUP BY column1, table1.column2;";

        System.out.println("Dla zapytania w SQL:");
        System.out.println(inputString);
        System.out.println("\n\n");
        String linq = sqlToLinq(inputString);
        System.out.println("Zapytanie LINQ:");
        System.out.println(linq);
    }

    public static String sqlToLinq(String sql) {
        CharStream input = CharStreams.fromString(sql);
        SQLLexer lexer = new SQLLexer(input);

        CommonTokenStream tokens = new CommonTokenStream(lexer);

        SQLParser parser = new SQLParser(tokens);

        SQLParser.ParseContext tree = parser.parse();

        MyVisitor visitor = new MyVisitor();
        return visitor.visitParse(tree).toLowerCase();
    }
}
