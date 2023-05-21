lexer grammar SQLLexer;

options { caseInsensitive = true; }

SCOL:      ';';
DOT:       '.';
OPEN_PAR:  '(';
CLOSE_PAR: ')';
COMMA:     ',';
STAR:      '*';
PLUS:      '+';
MINUS:     '-';
TILDE:     '~';
DIV:       '/';
MOD:       '%';
AMP:       '&';
PIPE:      '|';
LT:        '<';
LT_EQ:     '<=';
GT:        '>';
GT_EQ:     '>=';
EQ:        '=';
NOT_EQ1:   '!=';
NOT_EQ2:   '<>';

ALL_:               'ALL';
AND_:               'AND';
ANY_:               'ANY';
AS_:                'AS';
ASC_:               'ASC';
BETWEEN_:           'BETWEEN';
CAST_:              'CAST';
CROSS_:             'CROSS';
DESC_:              'DESC';
DISTINCT_:          'DISTINCT';
ESCAPE_:            'ESCAPE';
EXCEPT_:            'EXCEPT';
EXISTS_:            'EXISTS';
FROM_:              'FROM';
GROUP_BY:           'GROUP BY';
HAVING_:            'HAVING';
IN_:                'IN';
INNER_:             'INNER';
INTERSECT_:         'INTERSECT';
IS_:                'IS';
ISNULL_:            'ISNULL';
JOIN_:              'JOIN';
LEFT_:              'LEFT';
LIKE_:              'LIKE';
LIMIT_:             'LIMIT';
NATURAL_:           'NATURAL';
NOT_:               'NOT';
NOT_NULL:           'NOT NULL';
NULL_:              'NULL';
OFFSET_:            'OFFSET';
ON_:                'ON';
OR_:                'OR';
ORDER_BY:           'ORDER BY';
OUTER_:             'OUTER';
SELECT_:            'SELECT';
UNION_:             'UNION';
USING_:             'USING';
WHERE_:             'WHERE';
TRUE_:              'TRUE';
FALSE_:             'FALSE';
NULLS_:             'NULLS';
FIRST_:             'FIRST';
LAST_:              'LAST';
FILTER_:            'FILTER';

IDENTIFIER:
    '"' (~'"' | '""')* '"'
    | '`' (~'`' | '``')* '`'
    | '[' ~']'* ']'
    | [A-Z_] [A-Z_0-9]*
; 

NUMERIC_LITERAL: ((DIGIT+ ('.' DIGIT*)?) | ('.' DIGIT+)) ('E' [-+]? DIGIT+)? | '0x' HEX_DIGIT+;

STRING_LITERAL: '\'' ( ~'\'' | '\'\'')* '\'';

SPACES: [ \u000B\t\r\n] -> channel(HIDDEN);

fragment HEX_DIGIT: [0-9A-F];
fragment DIGIT:     [0-9];