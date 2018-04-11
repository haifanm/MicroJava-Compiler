// Generated from C:/Users/MSE/IdeaProjects/java/src\gr.g4 by ANTLR 4.7

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Stack;


import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class grParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.7", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, WhiteSpace=2, Comments=3, Unknown=4, TOK_INTLIT=5, TOK_CLASS=6, 
		TOK_FINAL=7, TOK_ELSE=8, TOK_IF=9, TOK_NEW=10, TOK_READ=11, TOK_RETURN=12, 
		TOK_VOID=13, TOK_WHILE=14, TOK_PRINT=15, TOK_PROGRAM=16, TOK_COMMA=17, 
		TOK_SEMI=18, TOK_DOT=19, TOK_LB=20, TOK_RB=21, TOK_LCB=22, TOK_RCB=23, 
		TOK_LP=24, TOK_RP=25, TOK_OP_REL=26, TOK_OP_ADD=27, TOK_OP_TIMES=28, TOK_EQ=29, 
		TOK_OP_NE=30, TOK_OP_LT=31, TOK_OP_LE=32, TOK_OP_GT=33, TOK_OP_GE=34, 
		TOK_OP_ASSIGN=35, OP_ADD_PLUS=36, OP_ADD_MINUS=37, OP_MUL_TIMES=38, OP_MUL_DIV=39, 
		OP_MUL_MOD=40, TOK_INVALID_IDENTIFIER=41, TOK_IDENTIFIER=42, TOK_INVALID_CHARLIT=43, 
		TOK_CHARLIT=44, UNRECOGNIZED_SYMBOL=45;
	public static final int
		RULE_program = 0, RULE_prog = 1, RULE_tok_rcb = 2, RULE_varDecl = 3, RULE_constDecl = 4, 
		RULE_classDecl = 5, RULE_methodDecl = 6, RULE_formPars = 7, RULE_block = 8, 
		RULE_statement = 9, RULE_actPars = 10, RULE_condition = 11, RULE_relop = 12, 
		RULE_expr = 13, RULE_term = 14, RULE_factor = 15, RULE_designator = 16, 
		RULE_x = 17, RULE_validarray = 18, RULE_invalidarray = 19, RULE_tok_lb = 20, 
		RULE_tok_rb = 21, RULE_semi = 22, RULE_varType = 23, RULE_vartp = 24, 
		RULE_varArray = 25;
	public static final String[] ruleNames = {
		"program", "prog", "tok_rcb", "varDecl", "constDecl", "classDecl", "methodDecl", 
		"formPars", "block", "statement", "actPars", "condition", "relop", "expr", 
		"term", "factor", "designator", "x", "validarray", "invalidarray", "tok_lb", 
		"tok_rb", "semi", "varType", "vartp", "varArray"
	};

	private static final String[] _LITERAL_NAMES = {
		null, "'''", null, null, null, null, "'class'", "'final'", "'else'", "'if'", 
		"'new'", "'read'", "'return'", "'void'", "'while'", "'print'", "'program'", 
		"','", "';'", "'.'", "'['", "']'", "'{'", "'}'", "'('", "')'", null, null, 
		null, "'=='", "'!='", "'<'", null, "'>'", null, "'='", "'+'", "'-'", "'*'", 
		"'/'", "'%'"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, null, "WhiteSpace", "Comments", "Unknown", "TOK_INTLIT", "TOK_CLASS", 
		"TOK_FINAL", "TOK_ELSE", "TOK_IF", "TOK_NEW", "TOK_READ", "TOK_RETURN", 
		"TOK_VOID", "TOK_WHILE", "TOK_PRINT", "TOK_PROGRAM", "TOK_COMMA", "TOK_SEMI", 
		"TOK_DOT", "TOK_LB", "TOK_RB", "TOK_LCB", "TOK_RCB", "TOK_LP", "TOK_RP", 
		"TOK_OP_REL", "TOK_OP_ADD", "TOK_OP_TIMES", "TOK_EQ", "TOK_OP_NE", "TOK_OP_LT", 
		"TOK_OP_LE", "TOK_OP_GT", "TOK_OP_GE", "TOK_OP_ASSIGN", "OP_ADD_PLUS", 
		"OP_ADD_MINUS", "OP_MUL_TIMES", "OP_MUL_DIV", "OP_MUL_MOD", "TOK_INVALID_IDENTIFIER", 
		"TOK_IDENTIFIER", "TOK_INVALID_CHARLIT", "TOK_CHARLIT", "UNRECOGNIZED_SYMBOL"
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
	public String getGrammarFileName() { return "gr.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }


	grLexer lexer;
	public void setLexer(grLexer lexer){
				this.lexer=lexer;
			}
	        @Override
			public void enterRule(ParserRuleContext localctx, int state, int ruleIndex) {
	        super.enterRule(localctx, state, ruleIndex);

	        	if (ruleNames[ruleIndex].equals("methodDecl")) {
	            					lexer.isMethod = 1;
	            				} else if (lexer.isMethod == 1) {
	            					if (ruleNames[ruleIndex].equals("varType")) {
	            						lexer.methodParams += " "+lexer.getText();
	            					}

	            				}
	            				else if(ruleNames[ruleIndex].equals("varArray")) {
	                                lexer.isArray=1;
	                            }
	                            else if(ruleNames[ruleIndex].equals("semi")) {
	                                lexer.isClass=0;
	                                lexer.isArray=0;

	                            }
	                            else if(ruleNames[ruleIndex].equals("tok_lcb")) {
	                                lexer.isClass=0;
	                                lexer.isArray=0;
	                            }
	                             else if(ruleNames[ruleIndex].equals("tok_rcb")) {
	                                lexer.isClass=0;
	                                lexer.isArray=0;
	                                lexer.isField=0;
	                            }


	        }

	public grParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}
	public static class ProgramContext extends ParserRuleContext {
		public ProgContext prog() {
			return getRuleContext(ProgContext.class,0);
		}
		public ProgramContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_program; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof grListener ) ((grListener)listener).enterProgram(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof grListener ) ((grListener)listener).exitProgram(this);
		}
	}

	public final ProgramContext program() throws RecognitionException {
		ProgramContext _localctx = new ProgramContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_program);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(52);
			prog();
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

	public static class ProgContext extends ParserRuleContext {
		public TerminalNode TOK_PROGRAM() { return getToken(grParser.TOK_PROGRAM, 0); }
		public TerminalNode TOK_IDENTIFIER() { return getToken(grParser.TOK_IDENTIFIER, 0); }
		public TerminalNode TOK_LCB() { return getToken(grParser.TOK_LCB, 0); }
		public Tok_rcbContext tok_rcb() {
			return getRuleContext(Tok_rcbContext.class,0);
		}
		public TerminalNode EOF() { return getToken(grParser.EOF, 0); }
		public List<ConstDeclContext> constDecl() {
			return getRuleContexts(ConstDeclContext.class);
		}
		public ConstDeclContext constDecl(int i) {
			return getRuleContext(ConstDeclContext.class,i);
		}
		public List<VarDeclContext> varDecl() {
			return getRuleContexts(VarDeclContext.class);
		}
		public VarDeclContext varDecl(int i) {
			return getRuleContext(VarDeclContext.class,i);
		}
		public List<ClassDeclContext> classDecl() {
			return getRuleContexts(ClassDeclContext.class);
		}
		public ClassDeclContext classDecl(int i) {
			return getRuleContext(ClassDeclContext.class,i);
		}
		public List<MethodDeclContext> methodDecl() {
			return getRuleContexts(MethodDeclContext.class);
		}
		public MethodDeclContext methodDecl(int i) {
			return getRuleContext(MethodDeclContext.class,i);
		}
		public ProgContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_prog; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof grListener ) ((grListener)listener).enterProg(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof grListener ) ((grListener)listener).exitProg(this);
		}
	}

	public final ProgContext prog() throws RecognitionException {
		ProgContext _localctx = new ProgContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_prog);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(54);
			match(TOK_PROGRAM);
			setState(55);
			match(TOK_IDENTIFIER);
			setState(61);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << TOK_CLASS) | (1L << TOK_FINAL) | (1L << TOK_IDENTIFIER))) != 0)) {
				{
				setState(59);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case TOK_FINAL:
					{
					setState(56);
					constDecl();
					}
					break;
				case TOK_IDENTIFIER:
					{
					setState(57);
					varDecl();
					}
					break;
				case TOK_CLASS:
					{
					setState(58);
					classDecl();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				setState(63);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(64);
			match(TOK_LCB);
			setState(68);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==TOK_VOID || _la==TOK_IDENTIFIER) {
				{
				{
				setState(65);
				methodDecl();
				}
				}
				setState(70);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(71);
			tok_rcb();
			setState(72);
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

	public static class Tok_rcbContext extends ParserRuleContext {
		public TerminalNode TOK_RCB() { return getToken(grParser.TOK_RCB, 0); }
		public Tok_rcbContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_tok_rcb; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof grListener ) ((grListener)listener).enterTok_rcb(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof grListener ) ((grListener)listener).exitTok_rcb(this);
		}
	}

	public final Tok_rcbContext tok_rcb() throws RecognitionException {
		Tok_rcbContext _localctx = new Tok_rcbContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_tok_rcb);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(74);
			match(TOK_RCB);
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

	public static class VarDeclContext extends ParserRuleContext {
		public VarTypeContext varType() {
			return getRuleContext(VarTypeContext.class,0);
		}
		public List<TerminalNode> TOK_IDENTIFIER() { return getTokens(grParser.TOK_IDENTIFIER); }
		public TerminalNode TOK_IDENTIFIER(int i) {
			return getToken(grParser.TOK_IDENTIFIER, i);
		}
		public SemiContext semi() {
			return getRuleContext(SemiContext.class,0);
		}
		public List<TerminalNode> TOK_COMMA() { return getTokens(grParser.TOK_COMMA); }
		public TerminalNode TOK_COMMA(int i) {
			return getToken(grParser.TOK_COMMA, i);
		}
		public VarDeclContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_varDecl; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof grListener ) ((grListener)listener).enterVarDecl(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof grListener ) ((grListener)listener).exitVarDecl(this);
		}
	}

	public final VarDeclContext varDecl() throws RecognitionException {
		VarDeclContext _localctx = new VarDeclContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_varDecl);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(76);
			varType();
			setState(77);
			match(TOK_IDENTIFIER);
			setState(82);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==TOK_COMMA) {
				{
				{
				setState(78);
				match(TOK_COMMA);
				setState(79);
				match(TOK_IDENTIFIER);
				}
				}
				setState(84);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(85);
			semi();
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

	public static class ConstDeclContext extends ParserRuleContext {
		public TerminalNode TOK_FINAL() { return getToken(grParser.TOK_FINAL, 0); }
		public VarTypeContext varType() {
			return getRuleContext(VarTypeContext.class,0);
		}
		public TerminalNode TOK_IDENTIFIER() { return getToken(grParser.TOK_IDENTIFIER, 0); }
		public TerminalNode TOK_OP_ASSIGN() { return getToken(grParser.TOK_OP_ASSIGN, 0); }
		public SemiContext semi() {
			return getRuleContext(SemiContext.class,0);
		}
		public TerminalNode TOK_INTLIT() { return getToken(grParser.TOK_INTLIT, 0); }
		public TerminalNode TOK_CHARLIT() { return getToken(grParser.TOK_CHARLIT, 0); }
		public ConstDeclContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_constDecl; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof grListener ) ((grListener)listener).enterConstDecl(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof grListener ) ((grListener)listener).exitConstDecl(this);
		}
	}

	public final ConstDeclContext constDecl() throws RecognitionException {
		ConstDeclContext _localctx = new ConstDeclContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_constDecl);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(87);
			match(TOK_FINAL);
			setState(88);
			varType();
			setState(89);
			match(TOK_IDENTIFIER);
			setState(90);
			match(TOK_OP_ASSIGN);
			setState(91);
			_la = _input.LA(1);
			if ( !(_la==TOK_INTLIT || _la==TOK_CHARLIT) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(92);
			semi();
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

	public static class ClassDeclContext extends ParserRuleContext {
		public TerminalNode TOK_CLASS() { return getToken(grParser.TOK_CLASS, 0); }
		public TerminalNode TOK_IDENTIFIER() { return getToken(grParser.TOK_IDENTIFIER, 0); }
		public TerminalNode TOK_LCB() { return getToken(grParser.TOK_LCB, 0); }
		public Tok_rcbContext tok_rcb() {
			return getRuleContext(Tok_rcbContext.class,0);
		}
		public List<VarDeclContext> varDecl() {
			return getRuleContexts(VarDeclContext.class);
		}
		public VarDeclContext varDecl(int i) {
			return getRuleContext(VarDeclContext.class,i);
		}
		public ClassDeclContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_classDecl; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof grListener ) ((grListener)listener).enterClassDecl(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof grListener ) ((grListener)listener).exitClassDecl(this);
		}
	}

	public final ClassDeclContext classDecl() throws RecognitionException {
		ClassDeclContext _localctx = new ClassDeclContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_classDecl);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(94);
			match(TOK_CLASS);
			setState(95);
			match(TOK_IDENTIFIER);
			setState(96);
			match(TOK_LCB);
			setState(100);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==TOK_IDENTIFIER) {
				{
				{
				setState(97);
				varDecl();
				}
				}
				setState(102);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(103);
			tok_rcb();
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

	public static class MethodDeclContext extends ParserRuleContext {
		public TerminalNode TOK_IDENTIFIER() { return getToken(grParser.TOK_IDENTIFIER, 0); }
		public TerminalNode TOK_LP() { return getToken(grParser.TOK_LP, 0); }
		public TerminalNode TOK_RP() { return getToken(grParser.TOK_RP, 0); }
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public VarTypeContext varType() {
			return getRuleContext(VarTypeContext.class,0);
		}
		public TerminalNode TOK_VOID() { return getToken(grParser.TOK_VOID, 0); }
		public FormParsContext formPars() {
			return getRuleContext(FormParsContext.class,0);
		}
		public List<VarDeclContext> varDecl() {
			return getRuleContexts(VarDeclContext.class);
		}
		public VarDeclContext varDecl(int i) {
			return getRuleContext(VarDeclContext.class,i);
		}
		public MethodDeclContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_methodDecl; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof grListener ) ((grListener)listener).enterMethodDecl(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof grListener ) ((grListener)listener).exitMethodDecl(this);
		}
	}

	public final MethodDeclContext methodDecl() throws RecognitionException {
		MethodDeclContext _localctx = new MethodDeclContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_methodDecl);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(107);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case TOK_IDENTIFIER:
				{
				setState(105);
				varType();
				}
				break;
			case TOK_VOID:
				{
				setState(106);
				match(TOK_VOID);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(109);
			match(TOK_IDENTIFIER);
			setState(110);
			match(TOK_LP);
			setState(112);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==TOK_IDENTIFIER) {
				{
				setState(111);
				formPars();
				}
			}

			setState(114);
			match(TOK_RP);
			setState(118);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==TOK_IDENTIFIER) {
				{
				{
				setState(115);
				varDecl();
				}
				}
				setState(120);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(121);
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

	public static class FormParsContext extends ParserRuleContext {
		public List<VarTypeContext> varType() {
			return getRuleContexts(VarTypeContext.class);
		}
		public VarTypeContext varType(int i) {
			return getRuleContext(VarTypeContext.class,i);
		}
		public List<TerminalNode> TOK_IDENTIFIER() { return getTokens(grParser.TOK_IDENTIFIER); }
		public TerminalNode TOK_IDENTIFIER(int i) {
			return getToken(grParser.TOK_IDENTIFIER, i);
		}
		public List<TerminalNode> TOK_COMMA() { return getTokens(grParser.TOK_COMMA); }
		public TerminalNode TOK_COMMA(int i) {
			return getToken(grParser.TOK_COMMA, i);
		}
		public FormParsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_formPars; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof grListener ) ((grListener)listener).enterFormPars(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof grListener ) ((grListener)listener).exitFormPars(this);
		}
	}

	public final FormParsContext formPars() throws RecognitionException {
		FormParsContext _localctx = new FormParsContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_formPars);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(123);
			varType();
			setState(124);
			match(TOK_IDENTIFIER);
			setState(131);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==TOK_COMMA) {
				{
				{
				setState(125);
				match(TOK_COMMA);
				setState(126);
				varType();
				setState(127);
				match(TOK_IDENTIFIER);
				}
				}
				setState(133);
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

	public static class BlockContext extends ParserRuleContext {
		public TerminalNode TOK_LCB() { return getToken(grParser.TOK_LCB, 0); }
		public Tok_rcbContext tok_rcb() {
			return getRuleContext(Tok_rcbContext.class,0);
		}
		public List<StatementContext> statement() {
			return getRuleContexts(StatementContext.class);
		}
		public StatementContext statement(int i) {
			return getRuleContext(StatementContext.class,i);
		}
		public BlockContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_block; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof grListener ) ((grListener)listener).enterBlock(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof grListener ) ((grListener)listener).exitBlock(this);
		}
	}

	public final BlockContext block() throws RecognitionException {
		BlockContext _localctx = new BlockContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_block);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(134);
			match(TOK_LCB);
			setState(138);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << TOK_IF) | (1L << TOK_READ) | (1L << TOK_RETURN) | (1L << TOK_WHILE) | (1L << TOK_PRINT) | (1L << TOK_SEMI) | (1L << TOK_LCB) | (1L << TOK_IDENTIFIER))) != 0)) {
				{
				{
				setState(135);
				statement();
				}
				}
				setState(140);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(141);
			tok_rcb();
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
		public DesignatorContext designator() {
			return getRuleContext(DesignatorContext.class,0);
		}
		public SemiContext semi() {
			return getRuleContext(SemiContext.class,0);
		}
		public TerminalNode TOK_OP_ASSIGN() { return getToken(grParser.TOK_OP_ASSIGN, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public ActParsContext actPars() {
			return getRuleContext(ActParsContext.class,0);
		}
		public TerminalNode TOK_IF() { return getToken(grParser.TOK_IF, 0); }
		public TerminalNode TOK_LP() { return getToken(grParser.TOK_LP, 0); }
		public ConditionContext condition() {
			return getRuleContext(ConditionContext.class,0);
		}
		public TerminalNode TOK_RP() { return getToken(grParser.TOK_RP, 0); }
		public List<TerminalNode> TOK_LCB() { return getTokens(grParser.TOK_LCB); }
		public TerminalNode TOK_LCB(int i) {
			return getToken(grParser.TOK_LCB, i);
		}
		public List<StatementContext> statement() {
			return getRuleContexts(StatementContext.class);
		}
		public StatementContext statement(int i) {
			return getRuleContext(StatementContext.class,i);
		}
		public List<Tok_rcbContext> tok_rcb() {
			return getRuleContexts(Tok_rcbContext.class);
		}
		public Tok_rcbContext tok_rcb(int i) {
			return getRuleContext(Tok_rcbContext.class,i);
		}
		public List<TerminalNode> TOK_ELSE() { return getTokens(grParser.TOK_ELSE); }
		public TerminalNode TOK_ELSE(int i) {
			return getToken(grParser.TOK_ELSE, i);
		}
		public TerminalNode TOK_WHILE() { return getToken(grParser.TOK_WHILE, 0); }
		public TerminalNode TOK_RETURN() { return getToken(grParser.TOK_RETURN, 0); }
		public TerminalNode TOK_READ() { return getToken(grParser.TOK_READ, 0); }
		public TerminalNode TOK_PRINT() { return getToken(grParser.TOK_PRINT, 0); }
		public TerminalNode TOK_COMMA() { return getToken(grParser.TOK_COMMA, 0); }
		public TerminalNode TOK_INTLIT() { return getToken(grParser.TOK_INTLIT, 0); }
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public StatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_statement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof grListener ) ((grListener)listener).enterStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof grListener ) ((grListener)listener).exitStatement(this);
		}
	}

	public final StatementContext statement() throws RecognitionException {
		StatementContext _localctx = new StatementContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_statement);
		int _la;
		try {
			int _alt;
			setState(209);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case TOK_IDENTIFIER:
				enterOuterAlt(_localctx, 1);
				{
				setState(143);
				designator();
				setState(147);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case TOK_OP_ASSIGN:
					{
					setState(144);
					match(TOK_OP_ASSIGN);
					setState(145);
					expr();
					}
					break;
				case TOK_LP:
					{
					setState(146);
					actPars();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(149);
				semi();
				}
				break;
			case TOK_IF:
				enterOuterAlt(_localctx, 2);
				{
				setState(151);
				match(TOK_IF);
				setState(152);
				match(TOK_LP);
				setState(153);
				condition();
				setState(154);
				match(TOK_RP);
				setState(156);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,11,_ctx) ) {
				case 1:
					{
					setState(155);
					match(TOK_LCB);
					}
					break;
				}
				setState(161);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,12,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(158);
						statement();
						}
						} 
					}
					setState(163);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,12,_ctx);
				}
				setState(165);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,13,_ctx) ) {
				case 1:
					{
					setState(164);
					tok_rcb();
					}
					break;
				}
				setState(177);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,16,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(167);
						match(TOK_ELSE);
						setState(169);
						_errHandler.sync(this);
						switch ( getInterpreter().adaptivePredict(_input,14,_ctx) ) {
						case 1:
							{
							setState(168);
							match(TOK_LCB);
							}
							break;
						}
						setState(171);
						statement();
						setState(173);
						_errHandler.sync(this);
						switch ( getInterpreter().adaptivePredict(_input,15,_ctx) ) {
						case 1:
							{
							setState(172);
							tok_rcb();
							}
							break;
						}
						}
						} 
					}
					setState(179);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,16,_ctx);
				}
				}
				break;
			case TOK_WHILE:
				enterOuterAlt(_localctx, 3);
				{
				setState(180);
				match(TOK_WHILE);
				setState(181);
				match(TOK_LP);
				setState(182);
				condition();
				setState(183);
				match(TOK_RP);
				setState(184);
				statement();
				}
				break;
			case TOK_RETURN:
				enterOuterAlt(_localctx, 4);
				{
				setState(186);
				match(TOK_RETURN);
				setState(188);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << TOK_INTLIT) | (1L << TOK_NEW) | (1L << TOK_LP) | (1L << OP_ADD_MINUS) | (1L << TOK_IDENTIFIER) | (1L << TOK_CHARLIT))) != 0)) {
					{
					setState(187);
					expr();
					}
				}

				setState(190);
				semi();
				}
				break;
			case TOK_READ:
				enterOuterAlt(_localctx, 5);
				{
				setState(191);
				match(TOK_READ);
				setState(192);
				match(TOK_LP);
				setState(193);
				designator();
				setState(194);
				match(TOK_RP);
				setState(195);
				semi();
				}
				break;
			case TOK_PRINT:
				enterOuterAlt(_localctx, 6);
				{
				setState(197);
				match(TOK_PRINT);
				setState(198);
				match(TOK_LP);
				setState(199);
				expr();
				setState(202);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==TOK_COMMA) {
					{
					setState(200);
					match(TOK_COMMA);
					setState(201);
					match(TOK_INTLIT);
					}
				}

				setState(204);
				match(TOK_RP);
				setState(205);
				semi();
				}
				break;
			case TOK_LCB:
				enterOuterAlt(_localctx, 7);
				{
				setState(207);
				block();
				}
				break;
			case TOK_SEMI:
				enterOuterAlt(_localctx, 8);
				{
				setState(208);
				semi();
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

	public static class ActParsContext extends ParserRuleContext {
		public TerminalNode TOK_LP() { return getToken(grParser.TOK_LP, 0); }
		public TerminalNode TOK_RP() { return getToken(grParser.TOK_RP, 0); }
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public List<TerminalNode> TOK_COMMA() { return getTokens(grParser.TOK_COMMA); }
		public TerminalNode TOK_COMMA(int i) {
			return getToken(grParser.TOK_COMMA, i);
		}
		public ActParsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_actPars; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof grListener ) ((grListener)listener).enterActPars(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof grListener ) ((grListener)listener).exitActPars(this);
		}
	}

	public final ActParsContext actPars() throws RecognitionException {
		ActParsContext _localctx = new ActParsContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_actPars);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(211);
			match(TOK_LP);
			setState(220);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << TOK_INTLIT) | (1L << TOK_NEW) | (1L << TOK_LP) | (1L << OP_ADD_MINUS) | (1L << TOK_IDENTIFIER) | (1L << TOK_CHARLIT))) != 0)) {
				{
				setState(212);
				expr();
				setState(217);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==TOK_COMMA) {
					{
					{
					setState(213);
					match(TOK_COMMA);
					setState(214);
					expr();
					}
					}
					setState(219);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
			}

			setState(222);
			match(TOK_RP);
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
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public RelopContext relop() {
			return getRuleContext(RelopContext.class,0);
		}
		public ConditionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_condition; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof grListener ) ((grListener)listener).enterCondition(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof grListener ) ((grListener)listener).exitCondition(this);
		}
	}

	public final ConditionContext condition() throws RecognitionException {
		ConditionContext _localctx = new ConditionContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_condition);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(224);
			expr();
			setState(225);
			relop();
			setState(226);
			expr();
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

	public static class RelopContext extends ParserRuleContext {
		public TerminalNode TOK_OP_REL() { return getToken(grParser.TOK_OP_REL, 0); }
		public RelopContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_relop; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof grListener ) ((grListener)listener).enterRelop(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof grListener ) ((grListener)listener).exitRelop(this);
		}
	}

	public final RelopContext relop() throws RecognitionException {
		RelopContext _localctx = new RelopContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_relop);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(228);
			match(TOK_OP_REL);
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
		public List<TermContext> term() {
			return getRuleContexts(TermContext.class);
		}
		public TermContext term(int i) {
			return getRuleContext(TermContext.class,i);
		}
		public List<TerminalNode> TOK_OP_ADD() { return getTokens(grParser.TOK_OP_ADD); }
		public TerminalNode TOK_OP_ADD(int i) {
			return getToken(grParser.TOK_OP_ADD, i);
		}
		public ExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expr; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof grListener ) ((grListener)listener).enterExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof grListener ) ((grListener)listener).exitExpr(this);
		}
	}

	public final ExprContext expr() throws RecognitionException {
		ExprContext _localctx = new ExprContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_expr);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(231);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==OP_ADD_MINUS) {
				{
				setState(230);
				match(OP_ADD_MINUS);
				}
			}

			setState(233);
			term();
			setState(238);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==TOK_OP_ADD) {
				{
				{
				setState(234);
				match(TOK_OP_ADD);
				setState(235);
				term();
				}
				}
				setState(240);
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

	public static class TermContext extends ParserRuleContext {
		public List<FactorContext> factor() {
			return getRuleContexts(FactorContext.class);
		}
		public FactorContext factor(int i) {
			return getRuleContext(FactorContext.class,i);
		}
		public List<TerminalNode> TOK_OP_TIMES() { return getTokens(grParser.TOK_OP_TIMES); }
		public TerminalNode TOK_OP_TIMES(int i) {
			return getToken(grParser.TOK_OP_TIMES, i);
		}
		public TermContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_term; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof grListener ) ((grListener)listener).enterTerm(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof grListener ) ((grListener)listener).exitTerm(this);
		}
	}

	public final TermContext term() throws RecognitionException {
		TermContext _localctx = new TermContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_term);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(241);
			factor();
			setState(246);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==TOK_OP_TIMES) {
				{
				{
				setState(242);
				match(TOK_OP_TIMES);
				setState(243);
				factor();
				}
				}
				setState(248);
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

	public static class FactorContext extends ParserRuleContext {
		public DesignatorContext designator() {
			return getRuleContext(DesignatorContext.class,0);
		}
		public ActParsContext actPars() {
			return getRuleContext(ActParsContext.class,0);
		}
		public TerminalNode TOK_INTLIT() { return getToken(grParser.TOK_INTLIT, 0); }
		public TerminalNode TOK_CHARLIT() { return getToken(grParser.TOK_CHARLIT, 0); }
		public TerminalNode TOK_NEW() { return getToken(grParser.TOK_NEW, 0); }
		public XContext x() {
			return getRuleContext(XContext.class,0);
		}
		public TerminalNode TOK_LP() { return getToken(grParser.TOK_LP, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TerminalNode TOK_RP() { return getToken(grParser.TOK_RP, 0); }
		public FactorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_factor; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof grListener ) ((grListener)listener).enterFactor(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof grListener ) ((grListener)listener).exitFactor(this);
		}
	}

	public final FactorContext factor() throws RecognitionException {
		FactorContext _localctx = new FactorContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_factor);
		int _la;
		try {
			setState(261);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case TOK_IDENTIFIER:
				enterOuterAlt(_localctx, 1);
				{
				setState(249);
				designator();
				setState(251);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==TOK_LP) {
					{
					setState(250);
					actPars();
					}
				}

				}
				break;
			case TOK_INTLIT:
				enterOuterAlt(_localctx, 2);
				{
				setState(253);
				match(TOK_INTLIT);
				}
				break;
			case TOK_CHARLIT:
				enterOuterAlt(_localctx, 3);
				{
				setState(254);
				match(TOK_CHARLIT);
				}
				break;
			case TOK_NEW:
				enterOuterAlt(_localctx, 4);
				{
				setState(255);
				match(TOK_NEW);
				setState(256);
				x();
				}
				break;
			case TOK_LP:
				enterOuterAlt(_localctx, 5);
				{
				setState(257);
				match(TOK_LP);
				setState(258);
				expr();
				setState(259);
				match(TOK_RP);
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

	public static class DesignatorContext extends ParserRuleContext {
		public List<TerminalNode> TOK_IDENTIFIER() { return getTokens(grParser.TOK_IDENTIFIER); }
		public TerminalNode TOK_IDENTIFIER(int i) {
			return getToken(grParser.TOK_IDENTIFIER, i);
		}
		public List<TerminalNode> TOK_DOT() { return getTokens(grParser.TOK_DOT); }
		public TerminalNode TOK_DOT(int i) {
			return getToken(grParser.TOK_DOT, i);
		}
		public List<ValidarrayContext> validarray() {
			return getRuleContexts(ValidarrayContext.class);
		}
		public ValidarrayContext validarray(int i) {
			return getRuleContext(ValidarrayContext.class,i);
		}
		public List<InvalidarrayContext> invalidarray() {
			return getRuleContexts(InvalidarrayContext.class);
		}
		public InvalidarrayContext invalidarray(int i) {
			return getRuleContext(InvalidarrayContext.class,i);
		}
		public DesignatorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_designator; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof grListener ) ((grListener)listener).enterDesignator(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof grListener ) ((grListener)listener).exitDesignator(this);
		}
	}

	public final DesignatorContext designator() throws RecognitionException {
		DesignatorContext _localctx = new DesignatorContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_designator);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(263);
			match(TOK_IDENTIFIER);
			setState(272);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==TOK_DOT || _la==TOK_LB) {
				{
				setState(270);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case TOK_DOT:
					{
					setState(264);
					match(TOK_DOT);
					setState(265);
					match(TOK_IDENTIFIER);
					}
					break;
				case TOK_LB:
					{
					setState(268);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,27,_ctx) ) {
					case 1:
						{
						setState(266);
						validarray();
						}
						break;
					case 2:
						{
						setState(267);
						invalidarray();
						}
						break;
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
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

	public static class XContext extends ParserRuleContext {
		public TerminalNode TOK_IDENTIFIER() { return getToken(grParser.TOK_IDENTIFIER, 0); }
		public TerminalNode TOK_LP() { return getToken(grParser.TOK_LP, 0); }
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public TerminalNode TOK_RP() { return getToken(grParser.TOK_RP, 0); }
		public List<Tok_lbContext> tok_lb() {
			return getRuleContexts(Tok_lbContext.class);
		}
		public Tok_lbContext tok_lb(int i) {
			return getRuleContext(Tok_lbContext.class,i);
		}
		public List<Tok_rbContext> tok_rb() {
			return getRuleContexts(Tok_rbContext.class);
		}
		public Tok_rbContext tok_rb(int i) {
			return getRuleContext(Tok_rbContext.class,i);
		}
		public XContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_x; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof grListener ) ((grListener)listener).enterX(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof grListener ) ((grListener)listener).exitX(this);
		}
	}

	public final XContext x() throws RecognitionException {
		XContext _localctx = new XContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_x);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(275);
			match(TOK_IDENTIFIER);
			setState(293);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,33,_ctx) ) {
			case 1:
				{
				setState(280);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==TOK_LP) {
					{
					setState(276);
					match(TOK_LP);
					setState(277);
					expr();
					setState(278);
					match(TOK_RP);
					}
				}

				}
				break;
			case 2:
				{
				setState(290);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==TOK_LB) {
					{
					{
					setState(282);
					tok_lb();
					setState(284);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << TOK_INTLIT) | (1L << TOK_NEW) | (1L << TOK_LP) | (1L << OP_ADD_MINUS) | (1L << TOK_IDENTIFIER) | (1L << TOK_CHARLIT))) != 0)) {
						{
						setState(283);
						expr();
						}
					}

					setState(286);
					tok_rb();
					}
					}
					setState(292);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
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

	public static class ValidarrayContext extends ParserRuleContext {
		public Tok_lbContext tok_lb() {
			return getRuleContext(Tok_lbContext.class,0);
		}
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public Tok_rbContext tok_rb() {
			return getRuleContext(Tok_rbContext.class,0);
		}
		public ValidarrayContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_validarray; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof grListener ) ((grListener)listener).enterValidarray(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof grListener ) ((grListener)listener).exitValidarray(this);
		}
	}

	public final ValidarrayContext validarray() throws RecognitionException {
		ValidarrayContext _localctx = new ValidarrayContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_validarray);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(295);
			tok_lb();
			setState(296);
			expr();
			setState(297);
			tok_rb();
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

	public static class InvalidarrayContext extends ParserRuleContext {
		public Tok_lbContext tok_lb() {
			return getRuleContext(Tok_lbContext.class,0);
		}
		public Tok_rbContext tok_rb() {
			return getRuleContext(Tok_rbContext.class,0);
		}
		public InvalidarrayContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_invalidarray; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof grListener ) ((grListener)listener).enterInvalidarray(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof grListener ) ((grListener)listener).exitInvalidarray(this);
		}
	}

	public final InvalidarrayContext invalidarray() throws RecognitionException {
		InvalidarrayContext _localctx = new InvalidarrayContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_invalidarray);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(299);
			tok_lb();
			setState(300);
			match(T__0);
			lexer.errors.write("cannot define with character index\n");
			setState(302);
			tok_rb();
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

	public static class Tok_lbContext extends ParserRuleContext {
		public TerminalNode TOK_LB() { return getToken(grParser.TOK_LB, 0); }
		public Tok_lbContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_tok_lb; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof grListener ) ((grListener)listener).enterTok_lb(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof grListener ) ((grListener)listener).exitTok_lb(this);
		}
	}

	public final Tok_lbContext tok_lb() throws RecognitionException {
		Tok_lbContext _localctx = new Tok_lbContext(_ctx, getState());
		enterRule(_localctx, 40, RULE_tok_lb);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(304);
			match(TOK_LB);
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

	public static class Tok_rbContext extends ParserRuleContext {
		public TerminalNode TOK_RB() { return getToken(grParser.TOK_RB, 0); }
		public Tok_rbContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_tok_rb; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof grListener ) ((grListener)listener).enterTok_rb(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof grListener ) ((grListener)listener).exitTok_rb(this);
		}
	}

	public final Tok_rbContext tok_rb() throws RecognitionException {
		Tok_rbContext _localctx = new Tok_rbContext(_ctx, getState());
		enterRule(_localctx, 42, RULE_tok_rb);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(306);
			match(TOK_RB);
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

	public static class SemiContext extends ParserRuleContext {
		public TerminalNode TOK_SEMI() { return getToken(grParser.TOK_SEMI, 0); }
		public SemiContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_semi; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof grListener ) ((grListener)listener).enterSemi(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof grListener ) ((grListener)listener).exitSemi(this);
		}
	}

	public final SemiContext semi() throws RecognitionException {
		SemiContext _localctx = new SemiContext(_ctx, getState());
		enterRule(_localctx, 44, RULE_semi);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(308);
			match(TOK_SEMI);
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

	public static class VarTypeContext extends ParserRuleContext {
		public VartpContext vartp() {
			return getRuleContext(VartpContext.class,0);
		}
		public VarArrayContext varArray() {
			return getRuleContext(VarArrayContext.class,0);
		}
		public VarTypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_varType; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof grListener ) ((grListener)listener).enterVarType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof grListener ) ((grListener)listener).exitVarType(this);
		}
	}

	public final VarTypeContext varType() throws RecognitionException {
		VarTypeContext _localctx = new VarTypeContext(_ctx, getState());
		enterRule(_localctx, 46, RULE_varType);
		try {
			setState(312);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,34,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				{
				setState(310);
				vartp();
				}
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				{
				setState(311);
				varArray();
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

	public static class VartpContext extends ParserRuleContext {
		public TerminalNode TOK_IDENTIFIER() { return getToken(grParser.TOK_IDENTIFIER, 0); }
		public VartpContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_vartp; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof grListener ) ((grListener)listener).enterVartp(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof grListener ) ((grListener)listener).exitVartp(this);
		}
	}

	public final VartpContext vartp() throws RecognitionException {
		VartpContext _localctx = new VartpContext(_ctx, getState());
		enterRule(_localctx, 48, RULE_vartp);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(314);
			match(TOK_IDENTIFIER);
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

	public static class VarArrayContext extends ParserRuleContext {
		public TerminalNode TOK_IDENTIFIER() { return getToken(grParser.TOK_IDENTIFIER, 0); }
		public Tok_lbContext tok_lb() {
			return getRuleContext(Tok_lbContext.class,0);
		}
		public Tok_rbContext tok_rb() {
			return getRuleContext(Tok_rbContext.class,0);
		}
		public VarArrayContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_varArray; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof grListener ) ((grListener)listener).enterVarArray(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof grListener ) ((grListener)listener).exitVarArray(this);
		}
	}

	public final VarArrayContext varArray() throws RecognitionException {
		VarArrayContext _localctx = new VarArrayContext(_ctx, getState());
		enterRule(_localctx, 50, RULE_varArray);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(316);
			match(TOK_IDENTIFIER);
			{
			setState(317);
			tok_lb();
			setState(318);
			tok_rb();
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3/\u0143\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\3\2\3\2\3\3\3\3\3\3\3\3\3\3\7\3>\n\3\f\3\16\3A\13"+
		"\3\3\3\3\3\7\3E\n\3\f\3\16\3H\13\3\3\3\3\3\3\3\3\4\3\4\3\5\3\5\3\5\3\5"+
		"\7\5S\n\5\f\5\16\5V\13\5\3\5\3\5\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\7\3\7\3"+
		"\7\3\7\7\7e\n\7\f\7\16\7h\13\7\3\7\3\7\3\b\3\b\5\bn\n\b\3\b\3\b\3\b\5"+
		"\bs\n\b\3\b\3\b\7\bw\n\b\f\b\16\bz\13\b\3\b\3\b\3\t\3\t\3\t\3\t\3\t\3"+
		"\t\7\t\u0084\n\t\f\t\16\t\u0087\13\t\3\n\3\n\7\n\u008b\n\n\f\n\16\n\u008e"+
		"\13\n\3\n\3\n\3\13\3\13\3\13\3\13\5\13\u0096\n\13\3\13\3\13\3\13\3\13"+
		"\3\13\3\13\3\13\5\13\u009f\n\13\3\13\7\13\u00a2\n\13\f\13\16\13\u00a5"+
		"\13\13\3\13\5\13\u00a8\n\13\3\13\3\13\5\13\u00ac\n\13\3\13\3\13\5\13\u00b0"+
		"\n\13\7\13\u00b2\n\13\f\13\16\13\u00b5\13\13\3\13\3\13\3\13\3\13\3\13"+
		"\3\13\3\13\3\13\5\13\u00bf\n\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13"+
		"\3\13\3\13\3\13\3\13\5\13\u00cd\n\13\3\13\3\13\3\13\3\13\3\13\5\13\u00d4"+
		"\n\13\3\f\3\f\3\f\3\f\7\f\u00da\n\f\f\f\16\f\u00dd\13\f\5\f\u00df\n\f"+
		"\3\f\3\f\3\r\3\r\3\r\3\r\3\16\3\16\3\17\5\17\u00ea\n\17\3\17\3\17\3\17"+
		"\7\17\u00ef\n\17\f\17\16\17\u00f2\13\17\3\20\3\20\3\20\7\20\u00f7\n\20"+
		"\f\20\16\20\u00fa\13\20\3\21\3\21\5\21\u00fe\n\21\3\21\3\21\3\21\3\21"+
		"\3\21\3\21\3\21\3\21\5\21\u0108\n\21\3\22\3\22\3\22\3\22\3\22\5\22\u010f"+
		"\n\22\7\22\u0111\n\22\f\22\16\22\u0114\13\22\3\23\3\23\3\23\3\23\3\23"+
		"\5\23\u011b\n\23\3\23\3\23\5\23\u011f\n\23\3\23\3\23\7\23\u0123\n\23\f"+
		"\23\16\23\u0126\13\23\5\23\u0128\n\23\3\24\3\24\3\24\3\24\3\25\3\25\3"+
		"\25\3\25\3\25\3\26\3\26\3\27\3\27\3\30\3\30\3\31\3\31\5\31\u013b\n\31"+
		"\3\32\3\32\3\33\3\33\3\33\3\33\3\33\2\2\34\2\4\6\b\n\f\16\20\22\24\26"+
		"\30\32\34\36 \"$&(*,.\60\62\64\2\3\4\2\7\7..\2\u0155\2\66\3\2\2\2\48\3"+
		"\2\2\2\6L\3\2\2\2\bN\3\2\2\2\nY\3\2\2\2\f`\3\2\2\2\16m\3\2\2\2\20}\3\2"+
		"\2\2\22\u0088\3\2\2\2\24\u00d3\3\2\2\2\26\u00d5\3\2\2\2\30\u00e2\3\2\2"+
		"\2\32\u00e6\3\2\2\2\34\u00e9\3\2\2\2\36\u00f3\3\2\2\2 \u0107\3\2\2\2\""+
		"\u0109\3\2\2\2$\u0115\3\2\2\2&\u0129\3\2\2\2(\u012d\3\2\2\2*\u0132\3\2"+
		"\2\2,\u0134\3\2\2\2.\u0136\3\2\2\2\60\u013a\3\2\2\2\62\u013c\3\2\2\2\64"+
		"\u013e\3\2\2\2\66\67\5\4\3\2\67\3\3\2\2\289\7\22\2\29?\7,\2\2:>\5\n\6"+
		"\2;>\5\b\5\2<>\5\f\7\2=:\3\2\2\2=;\3\2\2\2=<\3\2\2\2>A\3\2\2\2?=\3\2\2"+
		"\2?@\3\2\2\2@B\3\2\2\2A?\3\2\2\2BF\7\30\2\2CE\5\16\b\2DC\3\2\2\2EH\3\2"+
		"\2\2FD\3\2\2\2FG\3\2\2\2GI\3\2\2\2HF\3\2\2\2IJ\5\6\4\2JK\7\2\2\3K\5\3"+
		"\2\2\2LM\7\31\2\2M\7\3\2\2\2NO\5\60\31\2OT\7,\2\2PQ\7\23\2\2QS\7,\2\2"+
		"RP\3\2\2\2SV\3\2\2\2TR\3\2\2\2TU\3\2\2\2UW\3\2\2\2VT\3\2\2\2WX\5.\30\2"+
		"X\t\3\2\2\2YZ\7\t\2\2Z[\5\60\31\2[\\\7,\2\2\\]\7%\2\2]^\t\2\2\2^_\5.\30"+
		"\2_\13\3\2\2\2`a\7\b\2\2ab\7,\2\2bf\7\30\2\2ce\5\b\5\2dc\3\2\2\2eh\3\2"+
		"\2\2fd\3\2\2\2fg\3\2\2\2gi\3\2\2\2hf\3\2\2\2ij\5\6\4\2j\r\3\2\2\2kn\5"+
		"\60\31\2ln\7\17\2\2mk\3\2\2\2ml\3\2\2\2no\3\2\2\2op\7,\2\2pr\7\32\2\2"+
		"qs\5\20\t\2rq\3\2\2\2rs\3\2\2\2st\3\2\2\2tx\7\33\2\2uw\5\b\5\2vu\3\2\2"+
		"\2wz\3\2\2\2xv\3\2\2\2xy\3\2\2\2y{\3\2\2\2zx\3\2\2\2{|\5\22\n\2|\17\3"+
		"\2\2\2}~\5\60\31\2~\u0085\7,\2\2\177\u0080\7\23\2\2\u0080\u0081\5\60\31"+
		"\2\u0081\u0082\7,\2\2\u0082\u0084\3\2\2\2\u0083\177\3\2\2\2\u0084\u0087"+
		"\3\2\2\2\u0085\u0083\3\2\2\2\u0085\u0086\3\2\2\2\u0086\21\3\2\2\2\u0087"+
		"\u0085\3\2\2\2\u0088\u008c\7\30\2\2\u0089\u008b\5\24\13\2\u008a\u0089"+
		"\3\2\2\2\u008b\u008e\3\2\2\2\u008c\u008a\3\2\2\2\u008c\u008d\3\2\2\2\u008d"+
		"\u008f\3\2\2\2\u008e\u008c\3\2\2\2\u008f\u0090\5\6\4\2\u0090\23\3\2\2"+
		"\2\u0091\u0095\5\"\22\2\u0092\u0093\7%\2\2\u0093\u0096\5\34\17\2\u0094"+
		"\u0096\5\26\f\2\u0095\u0092\3\2\2\2\u0095\u0094\3\2\2\2\u0096\u0097\3"+
		"\2\2\2\u0097\u0098\5.\30\2\u0098\u00d4\3\2\2\2\u0099\u009a\7\13\2\2\u009a"+
		"\u009b\7\32\2\2\u009b\u009c\5\30\r\2\u009c\u009e\7\33\2\2\u009d\u009f"+
		"\7\30\2\2\u009e\u009d\3\2\2\2\u009e\u009f\3\2\2\2\u009f\u00a3\3\2\2\2"+
		"\u00a0\u00a2\5\24\13\2\u00a1\u00a0\3\2\2\2\u00a2\u00a5\3\2\2\2\u00a3\u00a1"+
		"\3\2\2\2\u00a3\u00a4\3\2\2\2\u00a4\u00a7\3\2\2\2\u00a5\u00a3\3\2\2\2\u00a6"+
		"\u00a8\5\6\4\2\u00a7\u00a6\3\2\2\2\u00a7\u00a8\3\2\2\2\u00a8\u00b3\3\2"+
		"\2\2\u00a9\u00ab\7\n\2\2\u00aa\u00ac\7\30\2\2\u00ab\u00aa\3\2\2\2\u00ab"+
		"\u00ac\3\2\2\2\u00ac\u00ad\3\2\2\2\u00ad\u00af\5\24\13\2\u00ae\u00b0\5"+
		"\6\4\2\u00af\u00ae\3\2\2\2\u00af\u00b0\3\2\2\2\u00b0\u00b2\3\2\2\2\u00b1"+
		"\u00a9\3\2\2\2\u00b2\u00b5\3\2\2\2\u00b3\u00b1\3\2\2\2\u00b3\u00b4\3\2"+
		"\2\2\u00b4\u00d4\3\2\2\2\u00b5\u00b3\3\2\2\2\u00b6\u00b7\7\20\2\2\u00b7"+
		"\u00b8\7\32\2\2\u00b8\u00b9\5\30\r\2\u00b9\u00ba\7\33\2\2\u00ba\u00bb"+
		"\5\24\13\2\u00bb\u00d4\3\2\2\2\u00bc\u00be\7\16\2\2\u00bd\u00bf\5\34\17"+
		"\2\u00be\u00bd\3\2\2\2\u00be\u00bf\3\2\2\2\u00bf\u00c0\3\2\2\2\u00c0\u00d4"+
		"\5.\30\2\u00c1\u00c2\7\r\2\2\u00c2\u00c3\7\32\2\2\u00c3\u00c4\5\"\22\2"+
		"\u00c4\u00c5\7\33\2\2\u00c5\u00c6\5.\30\2\u00c6\u00d4\3\2\2\2\u00c7\u00c8"+
		"\7\21\2\2\u00c8\u00c9\7\32\2\2\u00c9\u00cc\5\34\17\2\u00ca\u00cb\7\23"+
		"\2\2\u00cb\u00cd\7\7\2\2\u00cc\u00ca\3\2\2\2\u00cc\u00cd\3\2\2\2\u00cd"+
		"\u00ce\3\2\2\2\u00ce\u00cf\7\33\2\2\u00cf\u00d0\5.\30\2\u00d0\u00d4\3"+
		"\2\2\2\u00d1\u00d4\5\22\n\2\u00d2\u00d4\5.\30\2\u00d3\u0091\3\2\2\2\u00d3"+
		"\u0099\3\2\2\2\u00d3\u00b6\3\2\2\2\u00d3\u00bc\3\2\2\2\u00d3\u00c1\3\2"+
		"\2\2\u00d3\u00c7\3\2\2\2\u00d3\u00d1\3\2\2\2\u00d3\u00d2\3\2\2\2\u00d4"+
		"\25\3\2\2\2\u00d5\u00de\7\32\2\2\u00d6\u00db\5\34\17\2\u00d7\u00d8\7\23"+
		"\2\2\u00d8\u00da\5\34\17\2\u00d9\u00d7\3\2\2\2\u00da\u00dd\3\2\2\2\u00db"+
		"\u00d9\3\2\2\2\u00db\u00dc\3\2\2\2\u00dc\u00df\3\2\2\2\u00dd\u00db\3\2"+
		"\2\2\u00de\u00d6\3\2\2\2\u00de\u00df\3\2\2\2\u00df\u00e0\3\2\2\2\u00e0"+
		"\u00e1\7\33\2\2\u00e1\27\3\2\2\2\u00e2\u00e3\5\34\17\2\u00e3\u00e4\5\32"+
		"\16\2\u00e4\u00e5\5\34\17\2\u00e5\31\3\2\2\2\u00e6\u00e7\7\34\2\2\u00e7"+
		"\33\3\2\2\2\u00e8\u00ea\7\'\2\2\u00e9\u00e8\3\2\2\2\u00e9\u00ea\3\2\2"+
		"\2\u00ea\u00eb\3\2\2\2\u00eb\u00f0\5\36\20\2\u00ec\u00ed\7\35\2\2\u00ed"+
		"\u00ef\5\36\20\2\u00ee\u00ec\3\2\2\2\u00ef\u00f2\3\2\2\2\u00f0\u00ee\3"+
		"\2\2\2\u00f0\u00f1\3\2\2\2\u00f1\35\3\2\2\2\u00f2\u00f0\3\2\2\2\u00f3"+
		"\u00f8\5 \21\2\u00f4\u00f5\7\36\2\2\u00f5\u00f7\5 \21\2\u00f6\u00f4\3"+
		"\2\2\2\u00f7\u00fa\3\2\2\2\u00f8\u00f6\3\2\2\2\u00f8\u00f9\3\2\2\2\u00f9"+
		"\37\3\2\2\2\u00fa\u00f8\3\2\2\2\u00fb\u00fd\5\"\22\2\u00fc\u00fe\5\26"+
		"\f\2\u00fd\u00fc\3\2\2\2\u00fd\u00fe\3\2\2\2\u00fe\u0108\3\2\2\2\u00ff"+
		"\u0108\7\7\2\2\u0100\u0108\7.\2\2\u0101\u0102\7\f\2\2\u0102\u0108\5$\23"+
		"\2\u0103\u0104\7\32\2\2\u0104\u0105\5\34\17\2\u0105\u0106\7\33\2\2\u0106"+
		"\u0108\3\2\2\2\u0107\u00fb\3\2\2\2\u0107\u00ff\3\2\2\2\u0107\u0100\3\2"+
		"\2\2\u0107\u0101\3\2\2\2\u0107\u0103\3\2\2\2\u0108!\3\2\2\2\u0109\u0112"+
		"\7,\2\2\u010a\u010b\7\25\2\2\u010b\u0111\7,\2\2\u010c\u010f\5&\24\2\u010d"+
		"\u010f\5(\25\2\u010e\u010c\3\2\2\2\u010e\u010d\3\2\2\2\u010f\u0111\3\2"+
		"\2\2\u0110\u010a\3\2\2\2\u0110\u010e\3\2\2\2\u0111\u0114\3\2\2\2\u0112"+
		"\u0110\3\2\2\2\u0112\u0113\3\2\2\2\u0113#\3\2\2\2\u0114\u0112\3\2\2\2"+
		"\u0115\u0127\7,\2\2\u0116\u0117\7\32\2\2\u0117\u0118\5\34\17\2\u0118\u0119"+
		"\7\33\2\2\u0119\u011b\3\2\2\2\u011a\u0116\3\2\2\2\u011a\u011b\3\2\2\2"+
		"\u011b\u0128\3\2\2\2\u011c\u011e\5*\26\2\u011d\u011f\5\34\17\2\u011e\u011d"+
		"\3\2\2\2\u011e\u011f\3\2\2\2\u011f\u0120\3\2\2\2\u0120\u0121\5,\27\2\u0121"+
		"\u0123\3\2\2\2\u0122\u011c\3\2\2\2\u0123\u0126\3\2\2\2\u0124\u0122\3\2"+
		"\2\2\u0124\u0125\3\2\2\2\u0125\u0128\3\2\2\2\u0126\u0124\3\2\2\2\u0127"+
		"\u011a\3\2\2\2\u0127\u0124\3\2\2\2\u0128%\3\2\2\2\u0129\u012a\5*\26\2"+
		"\u012a\u012b\5\34\17\2\u012b\u012c\5,\27\2\u012c\'\3\2\2\2\u012d\u012e"+
		"\5*\26\2\u012e\u012f\7\3\2\2\u012f\u0130\b\25\1\2\u0130\u0131\5,\27\2"+
		"\u0131)\3\2\2\2\u0132\u0133\7\26\2\2\u0133+\3\2\2\2\u0134\u0135\7\27\2"+
		"\2\u0135-\3\2\2\2\u0136\u0137\7\24\2\2\u0137/\3\2\2\2\u0138\u013b\5\62"+
		"\32\2\u0139\u013b\5\64\33\2\u013a\u0138\3\2\2\2\u013a\u0139\3\2\2\2\u013b"+
		"\61\3\2\2\2\u013c\u013d\7,\2\2\u013d\63\3\2\2\2\u013e\u013f\7,\2\2\u013f"+
		"\u0140\5*\26\2\u0140\u0141\5,\27\2\u0141\65\3\2\2\2%=?FTfmrx\u0085\u008c"+
		"\u0095\u009e\u00a3\u00a7\u00ab\u00af\u00b3\u00be\u00cc\u00d3\u00db\u00de"+
		"\u00e9\u00f0\u00f8\u00fd\u0107\u010e\u0110\u0112\u011a\u011e\u0124\u0127"+
		"\u013a";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}