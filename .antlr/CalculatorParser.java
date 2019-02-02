// Generated from c:\Users\Michael McNally\Desktop\Prog Language Concepts\GrammarCalculator\Calculator.g4 by ANTLR 4.7.1

    import java.util.*;

import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class CalculatorParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.7.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, T__7=8, T__8=9, 
		T__9=10, T__10=11, T__11=12, T__12=13, T__13=14, T__14=15, T__15=16, T__16=17, 
		VAR=18, ID=19, DBL=20, COMMENT=21, WS=22;
	public static final int
		RULE_exprList = 0, RULE_varDef = 1, RULE_topExpr = 2, RULE_expr = 3;
	public static final String[] ruleNames = {
		"exprList", "varDef", "topExpr", "expr"
	};

	private static final String[] _LITERAL_NAMES = {
		null, "';'", "'='", "'*'", "'/'", "'+'", "'-'", "'&&'", "'||'", "'!'", 
		"'sqrt('", "')'", "'s('", "'c('", "'l('", "'e('", "'print('", "'('", "'var'"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, null, null, null, null, null, "VAR", "ID", "DBL", "COMMENT", "WS"
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
	public String getGrammarFileName() { return "Calculator.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }


	    Map<String, Double> varMap = new HashMap<String, Double>();

	public CalculatorParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}
	public static class ExprListContext extends ParserRuleContext {
		public List<TopExprContext> topExpr() {
			return getRuleContexts(TopExprContext.class);
		}
		public TopExprContext topExpr(int i) {
			return getRuleContext(TopExprContext.class,i);
		}
		public ExprListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_exprList; }
	}

	public final ExprListContext exprList() throws RecognitionException {
		ExprListContext _localctx = new ExprListContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_exprList);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(8);
			topExpr();
			setState(13);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,0,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(9);
					match(T__0);
					setState(10);
					topExpr();
					}
					} 
				}
				setState(15);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,0,_ctx);
			}
			setState(17);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__0) {
				{
				setState(16);
				match(T__0);
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

	public static class VarDefContext extends ParserRuleContext {
		public TerminalNode VAR() { return getToken(CalculatorParser.VAR, 0); }
		public TerminalNode ID() { return getToken(CalculatorParser.ID, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public VarDefContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_varDef; }
	}

	public final VarDefContext varDef() throws RecognitionException {
		VarDefContext _localctx = new VarDefContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_varDef);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(19);
			match(VAR);
			setState(20);
			match(ID);
			setState(21);
			match(T__1);
			setState(22);
			expr(0);
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

	public static class TopExprContext extends ParserRuleContext {
		public ExprContext expr;
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TopExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_topExpr; }
	}

	public final TopExprContext topExpr() throws RecognitionException {
		TopExprContext _localctx = new TopExprContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_topExpr);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(24);
			((TopExprContext)_localctx).expr = expr(0);
			 System.out.println("result: " + Double.toString(((TopExprContext)_localctx).expr.i));
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

	public static class ExprContext extends ParserRuleContext {
		public Double i;
		public ExprContext el;
		public Token op;
		public ExprContext e;
		public Token DBL;
		public Token ID;
		public ExprContext er;
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public TerminalNode VAR() { return getToken(CalculatorParser.VAR, 0); }
		public VarDefContext varDef() {
			return getRuleContext(VarDefContext.class,0);
		}
		public TerminalNode DBL() { return getToken(CalculatorParser.DBL, 0); }
		public TerminalNode ID() { return getToken(CalculatorParser.ID, 0); }
		public TerminalNode COMMENT() { return getToken(CalculatorParser.COMMENT, 0); }
		public ExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expr; }
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
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(74);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,2,_ctx) ) {
			case 1:
				{
				setState(28);
				((ExprContext)_localctx).op = match(T__8);
				setState(29);
				((ExprContext)_localctx).e = expr(13);
				 if(((ExprContext)_localctx).e.i != 0.0 ) {((ExprContext)_localctx).i =  0.0;} else {((ExprContext)_localctx).i =  1.0;} System.out.println(_localctx.i);
				}
				break;
			case 2:
				{
				setState(32);
				((ExprContext)_localctx).op = match(T__9);
				setState(33);
				((ExprContext)_localctx).e = expr(0);
				setState(34);
				match(T__10);
				 ((ExprContext)_localctx).i =  (Math.sqrt(((ExprContext)_localctx).e.i)); System.out.println(_localctx.i);
				}
				break;
			case 3:
				{
				setState(37);
				((ExprContext)_localctx).op = match(T__11);
				setState(38);
				((ExprContext)_localctx).e = expr(0);
				setState(39);
				match(T__10);
				 ((ExprContext)_localctx).i =  (Math.sin(((ExprContext)_localctx).e.i)); System.out.println(_localctx.i);
				}
				break;
			case 4:
				{
				setState(42);
				((ExprContext)_localctx).op = match(T__12);
				setState(43);
				((ExprContext)_localctx).e = expr(0);
				setState(44);
				match(T__10);
				 ((ExprContext)_localctx).i =  (Math.cos(((ExprContext)_localctx).e.i)); System.out.println(_localctx.i);
				}
				break;
			case 5:
				{
				setState(47);
				((ExprContext)_localctx).op = match(T__13);
				setState(48);
				((ExprContext)_localctx).e = expr(0);
				setState(49);
				match(T__10);
				 ((ExprContext)_localctx).i =  (Math.log(((ExprContext)_localctx).e.i)); System.out.println(_localctx.i);
				}
				break;
			case 6:
				{
				setState(52);
				((ExprContext)_localctx).op = match(T__14);
				setState(53);
				((ExprContext)_localctx).e = expr(0);
				setState(54);
				match(T__10);
				 ((ExprContext)_localctx).i =  (Math.exp(((ExprContext)_localctx).e.i)); System.out.println(_localctx.i);
				}
				break;
			case 7:
				{
				setState(57);
				((ExprContext)_localctx).op = match(T__15);
				setState(58);
				((ExprContext)_localctx).e = expr(0);
				setState(59);
				match(T__10);
				 ((ExprContext)_localctx).i =  1.0; System.out.println(((ExprContext)_localctx).e.i);
				}
				break;
			case 8:
				{
				setState(62);
				match(VAR);
				}
				break;
			case 9:
				{
				setState(63);
				varDef();
				 ((ExprContext)_localctx).i =  1.0; varMap.put(((ExprContext)_localctx).ID.getText(), Double.parseDouble((((ExprContext)_localctx).DBL!=null?((ExprContext)_localctx).DBL.getText():null))); System.out.println(varMap.get(((ExprContext)_localctx).ID.getText()));
				}
				break;
			case 10:
				{
				setState(66);
				((ExprContext)_localctx).DBL = match(DBL);
				 ((ExprContext)_localctx).i = Double.parseDouble((((ExprContext)_localctx).DBL!=null?((ExprContext)_localctx).DBL.getText():null)); 
				}
				break;
			case 11:
				{
				setState(68);
				((ExprContext)_localctx).ID = match(ID);
				}
				break;
			case 12:
				{
				setState(69);
				match(COMMENT);
				}
				break;
			case 13:
				{
				setState(70);
				match(T__16);
				setState(71);
				((ExprContext)_localctx).e = expr(0);
				setState(72);
				match(T__10);
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(108);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,4,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(106);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,3,_ctx) ) {
					case 1:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						_localctx.el = _prevctx;
						_localctx.el = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(76);
						if (!(precpred(_ctx, 19))) throw new FailedPredicateException(this, "precpred(_ctx, 19)");
						setState(77);
						((ExprContext)_localctx).op = match(T__2);
						setState(78);
						((ExprContext)_localctx).er = expr(20);
						 ((ExprContext)_localctx).i = ((ExprContext)_localctx).el.i*((ExprContext)_localctx).er.i; System.out.println(_localctx.i);
						}
						break;
					case 2:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						_localctx.el = _prevctx;
						_localctx.el = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(81);
						if (!(precpred(_ctx, 18))) throw new FailedPredicateException(this, "precpred(_ctx, 18)");
						setState(82);
						((ExprContext)_localctx).op = match(T__3);
						setState(83);
						((ExprContext)_localctx).er = expr(19);
						 ((ExprContext)_localctx).i = ((ExprContext)_localctx).el.i/((ExprContext)_localctx).er.i; System.out.println(_localctx.i);
						}
						break;
					case 3:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						_localctx.el = _prevctx;
						_localctx.el = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(86);
						if (!(precpred(_ctx, 17))) throw new FailedPredicateException(this, "precpred(_ctx, 17)");
						setState(87);
						((ExprContext)_localctx).op = match(T__4);
						setState(88);
						((ExprContext)_localctx).er = expr(18);
						 ((ExprContext)_localctx).i = ((ExprContext)_localctx).el.i+((ExprContext)_localctx).er.i; System.out.println(_localctx.i);
						}
						break;
					case 4:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						_localctx.el = _prevctx;
						_localctx.el = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(91);
						if (!(precpred(_ctx, 16))) throw new FailedPredicateException(this, "precpred(_ctx, 16)");
						setState(92);
						((ExprContext)_localctx).op = match(T__5);
						setState(93);
						((ExprContext)_localctx).er = expr(17);
						 ((ExprContext)_localctx).i = ((ExprContext)_localctx).el.i-((ExprContext)_localctx).er.i; System.out.println(_localctx.i);
						}
						break;
					case 5:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						_localctx.el = _prevctx;
						_localctx.el = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(96);
						if (!(precpred(_ctx, 15))) throw new FailedPredicateException(this, "precpred(_ctx, 15)");
						setState(97);
						((ExprContext)_localctx).op = match(T__6);
						setState(98);
						((ExprContext)_localctx).er = expr(16);
						 if(((ExprContext)_localctx).el.i != 0.0 && ((ExprContext)_localctx).er.i != 0.0 ) {((ExprContext)_localctx).i =  1.0;} else {((ExprContext)_localctx).i =  0.0;} System.out.println(_localctx.i);
						}
						break;
					case 6:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						_localctx.el = _prevctx;
						_localctx.el = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(101);
						if (!(precpred(_ctx, 14))) throw new FailedPredicateException(this, "precpred(_ctx, 14)");
						setState(102);
						((ExprContext)_localctx).op = match(T__7);
						setState(103);
						((ExprContext)_localctx).er = expr(15);
						 if(((ExprContext)_localctx).el.i != 0.0 || ((ExprContext)_localctx).er.i != 0.0 ) {((ExprContext)_localctx).i =  1.0;} else {((ExprContext)_localctx).i =  0.0;} System.out.println(_localctx.i);
						}
						break;
					}
					} 
				}
				setState(110);
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
			unrollRecursionContexts(_parentctx);
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
			return precpred(_ctx, 19);
		case 1:
			return precpred(_ctx, 18);
		case 2:
			return precpred(_ctx, 17);
		case 3:
			return precpred(_ctx, 16);
		case 4:
			return precpred(_ctx, 15);
		case 5:
			return precpred(_ctx, 14);
		}
		return true;
	}

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3\30r\4\2\t\2\4\3\t"+
		"\3\4\4\t\4\4\5\t\5\3\2\3\2\3\2\7\2\16\n\2\f\2\16\2\21\13\2\3\2\5\2\24"+
		"\n\2\3\3\3\3\3\3\3\3\3\3\3\4\3\4\3\4\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3"+
		"\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5"+
		"\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3"+
		"\5\3\5\3\5\3\5\5\5M\n\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3"+
		"\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5"+
		"\3\5\7\5m\n\5\f\5\16\5p\13\5\3\5\2\3\b\6\2\4\6\b\2\2\2\u0081\2\n\3\2\2"+
		"\2\4\25\3\2\2\2\6\32\3\2\2\2\bL\3\2\2\2\n\17\5\6\4\2\13\f\7\3\2\2\f\16"+
		"\5\6\4\2\r\13\3\2\2\2\16\21\3\2\2\2\17\r\3\2\2\2\17\20\3\2\2\2\20\23\3"+
		"\2\2\2\21\17\3\2\2\2\22\24\7\3\2\2\23\22\3\2\2\2\23\24\3\2\2\2\24\3\3"+
		"\2\2\2\25\26\7\24\2\2\26\27\7\25\2\2\27\30\7\4\2\2\30\31\5\b\5\2\31\5"+
		"\3\2\2\2\32\33\5\b\5\2\33\34\b\4\1\2\34\7\3\2\2\2\35\36\b\5\1\2\36\37"+
		"\7\13\2\2\37 \5\b\5\17 !\b\5\1\2!M\3\2\2\2\"#\7\f\2\2#$\5\b\5\2$%\7\r"+
		"\2\2%&\b\5\1\2&M\3\2\2\2\'(\7\16\2\2()\5\b\5\2)*\7\r\2\2*+\b\5\1\2+M\3"+
		"\2\2\2,-\7\17\2\2-.\5\b\5\2./\7\r\2\2/\60\b\5\1\2\60M\3\2\2\2\61\62\7"+
		"\20\2\2\62\63\5\b\5\2\63\64\7\r\2\2\64\65\b\5\1\2\65M\3\2\2\2\66\67\7"+
		"\21\2\2\678\5\b\5\289\7\r\2\29:\b\5\1\2:M\3\2\2\2;<\7\22\2\2<=\5\b\5\2"+
		"=>\7\r\2\2>?\b\5\1\2?M\3\2\2\2@M\7\24\2\2AB\5\4\3\2BC\b\5\1\2CM\3\2\2"+
		"\2DE\7\26\2\2EM\b\5\1\2FM\7\25\2\2GM\7\27\2\2HI\7\23\2\2IJ\5\b\5\2JK\7"+
		"\r\2\2KM\3\2\2\2L\35\3\2\2\2L\"\3\2\2\2L\'\3\2\2\2L,\3\2\2\2L\61\3\2\2"+
		"\2L\66\3\2\2\2L;\3\2\2\2L@\3\2\2\2LA\3\2\2\2LD\3\2\2\2LF\3\2\2\2LG\3\2"+
		"\2\2LH\3\2\2\2Mn\3\2\2\2NO\f\25\2\2OP\7\5\2\2PQ\5\b\5\26QR\b\5\1\2Rm\3"+
		"\2\2\2ST\f\24\2\2TU\7\6\2\2UV\5\b\5\25VW\b\5\1\2Wm\3\2\2\2XY\f\23\2\2"+
		"YZ\7\7\2\2Z[\5\b\5\24[\\\b\5\1\2\\m\3\2\2\2]^\f\22\2\2^_\7\b\2\2_`\5\b"+
		"\5\23`a\b\5\1\2am\3\2\2\2bc\f\21\2\2cd\7\t\2\2de\5\b\5\22ef\b\5\1\2fm"+
		"\3\2\2\2gh\f\20\2\2hi\7\n\2\2ij\5\b\5\21jk\b\5\1\2km\3\2\2\2lN\3\2\2\2"+
		"lS\3\2\2\2lX\3\2\2\2l]\3\2\2\2lb\3\2\2\2lg\3\2\2\2mp\3\2\2\2nl\3\2\2\2"+
		"no\3\2\2\2o\t\3\2\2\2pn\3\2\2\2\7\17\23Lln";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}