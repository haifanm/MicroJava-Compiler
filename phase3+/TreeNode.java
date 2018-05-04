//may delete :
//    ArrayList<newAst> children;   [not have a list of nodes that represents children of each node]
//    getNode(key) as a consequence
//where is vardecl used
//in program (outer fields) && in class code
//tempsids.push?.add? stack
//when poping from tem stack ; use try()
//FIX: setParent(pid)
import java.util.*;

public class TreeNode{
    static int id;
    static int pid;
    static String value;
    static String type;
    static ArrayList<TreeNode> children;

    public TreeNode(int id, int pid, String value, String type){
        this.id = id;
        this.pid = pid;
        this.value = value;
        this.type= type;
    }

    public TreeNode(){
        this.id = 0;
        this.pid = 0;
        this.value = "";
        this.type= "";
    }
/*
    public void addchild(newAst child){
    }
    public void addchildren(ArrayList<newAst> children){
    }*/
}
/*
//-------------------------------------------
        ArrayList<TreeNode> treenodes = new ArrayList<TreeNode>();

        int countid=1;
        int progid=0;
        int classid=0;
        int methodid=0;
        int declareid=0;
        int constid=0;
        String vtype="";
        int declareparentid;
        String token="";
//also:
//if,else,<for>, <while> [OR STACK]
        Stack<TreeNode> temp =new Stack<TreeNode>();
        Stack<Integer> tempids = new Stack<Integer>();

public void updatetok(){
        token=lexer.getText();
        }
        TreeNode parent = new TreeNode();
        TreeNode thisnode = new TreeNode();

public TreeNode getNode(int key){
        for(TreeNode node : treenodes){
        if(node.id==key){
        return node;
        }
        }
        return new TreeNode(0,-1,"",""  );
        }

public void setParent(int pid){
        try(){
        int idlastintemp= tempids.pop();
        for(TreeNode n : treenodes){
        if(n.id == idlastintemp){
        n.pid= pid;
        }
        }
        /////////OR USE: treenodes[idlastintemp]
        }catch(Exception e){
        throw e;
        }

        }


//Rules
        program: TOK_PROGRAM { updatetok(); }
        TOK_IDENTIFIER {thisnode = newAst(countid++,progid, token, 'prog'); parent= getNode(progid); parent.addchild(thisnode); updatetok();}
        (constDecl
        | varDecl
        | classDecl         )*
        tok_lcb
        (methodDecl {methodid=countid;})*
        tok_rcb;




//final int v=7;
        constDecl: TOK_FINAL            { tempids.add(countid);     treenodes.add(new newAst(countid++, -1, 'final', 'final'));                 updatetok(); }
        varType             { tempids.add(countid);     treenodes.add(new newAst(countid++, -1, token, "");       vtype=token;    updatetok(); }
        TOK_IDENTIFIER      { constid = countid++;      treenodes.add(constid, 0, token, vtype );
        setParent(constid); setParent(constid);    updatetok();}
        TOK_OP_ASSIGN       { treenodes.add(countid++, constid, '=', '_assign');        updatetok();}
        (TOK_INTLIT|TOK_CHARLIT) {treenodes.add(countid++, constid, token, '_value');        updatetok();}
        TOK_SEMI;           { updatetok();} }

        classDecl: TOK_CLASS            { tempids.add(countid); treenodes.add(new newAst (countid++, -1,"class", "_type_class"));   updatetok(); }
        TOK_IDENTIFIER      { idclass = countid++;  treenodes.add(new newAst(idclass, progid, token, "class"));   setParent(idclass);   updatetok(); }
        tok_lcb
        (varDecl)*
        tok_rcb ;

        varDecl: varType                { declareid = count++; vtype=getText() }
        TOK_IDENTIFIER      { treenodes.add(new newAst (declareid, idclass,getText(), vtype)); }
        (TOK_COMMA          { declareid = count++; }
        TOK_IDENTIFIER {} )*
        TOK_SEMI;

        methodDecl: (varType| TOK_VOID)     {createList();      addToLastList(id,pid,"TYPE",token);   token=lexer.getText();}
        TOK_IDENTIFIER          {createSubtree(id,pid, "TOK_IDENTIFIER ",token); token=lexer.getText(); moveLastListToLastSubtree();}
        tok_lp                  {token=lexer.getText();}
        (formPars)?             {token=lexer.getText();}
        tok_rp                  {if(hasParam){
        moveLastListToLastSubtree(); attachLastSubtreeToLastList();
        moveLastListToLastSubtree();
        }
        token=lexer.getText();
        }
        (varDecl)*          {token=lexer.getText();}
        block*              {token=lexer.getText(); System.out.println("*** "); nodeStack.peek().printcaller(1);if(hasParam){tmethod();}System.out.println("*** "); nodeStack.peek().print(1);}        ;

*/