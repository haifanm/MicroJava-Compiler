grammar gr;

options{
    language=Java;
}

//The following code is so that any unknown characters result in printing of an error statement and continuing.
@lexer::header{
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Stack;
import java.util.Set;
}
@lexer::members{
boolean lexicalError=false;
 public ArrayList<Integer> tracker=new ArrayList<Integer>(){{   add(0);}};;
 		         //public static Stack<Stack<ASTNode>> tempStack=new Stack<Stack<ASTNode>>(); //list of children of the current subroot
 		         //Stack<ASTNode> nodeStack=new Stack<ASTNode>(); //all subtrees
 		         ASTNode Ptree=new ASTNode(); //The root of the program
 		         static int scope=0;
 		         static int count=0;
 		         static String methodParams="";
 		         static int isVar=0;
 		         static int isClass=0;
 		         static int isProgram=0;
 		         static int isArray=0;
 		         static int isAssign=0;
 		         static int isMethod=0;
 		         static String methodPars="k";
 		         private java.util.Queue<Token> queue = new java.util.LinkedList<Token>();
 		         public static SymbolHashTable symbolTable=new SymbolHashTable();

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
                      if(next.getType()==VariableType){
                        node=new SymbolTableNode();
                        node.type=getText();
                        toggle=1;
                      }
                      if(next.getType()==Identifier && toggle==1){
                        try{
                        node.name=getText();
                        node.scope=scope;
                        }catch(NullPointerException e){
                            System.out.println("ERROR "+getText());
                        }

                        toggle=0;
                      }
                      if(node!=null && !checkScope(node.name) && node.name!=null){
                        System.out.println("inserting "+ getText());
                        symbolTable.insert(node);
                        node=null;
                      }else{
                        if(node!=null && node.name!=null){
                        System.out.println("variable already exists: "+getText());
                        node=null;
                        }
                      }
                      if(next.getType()==CbOpen){
                        count++;
                        tracker.add(count);
                        scope=count;
                      }
                      if(next.getType()==CbClose){
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
                        if(symbolTable.get(name)==null){
                            return false;
                        }else{
                            return true;
                        }
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
                                System.out.println(line+": "+n.name+", "+n.structure+", scope: "+n.scope+", type: "+n.type);
                                n=n.child;
                            }
                        }

 				}
}
@parser:: members{
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
}

@parser::header{
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Stack;
}

//Rules
program: {token=lexer.getText();     }      prog   {System.out.println("------------"+token+"\n");  nodeStack.peek().printcaller(1);  System.out.println("\n------------"+token);};
prog: TOK_PROGRAM       {createList(); System.out.println("**"+token);     token=lexer.getText();     System.out.println("*** "+token);}
        TOK_IDENTIFIER  {createSubtree(id++, pid, "program name: ",token); System.out.println("****"+token);   /* printlastNodeStack();*/   token=lexer.getText();  pid++;}
            (constDecl
            | varDecl
            | classDecl         )*
        tok_lcb             {token=lexer.getText();}
            (methodDecl        {attachLastSubtreeToLastList();hasParam=false;} )+
        tok_rcb         { moveLastListToLastSubtree(); }    ;        /////


constDecl: TOK_FINAL    {createList(); addToLastList(id,pid,"FINAL ",token);     token=lexer.getText();}
            varType       {addToLastList(id,pid,"TYPE ",token);                 token=lexer.getText();}
            TOK_IDENTIFIER  {createSubtree(id,pid,"TOK_IDENTIFIER ",token);               token=lexer.getText();}
            TOK_OP_ASSIGN   {addToLastList(id,pid,"TOK_OP_ASSIGN ",token);               token=lexer.getText();}
            (TOK_INTLIT|TOK_CHARLIT)   {addToLastList(id,pid,"VALUE ",token);   token=lexer.getText();}
            TOK_SEMI        {System.out.println("~~~~~~~~"+token);  moveLastListToLastSubtree(); attachLastSubtreeToLastList();    token=lexer.getText();}  ;
//constDecl: TOK_FINAL varType TOK_IDENTIFIER TOK_OP_ASSIGN (TOK_INTLIT|TOK_CHARLIT) TOK_SEMI;

