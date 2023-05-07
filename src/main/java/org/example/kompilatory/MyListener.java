package org.example.kompilatory;

import java.util.List;
import java.util.stream.Collectors;

public class MyListener extends SQLParserBaseListener {

    @Override
    public void exitSql_stmt_list(SQLParser.Sql_stmt_listContext ctx) {
        List<SQLParser.Select_stmtContext> selectList = ctx.select_stmt();
        selectList.forEach(selectStmt -> {
            selectStmt.select_core().forEach(this::processSelectCore);
        });
        //System.out.println("Exit select statement: " + ctx.getText());
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
    }

    String getResultColumnsString(SQLParser.Select_coreContext selectCore) {
        List<String> colNames = selectCore.result_column().stream().map(res -> {
            SQLParser.ExprContext expr = res.expr();
            //return expr.column_name().any_name().getText();
            return expr.getText();
        }).collect(Collectors.toList());

        return colNames.stream().reduce((acc, next) -> acc + "," + next).get();
    }

    String getFromString(SQLParser.Select_coreContext selectCore) {
        return "xxx"; //TODO
    }

    private String getWhereString(SQLParser.Select_coreContext selectCore) {
        return "xxx"; //TODO
    }
}
