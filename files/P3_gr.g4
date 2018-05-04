grammar P3_gr;

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
     public static Stack<Stack<ASTNode>> tempStack=new Stack<Stack<ASTNode>>(); //list of children of the current subroot
     Stack<ASTNode> nodeStack=new Stack<ASTNode>(); //all subtrees
     ASTNode Ptree=new ASTNode(); //The root of the program

      static Writer errors=new Writer("MicroJavaErrors.out");
      static Writer symbols=new Writer("MicroJavaST.out");
      static Writer ast=new Writer("MicroJavaAST.out");
      static SymbolHashTable classes=new SymbolHashTable();
      static ArrayList<String> varTypes=new ArrayList<String>();

     static int scope=0;
     static int count=0;
     static String methodParams="";
     static int isVar=0;
     static int isClass=0;
     static int isProgram=0;
     static int isArray=0;
     static int isAssign=0;
     static int isMethod=0;
     static int isField=0;
     static String methodPars="";
     static int isParams=0;
     public static SymbolHashTable symbolTable=new SymbolHashTable();

      static int toggle=0;
      private java.util.Queue<Token> queue = new java.util.LinkedList<Token>();


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
            } catch (NullPointerException e) {                       }
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

}
@parser:: members{
    static grLexer lexer;
    public void setLexer(grLexer lexer){
        this.lexer=lexer;
    }
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
        System.out.println("DONE createList");
    }
      //create a node of the passed info and append it to last list
    public static void addToLastList(String type, String name){
        try{
            tempStack.peek().push(new ASTNode(type,name));
        }catch(Exception e){
            System.out.println(e);
        }
        System.out.println("DONE addToLastList");
    }

    public static void addToLastList(int id, int pid, String type, String name){
        try{
            tempStack.peek().push(new ASTNode(id,pid,type,name));
        }catch(Exception e){
            System.out.println(e);
        }
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
            }
    }
    public static void tmethod(){
        ASTNode f= nodeStack.pop();
        f.print(1, lexer.ast);
        nodeStack.peek().add(f);
    }
}

@parser::header{
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Stack;
}

//Rules
program: {token=lexer.getText();     }      prog   { nodeStack.peek().printcaller(1, lexer.ast);  };
prog: TOK_PROGRAM       {createList();      token=lexer.getText();    }
        TOK_IDENTIFIER  {createSubtree(id++, pid, "program name: ",token);    token=lexer.getText();  pid++;}
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
            TOK_SEMI        {moveLastListToLastSubtree(); attachLastSubtreeToLastList();    token=lexer.getText();}  ;
//constDecl: TOK_FINAL varType TOK_IDENTIFIER TOK_OP_ASSIGN (TOK_INTLIT|TOK_CHARLIT) TOK_SEMI;

varDecl: varType       {readType=token;  createList(); addToLastList(id,pid,"TYPE",readType); }
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
            tok_rp              {if(hasParam){ moveLastListToLastSubtree(); attachLastSubtreeToLastList();
                                    moveLastListToLastSubtree();
                                    }
                                    token=lexer.getText();
                                    }
            (varDecl)*          {token=lexer.getText();}
            block*              {token=lexer.getText();  if(hasParam){} }        ;

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
| TOK_WHILE {/*createList(); addToLastList(id, pid,"WBILE",token); */}tok_lp condition tok_rp statement
| TOK_RETURN {/*createList(); addToLastList(id, pid,"RETURN",token); */} (expr)? TOK_SEMI
| TOK_READ {/*createList(); addToLastList(id, pid,"READ",token); */}  tok_lp designator tok_rp TOK_SEMI
| TOK_PRINT {/*createList(); addToLastList(id, pid,"PRINT",token); */} tok_lp expr (TOK_COMMA TOK_INTLIT)? tok_rp TOK_SEMI
|  block
| TOK_SEMI     {/*moveLastListToLastSubtree(); attachLastSubtreeToLastList();*/};
actPars: tok_lp (expr (TOK_COMMA expr)*)? tok_rp;
condition: expr relop expr;
relop: TOK_OP_REL;
expr: ('-')? term  (TOK_OP_ADD term)*;
term: factor (TOK_OP_TIMES factor)*;
factor: designator (actPars)?
| TOK_INTLIT {/*addToLastList(id, pid,"VALUE",token); */}
| TOK_CHARLIT  {/*addToLastList(id, pid,"VALUE",token); */}
| TOK_NEW    {/*addToLastList(id, pid,"NEW",token); */}  x {/*addToLastList(id, pid,"VALUE",token); */}
| tok_lp expr tok_rp;
designator: TOK_IDENTIFIER
            (TOK_DOT TOK_IDENTIFIER
            | tok_lb    {token=lexer.getText();}
            {
            try{
            if(token.equals("-")){lexer.errors.write("cannot declare array of size <=0. \n");}
            else{}
            }catch(Exception e){
                System.out.println(""+e);
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
invalidarray:tok_lb '\''  tok_rb;
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