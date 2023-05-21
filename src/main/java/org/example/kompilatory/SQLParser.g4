parser grammar SQLParser;

options {
    tokenVocab = SQLLexer;
}

parse: (sql_stmt_list)* EOF;

sql_stmt_list: SCOL* select_stmt (SCOL+ select_stmt)* SCOL*;

type_name:
    name+? (
        OPEN_PAR signed_number CLOSE_PAR
        | OPEN_PAR signed_number COMMA signed_number CLOSE_PAR
    )?
;

expr:
    literal_value
    | ((schema_name DOT)? table_name DOT)? column_name
    | unary_operator expr
    | expr ( STAR | DIV | MOD) expr
    | expr ( PLUS | MINUS) expr
    | expr ( AMP | PIPE) expr
    | expr ( LT | LT_EQ | GT | GT_EQ) expr
    | expr (
        EQ
        | NOT_EQ1
        | NOT_EQ2
        | IS_
        | IS_ NOT_
        | IN_
        | LIKE_
    ) expr
    | expr AND_ expr
    | expr OR_ expr
    | function_name OPEN_PAR ((DISTINCT_? expr ( COMMA expr)*) | STAR)? CLOSE_PAR filter_clause? 
    | OPEN_PAR expr (COMMA expr)* CLOSE_PAR
    | CAST_ OPEN_PAR expr AS_ type_name CLOSE_PAR
    | expr NOT_? (LIKE_) expr (ESCAPE_ expr )?
    | expr ( ISNULL_ | NOT_NULL | NOT_ NULL_)
    | expr IS_ NOT_? expr
    | expr NOT_? BETWEEN_ expr AND_ expr
    | expr NOT_? IN_ (
        OPEN_PAR (select_stmt | expr ( COMMA expr)*)? CLOSE_PAR
        | ( schema_name DOT)? table_name
        | (schema_name DOT)? table_function_name OPEN_PAR (expr (COMMA expr)*)? CLOSE_PAR
    )
    | ((NOT_)? EXISTS_)? OPEN_PAR select_stmt CLOSE_PAR
;

select_stmt: select_core (compound_operator select_core)* order_by_stmt? limit_stmt?;

join_clause: table_or_subquery (join_operator table_or_subquery join_constraint?)*;

select_core:
    (
        SELECT_ (DISTINCT_ | ALL_ | ANY_)? result_column (COMMA result_column)* (
            FROM_ (table_or_subquery (COMMA table_or_subquery)* | join_clause)
        )? (WHERE_ whereExpr=expr)? (
          GROUP_BY groupByExpr+=expr (COMMA groupByExpr+=expr)* (
              HAVING_ havingExpr=expr
          )?)? 
    )
;

simple_select_stmt: select_core order_by_stmt? limit_stmt?;

compound_select_stmt:
    select_core (
        (UNION_ ALL_? | INTERSECT_ | EXCEPT_) select_core
    )+ order_by_stmt? limit_stmt?
;

table_or_subquery: (
        (schema_name DOT)? table_name (AS_? table_alias)? 
    )
    | (schema_name DOT)? table_function_name OPEN_PAR expr (COMMA expr)* CLOSE_PAR (
        AS_? table_alias
    )?
    | OPEN_PAR (table_or_subquery (COMMA table_or_subquery)* | join_clause) CLOSE_PAR
    | OPEN_PAR select_stmt CLOSE_PAR (AS_? table_alias)?
;

result_column:
    STAR
    | table_name DOT STAR
    | expr ( AS_? column_alias)?
;

join_operator:
    COMMA
    | NATURAL_? (LEFT_ OUTER_? | INNER_ | CROSS_)? JOIN_
;

join_constraint:
    ON_ expr
    | USING_ OPEN_PAR column_name ( COMMA column_name)* CLOSE_PAR
;

compound_operator:
    UNION_ ALL_?
    | INTERSECT_
    | EXCEPT_
;

column_name_list: OPEN_PAR column_name (COMMA column_name)* CLOSE_PAR;

filter_clause: FILTER_ OPEN_PAR WHERE_ expr CLOSE_PAR;

aggregate_function_invocation:
    aggregate_func OPEN_PAR (DISTINCT_? expr (COMMA expr)* | STAR)? CLOSE_PAR filter_clause?
;

order_by_stmt: ORDER_BY ordering_term (COMMA ordering_term)*;

limit_stmt: LIMIT_ expr ((OFFSET_ | COMMA) expr)?;

ordering_term: expr asc_desc? (NULLS_ (FIRST_ | LAST_))?;

asc_desc: ASC_ | DESC_;

offset: COMMA signed_number;

unary_operator: MINUS | PLUS | TILDE | NOT_;

column_alias: IDENTIFIER | STRING_LITERAL;

name: any_name;

function_name: any_name;

schema_name: any_name;

table_name: any_name;

column_name: any_name;

table_alias: any_name;

alias: any_name;

aggregate_func: any_name;

table_function_name: any_name;

literal_value:
    NUMERIC_LITERAL
    | STRING_LITERAL
    | NULL_
    | TRUE_
    | FALSE_
;

signed_number: (PLUS | MINUS)? NUMERIC_LITERAL;

any_name:
    IDENTIFIER
    | keyword
    | STRING_LITERAL
    | OPEN_PAR any_name CLOSE_PAR
;

keyword:
    ALL_
    | AND_
    | ANY_
    | AS_
    | ASC_
    | BETWEEN_
    | CAST_
    | CROSS_
    | DESC_
    | DISTINCT_
    | ESCAPE_
    | EXCEPT_
    | EXISTS_
    | FROM_
    | GROUP_BY
    | HAVING_
    | IN_
    | INNER_
    | INTERSECT_
    | IS_
    | ISNULL_
    | JOIN_
    | LEFT_
    | LIKE_
    | LIMIT_
    | NATURAL_
    | NOT_
    | NOT_NULL
    | NULL_
    | OFFSET_
    | ON_
    | OR_
    | ORDER_BY
    | OUTER_
    | SELECT_
    | UNION_
    | USING_
    | WHERE_
    | TRUE_
    | FALSE_
    | NULLS_
    | FIRST_
    | LAST_
    | FILTER_
;
