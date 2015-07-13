// Generated from PL0.g4 by ANTLR 4.4
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class PL0Parser extends Parser {
	static { RuntimeMetaData.checkVersion("4.4", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		ODD=1, CALL=2, BANG=3, OR=4, AND=5, EQ=6, NEQ=7, GT=8, LT=9, GTE=10, LTE=11, 
		PLUS=12, MINUS=13, MULT=14, DIV=15, CASSIGN=16, ASSIGN=17, OPAR=18, CPAR=19, 
		COMMA=20, SEMIC=21, DOT=22, TRUE=23, FALSE=24, IF=25, ELSE=26, WHILE=27, 
		DO=28, THEN=29, BEGIN=30, END=31, PROCEDURE=32, VAR=33, CONST=34, Ident=35, 
		Number=36, ALPHA=37, DIGIT=38, WS=39, Comment=40;
	public static final String[] tokenNames = {
		"<INVALID>", "'odd'", "'call'", "'!'", "'||'", "'&&'", "'=='", "'!='", 
		"'>'", "'<'", "'>='", "'<='", "'+'", "'-'", "'*'", "'/'", "'='", "':='", 
		"'('", "')'", "','", "';'", "'.'", "'true'", "'false'", "'if'", "'else'", 
		"'while'", "'do'", "'then'", "'begin'", "'end'", "'procedure'", "'var'", 
		"'const'", "Ident", "Number", "ALPHA", "DIGIT", "WS", "Comment"
	};
	public static final int
		RULE_program = 0, RULE_block = 1, RULE_consts = 2, RULE_vars = 3, RULE_procedure = 4, 
		RULE_statement = 5, RULE_condition = 6, RULE_expression = 7, RULE_opt_term = 8, 
		RULE_term = 9, RULE_opt_factor = 10, RULE_factor = 11;
	public static final String[] ruleNames = {
		"program", "block", "consts", "vars", "procedure", "statement", "condition", 
		"expression", "opt_term", "term", "opt_factor", "factor"
	};

	@Override
	public String getGrammarFileName() { return "PL0.g4"; }

	@Override
	public String[] getTokenNames() { return tokenNames; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public PL0Parser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}
	public static class ProgramContext extends ParserRuleContext {
		public TerminalNode DOT() { return getToken(PL0Parser.DOT, 0); }
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public ProgramContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_program; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PL0Listener ) ((PL0Listener)listener).enterProgram(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PL0Listener ) ((PL0Listener)listener).exitProgram(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PL0Visitor ) return ((PL0Visitor<? extends T>)visitor).visitProgram(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ProgramContext program() throws RecognitionException {
		ProgramContext _localctx = new ProgramContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_program);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(24); block();
			setState(25); match(DOT);
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

	public static class BlockContext extends ParserRuleContext {
		public ConstsContext consts() {
			return getRuleContext(ConstsContext.class,0);
		}
		public List<ProcedureContext> procedure() {
			return getRuleContexts(ProcedureContext.class);
		}
		public StatementContext statement() {
			return getRuleContext(StatementContext.class,0);
		}
		public VarsContext vars() {
			return getRuleContext(VarsContext.class,0);
		}
		public ProcedureContext procedure(int i) {
			return getRuleContext(ProcedureContext.class,i);
		}
		public BlockContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_block; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PL0Listener ) ((PL0Listener)listener).enterBlock(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PL0Listener ) ((PL0Listener)listener).exitBlock(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PL0Visitor ) return ((PL0Visitor<? extends T>)visitor).visitBlock(this);
			else return visitor.visitChildren(this);
		}
	}

	public final BlockContext block() throws RecognitionException {
		BlockContext _localctx = new BlockContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_block);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(28);
			_la = _input.LA(1);
			if (_la==CONST) {
				{
				setState(27); consts();
				}
			}

			setState(31);
			_la = _input.LA(1);
			if (_la==VAR) {
				{
				setState(30); vars();
				}
			}

			setState(36);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==PROCEDURE) {
				{
				{
				setState(33); procedure();
				}
				}
				setState(38);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(39); statement();
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

	public static class ConstsContext extends ParserRuleContext {
		public TerminalNode CONST() { return getToken(PL0Parser.CONST, 0); }
		public TerminalNode CASSIGN(int i) {
			return getToken(PL0Parser.CASSIGN, i);
		}
		public List<TerminalNode> Ident() { return getTokens(PL0Parser.Ident); }
		public TerminalNode SEMIC() { return getToken(PL0Parser.SEMIC, 0); }
		public List<TerminalNode> COMMA() { return getTokens(PL0Parser.COMMA); }
		public List<TerminalNode> CASSIGN() { return getTokens(PL0Parser.CASSIGN); }
		public List<TerminalNode> Number() { return getTokens(PL0Parser.Number); }
		public TerminalNode Ident(int i) {
			return getToken(PL0Parser.Ident, i);
		}
		public TerminalNode COMMA(int i) {
			return getToken(PL0Parser.COMMA, i);
		}
		public TerminalNode Number(int i) {
			return getToken(PL0Parser.Number, i);
		}
		public ConstsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_consts; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PL0Listener ) ((PL0Listener)listener).enterConsts(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PL0Listener ) ((PL0Listener)listener).exitConsts(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PL0Visitor ) return ((PL0Visitor<? extends T>)visitor).visitConsts(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ConstsContext consts() throws RecognitionException {
		ConstsContext _localctx = new ConstsContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_consts);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(41); match(CONST);
			setState(42); match(Ident);
			setState(43); match(CASSIGN);
			setState(44); match(Number);
			setState(51);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(45); match(COMMA);
				setState(46); match(Ident);
				setState(47); match(CASSIGN);
				setState(48); match(Number);
				}
				}
				setState(53);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(54); match(SEMIC);
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

	public static class VarsContext extends ParserRuleContext {
		public List<TerminalNode> Ident() { return getTokens(PL0Parser.Ident); }
		public TerminalNode VAR() { return getToken(PL0Parser.VAR, 0); }
		public TerminalNode SEMIC() { return getToken(PL0Parser.SEMIC, 0); }
		public List<TerminalNode> COMMA() { return getTokens(PL0Parser.COMMA); }
		public TerminalNode Ident(int i) {
			return getToken(PL0Parser.Ident, i);
		}
		public TerminalNode COMMA(int i) {
			return getToken(PL0Parser.COMMA, i);
		}
		public VarsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_vars; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PL0Listener ) ((PL0Listener)listener).enterVars(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PL0Listener ) ((PL0Listener)listener).exitVars(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PL0Visitor ) return ((PL0Visitor<? extends T>)visitor).visitVars(this);
			else return visitor.visitChildren(this);
		}
	}

	public final VarsContext vars() throws RecognitionException {
		VarsContext _localctx = new VarsContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_vars);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(56); match(VAR);
			setState(57); match(Ident);
			setState(62);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(58); match(COMMA);
				setState(59); match(Ident);
				}
				}
				setState(64);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(65); match(SEMIC);
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

	public static class ProcedureContext extends ParserRuleContext {
		public TerminalNode Ident() { return getToken(PL0Parser.Ident, 0); }
		public List<TerminalNode> SEMIC() { return getTokens(PL0Parser.SEMIC); }
		public TerminalNode SEMIC(int i) {
			return getToken(PL0Parser.SEMIC, i);
		}
		public TerminalNode PROCEDURE() { return getToken(PL0Parser.PROCEDURE, 0); }
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public ProcedureContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_procedure; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PL0Listener ) ((PL0Listener)listener).enterProcedure(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PL0Listener ) ((PL0Listener)listener).exitProcedure(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PL0Visitor ) return ((PL0Visitor<? extends T>)visitor).visitProcedure(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ProcedureContext procedure() throws RecognitionException {
		ProcedureContext _localctx = new ProcedureContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_procedure);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(67); match(PROCEDURE);
			setState(68); match(Ident);
			setState(69); match(SEMIC);
			setState(70); block();
			setState(71); match(SEMIC);
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

	public static class StatementContext extends ParserRuleContext {
		public StatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_statement; }
	 
		public StatementContext() { }
		public void copyFrom(StatementContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class BeginStatContext extends StatementContext {
		public List<TerminalNode> SEMIC() { return getTokens(PL0Parser.SEMIC); }
		public TerminalNode SEMIC(int i) {
			return getToken(PL0Parser.SEMIC, i);
		}
		public TerminalNode BEGIN() { return getToken(PL0Parser.BEGIN, 0); }
		public TerminalNode END() { return getToken(PL0Parser.END, 0); }
		public StatementContext statement(int i) {
			return getRuleContext(StatementContext.class,i);
		}
		public List<StatementContext> statement() {
			return getRuleContexts(StatementContext.class);
		}
		public BeginStatContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PL0Listener ) ((PL0Listener)listener).enterBeginStat(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PL0Listener ) ((PL0Listener)listener).exitBeginStat(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PL0Visitor ) return ((PL0Visitor<? extends T>)visitor).visitBeginStat(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class IfStatContext extends StatementContext {
		public TerminalNode IF() { return getToken(PL0Parser.IF, 0); }
		public TerminalNode THEN() { return getToken(PL0Parser.THEN, 0); }
		public StatementContext statement() {
			return getRuleContext(StatementContext.class,0);
		}
		public ConditionContext condition() {
			return getRuleContext(ConditionContext.class,0);
		}
		public IfStatContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PL0Listener ) ((PL0Listener)listener).enterIfStat(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PL0Listener ) ((PL0Listener)listener).exitIfStat(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PL0Visitor ) return ((PL0Visitor<? extends T>)visitor).visitIfStat(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class CallStatContext extends StatementContext {
		public TerminalNode Ident() { return getToken(PL0Parser.Ident, 0); }
		public TerminalNode CALL() { return getToken(PL0Parser.CALL, 0); }
		public CallStatContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PL0Listener ) ((PL0Listener)listener).enterCallStat(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PL0Listener ) ((PL0Listener)listener).exitCallStat(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PL0Visitor ) return ((PL0Visitor<? extends T>)visitor).visitCallStat(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class BangStatContext extends StatementContext {
		public TerminalNode Ident() { return getToken(PL0Parser.Ident, 0); }
		public TerminalNode BANG() { return getToken(PL0Parser.BANG, 0); }
		public BangStatContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PL0Listener ) ((PL0Listener)listener).enterBangStat(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PL0Listener ) ((PL0Listener)listener).exitBangStat(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PL0Visitor ) return ((PL0Visitor<? extends T>)visitor).visitBangStat(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class AssignStatContext extends StatementContext {
		public TerminalNode ASSIGN() { return getToken(PL0Parser.ASSIGN, 0); }
		public TerminalNode Ident() { return getToken(PL0Parser.Ident, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public AssignStatContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PL0Listener ) ((PL0Listener)listener).enterAssignStat(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PL0Listener ) ((PL0Listener)listener).exitAssignStat(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PL0Visitor ) return ((PL0Visitor<? extends T>)visitor).visitAssignStat(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class WhileStatContext extends StatementContext {
		public TerminalNode DO() { return getToken(PL0Parser.DO, 0); }
		public StatementContext statement() {
			return getRuleContext(StatementContext.class,0);
		}
		public TerminalNode WHILE() { return getToken(PL0Parser.WHILE, 0); }
		public ConditionContext condition() {
			return getRuleContext(ConditionContext.class,0);
		}
		public WhileStatContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PL0Listener ) ((PL0Listener)listener).enterWhileStat(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PL0Listener ) ((PL0Listener)listener).exitWhileStat(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PL0Visitor ) return ((PL0Visitor<? extends T>)visitor).visitWhileStat(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StatementContext statement() throws RecognitionException {
		StatementContext _localctx = new StatementContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_statement);
		int _la;
		try {
			setState(101);
			switch (_input.LA(1)) {
			case Ident:
				_localctx = new AssignStatContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(73); match(Ident);
				setState(74); match(ASSIGN);
				setState(75); expression();
				}
				break;
			case CALL:
				_localctx = new CallStatContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(76); match(CALL);
				setState(77); match(Ident);
				}
				break;
			case BANG:
				_localctx = new BangStatContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(78); match(BANG);
				setState(79); match(Ident);
				}
				break;
			case BEGIN:
				_localctx = new BeginStatContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(80); match(BEGIN);
				setState(81); statement();
				setState(86);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==SEMIC) {
					{
					{
					setState(82); match(SEMIC);
					setState(83); statement();
					}
					}
					setState(88);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(89); match(END);
				}
				break;
			case IF:
				_localctx = new IfStatContext(_localctx);
				enterOuterAlt(_localctx, 5);
				{
				setState(91); match(IF);
				setState(92); condition();
				setState(93); match(THEN);
				setState(94); statement();
				}
				break;
			case WHILE:
				_localctx = new WhileStatContext(_localctx);
				enterOuterAlt(_localctx, 6);
				{
				setState(96); match(WHILE);
				setState(97); condition();
				setState(98); match(DO);
				setState(99); statement();
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

	public static class ConditionContext extends ParserRuleContext {
		public Token op;
		public TerminalNode LT() { return getToken(PL0Parser.LT, 0); }
		public TerminalNode GTE() { return getToken(PL0Parser.GTE, 0); }
		public TerminalNode GT() { return getToken(PL0Parser.GT, 0); }
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public TerminalNode EQ() { return getToken(PL0Parser.EQ, 0); }
		public TerminalNode ODD() { return getToken(PL0Parser.ODD, 0); }
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public TerminalNode LTE() { return getToken(PL0Parser.LTE, 0); }
		public ConditionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_condition; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PL0Listener ) ((PL0Listener)listener).enterCondition(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PL0Listener ) ((PL0Listener)listener).exitCondition(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PL0Visitor ) return ((PL0Visitor<? extends T>)visitor).visitCondition(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ConditionContext condition() throws RecognitionException {
		ConditionContext _localctx = new ConditionContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_condition);
		int _la;
		try {
			setState(109);
			switch (_input.LA(1)) {
			case ODD:
				enterOuterAlt(_localctx, 1);
				{
				setState(103); match(ODD);
				setState(104); expression();
				}
				break;
			case PLUS:
			case MINUS:
			case OPAR:
			case Ident:
			case Number:
				enterOuterAlt(_localctx, 2);
				{
				setState(105); expression();
				setState(106);
				((ConditionContext)_localctx).op = _input.LT(1);
				_la = _input.LA(1);
				if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << EQ) | (1L << GT) | (1L << LT) | (1L << GTE) | (1L << LTE))) != 0)) ) {
					((ConditionContext)_localctx).op = (Token)_errHandler.recoverInline(this);
				}
				consume();
				setState(107); expression();
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

	public static class ExpressionContext extends ParserRuleContext {
		public Token opt_sign;
		public TermContext term() {
			return getRuleContext(TermContext.class,0);
		}
		public List<Opt_termContext> opt_term() {
			return getRuleContexts(Opt_termContext.class);
		}
		public TerminalNode PLUS() { return getToken(PL0Parser.PLUS, 0); }
		public TerminalNode MINUS() { return getToken(PL0Parser.MINUS, 0); }
		public Opt_termContext opt_term(int i) {
			return getRuleContext(Opt_termContext.class,i);
		}
		public ExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PL0Listener ) ((PL0Listener)listener).enterExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PL0Listener ) ((PL0Listener)listener).exitExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PL0Visitor ) return ((PL0Visitor<? extends T>)visitor).visitExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExpressionContext expression() throws RecognitionException {
		ExpressionContext _localctx = new ExpressionContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_expression);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(112);
			_la = _input.LA(1);
			if (_la==PLUS || _la==MINUS) {
				{
				setState(111);
				((ExpressionContext)_localctx).opt_sign = _input.LT(1);
				_la = _input.LA(1);
				if ( !(_la==PLUS || _la==MINUS) ) {
					((ExpressionContext)_localctx).opt_sign = (Token)_errHandler.recoverInline(this);
				}
				consume();
				}
			}

			setState(114); term();
			setState(118);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==PLUS || _la==MINUS) {
				{
				{
				setState(115); opt_term();
				}
				}
				setState(120);
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

	public static class Opt_termContext extends ParserRuleContext {
		public Token op;
		public TermContext term() {
			return getRuleContext(TermContext.class,0);
		}
		public TerminalNode PLUS() { return getToken(PL0Parser.PLUS, 0); }
		public TerminalNode MINUS() { return getToken(PL0Parser.MINUS, 0); }
		public Opt_termContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_opt_term; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PL0Listener ) ((PL0Listener)listener).enterOpt_term(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PL0Listener ) ((PL0Listener)listener).exitOpt_term(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PL0Visitor ) return ((PL0Visitor<? extends T>)visitor).visitOpt_term(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Opt_termContext opt_term() throws RecognitionException {
		Opt_termContext _localctx = new Opt_termContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_opt_term);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(121);
			((Opt_termContext)_localctx).op = _input.LT(1);
			_la = _input.LA(1);
			if ( !(_la==PLUS || _la==MINUS) ) {
				((Opt_termContext)_localctx).op = (Token)_errHandler.recoverInline(this);
			}
			consume();
			setState(122); term();
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

	public static class TermContext extends ParserRuleContext {
		public FactorContext factor() {
			return getRuleContext(FactorContext.class,0);
		}
		public Opt_factorContext opt_factor(int i) {
			return getRuleContext(Opt_factorContext.class,i);
		}
		public List<Opt_factorContext> opt_factor() {
			return getRuleContexts(Opt_factorContext.class);
		}
		public TermContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_term; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PL0Listener ) ((PL0Listener)listener).enterTerm(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PL0Listener ) ((PL0Listener)listener).exitTerm(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PL0Visitor ) return ((PL0Visitor<? extends T>)visitor).visitTerm(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TermContext term() throws RecognitionException {
		TermContext _localctx = new TermContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_term);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(124); factor();
			setState(128);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==MULT || _la==DIV) {
				{
				{
				setState(125); opt_factor();
				}
				}
				setState(130);
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

	public static class Opt_factorContext extends ParserRuleContext {
		public Token op;
		public FactorContext factor() {
			return getRuleContext(FactorContext.class,0);
		}
		public TerminalNode MULT() { return getToken(PL0Parser.MULT, 0); }
		public TerminalNode DIV() { return getToken(PL0Parser.DIV, 0); }
		public Opt_factorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_opt_factor; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PL0Listener ) ((PL0Listener)listener).enterOpt_factor(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PL0Listener ) ((PL0Listener)listener).exitOpt_factor(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PL0Visitor ) return ((PL0Visitor<? extends T>)visitor).visitOpt_factor(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Opt_factorContext opt_factor() throws RecognitionException {
		Opt_factorContext _localctx = new Opt_factorContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_opt_factor);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(131);
			((Opt_factorContext)_localctx).op = _input.LT(1);
			_la = _input.LA(1);
			if ( !(_la==MULT || _la==DIV) ) {
				((Opt_factorContext)_localctx).op = (Token)_errHandler.recoverInline(this);
			}
			consume();
			setState(132); factor();
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
	public static class NumberFactorContext extends FactorContext {
		public TerminalNode Number() { return getToken(PL0Parser.Number, 0); }
		public NumberFactorContext(FactorContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PL0Listener ) ((PL0Listener)listener).enterNumberFactor(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PL0Listener ) ((PL0Listener)listener).exitNumberFactor(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PL0Visitor ) return ((PL0Visitor<? extends T>)visitor).visitNumberFactor(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ParExprContext extends FactorContext {
		public TerminalNode CPAR() { return getToken(PL0Parser.CPAR, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode OPAR() { return getToken(PL0Parser.OPAR, 0); }
		public ParExprContext(FactorContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PL0Listener ) ((PL0Listener)listener).enterParExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PL0Listener ) ((PL0Listener)listener).exitParExpr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PL0Visitor ) return ((PL0Visitor<? extends T>)visitor).visitParExpr(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class IdentFactorContext extends FactorContext {
		public TerminalNode Ident() { return getToken(PL0Parser.Ident, 0); }
		public IdentFactorContext(FactorContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PL0Listener ) ((PL0Listener)listener).enterIdentFactor(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PL0Listener ) ((PL0Listener)listener).exitIdentFactor(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PL0Visitor ) return ((PL0Visitor<? extends T>)visitor).visitIdentFactor(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FactorContext factor() throws RecognitionException {
		FactorContext _localctx = new FactorContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_factor);
		try {
			setState(140);
			switch (_input.LA(1)) {
			case Ident:
				_localctx = new IdentFactorContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(134); match(Ident);
				}
				break;
			case Number:
				_localctx = new NumberFactorContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(135); match(Number);
				}
				break;
			case OPAR:
				_localctx = new ParExprContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(136); match(OPAR);
				setState(137); expression();
				setState(138); match(CPAR);
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

	public static final String _serializedATN =
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\3*\u0091\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\3\2\3\2\3\2\3\3\5\3\37\n\3\3\3\5\3\"\n\3\3\3\7\3%"+
		"\n\3\f\3\16\3(\13\3\3\3\3\3\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\7\4\64\n\4"+
		"\f\4\16\4\67\13\4\3\4\3\4\3\5\3\5\3\5\3\5\7\5?\n\5\f\5\16\5B\13\5\3\5"+
		"\3\5\3\6\3\6\3\6\3\6\3\6\3\6\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3"+
		"\7\7\7W\n\7\f\7\16\7Z\13\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7"+
		"\3\7\5\7h\n\7\3\b\3\b\3\b\3\b\3\b\3\b\5\bp\n\b\3\t\5\ts\n\t\3\t\3\t\7"+
		"\tw\n\t\f\t\16\tz\13\t\3\n\3\n\3\n\3\13\3\13\7\13\u0081\n\13\f\13\16\13"+
		"\u0084\13\13\3\f\3\f\3\f\3\r\3\r\3\r\3\r\3\r\3\r\5\r\u008f\n\r\3\r\2\2"+
		"\16\2\4\6\b\n\f\16\20\22\24\26\30\2\5\4\2\b\b\n\r\3\2\16\17\3\2\20\21"+
		"\u0095\2\32\3\2\2\2\4\36\3\2\2\2\6+\3\2\2\2\b:\3\2\2\2\nE\3\2\2\2\fg\3"+
		"\2\2\2\16o\3\2\2\2\20r\3\2\2\2\22{\3\2\2\2\24~\3\2\2\2\26\u0085\3\2\2"+
		"\2\30\u008e\3\2\2\2\32\33\5\4\3\2\33\34\7\30\2\2\34\3\3\2\2\2\35\37\5"+
		"\6\4\2\36\35\3\2\2\2\36\37\3\2\2\2\37!\3\2\2\2 \"\5\b\5\2! \3\2\2\2!\""+
		"\3\2\2\2\"&\3\2\2\2#%\5\n\6\2$#\3\2\2\2%(\3\2\2\2&$\3\2\2\2&\'\3\2\2\2"+
		"\')\3\2\2\2(&\3\2\2\2)*\5\f\7\2*\5\3\2\2\2+,\7$\2\2,-\7%\2\2-.\7\22\2"+
		"\2.\65\7&\2\2/\60\7\26\2\2\60\61\7%\2\2\61\62\7\22\2\2\62\64\7&\2\2\63"+
		"/\3\2\2\2\64\67\3\2\2\2\65\63\3\2\2\2\65\66\3\2\2\2\668\3\2\2\2\67\65"+
		"\3\2\2\289\7\27\2\29\7\3\2\2\2:;\7#\2\2;@\7%\2\2<=\7\26\2\2=?\7%\2\2>"+
		"<\3\2\2\2?B\3\2\2\2@>\3\2\2\2@A\3\2\2\2AC\3\2\2\2B@\3\2\2\2CD\7\27\2\2"+
		"D\t\3\2\2\2EF\7\"\2\2FG\7%\2\2GH\7\27\2\2HI\5\4\3\2IJ\7\27\2\2J\13\3\2"+
		"\2\2KL\7%\2\2LM\7\23\2\2Mh\5\20\t\2NO\7\4\2\2Oh\7%\2\2PQ\7\5\2\2Qh\7%"+
		"\2\2RS\7 \2\2SX\5\f\7\2TU\7\27\2\2UW\5\f\7\2VT\3\2\2\2WZ\3\2\2\2XV\3\2"+
		"\2\2XY\3\2\2\2Y[\3\2\2\2ZX\3\2\2\2[\\\7!\2\2\\h\3\2\2\2]^\7\33\2\2^_\5"+
		"\16\b\2_`\7\37\2\2`a\5\f\7\2ah\3\2\2\2bc\7\35\2\2cd\5\16\b\2de\7\36\2"+
		"\2ef\5\f\7\2fh\3\2\2\2gK\3\2\2\2gN\3\2\2\2gP\3\2\2\2gR\3\2\2\2g]\3\2\2"+
		"\2gb\3\2\2\2h\r\3\2\2\2ij\7\3\2\2jp\5\20\t\2kl\5\20\t\2lm\t\2\2\2mn\5"+
		"\20\t\2np\3\2\2\2oi\3\2\2\2ok\3\2\2\2p\17\3\2\2\2qs\t\3\2\2rq\3\2\2\2"+
		"rs\3\2\2\2st\3\2\2\2tx\5\24\13\2uw\5\22\n\2vu\3\2\2\2wz\3\2\2\2xv\3\2"+
		"\2\2xy\3\2\2\2y\21\3\2\2\2zx\3\2\2\2{|\t\3\2\2|}\5\24\13\2}\23\3\2\2\2"+
		"~\u0082\5\30\r\2\177\u0081\5\26\f\2\u0080\177\3\2\2\2\u0081\u0084\3\2"+
		"\2\2\u0082\u0080\3\2\2\2\u0082\u0083\3\2\2\2\u0083\25\3\2\2\2\u0084\u0082"+
		"\3\2\2\2\u0085\u0086\t\4\2\2\u0086\u0087\5\30\r\2\u0087\27\3\2\2\2\u0088"+
		"\u008f\7%\2\2\u0089\u008f\7&\2\2\u008a\u008b\7\24\2\2\u008b\u008c\5\20"+
		"\t\2\u008c\u008d\7\25\2\2\u008d\u008f\3\2\2\2\u008e\u0088\3\2\2\2\u008e"+
		"\u0089\3\2\2\2\u008e\u008a\3\2\2\2\u008f\31\3\2\2\2\16\36!&\65@Xgorx\u0082"+
		"\u008e";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}