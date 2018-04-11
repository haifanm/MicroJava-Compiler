// Generated from C:/Users/MSE/IdeaProjects/java/src\gr.g4 by ANTLR 4.7

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
		T__0=1, WhiteSpace=2, Comments=3, Unknown=4, TOK_INTLIT=5, TOK_CLASS=6, 
		TOK_FINAL=7, TOK_ELSE=8, TOK_IF=9, TOK_NEW=10, TOK_READ=11, TOK_RETURN=12, 
		TOK_VOID=13, TOK_WHILE=14, TOK_PRINT=15, TOK_PROGRAM=16, TOK_COMMA=17, 
		TOK_SEMI=18, TOK_DOT=19, TOK_LB=20, TOK_RB=21, TOK_LCB=22, TOK_RCB=23, 
		TOK_LP=24, TOK_RP=25, TOK_OP_REL=26, TOK_OP_ADD=27, TOK_OP_TIMES=28, TOK_EQ=29, 
		TOK_OP_NE=30, TOK_OP_LT=31, TOK_OP_LE=32, TOK_OP_GT=33, TOK_OP_GE=34, 
		TOK_OP_ASSIGN=35, OP_ADD_PLUS=36, OP_ADD_MINUS=37, OP_MUL_TIMES=38, OP_MUL_DIV=39, 
		OP_MUL_MOD=40, TOK_INVALID_IDENTIFIER=41, TOK_IDENTIFIER=42, TOK_INVALID_CHARLIT=43, 
		TOK_CHARLIT=44, UNRECOGNIZED_SYMBOL=45;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	public static final String[] ruleNames = {
		"T__0", "WhiteSpace", "Comments", "Unknown", "TOK_INTLIT", "TOK_CLASS", 
		"TOK_FINAL", "TOK_ELSE", "TOK_IF", "TOK_NEW", "TOK_READ", "TOK_RETURN", 
		"TOK_VOID", "TOK_WHILE", "TOK_PRINT", "TOK_PROGRAM", "TOK_COMMA", "TOK_SEMI", 
		"TOK_DOT", "TOK_LB", "TOK_RB", "TOK_LCB", "TOK_RCB", "TOK_LP", "TOK_RP", 
		"TOK_OP_REL", "TOK_OP_ADD", "TOK_OP_TIMES", "TOK_EQ", "TOK_OP_NE", "TOK_OP_LT", 
		"TOK_OP_LE", "TOK_OP_GT", "TOK_OP_GE", "TOK_OP_ASSIGN", "OP_ADD_PLUS", 
		"OP_ADD_MINUS", "OP_MUL_TIMES", "OP_MUL_DIV", "OP_MUL_MOD", "TOK_INVALID_IDENTIFIER", 
		"TOK_IDENTIFIER", "TOK_INVALID_CHARLIT", "TOK_CHARLIT", "UNRECOGNIZED_SYMBOL", 
		"LETTER", "DIGIT"
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


	boolean lexicalError=false;
	 public ArrayList<Integer> tracker=new ArrayList<Integer>(){{   add(0);}};;
	 Writer errors=new Writer("errors.txt");
	 Writer symbols=new Writer("Symbol Table");
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
	 		         static String methodParams="";
	 		         static int isParams=0;
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
	 		             Token curr=next;

	 		             if(next.getText().equals("int") ||next.getText().equals("char") || next.getText().equals("null") ||next.getText().equals("chr") ||next.getText().equals("ord")||next.getText().equals("len")||next.getText().equals("program")||next.getText().equals("class")
	 							 ||next.getText().equals("if") ||next.getText().equals("else")||next.getText().equals("while")||next.getText().equals("read")||next.getText().equals("print")||next.getText().equals("return")||next.getText().equals("void")||next.getText().equals("final")||next.getText().equals("new")){
	 		             	if(isVar==1 && isMethod==0){
	 							errors.write(next.getText()+" is reserved keyword.\n");
	 						}
	 					 }



	 					 if(getText().equals("\'") && isArray==1){
	 					    errors.write("Can only use number indeces in arrays at line "+getLine()+"\n");
	 					 }
	 		             if(next.getType()==TOK_PROGRAM){

	 							 try {
	 								 node = new SymbolTableNode();
	 								 node.type = "Program Name";
	 								 node.structure = "TOK_IDENTIFIER";
	 								 node.name = null;
	 								 node.scope = 0;
	 								 node.isFinal = 0;
	 								 isProgram = 1;
	 							 } catch (NullPointerException e) {
	 							 }

	 		             }
	 		             if(next.getType()==TOK_CLASS){

	 		             	try {
	 							node = new SymbolTableNode();

	 								node.type = getText();
	 								node.structure = "class";
	 								node.scope = scope;
	 								isClass=1;
	 								classes.insert(getText(), getText(), "class name", 0, scope, 0);
	 								isVar = 1;
	 							}catch(NullPointerException e){
	 							}

	 		             }
	 		             if(next.getType()==TOK_FINAL){
	 							 try {
	 								 node = new SymbolTableNode();
	 								 node.type = getText();
	 								 node.structure = "final";
	 								 node.scope = scope;
	 								 node.isFinal=1;
	 							 } catch (NullPointerException e) { 							 }
	 		             }
	 		             if (next.getType() == TOK_IDENTIFIER && (next.getText().equals("int") || next.getText().equals("char")||varTypes.contains(next.getText()))){
	 		             try{
	 		                node.type=getText();
	 		                node.isArray=isArray;
	 		                isVar=1;
	 		             }catch(NullPointerException e){
	 		               node=new SymbolTableNode();
	 		               node.type=getText();
	 		               isVar=1;
	 		               }

	 		             }
	 		             if(next.getType()==TOK_LP){
	 		                isParams=0;
	 		             }
	 		             if(next.getType()== TOK_IDENTIFIER  && !(next.getText().equals("int") || next.getText().equals("char") ||  next.getText().equals("program") ||  next.getText().equals("class") || next.getText().equals("final") )){
	                     if(isField==1){
	                          classes.insert(getText(), "field", "", 0, scope, 0);
	                     }
	                     if(isClass==1){
	                     varTypes.add(getText());
	                     isField=1;
	                     isClass=0;
	                     }else
	                     if(isMethod==1){
	                          node=new SymbolTableNode();
	                          node.name=getText();
	                          node.scope=0;
	                          node.isFinal=0;
	                          node.structure="method";
	                          node.type=methodParams;
	                         if (next.getType()== TOK_IDENTIFIER && !next.getText().equals("int") && !next.getText().equals("char")) {
	                            methodParams +=" "+getText();

	                         } else if (next.getType()== TOK_COMMA) {
	                            methodParams += " "+",";

	                         }
	                         node.type+=methodParams;
	                         methodParams="";
	                     }else

	 		             if(isVar==1){

	 		               try{
	 		               node.name=getText();
	 		               node.scope=scope;
	 		               node.structure="TOK_IDENTIFIER";
	 		               node.isArray=isArray;
	 		               if(isClass==0 && isProgram==0 && isArray==0){
	 		                   node.structure="variable";
	 		               }

	 		               isVar=0;
	 		               }catch(NullPointerException e){
	 		               }

	 		              }else
	 						 if(isProgram==1){
	 							 try{
	 								 node.name=getText();
	 								 node.scope=scope;
	 								 node.structure="TOK_IDENTIFIER";
	 								 isProgram=2;
	 							 }catch(NullPointerException e){
	 							 }
	 						 }else
	 						 if(isVar!=1 && isAssign==0){

	 						    if(!checkScope(getText())){
	 							    errors.write("variable " +getText()+" not defined in scope\n");
	 							}else if(checkScopeNode(getText()).isFinal==1){
	 							    errors.write("variable " +getText()+" is final. \n");
	 							}
	 						 }else
	 						 if(isAssign==1){
	 						  if(!checkScope(getText()))
	 							    errors.write("variable " +getText()+" not defined in scope \n");
	 						 }
	 		             }
	 		             if(node!=null && node.name!=null && !checkScope(node.name)){
		 		               symbolTable.insert(node.name, node.type, node.structure, node.isFinal, node.scope, node.isArray);
	 		               node=null;
	 		             }else {
	 		             	try{
	 		             	if(checkScope(node.name)&&isVar==1){
	 		             	if(!(getText().equals(",") || getText().equals(";") || getText().equals(".") || getText().equals("[") || getText().equals("]") || getText().equals("{") || getText().equals("}") || getText().equals("(") || getText().equals(")") || getText().equals("+") || getText().equals("-") || getText().equals("=")|| getText().equals("/") || getText().equals("&") || getText().equals("*") || varTypes.contains(getText()))){
	                            try{
	                            	 		             	   		int x=Integer.parseInt(getText());
	                            								   errors.write("variable already exists: " + getText()+"\n");
	                            							   }catch(NumberFormatException e){

	                            							   }
	     		            }

	 						}else if(node==null && node.name==null){
	 						}

	 					 }catch(NullPointerException e){

	 						 }
	 		             }
	 					   if(next.getType()==TOK_LCB){
	 					   if(isMethod==1){
	 					    isMethod=0;
	 					     isVar=0;
	 					   }
	 					  if(next.getType()==TOK_RCB){
	 					    isField=0;
	 					   }
	 		               	count++;
	 		               	tracker.add(count);
	 		               	scope=count;
	 		             }else
	 		             if(next.getType()==TOK_RCB){

	 						 tracker.remove(tracker.size()-1);
	 						 scope=tracker.get(tracker.size()-1);

	 		             }

	 		             return curr;
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
	 		            public void addTempStack(String type, String name){
	 		                  Stack<ASTNode> temp=new Stack<>();
	 		                  temp.push(new ASTNode(type, name));
	 		                  tempStack.push(temp);
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
	public String getGrammarFileName() { return "gr.g4"; }

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
		case 1:
			WhiteSpace_action((RuleContext)_localctx, actionIndex);
			break;
		case 2:
			Comments_action((RuleContext)_localctx, actionIndex);
			break;
		case 4:
			TOK_INTLIT_action((RuleContext)_localctx, actionIndex);
			break;
		case 40:
			TOK_INVALID_IDENTIFIER_action((RuleContext)_localctx, actionIndex);
			break;
		case 42:
			TOK_INVALID_CHARLIT_action((RuleContext)_localctx, actionIndex);
			break;
		case 44:
			UNRECOGNIZED_SYMBOL_action((RuleContext)_localctx, actionIndex);
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
			lexicalError=true;
			}


			break;
		}
	}
	private void TOK_INVALID_IDENTIFIER_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 3:
			lexicalError=true;
			break;
		}
	}
	private void TOK_INVALID_CHARLIT_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 4:
			lexicalError=true;
			break;
		}
	}
	private void UNRECOGNIZED_SYMBOL_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 5:
			lexicalError=true;
			break;
		}
	}

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2/\u0122\b\1\4\2\t"+
		"\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t+\4"+
		",\t,\4-\t-\4.\t.\4/\t/\4\60\t\60\3\2\3\2\3\3\3\3\3\3\3\4\3\4\3\4\3\4\7"+
		"\4k\n\4\f\4\16\4n\13\4\3\4\3\4\3\4\3\5\3\5\3\6\6\6v\n\6\r\6\16\6w\3\6"+
		"\3\6\3\7\3\7\3\7\3\7\3\7\3\7\3\b\3\b\3\b\3\b\3\b\3\b\3\t\3\t\3\t\3\t\3"+
		"\t\3\n\3\n\3\n\3\13\3\13\3\13\3\13\3\f\3\f\3\f\3\f\3\f\3\r\3\r\3\r\3\r"+
		"\3\r\3\r\3\r\3\16\3\16\3\16\3\16\3\16\3\17\3\17\3\17\3\17\3\17\3\17\3"+
		"\20\3\20\3\20\3\20\3\20\3\20\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3"+
		"\22\3\22\3\23\3\23\3\24\3\24\3\25\3\25\3\26\3\26\3\27\3\27\3\30\3\30\3"+
		"\31\3\31\3\32\3\32\3\33\3\33\3\33\3\33\3\33\3\33\5\33\u00d1\n\33\3\34"+
		"\3\34\5\34\u00d5\n\34\3\35\3\35\3\35\5\35\u00da\n\35\3\36\3\36\3\36\3"+
		"\37\3\37\3\37\3 \3 \3!\3!\3!\3\"\3\"\3#\3#\3#\3$\3$\3%\3%\3&\3&\3\'\3"+
		"\'\3(\3(\3)\3)\3*\3*\3*\3*\3*\3*\5*\u00fe\n*\3+\3+\3+\7+\u0103\n+\f+\16"+
		"+\u0106\13+\3,\3,\5,\u010a\n,\3,\3,\3,\3-\3-\3-\3-\3-\3-\3-\3-\3-\5-\u0118"+
		"\n-\3-\3-\3.\3.\3.\3/\3/\3\60\3\60\3l\2\61\3\3\5\4\7\5\t\6\13\7\r\b\17"+
		"\t\21\n\23\13\25\f\27\r\31\16\33\17\35\20\37\21!\22#\23%\24\'\25)\26+"+
		"\27-\30/\31\61\32\63\33\65\34\67\359\36;\37= ?!A\"C#E$G%I&K\'M(O)Q*S+"+
		"U,W-Y.[/]\2_\2\3\2\7\5\2\13\f\17\17\"\"\6\2##%&BB``\3\2))\4\2C\\c|\3\2"+
		"\62;\2\u0131\2\3\3\2\2\2\2\5\3\2\2\2\2\7\3\2\2\2\2\t\3\2\2\2\2\13\3\2"+
		"\2\2\2\r\3\2\2\2\2\17\3\2\2\2\2\21\3\2\2\2\2\23\3\2\2\2\2\25\3\2\2\2\2"+
		"\27\3\2\2\2\2\31\3\2\2\2\2\33\3\2\2\2\2\35\3\2\2\2\2\37\3\2\2\2\2!\3\2"+
		"\2\2\2#\3\2\2\2\2%\3\2\2\2\2\'\3\2\2\2\2)\3\2\2\2\2+\3\2\2\2\2-\3\2\2"+
		"\2\2/\3\2\2\2\2\61\3\2\2\2\2\63\3\2\2\2\2\65\3\2\2\2\2\67\3\2\2\2\29\3"+
		"\2\2\2\2;\3\2\2\2\2=\3\2\2\2\2?\3\2\2\2\2A\3\2\2\2\2C\3\2\2\2\2E\3\2\2"+
		"\2\2G\3\2\2\2\2I\3\2\2\2\2K\3\2\2\2\2M\3\2\2\2\2O\3\2\2\2\2Q\3\2\2\2\2"+
		"S\3\2\2\2\2U\3\2\2\2\2W\3\2\2\2\2Y\3\2\2\2\2[\3\2\2\2\3a\3\2\2\2\5c\3"+
		"\2\2\2\7f\3\2\2\2\tr\3\2\2\2\13u\3\2\2\2\r{\3\2\2\2\17\u0081\3\2\2\2\21"+
		"\u0087\3\2\2\2\23\u008c\3\2\2\2\25\u008f\3\2\2\2\27\u0093\3\2\2\2\31\u0098"+
		"\3\2\2\2\33\u009f\3\2\2\2\35\u00a4\3\2\2\2\37\u00aa\3\2\2\2!\u00b0\3\2"+
		"\2\2#\u00b8\3\2\2\2%\u00ba\3\2\2\2\'\u00bc\3\2\2\2)\u00be\3\2\2\2+\u00c0"+
		"\3\2\2\2-\u00c2\3\2\2\2/\u00c4\3\2\2\2\61\u00c6\3\2\2\2\63\u00c8\3\2\2"+
		"\2\65\u00d0\3\2\2\2\67\u00d4\3\2\2\29\u00d9\3\2\2\2;\u00db\3\2\2\2=\u00de"+
		"\3\2\2\2?\u00e1\3\2\2\2A\u00e3\3\2\2\2C\u00e6\3\2\2\2E\u00e8\3\2\2\2G"+
		"\u00eb\3\2\2\2I\u00ed\3\2\2\2K\u00ef\3\2\2\2M\u00f1\3\2\2\2O\u00f3\3\2"+
		"\2\2Q\u00f5\3\2\2\2S\u00fd\3\2\2\2U\u00ff\3\2\2\2W\u0107\3\2\2\2Y\u010e"+
		"\3\2\2\2[\u011b\3\2\2\2]\u011e\3\2\2\2_\u0120\3\2\2\2ab\7)\2\2b\4\3\2"+
		"\2\2cd\t\2\2\2de\b\3\2\2e\6\3\2\2\2fg\7\61\2\2gh\7\61\2\2hl\3\2\2\2ik"+
		"\13\2\2\2ji\3\2\2\2kn\3\2\2\2lm\3\2\2\2lj\3\2\2\2mo\3\2\2\2nl\3\2\2\2"+
		"op\7\f\2\2pq\b\4\3\2q\b\3\2\2\2rs\t\3\2\2s\n\3\2\2\2tv\5_\60\2ut\3\2\2"+
		"\2vw\3\2\2\2wu\3\2\2\2wx\3\2\2\2xy\3\2\2\2yz\b\6\4\2z\f\3\2\2\2{|\7e\2"+
		"\2|}\7n\2\2}~\7c\2\2~\177\7u\2\2\177\u0080\7u\2\2\u0080\16\3\2\2\2\u0081"+
		"\u0082\7h\2\2\u0082\u0083\7k\2\2\u0083\u0084\7p\2\2\u0084\u0085\7c\2\2"+
		"\u0085\u0086\7n\2\2\u0086\20\3\2\2\2\u0087\u0088\7g\2\2\u0088\u0089\7"+
		"n\2\2\u0089\u008a\7u\2\2\u008a\u008b\7g\2\2\u008b\22\3\2\2\2\u008c\u008d"+
		"\7k\2\2\u008d\u008e\7h\2\2\u008e\24\3\2\2\2\u008f\u0090\7p\2\2\u0090\u0091"+
		"\7g\2\2\u0091\u0092\7y\2\2\u0092\26\3\2\2\2\u0093\u0094\7t\2\2\u0094\u0095"+
		"\7g\2\2\u0095\u0096\7c\2\2\u0096\u0097\7f\2\2\u0097\30\3\2\2\2\u0098\u0099"+
		"\7t\2\2\u0099\u009a\7g\2\2\u009a\u009b\7v\2\2\u009b\u009c\7w\2\2\u009c"+
		"\u009d\7t\2\2\u009d\u009e\7p\2\2\u009e\32\3\2\2\2\u009f\u00a0\7x\2\2\u00a0"+
		"\u00a1\7q\2\2\u00a1\u00a2\7k\2\2\u00a2\u00a3\7f\2\2\u00a3\34\3\2\2\2\u00a4"+
		"\u00a5\7y\2\2\u00a5\u00a6\7j\2\2\u00a6\u00a7\7k\2\2\u00a7\u00a8\7n\2\2"+
		"\u00a8\u00a9\7g\2\2\u00a9\36\3\2\2\2\u00aa\u00ab\7r\2\2\u00ab\u00ac\7"+
		"t\2\2\u00ac\u00ad\7k\2\2\u00ad\u00ae\7p\2\2\u00ae\u00af\7v\2\2\u00af "+
		"\3\2\2\2\u00b0\u00b1\7r\2\2\u00b1\u00b2\7t\2\2\u00b2\u00b3\7q\2\2\u00b3"+
		"\u00b4\7i\2\2\u00b4\u00b5\7t\2\2\u00b5\u00b6\7c\2\2\u00b6\u00b7\7o\2\2"+
		"\u00b7\"\3\2\2\2\u00b8\u00b9\7.\2\2\u00b9$\3\2\2\2\u00ba\u00bb\7=\2\2"+
		"\u00bb&\3\2\2\2\u00bc\u00bd\7\60\2\2\u00bd(\3\2\2\2\u00be\u00bf\7]\2\2"+
		"\u00bf*\3\2\2\2\u00c0\u00c1\7_\2\2\u00c1,\3\2\2\2\u00c2\u00c3\7}\2\2\u00c3"+
		".\3\2\2\2\u00c4\u00c5\7\177\2\2\u00c5\60\3\2\2\2\u00c6\u00c7\7*\2\2\u00c7"+
		"\62\3\2\2\2\u00c8\u00c9\7+\2\2\u00c9\64\3\2\2\2\u00ca\u00d1\5;\36\2\u00cb"+
		"\u00d1\5=\37\2\u00cc\u00d1\5? \2\u00cd\u00d1\5A!\2\u00ce\u00d1\5C\"\2"+
		"\u00cf\u00d1\5E#\2\u00d0\u00ca\3\2\2\2\u00d0\u00cb\3\2\2\2\u00d0\u00cc"+
		"\3\2\2\2\u00d0\u00cd\3\2\2\2\u00d0\u00ce\3\2\2\2\u00d0\u00cf\3\2\2\2\u00d1"+
		"\66\3\2\2\2\u00d2\u00d5\5I%\2\u00d3\u00d5\5K&\2\u00d4\u00d2\3\2\2\2\u00d4"+
		"\u00d3\3\2\2\2\u00d58\3\2\2\2\u00d6\u00da\5M\'\2\u00d7\u00da\5O(\2\u00d8"+
		"\u00da\5Q)\2\u00d9\u00d6\3\2\2\2\u00d9\u00d7\3\2\2\2\u00d9\u00d8\3\2\2"+
		"\2\u00da:\3\2\2\2\u00db\u00dc\7?\2\2\u00dc\u00dd\7?\2\2\u00dd<\3\2\2\2"+
		"\u00de\u00df\7#\2\2\u00df\u00e0\7?\2\2\u00e0>\3\2\2\2\u00e1\u00e2\7>\2"+
		"\2\u00e2@\3\2\2\2\u00e3\u00e4\7>\2\2\u00e4\u00e5\7?\2\2\u00e5B\3\2\2\2"+
		"\u00e6\u00e7\7@\2\2\u00e7D\3\2\2\2\u00e8\u00e9\7>\2\2\u00e9\u00ea\7?\2"+
		"\2\u00eaF\3\2\2\2\u00eb\u00ec\7?\2\2\u00ecH\3\2\2\2\u00ed\u00ee\7-\2\2"+
		"\u00eeJ\3\2\2\2\u00ef\u00f0\7/\2\2\u00f0L\3\2\2\2\u00f1\u00f2\7,\2\2\u00f2"+
		"N\3\2\2\2\u00f3\u00f4\7\61\2\2\u00f4P\3\2\2\2\u00f5\u00f6\7\'\2\2\u00f6"+
		"R\3\2\2\2\u00f7\u00f8\7a\2\2\u00f8\u00fe\5U+\2\u00f9\u00fa\5_\60\2\u00fa"+
		"\u00fb\5U+\2\u00fb\u00fc\b*\5\2\u00fc\u00fe\3\2\2\2\u00fd\u00f7\3\2\2"+
		"\2\u00fd\u00f9\3\2\2\2\u00feT\3\2\2\2\u00ff\u0104\5]/\2\u0100\u0103\5"+
		"]/\2\u0101\u0103\5_\60\2\u0102\u0100\3\2\2\2\u0102\u0101\3\2\2\2\u0103"+
		"\u0106\3\2\2\2\u0104\u0102\3\2\2\2\u0104\u0105\3\2\2\2\u0105V\3\2\2\2"+
		"\u0106\u0104\3\2\2\2\u0107\u0109\7)\2\2\u0108\u010a\5Y-\2\u0109\u0108"+
		"\3\2\2\2\u0109\u010a\3\2\2\2\u010a\u010b\3\2\2\2\u010b\u010c\n\4\2\2\u010c"+
		"\u010d\b,\6\2\u010dX\3\2\2\2\u010e\u0117\7)\2\2\u010f\u0118\5]/\2\u0110"+
		"\u0118\5_\60\2\u0111\u0112\7^\2\2\u0112\u0118\7p\2\2\u0113\u0114\7^\2"+
		"\2\u0114\u0118\7t\2\2\u0115\u0116\7^\2\2\u0116\u0118\7v\2\2\u0117\u010f"+
		"\3\2\2\2\u0117\u0110\3\2\2\2\u0117\u0111\3\2\2\2\u0117\u0113\3\2\2\2\u0117"+
		"\u0115\3\2\2\2\u0118\u0119\3\2\2\2\u0119\u011a\7)\2\2\u011aZ\3\2\2\2\u011b"+
		"\u011c\13\2\2\2\u011c\u011d\b.\7\2\u011d\\\3\2\2\2\u011e\u011f\t\5\2\2"+
		"\u011f^\3\2\2\2\u0120\u0121\t\6\2\2\u0121`\3\2\2\2\r\2lw\u00d0\u00d4\u00d9"+
		"\u00fd\u0102\u0104\u0109\u0117\b\3\3\2\3\4\3\3\6\4\3*\5\3,\6\3.\7";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}