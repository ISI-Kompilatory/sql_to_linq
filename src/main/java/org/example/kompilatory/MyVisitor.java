package org.example.kompilatory;

import org.antlr.v4.runtime.tree.TerminalNode;

import java.util.List;
import java.util.stream.Collectors;

public class MyVisitor extends SQLParserBaseVisitor<String> {

    @Override
    public String visitSelect_core(SQLParser.Select_coreContext ctx) {

        return "FROM " + "xxx" + " \n"
                + "WHERE " + visit(ctx.whereExpr) + " \n"
                + "SELECT " + getResultColumnsString(ctx)
                + ";";

    }

    String getResultColumnsString(SQLParser.Select_coreContext selectCore) {
        List<String> colNames = selectCore.result_column().stream().map(this::visit).collect(Collectors.toList());
        return colNames.stream().reduce((acc, next) -> acc + "," + next).get();
    }



    // Trzeba dać aby łączyło w stringi nowe rezultaty
    @Override
    protected String aggregateResult(String aggregate, String nextResult) {
        if (aggregate == null) {
            return nextResult;
        }
        if (nextResult == null) {
            return aggregate;
        }
        return aggregate + nextResult;
    }

    //Coś żeby poprawnie zwracało terminały
    @Override
    public String visitTerminal(TerminalNode node) {
        if(node.getText().equals("<EOF>")) //Żeby nie wypisywało <EOF> na końcu
            return "";

        return node.getText(); // zwraca tekst tokenu
    }
}
