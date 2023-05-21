package org.example.kompilatory;

import org.antlr.v4.runtime.ParserRuleContext;
import org.antlr.v4.runtime.tree.TerminalNode;

import java.util.List;
import java.util.stream.Collectors;

public class MyVisitor extends SQLParserBaseVisitor<String> {

    @Override
    public String visitSelect_core(SQLParser.Select_coreContext ctx) {
        String tableAlias = "t"; //TODO
        String wherePart = "";
        if(ctx.whereExpr != null && ctx.WHERE_() != null) {
            wherePart = "WHERE " + visitWhereExpr(ctx.whereExpr) + " \n";
        }

        String groupByPart = "";
        if(ctx.GROUP_BY() != null && ctx.groupByExpr != null && !ctx.groupByExpr.isEmpty()) {
            groupByPart = "GROUP " + tableAlias + " by new {";
            groupByPart += visitExprListAndConcatBySeparator(ctx.groupByExpr, ", ");
            groupByPart += "} into g \n";
        }

        String fromOrJoinPart = "";
        if(ctx.table_or_subquery() != null && !ctx.table_or_subquery().isEmpty()) {
            fromOrJoinPart = visitExprListAndConcatBySeparator(ctx.table_or_subquery(), ", ");
        }
        else if(ctx.join_clause() != null) {
            fromOrJoinPart = visit(ctx.join_clause());
        }
        else
            throw new RuntimeException("Brakuje czegoś we FROM");

        return "FROM " + tableAlias + " in " + fromOrJoinPart + " \n"
                + wherePart
                + groupByPart
                + "SELECT new { \n" + getResultColumnsString(ctx) + " }\n"
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
        return visitExprListAndConcatBySeparator(selectCore.result_column(), ", \n");
    }

    private <T extends ParserRuleContext> String visitExprListAndConcatBySeparator(List<T> ctxList, String separator) {
        List<String> colNames = ctxList.stream().map(this::visit).collect(Collectors.toList());
        return colNames.stream().reduce((acc, next) -> acc + separator + next).get();
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

    @Override
    public String visitTable_or_subquery(SQLParser.Table_or_subqueryContext ctx) {
        if (ctx.table_name() != null) {
            // Obsługa przypadku tabeli
            String tableName = ctx.table_name().getText();
            String tableAlias = ctx.table_alias() != null ? ctx.table_alias().getText() : null;
            //String schemaName = ctx.schema_name() != null ? ctx.schema_name().getText() + "." : "";
            //String asKeyword = ctx.AS_() != null ? " as " : " ";

            return tableName + (tableAlias != null ? tableAlias : "");
        } else if (ctx.table_function_name() != null) {
            // Obsługa przypadku funkcji tabeli
            String functionName = ctx.table_function_name().getText();
            String tableAlias = ctx.table_alias() != null ? ctx.table_alias().getText() : null;
            String asKeyword = ctx.AS_() != null ? " as " : " ";
            String parameters = ctx.expr().stream()
                    .map(this::visitExpr)
                    .collect(Collectors.joining(", "));

            return functionName + "(" + parameters + ")" + (tableAlias != null ? asKeyword + tableAlias : "");
        } else if (ctx.select_stmt() != null) {
            // Obsługa przypadku zagnieżdżonego zapytania SELECT
            String subquery = visitSelect_stmt(ctx.select_stmt());
            String tableAlias = ctx.table_alias() != null ? ctx.table_alias().getText() : null;
            String asKeyword = ctx.AS_() != null ? " as " : " ";

            return "(" + subquery + ")" + (tableAlias != null ? asKeyword + tableAlias : "");
        } else {
            // Obsługa przypadku klauzuli JOIN
            String joinClause = visitJoin_clause(ctx.join_clause());

            return "(" + joinClause + ")";
        }
    }
}
