package org.example.kompilatory;

public class MyListener extends SQLParserBaseListener {
    @Override
    public void enterSql_stmt_list(SQLParser.Sql_stmt_listContext ctx) {
        System.out.println("Enter select statement: " + ctx.getText());
    }

    @Override
    public void exitSql_stmt_list(SQLParser.Sql_stmt_listContext ctx) {
        System.out.println("Exit select statement: " + ctx.getText());
    }

    @Override
    public void enterTable_name(SQLParser.Table_nameContext ctx) {
        System.out.println("Enter table name: " + ctx.getText());
    }

    @Override
    public void exitTable_name(SQLParser.Table_nameContext ctx) {
        System.out.println("Exit table name: " + ctx.getText());
    }

    // i tak dalej - dodaj metody enter i exit dla pozostałych produkcji gramatyki SQL
}