varDecl: varType       {readType=token; System.out.println("TYPE HERE GETTEXT"+ readType);   createList(); addToLastList(id,pid,"TYPE",readType); {System.out.print("bbbbbbb"+token);}token=lexer.getText();System.out.print("bbbbbbb"+token);}
        {}
        TOK_IDENTIFIER  {createSubtree(id,pid, "TOK_IDENTIFIER",token);  token=lexer.getText();}
        (
        TOK_COMMA       {moveLastListToLastSubtree(); attachLastSubtreeToLastList();    token=lexer.getText();}
        TOK_IDENTIFIER  {createList(); addToLastList(id,pid,"TOK_TYPE",readType); createSubtree(id,pid, "TOK_IDENTIFIER",token);    token=lexer.getText();}
        )*
        TOK_SEMI        {moveLastListToLastSubtree(); attachLastSubtreeToLastList();    token=lexer.getText();}  ;

classDecl: TOK_CLASS    {createList(); addToLastList(id,pid,"CLASS",token);    token=lexer.getText();}
            TOK_IDENTIFIER  {createSubtree(id,pid, "TOK_IDENTIFIER",token); token=lexer.getText();}
            tok_lcb         {token=lexer.getText();}
            (varDecl)*
            tok_rcb         {moveLastListToLastSubtree(); attachLastSubtreeToLastList();    token=lexer.getText();}  ;

methodDecl: (varType| TOK_VOID)     {createList();      addToLastList(id,pid,"TYPE",token);   token=lexer.getText();}
            TOK_IDENTIFIER          {createSubtree(id,pid, "TOK_IDENTIFIER ",token); token=lexer.getText(); moveLastListToLastSubtree();}
            tok_lp              {token=lexer.getText();}
            (formPars)?         {token=lexer.getText();}
            tok_rp              {if(hasParam){  System.out.println("00000000000000000");

                                    moveLastListToLastSubtree(); attachLastSubtreeToLastList();
                                    System.out.println("000000000000000000");
                                    moveLastListToLastSubtree();
                                    System.out.println("000000000000000000");
                                    }
                                    token=lexer.getText();
                                    }
            (varDecl)*          {token=lexer.getText();}
            block*              {token=lexer.getText(); System.out.println("*** "); nodeStack.peek().printcaller(1);if(hasParam){tmethod();}System.out.println("*** "); nodeStack.peek().print(1);}        ;

//formPars: varType{lexer.methodPars=lexer.getText();} TOK_IDENTIFIER (TOK_COMMA varType TOK_IDENTIFIER)*;
formPars: varType      {hasParam=true; createSubtree(id, pid, "PARAMS_ROOT", "Params");
                        createList(); createList(); addToLastList(id, pid,"TYPE",token);  token=lexer.getText();}
        TOK_IDENTIFIER  {createSubtree(id, pid,"TOK_IDENTIFIER",token); token=lexer.getText();}
        (TOK_COMMA      {moveLastListToLastSubtree(); attachLastSubtreeToLastList();    token=lexer.getText();}
        varType        {createList(); addToLastList(id, pid,"TYPE",token);  token=lexer.getText();}
        TOK_IDENTIFIER {createSubtree(id, pid,"TOK_IDENTIFIER",token);  token=lexer.getText();} )*;


block: tok_lcb (statement)* tok_rcb;

statement: designator (TOK_OP_ASSIGN expr|actPars) TOK_SEMI
| TOK_IF tok_lp  condition tok_rp (tok_lcb)? (statement)* (tok_rcb)? (TOK_ELSE (tok_lcb)? statement (tok_rcb)?)*
| TOK_WHILE tok_lp condition tok_rp statement
| TOK_RETURN (expr)? TOK_SEMI
| TOK_READ tok_lp designator tok_rp TOK_SEMI
| TOK_PRINT tok_lp expr (TOK_COMMA TOK_INTLIT)? tok_rp TOK_SEMI
|  block
| TOK_SEMI;
actPars: tok_lp (expr (TOK_COMMA expr)*)? tok_rp;
condition: expr relop expr;
relop: TOK_OP_REL;
expr: ('-')? term  (TOK_OP_ADD term)*;
term: factor (TOK_OP_TIMES factor)*;
factor: designator (actPars)?
| TOK_INTLIT
| TOK_CHARLIT
| TOK_NEW x
| tok_lp expr tok_rp;
designator: TOK_IDENTIFIER
            (TOK_DOT TOK_IDENTIFIER
            | tok_lb    {token=lexer.getText();}
            {
            try{
              System.out.println(token+".........");
            if(token.equals("-")){System.out.println("cLLLLLLLLLLL");}
            else{}
            }catch(Exception e){
                System.out.println("kkk"+e);
            }
            }
            expr tok_rb)*;

