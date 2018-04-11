// Generated from C:/Users/User/IdeaProjects/anotherproject/src\gr.g4 by ANTLR 4.7

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
		TOK_INTLIT=1, WhiteSpace=2, Comments=3, Unknown=4, TOK_CLASS=5, TOK_FINAL=6, 
		TOK_ELSE=7, TOK_IF=8, TOK_NEW=9, TOK_READ=10, TOK_RETURN=11, TOK_VOID=12, 
		TOK_WHILE=13, TOK_PRINT=14, TOK_PROGRAM=15, TOK_COMMA=16, TOK_SEMI=17, 
		TOK_DOT=18, TOK_LB=19, TOK_RB=20, TOK_LCB=21, TOK_RCB=22, TOK_LP=23, TOK_RP=24, 
		TOK_OP_REL=25, TOK_OP_ADD=26, TOK_OP_TIMES=27, TOK_EQ=28, TOK_OP_NE=29, 
		TOK_OP_LT=30, TOK_OP_LE=31, TOK_OP_GT=32, TOK_OP_GE=33, TOK_OP_ASSIGN=34, 
		OP_ADD_PLUS=35, OP_ADD_MINUS=36, OP_MUL_TIMES=37, OP_MUL_DIV=38, OP_MUL_MOD=39, 
		TOK_INVALID_IDENTIFIER=40, TOK_IDENTIFIER=41, TOK_INVALID_CHARLIT=42, 
		TOK_CHARLIT=43, UNRECOGNIZED_SYMBOL=44;
	public static final int
		RULE_program = 0, RULE_prog = 1, RULE_constDecl = 2, RULE_varDecl = 3, 
		RULE_classDecl = 4, RULE_methodDecl = 5, RULE_formPars = 6, RULE_block = 7, 
		RULE_statement = 8, RULE_actPars = 9, RULE_condition = 10, RULE_relop = 11, 
		RULE_expr = 12, RULE_term = 13, RULE_factor = 14, RULE_designator = 15, 
		RULE_x = 16, RULE_varType = 17;
	public static final String[] ruleNames = {
		"program", "prog", "constDecl", "varDecl", "classDecl", "methodDecl", 
		"formPars", "block", "statement", "actPars", "condition", "relop", "expr", 
		"term", "factor", "designator", "x", "varType"
	};

	private static final String[] _LITERAL_NAMES = {
		null, null, null, null, null, "'class'", "'final'", "'else'", "'if'", 
		"'new'", "'read'", "'return'", "'void'", "'while'", "'print'", "'program'", 
		"','", "';'", "'.'", "'['", "']'", "'{'", "'}'", "'('", "')'", null, null, 
		null, "'=='", "'!='", "'<'", null, "'>'", null, "'='", "'+'", "'-'", "'*'", 
		"'/'", "'%'"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, "TOK_INTLIT", "WhiteSpace", "Comments", "Unknown", "TOK_CLASS", 
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
	        if(ruleNames[ruleIndex].equals("methodDecl")){
	            System.out.println("entering method");
	            lexer.isMethod=1;
	        }
	        if(ruleNames[ruleIndex].equals("actPars")){
	            lexer.methodParams=lexer.getText();
	        }
	    }
	    public static void testm(){
	        System.out.println("PRINTING");
	    }
	    public static Stack<Stack<ASTNode>> tempStack=new Stack<Stack<ASTNode>>(); //list of children of the current subroot
	    public static Stack<ASTNode> nodeStack=new Stack<ASTNode>(); //all subtrees
	    public static ASTNode Ptree=new ASTNode(); //The root of the program
	    public static String readType="";
	    static boolean hasParam=false;
	    static boolean returnsExpr =false;
	    static String token= "";
	    /* adds elements in last subtree
	      deletes last list
	      adds last subtree to last list (append as child)
	      deletes last subtree  */
	    //MOVE 1
	    public void moveLastListToLastSubtree(){
	        try{
	            Stack<ASTNode> toMove = tempStack.pop();    //put the last list in 'toMove' Stack<ASTNode> and remove it from tempStack
	            nodeStack.peek().add(toMove);               //add elements of toMove as children of the last subtree
	        }catch(Exception e){
	            System.out.println(e);
	        }
	        System.out.println("DONE moveLastListToLastSubtree");
	    }
	    //MOVE 2
	    public void attachLastSubtreeToLastList(){
	        try{
	            ASTNode toMove = nodeStack.pop();           //put the last node in 'toMove' ASTNode and remove it from nodeStack
	            tempStack.peek().push(toMove);              //attach toMove as child to the lastlist
	        }catch(Exception e){
	            System.out.println(e);
	        }
	        System.out.println("DONE attachLastSubtreeToLastList");
	    }
	      //creates a new list
	    public static void createList(){
	        try{
	            tempStack.push(new Stack<ASTNode>());
	        }catch(Exception e){
	            System.out.println(e);
	        }
	        //printLastTempStack();
	        System.out.println("DONE createList");
	    }
	      //create a node of the passed info and append it to last list
	    public static void addToLastList(String type, String name){
	        try{
	            tempStack.peek().push(new ASTNode(type,name));
	        }catch(Exception e){
	            System.out.println(e);
	        }
	        printLastTempStack();
	        System.out.println("DONE addToLastList");
	    }
	      //creates a new subtree with root is the node created of the passed info
	    public static void createSubtree(String type, String name){
	        try{
	            nodeStack.push(new ASTNode(type,name));
	        }catch(Exception e){
	            System.out.println(e);
	        }
	        System.out.println("DONE createSubtree");
	    }
	    public static void printLastTempStack(){
	        try{
	            System.out.println("LAST IN LIST::: "+tempStack.peek().peek().toString());
	        }catch(Exception e){
	            System.out.println(e);
	        }
	    }
	    public static void printlastNodeStack(){
	        try{
	            System.out.println("LAST NODE OF STACK::: "+nodeStack.peek().toString());
	        }catch(Exception e){
	            System.out.println(e);
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
			token=lexer.getText();     System.out.println("*"+token);
			setState(37);
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
		public TerminalNode TOK_RCB() { return getToken(grParser.TOK_RCB, 0); }
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
			setState(39);
			match(TOK_PROGRAM);
			createList(); System.out.println("**"+token);     token=lexer.getText();     System.out.println("*** "+token);
			setState(41);
			match(TOK_IDENTIFIER);
			createSubtree("program name: ",token); System.out.println("****"+token);   /* printlastNodeStack();*/   token=lexer.getText();
			setState(48);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << TOK_CLASS) | (1L << TOK_FINAL) | (1L << TOK_IDENTIFIER))) != 0)) {
				{
				setState(46);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case TOK_FINAL:
					{
					setState(43);
					constDecl();
					}
					break;
				case TOK_IDENTIFIER:
					{
					setState(44);
					varDecl();
					}
					break;
				case TOK_CLASS:
					{
					setState(45);
					classDecl();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				setState(50);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(51);
			match(TOK_LCB);
			setState(53); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(52);
				methodDecl();
				}
				}
				setState(55); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==TOK_VOID || _la==TOK_IDENTIFIER );
			setState(57);
			match(TOK_RCB);
			 moveLastListToLastSubtree();
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
		public TerminalNode TOK_SEMI() { return getToken(grParser.TOK_SEMI, 0); }
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
		enterRule(_localctx, 4, RULE_constDecl);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(60);
			match(TOK_FINAL);
			 createList(); addToLastList("TOK_FINAL",token);     token=lexer.getText();
			setState(62);
			varType();
			 addToLastList("type",token);                 token=lexer.getText();
			setState(64);
			match(TOK_IDENTIFIER);
			 createSubtree("TOK_IDENTIFIER",token);               token=lexer.getText();
			setState(66);
			match(TOK_OP_ASSIGN);
			  addToLastList("TOK_OP_ASSIGN",token);               token=lexer.getText();
			setState(68);
			_la = _input.LA(1);
			if ( !(_la==TOK_INTLIT || _la==TOK_CHARLIT) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			 addToLastList("TOK_VALUE",token);   token=lexer.getText();
			setState(70);
			match(TOK_SEMI);
			System.out.println("~~~~~~~~"+token);  moveLastListToLastSubtree(); attachLastSubtreeToLastList();    token=lexer.getText();
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
		public TerminalNode TOK_SEMI() { return getToken(grParser.TOK_SEMI, 0); }
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
			setState(73);
			varType();
			readType="type"; System.out.println("TYPE HERE");   createList(); addToLastList(readType,"name"); token=lexer.getText();
			setState(75);
			match(TOK_IDENTIFIER);
			createSubtree("type","name");  token=lexer.getText();
			setState(83);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==TOK_COMMA) {
				{
				{
				setState(77);
				match(TOK_COMMA);
				moveLastListToLastSubtree(); attachLastSubtreeToLastList();    token=lexer.getText();
				setState(79);
				match(TOK_IDENTIFIER);
				createList(); addToLastList(readType,"name"); createSubtree("type","name");    token=lexer.getText();
				}
				}
				setState(85);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(86);
			match(TOK_SEMI);
			moveLastListToLastSubtree(); attachLastSubtreeToLastList();    token=lexer.getText();
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
		public TerminalNode TOK_RCB() { return getToken(grParser.TOK_RCB, 0); }
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
		enterRule(_localctx, 8, RULE_classDecl);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(89);
			match(TOK_CLASS);
			setState(90);
			match(TOK_IDENTIFIER);
			setState(91);
			match(TOK_LCB);
			setState(95);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==TOK_IDENTIFIER) {
				{
				{
				setState(92);
				varDecl();
				}
				}
				setState(97);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(98);
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
		enterRule(_localctx, 10, RULE_methodDecl);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(102);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case TOK_IDENTIFIER:
				{
				setState(100);
				varType();
				}
				break;
			case TOK_VOID:
				{
				setState(101);
				match(TOK_VOID);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(104);
			match(TOK_IDENTIFIER);
			setState(105);
			match(TOK_LP);
			setState(107);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==TOK_IDENTIFIER) {
				{
				setState(106);
				formPars();
				}
			}

			setState(109);
			match(TOK_RP);
			setState(113);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==TOK_IDENTIFIER) {
				{
				{
				setState(110);
				varDecl();
				}
				}
				setState(115);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(116);
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
		enterRule(_localctx, 12, RULE_formPars);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(118);
			varType();
			lexer.methodPars=lexer.getText();
			setState(120);
			match(TOK_IDENTIFIER);
			setState(127);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==TOK_COMMA) {
				{
				{
				setState(121);
				match(TOK_COMMA);
				setState(122);
				varType();
				setState(123);
				match(TOK_IDENTIFIER);
				}
				}
				setState(129);
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
		public TerminalNode TOK_RCB() { return getToken(grParser.TOK_RCB, 0); }
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
		enterRule(_localctx, 14, RULE_block);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(130);
			match(TOK_LCB);
			setState(134);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << TOK_IF) | (1L << TOK_READ) | (1L << TOK_RETURN) | (1L << TOK_WHILE) | (1L << TOK_PRINT) | (1L << TOK_SEMI) | (1L << TOK_LCB) | (1L << TOK_IDENTIFIER))) != 0)) {
				{
				{
				setState(131);
				statement();
				}
				}
				setState(136);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(137);
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

	public static class StatementContext extends ParserRuleContext {
		public DesignatorContext designator() {
			return getRuleContext(DesignatorContext.class,0);
		}
		public TerminalNode TOK_SEMI() { return getToken(grParser.TOK_SEMI, 0); }
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
		public List<TerminalNode> TOK_RCB() { return getTokens(grParser.TOK_RCB); }
		public TerminalNode TOK_RCB(int i) {
			return getToken(grParser.TOK_RCB, i);
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
		enterRule(_localctx, 16, RULE_statement);
		int _la;
		try {
			int _alt;
			setState(205);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case TOK_IDENTIFIER:
				enterOuterAlt(_localctx, 1);
				{
				setState(139);
				designator();
				setState(143);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case TOK_OP_ASSIGN:
					{
					setState(140);
					match(TOK_OP_ASSIGN);
					setState(141);
					expr();
					}
					break;
				case TOK_LP:
					{
					setState(142);
					actPars();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(145);
				match(TOK_SEMI);
				}
				break;
			case TOK_IF:
				enterOuterAlt(_localctx, 2);
				{
				setState(147);
				match(TOK_IF);
				setState(148);
				match(TOK_LP);
				setState(149);
				condition();
				setState(150);
				match(TOK_RP);
				setState(152);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,11,_ctx) ) {
				case 1:
					{
					setState(151);
					match(TOK_LCB);
					}
					break;
				}
				setState(157);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,12,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(154);
						statement();
						}
						} 
					}
					setState(159);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,12,_ctx);
				}
				setState(161);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,13,_ctx) ) {
				case 1:
					{
					setState(160);
					match(TOK_RCB);
					}
					break;
				}
				setState(173);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,16,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(163);
						match(TOK_ELSE);
						setState(165);
						_errHandler.sync(this);
						switch ( getInterpreter().adaptivePredict(_input,14,_ctx) ) {
						case 1:
							{
							setState(164);
							match(TOK_LCB);
							}
							break;
						}
						setState(167);
						statement();
						setState(169);
						_errHandler.sync(this);
						switch ( getInterpreter().adaptivePredict(_input,15,_ctx) ) {
						case 1:
							{
							setState(168);
							match(TOK_RCB);
							}
							break;
						}
						}
						} 
					}
					setState(175);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,16,_ctx);
				}
				}
				break;
			case TOK_WHILE:
				enterOuterAlt(_localctx, 3);
				{
				setState(176);
				match(TOK_WHILE);
				setState(177);
				match(TOK_LP);
				setState(178);
				condition();
				setState(179);
				match(TOK_RP);
				setState(180);
				statement();
				}
				break;
			case TOK_RETURN:
				enterOuterAlt(_localctx, 4);
				{
				setState(182);
				match(TOK_RETURN);
				setState(184);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << TOK_INTLIT) | (1L << TOK_NEW) | (1L << TOK_LP) | (1L << OP_ADD_MINUS) | (1L << TOK_IDENTIFIER) | (1L << TOK_CHARLIT))) != 0)) {
					{
					setState(183);
					expr();
					}
				}

				setState(186);
				match(TOK_SEMI);
				}
				break;
			case TOK_READ:
				enterOuterAlt(_localctx, 5);
				{
				setState(187);
				match(TOK_READ);
				setState(188);
				match(TOK_LP);
				setState(189);
				designator();
				setState(190);
				match(TOK_RP);
				setState(191);
				match(TOK_SEMI);
				}
				break;
			case TOK_PRINT:
				enterOuterAlt(_localctx, 6);
				{
				setState(193);
				match(TOK_PRINT);
				setState(194);
				match(TOK_LP);
				setState(195);
				expr();
				setState(198);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==TOK_COMMA) {
					{
					setState(196);
					match(TOK_COMMA);
					setState(197);
					match(TOK_INTLIT);
					}
				}

				setState(200);
				match(TOK_RP);
				setState(201);
				match(TOK_SEMI);
				}
				break;
			case TOK_LCB:
				enterOuterAlt(_localctx, 7);
				{
				setState(203);
				block();
				}
				break;
			case TOK_SEMI:
				enterOuterAlt(_localctx, 8);
				{
				setState(204);
				match(TOK_SEMI);
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
		enterRule(_localctx, 18, RULE_actPars);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(207);
			match(TOK_LP);
			setState(216);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << TOK_INTLIT) | (1L << TOK_NEW) | (1L << TOK_LP) | (1L << OP_ADD_MINUS) | (1L << TOK_IDENTIFIER) | (1L << TOK_CHARLIT))) != 0)) {
				{
				setState(208);
				expr();
				setState(213);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==TOK_COMMA) {
					{
					{
					setState(209);
					match(TOK_COMMA);
					setState(210);
					expr();
					}
					}
					setState(215);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
			}

			setState(218);
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
		enterRule(_localctx, 20, RULE_condition);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(220);
			expr();
			setState(221);
			relop();
			setState(222);
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
		enterRule(_localctx, 22, RULE_relop);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(224);
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
		enterRule(_localctx, 24, RULE_expr);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(227);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==OP_ADD_MINUS) {
				{
				setState(226);
				match(OP_ADD_MINUS);
				}
			}

			setState(229);
			term();
			setState(234);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==TOK_OP_ADD) {
				{
				{
				setState(230);
				match(TOK_OP_ADD);
				setState(231);
				term();
				}
				}
				setState(236);
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
		enterRule(_localctx, 26, RULE_term);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(237);
			factor();
			setState(242);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==TOK_OP_TIMES) {
				{
				{
				setState(238);
				match(TOK_OP_TIMES);
				setState(239);
				factor();
				}
				}
				setState(244);
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
		enterRule(_localctx, 28, RULE_factor);
		int _la;
		try {
			setState(257);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case TOK_IDENTIFIER:
				enterOuterAlt(_localctx, 1);
				{
				setState(245);
				designator();
				setState(247);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==TOK_LP) {
					{
					setState(246);
					actPars();
					}
				}

				}
				break;
			case TOK_INTLIT:
				enterOuterAlt(_localctx, 2);
				{
				setState(249);
				match(TOK_INTLIT);
				}
				break;
			case TOK_CHARLIT:
				enterOuterAlt(_localctx, 3);
				{
				setState(250);
				match(TOK_CHARLIT);
				}
				break;
			case TOK_NEW:
				enterOuterAlt(_localctx, 4);
				{
				setState(251);
				match(TOK_NEW);
				setState(252);
				x();
				}
				break;
			case TOK_LP:
				enterOuterAlt(_localctx, 5);
				{
				setState(253);
				match(TOK_LP);
				setState(254);
				expr();
				setState(255);
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
		public List<TerminalNode> TOK_LB() { return getTokens(grParser.TOK_LB); }
		public TerminalNode TOK_LB(int i) {
			return getToken(grParser.TOK_LB, i);
		}
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public List<TerminalNode> TOK_RB() { return getTokens(grParser.TOK_RB); }
		public TerminalNode TOK_RB(int i) {
			return getToken(grParser.TOK_RB, i);
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
		enterRule(_localctx, 30, RULE_designator);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(259);
			match(TOK_IDENTIFIER);
			setState(268);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==TOK_DOT || _la==TOK_LB) {
				{
				setState(266);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case TOK_DOT:
					{
					setState(260);
					match(TOK_DOT);
					setState(261);
					match(TOK_IDENTIFIER);
					}
					break;
				case TOK_LB:
					{
					setState(262);
					match(TOK_LB);
					setState(263);
					expr();
					setState(264);
					match(TOK_RB);
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				setState(270);
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
		public List<TerminalNode> TOK_LB() { return getTokens(grParser.TOK_LB); }
		public TerminalNode TOK_LB(int i) {
			return getToken(grParser.TOK_LB, i);
		}
		public List<TerminalNode> TOK_RB() { return getTokens(grParser.TOK_RB); }
		public TerminalNode TOK_RB(int i) {
			return getToken(grParser.TOK_RB, i);
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
		enterRule(_localctx, 32, RULE_x);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(271);
			match(TOK_IDENTIFIER);
			setState(288);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,32,_ctx) ) {
			case 1:
				{
				setState(276);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==TOK_LP) {
					{
					setState(272);
					match(TOK_LP);
					setState(273);
					expr();
					setState(274);
					match(TOK_RP);
					}
				}

				}
				break;
			case 2:
				{
				setState(285);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==TOK_LB) {
					{
					{
					setState(278);
					match(TOK_LB);
					setState(280);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << TOK_INTLIT) | (1L << TOK_NEW) | (1L << TOK_LP) | (1L << OP_ADD_MINUS) | (1L << TOK_IDENTIFIER) | (1L << TOK_CHARLIT))) != 0)) {
						{
						setState(279);
						expr();
						}
					}

					setState(282);
					match(TOK_RB);
					}
					}
					setState(287);
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

	public static class VarTypeContext extends ParserRuleContext {
		public TerminalNode TOK_IDENTIFIER() { return getToken(grParser.TOK_IDENTIFIER, 0); }
		public TerminalNode TOK_LB() { return getToken(grParser.TOK_LB, 0); }
		public TerminalNode TOK_RB() { return getToken(grParser.TOK_RB, 0); }
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
		enterRule(_localctx, 34, RULE_varType);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(290);
			match(TOK_IDENTIFIER);
			setState(293);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==TOK_LB) {
				{
				setState(291);
				match(TOK_LB);
				setState(292);
				match(TOK_RB);
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

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3.\u012a\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\3\2\3\2\3\2\3\3\3\3\3\3\3\3\3\3\3\3\3\3\7\3\61\n\3\f\3\16\3"+
		"\64\13\3\3\3\3\3\6\38\n\3\r\3\16\39\3\3\3\3\3\3\3\4\3\4\3\4\3\4\3\4\3"+
		"\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\7\5T\n"+
		"\5\f\5\16\5W\13\5\3\5\3\5\3\5\3\6\3\6\3\6\3\6\7\6`\n\6\f\6\16\6c\13\6"+
		"\3\6\3\6\3\7\3\7\5\7i\n\7\3\7\3\7\3\7\5\7n\n\7\3\7\3\7\7\7r\n\7\f\7\16"+
		"\7u\13\7\3\7\3\7\3\b\3\b\3\b\3\b\3\b\3\b\3\b\7\b\u0080\n\b\f\b\16\b\u0083"+
		"\13\b\3\t\3\t\7\t\u0087\n\t\f\t\16\t\u008a\13\t\3\t\3\t\3\n\3\n\3\n\3"+
		"\n\5\n\u0092\n\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\5\n\u009b\n\n\3\n\7\n\u009e"+
		"\n\n\f\n\16\n\u00a1\13\n\3\n\5\n\u00a4\n\n\3\n\3\n\5\n\u00a8\n\n\3\n\3"+
		"\n\5\n\u00ac\n\n\7\n\u00ae\n\n\f\n\16\n\u00b1\13\n\3\n\3\n\3\n\3\n\3\n"+
		"\3\n\3\n\3\n\5\n\u00bb\n\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n"+
		"\3\n\5\n\u00c9\n\n\3\n\3\n\3\n\3\n\3\n\5\n\u00d0\n\n\3\13\3\13\3\13\3"+
		"\13\7\13\u00d6\n\13\f\13\16\13\u00d9\13\13\5\13\u00db\n\13\3\13\3\13\3"+
		"\f\3\f\3\f\3\f\3\r\3\r\3\16\5\16\u00e6\n\16\3\16\3\16\3\16\7\16\u00eb"+
		"\n\16\f\16\16\16\u00ee\13\16\3\17\3\17\3\17\7\17\u00f3\n\17\f\17\16\17"+
		"\u00f6\13\17\3\20\3\20\5\20\u00fa\n\20\3\20\3\20\3\20\3\20\3\20\3\20\3"+
		"\20\3\20\5\20\u0104\n\20\3\21\3\21\3\21\3\21\3\21\3\21\3\21\7\21\u010d"+
		"\n\21\f\21\16\21\u0110\13\21\3\22\3\22\3\22\3\22\3\22\5\22\u0117\n\22"+
		"\3\22\3\22\5\22\u011b\n\22\3\22\7\22\u011e\n\22\f\22\16\22\u0121\13\22"+
		"\5\22\u0123\n\22\3\23\3\23\3\23\5\23\u0128\n\23\3\23\2\2\24\2\4\6\b\n"+
		"\f\16\20\22\24\26\30\32\34\36 \"$\2\3\4\2\3\3--\2\u0143\2&\3\2\2\2\4)"+
		"\3\2\2\2\6>\3\2\2\2\bK\3\2\2\2\n[\3\2\2\2\fh\3\2\2\2\16x\3\2\2\2\20\u0084"+
		"\3\2\2\2\22\u00cf\3\2\2\2\24\u00d1\3\2\2\2\26\u00de\3\2\2\2\30\u00e2\3"+
		"\2\2\2\32\u00e5\3\2\2\2\34\u00ef\3\2\2\2\36\u0103\3\2\2\2 \u0105\3\2\2"+
		"\2\"\u0111\3\2\2\2$\u0124\3\2\2\2&\'\b\2\1\2\'(\5\4\3\2(\3\3\2\2\2)*\7"+
		"\21\2\2*+\b\3\1\2+,\7+\2\2,\62\b\3\1\2-\61\5\6\4\2.\61\5\b\5\2/\61\5\n"+
		"\6\2\60-\3\2\2\2\60.\3\2\2\2\60/\3\2\2\2\61\64\3\2\2\2\62\60\3\2\2\2\62"+
		"\63\3\2\2\2\63\65\3\2\2\2\64\62\3\2\2\2\65\67\7\27\2\2\668\5\f\7\2\67"+
		"\66\3\2\2\289\3\2\2\29\67\3\2\2\29:\3\2\2\2:;\3\2\2\2;<\7\30\2\2<=\b\3"+
		"\1\2=\5\3\2\2\2>?\7\b\2\2?@\b\4\1\2@A\5$\23\2AB\b\4\1\2BC\7+\2\2CD\b\4"+
		"\1\2DE\7$\2\2EF\b\4\1\2FG\t\2\2\2GH\b\4\1\2HI\7\23\2\2IJ\b\4\1\2J\7\3"+
		"\2\2\2KL\5$\23\2LM\b\5\1\2MN\7+\2\2NU\b\5\1\2OP\7\22\2\2PQ\b\5\1\2QR\7"+
		"+\2\2RT\b\5\1\2SO\3\2\2\2TW\3\2\2\2US\3\2\2\2UV\3\2\2\2VX\3\2\2\2WU\3"+
		"\2\2\2XY\7\23\2\2YZ\b\5\1\2Z\t\3\2\2\2[\\\7\7\2\2\\]\7+\2\2]a\7\27\2\2"+
		"^`\5\b\5\2_^\3\2\2\2`c\3\2\2\2a_\3\2\2\2ab\3\2\2\2bd\3\2\2\2ca\3\2\2\2"+
		"de\7\30\2\2e\13\3\2\2\2fi\5$\23\2gi\7\16\2\2hf\3\2\2\2hg\3\2\2\2ij\3\2"+
		"\2\2jk\7+\2\2km\7\31\2\2ln\5\16\b\2ml\3\2\2\2mn\3\2\2\2no\3\2\2\2os\7"+
		"\32\2\2pr\5\b\5\2qp\3\2\2\2ru\3\2\2\2sq\3\2\2\2st\3\2\2\2tv\3\2\2\2us"+
		"\3\2\2\2vw\5\20\t\2w\r\3\2\2\2xy\5$\23\2yz\b\b\1\2z\u0081\7+\2\2{|\7\22"+
		"\2\2|}\5$\23\2}~\7+\2\2~\u0080\3\2\2\2\177{\3\2\2\2\u0080\u0083\3\2\2"+
		"\2\u0081\177\3\2\2\2\u0081\u0082\3\2\2\2\u0082\17\3\2\2\2\u0083\u0081"+
		"\3\2\2\2\u0084\u0088\7\27\2\2\u0085\u0087\5\22\n\2\u0086\u0085\3\2\2\2"+
		"\u0087\u008a\3\2\2\2\u0088\u0086\3\2\2\2\u0088\u0089\3\2\2\2\u0089\u008b"+
		"\3\2\2\2\u008a\u0088\3\2\2\2\u008b\u008c\7\30\2\2\u008c\21\3\2\2\2\u008d"+
		"\u0091\5 \21\2\u008e\u008f\7$\2\2\u008f\u0092\5\32\16\2\u0090\u0092\5"+
		"\24\13\2\u0091\u008e\3\2\2\2\u0091\u0090\3\2\2\2\u0092\u0093\3\2\2\2\u0093"+
		"\u0094\7\23\2\2\u0094\u00d0\3\2\2\2\u0095\u0096\7\n\2\2\u0096\u0097\7"+
		"\31\2\2\u0097\u0098\5\26\f\2\u0098\u009a\7\32\2\2\u0099\u009b\7\27\2\2"+
		"\u009a\u0099\3\2\2\2\u009a\u009b\3\2\2\2\u009b\u009f\3\2\2\2\u009c\u009e"+
		"\5\22\n\2\u009d\u009c\3\2\2\2\u009e\u00a1\3\2\2\2\u009f\u009d\3\2\2\2"+
		"\u009f\u00a0\3\2\2\2\u00a0\u00a3\3\2\2\2\u00a1\u009f\3\2\2\2\u00a2\u00a4"+
		"\7\30\2\2\u00a3\u00a2\3\2\2\2\u00a3\u00a4\3\2\2\2\u00a4\u00af\3\2\2\2"+
		"\u00a5\u00a7\7\t\2\2\u00a6\u00a8\7\27\2\2\u00a7\u00a6\3\2\2\2\u00a7\u00a8"+
		"\3\2\2\2\u00a8\u00a9\3\2\2\2\u00a9\u00ab\5\22\n\2\u00aa\u00ac\7\30\2\2"+
		"\u00ab\u00aa\3\2\2\2\u00ab\u00ac\3\2\2\2\u00ac\u00ae\3\2\2\2\u00ad\u00a5"+
		"\3\2\2\2\u00ae\u00b1\3\2\2\2\u00af\u00ad\3\2\2\2\u00af\u00b0\3\2\2\2\u00b0"+
		"\u00d0\3\2\2\2\u00b1\u00af\3\2\2\2\u00b2\u00b3\7\17\2\2\u00b3\u00b4\7"+
		"\31\2\2\u00b4\u00b5\5\26\f\2\u00b5\u00b6\7\32\2\2\u00b6\u00b7\5\22\n\2"+
		"\u00b7\u00d0\3\2\2\2\u00b8\u00ba\7\r\2\2\u00b9\u00bb\5\32\16\2\u00ba\u00b9"+
		"\3\2\2\2\u00ba\u00bb\3\2\2\2\u00bb\u00bc\3\2\2\2\u00bc\u00d0\7\23\2\2"+
		"\u00bd\u00be\7\f\2\2\u00be\u00bf\7\31\2\2\u00bf\u00c0\5 \21\2\u00c0\u00c1"+
		"\7\32\2\2\u00c1\u00c2\7\23\2\2\u00c2\u00d0\3\2\2\2\u00c3\u00c4\7\20\2"+
		"\2\u00c4\u00c5\7\31\2\2\u00c5\u00c8\5\32\16\2\u00c6\u00c7\7\22\2\2\u00c7"+
		"\u00c9\7\3\2\2\u00c8\u00c6\3\2\2\2\u00c8\u00c9\3\2\2\2\u00c9\u00ca\3\2"+
		"\2\2\u00ca\u00cb\7\32\2\2\u00cb\u00cc\7\23\2\2\u00cc\u00d0\3\2\2\2\u00cd"+
		"\u00d0\5\20\t\2\u00ce\u00d0\7\23\2\2\u00cf\u008d\3\2\2\2\u00cf\u0095\3"+
		"\2\2\2\u00cf\u00b2\3\2\2\2\u00cf\u00b8\3\2\2\2\u00cf\u00bd\3\2\2\2\u00cf"+
		"\u00c3\3\2\2\2\u00cf\u00cd\3\2\2\2\u00cf\u00ce\3\2\2\2\u00d0\23\3\2\2"+
		"\2\u00d1\u00da\7\31\2\2\u00d2\u00d7\5\32\16\2\u00d3\u00d4\7\22\2\2\u00d4"+
		"\u00d6\5\32\16\2\u00d5\u00d3\3\2\2\2\u00d6\u00d9\3\2\2\2\u00d7\u00d5\3"+
		"\2\2\2\u00d7\u00d8\3\2\2\2\u00d8\u00db\3\2\2\2\u00d9\u00d7\3\2\2\2\u00da"+
		"\u00d2\3\2\2\2\u00da\u00db\3\2\2\2\u00db\u00dc\3\2\2\2\u00dc\u00dd\7\32"+
		"\2\2\u00dd\25\3\2\2\2\u00de\u00df\5\32\16\2\u00df\u00e0\5\30\r\2\u00e0"+
		"\u00e1\5\32\16\2\u00e1\27\3\2\2\2\u00e2\u00e3\7\33\2\2\u00e3\31\3\2\2"+
		"\2\u00e4\u00e6\7&\2\2\u00e5\u00e4\3\2\2\2\u00e5\u00e6\3\2\2\2\u00e6\u00e7"+
		"\3\2\2\2\u00e7\u00ec\5\34\17\2\u00e8\u00e9\7\34\2\2\u00e9\u00eb\5\34\17"+
		"\2\u00ea\u00e8\3\2\2\2\u00eb\u00ee\3\2\2\2\u00ec\u00ea\3\2\2\2\u00ec\u00ed"+
		"\3\2\2\2\u00ed\33\3\2\2\2\u00ee\u00ec\3\2\2\2\u00ef\u00f4\5\36\20\2\u00f0"+
		"\u00f1\7\35\2\2\u00f1\u00f3\5\36\20\2\u00f2\u00f0\3\2\2\2\u00f3\u00f6"+
		"\3\2\2\2\u00f4\u00f2\3\2\2\2\u00f4\u00f5\3\2\2\2\u00f5\35\3\2\2\2\u00f6"+
		"\u00f4\3\2\2\2\u00f7\u00f9\5 \21\2\u00f8\u00fa\5\24\13\2\u00f9\u00f8\3"+
		"\2\2\2\u00f9\u00fa\3\2\2\2\u00fa\u0104\3\2\2\2\u00fb\u0104\7\3\2\2\u00fc"+
		"\u0104\7-\2\2\u00fd\u00fe\7\13\2\2\u00fe\u0104\5\"\22\2\u00ff\u0100\7"+
		"\31\2\2\u0100\u0101\5\32\16\2\u0101\u0102\7\32\2\2\u0102\u0104\3\2\2\2"+
		"\u0103\u00f7\3\2\2\2\u0103\u00fb\3\2\2\2\u0103\u00fc\3\2\2\2\u0103\u00fd"+
		"\3\2\2\2\u0103\u00ff\3\2\2\2\u0104\37\3\2\2\2\u0105\u010e\7+\2\2\u0106"+
		"\u0107\7\24\2\2\u0107\u010d\7+\2\2\u0108\u0109\7\25\2\2\u0109\u010a\5"+
		"\32\16\2\u010a\u010b\7\26\2\2\u010b\u010d\3\2\2\2\u010c\u0106\3\2\2\2"+
		"\u010c\u0108\3\2\2\2\u010d\u0110\3\2\2\2\u010e\u010c\3\2\2\2\u010e\u010f"+
		"\3\2\2\2\u010f!\3\2\2\2\u0110\u010e\3\2\2\2\u0111\u0122\7+\2\2\u0112\u0113"+
		"\7\31\2\2\u0113\u0114\5\32\16\2\u0114\u0115\7\32\2\2\u0115\u0117\3\2\2"+
		"\2\u0116\u0112\3\2\2\2\u0116\u0117\3\2\2\2\u0117\u0123\3\2\2\2\u0118\u011a"+
		"\7\25\2\2\u0119\u011b\5\32\16\2\u011a\u0119\3\2\2\2\u011a\u011b\3\2\2"+
		"\2\u011b\u011c\3\2\2\2\u011c\u011e\7\26\2\2\u011d\u0118\3\2\2\2\u011e"+
		"\u0121\3\2\2\2\u011f\u011d\3\2\2\2\u011f\u0120\3\2\2\2\u0120\u0123\3\2"+
		"\2\2\u0121\u011f\3\2\2\2\u0122\u0116\3\2\2\2\u0122\u011f\3\2\2\2\u0123"+
		"#\3\2\2\2\u0124\u0127\7+\2\2\u0125\u0126\7\25\2\2\u0126\u0128\7\26\2\2"+
		"\u0127\u0125\3\2\2\2\u0127\u0128\3\2\2\2\u0128%\3\2\2\2$\60\629Uahms\u0081"+
		"\u0088\u0091\u009a\u009f\u00a3\u00a7\u00ab\u00af\u00ba\u00c8\u00cf\u00d7"+
		"\u00da\u00e5\u00ec\u00f4\u00f9\u0103\u010c\u010e\u0116\u011a\u011f\u0122"+
		"\u0127";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}