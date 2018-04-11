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
		T__0=1, TOK_INTLIT=2, WhiteSpace=3, Comments=4, Unknown=5, TOK_CLASS=6, 
		TOK_FINAL=7, TOK_ELSE=8, TOK_IF=9, TOK_NEW=10, TOK_READ=11, TOK_RETURN=12, 
		TOK_VOID=13, TOK_WHILE=14, TOK_PRINT=15, TOK_PROGRAM=16, TOK_COMMA=17, 
		TOK_SEMI=18, TOK_DOT=19, TOK_LB=20, TOK_RB=21, TOK_LCB=22, TOK_RCB=23, 
		TOK_LP=24, TOK_RP=25, TOK_OP_REL=26, TOK_OP_ADD=27, TOK_OP_TIMES=28, TOK_EQ=29, 
		TOK_OP_NE=30, TOK_OP_LT=31, TOK_OP_LE=32, TOK_OP_GT=33, TOK_OP_GE=34, 
		TOK_OP_ASSIGN=35, OP_ADD_PLUS=36, OP_ADD_MINUS=37, OP_MUL_TIMES=38, OP_MUL_DIV=39, 
		OP_MUL_MOD=40, TOK_INVALID_IDENTIFIER=41, TOK_IDENTIFIER=42, TOK_INVALID_CHARLIT=43, 
		TOK_CHARLIT=44, UNRECOGNIZED_SYMBOL=45;
	public static final int
		RULE_program = 0, RULE_prog = 1, RULE_constDecl = 2, RULE_varDecl = 3, 
		RULE_classDecl = 4, RULE_methodDecl = 5, RULE_formPars = 6, RULE_block = 7, 
		RULE_statement = 8, RULE_actPars = 9, RULE_condition = 10, RULE_relop = 11, 
		RULE_expr = 12, RULE_term = 13, RULE_factor = 14, RULE_designator = 15, 
		RULE_x = 16, RULE_tok_lcb = 17, RULE_tok_rcb = 18, RULE_tok_lp = 19, RULE_tok_rp = 20, 
		RULE_semi = 21, RULE_validarray = 22, RULE_invalidarray = 23, RULE_tok_lb = 24, 
		RULE_tok_rb = 25, RULE_varType = 26, RULE_vartp = 27, RULE_varArray = 28;
	public static final String[] ruleNames = {
		"program", "prog", "constDecl", "varDecl", "classDecl", "methodDecl", 
		"formPars", "block", "statement", "actPars", "condition", "relop", "expr", 
		"term", "factor", "designator", "x", "tok_lcb", "tok_rcb", "tok_lp", "tok_rp", 
		"semi", "validarray", "invalidarray", "tok_lb", "tok_rb", "varType", "vartp", 
		"varArray"
	};

	private static final String[] _LITERAL_NAMES = {
		null, "'''", null, null, null, null, "'class'", "'final'", "'else'", "'if'", 
		"'new'", "'read'", "'return'", "'void'", "'while'", "'print'", "'program'", 
		"','", "';'", "'.'", "'['", "']'", "'{'", "'}'", "'('", "')'", null, null, 
		null, "'=='", "'!='", "'<'", null, "'>'", null, "'='", "'+'", "'-'", "'*'", 
		"'/'", "'%'"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, null, "TOK_INTLIT", "WhiteSpace", "Comments", "Unknown", "TOK_CLASS", 
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
	    public static ASTNode v= new ASTNode();
	    public static Stack<Stack<ASTNode>> tempStack=new Stack<Stack<ASTNode>>(); //list of children of the current subroot
	    public static Stack<ASTNode> nodeStack=new Stack<ASTNode>(); //all subtrees
	    public static ASTNode Ptree=new ASTNode(); //The root of the program
	    public static String readType="";
	    static boolean hasParam=false;
	    static boolean returnsExpr =false;
	    static String token= "";
	    static int id=0;
	    static int pid=-1;
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

	    public static void addToLastList(int id, int pid, String type, String name){
	        try{
	            tempStack.peek().push(new ASTNode(id,pid,type,name));
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

	    public static void createSubtree(int id, int pid, String type, String name){
	        try{
	            nodeStack.push(new ASTNode(id, pid, type,name));
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

	    public static void printlist(Stack<ASTNode> s){
	            Object[] ar = s.toArray();
	            for (Object nd : ar) {
	                System.out.println(nd.toString());
	            }
	    }
	    public static void tmethod(){
	        ASTNode f= nodeStack.pop();
	        System.out.println(";;;;;;;;;;;;;;");
	        f.print(1);
	        nodeStack.peek().add(f);
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
			token=lexer.getText();     
			setState(59);
			prog();
			System.out.println("------------"+token+"\n");  nodeStack.peek().printcaller(1);  System.out.println("\n------------"+token);
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
		public Tok_lcbContext tok_lcb() {
			return getRuleContext(Tok_lcbContext.class,0);
		}
		public Tok_rcbContext tok_rcb() {
			return getRuleContext(Tok_rcbContext.class,0);
		}
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
			setState(62);
			match(TOK_PROGRAM);
			createList(); System.out.println("**"+token);     token=lexer.getText();     System.out.println("*** "+token);
			setState(64);
			match(TOK_IDENTIFIER);
			createSubtree(id++, pid, "program name: ",token); System.out.println("****"+token);   /* printlastNodeStack();*/   token=lexer.getText();  pid++;
			setState(71);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << TOK_CLASS) | (1L << TOK_FINAL) | (1L << TOK_IDENTIFIER))) != 0)) {
				{
				setState(69);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case TOK_FINAL:
					{
					setState(66);
					constDecl();
					}
					break;
				case TOK_IDENTIFIER:
					{
					setState(67);
					varDecl();
					}
					break;
				case TOK_CLASS:
					{
					setState(68);
					classDecl();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				setState(73);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(74);
			tok_lcb();
			token=lexer.getText();
			setState(79); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(76);
				methodDecl();
				attachLastSubtreeToLastList();hasParam=false;
				}
				}
				setState(81); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==TOK_VOID || _la==TOK_IDENTIFIER );
			setState(83);
			tok_rcb();
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
			setState(86);
			match(TOK_FINAL);
			createList(); addToLastList(id,pid,"FINAL ",token);     token=lexer.getText();
			setState(88);
			varType();
			addToLastList(id,pid,"TYPE ",token);                 token=lexer.getText();
			setState(90);
			match(TOK_IDENTIFIER);
			createSubtree(id,pid,"TOK_IDENTIFIER ",token);               token=lexer.getText();
			setState(92);
			match(TOK_OP_ASSIGN);
			addToLastList(id,pid,"TOK_OP_ASSIGN ",token);               token=lexer.getText();
			setState(94);
			_la = _input.LA(1);
			if ( !(_la==TOK_INTLIT || _la==TOK_CHARLIT) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			addToLastList(id,pid,"VALUE ",token);   token=lexer.getText();
			setState(96);
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
			setState(99);
			varType();
			readType=token; System.out.println("TYPE HERE GETTEXT"+ readType);   createList(); addToLastList(id,pid,"TYPE",readType); {System.out.print("bbbbbbb"+token);}token=lexer.getText();System.out.print("bbbbbbb"+token);

			setState(102);
			match(TOK_IDENTIFIER);
			createSubtree(id,pid, "TOK_IDENTIFIER",token);  token=lexer.getText();
			setState(110);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==TOK_COMMA) {
				{
				{
				setState(104);
				match(TOK_COMMA);
				moveLastListToLastSubtree(); attachLastSubtreeToLastList();    token=lexer.getText();
				setState(106);
				match(TOK_IDENTIFIER);
				createList(); addToLastList(id,pid,"TOK_TYPE",readType); createSubtree(id,pid, "TOK_IDENTIFIER",token);    token=lexer.getText();
				}
				}
				setState(112);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(113);
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
		public Tok_lcbContext tok_lcb() {
			return getRuleContext(Tok_lcbContext.class,0);
		}
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
		enterRule(_localctx, 8, RULE_classDecl);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(116);
			match(TOK_CLASS);
			createList(); addToLastList(id,pid,"CLASS",token);    token=lexer.getText();
			setState(118);
			match(TOK_IDENTIFIER);
			createSubtree(id,pid, "TOK_IDENTIFIER",token); token=lexer.getText();
			setState(120);
			tok_lcb();
			token=lexer.getText();
			setState(125);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==TOK_IDENTIFIER) {
				{
				{
				setState(122);
				varDecl();
				}
				}
				setState(127);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(128);
			tok_rcb();
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

	public static class MethodDeclContext extends ParserRuleContext {
		public TerminalNode TOK_IDENTIFIER() { return getToken(grParser.TOK_IDENTIFIER, 0); }
		public Tok_lpContext tok_lp() {
			return getRuleContext(Tok_lpContext.class,0);
		}
		public Tok_rpContext tok_rp() {
			return getRuleContext(Tok_rpContext.class,0);
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
		public List<BlockContext> block() {
			return getRuleContexts(BlockContext.class);
		}
		public BlockContext block(int i) {
			return getRuleContext(BlockContext.class,i);
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
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(133);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case TOK_IDENTIFIER:
				{
				setState(131);
				varType();
				}
				break;
			case TOK_VOID:
				{
				setState(132);
				match(TOK_VOID);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			createList();      addToLastList(id,pid,"TYPE",token);   token=lexer.getText();
			setState(136);
			match(TOK_IDENTIFIER);
			createSubtree(id,pid, "TOK_IDENTIFIER ",token); token=lexer.getText(); moveLastListToLastSubtree();
			setState(138);
			tok_lp();
			token=lexer.getText();
			setState(141);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==TOK_IDENTIFIER) {
				{
				setState(140);
				formPars();
				}
			}

			token=lexer.getText();
			setState(144);
			tok_rp();
			if(hasParam){  System.out.println("00000000000000000");

			                                    moveLastListToLastSubtree(); attachLastSubtreeToLastList();
			                                    System.out.println("000000000000000000");
			                                    moveLastListToLastSubtree();
			                                    System.out.println("000000000000000000");
			                                    }
			                                    token=lexer.getText();
			                                    
			setState(149);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,7,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(146);
					varDecl();
					}
					} 
				}
				setState(151);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,7,_ctx);
			}
			token=lexer.getText();
			setState(156);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==TOK_LCB) {
				{
				{
				setState(153);
				block();
				}
				}
				setState(158);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			token=lexer.getText(); System.out.println("*** "); nodeStack.peek().printcaller(1);if(hasParam){tmethod();}System.out.println("*** "); nodeStack.peek().print(1);
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
			setState(161);
			varType();
			hasParam=true; createSubtree(id, pid, "PARAMS_ROOT", "Params");
			                        createList(); createList(); addToLastList(id, pid,"TYPE",token);  token=lexer.getText();
			setState(163);
			match(TOK_IDENTIFIER);
			createSubtree(id, pid,"TOK_IDENTIFIER",token); token=lexer.getText();
			setState(174);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==TOK_COMMA) {
				{
				{
				setState(165);
				match(TOK_COMMA);
				moveLastListToLastSubtree(); attachLastSubtreeToLastList();    token=lexer.getText();
				setState(167);
				varType();
				createList(); addToLastList(id, pid,"TYPE",token);  token=lexer.getText();
				setState(169);
				match(TOK_IDENTIFIER);
				createSubtree(id, pid,"TOK_IDENTIFIER",token);  token=lexer.getText();
				}
				}
				setState(176);
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
		public Tok_lcbContext tok_lcb() {
			return getRuleContext(Tok_lcbContext.class,0);
		}
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
		enterRule(_localctx, 14, RULE_block);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(177);
			tok_lcb();
			setState(181);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << TOK_IF) | (1L << TOK_READ) | (1L << TOK_RETURN) | (1L << TOK_WHILE) | (1L << TOK_PRINT) | (1L << TOK_SEMI) | (1L << TOK_LCB) | (1L << TOK_IDENTIFIER))) != 0)) {
				{
				{
				setState(178);
				statement();
				}
				}
				setState(183);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(184);
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
		public TerminalNode TOK_SEMI() { return getToken(grParser.TOK_SEMI, 0); }
		public TerminalNode TOK_OP_ASSIGN() { return getToken(grParser.TOK_OP_ASSIGN, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public ActParsContext actPars() {
			return getRuleContext(ActParsContext.class,0);
		}
		public TerminalNode TOK_IF() { return getToken(grParser.TOK_IF, 0); }
		public Tok_lpContext tok_lp() {
			return getRuleContext(Tok_lpContext.class,0);
		}
		public ConditionContext condition() {
			return getRuleContext(ConditionContext.class,0);
		}
		public Tok_rpContext tok_rp() {
			return getRuleContext(Tok_rpContext.class,0);
		}
		public List<Tok_lcbContext> tok_lcb() {
			return getRuleContexts(Tok_lcbContext.class);
		}
		public Tok_lcbContext tok_lcb(int i) {
			return getRuleContext(Tok_lcbContext.class,i);
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
		enterRule(_localctx, 16, RULE_statement);
		int _la;
		try {
			int _alt;
			setState(252);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case TOK_IDENTIFIER:
				enterOuterAlt(_localctx, 1);
				{
				setState(186);
				designator();
				setState(190);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case TOK_OP_ASSIGN:
					{
					setState(187);
					match(TOK_OP_ASSIGN);
					setState(188);
					expr();
					}
					break;
				case TOK_LP:
					{
					setState(189);
					actPars();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(192);
				match(TOK_SEMI);
				}
				break;
			case TOK_IF:
				enterOuterAlt(_localctx, 2);
				{
				setState(194);
				match(TOK_IF);
				setState(195);
				tok_lp();
				setState(196);
				condition();
				setState(197);
				tok_rp();
				setState(199);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,12,_ctx) ) {
				case 1:
					{
					setState(198);
					tok_lcb();
					}
					break;
				}
				setState(204);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,13,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(201);
						statement();
						}
						} 
					}
					setState(206);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,13,_ctx);
				}
				setState(208);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,14,_ctx) ) {
				case 1:
					{
					setState(207);
					tok_rcb();
					}
					break;
				}
				setState(220);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,17,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(210);
						match(TOK_ELSE);
						setState(212);
						_errHandler.sync(this);
						switch ( getInterpreter().adaptivePredict(_input,15,_ctx) ) {
						case 1:
							{
							setState(211);
							tok_lcb();
							}
							break;
						}
						setState(214);
						statement();
						setState(216);
						_errHandler.sync(this);
						switch ( getInterpreter().adaptivePredict(_input,16,_ctx) ) {
						case 1:
							{
							setState(215);
							tok_rcb();
							}
							break;
						}
						}
						} 
					}
					setState(222);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,17,_ctx);
				}
				}
				break;
			case TOK_WHILE:
				enterOuterAlt(_localctx, 3);
				{
				setState(223);
				match(TOK_WHILE);
				setState(224);
				tok_lp();
				setState(225);
				condition();
				setState(226);
				tok_rp();
				setState(227);
				statement();
				}
				break;
			case TOK_RETURN:
				enterOuterAlt(_localctx, 4);
				{
				setState(229);
				match(TOK_RETURN);
				setState(231);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << TOK_INTLIT) | (1L << TOK_NEW) | (1L << TOK_LP) | (1L << OP_ADD_MINUS) | (1L << TOK_IDENTIFIER) | (1L << TOK_CHARLIT))) != 0)) {
					{
					setState(230);
					expr();
					}
				}

				setState(233);
				match(TOK_SEMI);
				}
				break;
			case TOK_READ:
				enterOuterAlt(_localctx, 5);
				{
				setState(234);
				match(TOK_READ);
				setState(235);
				tok_lp();
				setState(236);
				designator();
				setState(237);
				tok_rp();
				setState(238);
				match(TOK_SEMI);
				}
				break;
			case TOK_PRINT:
				enterOuterAlt(_localctx, 6);
				{
				setState(240);
				match(TOK_PRINT);
				setState(241);
				tok_lp();
				setState(242);
				expr();
				setState(245);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==TOK_COMMA) {
					{
					setState(243);
					match(TOK_COMMA);
					setState(244);
					match(TOK_INTLIT);
					}
				}

				setState(247);
				tok_rp();
				setState(248);
				match(TOK_SEMI);
				}
				break;
			case TOK_LCB:
				enterOuterAlt(_localctx, 7);
				{
				setState(250);
				block();
				}
				break;
			case TOK_SEMI:
				enterOuterAlt(_localctx, 8);
				{
				setState(251);
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
		public Tok_lpContext tok_lp() {
			return getRuleContext(Tok_lpContext.class,0);
		}
		public Tok_rpContext tok_rp() {
			return getRuleContext(Tok_rpContext.class,0);
		}
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
			setState(254);
			tok_lp();
			setState(263);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << TOK_INTLIT) | (1L << TOK_NEW) | (1L << TOK_LP) | (1L << OP_ADD_MINUS) | (1L << TOK_IDENTIFIER) | (1L << TOK_CHARLIT))) != 0)) {
				{
				setState(255);
				expr();
				setState(260);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==TOK_COMMA) {
					{
					{
					setState(256);
					match(TOK_COMMA);
					setState(257);
					expr();
					}
					}
					setState(262);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
			}

			setState(265);
			tok_rp();
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
			setState(267);
			expr();
			setState(268);
			relop();
			setState(269);
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
			setState(271);
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
			setState(274);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==OP_ADD_MINUS) {
				{
				setState(273);
				match(OP_ADD_MINUS);
				}
			}

			setState(276);
			term();
			setState(281);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==TOK_OP_ADD) {
				{
				{
				setState(277);
				match(TOK_OP_ADD);
				setState(278);
				term();
				}
				}
				setState(283);
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
			setState(284);
			factor();
			setState(289);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==TOK_OP_TIMES) {
				{
				{
				setState(285);
				match(TOK_OP_TIMES);
				setState(286);
				factor();
				}
				}
				setState(291);
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
		public Tok_lpContext tok_lp() {
			return getRuleContext(Tok_lpContext.class,0);
		}
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public Tok_rpContext tok_rp() {
			return getRuleContext(Tok_rpContext.class,0);
		}
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
			setState(304);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case TOK_IDENTIFIER:
				enterOuterAlt(_localctx, 1);
				{
				setState(292);
				designator();
				setState(294);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==TOK_LP) {
					{
					setState(293);
					actPars();
					}
				}

				}
				break;
			case TOK_INTLIT:
				enterOuterAlt(_localctx, 2);
				{
				setState(296);
				match(TOK_INTLIT);
				}
				break;
			case TOK_CHARLIT:
				enterOuterAlt(_localctx, 3);
				{
				setState(297);
				match(TOK_CHARLIT);
				}
				break;
			case TOK_NEW:
				enterOuterAlt(_localctx, 4);
				{
				setState(298);
				match(TOK_NEW);
				setState(299);
				x();
				}
				break;
			case TOK_LP:
				enterOuterAlt(_localctx, 5);
				{
				setState(300);
				tok_lp();
				setState(301);
				expr();
				setState(302);
				tok_rp();
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
		public List<Tok_lbContext> tok_lb() {
			return getRuleContexts(Tok_lbContext.class);
		}
		public Tok_lbContext tok_lb(int i) {
			return getRuleContext(Tok_lbContext.class,i);
		}
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public List<Tok_rbContext> tok_rb() {
			return getRuleContexts(Tok_rbContext.class);
		}
		public Tok_rbContext tok_rb(int i) {
			return getRuleContext(Tok_rbContext.class,i);
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
			setState(306);
			match(TOK_IDENTIFIER);
			setState(317);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==TOK_DOT || _la==TOK_LB) {
				{
				setState(315);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case TOK_DOT:
					{
					setState(307);
					match(TOK_DOT);
					setState(308);
					match(TOK_IDENTIFIER);
					}
					break;
				case TOK_LB:
					{
					setState(309);
					tok_lb();
					token=lexer.getText();

					            try{
					              System.out.println(token+".........");
					            if(token.equals("-")){System.out.println("cLLLLLLLLLLL");}
					            else{}
					            }catch(Exception e){
					                System.out.println("kkk"+e);
					            }
					            
					setState(312);
					expr();
					setState(313);
					tok_rb();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				setState(319);
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
		public Tok_lpContext tok_lp() {
			return getRuleContext(Tok_lpContext.class,0);
		}
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public Tok_rpContext tok_rp() {
			return getRuleContext(Tok_rpContext.class,0);
		}
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
		enterRule(_localctx, 32, RULE_x);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(320);
			match(TOK_IDENTIFIER);
			setState(338);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,33,_ctx) ) {
			case 1:
				{
				setState(325);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==TOK_LP) {
					{
					setState(321);
					tok_lp();
					setState(322);
					expr();
					setState(323);
					tok_rp();
					}
				}

				}
				break;
			case 2:
				{
				setState(335);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==TOK_LB) {
					{
					{
					setState(327);
					tok_lb();
					setState(329);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << TOK_INTLIT) | (1L << TOK_NEW) | (1L << TOK_LP) | (1L << OP_ADD_MINUS) | (1L << TOK_IDENTIFIER) | (1L << TOK_CHARLIT))) != 0)) {
						{
						setState(328);
						expr();
						}
					}

					setState(331);
					tok_rb();
					}
					}
					setState(337);
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

	public static class Tok_lcbContext extends ParserRuleContext {
		public TerminalNode TOK_LCB() { return getToken(grParser.TOK_LCB, 0); }
		public Tok_lcbContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_tok_lcb; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof grListener ) ((grListener)listener).enterTok_lcb(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof grListener ) ((grListener)listener).exitTok_lcb(this);
		}
	}

	public final Tok_lcbContext tok_lcb() throws RecognitionException {
		Tok_lcbContext _localctx = new Tok_lcbContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_tok_lcb);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(340);
			match(TOK_LCB);
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
		enterRule(_localctx, 36, RULE_tok_rcb);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(342);
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

	public static class Tok_lpContext extends ParserRuleContext {
		public TerminalNode TOK_LP() { return getToken(grParser.TOK_LP, 0); }
		public Tok_lpContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_tok_lp; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof grListener ) ((grListener)listener).enterTok_lp(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof grListener ) ((grListener)listener).exitTok_lp(this);
		}
	}

	public final Tok_lpContext tok_lp() throws RecognitionException {
		Tok_lpContext _localctx = new Tok_lpContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_tok_lp);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(344);
			match(TOK_LP);
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

	public static class Tok_rpContext extends ParserRuleContext {
		public TerminalNode TOK_RP() { return getToken(grParser.TOK_RP, 0); }
		public Tok_rpContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_tok_rp; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof grListener ) ((grListener)listener).enterTok_rp(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof grListener ) ((grListener)listener).exitTok_rp(this);
		}
	}

	public final Tok_rpContext tok_rp() throws RecognitionException {
		Tok_rpContext _localctx = new Tok_rpContext(_ctx, getState());
		enterRule(_localctx, 40, RULE_tok_rp);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(346);
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
		enterRule(_localctx, 42, RULE_semi);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(348);
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
		enterRule(_localctx, 44, RULE_validarray);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(350);
			tok_lb();
			setState(351);
			expr();
			setState(352);
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
		enterRule(_localctx, 46, RULE_invalidarray);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(354);
			tok_lb();
			setState(355);
			match(T__0);
			System.out.println("cannot define with character index");
			setState(357);
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
		enterRule(_localctx, 48, RULE_tok_lb);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(359);
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
		enterRule(_localctx, 50, RULE_tok_rb);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(361);
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
		enterRule(_localctx, 52, RULE_varType);
		try {
			setState(365);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,34,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				{
				setState(363);
				vartp();
				}
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				{
				setState(364);
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
		enterRule(_localctx, 54, RULE_vartp);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(367);
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
		enterRule(_localctx, 56, RULE_varArray);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(369);
			match(TOK_IDENTIFIER);
			{
			setState(370);
			tok_lb();
			setState(371);
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3/\u0178\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\3\2\3\2\3\2\3\2\3\3"+
		"\3\3\3\3\3\3\3\3\3\3\3\3\7\3H\n\3\f\3\16\3K\13\3\3\3\3\3\3\3\3\3\3\3\6"+
		"\3R\n\3\r\3\16\3S\3\3\3\3\3\3\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4"+
		"\3\4\3\4\3\4\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\7\5o\n\5\f\5\16\5r\13"+
		"\5\3\5\3\5\3\5\3\6\3\6\3\6\3\6\3\6\3\6\3\6\7\6~\n\6\f\6\16\6\u0081\13"+
		"\6\3\6\3\6\3\6\3\7\3\7\5\7\u0088\n\7\3\7\3\7\3\7\3\7\3\7\3\7\5\7\u0090"+
		"\n\7\3\7\3\7\3\7\3\7\7\7\u0096\n\7\f\7\16\7\u0099\13\7\3\7\3\7\7\7\u009d"+
		"\n\7\f\7\16\7\u00a0\13\7\3\7\3\7\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3"+
		"\b\3\b\7\b\u00af\n\b\f\b\16\b\u00b2\13\b\3\t\3\t\7\t\u00b6\n\t\f\t\16"+
		"\t\u00b9\13\t\3\t\3\t\3\n\3\n\3\n\3\n\5\n\u00c1\n\n\3\n\3\n\3\n\3\n\3"+
		"\n\3\n\3\n\5\n\u00ca\n\n\3\n\7\n\u00cd\n\n\f\n\16\n\u00d0\13\n\3\n\5\n"+
		"\u00d3\n\n\3\n\3\n\5\n\u00d7\n\n\3\n\3\n\5\n\u00db\n\n\7\n\u00dd\n\n\f"+
		"\n\16\n\u00e0\13\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\5\n\u00ea\n\n\3\n\3"+
		"\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\5\n\u00f8\n\n\3\n\3\n\3\n\3"+
		"\n\3\n\5\n\u00ff\n\n\3\13\3\13\3\13\3\13\7\13\u0105\n\13\f\13\16\13\u0108"+
		"\13\13\5\13\u010a\n\13\3\13\3\13\3\f\3\f\3\f\3\f\3\r\3\r\3\16\5\16\u0115"+
		"\n\16\3\16\3\16\3\16\7\16\u011a\n\16\f\16\16\16\u011d\13\16\3\17\3\17"+
		"\3\17\7\17\u0122\n\17\f\17\16\17\u0125\13\17\3\20\3\20\5\20\u0129\n\20"+
		"\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\5\20\u0133\n\20\3\21\3\21\3\21"+
		"\3\21\3\21\3\21\3\21\3\21\3\21\7\21\u013e\n\21\f\21\16\21\u0141\13\21"+
		"\3\22\3\22\3\22\3\22\3\22\5\22\u0148\n\22\3\22\3\22\5\22\u014c\n\22\3"+
		"\22\3\22\7\22\u0150\n\22\f\22\16\22\u0153\13\22\5\22\u0155\n\22\3\23\3"+
		"\23\3\24\3\24\3\25\3\25\3\26\3\26\3\27\3\27\3\30\3\30\3\30\3\30\3\31\3"+
		"\31\3\31\3\31\3\31\3\32\3\32\3\33\3\33\3\34\3\34\5\34\u0170\n\34\3\35"+
		"\3\35\3\36\3\36\3\36\3\36\3\36\2\2\37\2\4\6\b\n\f\16\20\22\24\26\30\32"+
		"\34\36 \"$&(*,.\60\62\64\668:\2\3\4\2\4\4..\2\u0187\2<\3\2\2\2\4@\3\2"+
		"\2\2\6X\3\2\2\2\be\3\2\2\2\nv\3\2\2\2\f\u0087\3\2\2\2\16\u00a3\3\2\2\2"+
		"\20\u00b3\3\2\2\2\22\u00fe\3\2\2\2\24\u0100\3\2\2\2\26\u010d\3\2\2\2\30"+
		"\u0111\3\2\2\2\32\u0114\3\2\2\2\34\u011e\3\2\2\2\36\u0132\3\2\2\2 \u0134"+
		"\3\2\2\2\"\u0142\3\2\2\2$\u0156\3\2\2\2&\u0158\3\2\2\2(\u015a\3\2\2\2"+
		"*\u015c\3\2\2\2,\u015e\3\2\2\2.\u0160\3\2\2\2\60\u0164\3\2\2\2\62\u0169"+
		"\3\2\2\2\64\u016b\3\2\2\2\66\u016f\3\2\2\28\u0171\3\2\2\2:\u0173\3\2\2"+
		"\2<=\b\2\1\2=>\5\4\3\2>?\b\2\1\2?\3\3\2\2\2@A\7\22\2\2AB\b\3\1\2BC\7,"+
		"\2\2CI\b\3\1\2DH\5\6\4\2EH\5\b\5\2FH\5\n\6\2GD\3\2\2\2GE\3\2\2\2GF\3\2"+
		"\2\2HK\3\2\2\2IG\3\2\2\2IJ\3\2\2\2JL\3\2\2\2KI\3\2\2\2LM\5$\23\2MQ\b\3"+
		"\1\2NO\5\f\7\2OP\b\3\1\2PR\3\2\2\2QN\3\2\2\2RS\3\2\2\2SQ\3\2\2\2ST\3\2"+
		"\2\2TU\3\2\2\2UV\5&\24\2VW\b\3\1\2W\5\3\2\2\2XY\7\t\2\2YZ\b\4\1\2Z[\5"+
		"\66\34\2[\\\b\4\1\2\\]\7,\2\2]^\b\4\1\2^_\7%\2\2_`\b\4\1\2`a\t\2\2\2a"+
		"b\b\4\1\2bc\7\24\2\2cd\b\4\1\2d\7\3\2\2\2ef\5\66\34\2fg\b\5\1\2gh\b\5"+
		"\1\2hi\7,\2\2ip\b\5\1\2jk\7\23\2\2kl\b\5\1\2lm\7,\2\2mo\b\5\1\2nj\3\2"+
		"\2\2or\3\2\2\2pn\3\2\2\2pq\3\2\2\2qs\3\2\2\2rp\3\2\2\2st\7\24\2\2tu\b"+
		"\5\1\2u\t\3\2\2\2vw\7\b\2\2wx\b\6\1\2xy\7,\2\2yz\b\6\1\2z{\5$\23\2{\177"+
		"\b\6\1\2|~\5\b\5\2}|\3\2\2\2~\u0081\3\2\2\2\177}\3\2\2\2\177\u0080\3\2"+
		"\2\2\u0080\u0082\3\2\2\2\u0081\177\3\2\2\2\u0082\u0083\5&\24\2\u0083\u0084"+
		"\b\6\1\2\u0084\13\3\2\2\2\u0085\u0088\5\66\34\2\u0086\u0088\7\17\2\2\u0087"+
		"\u0085\3\2\2\2\u0087\u0086\3\2\2\2\u0088\u0089\3\2\2\2\u0089\u008a\b\7"+
		"\1\2\u008a\u008b\7,\2\2\u008b\u008c\b\7\1\2\u008c\u008d\5(\25\2\u008d"+
		"\u008f\b\7\1\2\u008e\u0090\5\16\b\2\u008f\u008e\3\2\2\2\u008f\u0090\3"+
		"\2\2\2\u0090\u0091\3\2\2\2\u0091\u0092\b\7\1\2\u0092\u0093\5*\26\2\u0093"+
		"\u0097\b\7\1\2\u0094\u0096\5\b\5\2\u0095\u0094\3\2\2\2\u0096\u0099\3\2"+
		"\2\2\u0097\u0095\3\2\2\2\u0097\u0098\3\2\2\2\u0098\u009a\3\2\2\2\u0099"+
		"\u0097\3\2\2\2\u009a\u009e\b\7\1\2\u009b\u009d\5\20\t\2\u009c\u009b\3"+
		"\2\2\2\u009d\u00a0\3\2\2\2\u009e\u009c\3\2\2\2\u009e\u009f\3\2\2\2\u009f"+
		"\u00a1\3\2\2\2\u00a0\u009e\3\2\2\2\u00a1\u00a2\b\7\1\2\u00a2\r\3\2\2\2"+
		"\u00a3\u00a4\5\66\34\2\u00a4\u00a5\b\b\1\2\u00a5\u00a6\7,\2\2\u00a6\u00b0"+
		"\b\b\1\2\u00a7\u00a8\7\23\2\2\u00a8\u00a9\b\b\1\2\u00a9\u00aa\5\66\34"+
		"\2\u00aa\u00ab\b\b\1\2\u00ab\u00ac\7,\2\2\u00ac\u00ad\b\b\1\2\u00ad\u00af"+
		"\3\2\2\2\u00ae\u00a7\3\2\2\2\u00af\u00b2\3\2\2\2\u00b0\u00ae\3\2\2\2\u00b0"+
		"\u00b1\3\2\2\2\u00b1\17\3\2\2\2\u00b2\u00b0\3\2\2\2\u00b3\u00b7\5$\23"+
		"\2\u00b4\u00b6\5\22\n\2\u00b5\u00b4\3\2\2\2\u00b6\u00b9\3\2\2\2\u00b7"+
		"\u00b5\3\2\2\2\u00b7\u00b8\3\2\2\2\u00b8\u00ba\3\2\2\2\u00b9\u00b7\3\2"+
		"\2\2\u00ba\u00bb\5&\24\2\u00bb\21\3\2\2\2\u00bc\u00c0\5 \21\2\u00bd\u00be"+
		"\7%\2\2\u00be\u00c1\5\32\16\2\u00bf\u00c1\5\24\13\2\u00c0\u00bd\3\2\2"+
		"\2\u00c0\u00bf\3\2\2\2\u00c1\u00c2\3\2\2\2\u00c2\u00c3\7\24\2\2\u00c3"+
		"\u00ff\3\2\2\2\u00c4\u00c5\7\13\2\2\u00c5\u00c6\5(\25\2\u00c6\u00c7\5"+
		"\26\f\2\u00c7\u00c9\5*\26\2\u00c8\u00ca\5$\23\2\u00c9\u00c8\3\2\2\2\u00c9"+
		"\u00ca\3\2\2\2\u00ca\u00ce\3\2\2\2\u00cb\u00cd\5\22\n\2\u00cc\u00cb\3"+
		"\2\2\2\u00cd\u00d0\3\2\2\2\u00ce\u00cc\3\2\2\2\u00ce\u00cf\3\2\2\2\u00cf"+
		"\u00d2\3\2\2\2\u00d0\u00ce\3\2\2\2\u00d1\u00d3\5&\24\2\u00d2\u00d1\3\2"+
		"\2\2\u00d2\u00d3\3\2\2\2\u00d3\u00de\3\2\2\2\u00d4\u00d6\7\n\2\2\u00d5"+
		"\u00d7\5$\23\2\u00d6\u00d5\3\2\2\2\u00d6\u00d7\3\2\2\2\u00d7\u00d8\3\2"+
		"\2\2\u00d8\u00da\5\22\n\2\u00d9\u00db\5&\24\2\u00da\u00d9\3\2\2\2\u00da"+
		"\u00db\3\2\2\2\u00db\u00dd\3\2\2\2\u00dc\u00d4\3\2\2\2\u00dd\u00e0\3\2"+
		"\2\2\u00de\u00dc\3\2\2\2\u00de\u00df\3\2\2\2\u00df\u00ff\3\2\2\2\u00e0"+
		"\u00de\3\2\2\2\u00e1\u00e2\7\20\2\2\u00e2\u00e3\5(\25\2\u00e3\u00e4\5"+
		"\26\f\2\u00e4\u00e5\5*\26\2\u00e5\u00e6\5\22\n\2\u00e6\u00ff\3\2\2\2\u00e7"+
		"\u00e9\7\16\2\2\u00e8\u00ea\5\32\16\2\u00e9\u00e8\3\2\2\2\u00e9\u00ea"+
		"\3\2\2\2\u00ea\u00eb\3\2\2\2\u00eb\u00ff\7\24\2\2\u00ec\u00ed\7\r\2\2"+
		"\u00ed\u00ee\5(\25\2\u00ee\u00ef\5 \21\2\u00ef\u00f0\5*\26\2\u00f0\u00f1"+
		"\7\24\2\2\u00f1\u00ff\3\2\2\2\u00f2\u00f3\7\21\2\2\u00f3\u00f4\5(\25\2"+
		"\u00f4\u00f7\5\32\16\2\u00f5\u00f6\7\23\2\2\u00f6\u00f8\7\4\2\2\u00f7"+
		"\u00f5\3\2\2\2\u00f7\u00f8\3\2\2\2\u00f8\u00f9\3\2\2\2\u00f9\u00fa\5*"+
		"\26\2\u00fa\u00fb\7\24\2\2\u00fb\u00ff\3\2\2\2\u00fc\u00ff\5\20\t\2\u00fd"+
		"\u00ff\7\24\2\2\u00fe\u00bc\3\2\2\2\u00fe\u00c4\3\2\2\2\u00fe\u00e1\3"+
		"\2\2\2\u00fe\u00e7\3\2\2\2\u00fe\u00ec\3\2\2\2\u00fe\u00f2\3\2\2\2\u00fe"+
		"\u00fc\3\2\2\2\u00fe\u00fd\3\2\2\2\u00ff\23\3\2\2\2\u0100\u0109\5(\25"+
		"\2\u0101\u0106\5\32\16\2\u0102\u0103\7\23\2\2\u0103\u0105\5\32\16\2\u0104"+
		"\u0102\3\2\2\2\u0105\u0108\3\2\2\2\u0106\u0104\3\2\2\2\u0106\u0107\3\2"+
		"\2\2\u0107\u010a\3\2\2\2\u0108\u0106\3\2\2\2\u0109\u0101\3\2\2\2\u0109"+
		"\u010a\3\2\2\2\u010a\u010b\3\2\2\2\u010b\u010c\5*\26\2\u010c\25\3\2\2"+
		"\2\u010d\u010e\5\32\16\2\u010e\u010f\5\30\r\2\u010f\u0110\5\32\16\2\u0110"+
		"\27\3\2\2\2\u0111\u0112\7\34\2\2\u0112\31\3\2\2\2\u0113\u0115\7\'\2\2"+
		"\u0114\u0113\3\2\2\2\u0114\u0115\3\2\2\2\u0115\u0116\3\2\2\2\u0116\u011b"+
		"\5\34\17\2\u0117\u0118\7\35\2\2\u0118\u011a\5\34\17\2\u0119\u0117\3\2"+
		"\2\2\u011a\u011d\3\2\2\2\u011b\u0119\3\2\2\2\u011b\u011c\3\2\2\2\u011c"+
		"\33\3\2\2\2\u011d\u011b\3\2\2\2\u011e\u0123\5\36\20\2\u011f\u0120\7\36"+
		"\2\2\u0120\u0122\5\36\20\2\u0121\u011f\3\2\2\2\u0122\u0125\3\2\2\2\u0123"+
		"\u0121\3\2\2\2\u0123\u0124\3\2\2\2\u0124\35\3\2\2\2\u0125\u0123\3\2\2"+
		"\2\u0126\u0128\5 \21\2\u0127\u0129\5\24\13\2\u0128\u0127\3\2\2\2\u0128"+
		"\u0129\3\2\2\2\u0129\u0133\3\2\2\2\u012a\u0133\7\4\2\2\u012b\u0133\7."+
		"\2\2\u012c\u012d\7\f\2\2\u012d\u0133\5\"\22\2\u012e\u012f\5(\25\2\u012f"+
		"\u0130\5\32\16\2\u0130\u0131\5*\26\2\u0131\u0133\3\2\2\2\u0132\u0126\3"+
		"\2\2\2\u0132\u012a\3\2\2\2\u0132\u012b\3\2\2\2\u0132\u012c\3\2\2\2\u0132"+
		"\u012e\3\2\2\2\u0133\37\3\2\2\2\u0134\u013f\7,\2\2\u0135\u0136\7\25\2"+
		"\2\u0136\u013e\7,\2\2\u0137\u0138\5\62\32\2\u0138\u0139\b\21\1\2\u0139"+
		"\u013a\b\21\1\2\u013a\u013b\5\32\16\2\u013b\u013c\5\64\33\2\u013c\u013e"+
		"\3\2\2\2\u013d\u0135\3\2\2\2\u013d\u0137\3\2\2\2\u013e\u0141\3\2\2\2\u013f"+
		"\u013d\3\2\2\2\u013f\u0140\3\2\2\2\u0140!\3\2\2\2\u0141\u013f\3\2\2\2"+
		"\u0142\u0154\7,\2\2\u0143\u0144\5(\25\2\u0144\u0145\5\32\16\2\u0145\u0146"+
		"\5*\26\2\u0146\u0148\3\2\2\2\u0147\u0143\3\2\2\2\u0147\u0148\3\2\2\2\u0148"+
		"\u0155\3\2\2\2\u0149\u014b\5\62\32\2\u014a\u014c\5\32\16\2\u014b\u014a"+
		"\3\2\2\2\u014b\u014c\3\2\2\2\u014c\u014d\3\2\2\2\u014d\u014e\5\64\33\2"+
		"\u014e\u0150\3\2\2\2\u014f\u0149\3\2\2\2\u0150\u0153\3\2\2\2\u0151\u014f"+
		"\3\2\2\2\u0151\u0152\3\2\2\2\u0152\u0155\3\2\2\2\u0153\u0151\3\2\2\2\u0154"+
		"\u0147\3\2\2\2\u0154\u0151\3\2\2\2\u0155#\3\2\2\2\u0156\u0157\7\30\2\2"+
		"\u0157%\3\2\2\2\u0158\u0159\7\31\2\2\u0159\'\3\2\2\2\u015a\u015b\7\32"+
		"\2\2\u015b)\3\2\2\2\u015c\u015d\7\33\2\2\u015d+\3\2\2\2\u015e\u015f\7"+
		"\24\2\2\u015f-\3\2\2\2\u0160\u0161\5\62\32\2\u0161\u0162\5\32\16\2\u0162"+
		"\u0163\5\64\33\2\u0163/\3\2\2\2\u0164\u0165\5\62\32\2\u0165\u0166\7\3"+
		"\2\2\u0166\u0167\b\31\1\2\u0167\u0168\5\64\33\2\u0168\61\3\2\2\2\u0169"+
		"\u016a\7\26\2\2\u016a\63\3\2\2\2\u016b\u016c\7\27\2\2\u016c\65\3\2\2\2"+
		"\u016d\u0170\58\35\2\u016e\u0170\5:\36\2\u016f\u016d\3\2\2\2\u016f\u016e"+
		"\3\2\2\2\u0170\67\3\2\2\2\u0171\u0172\7,\2\2\u01729\3\2\2\2\u0173\u0174"+
		"\7,\2\2\u0174\u0175\5\62\32\2\u0175\u0176\5\64\33\2\u0176;\3\2\2\2%GI"+
		"Sp\177\u0087\u008f\u0097\u009e\u00b0\u00b7\u00c0\u00c9\u00ce\u00d2\u00d6"+
		"\u00da\u00de\u00e9\u00f7\u00fe\u0106\u0109\u0114\u011b\u0123\u0128\u0132"+
		"\u013d\u013f\u0147\u014b\u0151\u0154\u016f";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}