x:TOK_IDENTIFIER ((tok_lp expr tok_rp)?|(tok_lb (expr)? tok_rb)*);



tok_lcb:TOK_LCB;
tok_rcb: TOK_RCB;
tok_lp: TOK_LP;
tok_rp: TOK_RP;
semi: TOK_SEMI;
validarray:tok_lb expr tok_rb;
invalidarray:tok_lb '\'' {System.out.println("cannot define with character index");} tok_rb;
tok_lb: TOK_LB;
tok_rb:TOK_RB;
varType: (vartp)|
(varArray);
vartp:TOK_IDENTIFIER ;
varArray: TOK_IDENTIFIER (tok_lb tok_rb);

//////////////////////////
//MicroJava Tokens:
TOK_INTLIT : (DIGIT)+{
    long y= Long.parseLong(getText());
        if(y>2147483647){
        lexicalError=true;
    }
};
//SPACES
WhiteSpace: (' ' | '\n'| '\r'| '\t'){skip();};
Comments: '//'.*?'\n'{skip();};
Unknown: '!'|'@'|'#'|'$'|'^';
//Keywords
TOK_CLASS : 'class';
TOK_FINAL : 'final';
TOK_ELSE : 'else';
TOK_IF : 'if';
TOK_NEW : 'new';
TOK_READ : 'read';
TOK_RETURN : 'return';
TOK_VOID : 'void';
TOK_WHILE : 'while';
TOK_PRINT : 'print';
TOK_PROGRAM: 'program';
//MicroJava Delimiters
TOK_COMMA : ',';
TOK_SEMI : ';';
TOK_DOT : '.';
TOK_LB : '[';
TOK_RB : ']';
TOK_LCB : '{' ;
TOK_RCB : '}';
TOK_LP : '(';
TOK_RP : ')';
//MicroJava Operators
TOK_OP_REL : TOK_EQ
   | TOK_OP_NE
   | TOK_OP_LT
   | TOK_OP_LE
   | TOK_OP_GT
   | TOK_OP_GE;
TOK_OP_ADD : OP_ADD_PLUS
   | OP_ADD_MINUS ;
TOK_OP_TIMES : OP_MUL_TIMES //OPP_MUL_TIMES
| OP_MUL_DIV
| OP_MUL_MOD;
//OPERATOR TOKENS
TOK_EQ:'==';
TOK_OP_NE: '!=';
TOK_OP_LT: '<';
TOK_OP_LE: '<=';
TOK_OP_GT: '>';
TOK_OP_GE: '<=';
TOK_OP_ASSIGN : '=' ;// OP_ASSIGN
OP_ADD_PLUS: '+';
OP_ADD_MINUS: '-';
OP_MUL_TIMES:'*';
OP_MUL_DIV:'/';
OP_MUL_MOD:'%';
TOK_INVALID_IDENTIFIER: '_' TOK_IDENTIFIER
  | DIGIT TOK_IDENTIFIER {lexicalError=true;};
TOK_IDENTIFIER : LETTER (LETTER|DIGIT)*;
TOK_INVALID_CHARLIT: '\'' (TOK_CHARLIT)? ~('\''){lexicalError=true;};
TOK_CHARLIT: '\''(LETTER|DIGIT|'\\n'|'\\r'|'\\t')'\'';
UNRECOGNIZED_SYMBOL: . {lexicalError=true;};
//fragments
fragment LETTER: [a-zA-Z];
fragment DIGIT: [0-9];