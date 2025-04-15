// Generated from io\cdap\wrangler\parser\Directives.g4 by ANTLR 4.7
package io.cdap.wrangler.parser;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class DirectivesParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.7", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, T__7=8, AGGREGATE_STATS=9, 
		OBrace=10, CBrace=11, SColon=12, Or=13, And=14, Equals=15, NEquals=16, 
		GTEquals=17, LTEquals=18, Match=19, NotMatch=20, QuestionColon=21, StartsWith=22, 
		NotStartsWith=23, EndsWith=24, NotEndsWith=25, PlusEqual=26, SubEqual=27, 
		MulEqual=28, DivEqual=29, PerEqual=30, AndEqual=31, OrEqual=32, XOREqual=33, 
		Pow=34, External=35, GT=36, LT=37, Add=38, Subtract=39, Multiply=40, Divide=41, 
		Modulus=42, OBracket=43, CBracket=44, OParen=45, CParen=46, Assign=47, 
		Comma=48, QMark=49, Colon=50, Dot=51, At=52, Pipe=53, BackSlash=54, Dollar=55, 
		Tilde=56, Bool=57, Number=58, Identifier=59, Macro=60, Column=61, String=62, 
		BYTE_SIZE=63, TIME_DURATION=64, EscapeSequence=65, Comment=66, Space=67;
	public static final int
		RULE_recipe = 0, RULE_statements = 1, RULE_directive = 2, RULE_ifStatement = 3, 
		RULE_ifStat = 4, RULE_elseIfStat = 5, RULE_elseStat = 6, RULE_expression = 7, 
		RULE_forStatement = 8, RULE_macro = 9, RULE_pragma = 10, RULE_pragmaLoadDirective = 11, 
		RULE_pragmaVersion = 12, RULE_codeblock = 13, RULE_identifier = 14, RULE_properties = 15, 
		RULE_propertyList = 16, RULE_property = 17, RULE_numberRanges = 18, RULE_numberRange = 19, 
		RULE_value = 20, RULE_byteSize = 21, RULE_timeDuration = 22, RULE_ecommand = 23, 
		RULE_config = 24, RULE_column = 25, RULE_text = 26, RULE_number = 27, 
		RULE_bool = 28, RULE_condition = 29, RULE_command = 30, RULE_colList = 31, 
		RULE_numberList = 32, RULE_boolList = 33, RULE_stringList = 34, RULE_identifierList = 35;
	public static final String[] ruleNames = {
		"recipe", "statements", "directive", "ifStatement", "ifStat", "elseIfStat", 
		"elseStat", "expression", "forStatement", "macro", "pragma", "pragmaLoadDirective", 
		"pragmaVersion", "codeblock", "identifier", "properties", "propertyList", 
		"property", "numberRanges", "numberRange", "value", "byteSize", "timeDuration", 
		"ecommand", "config", "column", "text", "number", "bool", "condition", 
		"command", "colList", "numberList", "boolList", "stringList", "identifierList"
	};

	private static final String[] _LITERAL_NAMES = {
		null, "'if'", "'else'", "'for'", "'#pragma'", "'load-directives'", "'version'", 
		"'exp'", "'prop'", "'aggregate-stats'", "'{'", "'}'", "';'", "'||'", "'&&'", 
		"'=='", "'!='", "'>='", "'<='", "'=~'", "'!~'", "'?:'", "'=^'", "'!^'", 
		"'=$'", "'!$'", "'+='", "'-='", "'*='", "'/='", "'%='", "'&='", "'|='", 
		"'^='", "'^'", "'!'", "'>'", "'<'", "'+'", "'-'", "'*'", "'/'", "'%'", 
		"'['", "']'", "'('", "')'", "'='", "','", "'?'", "':'", "'.'", "'@'", 
		"'|'", "'\\'", "'$'", "'~'"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, null, null, null, null, null, null, null, null, "AGGREGATE_STATS", 
		"OBrace", "CBrace", "SColon", "Or", "And", "Equals", "NEquals", "GTEquals", 
		"LTEquals", "Match", "NotMatch", "QuestionColon", "StartsWith", "NotStartsWith", 
		"EndsWith", "NotEndsWith", "PlusEqual", "SubEqual", "MulEqual", "DivEqual", 
		"PerEqual", "AndEqual", "OrEqual", "XOREqual", "Pow", "External", "GT", 
		"LT", "Add", "Subtract", "Multiply", "Divide", "Modulus", "OBracket", 
		"CBracket", "OParen", "CParen", "Assign", "Comma", "QMark", "Colon", "Dot", 
		"At", "Pipe", "BackSlash", "Dollar", "Tilde", "Bool", "Number", "Identifier", 
		"Macro", "Column", "String", "BYTE_SIZE", "TIME_DURATION", "EscapeSequence", 
		"Comment", "Space"
	};
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
	public String getGrammarFileName() { return "Directives.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public DirectivesParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}
	public static class RecipeContext extends ParserRuleContext {
		public StatementsContext statements() {
			return getRuleContext(StatementsContext.class,0);
		}
		public TerminalNode EOF() { return getToken(DirectivesParser.EOF, 0); }
		public RecipeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_recipe; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DirectivesListener ) ((DirectivesListener)listener).enterRecipe(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DirectivesListener ) ((DirectivesListener)listener).exitRecipe(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DirectivesVisitor ) return ((DirectivesVisitor<? extends T>)visitor).visitRecipe(this);
			else return visitor.visitChildren(this);
		}
	}

	public final RecipeContext recipe() throws RecognitionException {
		RecipeContext _localctx = new RecipeContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_recipe);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(72);
			statements();
			setState(73);
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

	public static class StatementsContext extends ParserRuleContext {
		public List<TerminalNode> Comment() { return getTokens(DirectivesParser.Comment); }
		public TerminalNode Comment(int i) {
			return getToken(DirectivesParser.Comment, i);
		}
		public List<MacroContext> macro() {
			return getRuleContexts(MacroContext.class);
		}
		public MacroContext macro(int i) {
			return getRuleContext(MacroContext.class,i);
		}
		public List<DirectiveContext> directive() {
			return getRuleContexts(DirectiveContext.class);
		}
		public DirectiveContext directive(int i) {
			return getRuleContext(DirectiveContext.class,i);
		}
		public List<PragmaContext> pragma() {
			return getRuleContexts(PragmaContext.class);
		}
		public PragmaContext pragma(int i) {
			return getRuleContext(PragmaContext.class,i);
		}
		public List<IfStatementContext> ifStatement() {
			return getRuleContexts(IfStatementContext.class);
		}
		public IfStatementContext ifStatement(int i) {
			return getRuleContext(IfStatementContext.class,i);
		}
		public StatementsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_statements; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DirectivesListener ) ((DirectivesListener)listener).enterStatements(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DirectivesListener ) ((DirectivesListener)listener).exitStatements(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DirectivesVisitor ) return ((DirectivesVisitor<? extends T>)visitor).visitStatements(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StatementsContext statements() throws RecognitionException {
		StatementsContext _localctx = new StatementsContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_statements);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(86);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << T__3) | (1L << AGGREGATE_STATS) | (1L << Dollar) | (1L << Identifier))) != 0) || _la==Comment) {
				{
				setState(84);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case Comment:
					{
					setState(75);
					match(Comment);
					}
					break;
				case Dollar:
					{
					setState(76);
					macro();
					}
					break;
				case AGGREGATE_STATS:
				case Identifier:
					{
					setState(77);
					directive();
					setState(78);
					match(SColon);
					}
					break;
				case T__3:
					{
					setState(80);
					pragma();
					setState(81);
					match(SColon);
					}
					break;
				case T__0:
					{
					setState(83);
					ifStatement();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				setState(88);
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

	public static class DirectiveContext extends ParserRuleContext {
		public CommandContext command() {
			return getRuleContext(CommandContext.class,0);
		}
		public List<CodeblockContext> codeblock() {
			return getRuleContexts(CodeblockContext.class);
		}
		public CodeblockContext codeblock(int i) {
			return getRuleContext(CodeblockContext.class,i);
		}
		public List<IdentifierContext> identifier() {
			return getRuleContexts(IdentifierContext.class);
		}
		public IdentifierContext identifier(int i) {
			return getRuleContext(IdentifierContext.class,i);
		}
		public List<MacroContext> macro() {
			return getRuleContexts(MacroContext.class);
		}
		public MacroContext macro(int i) {
			return getRuleContext(MacroContext.class,i);
		}
		public List<TextContext> text() {
			return getRuleContexts(TextContext.class);
		}
		public TextContext text(int i) {
			return getRuleContext(TextContext.class,i);
		}
		public List<NumberContext> number() {
			return getRuleContexts(NumberContext.class);
		}
		public NumberContext number(int i) {
			return getRuleContext(NumberContext.class,i);
		}
		public List<BoolContext> bool() {
			return getRuleContexts(BoolContext.class);
		}
		public BoolContext bool(int i) {
			return getRuleContext(BoolContext.class,i);
		}
		public List<ByteSizeContext> byteSize() {
			return getRuleContexts(ByteSizeContext.class);
		}
		public ByteSizeContext byteSize(int i) {
			return getRuleContext(ByteSizeContext.class,i);
		}
		public List<TimeDurationContext> timeDuration() {
			return getRuleContexts(TimeDurationContext.class);
		}
		public TimeDurationContext timeDuration(int i) {
			return getRuleContext(TimeDurationContext.class,i);
		}
		public List<ColumnContext> column() {
			return getRuleContexts(ColumnContext.class);
		}
		public ColumnContext column(int i) {
			return getRuleContext(ColumnContext.class,i);
		}
		public List<ColListContext> colList() {
			return getRuleContexts(ColListContext.class);
		}
		public ColListContext colList(int i) {
			return getRuleContext(ColListContext.class,i);
		}
		public List<NumberListContext> numberList() {
			return getRuleContexts(NumberListContext.class);
		}
		public NumberListContext numberList(int i) {
			return getRuleContext(NumberListContext.class,i);
		}
		public List<BoolListContext> boolList() {
			return getRuleContexts(BoolListContext.class);
		}
		public BoolListContext boolList(int i) {
			return getRuleContext(BoolListContext.class,i);
		}
		public List<StringListContext> stringList() {
			return getRuleContexts(StringListContext.class);
		}
		public StringListContext stringList(int i) {
			return getRuleContext(StringListContext.class,i);
		}
		public List<NumberRangesContext> numberRanges() {
			return getRuleContexts(NumberRangesContext.class);
		}
		public NumberRangesContext numberRanges(int i) {
			return getRuleContext(NumberRangesContext.class,i);
		}
		public List<PropertiesContext> properties() {
			return getRuleContexts(PropertiesContext.class);
		}
		public PropertiesContext properties(int i) {
			return getRuleContext(PropertiesContext.class,i);
		}
		public TerminalNode AGGREGATE_STATS() { return getToken(DirectivesParser.AGGREGATE_STATS, 0); }
		public DirectiveContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_directive; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DirectivesListener ) ((DirectivesListener)listener).enterDirective(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DirectivesListener ) ((DirectivesListener)listener).exitDirective(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DirectivesVisitor ) return ((DirectivesVisitor<? extends T>)visitor).visitDirective(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DirectiveContext directive() throws RecognitionException {
		DirectiveContext _localctx = new DirectiveContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_directive);
		int _la;
		try {
			int _alt;
			setState(121);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case Identifier:
				enterOuterAlt(_localctx, 1);
				{
				setState(89);
				command();
				setState(107);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,3,_ctx);
				while ( _alt!=1 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1+1 ) {
						{
						setState(105);
						_errHandler.sync(this);
						switch ( getInterpreter().adaptivePredict(_input,2,_ctx) ) {
						case 1:
							{
							setState(90);
							codeblock();
							}
							break;
						case 2:
							{
							setState(91);
							identifier();
							}
							break;
						case 3:
							{
							setState(92);
							macro();
							}
							break;
						case 4:
							{
							setState(93);
							text();
							}
							break;
						case 5:
							{
							setState(94);
							number();
							}
							break;
						case 6:
							{
							setState(95);
							bool();
							}
							break;
						case 7:
							{
							setState(96);
							byteSize();
							}
							break;
						case 8:
							{
							setState(97);
							timeDuration();
							}
							break;
						case 9:
							{
							setState(98);
							column();
							}
							break;
						case 10:
							{
							setState(99);
							colList();
							}
							break;
						case 11:
							{
							setState(100);
							numberList();
							}
							break;
						case 12:
							{
							setState(101);
							boolList();
							}
							break;
						case 13:
							{
							setState(102);
							stringList();
							}
							break;
						case 14:
							{
							setState(103);
							numberRanges();
							}
							break;
						case 15:
							{
							setState(104);
							properties();
							}
							break;
						}
						} 
					}
					setState(109);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,3,_ctx);
				}
				}
				break;
			case AGGREGATE_STATS:
				enterOuterAlt(_localctx, 2);
				{
				setState(110);
				match(AGGREGATE_STATS);
				setState(111);
				column();
				setState(112);
				column();
				setState(113);
				column();
				setState(114);
				column();
				setState(116);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,4,_ctx) ) {
				case 1:
					{
					setState(115);
					text();
					}
					break;
				}
				setState(119);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==String) {
					{
					setState(118);
					text();
					}
				}

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

	public static class IfStatementContext extends ParserRuleContext {
		public IfStatContext ifStat() {
			return getRuleContext(IfStatContext.class,0);
		}
		public List<ElseIfStatContext> elseIfStat() {
			return getRuleContexts(ElseIfStatContext.class);
		}
		public ElseIfStatContext elseIfStat(int i) {
			return getRuleContext(ElseIfStatContext.class,i);
		}
		public ElseStatContext elseStat() {
			return getRuleContext(ElseStatContext.class,0);
		}
		public IfStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ifStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DirectivesListener ) ((DirectivesListener)listener).enterIfStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DirectivesListener ) ((DirectivesListener)listener).exitIfStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DirectivesVisitor ) return ((DirectivesVisitor<? extends T>)visitor).visitIfStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final IfStatementContext ifStatement() throws RecognitionException {
		IfStatementContext _localctx = new IfStatementContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_ifStatement);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(123);
			ifStat();
			setState(127);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,7,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(124);
					elseIfStat();
					}
					} 
				}
				setState(129);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,7,_ctx);
			}
			setState(131);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,8,_ctx) ) {
			case 1:
				{
				setState(130);
				elseStat();
				}
				break;
			}
			setState(133);
			match(CBrace);
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

	public static class IfStatContext extends ParserRuleContext {
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public StatementsContext statements() {
			return getRuleContext(StatementsContext.class,0);
		}
		public IfStatContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ifStat; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DirectivesListener ) ((DirectivesListener)listener).enterIfStat(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DirectivesListener ) ((DirectivesListener)listener).exitIfStat(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DirectivesVisitor ) return ((DirectivesVisitor<? extends T>)visitor).visitIfStat(this);
			else return visitor.visitChildren(this);
		}
	}

	public final IfStatContext ifStat() throws RecognitionException {
		IfStatContext _localctx = new IfStatContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_ifStat);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(135);
			match(T__0);
			setState(136);
			expression();
			setState(137);
			match(OBrace);
			setState(138);
			statements();
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

	public static class ElseIfStatContext extends ParserRuleContext {
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public StatementsContext statements() {
			return getRuleContext(StatementsContext.class,0);
		}
		public ElseIfStatContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_elseIfStat; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DirectivesListener ) ((DirectivesListener)listener).enterElseIfStat(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DirectivesListener ) ((DirectivesListener)listener).exitElseIfStat(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DirectivesVisitor ) return ((DirectivesVisitor<? extends T>)visitor).visitElseIfStat(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ElseIfStatContext elseIfStat() throws RecognitionException {
		ElseIfStatContext _localctx = new ElseIfStatContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_elseIfStat);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(140);
			match(CBrace);
			setState(141);
			match(T__1);
			setState(142);
			match(T__0);
			setState(143);
			expression();
			setState(144);
			match(OBrace);
			setState(145);
			statements();
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

	public static class ElseStatContext extends ParserRuleContext {
		public StatementsContext statements() {
			return getRuleContext(StatementsContext.class,0);
		}
		public ElseStatContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_elseStat; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DirectivesListener ) ((DirectivesListener)listener).enterElseStat(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DirectivesListener ) ((DirectivesListener)listener).exitElseStat(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DirectivesVisitor ) return ((DirectivesVisitor<? extends T>)visitor).visitElseStat(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ElseStatContext elseStat() throws RecognitionException {
		ElseStatContext _localctx = new ElseStatContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_elseStat);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(147);
			match(CBrace);
			setState(148);
			match(T__1);
			setState(149);
			match(OBrace);
			setState(150);
			statements();
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

	public static class ExpressionContext extends ParserRuleContext {
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public ExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DirectivesListener ) ((DirectivesListener)listener).enterExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DirectivesListener ) ((DirectivesListener)listener).exitExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DirectivesVisitor ) return ((DirectivesVisitor<? extends T>)visitor).visitExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExpressionContext expression() throws RecognitionException {
		ExpressionContext _localctx = new ExpressionContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_expression);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(152);
			match(OParen);
			setState(157);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,10,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					setState(155);
					_errHandler.sync(this);
					switch (_input.LA(1)) {
					case T__0:
					case T__1:
					case T__2:
					case T__3:
					case T__4:
					case T__5:
					case T__6:
					case T__7:
					case AGGREGATE_STATS:
					case OBrace:
					case CBrace:
					case SColon:
					case Or:
					case And:
					case Equals:
					case NEquals:
					case GTEquals:
					case LTEquals:
					case Match:
					case NotMatch:
					case QuestionColon:
					case StartsWith:
					case NotStartsWith:
					case EndsWith:
					case NotEndsWith:
					case PlusEqual:
					case SubEqual:
					case MulEqual:
					case DivEqual:
					case PerEqual:
					case AndEqual:
					case OrEqual:
					case XOREqual:
					case Pow:
					case External:
					case GT:
					case LT:
					case Add:
					case Subtract:
					case Multiply:
					case Divide:
					case Modulus:
					case OBracket:
					case CBracket:
					case CParen:
					case Assign:
					case Comma:
					case QMark:
					case Colon:
					case Dot:
					case At:
					case Pipe:
					case BackSlash:
					case Dollar:
					case Tilde:
					case Bool:
					case Number:
					case Identifier:
					case Macro:
					case Column:
					case String:
					case BYTE_SIZE:
					case TIME_DURATION:
					case EscapeSequence:
					case Comment:
					case Space:
						{
						setState(153);
						_la = _input.LA(1);
						if ( _la <= 0 || (_la==OParen) ) {
						_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						}
						break;
					case OParen:
						{
						setState(154);
						expression();
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					} 
				}
				setState(159);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,10,_ctx);
			}
			setState(160);
			match(CParen);
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

	public static class ForStatementContext extends ParserRuleContext {
		public TerminalNode Identifier() { return getToken(DirectivesParser.Identifier, 0); }
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public StatementsContext statements() {
			return getRuleContext(StatementsContext.class,0);
		}
		public ForStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_forStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DirectivesListener ) ((DirectivesListener)listener).enterForStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DirectivesListener ) ((DirectivesListener)listener).exitForStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DirectivesVisitor ) return ((DirectivesVisitor<? extends T>)visitor).visitForStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ForStatementContext forStatement() throws RecognitionException {
		ForStatementContext _localctx = new ForStatementContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_forStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(162);
			match(T__2);
			setState(163);
			match(OParen);
			setState(164);
			match(Identifier);
			setState(165);
			match(Assign);
			setState(166);
			expression();
			setState(167);
			match(SColon);
			setState(168);
			expression();
			setState(169);
			match(SColon);
			setState(170);
			expression();
			setState(171);
			match(CParen);
			setState(172);
			match(OBrace);
			setState(173);
			statements();
			setState(174);
			match(CBrace);
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

	public static class MacroContext extends ParserRuleContext {
		public TerminalNode Dollar() { return getToken(DirectivesParser.Dollar, 0); }
		public List<TerminalNode> OBrace() { return getTokens(DirectivesParser.OBrace); }
		public TerminalNode OBrace(int i) {
			return getToken(DirectivesParser.OBrace, i);
		}
		public TerminalNode CBrace() { return getToken(DirectivesParser.CBrace, 0); }
		public List<MacroContext> macro() {
			return getRuleContexts(MacroContext.class);
		}
		public MacroContext macro(int i) {
			return getRuleContext(MacroContext.class,i);
		}
		public List<TerminalNode> Macro() { return getTokens(DirectivesParser.Macro); }
		public TerminalNode Macro(int i) {
			return getToken(DirectivesParser.Macro, i);
		}
		public MacroContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_macro; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DirectivesListener ) ((DirectivesListener)listener).enterMacro(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DirectivesListener ) ((DirectivesListener)listener).exitMacro(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DirectivesVisitor ) return ((DirectivesVisitor<? extends T>)visitor).visitMacro(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MacroContext macro() throws RecognitionException {
		MacroContext _localctx = new MacroContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_macro);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(176);
			match(Dollar);
			setState(177);
			match(OBrace);
			setState(183);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,12,_ctx);
			while ( _alt!=1 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1+1 ) {
					{
					setState(181);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,11,_ctx) ) {
					case 1:
						{
						setState(178);
						_la = _input.LA(1);
						if ( _la <= 0 || (_la==OBrace) ) {
						_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						}
						break;
					case 2:
						{
						setState(179);
						macro();
						}
						break;
					case 3:
						{
						setState(180);
						match(Macro);
						}
						break;
					}
					} 
				}
				setState(185);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,12,_ctx);
			}
			setState(186);
			match(CBrace);
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

	public static class PragmaContext extends ParserRuleContext {
		public PragmaLoadDirectiveContext pragmaLoadDirective() {
			return getRuleContext(PragmaLoadDirectiveContext.class,0);
		}
		public PragmaVersionContext pragmaVersion() {
			return getRuleContext(PragmaVersionContext.class,0);
		}
		public PragmaContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_pragma; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DirectivesListener ) ((DirectivesListener)listener).enterPragma(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DirectivesListener ) ((DirectivesListener)listener).exitPragma(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DirectivesVisitor ) return ((DirectivesVisitor<? extends T>)visitor).visitPragma(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PragmaContext pragma() throws RecognitionException {
		PragmaContext _localctx = new PragmaContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_pragma);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(188);
			match(T__3);
			setState(191);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__4:
				{
				setState(189);
				pragmaLoadDirective();
				}
				break;
			case T__5:
				{
				setState(190);
				pragmaVersion();
				}
				break;
			default:
				throw new NoViableAltException(this);
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

	public static class PragmaLoadDirectiveContext extends ParserRuleContext {
		public IdentifierListContext identifierList() {
			return getRuleContext(IdentifierListContext.class,0);
		}
		public PragmaLoadDirectiveContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_pragmaLoadDirective; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DirectivesListener ) ((DirectivesListener)listener).enterPragmaLoadDirective(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DirectivesListener ) ((DirectivesListener)listener).exitPragmaLoadDirective(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DirectivesVisitor ) return ((DirectivesVisitor<? extends T>)visitor).visitPragmaLoadDirective(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PragmaLoadDirectiveContext pragmaLoadDirective() throws RecognitionException {
		PragmaLoadDirectiveContext _localctx = new PragmaLoadDirectiveContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_pragmaLoadDirective);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(193);
			match(T__4);
			setState(194);
			identifierList();
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

	public static class PragmaVersionContext extends ParserRuleContext {
		public TerminalNode Number() { return getToken(DirectivesParser.Number, 0); }
		public PragmaVersionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_pragmaVersion; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DirectivesListener ) ((DirectivesListener)listener).enterPragmaVersion(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DirectivesListener ) ((DirectivesListener)listener).exitPragmaVersion(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DirectivesVisitor ) return ((DirectivesVisitor<? extends T>)visitor).visitPragmaVersion(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PragmaVersionContext pragmaVersion() throws RecognitionException {
		PragmaVersionContext _localctx = new PragmaVersionContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_pragmaVersion);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(196);
			match(T__5);
			setState(197);
			match(Number);
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

	public static class CodeblockContext extends ParserRuleContext {
		public ConditionContext condition() {
			return getRuleContext(ConditionContext.class,0);
		}
		public List<TerminalNode> Space() { return getTokens(DirectivesParser.Space); }
		public TerminalNode Space(int i) {
			return getToken(DirectivesParser.Space, i);
		}
		public CodeblockContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_codeblock; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DirectivesListener ) ((DirectivesListener)listener).enterCodeblock(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DirectivesListener ) ((DirectivesListener)listener).exitCodeblock(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DirectivesVisitor ) return ((DirectivesVisitor<? extends T>)visitor).visitCodeblock(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CodeblockContext codeblock() throws RecognitionException {
		CodeblockContext _localctx = new CodeblockContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_codeblock);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(199);
			match(T__6);
			setState(203);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==Space) {
				{
				{
				setState(200);
				match(Space);
				}
				}
				setState(205);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(206);
			match(Colon);
			setState(207);
			condition();
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

	public static class IdentifierContext extends ParserRuleContext {
		public TerminalNode Identifier() { return getToken(DirectivesParser.Identifier, 0); }
		public IdentifierContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_identifier; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DirectivesListener ) ((DirectivesListener)listener).enterIdentifier(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DirectivesListener ) ((DirectivesListener)listener).exitIdentifier(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DirectivesVisitor ) return ((DirectivesVisitor<? extends T>)visitor).visitIdentifier(this);
			else return visitor.visitChildren(this);
		}
	}

	public final IdentifierContext identifier() throws RecognitionException {
		IdentifierContext _localctx = new IdentifierContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_identifier);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(209);
			match(Identifier);
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

	public static class PropertiesContext extends ParserRuleContext {
		public List<TerminalNode> OBrace() { return getTokens(DirectivesParser.OBrace); }
		public TerminalNode OBrace(int i) {
			return getToken(DirectivesParser.OBrace, i);
		}
		public List<TerminalNode> CBrace() { return getTokens(DirectivesParser.CBrace); }
		public TerminalNode CBrace(int i) {
			return getToken(DirectivesParser.CBrace, i);
		}
		public List<PropertyListContext> propertyList() {
			return getRuleContexts(PropertyListContext.class);
		}
		public PropertyListContext propertyList(int i) {
			return getRuleContext(PropertyListContext.class,i);
		}
		public PropertiesContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_properties; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DirectivesListener ) ((DirectivesListener)listener).enterProperties(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DirectivesListener ) ((DirectivesListener)listener).exitProperties(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DirectivesVisitor ) return ((DirectivesVisitor<? extends T>)visitor).visitProperties(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PropertiesContext properties() throws RecognitionException {
		PropertiesContext _localctx = new PropertiesContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_properties);
		int _la;
		try {
			int _alt;
			setState(265);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,20,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(211);
				match(T__7);
				setState(212);
				match(Colon);
				setState(213);
				match(OBrace);
				setState(215); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(214);
					propertyList();
					}
					}
					setState(217); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( _la==Identifier );
				setState(219);
				match(CBrace);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(221);
				match(T__7);
				setState(222);
				match(Colon);
				setState(223);
				match(OBrace);
				setState(224);
				match(OBrace);
				setState(226); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(225);
					propertyList();
					}
					}
					setState(228); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( _la==Identifier );
				setState(230);
				match(CBrace);
				 notifyErrorListeners("Too many start paranthesis"); 
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(233);
				match(T__7);
				setState(234);
				match(Colon);
				setState(235);
				match(OBrace);
				setState(237); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(236);
					propertyList();
					}
					}
					setState(239); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( _la==Identifier );
				setState(241);
				match(CBrace);
				setState(242);
				match(CBrace);
				 notifyErrorListeners("Too many start paranthesis"); 
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(245);
				match(T__7);
				setState(246);
				match(Colon);
				setState(248); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(247);
					propertyList();
					}
					}
					setState(250); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( _la==Identifier );
				setState(252);
				match(CBrace);
				 notifyErrorListeners("Missing opening brace"); 
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(255);
				match(T__7);
				setState(256);
				match(Colon);
				setState(257);
				match(OBrace);
				setState(259); 
				_errHandler.sync(this);
				_alt = 1;
				do {
					switch (_alt) {
					case 1:
						{
						{
						setState(258);
						propertyList();
						}
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					setState(261); 
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,19,_ctx);
				} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
				 notifyErrorListeners("Missing closing brace"); 
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

	public static class PropertyListContext extends ParserRuleContext {
		public List<PropertyContext> property() {
			return getRuleContexts(PropertyContext.class);
		}
		public PropertyContext property(int i) {
			return getRuleContext(PropertyContext.class,i);
		}
		public PropertyListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_propertyList; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DirectivesListener ) ((DirectivesListener)listener).enterPropertyList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DirectivesListener ) ((DirectivesListener)listener).exitPropertyList(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DirectivesVisitor ) return ((DirectivesVisitor<? extends T>)visitor).visitPropertyList(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PropertyListContext propertyList() throws RecognitionException {
		PropertyListContext _localctx = new PropertyListContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_propertyList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(267);
			property();
			setState(272);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==Comma) {
				{
				{
				setState(268);
				match(Comma);
				setState(269);
				property();
				}
				}
				setState(274);
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

	public static class PropertyContext extends ParserRuleContext {
		public TerminalNode Identifier() { return getToken(DirectivesParser.Identifier, 0); }
		public TextContext text() {
			return getRuleContext(TextContext.class,0);
		}
		public NumberContext number() {
			return getRuleContext(NumberContext.class,0);
		}
		public BoolContext bool() {
			return getRuleContext(BoolContext.class,0);
		}
		public PropertyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_property; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DirectivesListener ) ((DirectivesListener)listener).enterProperty(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DirectivesListener ) ((DirectivesListener)listener).exitProperty(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DirectivesVisitor ) return ((DirectivesVisitor<? extends T>)visitor).visitProperty(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PropertyContext property() throws RecognitionException {
		PropertyContext _localctx = new PropertyContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_property);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(275);
			match(Identifier);
			setState(276);
			match(Assign);
			setState(280);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case String:
				{
				setState(277);
				text();
				}
				break;
			case Number:
				{
				setState(278);
				number();
				}
				break;
			case Bool:
				{
				setState(279);
				bool();
				}
				break;
			default:
				throw new NoViableAltException(this);
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

	public static class NumberRangesContext extends ParserRuleContext {
		public List<NumberRangeContext> numberRange() {
			return getRuleContexts(NumberRangeContext.class);
		}
		public NumberRangeContext numberRange(int i) {
			return getRuleContext(NumberRangeContext.class,i);
		}
		public NumberRangesContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_numberRanges; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DirectivesListener ) ((DirectivesListener)listener).enterNumberRanges(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DirectivesListener ) ((DirectivesListener)listener).exitNumberRanges(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DirectivesVisitor ) return ((DirectivesVisitor<? extends T>)visitor).visitNumberRanges(this);
			else return visitor.visitChildren(this);
		}
	}

	public final NumberRangesContext numberRanges() throws RecognitionException {
		NumberRangesContext _localctx = new NumberRangesContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_numberRanges);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(282);
			numberRange();
			setState(287);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==Comma) {
				{
				{
				setState(283);
				match(Comma);
				setState(284);
				numberRange();
				}
				}
				setState(289);
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

	public static class NumberRangeContext extends ParserRuleContext {
		public List<TerminalNode> Number() { return getTokens(DirectivesParser.Number); }
		public TerminalNode Number(int i) {
			return getToken(DirectivesParser.Number, i);
		}
		public ValueContext value() {
			return getRuleContext(ValueContext.class,0);
		}
		public NumberRangeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_numberRange; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DirectivesListener ) ((DirectivesListener)listener).enterNumberRange(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DirectivesListener ) ((DirectivesListener)listener).exitNumberRange(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DirectivesVisitor ) return ((DirectivesVisitor<? extends T>)visitor).visitNumberRange(this);
			else return visitor.visitChildren(this);
		}
	}

	public final NumberRangeContext numberRange() throws RecognitionException {
		NumberRangeContext _localctx = new NumberRangeContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_numberRange);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(290);
			match(Number);
			setState(291);
			match(Colon);
			setState(292);
			match(Number);
			setState(293);
			match(Assign);
			setState(294);
			value();
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

	public static class ValueContext extends ParserRuleContext {
		public TerminalNode String() { return getToken(DirectivesParser.String, 0); }
		public TerminalNode Number() { return getToken(DirectivesParser.Number, 0); }
		public TerminalNode Bool() { return getToken(DirectivesParser.Bool, 0); }
		public TerminalNode BYTE_SIZE() { return getToken(DirectivesParser.BYTE_SIZE, 0); }
		public TerminalNode TIME_DURATION() { return getToken(DirectivesParser.TIME_DURATION, 0); }
		public ValueContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_value; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DirectivesListener ) ((DirectivesListener)listener).enterValue(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DirectivesListener ) ((DirectivesListener)listener).exitValue(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DirectivesVisitor ) return ((DirectivesVisitor<? extends T>)visitor).visitValue(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ValueContext value() throws RecognitionException {
		ValueContext _localctx = new ValueContext(_ctx, getState());
		enterRule(_localctx, 40, RULE_value);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(296);
			_la = _input.LA(1);
			if ( !(((((_la - 57)) & ~0x3f) == 0 && ((1L << (_la - 57)) & ((1L << (Bool - 57)) | (1L << (Number - 57)) | (1L << (String - 57)) | (1L << (BYTE_SIZE - 57)) | (1L << (TIME_DURATION - 57)))) != 0)) ) {
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

	public static class ByteSizeContext extends ParserRuleContext {
		public TerminalNode BYTE_SIZE() { return getToken(DirectivesParser.BYTE_SIZE, 0); }
		public ByteSizeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_byteSize; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DirectivesListener ) ((DirectivesListener)listener).enterByteSize(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DirectivesListener ) ((DirectivesListener)listener).exitByteSize(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DirectivesVisitor ) return ((DirectivesVisitor<? extends T>)visitor).visitByteSize(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ByteSizeContext byteSize() throws RecognitionException {
		ByteSizeContext _localctx = new ByteSizeContext(_ctx, getState());
		enterRule(_localctx, 42, RULE_byteSize);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(298);
			match(BYTE_SIZE);
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

	public static class TimeDurationContext extends ParserRuleContext {
		public TerminalNode TIME_DURATION() { return getToken(DirectivesParser.TIME_DURATION, 0); }
		public TimeDurationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_timeDuration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DirectivesListener ) ((DirectivesListener)listener).enterTimeDuration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DirectivesListener ) ((DirectivesListener)listener).exitTimeDuration(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DirectivesVisitor ) return ((DirectivesVisitor<? extends T>)visitor).visitTimeDuration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TimeDurationContext timeDuration() throws RecognitionException {
		TimeDurationContext _localctx = new TimeDurationContext(_ctx, getState());
		enterRule(_localctx, 44, RULE_timeDuration);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(300);
			match(TIME_DURATION);
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

	public static class EcommandContext extends ParserRuleContext {
		public TerminalNode Identifier() { return getToken(DirectivesParser.Identifier, 0); }
		public EcommandContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ecommand; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DirectivesListener ) ((DirectivesListener)listener).enterEcommand(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DirectivesListener ) ((DirectivesListener)listener).exitEcommand(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DirectivesVisitor ) return ((DirectivesVisitor<? extends T>)visitor).visitEcommand(this);
			else return visitor.visitChildren(this);
		}
	}

	public final EcommandContext ecommand() throws RecognitionException {
		EcommandContext _localctx = new EcommandContext(_ctx, getState());
		enterRule(_localctx, 46, RULE_ecommand);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(302);
			match(External);
			setState(303);
			match(Identifier);
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

	public static class ConfigContext extends ParserRuleContext {
		public TerminalNode Identifier() { return getToken(DirectivesParser.Identifier, 0); }
		public ConfigContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_config; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DirectivesListener ) ((DirectivesListener)listener).enterConfig(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DirectivesListener ) ((DirectivesListener)listener).exitConfig(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DirectivesVisitor ) return ((DirectivesVisitor<? extends T>)visitor).visitConfig(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ConfigContext config() throws RecognitionException {
		ConfigContext _localctx = new ConfigContext(_ctx, getState());
		enterRule(_localctx, 48, RULE_config);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(305);
			match(Identifier);
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

	public static class ColumnContext extends ParserRuleContext {
		public TerminalNode Column() { return getToken(DirectivesParser.Column, 0); }
		public ColumnContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_column; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DirectivesListener ) ((DirectivesListener)listener).enterColumn(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DirectivesListener ) ((DirectivesListener)listener).exitColumn(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DirectivesVisitor ) return ((DirectivesVisitor<? extends T>)visitor).visitColumn(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ColumnContext column() throws RecognitionException {
		ColumnContext _localctx = new ColumnContext(_ctx, getState());
		enterRule(_localctx, 50, RULE_column);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(307);
			match(Column);
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

	public static class TextContext extends ParserRuleContext {
		public TerminalNode String() { return getToken(DirectivesParser.String, 0); }
		public TextContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_text; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DirectivesListener ) ((DirectivesListener)listener).enterText(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DirectivesListener ) ((DirectivesListener)listener).exitText(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DirectivesVisitor ) return ((DirectivesVisitor<? extends T>)visitor).visitText(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TextContext text() throws RecognitionException {
		TextContext _localctx = new TextContext(_ctx, getState());
		enterRule(_localctx, 52, RULE_text);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(309);
			match(String);
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

	public static class NumberContext extends ParserRuleContext {
		public TerminalNode Number() { return getToken(DirectivesParser.Number, 0); }
		public NumberContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_number; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DirectivesListener ) ((DirectivesListener)listener).enterNumber(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DirectivesListener ) ((DirectivesListener)listener).exitNumber(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DirectivesVisitor ) return ((DirectivesVisitor<? extends T>)visitor).visitNumber(this);
			else return visitor.visitChildren(this);
		}
	}

	public final NumberContext number() throws RecognitionException {
		NumberContext _localctx = new NumberContext(_ctx, getState());
		enterRule(_localctx, 54, RULE_number);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(311);
			match(Number);
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

	public static class BoolContext extends ParserRuleContext {
		public TerminalNode Bool() { return getToken(DirectivesParser.Bool, 0); }
		public BoolContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_bool; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DirectivesListener ) ((DirectivesListener)listener).enterBool(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DirectivesListener ) ((DirectivesListener)listener).exitBool(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DirectivesVisitor ) return ((DirectivesVisitor<? extends T>)visitor).visitBool(this);
			else return visitor.visitChildren(this);
		}
	}

	public final BoolContext bool() throws RecognitionException {
		BoolContext _localctx = new BoolContext(_ctx, getState());
		enterRule(_localctx, 56, RULE_bool);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(313);
			match(Bool);
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

	public static class ConditionContext extends ParserRuleContext {
		public TerminalNode OBrace() { return getToken(DirectivesParser.OBrace, 0); }
		public List<TerminalNode> CBrace() { return getTokens(DirectivesParser.CBrace); }
		public TerminalNode CBrace(int i) {
			return getToken(DirectivesParser.CBrace, i);
		}
		public List<ConditionContext> condition() {
			return getRuleContexts(ConditionContext.class);
		}
		public ConditionContext condition(int i) {
			return getRuleContext(ConditionContext.class,i);
		}
		public ConditionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_condition; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DirectivesListener ) ((DirectivesListener)listener).enterCondition(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DirectivesListener ) ((DirectivesListener)listener).exitCondition(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DirectivesVisitor ) return ((DirectivesVisitor<? extends T>)visitor).visitCondition(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ConditionContext condition() throws RecognitionException {
		ConditionContext _localctx = new ConditionContext(_ctx, getState());
		enterRule(_localctx, 58, RULE_condition);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(315);
			match(OBrace);
			setState(320);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << T__1) | (1L << T__2) | (1L << T__3) | (1L << T__4) | (1L << T__5) | (1L << T__6) | (1L << T__7) | (1L << AGGREGATE_STATS) | (1L << OBrace) | (1L << SColon) | (1L << Or) | (1L << And) | (1L << Equals) | (1L << NEquals) | (1L << GTEquals) | (1L << LTEquals) | (1L << Match) | (1L << NotMatch) | (1L << QuestionColon) | (1L << StartsWith) | (1L << NotStartsWith) | (1L << EndsWith) | (1L << NotEndsWith) | (1L << PlusEqual) | (1L << SubEqual) | (1L << MulEqual) | (1L << DivEqual) | (1L << PerEqual) | (1L << AndEqual) | (1L << OrEqual) | (1L << XOREqual) | (1L << Pow) | (1L << External) | (1L << GT) | (1L << LT) | (1L << Add) | (1L << Subtract) | (1L << Multiply) | (1L << Divide) | (1L << Modulus) | (1L << OBracket) | (1L << CBracket) | (1L << OParen) | (1L << CParen) | (1L << Assign) | (1L << Comma) | (1L << QMark) | (1L << Colon) | (1L << Dot) | (1L << At) | (1L << Pipe) | (1L << BackSlash) | (1L << Dollar) | (1L << Tilde) | (1L << Bool) | (1L << Number) | (1L << Identifier) | (1L << Macro) | (1L << Column) | (1L << String) | (1L << BYTE_SIZE))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (TIME_DURATION - 64)) | (1L << (EscapeSequence - 64)) | (1L << (Comment - 64)) | (1L << (Space - 64)))) != 0)) {
				{
				setState(318);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,24,_ctx) ) {
				case 1:
					{
					setState(316);
					_la = _input.LA(1);
					if ( _la <= 0 || (_la==CBrace) ) {
					_errHandler.recoverInline(this);
					}
					else {
						if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
						_errHandler.reportMatch(this);
						consume();
					}
					}
					break;
				case 2:
					{
					setState(317);
					condition();
					}
					break;
				}
				}
				setState(322);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(323);
			match(CBrace);
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

	public static class CommandContext extends ParserRuleContext {
		public TerminalNode Identifier() { return getToken(DirectivesParser.Identifier, 0); }
		public CommandContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_command; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DirectivesListener ) ((DirectivesListener)listener).enterCommand(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DirectivesListener ) ((DirectivesListener)listener).exitCommand(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DirectivesVisitor ) return ((DirectivesVisitor<? extends T>)visitor).visitCommand(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CommandContext command() throws RecognitionException {
		CommandContext _localctx = new CommandContext(_ctx, getState());
		enterRule(_localctx, 60, RULE_command);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(325);
			match(Identifier);
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

	public static class ColListContext extends ParserRuleContext {
		public List<TerminalNode> Column() { return getTokens(DirectivesParser.Column); }
		public TerminalNode Column(int i) {
			return getToken(DirectivesParser.Column, i);
		}
		public ColListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_colList; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DirectivesListener ) ((DirectivesListener)listener).enterColList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DirectivesListener ) ((DirectivesListener)listener).exitColList(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DirectivesVisitor ) return ((DirectivesVisitor<? extends T>)visitor).visitColList(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ColListContext colList() throws RecognitionException {
		ColListContext _localctx = new ColListContext(_ctx, getState());
		enterRule(_localctx, 62, RULE_colList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(327);
			match(Column);
			setState(330); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(328);
				match(Comma);
				setState(329);
				match(Column);
				}
				}
				setState(332); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==Comma );
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

	public static class NumberListContext extends ParserRuleContext {
		public List<TerminalNode> Number() { return getTokens(DirectivesParser.Number); }
		public TerminalNode Number(int i) {
			return getToken(DirectivesParser.Number, i);
		}
		public NumberListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_numberList; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DirectivesListener ) ((DirectivesListener)listener).enterNumberList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DirectivesListener ) ((DirectivesListener)listener).exitNumberList(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DirectivesVisitor ) return ((DirectivesVisitor<? extends T>)visitor).visitNumberList(this);
			else return visitor.visitChildren(this);
		}
	}

	public final NumberListContext numberList() throws RecognitionException {
		NumberListContext _localctx = new NumberListContext(_ctx, getState());
		enterRule(_localctx, 64, RULE_numberList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(334);
			match(Number);
			setState(337); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(335);
				match(Comma);
				setState(336);
				match(Number);
				}
				}
				setState(339); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==Comma );
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

	public static class BoolListContext extends ParserRuleContext {
		public List<TerminalNode> Bool() { return getTokens(DirectivesParser.Bool); }
		public TerminalNode Bool(int i) {
			return getToken(DirectivesParser.Bool, i);
		}
		public BoolListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_boolList; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DirectivesListener ) ((DirectivesListener)listener).enterBoolList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DirectivesListener ) ((DirectivesListener)listener).exitBoolList(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DirectivesVisitor ) return ((DirectivesVisitor<? extends T>)visitor).visitBoolList(this);
			else return visitor.visitChildren(this);
		}
	}

	public final BoolListContext boolList() throws RecognitionException {
		BoolListContext _localctx = new BoolListContext(_ctx, getState());
		enterRule(_localctx, 66, RULE_boolList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(341);
			match(Bool);
			setState(344); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(342);
				match(Comma);
				setState(343);
				match(Bool);
				}
				}
				setState(346); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==Comma );
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

	public static class StringListContext extends ParserRuleContext {
		public List<TerminalNode> String() { return getTokens(DirectivesParser.String); }
		public TerminalNode String(int i) {
			return getToken(DirectivesParser.String, i);
		}
		public StringListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_stringList; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DirectivesListener ) ((DirectivesListener)listener).enterStringList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DirectivesListener ) ((DirectivesListener)listener).exitStringList(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DirectivesVisitor ) return ((DirectivesVisitor<? extends T>)visitor).visitStringList(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StringListContext stringList() throws RecognitionException {
		StringListContext _localctx = new StringListContext(_ctx, getState());
		enterRule(_localctx, 68, RULE_stringList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(348);
			match(String);
			setState(351); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(349);
				match(Comma);
				setState(350);
				match(String);
				}
				}
				setState(353); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==Comma );
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

	public static class IdentifierListContext extends ParserRuleContext {
		public List<TerminalNode> Identifier() { return getTokens(DirectivesParser.Identifier); }
		public TerminalNode Identifier(int i) {
			return getToken(DirectivesParser.Identifier, i);
		}
		public IdentifierListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_identifierList; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DirectivesListener ) ((DirectivesListener)listener).enterIdentifierList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DirectivesListener ) ((DirectivesListener)listener).exitIdentifierList(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DirectivesVisitor ) return ((DirectivesVisitor<? extends T>)visitor).visitIdentifierList(this);
			else return visitor.visitChildren(this);
		}
	}

	public final IdentifierListContext identifierList() throws RecognitionException {
		IdentifierListContext _localctx = new IdentifierListContext(_ctx, getState());
		enterRule(_localctx, 70, RULE_identifierList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(355);
			match(Identifier);
			setState(360);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==Comma) {
				{
				{
				setState(356);
				match(Comma);
				setState(357);
				match(Identifier);
				}
				}
				setState(362);
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

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3E\u016e\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\3\2\3\2\3\2\3\3\3\3\3\3\3\3\3\3\3\3\3\3"+
		"\3\3\3\3\7\3W\n\3\f\3\16\3Z\13\3\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3"+
		"\4\3\4\3\4\3\4\3\4\3\4\3\4\7\4l\n\4\f\4\16\4o\13\4\3\4\3\4\3\4\3\4\3\4"+
		"\3\4\5\4w\n\4\3\4\5\4z\n\4\5\4|\n\4\3\5\3\5\7\5\u0080\n\5\f\5\16\5\u0083"+
		"\13\5\3\5\5\5\u0086\n\5\3\5\3\5\3\6\3\6\3\6\3\6\3\6\3\7\3\7\3\7\3\7\3"+
		"\7\3\7\3\7\3\b\3\b\3\b\3\b\3\b\3\t\3\t\3\t\7\t\u009e\n\t\f\t\16\t\u00a1"+
		"\13\t\3\t\3\t\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n"+
		"\3\13\3\13\3\13\3\13\3\13\7\13\u00b8\n\13\f\13\16\13\u00bb\13\13\3\13"+
		"\3\13\3\f\3\f\3\f\5\f\u00c2\n\f\3\r\3\r\3\r\3\16\3\16\3\16\3\17\3\17\7"+
		"\17\u00cc\n\17\f\17\16\17\u00cf\13\17\3\17\3\17\3\17\3\20\3\20\3\21\3"+
		"\21\3\21\3\21\6\21\u00da\n\21\r\21\16\21\u00db\3\21\3\21\3\21\3\21\3\21"+
		"\3\21\3\21\6\21\u00e5\n\21\r\21\16\21\u00e6\3\21\3\21\3\21\3\21\3\21\3"+
		"\21\3\21\6\21\u00f0\n\21\r\21\16\21\u00f1\3\21\3\21\3\21\3\21\3\21\3\21"+
		"\3\21\6\21\u00fb\n\21\r\21\16\21\u00fc\3\21\3\21\3\21\3\21\3\21\3\21\3"+
		"\21\6\21\u0106\n\21\r\21\16\21\u0107\3\21\3\21\5\21\u010c\n\21\3\22\3"+
		"\22\3\22\7\22\u0111\n\22\f\22\16\22\u0114\13\22\3\23\3\23\3\23\3\23\3"+
		"\23\5\23\u011b\n\23\3\24\3\24\3\24\7\24\u0120\n\24\f\24\16\24\u0123\13"+
		"\24\3\25\3\25\3\25\3\25\3\25\3\25\3\26\3\26\3\27\3\27\3\30\3\30\3\31\3"+
		"\31\3\31\3\32\3\32\3\33\3\33\3\34\3\34\3\35\3\35\3\36\3\36\3\37\3\37\3"+
		"\37\7\37\u0141\n\37\f\37\16\37\u0144\13\37\3\37\3\37\3 \3 \3!\3!\3!\6"+
		"!\u014d\n!\r!\16!\u014e\3\"\3\"\3\"\6\"\u0154\n\"\r\"\16\"\u0155\3#\3"+
		"#\3#\6#\u015b\n#\r#\16#\u015c\3$\3$\3$\6$\u0162\n$\r$\16$\u0163\3%\3%"+
		"\3%\7%\u0169\n%\f%\16%\u016c\13%\3%\4m\u00b9\2&\2\4\6\b\n\f\16\20\22\24"+
		"\26\30\32\34\36 \"$&(*,.\60\62\64\668:<>@BDFH\2\6\3\2//\3\2\f\f\4\2;<"+
		"@B\3\2\r\r\2\u017d\2J\3\2\2\2\4X\3\2\2\2\6{\3\2\2\2\b}\3\2\2\2\n\u0089"+
		"\3\2\2\2\f\u008e\3\2\2\2\16\u0095\3\2\2\2\20\u009a\3\2\2\2\22\u00a4\3"+
		"\2\2\2\24\u00b2\3\2\2\2\26\u00be\3\2\2\2\30\u00c3\3\2\2\2\32\u00c6\3\2"+
		"\2\2\34\u00c9\3\2\2\2\36\u00d3\3\2\2\2 \u010b\3\2\2\2\"\u010d\3\2\2\2"+
		"$\u0115\3\2\2\2&\u011c\3\2\2\2(\u0124\3\2\2\2*\u012a\3\2\2\2,\u012c\3"+
		"\2\2\2.\u012e\3\2\2\2\60\u0130\3\2\2\2\62\u0133\3\2\2\2\64\u0135\3\2\2"+
		"\2\66\u0137\3\2\2\28\u0139\3\2\2\2:\u013b\3\2\2\2<\u013d\3\2\2\2>\u0147"+
		"\3\2\2\2@\u0149\3\2\2\2B\u0150\3\2\2\2D\u0157\3\2\2\2F\u015e\3\2\2\2H"+
		"\u0165\3\2\2\2JK\5\4\3\2KL\7\2\2\3L\3\3\2\2\2MW\7D\2\2NW\5\24\13\2OP\5"+
		"\6\4\2PQ\7\16\2\2QW\3\2\2\2RS\5\26\f\2ST\7\16\2\2TW\3\2\2\2UW\5\b\5\2"+
		"VM\3\2\2\2VN\3\2\2\2VO\3\2\2\2VR\3\2\2\2VU\3\2\2\2WZ\3\2\2\2XV\3\2\2\2"+
		"XY\3\2\2\2Y\5\3\2\2\2ZX\3\2\2\2[m\5> \2\\l\5\34\17\2]l\5\36\20\2^l\5\24"+
		"\13\2_l\5\66\34\2`l\58\35\2al\5:\36\2bl\5,\27\2cl\5.\30\2dl\5\64\33\2"+
		"el\5@!\2fl\5B\"\2gl\5D#\2hl\5F$\2il\5&\24\2jl\5 \21\2k\\\3\2\2\2k]\3\2"+
		"\2\2k^\3\2\2\2k_\3\2\2\2k`\3\2\2\2ka\3\2\2\2kb\3\2\2\2kc\3\2\2\2kd\3\2"+
		"\2\2ke\3\2\2\2kf\3\2\2\2kg\3\2\2\2kh\3\2\2\2ki\3\2\2\2kj\3\2\2\2lo\3\2"+
		"\2\2mn\3\2\2\2mk\3\2\2\2n|\3\2\2\2om\3\2\2\2pq\7\13\2\2qr\5\64\33\2rs"+
		"\5\64\33\2st\5\64\33\2tv\5\64\33\2uw\5\66\34\2vu\3\2\2\2vw\3\2\2\2wy\3"+
		"\2\2\2xz\5\66\34\2yx\3\2\2\2yz\3\2\2\2z|\3\2\2\2{[\3\2\2\2{p\3\2\2\2|"+
		"\7\3\2\2\2}\u0081\5\n\6\2~\u0080\5\f\7\2\177~\3\2\2\2\u0080\u0083\3\2"+
		"\2\2\u0081\177\3\2\2\2\u0081\u0082\3\2\2\2\u0082\u0085\3\2\2\2\u0083\u0081"+
		"\3\2\2\2\u0084\u0086\5\16\b\2\u0085\u0084\3\2\2\2\u0085\u0086\3\2\2\2"+
		"\u0086\u0087\3\2\2\2\u0087\u0088\7\r\2\2\u0088\t\3\2\2\2\u0089\u008a\7"+
		"\3\2\2\u008a\u008b\5\20\t\2\u008b\u008c\7\f\2\2\u008c\u008d\5\4\3\2\u008d"+
		"\13\3\2\2\2\u008e\u008f\7\r\2\2\u008f\u0090\7\4\2\2\u0090\u0091\7\3\2"+
		"\2\u0091\u0092\5\20\t\2\u0092\u0093\7\f\2\2\u0093\u0094\5\4\3\2\u0094"+
		"\r\3\2\2\2\u0095\u0096\7\r\2\2\u0096\u0097\7\4\2\2\u0097\u0098\7\f\2\2"+
		"\u0098\u0099\5\4\3\2\u0099\17\3\2\2\2\u009a\u009f\7/\2\2\u009b\u009e\n"+
		"\2\2\2\u009c\u009e\5\20\t\2\u009d\u009b\3\2\2\2\u009d\u009c\3\2\2\2\u009e"+
		"\u00a1\3\2\2\2\u009f\u009d\3\2\2\2\u009f\u00a0\3\2\2\2\u00a0\u00a2\3\2"+
		"\2\2\u00a1\u009f\3\2\2\2\u00a2\u00a3\7\60\2\2\u00a3\21\3\2\2\2\u00a4\u00a5"+
		"\7\5\2\2\u00a5\u00a6\7/\2\2\u00a6\u00a7\7=\2\2\u00a7\u00a8\7\61\2\2\u00a8"+
		"\u00a9\5\20\t\2\u00a9\u00aa\7\16\2\2\u00aa\u00ab\5\20\t\2\u00ab\u00ac"+
		"\7\16\2\2\u00ac\u00ad\5\20\t\2\u00ad\u00ae\7\60\2\2\u00ae\u00af\7\f\2"+
		"\2\u00af\u00b0\5\4\3\2\u00b0\u00b1\7\r\2\2\u00b1\23\3\2\2\2\u00b2\u00b3"+
		"\79\2\2\u00b3\u00b9\7\f\2\2\u00b4\u00b8\n\3\2\2\u00b5\u00b8\5\24\13\2"+
		"\u00b6\u00b8\7>\2\2\u00b7\u00b4\3\2\2\2\u00b7\u00b5\3\2\2\2\u00b7\u00b6"+
		"\3\2\2\2\u00b8\u00bb\3\2\2\2\u00b9\u00ba\3\2\2\2\u00b9\u00b7\3\2\2\2\u00ba"+
		"\u00bc\3\2\2\2\u00bb\u00b9\3\2\2\2\u00bc\u00bd\7\r\2\2\u00bd\25\3\2\2"+
		"\2\u00be\u00c1\7\6\2\2\u00bf\u00c2\5\30\r\2\u00c0\u00c2\5\32\16\2\u00c1"+
		"\u00bf\3\2\2\2\u00c1\u00c0\3\2\2\2\u00c2\27\3\2\2\2\u00c3\u00c4\7\7\2"+
		"\2\u00c4\u00c5\5H%\2\u00c5\31\3\2\2\2\u00c6\u00c7\7\b\2\2\u00c7\u00c8"+
		"\7<\2\2\u00c8\33\3\2\2\2\u00c9\u00cd\7\t\2\2\u00ca\u00cc\7E\2\2\u00cb"+
		"\u00ca\3\2\2\2\u00cc\u00cf\3\2\2\2\u00cd\u00cb\3\2\2\2\u00cd\u00ce\3\2"+
		"\2\2\u00ce\u00d0\3\2\2\2\u00cf\u00cd\3\2\2\2\u00d0\u00d1\7\64\2\2\u00d1"+
		"\u00d2\5<\37\2\u00d2\35\3\2\2\2\u00d3\u00d4\7=\2\2\u00d4\37\3\2\2\2\u00d5"+
		"\u00d6\7\n\2\2\u00d6\u00d7\7\64\2\2\u00d7\u00d9\7\f\2\2\u00d8\u00da\5"+
		"\"\22\2\u00d9\u00d8\3\2\2\2\u00da\u00db\3\2\2\2\u00db\u00d9\3\2\2\2\u00db"+
		"\u00dc\3\2\2\2\u00dc\u00dd\3\2\2\2\u00dd\u00de\7\r\2\2\u00de\u010c\3\2"+
		"\2\2\u00df\u00e0\7\n\2\2\u00e0\u00e1\7\64\2\2\u00e1\u00e2\7\f\2\2\u00e2"+
		"\u00e4\7\f\2\2\u00e3\u00e5\5\"\22\2\u00e4\u00e3\3\2\2\2\u00e5\u00e6\3"+
		"\2\2\2\u00e6\u00e4\3\2\2\2\u00e6\u00e7\3\2\2\2\u00e7\u00e8\3\2\2\2\u00e8"+
		"\u00e9\7\r\2\2\u00e9\u00ea\b\21\1\2\u00ea\u010c\3\2\2\2\u00eb\u00ec\7"+
		"\n\2\2\u00ec\u00ed\7\64\2\2\u00ed\u00ef\7\f\2\2\u00ee\u00f0\5\"\22\2\u00ef"+
		"\u00ee\3\2\2\2\u00f0\u00f1\3\2\2\2\u00f1\u00ef\3\2\2\2\u00f1\u00f2\3\2"+
		"\2\2\u00f2\u00f3\3\2\2\2\u00f3\u00f4\7\r\2\2\u00f4\u00f5\7\r\2\2\u00f5"+
		"\u00f6\b\21\1\2\u00f6\u010c\3\2\2\2\u00f7\u00f8\7\n\2\2\u00f8\u00fa\7"+
		"\64\2\2\u00f9\u00fb\5\"\22\2\u00fa\u00f9\3\2\2\2\u00fb\u00fc\3\2\2\2\u00fc"+
		"\u00fa\3\2\2\2\u00fc\u00fd\3\2\2\2\u00fd\u00fe\3\2\2\2\u00fe\u00ff\7\r"+
		"\2\2\u00ff\u0100\b\21\1\2\u0100\u010c\3\2\2\2\u0101\u0102\7\n\2\2\u0102"+
		"\u0103\7\64\2\2\u0103\u0105\7\f\2\2\u0104\u0106\5\"\22\2\u0105\u0104\3"+
		"\2\2\2\u0106\u0107\3\2\2\2\u0107\u0105\3\2\2\2\u0107\u0108\3\2\2\2\u0108"+
		"\u0109\3\2\2\2\u0109\u010a\b\21\1\2\u010a\u010c\3\2\2\2\u010b\u00d5\3"+
		"\2\2\2\u010b\u00df\3\2\2\2\u010b\u00eb\3\2\2\2\u010b\u00f7\3\2\2\2\u010b"+
		"\u0101\3\2\2\2\u010c!\3\2\2\2\u010d\u0112\5$\23\2\u010e\u010f\7\62\2\2"+
		"\u010f\u0111\5$\23\2\u0110\u010e\3\2\2\2\u0111\u0114\3\2\2\2\u0112\u0110"+
		"\3\2\2\2\u0112\u0113\3\2\2\2\u0113#\3\2\2\2\u0114\u0112\3\2\2\2\u0115"+
		"\u0116\7=\2\2\u0116\u011a\7\61\2\2\u0117\u011b\5\66\34\2\u0118\u011b\5"+
		"8\35\2\u0119\u011b\5:\36\2\u011a\u0117\3\2\2\2\u011a\u0118\3\2\2\2\u011a"+
		"\u0119\3\2\2\2\u011b%\3\2\2\2\u011c\u0121\5(\25\2\u011d\u011e\7\62\2\2"+
		"\u011e\u0120\5(\25\2\u011f\u011d\3\2\2\2\u0120\u0123\3\2\2\2\u0121\u011f"+
		"\3\2\2\2\u0121\u0122\3\2\2\2\u0122\'\3\2\2\2\u0123\u0121\3\2\2\2\u0124"+
		"\u0125\7<\2\2\u0125\u0126\7\64\2\2\u0126\u0127\7<\2\2\u0127\u0128\7\61"+
		"\2\2\u0128\u0129\5*\26\2\u0129)\3\2\2\2\u012a\u012b\t\4\2\2\u012b+\3\2"+
		"\2\2\u012c\u012d\7A\2\2\u012d-\3\2\2\2\u012e\u012f\7B\2\2\u012f/\3\2\2"+
		"\2\u0130\u0131\7%\2\2\u0131\u0132\7=\2\2\u0132\61\3\2\2\2\u0133\u0134"+
		"\7=\2\2\u0134\63\3\2\2\2\u0135\u0136\7?\2\2\u0136\65\3\2\2\2\u0137\u0138"+
		"\7@\2\2\u0138\67\3\2\2\2\u0139\u013a\7<\2\2\u013a9\3\2\2\2\u013b\u013c"+
		"\7;\2\2\u013c;\3\2\2\2\u013d\u0142\7\f\2\2\u013e\u0141\n\5\2\2\u013f\u0141"+
		"\5<\37\2\u0140\u013e\3\2\2\2\u0140\u013f\3\2\2\2\u0141\u0144\3\2\2\2\u0142"+
		"\u0140\3\2\2\2\u0142\u0143\3\2\2\2\u0143\u0145\3\2\2\2\u0144\u0142\3\2"+
		"\2\2\u0145\u0146\7\r\2\2\u0146=\3\2\2\2\u0147\u0148\7=\2\2\u0148?\3\2"+
		"\2\2\u0149\u014c\7?\2\2\u014a\u014b\7\62\2\2\u014b\u014d\7?\2\2\u014c"+
		"\u014a\3\2\2\2\u014d\u014e\3\2\2\2\u014e\u014c\3\2\2\2\u014e\u014f\3\2"+
		"\2\2\u014fA\3\2\2\2\u0150\u0153\7<\2\2\u0151\u0152\7\62\2\2\u0152\u0154"+
		"\7<\2\2\u0153\u0151\3\2\2\2\u0154\u0155\3\2\2\2\u0155\u0153\3\2\2\2\u0155"+
		"\u0156\3\2\2\2\u0156C\3\2\2\2\u0157\u015a\7;\2\2\u0158\u0159\7\62\2\2"+
		"\u0159\u015b\7;\2\2\u015a\u0158\3\2\2\2\u015b\u015c\3\2\2\2\u015c\u015a"+
		"\3\2\2\2\u015c\u015d\3\2\2\2\u015dE\3\2\2\2\u015e\u0161\7@\2\2\u015f\u0160"+
		"\7\62\2\2\u0160\u0162\7@\2\2\u0161\u015f\3\2\2\2\u0162\u0163\3\2\2\2\u0163"+
		"\u0161\3\2\2\2\u0163\u0164\3\2\2\2\u0164G\3\2\2\2\u0165\u016a\7=\2\2\u0166"+
		"\u0167\7\62\2\2\u0167\u0169\7=\2\2\u0168\u0166\3\2\2\2\u0169\u016c\3\2"+
		"\2\2\u016a\u0168\3\2\2\2\u016a\u016b\3\2\2\2\u016bI\3\2\2\2\u016c\u016a"+
		"\3\2\2\2!VXkmvy{\u0081\u0085\u009d\u009f\u00b7\u00b9\u00c1\u00cd\u00db"+
		"\u00e6\u00f1\u00fc\u0107\u010b\u0112\u011a\u0121\u0140\u0142\u014e\u0155"+
		"\u015c\u0163\u016a";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}