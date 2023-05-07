package org.example.kompilatory;// Generated from SQLParser.g4 by ANTLR 4.12.0
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link SQLParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface SQLParserVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link SQLParser#parse}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParse(SQLParser.ParseContext ctx);
	/**
	 * Visit a parse tree produced by {@link SQLParser#sql_stmt_list}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSql_stmt_list(SQLParser.Sql_stmt_listContext ctx);
	/**
	 * Visit a parse tree produced by {@link SQLParser#type_name}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitType_name(SQLParser.Type_nameContext ctx);
	/**
	 * Visit a parse tree produced by {@link SQLParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpr(SQLParser.ExprContext ctx);
	/**
	 * Visit a parse tree produced by {@link SQLParser#select_stmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSelect_stmt(SQLParser.Select_stmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link SQLParser#join_clause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitJoin_clause(SQLParser.Join_clauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link SQLParser#select_core}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSelect_core(SQLParser.Select_coreContext ctx);
	/**
	 * Visit a parse tree produced by {@link SQLParser#simple_select_stmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSimple_select_stmt(SQLParser.Simple_select_stmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link SQLParser#compound_select_stmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCompound_select_stmt(SQLParser.Compound_select_stmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link SQLParser#table_or_subquery}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTable_or_subquery(SQLParser.Table_or_subqueryContext ctx);
	/**
	 * Visit a parse tree produced by {@link SQLParser#result_column}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitResult_column(SQLParser.Result_columnContext ctx);
	/**
	 * Visit a parse tree produced by {@link SQLParser#join_operator}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitJoin_operator(SQLParser.Join_operatorContext ctx);
	/**
	 * Visit a parse tree produced by {@link SQLParser#join_constraint}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitJoin_constraint(SQLParser.Join_constraintContext ctx);
	/**
	 * Visit a parse tree produced by {@link SQLParser#compound_operator}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCompound_operator(SQLParser.Compound_operatorContext ctx);
	/**
	 * Visit a parse tree produced by {@link SQLParser#column_name_list}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitColumn_name_list(SQLParser.Column_name_listContext ctx);
	/**
	 * Visit a parse tree produced by {@link SQLParser#filter_clause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFilter_clause(SQLParser.Filter_clauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link SQLParser#aggregate_function_invocation}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAggregate_function_invocation(SQLParser.Aggregate_function_invocationContext ctx);
	/**
	 * Visit a parse tree produced by {@link SQLParser#order_by_stmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOrder_by_stmt(SQLParser.Order_by_stmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link SQLParser#limit_stmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLimit_stmt(SQLParser.Limit_stmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link SQLParser#ordering_term}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOrdering_term(SQLParser.Ordering_termContext ctx);
	/**
	 * Visit a parse tree produced by {@link SQLParser#asc_desc}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAsc_desc(SQLParser.Asc_descContext ctx);
	/**
	 * Visit a parse tree produced by {@link SQLParser#offset}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOffset(SQLParser.OffsetContext ctx);
	/**
	 * Visit a parse tree produced by {@link SQLParser#unary_operator}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitUnary_operator(SQLParser.Unary_operatorContext ctx);
	/**
	 * Visit a parse tree produced by {@link SQLParser#column_alias}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitColumn_alias(SQLParser.Column_aliasContext ctx);
	/**
	 * Visit a parse tree produced by {@link SQLParser#name}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitName(SQLParser.NameContext ctx);
	/**
	 * Visit a parse tree produced by {@link SQLParser#function_name}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunction_name(SQLParser.Function_nameContext ctx);
	/**
	 * Visit a parse tree produced by {@link SQLParser#schema_name}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSchema_name(SQLParser.Schema_nameContext ctx);
	/**
	 * Visit a parse tree produced by {@link SQLParser#table_name}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTable_name(SQLParser.Table_nameContext ctx);
	/**
	 * Visit a parse tree produced by {@link SQLParser#column_name}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitColumn_name(SQLParser.Column_nameContext ctx);
	/**
	 * Visit a parse tree produced by {@link SQLParser#table_alias}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTable_alias(SQLParser.Table_aliasContext ctx);
	/**
	 * Visit a parse tree produced by {@link SQLParser#alias}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAlias(SQLParser.AliasContext ctx);
	/**
	 * Visit a parse tree produced by {@link SQLParser#aggregate_func}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAggregate_func(SQLParser.Aggregate_funcContext ctx);
	/**
	 * Visit a parse tree produced by {@link SQLParser#table_function_name}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTable_function_name(SQLParser.Table_function_nameContext ctx);
	/**
	 * Visit a parse tree produced by {@link SQLParser#literal_value}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLiteral_value(SQLParser.Literal_valueContext ctx);
	/**
	 * Visit a parse tree produced by {@link SQLParser#signed_number}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSigned_number(SQLParser.Signed_numberContext ctx);
	/**
	 * Visit a parse tree produced by {@link SQLParser#any_name}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAny_name(SQLParser.Any_nameContext ctx);
	/**
	 * Visit a parse tree produced by {@link SQLParser#keyword}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitKeyword(SQLParser.KeywordContext ctx);
}