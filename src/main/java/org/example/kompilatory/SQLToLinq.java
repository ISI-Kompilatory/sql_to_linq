package org.example.kompilatory;

import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Scanner;

public class SQLToLinq {
    public static void main(String[] args) {
        System.out.println("Podaj ścieżkę do pliku z zapytaniem:");
        String inputFile = new Scanner(System.in).nextLine(); // zapytania/z1.sql
        File file = new File(inputFile);
        System.out.println("Poszukiwanie dla pliku: " + file.getAbsolutePath());
        if(file.exists()) {
            try {
                String content = new String(Files.readAllBytes(Paths.get(inputFile)));
                System.out.println("Dla zapytania w SQL:");
                System.out.println(content);
                System.out.println("\n");
                try {
                    String linq = sqlToLinq(content);
                    System.out.println("Zapytanie LINQ:");
                    System.out.println(linq);
                } catch (Exception e) {
                    e.printStackTrace();
                    System.out.println("Wystąpił błąd dla podanego zapytania");
                }
            } catch (IOException e) {
                e.printStackTrace();
                System.out.println("Wystąpił problem z otwarciem pliku");
            }
        }
        else {
            System.out.println("Plik nie istnieje");
        }
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
