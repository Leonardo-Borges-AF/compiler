// Generated from c:/Users/leobo/OneDrive/Área de Trabalho/antlr-compiler/Lang.g4 by ANTLR 4.13.1
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast", "CheckReturnValue"})
public class LangParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.13.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, OE=6, CE=7, OB=8, CB=9, AT=10, 
		SEP=11, PLUS=12, ATRIB_PLUS=13, ATRIB_MINUS=14, ATRIB_MULT=15, MINUS=16, 
		MULT=17, DIV=18, AND=19, OR=20, NOT=21, EQ=22, LT=23, GT=24, LE=25, GE=26, 
		NE=27, BOOL_TRUE=28, BOOL_FALSE=29, IF=30, WHILE=31, FOR=32, FUNCTION=33, 
		RETURN=34, THEN=35, ELSE=36, WRITE=37, READ=38, INT=39, DOUBLE=40, STRING=41, 
		BOOLEAN=42, ARRAY=43, ARRAY_INT=44, ARRAY_DOUBLE=45, ARRAY_STRING=46, 
		STR=47, EOL=48, NUM=49, DECIM=50, VAR=51, POSITION=52, COMMENT_LINE=53, 
		COMMENT_BLOCK=54, WS=55;
	public static final int
		RULE_prog = 0, RULE_functions = 1, RULE_function = 2, RULE_fnBlock = 3, 
		RULE_fnBody = 4, RULE_params = 5, RULE_line = 6, RULE_funcInvoc = 7, RULE_stmt = 8, 
		RULE_input = 9, RULE_output = 10, RULE_ifst = 11, RULE_ternary = 12, RULE_whilest = 13, 
		RULE_forst = 14, RULE_array = 15, RULE_block = 16, RULE_cond = 17, RULE_atrib = 18, 
		RULE_expr = 19, RULE_term = 20, RULE_factor_array_number = 21, RULE_factor_array_string = 22, 
		RULE_factor = 23;
	private static String[] makeRuleNames() {
		return new String[] {
			"prog", "functions", "function", "fnBlock", "fnBody", "params", "line", 
			"funcInvoc", "stmt", "input", "output", "ifst", "ternary", "whilest", 
			"forst", "array", "block", "cond", "atrib", "expr", "term", "factor_array_number", 
			"factor_array_string", "factor"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'f'", "'?'", "':'", "'['", "']'", "'('", "')'", "'{'", "'}'", 
			"'='", "','", "'+'", "'+='", "'-='", "'*='", "'-'", "'*'", "'/'", "'&&'", 
			"'||'", "'!'", "'=='", "'<'", "'>'", "'<='", "'>='", "'!='", null, null, 
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, "';'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, null, null, "OE", "CE", "OB", "CB", "AT", "SEP", 
			"PLUS", "ATRIB_PLUS", "ATRIB_MINUS", "ATRIB_MULT", "MINUS", "MULT", "DIV", 
			"AND", "OR", "NOT", "EQ", "LT", "GT", "LE", "GE", "NE", "BOOL_TRUE", 
			"BOOL_FALSE", "IF", "WHILE", "FOR", "FUNCTION", "RETURN", "THEN", "ELSE", 
			"WRITE", "READ", "INT", "DOUBLE", "STRING", "BOOLEAN", "ARRAY", "ARRAY_INT", 
			"ARRAY_DOUBLE", "ARRAY_STRING", "STR", "EOL", "NUM", "DECIM", "VAR", 
			"POSITION", "COMMENT_LINE", "COMMENT_BLOCK", "WS"
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
	public String getGrammarFileName() { return "Lang.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public LangParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ProgContext extends ParserRuleContext {
		public ProgContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_prog; }
	 
		public ProgContext() { }
		public void copyFrom(ProgContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ProgLineContext extends ProgContext {
		public FunctionsContext functions() {
			return getRuleContext(FunctionsContext.class,0);
		}
		public List<LineContext> line() {
			return getRuleContexts(LineContext.class);
		}
		public LineContext line(int i) {
			return getRuleContext(LineContext.class,i);
		}
		public ProgLineContext(ProgContext ctx) { copyFrom(ctx); }
	}

	public final ProgContext prog() throws RecognitionException {
		ProgContext _localctx = new ProgContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_prog);
		int _la;
		try {
			_localctx = new ProgLineContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(48);
			functions();
			setState(50); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(49);
				line();
				}
				}
				setState(52); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & 31261185485570112L) != 0) );
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
	public static class FunctionsContext extends ParserRuleContext {
		public FunctionContext function() {
			return getRuleContext(FunctionContext.class,0);
		}
		public FunctionsContext functions() {
			return getRuleContext(FunctionsContext.class,0);
		}
		public FunctionsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_functions; }
	}

	public final FunctionsContext functions() throws RecognitionException {
		FunctionsContext _localctx = new FunctionsContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_functions);
		try {
			setState(58);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case FUNCTION:
				enterOuterAlt(_localctx, 1);
				{
				setState(54);
				function();
				setState(55);
				functions();
				}
				break;
			case OE:
			case NOT:
			case BOOL_TRUE:
			case BOOL_FALSE:
			case IF:
			case WHILE:
			case FOR:
			case WRITE:
			case READ:
			case INT:
			case DOUBLE:
			case STRING:
			case BOOLEAN:
			case ARRAY:
			case EOL:
			case NUM:
			case DECIM:
			case VAR:
			case COMMENT_LINE:
			case COMMENT_BLOCK:
				enterOuterAlt(_localctx, 2);
				{
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
	public static class FunctionContext extends ParserRuleContext {
		public TerminalNode FUNCTION() { return getToken(LangParser.FUNCTION, 0); }
		public TerminalNode VAR() { return getToken(LangParser.VAR, 0); }
		public TerminalNode OE() { return getToken(LangParser.OE, 0); }
		public ParamsContext params() {
			return getRuleContext(ParamsContext.class,0);
		}
		public TerminalNode CE() { return getToken(LangParser.CE, 0); }
		public FnBlockContext fnBlock() {
			return getRuleContext(FnBlockContext.class,0);
		}
		public FunctionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_function; }
	}

	public final FunctionContext function() throws RecognitionException {
		FunctionContext _localctx = new FunctionContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_function);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(60);
			match(FUNCTION);
			setState(61);
			match(VAR);
			setState(62);
			match(OE);
			setState(63);
			params();
			setState(64);
			match(CE);
			setState(65);
			fnBlock();
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
	public static class FnBlockContext extends ParserRuleContext {
		public FnBlockContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_fnBlock; }
	 
		public FnBlockContext() { }
		public void copyFrom(FnBlockContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class FnBlockLineContext extends FnBlockContext {
		public TerminalNode OB() { return getToken(LangParser.OB, 0); }
		public FnBodyContext fnBody() {
			return getRuleContext(FnBodyContext.class,0);
		}
		public TerminalNode CB() { return getToken(LangParser.CB, 0); }
		public FnBlockLineContext(FnBlockContext ctx) { copyFrom(ctx); }
	}

	public final FnBlockContext fnBlock() throws RecognitionException {
		FnBlockContext _localctx = new FnBlockContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_fnBlock);
		try {
			_localctx = new FnBlockLineContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(67);
			match(OB);
			setState(68);
			fnBody();
			setState(69);
			match(CB);
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
	public static class FnBodyContext extends ParserRuleContext {
		public FnBodyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_fnBody; }
	 
		public FnBodyContext() { }
		public void copyFrom(FnBodyContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class FnReturnLineContext extends FnBodyContext {
		public TerminalNode RETURN() { return getToken(LangParser.RETURN, 0); }
		public TerminalNode EOL() { return getToken(LangParser.EOL, 0); }
		public FnReturnLineContext(FnBodyContext ctx) { copyFrom(ctx); }
	}
	@SuppressWarnings("CheckReturnValue")
	public static class FnBodyLineContext extends FnBodyContext {
		public LineContext line() {
			return getRuleContext(LineContext.class,0);
		}
		public FnBodyLineContext(FnBodyContext ctx) { copyFrom(ctx); }
	}
	@SuppressWarnings("CheckReturnValue")
	public static class FnReturnExprLineContext extends FnBodyContext {
		public TerminalNode RETURN() { return getToken(LangParser.RETURN, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TerminalNode EOL() { return getToken(LangParser.EOL, 0); }
		public FnReturnExprLineContext(FnBodyContext ctx) { copyFrom(ctx); }
	}
	@SuppressWarnings("CheckReturnValue")
	public static class FnBodyLineMoreContext extends FnBodyContext {
		public LineContext line() {
			return getRuleContext(LineContext.class,0);
		}
		public FnBodyContext fnBody() {
			return getRuleContext(FnBodyContext.class,0);
		}
		public FnBodyLineMoreContext(FnBodyContext ctx) { copyFrom(ctx); }
	}

	public final FnBodyContext fnBody() throws RecognitionException {
		FnBodyContext _localctx = new FnBodyContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_fnBody);
		try {
			setState(81);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,2,_ctx) ) {
			case 1:
				_localctx = new FnBodyLineContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(71);
				line();
				}
				break;
			case 2:
				_localctx = new FnBodyLineMoreContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(72);
				line();
				setState(73);
				fnBody();
				}
				break;
			case 3:
				_localctx = new FnReturnExprLineContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(75);
				match(RETURN);
				setState(76);
				expr();
				setState(77);
				match(EOL);
				}
				break;
			case 4:
				_localctx = new FnReturnLineContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(79);
				match(RETURN);
				setState(80);
				match(EOL);
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
	public static class ParamsContext extends ParserRuleContext {
		public List<TerminalNode> VAR() { return getTokens(LangParser.VAR); }
		public TerminalNode VAR(int i) {
			return getToken(LangParser.VAR, i);
		}
		public List<TerminalNode> SEP() { return getTokens(LangParser.SEP); }
		public TerminalNode SEP(int i) {
			return getToken(LangParser.SEP, i);
		}
		public ParamsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_params; }
	}

	public final ParamsContext params() throws RecognitionException {
		ParamsContext _localctx = new ParamsContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_params);
		int _la;
		try {
			setState(92);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case VAR:
				enterOuterAlt(_localctx, 1);
				{
				setState(83);
				match(VAR);
				setState(88);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==SEP) {
					{
					{
					setState(84);
					match(SEP);
					setState(85);
					match(VAR);
					}
					}
					setState(90);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				break;
			case CE:
				enterOuterAlt(_localctx, 2);
				{
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
	public static class LineContext extends ParserRuleContext {
		public LineContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_line; }
	 
		public LineContext() { }
		public void copyFrom(LineContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class LineWhileContext extends LineContext {
		public WhilestContext whilest() {
			return getRuleContext(WhilestContext.class,0);
		}
		public LineWhileContext(LineContext ctx) { copyFrom(ctx); }
	}
	@SuppressWarnings("CheckReturnValue")
	public static class LineEOLContext extends LineContext {
		public TerminalNode EOL() { return getToken(LangParser.EOL, 0); }
		public LineEOLContext(LineContext ctx) { copyFrom(ctx); }
	}
	@SuppressWarnings("CheckReturnValue")
	public static class LineStmtContext extends LineContext {
		public StmtContext stmt() {
			return getRuleContext(StmtContext.class,0);
		}
		public TerminalNode EOL() { return getToken(LangParser.EOL, 0); }
		public LineStmtContext(LineContext ctx) { copyFrom(ctx); }
	}
	@SuppressWarnings("CheckReturnValue")
	public static class BlockCommentContext extends LineContext {
		public TerminalNode COMMENT_BLOCK() { return getToken(LangParser.COMMENT_BLOCK, 0); }
		public BlockCommentContext(LineContext ctx) { copyFrom(ctx); }
	}
	@SuppressWarnings("CheckReturnValue")
	public static class LineIfContext extends LineContext {
		public IfstContext ifst() {
			return getRuleContext(IfstContext.class,0);
		}
		public LineIfContext(LineContext ctx) { copyFrom(ctx); }
	}
	@SuppressWarnings("CheckReturnValue")
	public static class LineCommentContext extends LineContext {
		public TerminalNode COMMENT_LINE() { return getToken(LangParser.COMMENT_LINE, 0); }
		public LineCommentContext(LineContext ctx) { copyFrom(ctx); }
	}
	@SuppressWarnings("CheckReturnValue")
	public static class LineForContext extends LineContext {
		public ForstContext forst() {
			return getRuleContext(ForstContext.class,0);
		}
		public LineForContext(LineContext ctx) { copyFrom(ctx); }
	}
	@SuppressWarnings("CheckReturnValue")
	public static class LineTernaryContext extends LineContext {
		public TernaryContext ternary() {
			return getRuleContext(TernaryContext.class,0);
		}
		public TerminalNode EOL() { return getToken(LangParser.EOL, 0); }
		public LineTernaryContext(LineContext ctx) { copyFrom(ctx); }
	}
	@SuppressWarnings("CheckReturnValue")
	public static class LineArrayContext extends LineContext {
		public ArrayContext array() {
			return getRuleContext(ArrayContext.class,0);
		}
		public TerminalNode EOL() { return getToken(LangParser.EOL, 0); }
		public LineArrayContext(LineContext ctx) { copyFrom(ctx); }
	}

	public final LineContext line() throws RecognitionException {
		LineContext _localctx = new LineContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_line);
		try {
			setState(109);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,5,_ctx) ) {
			case 1:
				_localctx = new LineStmtContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(94);
				stmt();
				setState(95);
				match(EOL);
				}
				break;
			case 2:
				_localctx = new LineIfContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(97);
				ifst();
				}
				break;
			case 3:
				_localctx = new LineWhileContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(98);
				whilest();
				}
				break;
			case 4:
				_localctx = new LineForContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(99);
				forst();
				}
				break;
			case 5:
				_localctx = new LineTernaryContext(_localctx);
				enterOuterAlt(_localctx, 5);
				{
				setState(100);
				ternary();
				setState(101);
				match(EOL);
				}
				break;
			case 6:
				_localctx = new LineArrayContext(_localctx);
				enterOuterAlt(_localctx, 6);
				{
				setState(103);
				array();
				setState(104);
				match(EOL);
				}
				break;
			case 7:
				_localctx = new LineEOLContext(_localctx);
				enterOuterAlt(_localctx, 7);
				{
				setState(106);
				match(EOL);
				}
				break;
			case 8:
				_localctx = new LineCommentContext(_localctx);
				enterOuterAlt(_localctx, 8);
				{
				setState(107);
				match(COMMENT_LINE);
				}
				break;
			case 9:
				_localctx = new BlockCommentContext(_localctx);
				enterOuterAlt(_localctx, 9);
				{
				setState(108);
				match(COMMENT_BLOCK);
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
	public static class FuncInvocContext extends ParserRuleContext {
		public FuncInvocContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_funcInvoc; }
	 
		public FuncInvocContext() { }
		public void copyFrom(FuncInvocContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class FuncInvocLineContext extends FuncInvocContext {
		public TerminalNode VAR() { return getToken(LangParser.VAR, 0); }
		public TerminalNode OE() { return getToken(LangParser.OE, 0); }
		public ParamsContext params() {
			return getRuleContext(ParamsContext.class,0);
		}
		public TerminalNode CE() { return getToken(LangParser.CE, 0); }
		public FuncInvocLineContext(FuncInvocContext ctx) { copyFrom(ctx); }
	}

	public final FuncInvocContext funcInvoc() throws RecognitionException {
		FuncInvocContext _localctx = new FuncInvocContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_funcInvoc);
		try {
			_localctx = new FuncInvocLineContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(111);
			match(VAR);
			setState(112);
			match(OE);
			setState(113);
			params();
			setState(114);
			match(CE);
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
	public static class StmtContext extends ParserRuleContext {
		public StmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_stmt; }
	 
		public StmtContext() { }
		public void copyFrom(StmtContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class StmtOutputContext extends StmtContext {
		public OutputContext output() {
			return getRuleContext(OutputContext.class,0);
		}
		public StmtOutputContext(StmtContext ctx) { copyFrom(ctx); }
	}
	@SuppressWarnings("CheckReturnValue")
	public static class StmtInputContext extends StmtContext {
		public InputContext input() {
			return getRuleContext(InputContext.class,0);
		}
		public StmtInputContext(StmtContext ctx) { copyFrom(ctx); }
	}
	@SuppressWarnings("CheckReturnValue")
	public static class StmtAtribContext extends StmtContext {
		public AtribContext atrib() {
			return getRuleContext(AtribContext.class,0);
		}
		public StmtAtribContext(StmtContext ctx) { copyFrom(ctx); }
	}
	@SuppressWarnings("CheckReturnValue")
	public static class LineFuncInvocContext extends StmtContext {
		public FuncInvocContext funcInvoc() {
			return getRuleContext(FuncInvocContext.class,0);
		}
		public LineFuncInvocContext(StmtContext ctx) { copyFrom(ctx); }
	}

	public final StmtContext stmt() throws RecognitionException {
		StmtContext _localctx = new StmtContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_stmt);
		try {
			setState(120);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,6,_ctx) ) {
			case 1:
				_localctx = new StmtAtribContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(116);
				atrib();
				}
				break;
			case 2:
				_localctx = new StmtInputContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(117);
				input();
				}
				break;
			case 3:
				_localctx = new StmtOutputContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(118);
				output();
				}
				break;
			case 4:
				_localctx = new LineFuncInvocContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(119);
				funcInvoc();
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
	public static class InputContext extends ParserRuleContext {
		public InputContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_input; }
	 
		public InputContext() { }
		public void copyFrom(InputContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class InputReadContext extends InputContext {
		public Token TYPE;
		public TerminalNode READ() { return getToken(LangParser.READ, 0); }
		public TerminalNode VAR() { return getToken(LangParser.VAR, 0); }
		public TerminalNode INT() { return getToken(LangParser.INT, 0); }
		public TerminalNode DOUBLE() { return getToken(LangParser.DOUBLE, 0); }
		public TerminalNode STRING() { return getToken(LangParser.STRING, 0); }
		public TerminalNode BOOLEAN() { return getToken(LangParser.BOOLEAN, 0); }
		public InputReadContext(InputContext ctx) { copyFrom(ctx); }
	}

	public final InputContext input() throws RecognitionException {
		InputContext _localctx = new InputContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_input);
		int _la;
		try {
			_localctx = new InputReadContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(122);
			match(READ);
			setState(123);
			match(VAR);
			setState(124);
			((InputReadContext)_localctx).TYPE = _input.LT(1);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & 8246337208320L) != 0)) ) {
				((InputReadContext)_localctx).TYPE = (Token)_errHandler.recoverInline(this);
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
	public static class OutputContext extends ParserRuleContext {
		public OutputContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_output; }
	 
		public OutputContext() { }
		public void copyFrom(OutputContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class OutputWriteFStrContext extends OutputContext {
		public TerminalNode WRITE() { return getToken(LangParser.WRITE, 0); }
		public TerminalNode STR() { return getToken(LangParser.STR, 0); }
		public OutputWriteFStrContext(OutputContext ctx) { copyFrom(ctx); }
	}
	@SuppressWarnings("CheckReturnValue")
	public static class OutputWriteStrContext extends OutputContext {
		public TerminalNode WRITE() { return getToken(LangParser.WRITE, 0); }
		public TerminalNode STR() { return getToken(LangParser.STR, 0); }
		public OutputWriteStrContext(OutputContext ctx) { copyFrom(ctx); }
	}
	@SuppressWarnings("CheckReturnValue")
	public static class OutputWriteVarContext extends OutputContext {
		public TerminalNode WRITE() { return getToken(LangParser.WRITE, 0); }
		public TerminalNode VAR() { return getToken(LangParser.VAR, 0); }
		public TerminalNode POSITION() { return getToken(LangParser.POSITION, 0); }
		public OutputWriteVarContext(OutputContext ctx) { copyFrom(ctx); }
	}
	@SuppressWarnings("CheckReturnValue")
	public static class OutputWriteExprContext extends OutputContext {
		public TerminalNode WRITE() { return getToken(LangParser.WRITE, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public OutputWriteExprContext(OutputContext ctx) { copyFrom(ctx); }
	}

	public final OutputContext output() throws RecognitionException {
		OutputContext _localctx = new OutputContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_output);
		int _la;
		try {
			setState(138);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,8,_ctx) ) {
			case 1:
				_localctx = new OutputWriteVarContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(126);
				match(WRITE);
				setState(127);
				match(VAR);
				setState(129);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==POSITION) {
					{
					setState(128);
					match(POSITION);
					}
				}

				}
				break;
			case 2:
				_localctx = new OutputWriteFStrContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(131);
				match(WRITE);
				setState(132);
				match(T__0);
				setState(133);
				match(STR);
				}
				break;
			case 3:
				_localctx = new OutputWriteStrContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(134);
				match(WRITE);
				setState(135);
				match(STR);
				}
				break;
			case 4:
				_localctx = new OutputWriteExprContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(136);
				match(WRITE);
				setState(137);
				expr();
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
	public static class IfstContext extends ParserRuleContext {
		public IfstContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ifst; }
	 
		public IfstContext() { }
		public void copyFrom(IfstContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class IfstIfElseContext extends IfstContext {
		public BlockContext b1;
		public BlockContext b2;
		public TerminalNode IF() { return getToken(LangParser.IF, 0); }
		public TerminalNode OE() { return getToken(LangParser.OE, 0); }
		public CondContext cond() {
			return getRuleContext(CondContext.class,0);
		}
		public TerminalNode CE() { return getToken(LangParser.CE, 0); }
		public TerminalNode ELSE() { return getToken(LangParser.ELSE, 0); }
		public List<BlockContext> block() {
			return getRuleContexts(BlockContext.class);
		}
		public BlockContext block(int i) {
			return getRuleContext(BlockContext.class,i);
		}
		public IfstIfElseContext(IfstContext ctx) { copyFrom(ctx); }
	}
	@SuppressWarnings("CheckReturnValue")
	public static class IfstIfContext extends IfstContext {
		public TerminalNode IF() { return getToken(LangParser.IF, 0); }
		public TerminalNode OE() { return getToken(LangParser.OE, 0); }
		public CondContext cond() {
			return getRuleContext(CondContext.class,0);
		}
		public TerminalNode CE() { return getToken(LangParser.CE, 0); }
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public IfstIfContext(IfstContext ctx) { copyFrom(ctx); }
	}

	public final IfstContext ifst() throws RecognitionException {
		IfstContext _localctx = new IfstContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_ifst);
		try {
			setState(154);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,9,_ctx) ) {
			case 1:
				_localctx = new IfstIfContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(140);
				match(IF);
				setState(141);
				match(OE);
				setState(142);
				cond(0);
				setState(143);
				match(CE);
				setState(144);
				block();
				}
				break;
			case 2:
				_localctx = new IfstIfElseContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(146);
				match(IF);
				setState(147);
				match(OE);
				setState(148);
				cond(0);
				setState(149);
				match(CE);
				setState(150);
				((IfstIfElseContext)_localctx).b1 = block();
				setState(151);
				match(ELSE);
				setState(152);
				((IfstIfElseContext)_localctx).b2 = block();
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
	public static class TernaryContext extends ParserRuleContext {
		public TernaryContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ternary; }
	 
		public TernaryContext() { }
		public void copyFrom(TernaryContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class TernaryCondContext extends TernaryContext {
		public Token e1;
		public Token e2;
		public CondContext cond() {
			return getRuleContext(CondContext.class,0);
		}
		public List<TerminalNode> STR() { return getTokens(LangParser.STR); }
		public TerminalNode STR(int i) {
			return getToken(LangParser.STR, i);
		}
		public TernaryCondContext(TernaryContext ctx) { copyFrom(ctx); }
	}

	public final TernaryContext ternary() throws RecognitionException {
		TernaryContext _localctx = new TernaryContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_ternary);
		try {
			_localctx = new TernaryCondContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(156);
			cond(0);
			setState(157);
			match(T__1);
			setState(158);
			((TernaryCondContext)_localctx).e1 = match(STR);
			setState(159);
			match(T__2);
			setState(160);
			((TernaryCondContext)_localctx).e2 = match(STR);
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
	public static class WhilestContext extends ParserRuleContext {
		public WhilestContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_whilest; }
	 
		public WhilestContext() { }
		public void copyFrom(WhilestContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class WhilestWhileContext extends WhilestContext {
		public TerminalNode WHILE() { return getToken(LangParser.WHILE, 0); }
		public TerminalNode OE() { return getToken(LangParser.OE, 0); }
		public CondContext cond() {
			return getRuleContext(CondContext.class,0);
		}
		public TerminalNode CE() { return getToken(LangParser.CE, 0); }
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public WhilestWhileContext(WhilestContext ctx) { copyFrom(ctx); }
	}

	public final WhilestContext whilest() throws RecognitionException {
		WhilestContext _localctx = new WhilestContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_whilest);
		try {
			_localctx = new WhilestWhileContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(162);
			match(WHILE);
			setState(163);
			match(OE);
			setState(164);
			cond(0);
			setState(165);
			match(CE);
			setState(166);
			block();
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
	public static class ForstContext extends ParserRuleContext {
		public ForstContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_forst; }
	 
		public ForstContext() { }
		public void copyFrom(ForstContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ForstForContext extends ForstContext {
		public TerminalNode FOR() { return getToken(LangParser.FOR, 0); }
		public TerminalNode OE() { return getToken(LangParser.OE, 0); }
		public TerminalNode VAR() { return getToken(LangParser.VAR, 0); }
		public List<TerminalNode> EOL() { return getTokens(LangParser.EOL); }
		public TerminalNode EOL(int i) {
			return getToken(LangParser.EOL, i);
		}
		public CondContext cond() {
			return getRuleContext(CondContext.class,0);
		}
		public AtribContext atrib() {
			return getRuleContext(AtribContext.class,0);
		}
		public TerminalNode CE() { return getToken(LangParser.CE, 0); }
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public ForstForContext(ForstContext ctx) { copyFrom(ctx); }
	}

	public final ForstContext forst() throws RecognitionException {
		ForstContext _localctx = new ForstContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_forst);
		try {
			_localctx = new ForstForContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(168);
			match(FOR);
			setState(169);
			match(OE);
			setState(170);
			match(VAR);
			setState(171);
			match(EOL);
			setState(172);
			cond(0);
			setState(173);
			match(EOL);
			setState(174);
			atrib();
			setState(175);
			match(CE);
			setState(176);
			block();
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
	public static class ArrayContext extends ParserRuleContext {
		public ArrayContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_array; }
	 
		public ArrayContext() { }
		public void copyFrom(ArrayContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class AtribArrayStringContext extends ArrayContext {
		public TerminalNode ARRAY() { return getToken(LangParser.ARRAY, 0); }
		public TerminalNode LT() { return getToken(LangParser.LT, 0); }
		public TerminalNode STRING() { return getToken(LangParser.STRING, 0); }
		public TerminalNode GT() { return getToken(LangParser.GT, 0); }
		public TerminalNode VAR() { return getToken(LangParser.VAR, 0); }
		public TerminalNode AT() { return getToken(LangParser.AT, 0); }
		public Factor_array_stringContext factor_array_string() {
			return getRuleContext(Factor_array_stringContext.class,0);
		}
		public AtribArrayStringContext(ArrayContext ctx) { copyFrom(ctx); }
	}
	@SuppressWarnings("CheckReturnValue")
	public static class AtribArrayNumberContext extends ArrayContext {
		public Token TYPE;
		public TerminalNode ARRAY() { return getToken(LangParser.ARRAY, 0); }
		public TerminalNode LT() { return getToken(LangParser.LT, 0); }
		public TerminalNode GT() { return getToken(LangParser.GT, 0); }
		public TerminalNode VAR() { return getToken(LangParser.VAR, 0); }
		public TerminalNode AT() { return getToken(LangParser.AT, 0); }
		public Factor_array_numberContext factor_array_number() {
			return getRuleContext(Factor_array_numberContext.class,0);
		}
		public TerminalNode INT() { return getToken(LangParser.INT, 0); }
		public TerminalNode DOUBLE() { return getToken(LangParser.DOUBLE, 0); }
		public AtribArrayNumberContext(ArrayContext ctx) { copyFrom(ctx); }
	}

	public final ArrayContext array() throws RecognitionException {
		ArrayContext _localctx = new ArrayContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_array);
		int _la;
		try {
			setState(192);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,10,_ctx) ) {
			case 1:
				_localctx = new AtribArrayNumberContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(178);
				match(ARRAY);
				setState(179);
				match(LT);
				setState(180);
				((AtribArrayNumberContext)_localctx).TYPE = _input.LT(1);
				_la = _input.LA(1);
				if ( !(_la==INT || _la==DOUBLE) ) {
					((AtribArrayNumberContext)_localctx).TYPE = (Token)_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(181);
				match(GT);
				setState(182);
				match(VAR);
				setState(183);
				match(AT);
				setState(184);
				factor_array_number();
				}
				break;
			case 2:
				_localctx = new AtribArrayStringContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(185);
				match(ARRAY);
				setState(186);
				match(LT);
				setState(187);
				match(STRING);
				setState(188);
				match(GT);
				setState(189);
				match(VAR);
				setState(190);
				match(AT);
				setState(191);
				factor_array_string();
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
	public static class BlockContext extends ParserRuleContext {
		public BlockContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_block; }
	 
		public BlockContext() { }
		public void copyFrom(BlockContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class BlockLineContext extends BlockContext {
		public TerminalNode OB() { return getToken(LangParser.OB, 0); }
		public TerminalNode CB() { return getToken(LangParser.CB, 0); }
		public List<LineContext> line() {
			return getRuleContexts(LineContext.class);
		}
		public LineContext line(int i) {
			return getRuleContext(LineContext.class,i);
		}
		public BlockLineContext(BlockContext ctx) { copyFrom(ctx); }
	}

	public final BlockContext block() throws RecognitionException {
		BlockContext _localctx = new BlockContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_block);
		int _la;
		try {
			_localctx = new BlockLineContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(194);
			match(OB);
			setState(196); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(195);
				line();
				}
				}
				setState(198); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & 31261185485570112L) != 0) );
			setState(200);
			match(CB);
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
	public static class CondContext extends ParserRuleContext {
		public CondContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_cond; }
	 
		public CondContext() { }
		public void copyFrom(CondContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class CondRelopContext extends CondContext {
		public ExprContext e1;
		public Token RELOP;
		public ExprContext e2;
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public TerminalNode EQ() { return getToken(LangParser.EQ, 0); }
		public TerminalNode NE() { return getToken(LangParser.NE, 0); }
		public TerminalNode LT() { return getToken(LangParser.LT, 0); }
		public TerminalNode GT() { return getToken(LangParser.GT, 0); }
		public TerminalNode LE() { return getToken(LangParser.LE, 0); }
		public TerminalNode GE() { return getToken(LangParser.GE, 0); }
		public CondRelopContext(CondContext ctx) { copyFrom(ctx); }
	}
	@SuppressWarnings("CheckReturnValue")
	public static class CondExprContext extends CondContext {
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public CondExprContext(CondContext ctx) { copyFrom(ctx); }
	}
	@SuppressWarnings("CheckReturnValue")
	public static class CondAndContext extends CondContext {
		public CondContext c1;
		public CondContext c2;
		public TerminalNode AND() { return getToken(LangParser.AND, 0); }
		public List<CondContext> cond() {
			return getRuleContexts(CondContext.class);
		}
		public CondContext cond(int i) {
			return getRuleContext(CondContext.class,i);
		}
		public CondAndContext(CondContext ctx) { copyFrom(ctx); }
	}
	@SuppressWarnings("CheckReturnValue")
	public static class CondOrContext extends CondContext {
		public CondContext c1;
		public CondContext c2;
		public TerminalNode OR() { return getToken(LangParser.OR, 0); }
		public List<CondContext> cond() {
			return getRuleContexts(CondContext.class);
		}
		public CondContext cond(int i) {
			return getRuleContext(CondContext.class,i);
		}
		public CondOrContext(CondContext ctx) { copyFrom(ctx); }
	}
	@SuppressWarnings("CheckReturnValue")
	public static class CondNotContext extends CondContext {
		public TerminalNode NOT() { return getToken(LangParser.NOT, 0); }
		public CondContext cond() {
			return getRuleContext(CondContext.class,0);
		}
		public CondNotContext(CondContext ctx) { copyFrom(ctx); }
	}

	public final CondContext cond() throws RecognitionException {
		return cond(0);
	}

	private CondContext cond(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		CondContext _localctx = new CondContext(_ctx, _parentState);
		CondContext _prevctx = _localctx;
		int _startState = 34;
		enterRecursionRule(_localctx, 34, RULE_cond, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(210);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,12,_ctx) ) {
			case 1:
				{
				_localctx = new CondExprContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;

				setState(203);
				expr();
				}
				break;
			case 2:
				{
				_localctx = new CondRelopContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(204);
				((CondRelopContext)_localctx).e1 = expr();
				setState(205);
				((CondRelopContext)_localctx).RELOP = _input.LT(1);
				_la = _input.LA(1);
				if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & 264241152L) != 0)) ) {
					((CondRelopContext)_localctx).RELOP = (Token)_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(206);
				((CondRelopContext)_localctx).e2 = expr();
				}
				break;
			case 3:
				{
				_localctx = new CondNotContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(208);
				match(NOT);
				setState(209);
				cond(1);
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(220);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,14,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(218);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,13,_ctx) ) {
					case 1:
						{
						_localctx = new CondAndContext(new CondContext(_parentctx, _parentState));
						((CondAndContext)_localctx).c1 = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_cond);
						setState(212);
						if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
						setState(213);
						match(AND);
						setState(214);
						((CondAndContext)_localctx).c2 = cond(4);
						}
						break;
					case 2:
						{
						_localctx = new CondOrContext(new CondContext(_parentctx, _parentState));
						((CondOrContext)_localctx).c1 = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_cond);
						setState(215);
						if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
						setState(216);
						match(OR);
						setState(217);
						((CondOrContext)_localctx).c2 = cond(3);
						}
						break;
					}
					} 
				}
				setState(222);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,14,_ctx);
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
	public static class AtribContext extends ParserRuleContext {
		public AtribContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_atrib; }
	 
		public AtribContext() { }
		public void copyFrom(AtribContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class AtribPlusContext extends AtribContext {
		public TerminalNode VAR() { return getToken(LangParser.VAR, 0); }
		public TerminalNode ATRIB_PLUS() { return getToken(LangParser.ATRIB_PLUS, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public AtribPlusContext(AtribContext ctx) { copyFrom(ctx); }
	}
	@SuppressWarnings("CheckReturnValue")
	public static class AtribStringContext extends AtribContext {
		public TerminalNode STRING() { return getToken(LangParser.STRING, 0); }
		public TerminalNode VAR() { return getToken(LangParser.VAR, 0); }
		public TerminalNode AT() { return getToken(LangParser.AT, 0); }
		public TerminalNode STR() { return getToken(LangParser.STR, 0); }
		public AtribStringContext(AtribContext ctx) { copyFrom(ctx); }
	}
	@SuppressWarnings("CheckReturnValue")
	public static class AtribMinusContext extends AtribContext {
		public TerminalNode VAR() { return getToken(LangParser.VAR, 0); }
		public TerminalNode ATRIB_MINUS() { return getToken(LangParser.ATRIB_MINUS, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public AtribMinusContext(AtribContext ctx) { copyFrom(ctx); }
	}
	@SuppressWarnings("CheckReturnValue")
	public static class AtribMultContext extends AtribContext {
		public TerminalNode VAR() { return getToken(LangParser.VAR, 0); }
		public TerminalNode ATRIB_MULT() { return getToken(LangParser.ATRIB_MULT, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public AtribMultContext(AtribContext ctx) { copyFrom(ctx); }
	}
	@SuppressWarnings("CheckReturnValue")
	public static class AtribVarContext extends AtribContext {
		public Token TYPE;
		public TerminalNode VAR() { return getToken(LangParser.VAR, 0); }
		public TerminalNode AT() { return getToken(LangParser.AT, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TerminalNode INT() { return getToken(LangParser.INT, 0); }
		public TerminalNode DOUBLE() { return getToken(LangParser.DOUBLE, 0); }
		public TerminalNode BOOLEAN() { return getToken(LangParser.BOOLEAN, 0); }
		public AtribVarContext(AtribContext ctx) { copyFrom(ctx); }
	}

	public final AtribContext atrib() throws RecognitionException {
		AtribContext _localctx = new AtribContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_atrib);
		int _la;
		try {
			setState(240);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,15,_ctx) ) {
			case 1:
				_localctx = new AtribStringContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(223);
				match(STRING);
				setState(224);
				match(VAR);
				setState(225);
				match(AT);
				setState(226);
				match(STR);
				}
				break;
			case 2:
				_localctx = new AtribVarContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(227);
				((AtribVarContext)_localctx).TYPE = _input.LT(1);
				_la = _input.LA(1);
				if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & 6047313952768L) != 0)) ) {
					((AtribVarContext)_localctx).TYPE = (Token)_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(228);
				match(VAR);
				setState(229);
				match(AT);
				setState(230);
				expr();
				}
				break;
			case 3:
				_localctx = new AtribPlusContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(231);
				match(VAR);
				setState(232);
				match(ATRIB_PLUS);
				setState(233);
				expr();
				}
				break;
			case 4:
				_localctx = new AtribMinusContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(234);
				match(VAR);
				setState(235);
				match(ATRIB_MINUS);
				setState(236);
				expr();
				}
				break;
			case 5:
				_localctx = new AtribMultContext(_localctx);
				enterOuterAlt(_localctx, 5);
				{
				setState(237);
				match(VAR);
				setState(238);
				match(ATRIB_MULT);
				setState(239);
				expr();
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
	public static class ExprContext extends ParserRuleContext {
		public ExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expr; }
	 
		public ExprContext() { }
		public void copyFrom(ExprContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ExprPlusContext extends ExprContext {
		public TermContext term() {
			return getRuleContext(TermContext.class,0);
		}
		public TerminalNode PLUS() { return getToken(LangParser.PLUS, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public ExprPlusContext(ExprContext ctx) { copyFrom(ctx); }
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ExprMinusContext extends ExprContext {
		public TermContext term() {
			return getRuleContext(TermContext.class,0);
		}
		public TerminalNode MINUS() { return getToken(LangParser.MINUS, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public ExprMinusContext(ExprContext ctx) { copyFrom(ctx); }
	}
	@SuppressWarnings("CheckReturnValue")
	public static class CondTernaryContext extends ExprContext {
		public TermContext term() {
			return getRuleContext(TermContext.class,0);
		}
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public CondTernaryContext(ExprContext ctx) { copyFrom(ctx); }
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ExprTermContext extends ExprContext {
		public TermContext term() {
			return getRuleContext(TermContext.class,0);
		}
		public ExprTermContext(ExprContext ctx) { copyFrom(ctx); }
	}

	public final ExprContext expr() throws RecognitionException {
		ExprContext _localctx = new ExprContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_expr);
		try {
			setState(257);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,16,_ctx) ) {
			case 1:
				_localctx = new ExprPlusContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(242);
				term();
				setState(243);
				match(PLUS);
				setState(244);
				expr();
				}
				break;
			case 2:
				_localctx = new ExprMinusContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(246);
				term();
				setState(247);
				match(MINUS);
				setState(248);
				expr();
				}
				break;
			case 3:
				_localctx = new CondTernaryContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(250);
				term();
				setState(251);
				match(T__1);
				setState(252);
				expr();
				setState(253);
				match(T__2);
				setState(254);
				expr();
				}
				break;
			case 4:
				_localctx = new ExprTermContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(256);
				term();
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
	public static class TermContext extends ParserRuleContext {
		public TermContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_term; }
	 
		public TermContext() { }
		public void copyFrom(TermContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class TermDivContext extends TermContext {
		public FactorContext factor() {
			return getRuleContext(FactorContext.class,0);
		}
		public TerminalNode DIV() { return getToken(LangParser.DIV, 0); }
		public TermContext term() {
			return getRuleContext(TermContext.class,0);
		}
		public TermDivContext(TermContext ctx) { copyFrom(ctx); }
	}
	@SuppressWarnings("CheckReturnValue")
	public static class TermMultContext extends TermContext {
		public FactorContext factor() {
			return getRuleContext(FactorContext.class,0);
		}
		public TerminalNode MULT() { return getToken(LangParser.MULT, 0); }
		public TermContext term() {
			return getRuleContext(TermContext.class,0);
		}
		public TermMultContext(TermContext ctx) { copyFrom(ctx); }
	}
	@SuppressWarnings("CheckReturnValue")
	public static class TermFactorContext extends TermContext {
		public FactorContext factor() {
			return getRuleContext(FactorContext.class,0);
		}
		public TermFactorContext(TermContext ctx) { copyFrom(ctx); }
	}

	public final TermContext term() throws RecognitionException {
		TermContext _localctx = new TermContext(_ctx, getState());
		enterRule(_localctx, 40, RULE_term);
		try {
			setState(268);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,17,_ctx) ) {
			case 1:
				_localctx = new TermMultContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(259);
				factor();
				setState(260);
				match(MULT);
				setState(261);
				term();
				}
				break;
			case 2:
				_localctx = new TermDivContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(263);
				factor();
				setState(264);
				match(DIV);
				setState(265);
				term();
				}
				break;
			case 3:
				_localctx = new TermFactorContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(267);
				factor();
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
	public static class Factor_array_numberContext extends ParserRuleContext {
		public Factor_array_numberContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_factor_array_number; }
	 
		public Factor_array_numberContext() { }
		public void copyFrom(Factor_array_numberContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class Array_numberContext extends Factor_array_numberContext {
		public List<FactorContext> factor() {
			return getRuleContexts(FactorContext.class);
		}
		public FactorContext factor(int i) {
			return getRuleContext(FactorContext.class,i);
		}
		public List<TerminalNode> SEP() { return getTokens(LangParser.SEP); }
		public TerminalNode SEP(int i) {
			return getToken(LangParser.SEP, i);
		}
		public Array_numberContext(Factor_array_numberContext ctx) { copyFrom(ctx); }
	}

	public final Factor_array_numberContext factor_array_number() throws RecognitionException {
		Factor_array_numberContext _localctx = new Factor_array_numberContext(_ctx, getState());
		enterRule(_localctx, 42, RULE_factor_array_number);
		int _la;
		try {
			_localctx = new Array_numberContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(270);
			match(T__3);
			{
			setState(271);
			factor();
			}
			setState(276);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==SEP) {
				{
				{
				setState(272);
				match(SEP);
				{
				setState(273);
				factor();
				}
				}
				}
				setState(278);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(279);
			match(T__4);
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
	public static class Factor_array_stringContext extends ParserRuleContext {
		public Factor_array_stringContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_factor_array_string; }
	 
		public Factor_array_stringContext() { }
		public void copyFrom(Factor_array_stringContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class Array_stringContext extends Factor_array_stringContext {
		public List<TerminalNode> STR() { return getTokens(LangParser.STR); }
		public TerminalNode STR(int i) {
			return getToken(LangParser.STR, i);
		}
		public List<TerminalNode> SEP() { return getTokens(LangParser.SEP); }
		public TerminalNode SEP(int i) {
			return getToken(LangParser.SEP, i);
		}
		public Array_stringContext(Factor_array_stringContext ctx) { copyFrom(ctx); }
	}

	public final Factor_array_stringContext factor_array_string() throws RecognitionException {
		Factor_array_stringContext _localctx = new Factor_array_stringContext(_ctx, getState());
		enterRule(_localctx, 44, RULE_factor_array_string);
		int _la;
		try {
			_localctx = new Array_stringContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(281);
			match(T__3);
			{
			setState(282);
			match(STR);
			}
			setState(287);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==SEP) {
				{
				{
				setState(283);
				match(SEP);
				{
				setState(284);
				match(STR);
				}
				}
				}
				setState(289);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(290);
			match(T__4);
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
	public static class FactorContext extends ParserRuleContext {
		public FactorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_factor; }
	 
		public FactorContext() { }
		public void copyFrom(FactorContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class FactorNumContext extends FactorContext {
		public TerminalNode NUM() { return getToken(LangParser.NUM, 0); }
		public FactorNumContext(FactorContext ctx) { copyFrom(ctx); }
	}
	@SuppressWarnings("CheckReturnValue")
	public static class FactorBoolFalseContext extends FactorContext {
		public TerminalNode BOOL_FALSE() { return getToken(LangParser.BOOL_FALSE, 0); }
		public FactorBoolFalseContext(FactorContext ctx) { copyFrom(ctx); }
	}
	@SuppressWarnings("CheckReturnValue")
	public static class FactorBoolTrueContext extends FactorContext {
		public TerminalNode BOOL_TRUE() { return getToken(LangParser.BOOL_TRUE, 0); }
		public FactorBoolTrueContext(FactorContext ctx) { copyFrom(ctx); }
	}
	@SuppressWarnings("CheckReturnValue")
	public static class FactorVarContext extends FactorContext {
		public TerminalNode VAR() { return getToken(LangParser.VAR, 0); }
		public FactorVarContext(FactorContext ctx) { copyFrom(ctx); }
	}
	@SuppressWarnings("CheckReturnValue")
	public static class FactorDecimContext extends FactorContext {
		public TerminalNode DECIM() { return getToken(LangParser.DECIM, 0); }
		public FactorDecimContext(FactorContext ctx) { copyFrom(ctx); }
	}
	@SuppressWarnings("CheckReturnValue")
	public static class FactorExprContext extends FactorContext {
		public TerminalNode OE() { return getToken(LangParser.OE, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TerminalNode CE() { return getToken(LangParser.CE, 0); }
		public FactorExprContext(FactorContext ctx) { copyFrom(ctx); }
	}

	public final FactorContext factor() throws RecognitionException {
		FactorContext _localctx = new FactorContext(_ctx, getState());
		enterRule(_localctx, 46, RULE_factor);
		try {
			setState(301);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case OE:
				_localctx = new FactorExprContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(292);
				match(OE);
				setState(293);
				expr();
				setState(294);
				match(CE);
				}
				break;
			case VAR:
				_localctx = new FactorVarContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(296);
				match(VAR);
				}
				break;
			case DECIM:
				_localctx = new FactorDecimContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(297);
				match(DECIM);
				}
				break;
			case NUM:
				_localctx = new FactorNumContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(298);
				match(NUM);
				}
				break;
			case BOOL_TRUE:
				_localctx = new FactorBoolTrueContext(_localctx);
				enterOuterAlt(_localctx, 5);
				{
				setState(299);
				match(BOOL_TRUE);
				}
				break;
			case BOOL_FALSE:
				_localctx = new FactorBoolFalseContext(_localctx);
				enterOuterAlt(_localctx, 6);
				{
				setState(300);
				match(BOOL_FALSE);
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

	public boolean sempred(RuleContext _localctx, int ruleIndex, int predIndex) {
		switch (ruleIndex) {
		case 17:
			return cond_sempred((CondContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean cond_sempred(CondContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0:
			return precpred(_ctx, 3);
		case 1:
			return precpred(_ctx, 2);
		}
		return true;
	}

	public static final String _serializedATN =
		"\u0004\u00017\u0130\u0002\u0000\u0007\u0000\u0002\u0001\u0007\u0001\u0002"+
		"\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004\u0007\u0004\u0002"+
		"\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002\u0007\u0007\u0007\u0002"+
		"\b\u0007\b\u0002\t\u0007\t\u0002\n\u0007\n\u0002\u000b\u0007\u000b\u0002"+
		"\f\u0007\f\u0002\r\u0007\r\u0002\u000e\u0007\u000e\u0002\u000f\u0007\u000f"+
		"\u0002\u0010\u0007\u0010\u0002\u0011\u0007\u0011\u0002\u0012\u0007\u0012"+
		"\u0002\u0013\u0007\u0013\u0002\u0014\u0007\u0014\u0002\u0015\u0007\u0015"+
		"\u0002\u0016\u0007\u0016\u0002\u0017\u0007\u0017\u0001\u0000\u0001\u0000"+
		"\u0004\u00003\b\u0000\u000b\u0000\f\u00004\u0001\u0001\u0001\u0001\u0001"+
		"\u0001\u0001\u0001\u0003\u0001;\b\u0001\u0001\u0002\u0001\u0002\u0001"+
		"\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0003\u0001"+
		"\u0003\u0001\u0003\u0001\u0003\u0001\u0004\u0001\u0004\u0001\u0004\u0001"+
		"\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001"+
		"\u0004\u0003\u0004R\b\u0004\u0001\u0005\u0001\u0005\u0001\u0005\u0005"+
		"\u0005W\b\u0005\n\u0005\f\u0005Z\t\u0005\u0001\u0005\u0003\u0005]\b\u0005"+
		"\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006"+
		"\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006"+
		"\u0001\u0006\u0001\u0006\u0001\u0006\u0003\u0006n\b\u0006\u0001\u0007"+
		"\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\b\u0001\b\u0001"+
		"\b\u0001\b\u0003\by\b\b\u0001\t\u0001\t\u0001\t\u0001\t\u0001\n\u0001"+
		"\n\u0001\n\u0003\n\u0082\b\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001"+
		"\n\u0001\n\u0003\n\u008b\b\n\u0001\u000b\u0001\u000b\u0001\u000b\u0001"+
		"\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0001"+
		"\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0003\u000b\u009b"+
		"\b\u000b\u0001\f\u0001\f\u0001\f\u0001\f\u0001\f\u0001\f\u0001\r\u0001"+
		"\r\u0001\r\u0001\r\u0001\r\u0001\r\u0001\u000e\u0001\u000e\u0001\u000e"+
		"\u0001\u000e\u0001\u000e\u0001\u000e\u0001\u000e\u0001\u000e\u0001\u000e"+
		"\u0001\u000e\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u000f"+
		"\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u000f"+
		"\u0001\u000f\u0001\u000f\u0001\u000f\u0003\u000f\u00c1\b\u000f\u0001\u0010"+
		"\u0001\u0010\u0004\u0010\u00c5\b\u0010\u000b\u0010\f\u0010\u00c6\u0001"+
		"\u0010\u0001\u0010\u0001\u0011\u0001\u0011\u0001\u0011\u0001\u0011\u0001"+
		"\u0011\u0001\u0011\u0001\u0011\u0001\u0011\u0003\u0011\u00d3\b\u0011\u0001"+
		"\u0011\u0001\u0011\u0001\u0011\u0001\u0011\u0001\u0011\u0001\u0011\u0005"+
		"\u0011\u00db\b\u0011\n\u0011\f\u0011\u00de\t\u0011\u0001\u0012\u0001\u0012"+
		"\u0001\u0012\u0001\u0012\u0001\u0012\u0001\u0012\u0001\u0012\u0001\u0012"+
		"\u0001\u0012\u0001\u0012\u0001\u0012\u0001\u0012\u0001\u0012\u0001\u0012"+
		"\u0001\u0012\u0001\u0012\u0001\u0012\u0003\u0012\u00f1\b\u0012\u0001\u0013"+
		"\u0001\u0013\u0001\u0013\u0001\u0013\u0001\u0013\u0001\u0013\u0001\u0013"+
		"\u0001\u0013\u0001\u0013\u0001\u0013\u0001\u0013\u0001\u0013\u0001\u0013"+
		"\u0001\u0013\u0001\u0013\u0003\u0013\u0102\b\u0013\u0001\u0014\u0001\u0014"+
		"\u0001\u0014\u0001\u0014\u0001\u0014\u0001\u0014\u0001\u0014\u0001\u0014"+
		"\u0001\u0014\u0003\u0014\u010d\b\u0014\u0001\u0015\u0001\u0015\u0001\u0015"+
		"\u0001\u0015\u0005\u0015\u0113\b\u0015\n\u0015\f\u0015\u0116\t\u0015\u0001"+
		"\u0015\u0001\u0015\u0001\u0016\u0001\u0016\u0001\u0016\u0001\u0016\u0005"+
		"\u0016\u011e\b\u0016\n\u0016\f\u0016\u0121\t\u0016\u0001\u0016\u0001\u0016"+
		"\u0001\u0017\u0001\u0017\u0001\u0017\u0001\u0017\u0001\u0017\u0001\u0017"+
		"\u0001\u0017\u0001\u0017\u0001\u0017\u0003\u0017\u012e\b\u0017\u0001\u0017"+
		"\u0000\u0001\"\u0018\u0000\u0002\u0004\u0006\b\n\f\u000e\u0010\u0012\u0014"+
		"\u0016\u0018\u001a\u001c\u001e \"$&(*,.\u0000\u0004\u0001\u0000\'*\u0001"+
		"\u0000\'(\u0001\u0000\u0016\u001b\u0002\u0000\'(**\u0144\u00000\u0001"+
		"\u0000\u0000\u0000\u0002:\u0001\u0000\u0000\u0000\u0004<\u0001\u0000\u0000"+
		"\u0000\u0006C\u0001\u0000\u0000\u0000\bQ\u0001\u0000\u0000\u0000\n\\\u0001"+
		"\u0000\u0000\u0000\fm\u0001\u0000\u0000\u0000\u000eo\u0001\u0000\u0000"+
		"\u0000\u0010x\u0001\u0000\u0000\u0000\u0012z\u0001\u0000\u0000\u0000\u0014"+
		"\u008a\u0001\u0000\u0000\u0000\u0016\u009a\u0001\u0000\u0000\u0000\u0018"+
		"\u009c\u0001\u0000\u0000\u0000\u001a\u00a2\u0001\u0000\u0000\u0000\u001c"+
		"\u00a8\u0001\u0000\u0000\u0000\u001e\u00c0\u0001\u0000\u0000\u0000 \u00c2"+
		"\u0001\u0000\u0000\u0000\"\u00d2\u0001\u0000\u0000\u0000$\u00f0\u0001"+
		"\u0000\u0000\u0000&\u0101\u0001\u0000\u0000\u0000(\u010c\u0001\u0000\u0000"+
		"\u0000*\u010e\u0001\u0000\u0000\u0000,\u0119\u0001\u0000\u0000\u0000."+
		"\u012d\u0001\u0000\u0000\u000002\u0003\u0002\u0001\u000013\u0003\f\u0006"+
		"\u000021\u0001\u0000\u0000\u000034\u0001\u0000\u0000\u000042\u0001\u0000"+
		"\u0000\u000045\u0001\u0000\u0000\u00005\u0001\u0001\u0000\u0000\u0000"+
		"67\u0003\u0004\u0002\u000078\u0003\u0002\u0001\u00008;\u0001\u0000\u0000"+
		"\u00009;\u0001\u0000\u0000\u0000:6\u0001\u0000\u0000\u0000:9\u0001\u0000"+
		"\u0000\u0000;\u0003\u0001\u0000\u0000\u0000<=\u0005!\u0000\u0000=>\u0005"+
		"3\u0000\u0000>?\u0005\u0006\u0000\u0000?@\u0003\n\u0005\u0000@A\u0005"+
		"\u0007\u0000\u0000AB\u0003\u0006\u0003\u0000B\u0005\u0001\u0000\u0000"+
		"\u0000CD\u0005\b\u0000\u0000DE\u0003\b\u0004\u0000EF\u0005\t\u0000\u0000"+
		"F\u0007\u0001\u0000\u0000\u0000GR\u0003\f\u0006\u0000HI\u0003\f\u0006"+
		"\u0000IJ\u0003\b\u0004\u0000JR\u0001\u0000\u0000\u0000KL\u0005\"\u0000"+
		"\u0000LM\u0003&\u0013\u0000MN\u00050\u0000\u0000NR\u0001\u0000\u0000\u0000"+
		"OP\u0005\"\u0000\u0000PR\u00050\u0000\u0000QG\u0001\u0000\u0000\u0000"+
		"QH\u0001\u0000\u0000\u0000QK\u0001\u0000\u0000\u0000QO\u0001\u0000\u0000"+
		"\u0000R\t\u0001\u0000\u0000\u0000SX\u00053\u0000\u0000TU\u0005\u000b\u0000"+
		"\u0000UW\u00053\u0000\u0000VT\u0001\u0000\u0000\u0000WZ\u0001\u0000\u0000"+
		"\u0000XV\u0001\u0000\u0000\u0000XY\u0001\u0000\u0000\u0000Y]\u0001\u0000"+
		"\u0000\u0000ZX\u0001\u0000\u0000\u0000[]\u0001\u0000\u0000\u0000\\S\u0001"+
		"\u0000\u0000\u0000\\[\u0001\u0000\u0000\u0000]\u000b\u0001\u0000\u0000"+
		"\u0000^_\u0003\u0010\b\u0000_`\u00050\u0000\u0000`n\u0001\u0000\u0000"+
		"\u0000an\u0003\u0016\u000b\u0000bn\u0003\u001a\r\u0000cn\u0003\u001c\u000e"+
		"\u0000de\u0003\u0018\f\u0000ef\u00050\u0000\u0000fn\u0001\u0000\u0000"+
		"\u0000gh\u0003\u001e\u000f\u0000hi\u00050\u0000\u0000in\u0001\u0000\u0000"+
		"\u0000jn\u00050\u0000\u0000kn\u00055\u0000\u0000ln\u00056\u0000\u0000"+
		"m^\u0001\u0000\u0000\u0000ma\u0001\u0000\u0000\u0000mb\u0001\u0000\u0000"+
		"\u0000mc\u0001\u0000\u0000\u0000md\u0001\u0000\u0000\u0000mg\u0001\u0000"+
		"\u0000\u0000mj\u0001\u0000\u0000\u0000mk\u0001\u0000\u0000\u0000ml\u0001"+
		"\u0000\u0000\u0000n\r\u0001\u0000\u0000\u0000op\u00053\u0000\u0000pq\u0005"+
		"\u0006\u0000\u0000qr\u0003\n\u0005\u0000rs\u0005\u0007\u0000\u0000s\u000f"+
		"\u0001\u0000\u0000\u0000ty\u0003$\u0012\u0000uy\u0003\u0012\t\u0000vy"+
		"\u0003\u0014\n\u0000wy\u0003\u000e\u0007\u0000xt\u0001\u0000\u0000\u0000"+
		"xu\u0001\u0000\u0000\u0000xv\u0001\u0000\u0000\u0000xw\u0001\u0000\u0000"+
		"\u0000y\u0011\u0001\u0000\u0000\u0000z{\u0005&\u0000\u0000{|\u00053\u0000"+
		"\u0000|}\u0007\u0000\u0000\u0000}\u0013\u0001\u0000\u0000\u0000~\u007f"+
		"\u0005%\u0000\u0000\u007f\u0081\u00053\u0000\u0000\u0080\u0082\u00054"+
		"\u0000\u0000\u0081\u0080\u0001\u0000\u0000\u0000\u0081\u0082\u0001\u0000"+
		"\u0000\u0000\u0082\u008b\u0001\u0000\u0000\u0000\u0083\u0084\u0005%\u0000"+
		"\u0000\u0084\u0085\u0005\u0001\u0000\u0000\u0085\u008b\u0005/\u0000\u0000"+
		"\u0086\u0087\u0005%\u0000\u0000\u0087\u008b\u0005/\u0000\u0000\u0088\u0089"+
		"\u0005%\u0000\u0000\u0089\u008b\u0003&\u0013\u0000\u008a~\u0001\u0000"+
		"\u0000\u0000\u008a\u0083\u0001\u0000\u0000\u0000\u008a\u0086\u0001\u0000"+
		"\u0000\u0000\u008a\u0088\u0001\u0000\u0000\u0000\u008b\u0015\u0001\u0000"+
		"\u0000\u0000\u008c\u008d\u0005\u001e\u0000\u0000\u008d\u008e\u0005\u0006"+
		"\u0000\u0000\u008e\u008f\u0003\"\u0011\u0000\u008f\u0090\u0005\u0007\u0000"+
		"\u0000\u0090\u0091\u0003 \u0010\u0000\u0091\u009b\u0001\u0000\u0000\u0000"+
		"\u0092\u0093\u0005\u001e\u0000\u0000\u0093\u0094\u0005\u0006\u0000\u0000"+
		"\u0094\u0095\u0003\"\u0011\u0000\u0095\u0096\u0005\u0007\u0000\u0000\u0096"+
		"\u0097\u0003 \u0010\u0000\u0097\u0098\u0005$\u0000\u0000\u0098\u0099\u0003"+
		" \u0010\u0000\u0099\u009b\u0001\u0000\u0000\u0000\u009a\u008c\u0001\u0000"+
		"\u0000\u0000\u009a\u0092\u0001\u0000\u0000\u0000\u009b\u0017\u0001\u0000"+
		"\u0000\u0000\u009c\u009d\u0003\"\u0011\u0000\u009d\u009e\u0005\u0002\u0000"+
		"\u0000\u009e\u009f\u0005/\u0000\u0000\u009f\u00a0\u0005\u0003\u0000\u0000"+
		"\u00a0\u00a1\u0005/\u0000\u0000\u00a1\u0019\u0001\u0000\u0000\u0000\u00a2"+
		"\u00a3\u0005\u001f\u0000\u0000\u00a3\u00a4\u0005\u0006\u0000\u0000\u00a4"+
		"\u00a5\u0003\"\u0011\u0000\u00a5\u00a6\u0005\u0007\u0000\u0000\u00a6\u00a7"+
		"\u0003 \u0010\u0000\u00a7\u001b\u0001\u0000\u0000\u0000\u00a8\u00a9\u0005"+
		" \u0000\u0000\u00a9\u00aa\u0005\u0006\u0000\u0000\u00aa\u00ab\u00053\u0000"+
		"\u0000\u00ab\u00ac\u00050\u0000\u0000\u00ac\u00ad\u0003\"\u0011\u0000"+
		"\u00ad\u00ae\u00050\u0000\u0000\u00ae\u00af\u0003$\u0012\u0000\u00af\u00b0"+
		"\u0005\u0007\u0000\u0000\u00b0\u00b1\u0003 \u0010\u0000\u00b1\u001d\u0001"+
		"\u0000\u0000\u0000\u00b2\u00b3\u0005+\u0000\u0000\u00b3\u00b4\u0005\u0017"+
		"\u0000\u0000\u00b4\u00b5\u0007\u0001\u0000\u0000\u00b5\u00b6\u0005\u0018"+
		"\u0000\u0000\u00b6\u00b7\u00053\u0000\u0000\u00b7\u00b8\u0005\n\u0000"+
		"\u0000\u00b8\u00c1\u0003*\u0015\u0000\u00b9\u00ba\u0005+\u0000\u0000\u00ba"+
		"\u00bb\u0005\u0017\u0000\u0000\u00bb\u00bc\u0005)\u0000\u0000\u00bc\u00bd"+
		"\u0005\u0018\u0000\u0000\u00bd\u00be\u00053\u0000\u0000\u00be\u00bf\u0005"+
		"\n\u0000\u0000\u00bf\u00c1\u0003,\u0016\u0000\u00c0\u00b2\u0001\u0000"+
		"\u0000\u0000\u00c0\u00b9\u0001\u0000\u0000\u0000\u00c1\u001f\u0001\u0000"+
		"\u0000\u0000\u00c2\u00c4\u0005\b\u0000\u0000\u00c3\u00c5\u0003\f\u0006"+
		"\u0000\u00c4\u00c3\u0001\u0000\u0000\u0000\u00c5\u00c6\u0001\u0000\u0000"+
		"\u0000\u00c6\u00c4\u0001\u0000\u0000\u0000\u00c6\u00c7\u0001\u0000\u0000"+
		"\u0000\u00c7\u00c8\u0001\u0000\u0000\u0000\u00c8\u00c9\u0005\t\u0000\u0000"+
		"\u00c9!\u0001\u0000\u0000\u0000\u00ca\u00cb\u0006\u0011\uffff\uffff\u0000"+
		"\u00cb\u00d3\u0003&\u0013\u0000\u00cc\u00cd\u0003&\u0013\u0000\u00cd\u00ce"+
		"\u0007\u0002\u0000\u0000\u00ce\u00cf\u0003&\u0013\u0000\u00cf\u00d3\u0001"+
		"\u0000\u0000\u0000\u00d0\u00d1\u0005\u0015\u0000\u0000\u00d1\u00d3\u0003"+
		"\"\u0011\u0001\u00d2\u00ca\u0001\u0000\u0000\u0000\u00d2\u00cc\u0001\u0000"+
		"\u0000\u0000\u00d2\u00d0\u0001\u0000\u0000\u0000\u00d3\u00dc\u0001\u0000"+
		"\u0000\u0000\u00d4\u00d5\n\u0003\u0000\u0000\u00d5\u00d6\u0005\u0013\u0000"+
		"\u0000\u00d6\u00db\u0003\"\u0011\u0004\u00d7\u00d8\n\u0002\u0000\u0000"+
		"\u00d8\u00d9\u0005\u0014\u0000\u0000\u00d9\u00db\u0003\"\u0011\u0003\u00da"+
		"\u00d4\u0001\u0000\u0000\u0000\u00da\u00d7\u0001\u0000\u0000\u0000\u00db"+
		"\u00de\u0001\u0000\u0000\u0000\u00dc\u00da\u0001\u0000\u0000\u0000\u00dc"+
		"\u00dd\u0001\u0000\u0000\u0000\u00dd#\u0001\u0000\u0000\u0000\u00de\u00dc"+
		"\u0001\u0000\u0000\u0000\u00df\u00e0\u0005)\u0000\u0000\u00e0\u00e1\u0005"+
		"3\u0000\u0000\u00e1\u00e2\u0005\n\u0000\u0000\u00e2\u00f1\u0005/\u0000"+
		"\u0000\u00e3\u00e4\u0007\u0003\u0000\u0000\u00e4\u00e5\u00053\u0000\u0000"+
		"\u00e5\u00e6\u0005\n\u0000\u0000\u00e6\u00f1\u0003&\u0013\u0000\u00e7"+
		"\u00e8\u00053\u0000\u0000\u00e8\u00e9\u0005\r\u0000\u0000\u00e9\u00f1"+
		"\u0003&\u0013\u0000\u00ea\u00eb\u00053\u0000\u0000\u00eb\u00ec\u0005\u000e"+
		"\u0000\u0000\u00ec\u00f1\u0003&\u0013\u0000\u00ed\u00ee\u00053\u0000\u0000"+
		"\u00ee\u00ef\u0005\u000f\u0000\u0000\u00ef\u00f1\u0003&\u0013\u0000\u00f0"+
		"\u00df\u0001\u0000\u0000\u0000\u00f0\u00e3\u0001\u0000\u0000\u0000\u00f0"+
		"\u00e7\u0001\u0000\u0000\u0000\u00f0\u00ea\u0001\u0000\u0000\u0000\u00f0"+
		"\u00ed\u0001\u0000\u0000\u0000\u00f1%\u0001\u0000\u0000\u0000\u00f2\u00f3"+
		"\u0003(\u0014\u0000\u00f3\u00f4\u0005\f\u0000\u0000\u00f4\u00f5\u0003"+
		"&\u0013\u0000\u00f5\u0102\u0001\u0000\u0000\u0000\u00f6\u00f7\u0003(\u0014"+
		"\u0000\u00f7\u00f8\u0005\u0010\u0000\u0000\u00f8\u00f9\u0003&\u0013\u0000"+
		"\u00f9\u0102\u0001\u0000\u0000\u0000\u00fa\u00fb\u0003(\u0014\u0000\u00fb"+
		"\u00fc\u0005\u0002\u0000\u0000\u00fc\u00fd\u0003&\u0013\u0000\u00fd\u00fe"+
		"\u0005\u0003\u0000\u0000\u00fe\u00ff\u0003&\u0013\u0000\u00ff\u0102\u0001"+
		"\u0000\u0000\u0000\u0100\u0102\u0003(\u0014\u0000\u0101\u00f2\u0001\u0000"+
		"\u0000\u0000\u0101\u00f6\u0001\u0000\u0000\u0000\u0101\u00fa\u0001\u0000"+
		"\u0000\u0000\u0101\u0100\u0001\u0000\u0000\u0000\u0102\'\u0001\u0000\u0000"+
		"\u0000\u0103\u0104\u0003.\u0017\u0000\u0104\u0105\u0005\u0011\u0000\u0000"+
		"\u0105\u0106\u0003(\u0014\u0000\u0106\u010d\u0001\u0000\u0000\u0000\u0107"+
		"\u0108\u0003.\u0017\u0000\u0108\u0109\u0005\u0012\u0000\u0000\u0109\u010a"+
		"\u0003(\u0014\u0000\u010a\u010d\u0001\u0000\u0000\u0000\u010b\u010d\u0003"+
		".\u0017\u0000\u010c\u0103\u0001\u0000\u0000\u0000\u010c\u0107\u0001\u0000"+
		"\u0000\u0000\u010c\u010b\u0001\u0000\u0000\u0000\u010d)\u0001\u0000\u0000"+
		"\u0000\u010e\u010f\u0005\u0004\u0000\u0000\u010f\u0114\u0003.\u0017\u0000"+
		"\u0110\u0111\u0005\u000b\u0000\u0000\u0111\u0113\u0003.\u0017\u0000\u0112"+
		"\u0110\u0001\u0000\u0000\u0000\u0113\u0116\u0001\u0000\u0000\u0000\u0114"+
		"\u0112\u0001\u0000\u0000\u0000\u0114\u0115\u0001\u0000\u0000\u0000\u0115"+
		"\u0117\u0001\u0000\u0000\u0000\u0116\u0114\u0001\u0000\u0000\u0000\u0117"+
		"\u0118\u0005\u0005\u0000\u0000\u0118+\u0001\u0000\u0000\u0000\u0119\u011a"+
		"\u0005\u0004\u0000\u0000\u011a\u011f\u0005/\u0000\u0000\u011b\u011c\u0005"+
		"\u000b\u0000\u0000\u011c\u011e\u0005/\u0000\u0000\u011d\u011b\u0001\u0000"+
		"\u0000\u0000\u011e\u0121\u0001\u0000\u0000\u0000\u011f\u011d\u0001\u0000"+
		"\u0000\u0000\u011f\u0120\u0001\u0000\u0000\u0000\u0120\u0122\u0001\u0000"+
		"\u0000\u0000\u0121\u011f\u0001\u0000\u0000\u0000\u0122\u0123\u0005\u0005"+
		"\u0000\u0000\u0123-\u0001\u0000\u0000\u0000\u0124\u0125\u0005\u0006\u0000"+
		"\u0000\u0125\u0126\u0003&\u0013\u0000\u0126\u0127\u0005\u0007\u0000\u0000"+
		"\u0127\u012e\u0001\u0000\u0000\u0000\u0128\u012e\u00053\u0000\u0000\u0129"+
		"\u012e\u00052\u0000\u0000\u012a\u012e\u00051\u0000\u0000\u012b\u012e\u0005"+
		"\u001c\u0000\u0000\u012c\u012e\u0005\u001d\u0000\u0000\u012d\u0124\u0001"+
		"\u0000\u0000\u0000\u012d\u0128\u0001\u0000\u0000\u0000\u012d\u0129\u0001"+
		"\u0000\u0000\u0000\u012d\u012a\u0001\u0000\u0000\u0000\u012d\u012b\u0001"+
		"\u0000\u0000\u0000\u012d\u012c\u0001\u0000\u0000\u0000\u012e/\u0001\u0000"+
		"\u0000\u0000\u00154:QX\\mx\u0081\u008a\u009a\u00c0\u00c6\u00d2\u00da\u00dc"+
		"\u00f0\u0101\u010c\u0114\u011f\u012d";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}