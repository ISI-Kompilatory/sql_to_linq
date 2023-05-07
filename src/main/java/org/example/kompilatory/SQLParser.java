package org.example.kompilatory;
// Generated from SQLParser.g4 by ANTLR 4.12.0
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast", "CheckReturnValue"})
public class SQLParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.12.0", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		SCOL=1, DOT=2, OPEN_PAR=3, CLOSE_PAR=4, COMMA=5, STAR=6, PLUS=7, MINUS=8, 
		TILDE=9, DIV=10, MOD=11, AMP=12, PIPE=13, LT=14, LT_EQ=15, GT=16, GT_EQ=17, 
		EQ=18, NOT_EQ1=19, NOT_EQ2=20, ALL_=21, AND_=22, ANY_=23, AS_=24, ASC_=25, 
		BETWEEN_=26, CAST_=27, CROSS_=28, DESC_=29, DISTINCT_=30, ESCAPE_=31, 
		EXCEPT_=32, EXISTS_=33, FROM_=34, GROUP_BY=35, HAVING_=36, IN_=37, INNER_=38, 
		INTERSECT_=39, IS_=40, ISNULL_=41, JOIN_=42, LEFT_=43, LIKE_=44, LIMIT_=45, 
		NATURAL_=46, NOT_=47, NOT_NULL=48, NULL_=49, OFFSET_=50, ON_=51, OR_=52, 
		ORDER_BY=53, OUTER_=54, SELECT_=55, UNION_=56, USING_=57, WHERE_=58, TRUE_=59, 
		FALSE_=60, NULLS_=61, FIRST_=62, LAST_=63, FILTER_=64, IDENTIFIER=65, 
		NUMERIC_LITERAL=66, STRING_LITERAL=67, SPACES=68;
	public static final int
		RULE_parse = 0, RULE_sql_stmt_list = 1, RULE_type_name = 2, RULE_expr = 3, 
		RULE_select_stmt = 4, RULE_join_clause = 5, RULE_select_core = 6, RULE_simple_select_stmt = 7, 
		RULE_compound_select_stmt = 8, RULE_table_or_subquery = 9, RULE_result_column = 10, 
		RULE_join_operator = 11, RULE_join_constraint = 12, RULE_compound_operator = 13, 
		RULE_column_name_list = 14, RULE_filter_clause = 15, RULE_aggregate_function_invocation = 16, 
		RULE_order_by_stmt = 17, RULE_limit_stmt = 18, RULE_ordering_term = 19, 
		RULE_asc_desc = 20, RULE_offset = 21, RULE_unary_operator = 22, RULE_column_alias = 23, 
		RULE_name = 24, RULE_function_name = 25, RULE_schema_name = 26, RULE_table_name = 27, 
		RULE_column_name = 28, RULE_table_alias = 29, RULE_alias = 30, RULE_aggregate_func = 31, 
		RULE_table_function_name = 32, RULE_literal_value = 33, RULE_signed_number = 34, 
		RULE_any_name = 35, RULE_keyword = 36;
	private static String[] makeRuleNames() {
		return new String[] {
			"parse", "sql_stmt_list", "type_name", "expr", "select_stmt", "join_clause", 
			"select_core", "simple_select_stmt", "compound_select_stmt", "table_or_subquery", 
			"result_column", "join_operator", "join_constraint", "compound_operator", 
			"column_name_list", "filter_clause", "aggregate_function_invocation", 
			"order_by_stmt", "limit_stmt", "ordering_term", "asc_desc", "offset", 
			"unary_operator", "column_alias", "name", "function_name", "schema_name", 
			"table_name", "column_name", "table_alias", "alias", "aggregate_func", 
			"table_function_name", "literal_value", "signed_number", "any_name", 
			"keyword"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "';'", "'.'", "'('", "')'", "','", "'*'", "'+'", "'-'", "'~'", 
			"'/'", "'%'", "'&'", "'|'", "'<'", "'<='", "'>'", "'>='", "'='", "'!='", 
			"'<>'", "'ALL'", "'AND'", "'ANY'", "'AS'", "'ASC'", "'BETWEEN'", "'CAST'", 
			"'CROSS'", "'DESC'", "'DISTINCT'", "'ESCAPE'", "'EXCEPT'", "'EXISTS'", 
			"'FROM'", "'GROUP BY'", "'HAVING'", "'IN'", "'INNER'", "'INTERSECT'", 
			"'IS'", "'ISNULL'", "'JOIN'", "'LEFT'", "'LIKE'", "'LIMIT'", "'NATURAL'", 
			"'NOT'", "'NOT NULL'", "'NULL'", "'OFFSET'", "'ON'", "'OR'", "'ORDER BY'", 
			"'OUTER'", "'SELECT'", "'UNION'", "'USING'", "'WHERE'", "'TRUE'", "'FALSE'", 
			"'NULLS'", "'FIRST'", "'LAST'", "'FILTER'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "SCOL", "DOT", "OPEN_PAR", "CLOSE_PAR", "COMMA", "STAR", "PLUS", 
			"MINUS", "TILDE", "DIV", "MOD", "AMP", "PIPE", "LT", "LT_EQ", "GT", "GT_EQ", 
			"EQ", "NOT_EQ1", "NOT_EQ2", "ALL_", "AND_", "ANY_", "AS_", "ASC_", "BETWEEN_", 
			"CAST_", "CROSS_", "DESC_", "DISTINCT_", "ESCAPE_", "EXCEPT_", "EXISTS_", 
			"FROM_", "GROUP_BY", "HAVING_", "IN_", "INNER_", "INTERSECT_", "IS_", 
			"ISNULL_", "JOIN_", "LEFT_", "LIKE_", "LIMIT_", "NATURAL_", "NOT_", "NOT_NULL", 
			"NULL_", "OFFSET_", "ON_", "OR_", "ORDER_BY", "OUTER_", "SELECT_", "UNION_", 
			"USING_", "WHERE_", "TRUE_", "FALSE_", "NULLS_", "FIRST_", "LAST_", "FILTER_", 
			"IDENTIFIER", "NUMERIC_LITERAL", "STRING_LITERAL", "SPACES"
		};
	}
	private static final String[] _SYMBOLIC_NAMES = makeSymbolicNames();
	public static final Vocabulary VOCABULARY = new VocabularyImpl(_LITERAL_NAMES, _SYMBOLIC_NAMES);

	/**
	 * @deprecated Use {@link #VOCABULARY} instead.
	 */
	@Deprecated
	public static final String[] tokenNames;
	static {
		tokenNames = new String[_SYMBOLIC_NAMES.length];
		for (int i = 0; i < tokenNames.length; i++) {
			tokenNames[i] = VOCABULARY.getLiteralName(i);
			if (tokenNames[i] == null) {
				tokenNames[i] = VOCABULARY.getSymbolicName(i);
			}

			if (tokenNames[i] == null) {
				tokenNames[i] = "<INVALID>";
			}
		}
	}

	@Override
	@Deprecated
	public String[] getTokenNames() {
		return tokenNames;
	}

	@Override

	public Vocabulary getVocabulary() {
		return VOCABULARY;
	}

	@Override
	public String getGrammarFileName() { return "SQLParser.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public SQLParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ParseContext extends ParserRuleContext {
		public TerminalNode EOF() { return getToken(SQLParser.EOF, 0); }
		public List<Sql_stmt_listContext> sql_stmt_list() {
			return getRuleContexts(Sql_stmt_listContext.class);
		}
		public Sql_stmt_listContext sql_stmt_list(int i) {
			return getRuleContext(Sql_stmt_listContext.class,i);
		}
		public ParseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_parse; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SQLParserListener ) ((SQLParserListener)listener).enterParse(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQLParserListener ) ((SQLParserListener)listener).exitParse(this);
		}
	}

	public final ParseContext parse() throws RecognitionException {
		ParseContext _localctx = new ParseContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_parse);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(77);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==SCOL || _la==SELECT_) {
				{
				{
				setState(74);
				sql_stmt_list();
				}
				}
				setState(79);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(80);
			match(EOF);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Sql_stmt_listContext extends ParserRuleContext {
		public List<Select_stmtContext> select_stmt() {
			return getRuleContexts(Select_stmtContext.class);
		}
		public Select_stmtContext select_stmt(int i) {
			return getRuleContext(Select_stmtContext.class,i);
		}
		public List<TerminalNode> SCOL() { return getTokens(SQLParser.SCOL); }
		public TerminalNode SCOL(int i) {
			return getToken(SQLParser.SCOL, i);
		}
		public Sql_stmt_listContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_sql_stmt_list; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SQLParserListener ) ((SQLParserListener)listener).enterSql_stmt_list(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQLParserListener ) ((SQLParserListener)listener).exitSql_stmt_list(this);
		}
	}

	public final Sql_stmt_listContext sql_stmt_list() throws RecognitionException {
		Sql_stmt_listContext _localctx = new Sql_stmt_listContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_sql_stmt_list);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(85);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==SCOL) {
				{
				{
				setState(82);
				match(SCOL);
				}
				}
				setState(87);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(88);
			select_stmt();
			setState(97);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,3,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(90); 
					_errHandler.sync(this);
					_la = _input.LA(1);
					do {
						{
						{
						setState(89);
						match(SCOL);
						}
						}
						setState(92); 
						_errHandler.sync(this);
						_la = _input.LA(1);
					} while ( _la==SCOL );
					setState(94);
					select_stmt();
					}
					} 
				}
				setState(99);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,3,_ctx);
			}
			setState(103);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,4,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(100);
					match(SCOL);
					}
					} 
				}
				setState(105);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,4,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Type_nameContext extends ParserRuleContext {
		public List<NameContext> name() {
			return getRuleContexts(NameContext.class);
		}
		public NameContext name(int i) {
			return getRuleContext(NameContext.class,i);
		}
		public TerminalNode OPEN_PAR() { return getToken(SQLParser.OPEN_PAR, 0); }
		public List<Signed_numberContext> signed_number() {
			return getRuleContexts(Signed_numberContext.class);
		}
		public Signed_numberContext signed_number(int i) {
			return getRuleContext(Signed_numberContext.class,i);
		}
		public TerminalNode CLOSE_PAR() { return getToken(SQLParser.CLOSE_PAR, 0); }
		public TerminalNode COMMA() { return getToken(SQLParser.COMMA, 0); }
		public Type_nameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_type_name; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SQLParserListener ) ((SQLParserListener)listener).enterType_name(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQLParserListener ) ((SQLParserListener)listener).exitType_name(this);
		}
	}

	public final Type_nameContext type_name() throws RecognitionException {
		Type_nameContext _localctx = new Type_nameContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_type_name);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(107); 
			_errHandler.sync(this);
			_alt = 1+1;
			do {
				switch (_alt) {
				case 1+1:
					{
					{
					setState(106);
					name();
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(109); 
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,5,_ctx);
			} while ( _alt!=1 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
			setState(121);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,6,_ctx) ) {
			case 1:
				{
				setState(111);
				match(OPEN_PAR);
				setState(112);
				signed_number();
				setState(113);
				match(CLOSE_PAR);
				}
				break;
			case 2:
				{
				setState(115);
				match(OPEN_PAR);
				setState(116);
				signed_number();
				setState(117);
				match(COMMA);
				setState(118);
				signed_number();
				setState(119);
				match(CLOSE_PAR);
				}
				break;
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ExprContext extends ParserRuleContext {
		public Literal_valueContext literal_value() {
			return getRuleContext(Literal_valueContext.class,0);
		}
		public Column_nameContext column_name() {
			return getRuleContext(Column_nameContext.class,0);
		}
		public Table_nameContext table_name() {
			return getRuleContext(Table_nameContext.class,0);
		}
		public List<TerminalNode> DOT() { return getTokens(SQLParser.DOT); }
		public TerminalNode DOT(int i) {
			return getToken(SQLParser.DOT, i);
		}
		public Schema_nameContext schema_name() {
			return getRuleContext(Schema_nameContext.class,0);
		}
		public Unary_operatorContext unary_operator() {
			return getRuleContext(Unary_operatorContext.class,0);
		}
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public Function_nameContext function_name() {
			return getRuleContext(Function_nameContext.class,0);
		}
		public TerminalNode OPEN_PAR() { return getToken(SQLParser.OPEN_PAR, 0); }
		public TerminalNode CLOSE_PAR() { return getToken(SQLParser.CLOSE_PAR, 0); }
		public TerminalNode STAR() { return getToken(SQLParser.STAR, 0); }
		public Filter_clauseContext filter_clause() {
			return getRuleContext(Filter_clauseContext.class,0);
		}
		public TerminalNode DISTINCT_() { return getToken(SQLParser.DISTINCT_, 0); }
		public List<TerminalNode> COMMA() { return getTokens(SQLParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(SQLParser.COMMA, i);
		}
		public TerminalNode CAST_() { return getToken(SQLParser.CAST_, 0); }
		public TerminalNode AS_() { return getToken(SQLParser.AS_, 0); }
		public Type_nameContext type_name() {
			return getRuleContext(Type_nameContext.class,0);
		}
		public Select_stmtContext select_stmt() {
			return getRuleContext(Select_stmtContext.class,0);
		}
		public TerminalNode EXISTS_() { return getToken(SQLParser.EXISTS_, 0); }
		public TerminalNode NOT_() { return getToken(SQLParser.NOT_, 0); }
		public TerminalNode DIV() { return getToken(SQLParser.DIV, 0); }
		public TerminalNode MOD() { return getToken(SQLParser.MOD, 0); }
		public TerminalNode PLUS() { return getToken(SQLParser.PLUS, 0); }
		public TerminalNode MINUS() { return getToken(SQLParser.MINUS, 0); }
		public TerminalNode AMP() { return getToken(SQLParser.AMP, 0); }
		public TerminalNode PIPE() { return getToken(SQLParser.PIPE, 0); }
		public TerminalNode LT() { return getToken(SQLParser.LT, 0); }
		public TerminalNode LT_EQ() { return getToken(SQLParser.LT_EQ, 0); }
		public TerminalNode GT() { return getToken(SQLParser.GT, 0); }
		public TerminalNode GT_EQ() { return getToken(SQLParser.GT_EQ, 0); }
		public TerminalNode EQ() { return getToken(SQLParser.EQ, 0); }
		public TerminalNode NOT_EQ1() { return getToken(SQLParser.NOT_EQ1, 0); }
		public TerminalNode NOT_EQ2() { return getToken(SQLParser.NOT_EQ2, 0); }
		public TerminalNode IS_() { return getToken(SQLParser.IS_, 0); }
		public TerminalNode IN_() { return getToken(SQLParser.IN_, 0); }
		public TerminalNode LIKE_() { return getToken(SQLParser.LIKE_, 0); }
		public TerminalNode AND_() { return getToken(SQLParser.AND_, 0); }
		public TerminalNode OR_() { return getToken(SQLParser.OR_, 0); }
		public TerminalNode BETWEEN_() { return getToken(SQLParser.BETWEEN_, 0); }
		public TerminalNode ESCAPE_() { return getToken(SQLParser.ESCAPE_, 0); }
		public TerminalNode ISNULL_() { return getToken(SQLParser.ISNULL_, 0); }
		public TerminalNode NOT_NULL() { return getToken(SQLParser.NOT_NULL, 0); }
		public TerminalNode NULL_() { return getToken(SQLParser.NULL_, 0); }
		public Table_function_nameContext table_function_name() {
			return getRuleContext(Table_function_nameContext.class,0);
		}
		public ExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expr; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SQLParserListener ) ((SQLParserListener)listener).enterExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQLParserListener ) ((SQLParserListener)listener).exitExpr(this);
		}
	}

	public final ExprContext expr() throws RecognitionException {
		return expr(0);
	}

	private ExprContext expr(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		ExprContext _localctx = new ExprContext(_ctx, _parentState);
		ExprContext _prevctx = _localctx;
		int _startState = 6;
		enterRecursionRule(_localctx, 6, RULE_expr, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(187);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,16,_ctx) ) {
			case 1:
				{
				setState(124);
				literal_value();
				}
				break;
			case 2:
				{
				setState(133);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,8,_ctx) ) {
				case 1:
					{
					setState(128);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,7,_ctx) ) {
					case 1:
						{
						setState(125);
						schema_name();
						setState(126);
						match(DOT);
						}
						break;
					}
					setState(130);
					table_name();
					setState(131);
					match(DOT);
					}
					break;
				}
				setState(135);
				column_name();
				}
				break;
			case 3:
				{
				setState(136);
				unary_operator();
				setState(137);
				expr(17);
				}
				break;
			case 4:
				{
				setState(139);
				function_name();
				setState(140);
				match(OPEN_PAR);
				setState(153);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case OPEN_PAR:
				case PLUS:
				case MINUS:
				case TILDE:
				case ALL_:
				case AND_:
				case ANY_:
				case AS_:
				case ASC_:
				case BETWEEN_:
				case CAST_:
				case CROSS_:
				case DESC_:
				case DISTINCT_:
				case ESCAPE_:
				case EXCEPT_:
				case EXISTS_:
				case FROM_:
				case GROUP_BY:
				case HAVING_:
				case IN_:
				case INNER_:
				case INTERSECT_:
				case IS_:
				case ISNULL_:
				case JOIN_:
				case LEFT_:
				case LIKE_:
				case LIMIT_:
				case NATURAL_:
				case NOT_:
				case NOT_NULL:
				case NULL_:
				case OFFSET_:
				case ON_:
				case OR_:
				case ORDER_BY:
				case OUTER_:
				case SELECT_:
				case UNION_:
				case USING_:
				case WHERE_:
				case TRUE_:
				case FALSE_:
				case NULLS_:
				case FIRST_:
				case LAST_:
				case FILTER_:
				case IDENTIFIER:
				case NUMERIC_LITERAL:
				case STRING_LITERAL:
					{
					{
					setState(142);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,9,_ctx) ) {
					case 1:
						{
						setState(141);
						match(DISTINCT_);
						}
						break;
					}
					setState(144);
					expr(0);
					setState(149);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==COMMA) {
						{
						{
						setState(145);
						match(COMMA);
						setState(146);
						expr(0);
						}
						}
						setState(151);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					}
					}
					break;
				case STAR:
					{
					setState(152);
					match(STAR);
					}
					break;
				case CLOSE_PAR:
					break;
				default:
					break;
				}
				setState(155);
				match(CLOSE_PAR);
				setState(157);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,12,_ctx) ) {
				case 1:
					{
					setState(156);
					filter_clause();
					}
					break;
				}
				}
				break;
			case 5:
				{
				setState(159);
				match(OPEN_PAR);
				setState(160);
				expr(0);
				setState(165);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(161);
					match(COMMA);
					setState(162);
					expr(0);
					}
					}
					setState(167);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(168);
				match(CLOSE_PAR);
				}
				break;
			case 6:
				{
				setState(170);
				match(CAST_);
				setState(171);
				match(OPEN_PAR);
				setState(172);
				expr(0);
				setState(173);
				match(AS_);
				setState(174);
				type_name();
				setState(175);
				match(CLOSE_PAR);
				}
				break;
			case 7:
				{
				setState(181);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==EXISTS_ || _la==NOT_) {
					{
					setState(178);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==NOT_) {
						{
						setState(177);
						match(NOT_);
						}
					}

					setState(180);
					match(EXISTS_);
					}
				}

				setState(183);
				match(OPEN_PAR);
				setState(184);
				select_stmt();
				setState(185);
				match(CLOSE_PAR);
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(298);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,32,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(296);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,31,_ctx) ) {
					case 1:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(189);
						if (!(precpred(_ctx, 16))) throw new FailedPredicateException(this, "precpred(_ctx, 16)");
						setState(190);
						_la = _input.LA(1);
						if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & 3136L) != 0)) ) {
						_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(191);
						expr(17);
						}
						break;
					case 2:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(192);
						if (!(precpred(_ctx, 15))) throw new FailedPredicateException(this, "precpred(_ctx, 15)");
						setState(193);
						_la = _input.LA(1);
						if ( !(_la==PLUS || _la==MINUS) ) {
						_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(194);
						expr(16);
						}
						break;
					case 3:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(195);
						if (!(precpred(_ctx, 14))) throw new FailedPredicateException(this, "precpred(_ctx, 14)");
						setState(196);
						_la = _input.LA(1);
						if ( !(_la==AMP || _la==PIPE) ) {
						_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(197);
						expr(15);
						}
						break;
					case 4:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(198);
						if (!(precpred(_ctx, 13))) throw new FailedPredicateException(this, "precpred(_ctx, 13)");
						setState(199);
						_la = _input.LA(1);
						if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & 245760L) != 0)) ) {
						_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(200);
						expr(14);
						}
						break;
					case 5:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(201);
						if (!(precpred(_ctx, 12))) throw new FailedPredicateException(this, "precpred(_ctx, 12)");
						setState(210);
						_errHandler.sync(this);
						switch ( getInterpreter().adaptivePredict(_input,17,_ctx) ) {
						case 1:
							{
							setState(202);
							match(EQ);
							}
							break;
						case 2:
							{
							setState(203);
							match(NOT_EQ1);
							}
							break;
						case 3:
							{
							setState(204);
							match(NOT_EQ2);
							}
							break;
						case 4:
							{
							setState(205);
							match(IS_);
							}
							break;
						case 5:
							{
							setState(206);
							match(IS_);
							setState(207);
							match(NOT_);
							}
							break;
						case 6:
							{
							setState(208);
							match(IN_);
							}
							break;
						case 7:
							{
							setState(209);
							match(LIKE_);
							}
							break;
						}
						setState(212);
						expr(13);
						}
						break;
					case 6:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(213);
						if (!(precpred(_ctx, 11))) throw new FailedPredicateException(this, "precpred(_ctx, 11)");
						setState(214);
						match(AND_);
						setState(215);
						expr(12);
						}
						break;
					case 7:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(216);
						if (!(precpred(_ctx, 10))) throw new FailedPredicateException(this, "precpred(_ctx, 10)");
						setState(217);
						match(OR_);
						setState(218);
						expr(11);
						}
						break;
					case 8:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(219);
						if (!(precpred(_ctx, 4))) throw new FailedPredicateException(this, "precpred(_ctx, 4)");
						setState(220);
						match(IS_);
						setState(222);
						_errHandler.sync(this);
						switch ( getInterpreter().adaptivePredict(_input,18,_ctx) ) {
						case 1:
							{
							setState(221);
							match(NOT_);
							}
							break;
						}
						setState(224);
						expr(5);
						}
						break;
					case 9:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(225);
						if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
						setState(227);
						_errHandler.sync(this);
						_la = _input.LA(1);
						if (_la==NOT_) {
							{
							setState(226);
							match(NOT_);
							}
						}

						setState(229);
						match(BETWEEN_);
						setState(230);
						expr(0);
						setState(231);
						match(AND_);
						setState(232);
						expr(4);
						}
						break;
					case 10:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(234);
						if (!(precpred(_ctx, 6))) throw new FailedPredicateException(this, "precpred(_ctx, 6)");
						setState(236);
						_errHandler.sync(this);
						_la = _input.LA(1);
						if (_la==NOT_) {
							{
							setState(235);
							match(NOT_);
							}
						}

						{
						setState(238);
						match(LIKE_);
						}
						setState(239);
						expr(0);
						setState(242);
						_errHandler.sync(this);
						switch ( getInterpreter().adaptivePredict(_input,21,_ctx) ) {
						case 1:
							{
							setState(240);
							match(ESCAPE_);
							setState(241);
							expr(0);
							}
							break;
						}
						}
						break;
					case 11:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(244);
						if (!(precpred(_ctx, 5))) throw new FailedPredicateException(this, "precpred(_ctx, 5)");
						setState(249);
						_errHandler.sync(this);
						switch (_input.LA(1)) {
						case ISNULL_:
							{
							setState(245);
							match(ISNULL_);
							}
							break;
						case NOT_NULL:
							{
							setState(246);
							match(NOT_NULL);
							}
							break;
						case NOT_:
							{
							setState(247);
							match(NOT_);
							setState(248);
							match(NULL_);
							}
							break;
						default:
							throw new NoViableAltException(this);
						}
						}
						break;
					case 12:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(251);
						if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
						setState(253);
						_errHandler.sync(this);
						_la = _input.LA(1);
						if (_la==NOT_) {
							{
							setState(252);
							match(NOT_);
							}
						}

						setState(255);
						match(IN_);
						setState(294);
						_errHandler.sync(this);
						switch ( getInterpreter().adaptivePredict(_input,30,_ctx) ) {
						case 1:
							{
							setState(256);
							match(OPEN_PAR);
							setState(266);
							_errHandler.sync(this);
							switch ( getInterpreter().adaptivePredict(_input,25,_ctx) ) {
							case 1:
								{
								setState(257);
								select_stmt();
								}
								break;
							case 2:
								{
								setState(258);
								expr(0);
								setState(263);
								_errHandler.sync(this);
								_la = _input.LA(1);
								while (_la==COMMA) {
									{
									{
									setState(259);
									match(COMMA);
									setState(260);
									expr(0);
									}
									}
									setState(265);
									_errHandler.sync(this);
									_la = _input.LA(1);
								}
								}
								break;
							}
							setState(268);
							match(CLOSE_PAR);
							}
							break;
						case 2:
							{
							setState(272);
							_errHandler.sync(this);
							switch ( getInterpreter().adaptivePredict(_input,26,_ctx) ) {
							case 1:
								{
								setState(269);
								schema_name();
								setState(270);
								match(DOT);
								}
								break;
							}
							setState(274);
							table_name();
							}
							break;
						case 3:
							{
							setState(278);
							_errHandler.sync(this);
							switch ( getInterpreter().adaptivePredict(_input,27,_ctx) ) {
							case 1:
								{
								setState(275);
								schema_name();
								setState(276);
								match(DOT);
								}
								break;
							}
							setState(280);
							table_function_name();
							setState(281);
							match(OPEN_PAR);
							setState(290);
							_errHandler.sync(this);
							_la = _input.LA(1);
							if ((((_la) & ~0x3f) == 0 && ((1L << _la) & -2096248L) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & 15L) != 0)) {
								{
								setState(282);
								expr(0);
								setState(287);
								_errHandler.sync(this);
								_la = _input.LA(1);
								while (_la==COMMA) {
									{
									{
									setState(283);
									match(COMMA);
									setState(284);
									expr(0);
									}
									}
									setState(289);
									_errHandler.sync(this);
									_la = _input.LA(1);
								}
								}
							}

							setState(292);
							match(CLOSE_PAR);
							}
							break;
						}
						}
						break;
					}
					} 
				}
				setState(300);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,32,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Select_stmtContext extends ParserRuleContext {
		public List<Select_coreContext> select_core() {
			return getRuleContexts(Select_coreContext.class);
		}
		public Select_coreContext select_core(int i) {
			return getRuleContext(Select_coreContext.class,i);
		}
		public List<Compound_operatorContext> compound_operator() {
			return getRuleContexts(Compound_operatorContext.class);
		}
		public Compound_operatorContext compound_operator(int i) {
			return getRuleContext(Compound_operatorContext.class,i);
		}
		public Order_by_stmtContext order_by_stmt() {
			return getRuleContext(Order_by_stmtContext.class,0);
		}
		public Limit_stmtContext limit_stmt() {
			return getRuleContext(Limit_stmtContext.class,0);
		}
		public Select_stmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_select_stmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SQLParserListener ) ((SQLParserListener)listener).enterSelect_stmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQLParserListener ) ((SQLParserListener)listener).exitSelect_stmt(this);
		}
	}

	public final Select_stmtContext select_stmt() throws RecognitionException {
		Select_stmtContext _localctx = new Select_stmtContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_select_stmt);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(301);
			select_core();
			setState(307);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 72058148088709120L) != 0)) {
				{
				{
				setState(302);
				compound_operator();
				setState(303);
				select_core();
				}
				}
				setState(309);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(311);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==ORDER_BY) {
				{
				setState(310);
				order_by_stmt();
				}
			}

			setState(314);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==LIMIT_) {
				{
				setState(313);
				limit_stmt();
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Join_clauseContext extends ParserRuleContext {
		public List<Table_or_subqueryContext> table_or_subquery() {
			return getRuleContexts(Table_or_subqueryContext.class);
		}
		public Table_or_subqueryContext table_or_subquery(int i) {
			return getRuleContext(Table_or_subqueryContext.class,i);
		}
		public List<Join_operatorContext> join_operator() {
			return getRuleContexts(Join_operatorContext.class);
		}
		public Join_operatorContext join_operator(int i) {
			return getRuleContext(Join_operatorContext.class,i);
		}
		public List<Join_constraintContext> join_constraint() {
			return getRuleContexts(Join_constraintContext.class);
		}
		public Join_constraintContext join_constraint(int i) {
			return getRuleContext(Join_constraintContext.class,i);
		}
		public Join_clauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_join_clause; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SQLParserListener ) ((SQLParserListener)listener).enterJoin_clause(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQLParserListener ) ((SQLParserListener)listener).exitJoin_clause(this);
		}
	}

	public final Join_clauseContext join_clause() throws RecognitionException {
		Join_clauseContext _localctx = new Join_clauseContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_join_clause);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(316);
			table_or_subquery();
			setState(324);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 83838030053408L) != 0)) {
				{
				{
				setState(317);
				join_operator();
				setState(318);
				table_or_subquery();
				setState(320);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==ON_ || _la==USING_) {
					{
					setState(319);
					join_constraint();
					}
				}

				}
				}
				setState(326);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Select_coreContext extends ParserRuleContext {
		public ExprContext whereExpr;
		public ExprContext expr;
		public List<ExprContext> groupByExpr = new ArrayList<ExprContext>();
		public ExprContext havingExpr;
		public TerminalNode SELECT_() { return getToken(SQLParser.SELECT_, 0); }
		public List<Result_columnContext> result_column() {
			return getRuleContexts(Result_columnContext.class);
		}
		public Result_columnContext result_column(int i) {
			return getRuleContext(Result_columnContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(SQLParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(SQLParser.COMMA, i);
		}
		public TerminalNode FROM_() { return getToken(SQLParser.FROM_, 0); }
		public TerminalNode WHERE_() { return getToken(SQLParser.WHERE_, 0); }
		public TerminalNode GROUP_BY() { return getToken(SQLParser.GROUP_BY, 0); }
		public TerminalNode DISTINCT_() { return getToken(SQLParser.DISTINCT_, 0); }
		public TerminalNode ALL_() { return getToken(SQLParser.ALL_, 0); }
		public TerminalNode ANY_() { return getToken(SQLParser.ANY_, 0); }
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public List<Table_or_subqueryContext> table_or_subquery() {
			return getRuleContexts(Table_or_subqueryContext.class);
		}
		public Table_or_subqueryContext table_or_subquery(int i) {
			return getRuleContext(Table_or_subqueryContext.class,i);
		}
		public Join_clauseContext join_clause() {
			return getRuleContext(Join_clauseContext.class,0);
		}
		public TerminalNode HAVING_() { return getToken(SQLParser.HAVING_, 0); }
		public Select_coreContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_select_core; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SQLParserListener ) ((SQLParserListener)listener).enterSelect_core(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQLParserListener ) ((SQLParserListener)listener).exitSelect_core(this);
		}
	}

	public final Select_coreContext select_core() throws RecognitionException {
		Select_coreContext _localctx = new Select_coreContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_select_core);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(327);
			match(SELECT_);
			setState(329);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,38,_ctx) ) {
			case 1:
				{
				setState(328);
				_la = _input.LA(1);
				if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & 1084227584L) != 0)) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				}
				break;
			}
			setState(331);
			result_column();
			setState(336);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(332);
				match(COMMA);
				setState(333);
				result_column();
				}
				}
				setState(338);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(351);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==FROM_) {
				{
				setState(339);
				match(FROM_);
				setState(349);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,41,_ctx) ) {
				case 1:
					{
					setState(340);
					table_or_subquery();
					setState(345);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==COMMA) {
						{
						{
						setState(341);
						match(COMMA);
						setState(342);
						table_or_subquery();
						}
						}
						setState(347);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					}
					break;
				case 2:
					{
					setState(348);
					join_clause();
					}
					break;
				}
				}
			}

			setState(355);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==WHERE_) {
				{
				setState(353);
				match(WHERE_);
				setState(354);
				((Select_coreContext)_localctx).whereExpr = expr(0);
				}
			}

			setState(370);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==GROUP_BY) {
				{
				setState(357);
				match(GROUP_BY);
				setState(358);
				((Select_coreContext)_localctx).expr = expr(0);
				((Select_coreContext)_localctx).groupByExpr.add(((Select_coreContext)_localctx).expr);
				setState(363);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(359);
					match(COMMA);
					setState(360);
					((Select_coreContext)_localctx).expr = expr(0);
					((Select_coreContext)_localctx).groupByExpr.add(((Select_coreContext)_localctx).expr);
					}
					}
					setState(365);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(368);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==HAVING_) {
					{
					setState(366);
					match(HAVING_);
					setState(367);
					((Select_coreContext)_localctx).havingExpr = expr(0);
					}
				}

				}
			}

			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Simple_select_stmtContext extends ParserRuleContext {
		public Select_coreContext select_core() {
			return getRuleContext(Select_coreContext.class,0);
		}
		public Order_by_stmtContext order_by_stmt() {
			return getRuleContext(Order_by_stmtContext.class,0);
		}
		public Limit_stmtContext limit_stmt() {
			return getRuleContext(Limit_stmtContext.class,0);
		}
		public Simple_select_stmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_simple_select_stmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SQLParserListener ) ((SQLParserListener)listener).enterSimple_select_stmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQLParserListener ) ((SQLParserListener)listener).exitSimple_select_stmt(this);
		}
	}

	public final Simple_select_stmtContext simple_select_stmt() throws RecognitionException {
		Simple_select_stmtContext _localctx = new Simple_select_stmtContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_simple_select_stmt);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(372);
			select_core();
			setState(374);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==ORDER_BY) {
				{
				setState(373);
				order_by_stmt();
				}
			}

			setState(377);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==LIMIT_) {
				{
				setState(376);
				limit_stmt();
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Compound_select_stmtContext extends ParserRuleContext {
		public List<Select_coreContext> select_core() {
			return getRuleContexts(Select_coreContext.class);
		}
		public Select_coreContext select_core(int i) {
			return getRuleContext(Select_coreContext.class,i);
		}
		public Order_by_stmtContext order_by_stmt() {
			return getRuleContext(Order_by_stmtContext.class,0);
		}
		public Limit_stmtContext limit_stmt() {
			return getRuleContext(Limit_stmtContext.class,0);
		}
		public List<TerminalNode> UNION_() { return getTokens(SQLParser.UNION_); }
		public TerminalNode UNION_(int i) {
			return getToken(SQLParser.UNION_, i);
		}
		public List<TerminalNode> INTERSECT_() { return getTokens(SQLParser.INTERSECT_); }
		public TerminalNode INTERSECT_(int i) {
			return getToken(SQLParser.INTERSECT_, i);
		}
		public List<TerminalNode> EXCEPT_() { return getTokens(SQLParser.EXCEPT_); }
		public TerminalNode EXCEPT_(int i) {
			return getToken(SQLParser.EXCEPT_, i);
		}
		public List<TerminalNode> ALL_() { return getTokens(SQLParser.ALL_); }
		public TerminalNode ALL_(int i) {
			return getToken(SQLParser.ALL_, i);
		}
		public Compound_select_stmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_compound_select_stmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SQLParserListener ) ((SQLParserListener)listener).enterCompound_select_stmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQLParserListener ) ((SQLParserListener)listener).exitCompound_select_stmt(this);
		}
	}

	public final Compound_select_stmtContext compound_select_stmt() throws RecognitionException {
		Compound_select_stmtContext _localctx = new Compound_select_stmtContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_compound_select_stmt);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(379);
			select_core();
			setState(389); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(386);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case UNION_:
					{
					setState(380);
					match(UNION_);
					setState(382);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==ALL_) {
						{
						setState(381);
						match(ALL_);
						}
					}

					}
					break;
				case INTERSECT_:
					{
					setState(384);
					match(INTERSECT_);
					}
					break;
				case EXCEPT_:
					{
					setState(385);
					match(EXCEPT_);
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(388);
				select_core();
				}
				}
				setState(391); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & 72058148088709120L) != 0) );
			setState(394);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==ORDER_BY) {
				{
				setState(393);
				order_by_stmt();
				}
			}

			setState(397);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==LIMIT_) {
				{
				setState(396);
				limit_stmt();
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Table_or_subqueryContext extends ParserRuleContext {
		public Table_nameContext table_name() {
			return getRuleContext(Table_nameContext.class,0);
		}
		public Schema_nameContext schema_name() {
			return getRuleContext(Schema_nameContext.class,0);
		}
		public TerminalNode DOT() { return getToken(SQLParser.DOT, 0); }
		public Table_aliasContext table_alias() {
			return getRuleContext(Table_aliasContext.class,0);
		}
		public TerminalNode AS_() { return getToken(SQLParser.AS_, 0); }
		public Table_function_nameContext table_function_name() {
			return getRuleContext(Table_function_nameContext.class,0);
		}
		public TerminalNode OPEN_PAR() { return getToken(SQLParser.OPEN_PAR, 0); }
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public TerminalNode CLOSE_PAR() { return getToken(SQLParser.CLOSE_PAR, 0); }
		public List<TerminalNode> COMMA() { return getTokens(SQLParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(SQLParser.COMMA, i);
		}
		public List<Table_or_subqueryContext> table_or_subquery() {
			return getRuleContexts(Table_or_subqueryContext.class);
		}
		public Table_or_subqueryContext table_or_subquery(int i) {
			return getRuleContext(Table_or_subqueryContext.class,i);
		}
		public Join_clauseContext join_clause() {
			return getRuleContext(Join_clauseContext.class,0);
		}
		public Select_stmtContext select_stmt() {
			return getRuleContext(Select_stmtContext.class,0);
		}
		public Table_or_subqueryContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_table_or_subquery; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SQLParserListener ) ((SQLParserListener)listener).enterTable_or_subquery(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQLParserListener ) ((SQLParserListener)listener).exitTable_or_subquery(this);
		}
	}

	public final Table_or_subqueryContext table_or_subquery() throws RecognitionException {
		Table_or_subqueryContext _localctx = new Table_or_subqueryContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_table_or_subquery);
		int _la;
		try {
			setState(456);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,65,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				{
				setState(402);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,54,_ctx) ) {
				case 1:
					{
					setState(399);
					schema_name();
					setState(400);
					match(DOT);
					}
					break;
				}
				setState(404);
				table_name();
				setState(409);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,56,_ctx) ) {
				case 1:
					{
					setState(406);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,55,_ctx) ) {
					case 1:
						{
						setState(405);
						match(AS_);
						}
						break;
					}
					setState(408);
					table_alias();
					}
					break;
				}
				}
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(414);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,57,_ctx) ) {
				case 1:
					{
					setState(411);
					schema_name();
					setState(412);
					match(DOT);
					}
					break;
				}
				setState(416);
				table_function_name();
				setState(417);
				match(OPEN_PAR);
				setState(418);
				expr(0);
				setState(423);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(419);
					match(COMMA);
					setState(420);
					expr(0);
					}
					}
					setState(425);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(426);
				match(CLOSE_PAR);
				setState(431);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,60,_ctx) ) {
				case 1:
					{
					setState(428);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,59,_ctx) ) {
					case 1:
						{
						setState(427);
						match(AS_);
						}
						break;
					}
					setState(430);
					table_alias();
					}
					break;
				}
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(433);
				match(OPEN_PAR);
				setState(443);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,62,_ctx) ) {
				case 1:
					{
					setState(434);
					table_or_subquery();
					setState(439);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==COMMA) {
						{
						{
						setState(435);
						match(COMMA);
						setState(436);
						table_or_subquery();
						}
						}
						setState(441);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					}
					break;
				case 2:
					{
					setState(442);
					join_clause();
					}
					break;
				}
				setState(445);
				match(CLOSE_PAR);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(447);
				match(OPEN_PAR);
				setState(448);
				select_stmt();
				setState(449);
				match(CLOSE_PAR);
				setState(454);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,64,_ctx) ) {
				case 1:
					{
					setState(451);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,63,_ctx) ) {
					case 1:
						{
						setState(450);
						match(AS_);
						}
						break;
					}
					setState(453);
					table_alias();
					}
					break;
				}
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Result_columnContext extends ParserRuleContext {
		public TerminalNode STAR() { return getToken(SQLParser.STAR, 0); }
		public Table_nameContext table_name() {
			return getRuleContext(Table_nameContext.class,0);
		}
		public TerminalNode DOT() { return getToken(SQLParser.DOT, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public Column_aliasContext column_alias() {
			return getRuleContext(Column_aliasContext.class,0);
		}
		public TerminalNode AS_() { return getToken(SQLParser.AS_, 0); }
		public Result_columnContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_result_column; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SQLParserListener ) ((SQLParserListener)listener).enterResult_column(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQLParserListener ) ((SQLParserListener)listener).exitResult_column(this);
		}
	}

	public final Result_columnContext result_column() throws RecognitionException {
		Result_columnContext _localctx = new Result_columnContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_result_column);
		int _la;
		try {
			setState(470);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,68,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(458);
				match(STAR);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(459);
				table_name();
				setState(460);
				match(DOT);
				setState(461);
				match(STAR);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(463);
				expr(0);
				setState(468);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (((((_la - 24)) & ~0x3f) == 0 && ((1L << (_la - 24)) & 10995116277761L) != 0)) {
					{
					setState(465);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==AS_) {
						{
						setState(464);
						match(AS_);
						}
					}

					setState(467);
					column_alias();
					}
				}

				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Join_operatorContext extends ParserRuleContext {
		public TerminalNode COMMA() { return getToken(SQLParser.COMMA, 0); }
		public TerminalNode JOIN_() { return getToken(SQLParser.JOIN_, 0); }
		public TerminalNode NATURAL_() { return getToken(SQLParser.NATURAL_, 0); }
		public TerminalNode LEFT_() { return getToken(SQLParser.LEFT_, 0); }
		public TerminalNode INNER_() { return getToken(SQLParser.INNER_, 0); }
		public TerminalNode CROSS_() { return getToken(SQLParser.CROSS_, 0); }
		public TerminalNode OUTER_() { return getToken(SQLParser.OUTER_, 0); }
		public Join_operatorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_join_operator; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SQLParserListener ) ((SQLParserListener)listener).enterJoin_operator(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQLParserListener ) ((SQLParserListener)listener).exitJoin_operator(this);
		}
	}

	public final Join_operatorContext join_operator() throws RecognitionException {
		Join_operatorContext _localctx = new Join_operatorContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_join_operator);
		int _la;
		try {
			setState(485);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case COMMA:
				enterOuterAlt(_localctx, 1);
				{
				setState(472);
				match(COMMA);
				}
				break;
			case CROSS_:
			case INNER_:
			case JOIN_:
			case LEFT_:
			case NATURAL_:
				enterOuterAlt(_localctx, 2);
				{
				setState(474);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==NATURAL_) {
					{
					setState(473);
					match(NATURAL_);
					}
				}

				setState(482);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case LEFT_:
					{
					setState(476);
					match(LEFT_);
					setState(478);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==OUTER_) {
						{
						setState(477);
						match(OUTER_);
						}
					}

					}
					break;
				case INNER_:
					{
					setState(480);
					match(INNER_);
					}
					break;
				case CROSS_:
					{
					setState(481);
					match(CROSS_);
					}
					break;
				case JOIN_:
					break;
				default:
					break;
				}
				setState(484);
				match(JOIN_);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Join_constraintContext extends ParserRuleContext {
		public TerminalNode ON_() { return getToken(SQLParser.ON_, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TerminalNode USING_() { return getToken(SQLParser.USING_, 0); }
		public TerminalNode OPEN_PAR() { return getToken(SQLParser.OPEN_PAR, 0); }
		public List<Column_nameContext> column_name() {
			return getRuleContexts(Column_nameContext.class);
		}
		public Column_nameContext column_name(int i) {
			return getRuleContext(Column_nameContext.class,i);
		}
		public TerminalNode CLOSE_PAR() { return getToken(SQLParser.CLOSE_PAR, 0); }
		public List<TerminalNode> COMMA() { return getTokens(SQLParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(SQLParser.COMMA, i);
		}
		public Join_constraintContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_join_constraint; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SQLParserListener ) ((SQLParserListener)listener).enterJoin_constraint(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQLParserListener ) ((SQLParserListener)listener).exitJoin_constraint(this);
		}
	}

	public final Join_constraintContext join_constraint() throws RecognitionException {
		Join_constraintContext _localctx = new Join_constraintContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_join_constraint);
		int _la;
		try {
			setState(501);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case ON_:
				enterOuterAlt(_localctx, 1);
				{
				setState(487);
				match(ON_);
				setState(488);
				expr(0);
				}
				break;
			case USING_:
				enterOuterAlt(_localctx, 2);
				{
				setState(489);
				match(USING_);
				setState(490);
				match(OPEN_PAR);
				setState(491);
				column_name();
				setState(496);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(492);
					match(COMMA);
					setState(493);
					column_name();
					}
					}
					setState(498);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(499);
				match(CLOSE_PAR);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Compound_operatorContext extends ParserRuleContext {
		public TerminalNode UNION_() { return getToken(SQLParser.UNION_, 0); }
		public TerminalNode ALL_() { return getToken(SQLParser.ALL_, 0); }
		public TerminalNode INTERSECT_() { return getToken(SQLParser.INTERSECT_, 0); }
		public TerminalNode EXCEPT_() { return getToken(SQLParser.EXCEPT_, 0); }
		public Compound_operatorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_compound_operator; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SQLParserListener ) ((SQLParserListener)listener).enterCompound_operator(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQLParserListener ) ((SQLParserListener)listener).exitCompound_operator(this);
		}
	}

	public final Compound_operatorContext compound_operator() throws RecognitionException {
		Compound_operatorContext _localctx = new Compound_operatorContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_compound_operator);
		int _la;
		try {
			setState(509);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case UNION_:
				enterOuterAlt(_localctx, 1);
				{
				setState(503);
				match(UNION_);
				setState(505);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==ALL_) {
					{
					setState(504);
					match(ALL_);
					}
				}

				}
				break;
			case INTERSECT_:
				enterOuterAlt(_localctx, 2);
				{
				setState(507);
				match(INTERSECT_);
				}
				break;
			case EXCEPT_:
				enterOuterAlt(_localctx, 3);
				{
				setState(508);
				match(EXCEPT_);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Column_name_listContext extends ParserRuleContext {
		public TerminalNode OPEN_PAR() { return getToken(SQLParser.OPEN_PAR, 0); }
		public List<Column_nameContext> column_name() {
			return getRuleContexts(Column_nameContext.class);
		}
		public Column_nameContext column_name(int i) {
			return getRuleContext(Column_nameContext.class,i);
		}
		public TerminalNode CLOSE_PAR() { return getToken(SQLParser.CLOSE_PAR, 0); }
		public List<TerminalNode> COMMA() { return getTokens(SQLParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(SQLParser.COMMA, i);
		}
		public Column_name_listContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_column_name_list; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SQLParserListener ) ((SQLParserListener)listener).enterColumn_name_list(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQLParserListener ) ((SQLParserListener)listener).exitColumn_name_list(this);
		}
	}

	public final Column_name_listContext column_name_list() throws RecognitionException {
		Column_name_listContext _localctx = new Column_name_listContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_column_name_list);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(511);
			match(OPEN_PAR);
			setState(512);
			column_name();
			setState(517);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(513);
				match(COMMA);
				setState(514);
				column_name();
				}
				}
				setState(519);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(520);
			match(CLOSE_PAR);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Filter_clauseContext extends ParserRuleContext {
		public TerminalNode FILTER_() { return getToken(SQLParser.FILTER_, 0); }
		public TerminalNode OPEN_PAR() { return getToken(SQLParser.OPEN_PAR, 0); }
		public TerminalNode WHERE_() { return getToken(SQLParser.WHERE_, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TerminalNode CLOSE_PAR() { return getToken(SQLParser.CLOSE_PAR, 0); }
		public Filter_clauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_filter_clause; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SQLParserListener ) ((SQLParserListener)listener).enterFilter_clause(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQLParserListener ) ((SQLParserListener)listener).exitFilter_clause(this);
		}
	}

	public final Filter_clauseContext filter_clause() throws RecognitionException {
		Filter_clauseContext _localctx = new Filter_clauseContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_filter_clause);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(522);
			match(FILTER_);
			setState(523);
			match(OPEN_PAR);
			setState(524);
			match(WHERE_);
			setState(525);
			expr(0);
			setState(526);
			match(CLOSE_PAR);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Aggregate_function_invocationContext extends ParserRuleContext {
		public Aggregate_funcContext aggregate_func() {
			return getRuleContext(Aggregate_funcContext.class,0);
		}
		public TerminalNode OPEN_PAR() { return getToken(SQLParser.OPEN_PAR, 0); }
		public TerminalNode CLOSE_PAR() { return getToken(SQLParser.CLOSE_PAR, 0); }
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public TerminalNode STAR() { return getToken(SQLParser.STAR, 0); }
		public Filter_clauseContext filter_clause() {
			return getRuleContext(Filter_clauseContext.class,0);
		}
		public TerminalNode DISTINCT_() { return getToken(SQLParser.DISTINCT_, 0); }
		public List<TerminalNode> COMMA() { return getTokens(SQLParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(SQLParser.COMMA, i);
		}
		public Aggregate_function_invocationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_aggregate_function_invocation; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SQLParserListener ) ((SQLParserListener)listener).enterAggregate_function_invocation(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQLParserListener ) ((SQLParserListener)listener).exitAggregate_function_invocation(this);
		}
	}

	public final Aggregate_function_invocationContext aggregate_function_invocation() throws RecognitionException {
		Aggregate_function_invocationContext _localctx = new Aggregate_function_invocationContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_aggregate_function_invocation);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(528);
			aggregate_func();
			setState(529);
			match(OPEN_PAR);
			setState(542);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case OPEN_PAR:
			case PLUS:
			case MINUS:
			case TILDE:
			case ALL_:
			case AND_:
			case ANY_:
			case AS_:
			case ASC_:
			case BETWEEN_:
			case CAST_:
			case CROSS_:
			case DESC_:
			case DISTINCT_:
			case ESCAPE_:
			case EXCEPT_:
			case EXISTS_:
			case FROM_:
			case GROUP_BY:
			case HAVING_:
			case IN_:
			case INNER_:
			case INTERSECT_:
			case IS_:
			case ISNULL_:
			case JOIN_:
			case LEFT_:
			case LIKE_:
			case LIMIT_:
			case NATURAL_:
			case NOT_:
			case NOT_NULL:
			case NULL_:
			case OFFSET_:
			case ON_:
			case OR_:
			case ORDER_BY:
			case OUTER_:
			case SELECT_:
			case UNION_:
			case USING_:
			case WHERE_:
			case TRUE_:
			case FALSE_:
			case NULLS_:
			case FIRST_:
			case LAST_:
			case FILTER_:
			case IDENTIFIER:
			case NUMERIC_LITERAL:
			case STRING_LITERAL:
				{
				setState(531);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,78,_ctx) ) {
				case 1:
					{
					setState(530);
					match(DISTINCT_);
					}
					break;
				}
				setState(533);
				expr(0);
				setState(538);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(534);
					match(COMMA);
					setState(535);
					expr(0);
					}
					}
					setState(540);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				break;
			case STAR:
				{
				setState(541);
				match(STAR);
				}
				break;
			case CLOSE_PAR:
				break;
			default:
				break;
			}
			setState(544);
			match(CLOSE_PAR);
			setState(546);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==FILTER_) {
				{
				setState(545);
				filter_clause();
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Order_by_stmtContext extends ParserRuleContext {
		public TerminalNode ORDER_BY() { return getToken(SQLParser.ORDER_BY, 0); }
		public List<Ordering_termContext> ordering_term() {
			return getRuleContexts(Ordering_termContext.class);
		}
		public Ordering_termContext ordering_term(int i) {
			return getRuleContext(Ordering_termContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(SQLParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(SQLParser.COMMA, i);
		}
		public Order_by_stmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_order_by_stmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SQLParserListener ) ((SQLParserListener)listener).enterOrder_by_stmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQLParserListener ) ((SQLParserListener)listener).exitOrder_by_stmt(this);
		}
	}

	public final Order_by_stmtContext order_by_stmt() throws RecognitionException {
		Order_by_stmtContext _localctx = new Order_by_stmtContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_order_by_stmt);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(548);
			match(ORDER_BY);
			setState(549);
			ordering_term();
			setState(554);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(550);
				match(COMMA);
				setState(551);
				ordering_term();
				}
				}
				setState(556);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Limit_stmtContext extends ParserRuleContext {
		public TerminalNode LIMIT_() { return getToken(SQLParser.LIMIT_, 0); }
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public TerminalNode OFFSET_() { return getToken(SQLParser.OFFSET_, 0); }
		public TerminalNode COMMA() { return getToken(SQLParser.COMMA, 0); }
		public Limit_stmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_limit_stmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SQLParserListener ) ((SQLParserListener)listener).enterLimit_stmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQLParserListener ) ((SQLParserListener)listener).exitLimit_stmt(this);
		}
	}

	public final Limit_stmtContext limit_stmt() throws RecognitionException {
		Limit_stmtContext _localctx = new Limit_stmtContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_limit_stmt);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(557);
			match(LIMIT_);
			setState(558);
			expr(0);
			setState(561);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==COMMA || _la==OFFSET_) {
				{
				setState(559);
				_la = _input.LA(1);
				if ( !(_la==COMMA || _la==OFFSET_) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(560);
				expr(0);
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Ordering_termContext extends ParserRuleContext {
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public Asc_descContext asc_desc() {
			return getRuleContext(Asc_descContext.class,0);
		}
		public TerminalNode NULLS_() { return getToken(SQLParser.NULLS_, 0); }
		public TerminalNode FIRST_() { return getToken(SQLParser.FIRST_, 0); }
		public TerminalNode LAST_() { return getToken(SQLParser.LAST_, 0); }
		public Ordering_termContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ordering_term; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SQLParserListener ) ((SQLParserListener)listener).enterOrdering_term(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQLParserListener ) ((SQLParserListener)listener).exitOrdering_term(this);
		}
	}

	public final Ordering_termContext ordering_term() throws RecognitionException {
		Ordering_termContext _localctx = new Ordering_termContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_ordering_term);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(563);
			expr(0);
			setState(565);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==ASC_ || _la==DESC_) {
				{
				setState(564);
				asc_desc();
				}
			}

			setState(569);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==NULLS_) {
				{
				setState(567);
				match(NULLS_);
				setState(568);
				_la = _input.LA(1);
				if ( !(_la==FIRST_ || _la==LAST_) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Asc_descContext extends ParserRuleContext {
		public TerminalNode ASC_() { return getToken(SQLParser.ASC_, 0); }
		public TerminalNode DESC_() { return getToken(SQLParser.DESC_, 0); }
		public Asc_descContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_asc_desc; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SQLParserListener ) ((SQLParserListener)listener).enterAsc_desc(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQLParserListener ) ((SQLParserListener)listener).exitAsc_desc(this);
		}
	}

	public final Asc_descContext asc_desc() throws RecognitionException {
		Asc_descContext _localctx = new Asc_descContext(_ctx, getState());
		enterRule(_localctx, 40, RULE_asc_desc);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(571);
			_la = _input.LA(1);
			if ( !(_la==ASC_ || _la==DESC_) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class OffsetContext extends ParserRuleContext {
		public TerminalNode COMMA() { return getToken(SQLParser.COMMA, 0); }
		public Signed_numberContext signed_number() {
			return getRuleContext(Signed_numberContext.class,0);
		}
		public OffsetContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_offset; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SQLParserListener ) ((SQLParserListener)listener).enterOffset(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQLParserListener ) ((SQLParserListener)listener).exitOffset(this);
		}
	}

	public final OffsetContext offset() throws RecognitionException {
		OffsetContext _localctx = new OffsetContext(_ctx, getState());
		enterRule(_localctx, 42, RULE_offset);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(573);
			match(COMMA);
			setState(574);
			signed_number();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Unary_operatorContext extends ParserRuleContext {
		public TerminalNode MINUS() { return getToken(SQLParser.MINUS, 0); }
		public TerminalNode PLUS() { return getToken(SQLParser.PLUS, 0); }
		public TerminalNode TILDE() { return getToken(SQLParser.TILDE, 0); }
		public TerminalNode NOT_() { return getToken(SQLParser.NOT_, 0); }
		public Unary_operatorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_unary_operator; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SQLParserListener ) ((SQLParserListener)listener).enterUnary_operator(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQLParserListener ) ((SQLParserListener)listener).exitUnary_operator(this);
		}
	}

	public final Unary_operatorContext unary_operator() throws RecognitionException {
		Unary_operatorContext _localctx = new Unary_operatorContext(_ctx, getState());
		enterRule(_localctx, 44, RULE_unary_operator);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(576);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & 140737488356224L) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Column_aliasContext extends ParserRuleContext {
		public TerminalNode IDENTIFIER() { return getToken(SQLParser.IDENTIFIER, 0); }
		public TerminalNode STRING_LITERAL() { return getToken(SQLParser.STRING_LITERAL, 0); }
		public Column_aliasContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_column_alias; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SQLParserListener ) ((SQLParserListener)listener).enterColumn_alias(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQLParserListener ) ((SQLParserListener)listener).exitColumn_alias(this);
		}
	}

	public final Column_aliasContext column_alias() throws RecognitionException {
		Column_aliasContext _localctx = new Column_aliasContext(_ctx, getState());
		enterRule(_localctx, 46, RULE_column_alias);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(578);
			_la = _input.LA(1);
			if ( !(_la==IDENTIFIER || _la==STRING_LITERAL) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class NameContext extends ParserRuleContext {
		public Any_nameContext any_name() {
			return getRuleContext(Any_nameContext.class,0);
		}
		public NameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_name; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SQLParserListener ) ((SQLParserListener)listener).enterName(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQLParserListener ) ((SQLParserListener)listener).exitName(this);
		}
	}

	public final NameContext name() throws RecognitionException {
		NameContext _localctx = new NameContext(_ctx, getState());
		enterRule(_localctx, 48, RULE_name);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(580);
			any_name();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Function_nameContext extends ParserRuleContext {
		public Any_nameContext any_name() {
			return getRuleContext(Any_nameContext.class,0);
		}
		public Function_nameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_function_name; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SQLParserListener ) ((SQLParserListener)listener).enterFunction_name(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQLParserListener ) ((SQLParserListener)listener).exitFunction_name(this);
		}
	}

	public final Function_nameContext function_name() throws RecognitionException {
		Function_nameContext _localctx = new Function_nameContext(_ctx, getState());
		enterRule(_localctx, 50, RULE_function_name);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(582);
			any_name();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Schema_nameContext extends ParserRuleContext {
		public Any_nameContext any_name() {
			return getRuleContext(Any_nameContext.class,0);
		}
		public Schema_nameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_schema_name; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SQLParserListener ) ((SQLParserListener)listener).enterSchema_name(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQLParserListener ) ((SQLParserListener)listener).exitSchema_name(this);
		}
	}

	public final Schema_nameContext schema_name() throws RecognitionException {
		Schema_nameContext _localctx = new Schema_nameContext(_ctx, getState());
		enterRule(_localctx, 52, RULE_schema_name);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(584);
			any_name();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Table_nameContext extends ParserRuleContext {
		public Any_nameContext any_name() {
			return getRuleContext(Any_nameContext.class,0);
		}
		public Table_nameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_table_name; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SQLParserListener ) ((SQLParserListener)listener).enterTable_name(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQLParserListener ) ((SQLParserListener)listener).exitTable_name(this);
		}
	}

	public final Table_nameContext table_name() throws RecognitionException {
		Table_nameContext _localctx = new Table_nameContext(_ctx, getState());
		enterRule(_localctx, 54, RULE_table_name);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(586);
			any_name();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Column_nameContext extends ParserRuleContext {
		public Any_nameContext any_name() {
			return getRuleContext(Any_nameContext.class,0);
		}
		public Column_nameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_column_name; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SQLParserListener ) ((SQLParserListener)listener).enterColumn_name(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQLParserListener ) ((SQLParserListener)listener).exitColumn_name(this);
		}
	}

	public final Column_nameContext column_name() throws RecognitionException {
		Column_nameContext _localctx = new Column_nameContext(_ctx, getState());
		enterRule(_localctx, 56, RULE_column_name);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(588);
			any_name();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Table_aliasContext extends ParserRuleContext {
		public Any_nameContext any_name() {
			return getRuleContext(Any_nameContext.class,0);
		}
		public Table_aliasContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_table_alias; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SQLParserListener ) ((SQLParserListener)listener).enterTable_alias(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQLParserListener ) ((SQLParserListener)listener).exitTable_alias(this);
		}
	}

	public final Table_aliasContext table_alias() throws RecognitionException {
		Table_aliasContext _localctx = new Table_aliasContext(_ctx, getState());
		enterRule(_localctx, 58, RULE_table_alias);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(590);
			any_name();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class AliasContext extends ParserRuleContext {
		public Any_nameContext any_name() {
			return getRuleContext(Any_nameContext.class,0);
		}
		public AliasContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_alias; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SQLParserListener ) ((SQLParserListener)listener).enterAlias(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQLParserListener ) ((SQLParserListener)listener).exitAlias(this);
		}
	}

	public final AliasContext alias() throws RecognitionException {
		AliasContext _localctx = new AliasContext(_ctx, getState());
		enterRule(_localctx, 60, RULE_alias);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(592);
			any_name();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Aggregate_funcContext extends ParserRuleContext {
		public Any_nameContext any_name() {
			return getRuleContext(Any_nameContext.class,0);
		}
		public Aggregate_funcContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_aggregate_func; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SQLParserListener ) ((SQLParserListener)listener).enterAggregate_func(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQLParserListener ) ((SQLParserListener)listener).exitAggregate_func(this);
		}
	}

	public final Aggregate_funcContext aggregate_func() throws RecognitionException {
		Aggregate_funcContext _localctx = new Aggregate_funcContext(_ctx, getState());
		enterRule(_localctx, 62, RULE_aggregate_func);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(594);
			any_name();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Table_function_nameContext extends ParserRuleContext {
		public Any_nameContext any_name() {
			return getRuleContext(Any_nameContext.class,0);
		}
		public Table_function_nameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_table_function_name; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SQLParserListener ) ((SQLParserListener)listener).enterTable_function_name(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQLParserListener ) ((SQLParserListener)listener).exitTable_function_name(this);
		}
	}

	public final Table_function_nameContext table_function_name() throws RecognitionException {
		Table_function_nameContext _localctx = new Table_function_nameContext(_ctx, getState());
		enterRule(_localctx, 64, RULE_table_function_name);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(596);
			any_name();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Literal_valueContext extends ParserRuleContext {
		public TerminalNode NUMERIC_LITERAL() { return getToken(SQLParser.NUMERIC_LITERAL, 0); }
		public TerminalNode STRING_LITERAL() { return getToken(SQLParser.STRING_LITERAL, 0); }
		public TerminalNode NULL_() { return getToken(SQLParser.NULL_, 0); }
		public TerminalNode TRUE_() { return getToken(SQLParser.TRUE_, 0); }
		public TerminalNode FALSE_() { return getToken(SQLParser.FALSE_, 0); }
		public Literal_valueContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_literal_value; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SQLParserListener ) ((SQLParserListener)listener).enterLiteral_value(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQLParserListener ) ((SQLParserListener)listener).exitLiteral_value(this);
		}
	}

	public final Literal_valueContext literal_value() throws RecognitionException {
		Literal_valueContext _localctx = new Literal_valueContext(_ctx, getState());
		enterRule(_localctx, 66, RULE_literal_value);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(598);
			_la = _input.LA(1);
			if ( !(((((_la - 49)) & ~0x3f) == 0 && ((1L << (_la - 49)) & 396289L) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Signed_numberContext extends ParserRuleContext {
		public TerminalNode NUMERIC_LITERAL() { return getToken(SQLParser.NUMERIC_LITERAL, 0); }
		public TerminalNode PLUS() { return getToken(SQLParser.PLUS, 0); }
		public TerminalNode MINUS() { return getToken(SQLParser.MINUS, 0); }
		public Signed_numberContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_signed_number; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SQLParserListener ) ((SQLParserListener)listener).enterSigned_number(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQLParserListener ) ((SQLParserListener)listener).exitSigned_number(this);
		}
	}

	public final Signed_numberContext signed_number() throws RecognitionException {
		Signed_numberContext _localctx = new Signed_numberContext(_ctx, getState());
		enterRule(_localctx, 68, RULE_signed_number);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(601);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==PLUS || _la==MINUS) {
				{
				setState(600);
				_la = _input.LA(1);
				if ( !(_la==PLUS || _la==MINUS) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				}
			}

			setState(603);
			match(NUMERIC_LITERAL);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Any_nameContext extends ParserRuleContext {
		public TerminalNode IDENTIFIER() { return getToken(SQLParser.IDENTIFIER, 0); }
		public KeywordContext keyword() {
			return getRuleContext(KeywordContext.class,0);
		}
		public TerminalNode STRING_LITERAL() { return getToken(SQLParser.STRING_LITERAL, 0); }
		public TerminalNode OPEN_PAR() { return getToken(SQLParser.OPEN_PAR, 0); }
		public Any_nameContext any_name() {
			return getRuleContext(Any_nameContext.class,0);
		}
		public TerminalNode CLOSE_PAR() { return getToken(SQLParser.CLOSE_PAR, 0); }
		public Any_nameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_any_name; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SQLParserListener ) ((SQLParserListener)listener).enterAny_name(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQLParserListener ) ((SQLParserListener)listener).exitAny_name(this);
		}
	}

	public final Any_nameContext any_name() throws RecognitionException {
		Any_nameContext _localctx = new Any_nameContext(_ctx, getState());
		enterRule(_localctx, 70, RULE_any_name);
		try {
			setState(612);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case IDENTIFIER:
				enterOuterAlt(_localctx, 1);
				{
				setState(605);
				match(IDENTIFIER);
				}
				break;
			case ALL_:
			case AND_:
			case ANY_:
			case AS_:
			case ASC_:
			case BETWEEN_:
			case CAST_:
			case CROSS_:
			case DESC_:
			case DISTINCT_:
			case ESCAPE_:
			case EXCEPT_:
			case EXISTS_:
			case FROM_:
			case GROUP_BY:
			case HAVING_:
			case IN_:
			case INNER_:
			case INTERSECT_:
			case IS_:
			case ISNULL_:
			case JOIN_:
			case LEFT_:
			case LIKE_:
			case LIMIT_:
			case NATURAL_:
			case NOT_:
			case NOT_NULL:
			case NULL_:
			case OFFSET_:
			case ON_:
			case OR_:
			case ORDER_BY:
			case OUTER_:
			case SELECT_:
			case UNION_:
			case USING_:
			case WHERE_:
			case TRUE_:
			case FALSE_:
			case NULLS_:
			case FIRST_:
			case LAST_:
			case FILTER_:
				enterOuterAlt(_localctx, 2);
				{
				setState(606);
				keyword();
				}
				break;
			case STRING_LITERAL:
				enterOuterAlt(_localctx, 3);
				{
				setState(607);
				match(STRING_LITERAL);
				}
				break;
			case OPEN_PAR:
				enterOuterAlt(_localctx, 4);
				{
				setState(608);
				match(OPEN_PAR);
				setState(609);
				any_name();
				setState(610);
				match(CLOSE_PAR);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class KeywordContext extends ParserRuleContext {
		public TerminalNode ALL_() { return getToken(SQLParser.ALL_, 0); }
		public TerminalNode AND_() { return getToken(SQLParser.AND_, 0); }
		public TerminalNode ANY_() { return getToken(SQLParser.ANY_, 0); }
		public TerminalNode AS_() { return getToken(SQLParser.AS_, 0); }
		public TerminalNode ASC_() { return getToken(SQLParser.ASC_, 0); }
		public TerminalNode BETWEEN_() { return getToken(SQLParser.BETWEEN_, 0); }
		public TerminalNode CAST_() { return getToken(SQLParser.CAST_, 0); }
		public TerminalNode CROSS_() { return getToken(SQLParser.CROSS_, 0); }
		public TerminalNode DESC_() { return getToken(SQLParser.DESC_, 0); }
		public TerminalNode DISTINCT_() { return getToken(SQLParser.DISTINCT_, 0); }
		public TerminalNode ESCAPE_() { return getToken(SQLParser.ESCAPE_, 0); }
		public TerminalNode EXCEPT_() { return getToken(SQLParser.EXCEPT_, 0); }
		public TerminalNode EXISTS_() { return getToken(SQLParser.EXISTS_, 0); }
		public TerminalNode FROM_() { return getToken(SQLParser.FROM_, 0); }
		public TerminalNode GROUP_BY() { return getToken(SQLParser.GROUP_BY, 0); }
		public TerminalNode HAVING_() { return getToken(SQLParser.HAVING_, 0); }
		public TerminalNode IN_() { return getToken(SQLParser.IN_, 0); }
		public TerminalNode INNER_() { return getToken(SQLParser.INNER_, 0); }
		public TerminalNode INTERSECT_() { return getToken(SQLParser.INTERSECT_, 0); }
		public TerminalNode IS_() { return getToken(SQLParser.IS_, 0); }
		public TerminalNode ISNULL_() { return getToken(SQLParser.ISNULL_, 0); }
		public TerminalNode JOIN_() { return getToken(SQLParser.JOIN_, 0); }
		public TerminalNode LEFT_() { return getToken(SQLParser.LEFT_, 0); }
		public TerminalNode LIKE_() { return getToken(SQLParser.LIKE_, 0); }
		public TerminalNode LIMIT_() { return getToken(SQLParser.LIMIT_, 0); }
		public TerminalNode NATURAL_() { return getToken(SQLParser.NATURAL_, 0); }
		public TerminalNode NOT_() { return getToken(SQLParser.NOT_, 0); }
		public TerminalNode NOT_NULL() { return getToken(SQLParser.NOT_NULL, 0); }
		public TerminalNode NULL_() { return getToken(SQLParser.NULL_, 0); }
		public TerminalNode OFFSET_() { return getToken(SQLParser.OFFSET_, 0); }
		public TerminalNode ON_() { return getToken(SQLParser.ON_, 0); }
		public TerminalNode OR_() { return getToken(SQLParser.OR_, 0); }
		public TerminalNode ORDER_BY() { return getToken(SQLParser.ORDER_BY, 0); }
		public TerminalNode OUTER_() { return getToken(SQLParser.OUTER_, 0); }
		public TerminalNode SELECT_() { return getToken(SQLParser.SELECT_, 0); }
		public TerminalNode UNION_() { return getToken(SQLParser.UNION_, 0); }
		public TerminalNode USING_() { return getToken(SQLParser.USING_, 0); }
		public TerminalNode WHERE_() { return getToken(SQLParser.WHERE_, 0); }
		public TerminalNode TRUE_() { return getToken(SQLParser.TRUE_, 0); }
		public TerminalNode FALSE_() { return getToken(SQLParser.FALSE_, 0); }
		public TerminalNode NULLS_() { return getToken(SQLParser.NULLS_, 0); }
		public TerminalNode FIRST_() { return getToken(SQLParser.FIRST_, 0); }
		public TerminalNode LAST_() { return getToken(SQLParser.LAST_, 0); }
		public TerminalNode FILTER_() { return getToken(SQLParser.FILTER_, 0); }
		public KeywordContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_keyword; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SQLParserListener ) ((SQLParserListener)listener).enterKeyword(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQLParserListener ) ((SQLParserListener)listener).exitKeyword(this);
		}
	}

	public final KeywordContext keyword() throws RecognitionException {
		KeywordContext _localctx = new KeywordContext(_ctx, getState());
		enterRule(_localctx, 72, RULE_keyword);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(614);
			_la = _input.LA(1);
			if ( !(((((_la - 21)) & ~0x3f) == 0 && ((1L << (_la - 21)) & 17592186044415L) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public boolean sempred(RuleContext _localctx, int ruleIndex, int predIndex) {
		switch (ruleIndex) {
		case 3:
			return expr_sempred((ExprContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean expr_sempred(ExprContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0:
			return precpred(_ctx, 16);
		case 1:
			return precpred(_ctx, 15);
		case 2:
			return precpred(_ctx, 14);
		case 3:
			return precpred(_ctx, 13);
		case 4:
			return precpred(_ctx, 12);
		case 5:
			return precpred(_ctx, 11);
		case 6:
			return precpred(_ctx, 10);
		case 7:
			return precpred(_ctx, 4);
		case 8:
			return precpred(_ctx, 3);
		case 9:
			return precpred(_ctx, 6);
		case 10:
			return precpred(_ctx, 5);
		case 11:
			return precpred(_ctx, 2);
		}
		return true;
	}

	public static final String _serializedATN =
		"\u0004\u0001D\u0269\u0002\u0000\u0007\u0000\u0002\u0001\u0007\u0001\u0002"+
		"\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004\u0007\u0004\u0002"+
		"\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002\u0007\u0007\u0007\u0002"+
		"\b\u0007\b\u0002\t\u0007\t\u0002\n\u0007\n\u0002\u000b\u0007\u000b\u0002"+
		"\f\u0007\f\u0002\r\u0007\r\u0002\u000e\u0007\u000e\u0002\u000f\u0007\u000f"+
		"\u0002\u0010\u0007\u0010\u0002\u0011\u0007\u0011\u0002\u0012\u0007\u0012"+
		"\u0002\u0013\u0007\u0013\u0002\u0014\u0007\u0014\u0002\u0015\u0007\u0015"+
		"\u0002\u0016\u0007\u0016\u0002\u0017\u0007\u0017\u0002\u0018\u0007\u0018"+
		"\u0002\u0019\u0007\u0019\u0002\u001a\u0007\u001a\u0002\u001b\u0007\u001b"+
		"\u0002\u001c\u0007\u001c\u0002\u001d\u0007\u001d\u0002\u001e\u0007\u001e"+
		"\u0002\u001f\u0007\u001f\u0002 \u0007 \u0002!\u0007!\u0002\"\u0007\"\u0002"+
		"#\u0007#\u0002$\u0007$\u0001\u0000\u0005\u0000L\b\u0000\n\u0000\f\u0000"+
		"O\t\u0000\u0001\u0000\u0001\u0000\u0001\u0001\u0005\u0001T\b\u0001\n\u0001"+
		"\f\u0001W\t\u0001\u0001\u0001\u0001\u0001\u0004\u0001[\b\u0001\u000b\u0001"+
		"\f\u0001\\\u0001\u0001\u0005\u0001`\b\u0001\n\u0001\f\u0001c\t\u0001\u0001"+
		"\u0001\u0005\u0001f\b\u0001\n\u0001\f\u0001i\t\u0001\u0001\u0002\u0004"+
		"\u0002l\b\u0002\u000b\u0002\f\u0002m\u0001\u0002\u0001\u0002\u0001\u0002"+
		"\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002"+
		"\u0001\u0002\u0003\u0002z\b\u0002\u0001\u0003\u0001\u0003\u0001\u0003"+
		"\u0001\u0003\u0001\u0003\u0003\u0003\u0081\b\u0003\u0001\u0003\u0001\u0003"+
		"\u0001\u0003\u0003\u0003\u0086\b\u0003\u0001\u0003\u0001\u0003\u0001\u0003"+
		"\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0003\u0003\u008f\b\u0003"+
		"\u0001\u0003\u0001\u0003\u0001\u0003\u0005\u0003\u0094\b\u0003\n\u0003"+
		"\f\u0003\u0097\t\u0003\u0001\u0003\u0003\u0003\u009a\b\u0003\u0001\u0003"+
		"\u0001\u0003\u0003\u0003\u009e\b\u0003\u0001\u0003\u0001\u0003\u0001\u0003"+
		"\u0001\u0003\u0005\u0003\u00a4\b\u0003\n\u0003\f\u0003\u00a7\t\u0003\u0001"+
		"\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001"+
		"\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0003\u0003\u00b3\b\u0003\u0001"+
		"\u0003\u0003\u0003\u00b6\b\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001"+
		"\u0003\u0003\u0003\u00bc\b\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001"+
		"\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001"+
		"\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001"+
		"\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0003"+
		"\u0003\u00d3\b\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001"+
		"\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0003"+
		"\u0003\u00df\b\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0003\u0003\u00e4"+
		"\b\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001"+
		"\u0003\u0001\u0003\u0003\u0003\u00ed\b\u0003\u0001\u0003\u0001\u0003\u0001"+
		"\u0003\u0001\u0003\u0003\u0003\u00f3\b\u0003\u0001\u0003\u0001\u0003\u0001"+
		"\u0003\u0001\u0003\u0001\u0003\u0003\u0003\u00fa\b\u0003\u0001\u0003\u0001"+
		"\u0003\u0003\u0003\u00fe\b\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001"+
		"\u0003\u0001\u0003\u0001\u0003\u0005\u0003\u0106\b\u0003\n\u0003\f\u0003"+
		"\u0109\t\u0003\u0003\u0003\u010b\b\u0003\u0001\u0003\u0001\u0003\u0001"+
		"\u0003\u0001\u0003\u0003\u0003\u0111\b\u0003\u0001\u0003\u0001\u0003\u0001"+
		"\u0003\u0001\u0003\u0003\u0003\u0117\b\u0003\u0001\u0003\u0001\u0003\u0001"+
		"\u0003\u0001\u0003\u0001\u0003\u0005\u0003\u011e\b\u0003\n\u0003\f\u0003"+
		"\u0121\t\u0003\u0003\u0003\u0123\b\u0003\u0001\u0003\u0001\u0003\u0003"+
		"\u0003\u0127\b\u0003\u0005\u0003\u0129\b\u0003\n\u0003\f\u0003\u012c\t"+
		"\u0003\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0005\u0004\u0132"+
		"\b\u0004\n\u0004\f\u0004\u0135\t\u0004\u0001\u0004\u0003\u0004\u0138\b"+
		"\u0004\u0001\u0004\u0003\u0004\u013b\b\u0004\u0001\u0005\u0001\u0005\u0001"+
		"\u0005\u0001\u0005\u0003\u0005\u0141\b\u0005\u0005\u0005\u0143\b\u0005"+
		"\n\u0005\f\u0005\u0146\t\u0005\u0001\u0006\u0001\u0006\u0003\u0006\u014a"+
		"\b\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0005\u0006\u014f\b\u0006"+
		"\n\u0006\f\u0006\u0152\t\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001"+
		"\u0006\u0005\u0006\u0158\b\u0006\n\u0006\f\u0006\u015b\t\u0006\u0001\u0006"+
		"\u0003\u0006\u015e\b\u0006\u0003\u0006\u0160\b\u0006\u0001\u0006\u0001"+
		"\u0006\u0003\u0006\u0164\b\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001"+
		"\u0006\u0005\u0006\u016a\b\u0006\n\u0006\f\u0006\u016d\t\u0006\u0001\u0006"+
		"\u0001\u0006\u0003\u0006\u0171\b\u0006\u0003\u0006\u0173\b\u0006\u0001"+
		"\u0007\u0001\u0007\u0003\u0007\u0177\b\u0007\u0001\u0007\u0003\u0007\u017a"+
		"\b\u0007\u0001\b\u0001\b\u0001\b\u0003\b\u017f\b\b\u0001\b\u0001\b\u0003"+
		"\b\u0183\b\b\u0001\b\u0004\b\u0186\b\b\u000b\b\f\b\u0187\u0001\b\u0003"+
		"\b\u018b\b\b\u0001\b\u0003\b\u018e\b\b\u0001\t\u0001\t\u0001\t\u0003\t"+
		"\u0193\b\t\u0001\t\u0001\t\u0003\t\u0197\b\t\u0001\t\u0003\t\u019a\b\t"+
		"\u0001\t\u0001\t\u0001\t\u0003\t\u019f\b\t\u0001\t\u0001\t\u0001\t\u0001"+
		"\t\u0001\t\u0005\t\u01a6\b\t\n\t\f\t\u01a9\t\t\u0001\t\u0001\t\u0003\t"+
		"\u01ad\b\t\u0001\t\u0003\t\u01b0\b\t\u0001\t\u0001\t\u0001\t\u0001\t\u0005"+
		"\t\u01b6\b\t\n\t\f\t\u01b9\t\t\u0001\t\u0003\t\u01bc\b\t\u0001\t\u0001"+
		"\t\u0001\t\u0001\t\u0001\t\u0001\t\u0003\t\u01c4\b\t\u0001\t\u0003\t\u01c7"+
		"\b\t\u0003\t\u01c9\b\t\u0001\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001\n"+
		"\u0001\n\u0003\n\u01d2\b\n\u0001\n\u0003\n\u01d5\b\n\u0003\n\u01d7\b\n"+
		"\u0001\u000b\u0001\u000b\u0003\u000b\u01db\b\u000b\u0001\u000b\u0001\u000b"+
		"\u0003\u000b\u01df\b\u000b\u0001\u000b\u0001\u000b\u0003\u000b\u01e3\b"+
		"\u000b\u0001\u000b\u0003\u000b\u01e6\b\u000b\u0001\f\u0001\f\u0001\f\u0001"+
		"\f\u0001\f\u0001\f\u0001\f\u0005\f\u01ef\b\f\n\f\f\f\u01f2\t\f\u0001\f"+
		"\u0001\f\u0003\f\u01f6\b\f\u0001\r\u0001\r\u0003\r\u01fa\b\r\u0001\r\u0001"+
		"\r\u0003\r\u01fe\b\r\u0001\u000e\u0001\u000e\u0001\u000e\u0001\u000e\u0005"+
		"\u000e\u0204\b\u000e\n\u000e\f\u000e\u0207\t\u000e\u0001\u000e\u0001\u000e"+
		"\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u000f"+
		"\u0001\u0010\u0001\u0010\u0001\u0010\u0003\u0010\u0214\b\u0010\u0001\u0010"+
		"\u0001\u0010\u0001\u0010\u0005\u0010\u0219\b\u0010\n\u0010\f\u0010\u021c"+
		"\t\u0010\u0001\u0010\u0003\u0010\u021f\b\u0010\u0001\u0010\u0001\u0010"+
		"\u0003\u0010\u0223\b\u0010\u0001\u0011\u0001\u0011\u0001\u0011\u0001\u0011"+
		"\u0005\u0011\u0229\b\u0011\n\u0011\f\u0011\u022c\t\u0011\u0001\u0012\u0001"+
		"\u0012\u0001\u0012\u0001\u0012\u0003\u0012\u0232\b\u0012\u0001\u0013\u0001"+
		"\u0013\u0003\u0013\u0236\b\u0013\u0001\u0013\u0001\u0013\u0003\u0013\u023a"+
		"\b\u0013\u0001\u0014\u0001\u0014\u0001\u0015\u0001\u0015\u0001\u0015\u0001"+
		"\u0016\u0001\u0016\u0001\u0017\u0001\u0017\u0001\u0018\u0001\u0018\u0001"+
		"\u0019\u0001\u0019\u0001\u001a\u0001\u001a\u0001\u001b\u0001\u001b\u0001"+
		"\u001c\u0001\u001c\u0001\u001d\u0001\u001d\u0001\u001e\u0001\u001e\u0001"+
		"\u001f\u0001\u001f\u0001 \u0001 \u0001!\u0001!\u0001\"\u0003\"\u025a\b"+
		"\"\u0001\"\u0001\"\u0001#\u0001#\u0001#\u0001#\u0001#\u0001#\u0001#\u0003"+
		"#\u0265\b#\u0001$\u0001$\u0001$\u0001m\u0001\u0006%\u0000\u0002\u0004"+
		"\u0006\b\n\f\u000e\u0010\u0012\u0014\u0016\u0018\u001a\u001c\u001e \""+
		"$&(*,.02468:<>@BDFH\u0000\f\u0002\u0000\u0006\u0006\n\u000b\u0001\u0000"+
		"\u0007\b\u0001\u0000\f\r\u0001\u0000\u000e\u0011\u0003\u0000\u0015\u0015"+
		"\u0017\u0017\u001e\u001e\u0002\u0000\u0005\u000522\u0001\u0000>?\u0002"+
		"\u0000\u0019\u0019\u001d\u001d\u0002\u0000\u0007\t//\u0002\u0000AACC\u0003"+
		"\u000011;<BC\u0001\u0000\u0015@\u02be\u0000M\u0001\u0000\u0000\u0000\u0002"+
		"U\u0001\u0000\u0000\u0000\u0004k\u0001\u0000\u0000\u0000\u0006\u00bb\u0001"+
		"\u0000\u0000\u0000\b\u012d\u0001\u0000\u0000\u0000\n\u013c\u0001\u0000"+
		"\u0000\u0000\f\u0147\u0001\u0000\u0000\u0000\u000e\u0174\u0001\u0000\u0000"+
		"\u0000\u0010\u017b\u0001\u0000\u0000\u0000\u0012\u01c8\u0001\u0000\u0000"+
		"\u0000\u0014\u01d6\u0001\u0000\u0000\u0000\u0016\u01e5\u0001\u0000\u0000"+
		"\u0000\u0018\u01f5\u0001\u0000\u0000\u0000\u001a\u01fd\u0001\u0000\u0000"+
		"\u0000\u001c\u01ff\u0001\u0000\u0000\u0000\u001e\u020a\u0001\u0000\u0000"+
		"\u0000 \u0210\u0001\u0000\u0000\u0000\"\u0224\u0001\u0000\u0000\u0000"+
		"$\u022d\u0001\u0000\u0000\u0000&\u0233\u0001\u0000\u0000\u0000(\u023b"+
		"\u0001\u0000\u0000\u0000*\u023d\u0001\u0000\u0000\u0000,\u0240\u0001\u0000"+
		"\u0000\u0000.\u0242\u0001\u0000\u0000\u00000\u0244\u0001\u0000\u0000\u0000"+
		"2\u0246\u0001\u0000\u0000\u00004\u0248\u0001\u0000\u0000\u00006\u024a"+
		"\u0001\u0000\u0000\u00008\u024c\u0001\u0000\u0000\u0000:\u024e\u0001\u0000"+
		"\u0000\u0000<\u0250\u0001\u0000\u0000\u0000>\u0252\u0001\u0000\u0000\u0000"+
		"@\u0254\u0001\u0000\u0000\u0000B\u0256\u0001\u0000\u0000\u0000D\u0259"+
		"\u0001\u0000\u0000\u0000F\u0264\u0001\u0000\u0000\u0000H\u0266\u0001\u0000"+
		"\u0000\u0000JL\u0003\u0002\u0001\u0000KJ\u0001\u0000\u0000\u0000LO\u0001"+
		"\u0000\u0000\u0000MK\u0001\u0000\u0000\u0000MN\u0001\u0000\u0000\u0000"+
		"NP\u0001\u0000\u0000\u0000OM\u0001\u0000\u0000\u0000PQ\u0005\u0000\u0000"+
		"\u0001Q\u0001\u0001\u0000\u0000\u0000RT\u0005\u0001\u0000\u0000SR\u0001"+
		"\u0000\u0000\u0000TW\u0001\u0000\u0000\u0000US\u0001\u0000\u0000\u0000"+
		"UV\u0001\u0000\u0000\u0000VX\u0001\u0000\u0000\u0000WU\u0001\u0000\u0000"+
		"\u0000Xa\u0003\b\u0004\u0000Y[\u0005\u0001\u0000\u0000ZY\u0001\u0000\u0000"+
		"\u0000[\\\u0001\u0000\u0000\u0000\\Z\u0001\u0000\u0000\u0000\\]\u0001"+
		"\u0000\u0000\u0000]^\u0001\u0000\u0000\u0000^`\u0003\b\u0004\u0000_Z\u0001"+
		"\u0000\u0000\u0000`c\u0001\u0000\u0000\u0000a_\u0001\u0000\u0000\u0000"+
		"ab\u0001\u0000\u0000\u0000bg\u0001\u0000\u0000\u0000ca\u0001\u0000\u0000"+
		"\u0000df\u0005\u0001\u0000\u0000ed\u0001\u0000\u0000\u0000fi\u0001\u0000"+
		"\u0000\u0000ge\u0001\u0000\u0000\u0000gh\u0001\u0000\u0000\u0000h\u0003"+
		"\u0001\u0000\u0000\u0000ig\u0001\u0000\u0000\u0000jl\u00030\u0018\u0000"+
		"kj\u0001\u0000\u0000\u0000lm\u0001\u0000\u0000\u0000mn\u0001\u0000\u0000"+
		"\u0000mk\u0001\u0000\u0000\u0000ny\u0001\u0000\u0000\u0000op\u0005\u0003"+
		"\u0000\u0000pq\u0003D\"\u0000qr\u0005\u0004\u0000\u0000rz\u0001\u0000"+
		"\u0000\u0000st\u0005\u0003\u0000\u0000tu\u0003D\"\u0000uv\u0005\u0005"+
		"\u0000\u0000vw\u0003D\"\u0000wx\u0005\u0004\u0000\u0000xz\u0001\u0000"+
		"\u0000\u0000yo\u0001\u0000\u0000\u0000ys\u0001\u0000\u0000\u0000yz\u0001"+
		"\u0000\u0000\u0000z\u0005\u0001\u0000\u0000\u0000{|\u0006\u0003\uffff"+
		"\uffff\u0000|\u00bc\u0003B!\u0000}~\u00034\u001a\u0000~\u007f\u0005\u0002"+
		"\u0000\u0000\u007f\u0081\u0001\u0000\u0000\u0000\u0080}\u0001\u0000\u0000"+
		"\u0000\u0080\u0081\u0001\u0000\u0000\u0000\u0081\u0082\u0001\u0000\u0000"+
		"\u0000\u0082\u0083\u00036\u001b\u0000\u0083\u0084\u0005\u0002\u0000\u0000"+
		"\u0084\u0086\u0001\u0000\u0000\u0000\u0085\u0080\u0001\u0000\u0000\u0000"+
		"\u0085\u0086\u0001\u0000\u0000\u0000\u0086\u0087\u0001\u0000\u0000\u0000"+
		"\u0087\u00bc\u00038\u001c\u0000\u0088\u0089\u0003,\u0016\u0000\u0089\u008a"+
		"\u0003\u0006\u0003\u0011\u008a\u00bc\u0001\u0000\u0000\u0000\u008b\u008c"+
		"\u00032\u0019\u0000\u008c\u0099\u0005\u0003\u0000\u0000\u008d\u008f\u0005"+
		"\u001e\u0000\u0000\u008e\u008d\u0001\u0000\u0000\u0000\u008e\u008f\u0001"+
		"\u0000\u0000\u0000\u008f\u0090\u0001\u0000\u0000\u0000\u0090\u0095\u0003"+
		"\u0006\u0003\u0000\u0091\u0092\u0005\u0005\u0000\u0000\u0092\u0094\u0003"+
		"\u0006\u0003\u0000\u0093\u0091\u0001\u0000\u0000\u0000\u0094\u0097\u0001"+
		"\u0000\u0000\u0000\u0095\u0093\u0001\u0000\u0000\u0000\u0095\u0096\u0001"+
		"\u0000\u0000\u0000\u0096\u009a\u0001\u0000\u0000\u0000\u0097\u0095\u0001"+
		"\u0000\u0000\u0000\u0098\u009a\u0005\u0006\u0000\u0000\u0099\u008e\u0001"+
		"\u0000\u0000\u0000\u0099\u0098\u0001\u0000\u0000\u0000\u0099\u009a\u0001"+
		"\u0000\u0000\u0000\u009a\u009b\u0001\u0000\u0000\u0000\u009b\u009d\u0005"+
		"\u0004\u0000\u0000\u009c\u009e\u0003\u001e\u000f\u0000\u009d\u009c\u0001"+
		"\u0000\u0000\u0000\u009d\u009e\u0001\u0000\u0000\u0000\u009e\u00bc\u0001"+
		"\u0000\u0000\u0000\u009f\u00a0\u0005\u0003\u0000\u0000\u00a0\u00a5\u0003"+
		"\u0006\u0003\u0000\u00a1\u00a2\u0005\u0005\u0000\u0000\u00a2\u00a4\u0003"+
		"\u0006\u0003\u0000\u00a3\u00a1\u0001\u0000\u0000\u0000\u00a4\u00a7\u0001"+
		"\u0000\u0000\u0000\u00a5\u00a3\u0001\u0000\u0000\u0000\u00a5\u00a6\u0001"+
		"\u0000\u0000\u0000\u00a6\u00a8\u0001\u0000\u0000\u0000\u00a7\u00a5\u0001"+
		"\u0000\u0000\u0000\u00a8\u00a9\u0005\u0004\u0000\u0000\u00a9\u00bc\u0001"+
		"\u0000\u0000\u0000\u00aa\u00ab\u0005\u001b\u0000\u0000\u00ab\u00ac\u0005"+
		"\u0003\u0000\u0000\u00ac\u00ad\u0003\u0006\u0003\u0000\u00ad\u00ae\u0005"+
		"\u0018\u0000\u0000\u00ae\u00af\u0003\u0004\u0002\u0000\u00af\u00b0\u0005"+
		"\u0004\u0000\u0000\u00b0\u00bc\u0001\u0000\u0000\u0000\u00b1\u00b3\u0005"+
		"/\u0000\u0000\u00b2\u00b1\u0001\u0000\u0000\u0000\u00b2\u00b3\u0001\u0000"+
		"\u0000\u0000\u00b3\u00b4\u0001\u0000\u0000\u0000\u00b4\u00b6\u0005!\u0000"+
		"\u0000\u00b5\u00b2\u0001\u0000\u0000\u0000\u00b5\u00b6\u0001\u0000\u0000"+
		"\u0000\u00b6\u00b7\u0001\u0000\u0000\u0000\u00b7\u00b8\u0005\u0003\u0000"+
		"\u0000\u00b8\u00b9\u0003\b\u0004\u0000\u00b9\u00ba\u0005\u0004\u0000\u0000"+
		"\u00ba\u00bc\u0001\u0000\u0000\u0000\u00bb{\u0001\u0000\u0000\u0000\u00bb"+
		"\u0085\u0001\u0000\u0000\u0000\u00bb\u0088\u0001\u0000\u0000\u0000\u00bb"+
		"\u008b\u0001\u0000\u0000\u0000\u00bb\u009f\u0001\u0000\u0000\u0000\u00bb"+
		"\u00aa\u0001\u0000\u0000\u0000\u00bb\u00b5\u0001\u0000\u0000\u0000\u00bc"+
		"\u012a\u0001\u0000\u0000\u0000\u00bd\u00be\n\u0010\u0000\u0000\u00be\u00bf"+
		"\u0007\u0000\u0000\u0000\u00bf\u0129\u0003\u0006\u0003\u0011\u00c0\u00c1"+
		"\n\u000f\u0000\u0000\u00c1\u00c2\u0007\u0001\u0000\u0000\u00c2\u0129\u0003"+
		"\u0006\u0003\u0010\u00c3\u00c4\n\u000e\u0000\u0000\u00c4\u00c5\u0007\u0002"+
		"\u0000\u0000\u00c5\u0129\u0003\u0006\u0003\u000f\u00c6\u00c7\n\r\u0000"+
		"\u0000\u00c7\u00c8\u0007\u0003\u0000\u0000\u00c8\u0129\u0003\u0006\u0003"+
		"\u000e\u00c9\u00d2\n\f\u0000\u0000\u00ca\u00d3\u0005\u0012\u0000\u0000"+
		"\u00cb\u00d3\u0005\u0013\u0000\u0000\u00cc\u00d3\u0005\u0014\u0000\u0000"+
		"\u00cd\u00d3\u0005(\u0000\u0000\u00ce\u00cf\u0005(\u0000\u0000\u00cf\u00d3"+
		"\u0005/\u0000\u0000\u00d0\u00d3\u0005%\u0000\u0000\u00d1\u00d3\u0005,"+
		"\u0000\u0000\u00d2\u00ca\u0001\u0000\u0000\u0000\u00d2\u00cb\u0001\u0000"+
		"\u0000\u0000\u00d2\u00cc\u0001\u0000\u0000\u0000\u00d2\u00cd\u0001\u0000"+
		"\u0000\u0000\u00d2\u00ce\u0001\u0000\u0000\u0000\u00d2\u00d0\u0001\u0000"+
		"\u0000\u0000\u00d2\u00d1\u0001\u0000\u0000\u0000\u00d3\u00d4\u0001\u0000"+
		"\u0000\u0000\u00d4\u0129\u0003\u0006\u0003\r\u00d5\u00d6\n\u000b\u0000"+
		"\u0000\u00d6\u00d7\u0005\u0016\u0000\u0000\u00d7\u0129\u0003\u0006\u0003"+
		"\f\u00d8\u00d9\n\n\u0000\u0000\u00d9\u00da\u00054\u0000\u0000\u00da\u0129"+
		"\u0003\u0006\u0003\u000b\u00db\u00dc\n\u0004\u0000\u0000\u00dc\u00de\u0005"+
		"(\u0000\u0000\u00dd\u00df\u0005/\u0000\u0000\u00de\u00dd\u0001\u0000\u0000"+
		"\u0000\u00de\u00df\u0001\u0000\u0000\u0000\u00df\u00e0\u0001\u0000\u0000"+
		"\u0000\u00e0\u0129\u0003\u0006\u0003\u0005\u00e1\u00e3\n\u0003\u0000\u0000"+
		"\u00e2\u00e4\u0005/\u0000\u0000\u00e3\u00e2\u0001\u0000\u0000\u0000\u00e3"+
		"\u00e4\u0001\u0000\u0000\u0000\u00e4\u00e5\u0001\u0000\u0000\u0000\u00e5"+
		"\u00e6\u0005\u001a\u0000\u0000\u00e6\u00e7\u0003\u0006\u0003\u0000\u00e7"+
		"\u00e8\u0005\u0016\u0000\u0000\u00e8\u00e9\u0003\u0006\u0003\u0004\u00e9"+
		"\u0129\u0001\u0000\u0000\u0000\u00ea\u00ec\n\u0006\u0000\u0000\u00eb\u00ed"+
		"\u0005/\u0000\u0000\u00ec\u00eb\u0001\u0000\u0000\u0000\u00ec\u00ed\u0001"+
		"\u0000\u0000\u0000\u00ed\u00ee\u0001\u0000\u0000\u0000\u00ee\u00ef\u0005"+
		",\u0000\u0000\u00ef\u00f2\u0003\u0006\u0003\u0000\u00f0\u00f1\u0005\u001f"+
		"\u0000\u0000\u00f1\u00f3\u0003\u0006\u0003\u0000\u00f2\u00f0\u0001\u0000"+
		"\u0000\u0000\u00f2\u00f3\u0001\u0000\u0000\u0000\u00f3\u0129\u0001\u0000"+
		"\u0000\u0000\u00f4\u00f9\n\u0005\u0000\u0000\u00f5\u00fa\u0005)\u0000"+
		"\u0000\u00f6\u00fa\u00050\u0000\u0000\u00f7\u00f8\u0005/\u0000\u0000\u00f8"+
		"\u00fa\u00051\u0000\u0000\u00f9\u00f5\u0001\u0000\u0000\u0000\u00f9\u00f6"+
		"\u0001\u0000\u0000\u0000\u00f9\u00f7\u0001\u0000\u0000\u0000\u00fa\u0129"+
		"\u0001\u0000\u0000\u0000\u00fb\u00fd\n\u0002\u0000\u0000\u00fc\u00fe\u0005"+
		"/\u0000\u0000\u00fd\u00fc\u0001\u0000\u0000\u0000\u00fd\u00fe\u0001\u0000"+
		"\u0000\u0000\u00fe\u00ff\u0001\u0000\u0000\u0000\u00ff\u0126\u0005%\u0000"+
		"\u0000\u0100\u010a\u0005\u0003\u0000\u0000\u0101\u010b\u0003\b\u0004\u0000"+
		"\u0102\u0107\u0003\u0006\u0003\u0000\u0103\u0104\u0005\u0005\u0000\u0000"+
		"\u0104\u0106\u0003\u0006\u0003\u0000\u0105\u0103\u0001\u0000\u0000\u0000"+
		"\u0106\u0109\u0001\u0000\u0000\u0000\u0107\u0105\u0001\u0000\u0000\u0000"+
		"\u0107\u0108\u0001\u0000\u0000\u0000\u0108\u010b\u0001\u0000\u0000\u0000"+
		"\u0109\u0107\u0001\u0000\u0000\u0000\u010a\u0101\u0001\u0000\u0000\u0000"+
		"\u010a\u0102\u0001\u0000\u0000\u0000\u010a\u010b\u0001\u0000\u0000\u0000"+
		"\u010b\u010c\u0001\u0000\u0000\u0000\u010c\u0127\u0005\u0004\u0000\u0000"+
		"\u010d\u010e\u00034\u001a\u0000\u010e\u010f\u0005\u0002\u0000\u0000\u010f"+
		"\u0111\u0001\u0000\u0000\u0000\u0110\u010d\u0001\u0000\u0000\u0000\u0110"+
		"\u0111\u0001\u0000\u0000\u0000\u0111\u0112\u0001\u0000\u0000\u0000\u0112"+
		"\u0127\u00036\u001b\u0000\u0113\u0114\u00034\u001a\u0000\u0114\u0115\u0005"+
		"\u0002\u0000\u0000\u0115\u0117\u0001\u0000\u0000\u0000\u0116\u0113\u0001"+
		"\u0000\u0000\u0000\u0116\u0117\u0001\u0000\u0000\u0000\u0117\u0118\u0001"+
		"\u0000\u0000\u0000\u0118\u0119\u0003@ \u0000\u0119\u0122\u0005\u0003\u0000"+
		"\u0000\u011a\u011f\u0003\u0006\u0003\u0000\u011b\u011c\u0005\u0005\u0000"+
		"\u0000\u011c\u011e\u0003\u0006\u0003\u0000\u011d\u011b\u0001\u0000\u0000"+
		"\u0000\u011e\u0121\u0001\u0000\u0000\u0000\u011f\u011d\u0001\u0000\u0000"+
		"\u0000\u011f\u0120\u0001\u0000\u0000\u0000\u0120\u0123\u0001\u0000\u0000"+
		"\u0000\u0121\u011f\u0001\u0000\u0000\u0000\u0122\u011a\u0001\u0000\u0000"+
		"\u0000\u0122\u0123\u0001\u0000\u0000\u0000\u0123\u0124\u0001\u0000\u0000"+
		"\u0000\u0124\u0125\u0005\u0004\u0000\u0000\u0125\u0127\u0001\u0000\u0000"+
		"\u0000\u0126\u0100\u0001\u0000\u0000\u0000\u0126\u0110\u0001\u0000\u0000"+
		"\u0000\u0126\u0116\u0001\u0000\u0000\u0000\u0127\u0129\u0001\u0000\u0000"+
		"\u0000\u0128\u00bd\u0001\u0000\u0000\u0000\u0128\u00c0\u0001\u0000\u0000"+
		"\u0000\u0128\u00c3\u0001\u0000\u0000\u0000\u0128\u00c6\u0001\u0000\u0000"+
		"\u0000\u0128\u00c9\u0001\u0000\u0000\u0000\u0128\u00d5\u0001\u0000\u0000"+
		"\u0000\u0128\u00d8\u0001\u0000\u0000\u0000\u0128\u00db\u0001\u0000\u0000"+
		"\u0000\u0128\u00e1\u0001\u0000\u0000\u0000\u0128\u00ea\u0001\u0000\u0000"+
		"\u0000\u0128\u00f4\u0001\u0000\u0000\u0000\u0128\u00fb\u0001\u0000\u0000"+
		"\u0000\u0129\u012c\u0001\u0000\u0000\u0000\u012a\u0128\u0001\u0000\u0000"+
		"\u0000\u012a\u012b\u0001\u0000\u0000\u0000\u012b\u0007\u0001\u0000\u0000"+
		"\u0000\u012c\u012a\u0001\u0000\u0000\u0000\u012d\u0133\u0003\f\u0006\u0000"+
		"\u012e\u012f\u0003\u001a\r\u0000\u012f\u0130\u0003\f\u0006\u0000\u0130"+
		"\u0132\u0001\u0000\u0000\u0000\u0131\u012e\u0001\u0000\u0000\u0000\u0132"+
		"\u0135\u0001\u0000\u0000\u0000\u0133\u0131\u0001\u0000\u0000\u0000\u0133"+
		"\u0134\u0001\u0000\u0000\u0000\u0134\u0137\u0001\u0000\u0000\u0000\u0135"+
		"\u0133\u0001\u0000\u0000\u0000\u0136\u0138\u0003\"\u0011\u0000\u0137\u0136"+
		"\u0001\u0000\u0000\u0000\u0137\u0138\u0001\u0000\u0000\u0000\u0138\u013a"+
		"\u0001\u0000\u0000\u0000\u0139\u013b\u0003$\u0012\u0000\u013a\u0139\u0001"+
		"\u0000\u0000\u0000\u013a\u013b\u0001\u0000\u0000\u0000\u013b\t\u0001\u0000"+
		"\u0000\u0000\u013c\u0144\u0003\u0012\t\u0000\u013d\u013e\u0003\u0016\u000b"+
		"\u0000\u013e\u0140\u0003\u0012\t\u0000\u013f\u0141\u0003\u0018\f\u0000"+
		"\u0140\u013f\u0001\u0000\u0000\u0000\u0140\u0141\u0001\u0000\u0000\u0000"+
		"\u0141\u0143\u0001\u0000\u0000\u0000\u0142\u013d\u0001\u0000\u0000\u0000"+
		"\u0143\u0146\u0001\u0000\u0000\u0000\u0144\u0142\u0001\u0000\u0000\u0000"+
		"\u0144\u0145\u0001\u0000\u0000\u0000\u0145\u000b\u0001\u0000\u0000\u0000"+
		"\u0146\u0144\u0001\u0000\u0000\u0000\u0147\u0149\u00057\u0000\u0000\u0148"+
		"\u014a\u0007\u0004\u0000\u0000\u0149\u0148\u0001\u0000\u0000\u0000\u0149"+
		"\u014a\u0001\u0000\u0000\u0000\u014a\u014b\u0001\u0000\u0000\u0000\u014b"+
		"\u0150\u0003\u0014\n\u0000\u014c\u014d\u0005\u0005\u0000\u0000\u014d\u014f"+
		"\u0003\u0014\n\u0000\u014e\u014c\u0001\u0000\u0000\u0000\u014f\u0152\u0001"+
		"\u0000\u0000\u0000\u0150\u014e\u0001\u0000\u0000\u0000\u0150\u0151\u0001"+
		"\u0000\u0000\u0000\u0151\u015f\u0001\u0000\u0000\u0000\u0152\u0150\u0001"+
		"\u0000\u0000\u0000\u0153\u015d\u0005\"\u0000\u0000\u0154\u0159\u0003\u0012"+
		"\t\u0000\u0155\u0156\u0005\u0005\u0000\u0000\u0156\u0158\u0003\u0012\t"+
		"\u0000\u0157\u0155\u0001\u0000\u0000\u0000\u0158\u015b\u0001\u0000\u0000"+
		"\u0000\u0159\u0157\u0001\u0000\u0000\u0000\u0159\u015a\u0001\u0000\u0000"+
		"\u0000\u015a\u015e\u0001\u0000\u0000\u0000\u015b\u0159\u0001\u0000\u0000"+
		"\u0000\u015c\u015e\u0003\n\u0005\u0000\u015d\u0154\u0001\u0000\u0000\u0000"+
		"\u015d\u015c\u0001\u0000\u0000\u0000\u015e\u0160\u0001\u0000\u0000\u0000"+
		"\u015f\u0153\u0001\u0000\u0000\u0000\u015f\u0160\u0001\u0000\u0000\u0000"+
		"\u0160\u0163\u0001\u0000\u0000\u0000\u0161\u0162\u0005:\u0000\u0000\u0162"+
		"\u0164\u0003\u0006\u0003\u0000\u0163\u0161\u0001\u0000\u0000\u0000\u0163"+
		"\u0164\u0001\u0000\u0000\u0000\u0164\u0172\u0001\u0000\u0000\u0000\u0165"+
		"\u0166\u0005#\u0000\u0000\u0166\u016b\u0003\u0006\u0003\u0000\u0167\u0168"+
		"\u0005\u0005\u0000\u0000\u0168\u016a\u0003\u0006\u0003\u0000\u0169\u0167"+
		"\u0001\u0000\u0000\u0000\u016a\u016d\u0001\u0000\u0000\u0000\u016b\u0169"+
		"\u0001\u0000\u0000\u0000\u016b\u016c\u0001\u0000\u0000\u0000\u016c\u0170"+
		"\u0001\u0000\u0000\u0000\u016d\u016b\u0001\u0000\u0000\u0000\u016e\u016f"+
		"\u0005$\u0000\u0000\u016f\u0171\u0003\u0006\u0003\u0000\u0170\u016e\u0001"+
		"\u0000\u0000\u0000\u0170\u0171\u0001\u0000\u0000\u0000\u0171\u0173\u0001"+
		"\u0000\u0000\u0000\u0172\u0165\u0001\u0000\u0000\u0000\u0172\u0173\u0001"+
		"\u0000\u0000\u0000\u0173\r\u0001\u0000\u0000\u0000\u0174\u0176\u0003\f"+
		"\u0006\u0000\u0175\u0177\u0003\"\u0011\u0000\u0176\u0175\u0001\u0000\u0000"+
		"\u0000\u0176\u0177\u0001\u0000\u0000\u0000\u0177\u0179\u0001\u0000\u0000"+
		"\u0000\u0178\u017a\u0003$\u0012\u0000\u0179\u0178\u0001\u0000\u0000\u0000"+
		"\u0179\u017a\u0001\u0000\u0000\u0000\u017a\u000f\u0001\u0000\u0000\u0000"+
		"\u017b\u0185\u0003\f\u0006\u0000\u017c\u017e\u00058\u0000\u0000\u017d"+
		"\u017f\u0005\u0015\u0000\u0000\u017e\u017d\u0001\u0000\u0000\u0000\u017e"+
		"\u017f\u0001\u0000\u0000\u0000\u017f\u0183\u0001\u0000\u0000\u0000\u0180"+
		"\u0183\u0005\'\u0000\u0000\u0181\u0183\u0005 \u0000\u0000\u0182\u017c"+
		"\u0001\u0000\u0000\u0000\u0182\u0180\u0001\u0000\u0000\u0000\u0182\u0181"+
		"\u0001\u0000\u0000\u0000\u0183\u0184\u0001\u0000\u0000\u0000\u0184\u0186"+
		"\u0003\f\u0006\u0000\u0185\u0182\u0001\u0000\u0000\u0000\u0186\u0187\u0001"+
		"\u0000\u0000\u0000\u0187\u0185\u0001\u0000\u0000\u0000\u0187\u0188\u0001"+
		"\u0000\u0000\u0000\u0188\u018a\u0001\u0000\u0000\u0000\u0189\u018b\u0003"+
		"\"\u0011\u0000\u018a\u0189\u0001\u0000\u0000\u0000\u018a\u018b\u0001\u0000"+
		"\u0000\u0000\u018b\u018d\u0001\u0000\u0000\u0000\u018c\u018e\u0003$\u0012"+
		"\u0000\u018d\u018c\u0001\u0000\u0000\u0000\u018d\u018e\u0001\u0000\u0000"+
		"\u0000\u018e\u0011\u0001\u0000\u0000\u0000\u018f\u0190\u00034\u001a\u0000"+
		"\u0190\u0191\u0005\u0002\u0000\u0000\u0191\u0193\u0001\u0000\u0000\u0000"+
		"\u0192\u018f\u0001\u0000\u0000\u0000\u0192\u0193\u0001\u0000\u0000\u0000"+
		"\u0193\u0194\u0001\u0000\u0000\u0000\u0194\u0199\u00036\u001b\u0000\u0195"+
		"\u0197\u0005\u0018\u0000\u0000\u0196\u0195\u0001\u0000\u0000\u0000\u0196"+
		"\u0197\u0001\u0000\u0000\u0000\u0197\u0198\u0001\u0000\u0000\u0000\u0198"+
		"\u019a\u0003:\u001d\u0000\u0199\u0196\u0001\u0000\u0000\u0000\u0199\u019a"+
		"\u0001\u0000\u0000\u0000\u019a\u01c9\u0001\u0000\u0000\u0000\u019b\u019c"+
		"\u00034\u001a\u0000\u019c\u019d\u0005\u0002\u0000\u0000\u019d\u019f\u0001"+
		"\u0000\u0000\u0000\u019e\u019b\u0001\u0000\u0000\u0000\u019e\u019f\u0001"+
		"\u0000\u0000\u0000\u019f\u01a0\u0001\u0000\u0000\u0000\u01a0\u01a1\u0003"+
		"@ \u0000\u01a1\u01a2\u0005\u0003\u0000\u0000\u01a2\u01a7\u0003\u0006\u0003"+
		"\u0000\u01a3\u01a4\u0005\u0005\u0000\u0000\u01a4\u01a6\u0003\u0006\u0003"+
		"\u0000\u01a5\u01a3\u0001\u0000\u0000\u0000\u01a6\u01a9\u0001\u0000\u0000"+
		"\u0000\u01a7\u01a5\u0001\u0000\u0000\u0000\u01a7\u01a8\u0001\u0000\u0000"+
		"\u0000\u01a8\u01aa\u0001\u0000\u0000\u0000\u01a9\u01a7\u0001\u0000\u0000"+
		"\u0000\u01aa\u01af\u0005\u0004\u0000\u0000\u01ab\u01ad\u0005\u0018\u0000"+
		"\u0000\u01ac\u01ab\u0001\u0000\u0000\u0000\u01ac\u01ad\u0001\u0000\u0000"+
		"\u0000\u01ad\u01ae\u0001\u0000\u0000\u0000\u01ae\u01b0\u0003:\u001d\u0000"+
		"\u01af\u01ac\u0001\u0000\u0000\u0000\u01af\u01b0\u0001\u0000\u0000\u0000"+
		"\u01b0\u01c9\u0001\u0000\u0000\u0000\u01b1\u01bb\u0005\u0003\u0000\u0000"+
		"\u01b2\u01b7\u0003\u0012\t\u0000\u01b3\u01b4\u0005\u0005\u0000\u0000\u01b4"+
		"\u01b6\u0003\u0012\t\u0000\u01b5\u01b3\u0001\u0000\u0000\u0000\u01b6\u01b9"+
		"\u0001\u0000\u0000\u0000\u01b7\u01b5\u0001\u0000\u0000\u0000\u01b7\u01b8"+
		"\u0001\u0000\u0000\u0000\u01b8\u01bc\u0001\u0000\u0000\u0000\u01b9\u01b7"+
		"\u0001\u0000\u0000\u0000\u01ba\u01bc\u0003\n\u0005\u0000\u01bb\u01b2\u0001"+
		"\u0000\u0000\u0000\u01bb\u01ba\u0001\u0000\u0000\u0000\u01bc\u01bd\u0001"+
		"\u0000\u0000\u0000\u01bd\u01be\u0005\u0004\u0000\u0000\u01be\u01c9\u0001"+
		"\u0000\u0000\u0000\u01bf\u01c0\u0005\u0003\u0000\u0000\u01c0\u01c1\u0003"+
		"\b\u0004\u0000\u01c1\u01c6\u0005\u0004\u0000\u0000\u01c2\u01c4\u0005\u0018"+
		"\u0000\u0000\u01c3\u01c2\u0001\u0000\u0000\u0000\u01c3\u01c4\u0001\u0000"+
		"\u0000\u0000\u01c4\u01c5\u0001\u0000\u0000\u0000\u01c5\u01c7\u0003:\u001d"+
		"\u0000\u01c6\u01c3\u0001\u0000\u0000\u0000\u01c6\u01c7\u0001\u0000\u0000"+
		"\u0000\u01c7\u01c9\u0001\u0000\u0000\u0000\u01c8\u0192\u0001\u0000\u0000"+
		"\u0000\u01c8\u019e\u0001\u0000\u0000\u0000\u01c8\u01b1\u0001\u0000\u0000"+
		"\u0000\u01c8\u01bf\u0001\u0000\u0000\u0000\u01c9\u0013\u0001\u0000\u0000"+
		"\u0000\u01ca\u01d7\u0005\u0006\u0000\u0000\u01cb\u01cc\u00036\u001b\u0000"+
		"\u01cc\u01cd\u0005\u0002\u0000\u0000\u01cd\u01ce\u0005\u0006\u0000\u0000"+
		"\u01ce\u01d7\u0001\u0000\u0000\u0000\u01cf\u01d4\u0003\u0006\u0003\u0000"+
		"\u01d0\u01d2\u0005\u0018\u0000\u0000\u01d1\u01d0\u0001\u0000\u0000\u0000"+
		"\u01d1\u01d2\u0001\u0000\u0000\u0000\u01d2\u01d3\u0001\u0000\u0000\u0000"+
		"\u01d3\u01d5\u0003.\u0017\u0000\u01d4\u01d1\u0001\u0000\u0000\u0000\u01d4"+
		"\u01d5\u0001\u0000\u0000\u0000\u01d5\u01d7\u0001\u0000\u0000\u0000\u01d6"+
		"\u01ca\u0001\u0000\u0000\u0000\u01d6\u01cb\u0001\u0000\u0000\u0000\u01d6"+
		"\u01cf\u0001\u0000\u0000\u0000\u01d7\u0015\u0001\u0000\u0000\u0000\u01d8"+
		"\u01e6\u0005\u0005\u0000\u0000\u01d9\u01db\u0005.\u0000\u0000\u01da\u01d9"+
		"\u0001\u0000\u0000\u0000\u01da\u01db\u0001\u0000\u0000\u0000\u01db\u01e2"+
		"\u0001\u0000\u0000\u0000\u01dc\u01de\u0005+\u0000\u0000\u01dd\u01df\u0005"+
		"6\u0000\u0000\u01de\u01dd\u0001\u0000\u0000\u0000\u01de\u01df\u0001\u0000"+
		"\u0000\u0000\u01df\u01e3\u0001\u0000\u0000\u0000\u01e0\u01e3\u0005&\u0000"+
		"\u0000\u01e1\u01e3\u0005\u001c\u0000\u0000\u01e2\u01dc\u0001\u0000\u0000"+
		"\u0000\u01e2\u01e0\u0001\u0000\u0000\u0000\u01e2\u01e1\u0001\u0000\u0000"+
		"\u0000\u01e2\u01e3\u0001\u0000\u0000\u0000\u01e3\u01e4\u0001\u0000\u0000"+
		"\u0000\u01e4\u01e6\u0005*\u0000\u0000\u01e5\u01d8\u0001\u0000\u0000\u0000"+
		"\u01e5\u01da\u0001\u0000\u0000\u0000\u01e6\u0017\u0001\u0000\u0000\u0000"+
		"\u01e7\u01e8\u00053\u0000\u0000\u01e8\u01f6\u0003\u0006\u0003\u0000\u01e9"+
		"\u01ea\u00059\u0000\u0000\u01ea\u01eb\u0005\u0003\u0000\u0000\u01eb\u01f0"+
		"\u00038\u001c\u0000\u01ec\u01ed\u0005\u0005\u0000\u0000\u01ed\u01ef\u0003"+
		"8\u001c\u0000\u01ee\u01ec\u0001\u0000\u0000\u0000\u01ef\u01f2\u0001\u0000"+
		"\u0000\u0000\u01f0\u01ee\u0001\u0000\u0000\u0000\u01f0\u01f1\u0001\u0000"+
		"\u0000\u0000\u01f1\u01f3\u0001\u0000\u0000\u0000\u01f2\u01f0\u0001\u0000"+
		"\u0000\u0000\u01f3\u01f4\u0005\u0004\u0000\u0000\u01f4\u01f6\u0001\u0000"+
		"\u0000\u0000\u01f5\u01e7\u0001\u0000\u0000\u0000\u01f5\u01e9\u0001\u0000"+
		"\u0000\u0000\u01f6\u0019\u0001\u0000\u0000\u0000\u01f7\u01f9\u00058\u0000"+
		"\u0000\u01f8\u01fa\u0005\u0015\u0000\u0000\u01f9\u01f8\u0001\u0000\u0000"+
		"\u0000\u01f9\u01fa\u0001\u0000\u0000\u0000\u01fa\u01fe\u0001\u0000\u0000"+
		"\u0000\u01fb\u01fe\u0005\'\u0000\u0000\u01fc\u01fe\u0005 \u0000\u0000"+
		"\u01fd\u01f7\u0001\u0000\u0000\u0000\u01fd\u01fb\u0001\u0000\u0000\u0000"+
		"\u01fd\u01fc\u0001\u0000\u0000\u0000\u01fe\u001b\u0001\u0000\u0000\u0000"+
		"\u01ff\u0200\u0005\u0003\u0000\u0000\u0200\u0205\u00038\u001c\u0000\u0201"+
		"\u0202\u0005\u0005\u0000\u0000\u0202\u0204\u00038\u001c\u0000\u0203\u0201"+
		"\u0001\u0000\u0000\u0000\u0204\u0207\u0001\u0000\u0000\u0000\u0205\u0203"+
		"\u0001\u0000\u0000\u0000\u0205\u0206\u0001\u0000\u0000\u0000\u0206\u0208"+
		"\u0001\u0000\u0000\u0000\u0207\u0205\u0001\u0000\u0000\u0000\u0208\u0209"+
		"\u0005\u0004\u0000\u0000\u0209\u001d\u0001\u0000\u0000\u0000\u020a\u020b"+
		"\u0005@\u0000\u0000\u020b\u020c\u0005\u0003\u0000\u0000\u020c\u020d\u0005"+
		":\u0000\u0000\u020d\u020e\u0003\u0006\u0003\u0000\u020e\u020f\u0005\u0004"+
		"\u0000\u0000\u020f\u001f\u0001\u0000\u0000\u0000\u0210\u0211\u0003>\u001f"+
		"\u0000\u0211\u021e\u0005\u0003\u0000\u0000\u0212\u0214\u0005\u001e\u0000"+
		"\u0000\u0213\u0212\u0001\u0000\u0000\u0000\u0213\u0214\u0001\u0000\u0000"+
		"\u0000\u0214\u0215\u0001\u0000\u0000\u0000\u0215\u021a\u0003\u0006\u0003"+
		"\u0000\u0216\u0217\u0005\u0005\u0000\u0000\u0217\u0219\u0003\u0006\u0003"+
		"\u0000\u0218\u0216\u0001\u0000\u0000\u0000\u0219\u021c\u0001\u0000\u0000"+
		"\u0000\u021a\u0218\u0001\u0000\u0000\u0000\u021a\u021b\u0001\u0000\u0000"+
		"\u0000\u021b\u021f\u0001\u0000\u0000\u0000\u021c\u021a\u0001\u0000\u0000"+
		"\u0000\u021d\u021f\u0005\u0006\u0000\u0000\u021e\u0213\u0001\u0000\u0000"+
		"\u0000\u021e\u021d\u0001\u0000\u0000\u0000\u021e\u021f\u0001\u0000\u0000"+
		"\u0000\u021f\u0220\u0001\u0000\u0000\u0000\u0220\u0222\u0005\u0004\u0000"+
		"\u0000\u0221\u0223\u0003\u001e\u000f\u0000\u0222\u0221\u0001\u0000\u0000"+
		"\u0000\u0222\u0223\u0001\u0000\u0000\u0000\u0223!\u0001\u0000\u0000\u0000"+
		"\u0224\u0225\u00055\u0000\u0000\u0225\u022a\u0003&\u0013\u0000\u0226\u0227"+
		"\u0005\u0005\u0000\u0000\u0227\u0229\u0003&\u0013\u0000\u0228\u0226\u0001"+
		"\u0000\u0000\u0000\u0229\u022c\u0001\u0000\u0000\u0000\u022a\u0228\u0001"+
		"\u0000\u0000\u0000\u022a\u022b\u0001\u0000\u0000\u0000\u022b#\u0001\u0000"+
		"\u0000\u0000\u022c\u022a\u0001\u0000\u0000\u0000\u022d\u022e\u0005-\u0000"+
		"\u0000\u022e\u0231\u0003\u0006\u0003\u0000\u022f\u0230\u0007\u0005\u0000"+
		"\u0000\u0230\u0232\u0003\u0006\u0003\u0000\u0231\u022f\u0001\u0000\u0000"+
		"\u0000\u0231\u0232\u0001\u0000\u0000\u0000\u0232%\u0001\u0000\u0000\u0000"+
		"\u0233\u0235\u0003\u0006\u0003\u0000\u0234\u0236\u0003(\u0014\u0000\u0235"+
		"\u0234\u0001\u0000\u0000\u0000\u0235\u0236\u0001\u0000\u0000\u0000\u0236"+
		"\u0239\u0001\u0000\u0000\u0000\u0237\u0238\u0005=\u0000\u0000\u0238\u023a"+
		"\u0007\u0006\u0000\u0000\u0239\u0237\u0001\u0000\u0000\u0000\u0239\u023a"+
		"\u0001\u0000\u0000\u0000\u023a\'\u0001\u0000\u0000\u0000\u023b\u023c\u0007"+
		"\u0007\u0000\u0000\u023c)\u0001\u0000\u0000\u0000\u023d\u023e\u0005\u0005"+
		"\u0000\u0000\u023e\u023f\u0003D\"\u0000\u023f+\u0001\u0000\u0000\u0000"+
		"\u0240\u0241\u0007\b\u0000\u0000\u0241-\u0001\u0000\u0000\u0000\u0242"+
		"\u0243\u0007\t\u0000\u0000\u0243/\u0001\u0000\u0000\u0000\u0244\u0245"+
		"\u0003F#\u0000\u02451\u0001\u0000\u0000\u0000\u0246\u0247\u0003F#\u0000"+
		"\u02473\u0001\u0000\u0000\u0000\u0248\u0249\u0003F#\u0000\u02495\u0001"+
		"\u0000\u0000\u0000\u024a\u024b\u0003F#\u0000\u024b7\u0001\u0000\u0000"+
		"\u0000\u024c\u024d\u0003F#\u0000\u024d9\u0001\u0000\u0000\u0000\u024e"+
		"\u024f\u0003F#\u0000\u024f;\u0001\u0000\u0000\u0000\u0250\u0251\u0003"+
		"F#\u0000\u0251=\u0001\u0000\u0000\u0000\u0252\u0253\u0003F#\u0000\u0253"+
		"?\u0001\u0000\u0000\u0000\u0254\u0255\u0003F#\u0000\u0255A\u0001\u0000"+
		"\u0000\u0000\u0256\u0257\u0007\n\u0000\u0000\u0257C\u0001\u0000\u0000"+
		"\u0000\u0258\u025a\u0007\u0001\u0000\u0000\u0259\u0258\u0001\u0000\u0000"+
		"\u0000\u0259\u025a\u0001\u0000\u0000\u0000\u025a\u025b\u0001\u0000\u0000"+
		"\u0000\u025b\u025c\u0005B\u0000\u0000\u025cE\u0001\u0000\u0000\u0000\u025d"+
		"\u0265\u0005A\u0000\u0000\u025e\u0265\u0003H$\u0000\u025f\u0265\u0005"+
		"C\u0000\u0000\u0260\u0261\u0005\u0003\u0000\u0000\u0261\u0262\u0003F#"+
		"\u0000\u0262\u0263\u0005\u0004\u0000\u0000\u0263\u0265\u0001\u0000\u0000"+
		"\u0000\u0264\u025d\u0001\u0000\u0000\u0000\u0264\u025e\u0001\u0000\u0000"+
		"\u0000\u0264\u025f\u0001\u0000\u0000\u0000\u0264\u0260\u0001\u0000\u0000"+
		"\u0000\u0265G\u0001\u0000\u0000\u0000\u0266\u0267\u0007\u000b\u0000\u0000"+
		"\u0267I\u0001\u0000\u0000\u0000XMU\\agmy\u0080\u0085\u008e\u0095\u0099"+
		"\u009d\u00a5\u00b2\u00b5\u00bb\u00d2\u00de\u00e3\u00ec\u00f2\u00f9\u00fd"+
		"\u0107\u010a\u0110\u0116\u011f\u0122\u0126\u0128\u012a\u0133\u0137\u013a"+
		"\u0140\u0144\u0149\u0150\u0159\u015d\u015f\u0163\u016b\u0170\u0172\u0176"+
		"\u0179\u017e\u0182\u0187\u018a\u018d\u0192\u0196\u0199\u019e\u01a7\u01ac"+
		"\u01af\u01b7\u01bb\u01c3\u01c6\u01c8\u01d1\u01d4\u01d6\u01da\u01de\u01e2"+
		"\u01e5\u01f0\u01f5\u01f9\u01fd\u0205\u0213\u021a\u021e\u0222\u022a\u0231"+
		"\u0235\u0239\u0259\u0264";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}