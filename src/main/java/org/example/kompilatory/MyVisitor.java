package org.example.kompilatory;

import org.antlr.v4.runtime.ParserRuleContext;
import org.antlr.v4.runtime.tree.TerminalNode;

import java.util.List;
import java.util.stream.Collectors;

public class MyVisitor extends SQLParserBaseVisitor<String> {

    @Override
    public String visitSelect_core(SQLParser.Select_coreContext ctx) {
        String tableAlias = "row"; //TODO
        String wherePart = "";
        if(ctx.whereExpr != null && ctx.WHERE_() != null) {
            wherePart = "WHERE " + visitWhereExpr(ctx.whereExpr) + " \n";
        }

        String groupByPart = "";
        if(ctx.GROUP_BY() != null && ctx.groupByExpr != null && !ctx.groupByExpr.isEmpty()) {
            groupByPart = "GROUP " + tableAlias + " by new {";
            groupByPart += visitExprListAndConcatByComma(ctx.groupByExpr);
            groupByPart += "} into g \n";
        }

        String fromOrJoinPart = "";
        if(ctx.table_or_subquery() != null && !ctx.table_or_subquery().isEmpty()) {
            fromOrJoinPart = visitExprListAndConcatByComma(ctx.table_or_subquery());
        }
        else if(ctx.join_clause() != null) {
            fromOrJoinPart = visit(ctx.join_clause());
        }
        else
            throw new RuntimeException("Brakuje czegoś we FROM");

        return "FROM " + tableAlias + " in " + fromOrJoinPart + " \n"
                + wherePart
                + groupByPart
                + "SELECT " + getResultColumnsString(ctx)
                + ";";

    }

    @Override
    public String visitJoin_clause(SQLParser.Join_clauseContext ctx) {
        // TODO: Tutaj zmieniaj Krzysztof
        return super.visitJoin_clause(ctx);
    }

    String visitWhereExpr(SQLParser.ExprContext ctx) {
        StringBuilder builder = new StringBuilder();

        for(int i = 0; i < ctx.getChildCount(); ++i) {
            builder.append(visit(ctx.getChild(i))).append(" ");
        }

        return builder.toString();
    }

    String getResultColumnsString(SQLParser.Select_coreContext selectCore) {
        return visitExprListAndConcatByComma(selectCore.result_column());
    }

    private <T extends ParserRuleContext> String visitExprListAndConcatByComma(List<T> ctxList) {
        List<String> colNames = ctxList.stream().map(this::visit).collect(Collectors.toList());
        return colNames.stream().reduce((acc, next) -> acc + ", " + next).get();
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
        if(node.getText().equals("AND"))
            return "&&";

        return node.getText(); // zwraca tekst tokenu
    }
}
