// Generated from C:/Users/User/IdeaProjects/anotherproject/src\gr.g4 by ANTLR 4.7

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Stack;
import java.util.Set;

import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class grLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.7", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		WhiteSpace=1, Comments=2, Unknown=3, TOK_INTLIT=4, TOK_CLASS=5, TOK_FINAL=6, 
		TOK_ELSE=7, TOK_IF=8, TOK_NEW=9, TOK_READ=10, TOK_RETURN=11, TOK_VOID=12, 
		TOK_WHILE=13, TOK_PRINT=14, TOK_PROGRAM=15, TOK_COMMA=16, TOK_SEMI=17, 
		TOK_DOT=18, TOK_LB=19, TOK_RB=20, TOK_LCB=21, TOK_RCB=22, TOK_LP=23, TOK_RP=24, 
		TOK_OP_REL=25, TOK_OP_ADD=26, TOK_OP_TIMES=27, TOK_EQ=28, TOK_OP_NE=29, 
		TOK_OP_LT=30, TOK_OP_LE=31, TOK_OP_GT=32, TOK_OP_GE=33, TOK_OP_ASSIGN=34, 
		OP_ADD_PLUS=35, OP_ADD_MINUS=36, OP_MUL_TIMES=37, OP_MUL_DIV=38, OP_MUL_MOD=39, 
		TOK_INVALID_IDENTIFIER=40, TOK_IDENTIFIER=41, TOK_INVALID_CHARLIT=42, 
		TOK_CHARLIT=43, UNRECOGNIZED_SYMBOL=44;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	public static final String[] ruleNames = {
		"WhiteSpace", "Comments", "Unknown", "TOK_INTLIT", "TOK_CLASS", "TOK_FINAL", 
		"TOK_ELSE", "TOK_IF", "TOK_NEW", "TOK_READ", "TOK_RETURN", "TOK_VOID", 
		"TOK_WHILE", "TOK_PRINT", "TOK_PROGRAM", "TOK_COMMA", "TOK_SEMI", "TOK_DOT", 
		"TOK_LB", "TOK_RB", "TOK_LCB", "TOK_RCB", "TOK_LP", "TOK_RP", "TOK_OP_REL", 
		"TOK_OP_ADD", "TOK_OP_TIMES", "TOK_EQ", "TOK_OP_NE", "TOK_OP_LT", "TOK_OP_LE", 
		"TOK_OP_GT", "TOK_OP_GE", "TOK_OP_ASSIGN", "OP_ADD_PLUS", "OP_ADD_MINUS", 
		"OP_MUL_TIMES", "OP_MUL_DIV", "OP_MUL_MOD", "TOK_INVALID_IDENTIFIER", 
		"TOK_IDENTIFIER", "TOK_INVALID_CHARLIT", "TOK_CHARLIT", "UNRECOGNIZED_SYMBOL", 
		"LETTER", "DIGIT"
	};

	private static final String[] _LITERAL_NAMES = {
		null, null, null, null, null, "'class'", "'final'", "'else'", "'if'", 
		"'new'", "'read'", "'return'", "'void'", "'while'", "'print'", "'program'", 
		"','", "';'", "'.'", "'['", "']'", "'{'", "'}'", "'('", "')'", null, null, 
		null, "'=='", "'!='", "'<'", null, "'>'", null, "'='", "'+'", "'-'", "'*'", 
		"'/'", "'%'"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, "WhiteSpace", "Comments", "Unknown", "TOK_INTLIT", "TOK_CLASS", 
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


	boolean lexicalError=false;
	    public ArrayList<Integer> tracker=new ArrayList<Integer>(){{   add(0);}};;
	    Writer errors=new Writer("phase3+/errors.txt");
	    Writer symbols=new Writer("phase3+/SymbolT.txt");
	    public static Stack<Stack<ASTNode>> tempStack=new Stack<Stack<ASTNode>>(); //list of children of the current subroot
	   Stack<ASTNode> nodeStack=new Stack<ASTNode>(); //all subtrees
	   ASTNode Ptree=new ASTNode(); //The root of the program
	   static int scope=0;
	   static int count=0;
	   static int isVar=0;
	   static int isClass=0;
	   static int isProgram=0;
	   static int isArray=0;
	   static int isAssign=0;
	   static int isMethod=0;
	   static int isField=0;
	   static int isFinal=0;
	   static String methodParams="";
	   static int isParams=0;
	   static String currType;
	   static SymbolHashTable classes=new SymbolHashTable();
	   static ArrayList<String> varTypes=new ArrayList<String>();
	   private java.util.Queue<Token> queue = new java.util.LinkedList<Token>();
	   public static SymbolHashTable symbolTable=new SymbolHashTable();
	    public void setTable(){
	        varTypes.add("int");
	        varTypes.add("char");
	        symbolTable.insert("int","int", "preloaded", 0,0);
	        symbolTable.insert("char","char", "preloaded", 0,0);
	        symbolTable.insert("null","null", "preloaded", 0,0);
	        symbolTable.insert("chr","chr", "preloaded", 0,0);
	        symbolTable.insert("ord","ord", "preloaded", 0,0);
	        symbolTable.insert("len","len", "preloaded", 0,0);
	        symbolTable.insert("program","program", "keyword", 0,0);
	        symbolTable.insert("class","class", "keyword", 0,0);
	        symbolTable.insert("if","if", "keyword", 0,0);
	        symbolTable.insert("else","else", "keyword", 0,0);
	        symbolTable.insert("while","while", "keyword", 0,0);
	        symbolTable.insert("read","read", "keyword", 0,0);
	        symbolTable.insert("print","print", "keyword", 0,0);
	        symbolTable.insert("return","return", "keyword", 0,0);
	        symbolTable.insert("void","void", "keyword", 0,0);
	        symbolTable.insert("final","final", "keyword", 0,0);
	        symbolTable.insert("new","new", "keyword", 0,0);
	    }
	     public int lexGetLine(){
	       return getLine();
	     }

	      public SymbolTableNode node;
	      @Override
	      public Token nextToken() {

	            if(!queue.isEmpty()) {
	              return queue.poll();
	            }

	            Token next = super.nextToken();

	            while(next.getType()==WhiteSpace){

	            }
	            if(next.getType() != Unknown) {
	                    if(next.getType()==TOK_LCB){
	                        count++;
	                    }
	                    if(next.getType()==TOK_PROGRAM){
	                      isProgram=1;
	                        node=new SymbolTableNode();
	                       node.type=getText();
	                  }
	                   if(next.getType()==TOK_FINAL){
	                      isFinal=1;
	                        node=new SymbolTableNode();
	                        node.isFinal=1;
	                      node.type=getText();
	                   }
	                   if(next.getType()==TOK_SEMI){
	                      isVar=0;
	                   }
	                   if(next.getType()==TOK_LB){
	                       isArray=1;
	                       node.isArray=1;
	                       node.type+="[]";
	                       isVar=0;
	                   }
	                   if(next.getType()==TOK_IDENTIFIER){
	                            if(varTypes.contains(getText()) && !(isVar==1)){
	                                isVar=1;
	                                node=new SymbolTableNode();
	                                node.type=getText();
	                            }
	                            else if(isVar==1){
	                                if(!checkScope(getText())){
	                                    node.name=getText();
	                                    node.scope=count;
	                                    node.isArray=0;
	                                    node.structure="IDENTIFIER";
	                                    symbolTable.insert(node);
	                                }
	                                else{
	                                    SymbolTableNode n=checkScopeNode(getText());
	                                    if(n.structure.equals("keyword") || n.structure.equals("preloaded")){
	                                        errors.write(getText()+" is a "+n.structure+ " at line"+getLine()+"\n");
	                                    }else{
	                                        errors.write(getText()+" has already been defined at line"+getLine()+"\n");
	                                    }
	                                }
	                                isVar=0;
	                            }
	                            else if(isClass==1){
	                                if(!checkScope(getText())){
	                                    node.name=getText();
	                                    node.scope=count;
	                                    node.isArray=0;
	                                    node.structure="CLASS";
	                                    symbolTable.insert(node);
	                                    varTypes.add(getText());
	                                }else{
	                                    SymbolTableNode n=checkScopeNode(getText());
	                                    if(n.structure.equals("keyword") || n.structure.equals("preloaded")){
	                                        errors.write(getText()+" is a"+n.structure+" at line "+getLine()+"\n");
	                                    }else{
	                                        errors.write(getText()+" has already been defined at line"+getLine()+"\n");
	                                    }
	                                }
	                                isClass=0;
	                            }else if(isProgram==1){
	                                node.name=getText();
	                                node.scope=count;
	                                node.isArray=0;
	                                node.structure="TOK_PROGRAM";
	                                symbolTable.insert(node);
	                                isProgram=0;
	                            }
	                         //else if(checkScope(getText())){
	                            //if(isAssign==1){
	                            else{
	                                try{
	                                    if((checkScopeNode(getText()).isFinal==1)){
	                                        errors.write(getText()+" is final "+getLine()+"\n");
	                                    }
	                                    else {
	                                        currType=checkScopeNode(getText()).type;
	                                    }
	                                }catch(NullPointerException e){
	                                    errors.write(getText()+" is not defined "+getLine()+"\n");
	                                }
	                            }
	                         //}
	                   }

	                //check if class:
	                 else if(next.getType()==TOK_CLASS){
	                    isClass=1;
	                    node=new SymbolTableNode();
	                    node.type="class";
	                 }



	          return next;
	             }


	        StringBuilder builder = new StringBuilder();

	        while(next.getType() == Unknown) {
	          next = super.nextToken();
	        }


	    queue.offer(next);

	    return new CommonToken(Unknown, builder.toString());
	}
	public Boolean checkScope(String name){
	                  SymbolTableNode n=null;
	                  if(name.equals("int") ||name.equals("char") || name.equals("null") ||name.equals("chr") ||name.equals("ord")||name.equals("len")||name.equals("program")||name.equals("class")
	                        ||name.equals("if") ||name.equals("else")||name.equals("while")||name.equals("read")||name.equals("print")||name.equals("return")||name.equals("void")||name.equals("final")||name.equals("new")){
	                      return true;
	                  }

	                  for(int i=0; i<tracker.size(); i++) {
	                    // for(Integer temp: set) {
	                        n = (SymbolTableNode) symbolTable.get(tracker.get(i), name);

	                  //   }
	                  try {
	                     if (n != null)
	                        return true;
	                  }catch(NullPointerException e){
	                        return false;
	                     }
	                  }
	                  return false;

	            }
	            public SymbolTableNode checkScopeNode(String name){
	                                             SymbolTableNode n=null;
	                                             for(int i=0; i<tracker.size(); i++) {
	                                               // for(Integer temp: set) {
	                                                   n = (SymbolTableNode) symbolTable.get(tracker.get(i), name);
	                                          try {
	                                             if (n != null)
	                                                return n;
	                                          }catch(NullPointerException e){
	                                          }
	                                       }
	                                             return n;

	                                       }

	public void printSymbolTable(){
	               Set<Integer> keys=symbolTable.SymbolHashTable().keySet();
	                   int line=0;
	                   for(Integer i: keys){
	                       SymbolTableNode n = (SymbolTableNode) symbolTable.SymbolHashTable().get(i);
	                       while(n != null){
	                           if(n.isArray!=1){
	                          symbols.write(line+": "+n.name+", "+n.structure+", scope: "+n.scope+", type: "+n.type+"\n");
	                          }else{
	                              symbols.write(line+": "+n.name+", "+n.structure+", scope: "+n.scope+", type: "+n.type+"[]"+"\n");
	                          }
	                           n=n.child;
	                           line++;
	                       }
	                   }
	            }


	public grLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "phase3+/gr.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public String[] getChannelNames() { return channelNames; }

	@Override
	public String[] getModeNames() { return modeNames; }

	@Override
	public ATN getATN() { return _ATN; }

	@Override
	public void action(RuleContext _localctx, int ruleIndex, int actionIndex) {
		switch (ruleIndex) {
		case 0:
			WhiteSpace_action((RuleContext)_localctx, actionIndex);
			break;
		case 1:
			Comments_action((RuleContext)_localctx, actionIndex);
			break;
		case 3:
			TOK_INTLIT_action((RuleContext)_localctx, actionIndex);
			break;
		}
	}
	private void WhiteSpace_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 0:
			skip();
			break;
		}
	}
	private void Comments_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 1:
			skip();
			break;
		}
	}
	private void TOK_INTLIT_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 2:

			long y= Long.parseLong(getText());
			if(y>2147483647){
			//lexicalError=true;
			}


			break;
		}
	}

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2.\u011b\b\1\4\2\t"+
		"\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t+\4"+
		",\t,\4-\t-\4.\t.\4/\t/\3\2\3\2\3\2\3\3\3\3\3\3\3\3\7\3g\n\3\f\3\16\3j"+
		"\13\3\3\3\3\3\3\3\3\4\3\4\3\5\6\5r\n\5\r\5\16\5s\3\5\3\5\3\6\3\6\3\6\3"+
		"\6\3\6\3\6\3\7\3\7\3\7\3\7\3\7\3\7\3\b\3\b\3\b\3\b\3\b\3\t\3\t\3\t\3\n"+
		"\3\n\3\n\3\n\3\13\3\13\3\13\3\13\3\13\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\r"+
		"\3\r\3\r\3\r\3\r\3\16\3\16\3\16\3\16\3\16\3\16\3\17\3\17\3\17\3\17\3\17"+
		"\3\17\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\21\3\21\3\22\3\22\3\23"+
		"\3\23\3\24\3\24\3\25\3\25\3\26\3\26\3\27\3\27\3\30\3\30\3\31\3\31\3\32"+
		"\3\32\3\32\3\32\3\32\3\32\5\32\u00cd\n\32\3\33\3\33\5\33\u00d1\n\33\3"+
		"\34\3\34\3\34\5\34\u00d6\n\34\3\35\3\35\3\35\3\36\3\36\3\36\3\37\3\37"+
		"\3 \3 \3 \3!\3!\3\"\3\"\3\"\3#\3#\3$\3$\3%\3%\3&\3&\3\'\3\'\3(\3(\3)\3"+
		")\3)\3)\3)\5)\u00f9\n)\3*\3*\3*\7*\u00fe\n*\f*\16*\u0101\13*\3+\3+\5+"+
		"\u0105\n+\3+\3+\3,\3,\3,\3,\3,\3,\3,\3,\3,\5,\u0112\n,\3,\3,\3-\3-\3."+
		"\3.\3/\3/\3h\2\60\3\3\5\4\7\5\t\6\13\7\r\b\17\t\21\n\23\13\25\f\27\r\31"+
		"\16\33\17\35\20\37\21!\22#\23%\24\'\25)\26+\27-\30/\31\61\32\63\33\65"+
		"\34\67\359\36;\37= ?!A\"C#E$G%I&K\'M(O)Q*S+U,W-Y.[\2]\2\3\2\7\5\2\13\f"+
		"\17\17\"\"\6\2##%&BB``\3\2))\4\2C\\c|\3\2\62;\2\u012a\2\3\3\2\2\2\2\5"+
		"\3\2\2\2\2\7\3\2\2\2\2\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2\2\2\2\17\3\2\2\2"+
		"\2\21\3\2\2\2\2\23\3\2\2\2\2\25\3\2\2\2\2\27\3\2\2\2\2\31\3\2\2\2\2\33"+
		"\3\2\2\2\2\35\3\2\2\2\2\37\3\2\2\2\2!\3\2\2\2\2#\3\2\2\2\2%\3\2\2\2\2"+
		"\'\3\2\2\2\2)\3\2\2\2\2+\3\2\2\2\2-\3\2\2\2\2/\3\2\2\2\2\61\3\2\2\2\2"+
		"\63\3\2\2\2\2\65\3\2\2\2\2\67\3\2\2\2\29\3\2\2\2\2;\3\2\2\2\2=\3\2\2\2"+
		"\2?\3\2\2\2\2A\3\2\2\2\2C\3\2\2\2\2E\3\2\2\2\2G\3\2\2\2\2I\3\2\2\2\2K"+
		"\3\2\2\2\2M\3\2\2\2\2O\3\2\2\2\2Q\3\2\2\2\2S\3\2\2\2\2U\3\2\2\2\2W\3\2"+
		"\2\2\2Y\3\2\2\2\3_\3\2\2\2\5b\3\2\2\2\7n\3\2\2\2\tq\3\2\2\2\13w\3\2\2"+
		"\2\r}\3\2\2\2\17\u0083\3\2\2\2\21\u0088\3\2\2\2\23\u008b\3\2\2\2\25\u008f"+
		"\3\2\2\2\27\u0094\3\2\2\2\31\u009b\3\2\2\2\33\u00a0\3\2\2\2\35\u00a6\3"+
		"\2\2\2\37\u00ac\3\2\2\2!\u00b4\3\2\2\2#\u00b6\3\2\2\2%\u00b8\3\2\2\2\'"+
		"\u00ba\3\2\2\2)\u00bc\3\2\2\2+\u00be\3\2\2\2-\u00c0\3\2\2\2/\u00c2\3\2"+
		"\2\2\61\u00c4\3\2\2\2\63\u00cc\3\2\2\2\65\u00d0\3\2\2\2\67\u00d5\3\2\2"+
		"\29\u00d7\3\2\2\2;\u00da\3\2\2\2=\u00dd\3\2\2\2?\u00df\3\2\2\2A\u00e2"+
		"\3\2\2\2C\u00e4\3\2\2\2E\u00e7\3\2\2\2G\u00e9\3\2\2\2I\u00eb\3\2\2\2K"+
		"\u00ed\3\2\2\2M\u00ef\3\2\2\2O\u00f1\3\2\2\2Q\u00f8\3\2\2\2S\u00fa\3\2"+
		"\2\2U\u0102\3\2\2\2W\u0108\3\2\2\2Y\u0115\3\2\2\2[\u0117\3\2\2\2]\u0119"+
		"\3\2\2\2_`\t\2\2\2`a\b\2\2\2a\4\3\2\2\2bc\7\61\2\2cd\7\61\2\2dh\3\2\2"+
		"\2eg\13\2\2\2fe\3\2\2\2gj\3\2\2\2hi\3\2\2\2hf\3\2\2\2ik\3\2\2\2jh\3\2"+
		"\2\2kl\7\f\2\2lm\b\3\3\2m\6\3\2\2\2no\t\3\2\2o\b\3\2\2\2pr\5]/\2qp\3\2"+
		"\2\2rs\3\2\2\2sq\3\2\2\2st\3\2\2\2tu\3\2\2\2uv\b\5\4\2v\n\3\2\2\2wx\7"+
		"e\2\2xy\7n\2\2yz\7c\2\2z{\7u\2\2{|\7u\2\2|\f\3\2\2\2}~\7h\2\2~\177\7k"+
		"\2\2\177\u0080\7p\2\2\u0080\u0081\7c\2\2\u0081\u0082\7n\2\2\u0082\16\3"+
		"\2\2\2\u0083\u0084\7g\2\2\u0084\u0085\7n\2\2\u0085\u0086\7u\2\2\u0086"+
		"\u0087\7g\2\2\u0087\20\3\2\2\2\u0088\u0089\7k\2\2\u0089\u008a\7h\2\2\u008a"+
		"\22\3\2\2\2\u008b\u008c\7p\2\2\u008c\u008d\7g\2\2\u008d\u008e\7y\2\2\u008e"+
		"\24\3\2\2\2\u008f\u0090\7t\2\2\u0090\u0091\7g\2\2\u0091\u0092\7c\2\2\u0092"+
		"\u0093\7f\2\2\u0093\26\3\2\2\2\u0094\u0095\7t\2\2\u0095\u0096\7g\2\2\u0096"+
		"\u0097\7v\2\2\u0097\u0098\7w\2\2\u0098\u0099\7t\2\2\u0099\u009a\7p\2\2"+
		"\u009a\30\3\2\2\2\u009b\u009c\7x\2\2\u009c\u009d\7q\2\2\u009d\u009e\7"+
		"k\2\2\u009e\u009f\7f\2\2\u009f\32\3\2\2\2\u00a0\u00a1\7y\2\2\u00a1\u00a2"+
		"\7j\2\2\u00a2\u00a3\7k\2\2\u00a3\u00a4\7n\2\2\u00a4\u00a5\7g\2\2\u00a5"+
		"\34\3\2\2\2\u00a6\u00a7\7r\2\2\u00a7\u00a8\7t\2\2\u00a8\u00a9\7k\2\2\u00a9"+
		"\u00aa\7p\2\2\u00aa\u00ab\7v\2\2\u00ab\36\3\2\2\2\u00ac\u00ad\7r\2\2\u00ad"+
		"\u00ae\7t\2\2\u00ae\u00af\7q\2\2\u00af\u00b0\7i\2\2\u00b0\u00b1\7t\2\2"+
		"\u00b1\u00b2\7c\2\2\u00b2\u00b3\7o\2\2\u00b3 \3\2\2\2\u00b4\u00b5\7.\2"+
		"\2\u00b5\"\3\2\2\2\u00b6\u00b7\7=\2\2\u00b7$\3\2\2\2\u00b8\u00b9\7\60"+
		"\2\2\u00b9&\3\2\2\2\u00ba\u00bb\7]\2\2\u00bb(\3\2\2\2\u00bc\u00bd\7_\2"+
		"\2\u00bd*\3\2\2\2\u00be\u00bf\7}\2\2\u00bf,\3\2\2\2\u00c0\u00c1\7\177"+
		"\2\2\u00c1.\3\2\2\2\u00c2\u00c3\7*\2\2\u00c3\60\3\2\2\2\u00c4\u00c5\7"+
		"+\2\2\u00c5\62\3\2\2\2\u00c6\u00cd\59\35\2\u00c7\u00cd\5;\36\2\u00c8\u00cd"+
		"\5=\37\2\u00c9\u00cd\5? \2\u00ca\u00cd\5A!\2\u00cb\u00cd\5C\"\2\u00cc"+
		"\u00c6\3\2\2\2\u00cc\u00c7\3\2\2\2\u00cc\u00c8\3\2\2\2\u00cc\u00c9\3\2"+
		"\2\2\u00cc\u00ca\3\2\2\2\u00cc\u00cb\3\2\2\2\u00cd\64\3\2\2\2\u00ce\u00d1"+
		"\5G$\2\u00cf\u00d1\5I%\2\u00d0\u00ce\3\2\2\2\u00d0\u00cf\3\2\2\2\u00d1"+
		"\66\3\2\2\2\u00d2\u00d6\5K&\2\u00d3\u00d6\5M\'\2\u00d4\u00d6\5O(\2\u00d5"+
		"\u00d2\3\2\2\2\u00d5\u00d3\3\2\2\2\u00d5\u00d4\3\2\2\2\u00d68\3\2\2\2"+
		"\u00d7\u00d8\7?\2\2\u00d8\u00d9\7?\2\2\u00d9:\3\2\2\2\u00da\u00db\7#\2"+
		"\2\u00db\u00dc\7?\2\2\u00dc<\3\2\2\2\u00dd\u00de\7>\2\2\u00de>\3\2\2\2"+
		"\u00df\u00e0\7>\2\2\u00e0\u00e1\7?\2\2\u00e1@\3\2\2\2\u00e2\u00e3\7@\2"+
		"\2\u00e3B\3\2\2\2\u00e4\u00e5\7>\2\2\u00e5\u00e6\7?\2\2\u00e6D\3\2\2\2"+
		"\u00e7\u00e8\7?\2\2\u00e8F\3\2\2\2\u00e9\u00ea\7-\2\2\u00eaH\3\2\2\2\u00eb"+
		"\u00ec\7/\2\2\u00ecJ\3\2\2\2\u00ed\u00ee\7,\2\2\u00eeL\3\2\2\2\u00ef\u00f0"+
		"\7\61\2\2\u00f0N\3\2\2\2\u00f1\u00f2\7\'\2\2\u00f2P\3\2\2\2\u00f3\u00f4"+
		"\7a\2\2\u00f4\u00f9\5S*\2\u00f5\u00f6\5]/\2\u00f6\u00f7\5S*\2\u00f7\u00f9"+
		"\3\2\2\2\u00f8\u00f3\3\2\2\2\u00f8\u00f5\3\2\2\2\u00f9R\3\2\2\2\u00fa"+
		"\u00ff\5[.\2\u00fb\u00fe\5[.\2\u00fc\u00fe\5]/\2\u00fd\u00fb\3\2\2\2\u00fd"+
		"\u00fc\3\2\2\2\u00fe\u0101\3\2\2\2\u00ff\u00fd\3\2\2\2\u00ff\u0100\3\2"+
		"\2\2\u0100T\3\2\2\2\u0101\u00ff\3\2\2\2\u0102\u0104\7)\2\2\u0103\u0105"+
		"\5W,\2\u0104\u0103\3\2\2\2\u0104\u0105\3\2\2\2\u0105\u0106\3\2\2\2\u0106"+
		"\u0107\n\4\2\2\u0107V\3\2\2\2\u0108\u0111\7)\2\2\u0109\u0112\5[.\2\u010a"+
		"\u0112\5]/\2\u010b\u010c\7^\2\2\u010c\u0112\7p\2\2\u010d\u010e\7^\2\2"+
		"\u010e\u0112\7t\2\2\u010f\u0110\7^\2\2\u0110\u0112\7v\2\2\u0111\u0109"+
		"\3\2\2\2\u0111\u010a\3\2\2\2\u0111\u010b\3\2\2\2\u0111\u010d\3\2\2\2\u0111"+
		"\u010f\3\2\2\2\u0112\u0113\3\2\2\2\u0113\u0114\7)\2\2\u0114X\3\2\2\2\u0115"+
		"\u0116\13\2\2\2\u0116Z\3\2\2\2\u0117\u0118\t\5\2\2\u0118\\\3\2\2\2\u0119"+
		"\u011a\t\6\2\2\u011a^\3\2\2\2\r\2hs\u00cc\u00d0\u00d5\u00f8\u00fd\u00ff"+
		"\u0104\u0111\5\3\2\2\3\3\3\3\5\4";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}