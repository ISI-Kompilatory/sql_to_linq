package org.example.kompilatory;

import java.util.List;
import java.util.stream.Collectors;

// NIE KORZYSTAMY Z TEGO, DO USUNIĘCIA!! Korzystamy z Visitora zamiast Listenera
@Deprecated()
public class MyListener extends SQLParserBaseListener {

    @Override
    public void exitSql_stmt_list(SQLParser.Sql_stmt_listContext ctx) {
        List<SQLParser.Select_stmtContext> selectList = ctx.select_stmt();
        selectList.forEach(selectStmt -> {
            selectStmt.select_core().forEach(this::processSelectCore);
        });
// NIE KORZYSTAMY Z TEGO, DO USUNIĘCIA!! Korzystamy z Visitora zamiast Listenera
    }

    private void processSelectCore(SQLParser.Select_coreContext selectCore) {
        String resultColumnsString = getResultColumnsString(selectCore);
        System.out.println(resultColumnsString);

        String fromString = getFromString(selectCore);

        String whereString = getWhereString(selectCore);

        System.out.println("Całe zapytanie LINQ:");
        String full = "FROM " + fromString + " \n"
                + "WHERE " + whereString + " \n"
                + "SELECT " + resultColumnsString
                + ";";
        System.out.println(full);
        // NIE KORZYSTAMY Z TEGO, DO USUNIĘCIA!! Korzystamy z Visitora zamiast Listenera
    }

    String getResultColumnsString(SQLParser.Select_coreContext selectCore) {
        List<String> colNames = selectCore.result_column().stream().map(res -> {
            SQLParser.ExprContext expr = res.expr();
            //return expr.column_name().any_name().getText();
            return expr.getText();
        }).collect(Collectors.toList());
// NIE KORZYSTAMY Z TEGO, DO USUNIĘCIA!! Korzystamy z Visitora zamiast Listenera
        return colNames.stream().reduce((acc, next) -> acc + "," + next).get();
    }

    String getFromString(SQLParser.Select_coreContext selectCore) {
        return "xxx";// NIE KORZYSTAMY Z TEGO, DO USUNIĘCIA!! Korzystamy z Visitora zamiast Listenera
    }

    private String getWhereString(SQLParser.Select_coreContext selectCore) {
        SQLParser.ExprContext whereExpr = selectCore.whereExpr;
        //System.out.println(whereExpr.getText());
        StringBuilder builder = new StringBuilder();

        for(int i = 0; i < whereExpr.getChildCount(); ++i) {
            builder.append(whereExpr.getChild(i).getText() + " ");
        }

        return builder.toString();// NIE KORZYSTAMY Z TEGO, DO USUNIĘCIA!! Korzystamy z Visitora zamiast Listenera
    }
}
