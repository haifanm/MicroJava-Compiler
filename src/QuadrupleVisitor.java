import org.antlr.v4.runtime.tree.ParseTree;

import com.sun.java_cup.internal.runtime.Symbol;
import com.sun.org.apache.xpath.internal.operations.Bool;
import org.antlr.v4.runtime.ParserRuleContext;
import org.antlr.v4.runtime.RuleContext;
import org.antlr.v4.runtime.tree.ParseTree;
import org.antlr.v4.runtime.tree.Tree;

import javax.naming.Context;
import java.util.Arrays;
import java.util.ArrayList;

import java.util.Set;

public class QuadrupleVisitor extends grmBaseVisitor<Void> {
    grmLexer lexer;
    grmParser parser;
    String _temp_count=(String.format("%04d", 0));
    String _lbl_count=(String.format("%04d", 0));
    int localCount=0;
    SymbolHashTable symbolTable;
    int tabs=0;
    ArrayList<String[]> namestemps= new ArrayList();

    String assitype="";
    int tcount=0;

    int rcount=0;
    QuadWriter quads=new QuadWriter();

    public void addtoal(String name, String tempnum){
        String bb[] =   {name,"_tmp_"+tempnum} ;
        namestemps.add(bb);
    }

    public void printal(){
        System.out.println("************");
        for(String a[] : namestemps){
            System.out.println(a[0]);
            System.out.println(a[1]);
        }
        System.out.println("***********");
    }

    public boolean isint(String x){
        try{
            Integer.parseInt(x);
            return true;
        }catch(NumberFormatException e){
            return false;
        }
    }

    public String gettempnum(String name){
        for(String a[] : namestemps){
            if(name.equals(a[0])){
                return a[1];
            }
        }
        return "null";
    }
    public boolean exists(String name){
        for(String a[] : namestemps){
            if(name.equals(a[0])){
                return true;
            }
        }
        return false;
    }
    public  void setLexer(grmLexer l){
        this.lexer=l;
    }

    public void setSymbolTable(SymbolHashTable symbolHashTable) {
        this.symbolTable = symbolHashTable;
    }
    public void incrementTemp(){
        int temp=Integer.parseInt(_temp_count);
        temp++;
        _temp_count=String.format("%04d", temp);


    }

    public void incrementLablel(){
        int temp=Integer.parseInt(_lbl_count);
        temp++;
        _lbl_count=String.format("%04d", temp);
    }

    public  void setParser(grmParser l){
        this.parser=l;
    }
    public SymbolTableNode checkNode(String name){
        SymbolTableNode n=null;
        // for(Integer temp: set) {
        try {
            n = (SymbolTableNode) symbolTable.get(name);
            if (n != null)
                return n;
        }catch(NullPointerException e){

        }

        return n;

    }

    @Override
    public Void visitMethodDecl(grmParser.MethodDeclContext ctx) {

        if(ctx.getChild(1).getText().equals("main")){
            quads.write("JUMP main\n");
        }else{
            //System.out.println(ctx.getChild(1).getText());
            SymbolTableNode n=null;
            Set<Integer> keys=symbolTable.SymbolHashTable().keySet();
            for(Integer i: keys){
                SymbolTableNode temp= (SymbolTableNode) symbolTable.SymbolHashTable().get(i);
                while(temp!=null){
                    if(temp.name.equals(ctx.getChild(1).getText())){
                        n=temp;
                        break;
                    }
                    if(temp.child!=null){
                        temp=temp.child;

                    }else if(temp.child==null){
                        break;
                    }
                }
            }
            quads.write("PROC " +n.parameters.size()+" " +n.name);
        }
        quads.write("LABEL "+ctx.getChild(1).getText()+"\n");
        quads.tabs++;
        return super.visitMethodDecl(ctx);
    }

    @Override
    public Void visitIfStatment(grmParser.IfStatmentContext ctx) {
//        String op=ctx.getChild(2).getChild(1).getText();
//        String op1=ctx.getChild(2).getChild(0).getText();
//        String op2=ctx.getChild(2).getChild(2).getText();
//        if(op.equals("==")){
//            // System.out.println("NEQI _temp_"+_temp_count +" "+op1+" "+op2);
//            int i=ctx.parent.parent.getChild(1).getChild(0).getChildCount();
//            while(!(ctx.parent.parent.getChild(1).getChild(0).getChild(i-1).getText().substring(0,5)).equals("else")){
//                i--;
//            }
//            if(i>=0){
//                System.out.println("ELSELABEL _lbl_"+_lbl_count);
//                quads.tabs++;
//            }
//            else if(i<0){
//                //there is no else statement
//            }
//            System.out.println();
//
//            incrementTemp();
//        }
        return super.visitIfStatment(ctx);
    }

//    @Override
//    public Void visitCondition(grmParser.ConditionContext ctx) {
//        String op1=ctx.getChild(0).getText();
//        String op2=ctx.getChild(2).getText();
//        String op=ctx.getChild(1).getText();
//        if(op.equals("==")){
//            quads.write("NEQI _temp_"+_temp_count+" "+op1+" "+op2);
//            System.out.println(ctx.parent.parent.parent.getChild(2).getText());
//            incrementTemp();
//        }
//        return super.visitCondition(ctx);
//    }

//    @Override
//    public Void visitRcb(grmParser.RcbContext ctx) {
//        return super.visitRcb(ctx);
//    }

    @Override
    public Void visitBlock(grmParser.BlockContext ctx) {
        if(localCount>0) {
            quads.write("LOCALS " + localCount+"\n");
            localCount = 0;
        }
        quads.tabs--;
        return super.visitBlock(ctx);
    }

    @Override
    public Void visitStatement(grmParser.StatementContext ctx) {
//        if(ctx.getChild(0).getText().equals("print")){
//            Quadruple load=new Quadruple("LDC", "_temp_"+_temp_count,  ctx.getChild(2).getText(), "");
//            Quadruple q=new Quadruple("print", "_temp_"+_temp_count,"","");
//            incrementTemp();
//            quads.write(load.toString());
//            quads.write(q.toString());
//        }
        return super.visitStatement(ctx);
    }

    @Override
    public Void visitPrintStatement(grmParser.PrintStatementContext ctx) {
        if(ctx.getChild(2).getChildCount()==1){
            System.out.println("fffffffffffffffff");
            if(isint(ctx.getChild(2).getChild(0).getText())){
                //////////
            }
        }
        return super.visitPrintStatement(ctx);
    }

    @Override
    public Void visitVarDecl(grmParser.VarDeclContext ctx) {
        localCount++;
        String temp=ctx.getText();
        while(temp.contains(",")){
            localCount++;
            temp=temp.substring(temp.indexOf(",")+1);

        }
        return super.visitVarDecl(ctx);
    }

    @Override
    public Void visitConstDecl(grmParser.ConstDeclContext ctx) {
        localCount++;
        return super.visitConstDecl(ctx);
    }

    public Void visitAssignment(grmParser.AssignmentContext ctx) {
//        ctx.
        if(ctx.getChild(0).getChildCount()==1) {
            String assignee = ctx.getChild(0).getText();
            //get type of assignee from the symbol table
            try {
                SymbolTableNode nod = lexer.checkScopeNode(assignee);
                if (nod.type.equals("int")) {
                    System.out.println("INTEGER");  //COPYI i1 i3
                    assitype = "int";
                } else if (nod.type.equals("char")) {
                    System.out.println("CHARACTER"); //COPYC c1 c3
                    assitype = "char";
                } else {
//                    System.out.println("uuuuuuuuuuuuuuuuuuuuuuuuu"+nod.type);
                    assitype="class";
                }
            } catch (NullPointerException e) {
                lexer.errors.write(ctx.parent.getChild(0).getChild(0).getText() + "is not defined on line " + ctx.start.getLine());
            }

            //if tpe is integer
            int assignednum = ctx.getChild(1).getChild(1).getChildCount();
            if (assignednum == 1) {
                if (ctx.getChild(1).getChild(1).getChild(0).getChildCount() == 1){
                    String assigned = ctx.getChild(1).getChild(1).getText();
                    if (assitype.equals("int")) {
                        if(isint(assigned)) {
                            System.out.println("\t\tli\t" + "_temp_" + _temp_count + "\t" + assigned + "\t");
                            addtoal(assignee,_temp_count);
                            Quadruple q = new Quadruple("lui", "_temp_" + _temp_count, assigned, "");
                            incrementTemp();
                            quads.write(q.toString());
                        }
                    } else if (assitype.equals("char")) {
                        System.out.println("\t\tCOPYC\t" + assigned + "\t" + assignee + "\t");
                        Quadruple q=new Quadruple("COPYC", assigned,  assignee, "");
                        incrementTemp();
                        quads.write(q.toString());
                    } else if (assitype.equals("")) {
                    } else if (assitype.equals("class")){
                        System.out.println("\t\tCOPYO\t" + assigned + "\t" + assignee + "\t");
                        Quadruple q=new Quadruple("COPYO", assigned,  assignee, "");
                        incrementTemp();
                        quads.write(q.toString());
                    }
                }
                else{
                    if (ctx.getChild(1).getChild(1).getChild(0).getChild(0).getChildCount() == 1){
                        String assigned1 = ctx.getChild(1).getChild(1).getChild(0).getChild(0).getText();
                        String op = ctx.getChild(1).getChild(1).getChild(0).getChild(1).getText();
                        String assigned2 = ctx.getChild(1).getChild(1).getChild(0).getChild(2).getText();
                        if(op.equals("*")){
                            System.out.println("\t\ttim\t"+ "_temp_"+_temp_count +"\t"+  "\t"+gettempnum(assigned1) +   "\t"+gettempnum(assigned2) );
                            Quadruple q1=new Quadruple("tim", "\t_temp_"+_temp_count,"\t"+gettempnum(assigned1),  "\t"+gettempnum(assigned2));
                            String result = _temp_count;
                            quads.write(q1.toString());
                            incrementTemp();
                            System.out.println("[[[[[[[["+assignee+"||||||||||||"+gettempnum(assignee));
                            if(exists(assignee)){
                                System.out.println("\t\tst\t" + gettempnum(assignee) + "\t_temp_" + result);
                                Quadruple q2=new Quadruple("st", gettempnum(assignee) ,"\t_temp_" + result,"");
                                quads.write(q2.toString());
                            }else{
                                addtoal(assignee,"_tem_"+_temp_count);
                                System.out.println("\t\tst\t" + "_tem_"+_temp_count + "\t_temp_" + result);
                                Quadruple q2=new Quadruple("st", "_temp_"+_temp_count ,"\t_temp_" + result,"");
                                quads.write(q2.toString());
                                incrementTemp();
                            }
                        }
                        else if(op.equals("/")){
                            System.out.println("\t\tdiv\t"+ "_temp_"+_temp_count +"\t"+  "\t"+gettempnum(assigned1) +   "\t"+gettempnum(assigned2) );
                            Quadruple q1=new Quadruple("div", "\t_temp_"+_temp_count,"\t"+gettempnum(assigned1),  "\t"+gettempnum(assigned2));
                            String result = _temp_count;
                            quads.write(q1.toString());
                            incrementTemp();
                            if(exists(assignee)){
                                System.out.println("\t\tst\t" + gettempnum(assignee) + "\t_temp_" + result);
                                Quadruple q2=new Quadruple("st", gettempnum(assignee) ,"\t_temp_" + result,"");
                                quads.write(q2.toString());
                            }else{
                                addtoal(assignee,"_tem_"+_temp_count);
                                System.out.println("\t\tst\t" + "_temp_"+_temp_count + "\t_temp_" + result);
                                Quadruple q2=new Quadruple("st", "_temp_"+_temp_count ,"\t_temp_" + result,"");
                                quads.write(q2.toString());
                                incrementTemp();
                            }
                        }
                        else if(op.equals("%")){
                            System.out.println("\t\tmod\t"+ "_temp_"+_temp_count +"\t"+  "\t"+gettempnum(assigned1) +   "\t"+gettempnum(assigned2) );
                            Quadruple q1=new Quadruple("mod", "\t_temp_"+_temp_count,"\t"+gettempnum(assigned1),  "\t"+gettempnum(assigned2));
                            String result = _temp_count;
                            quads.write(q1.toString());
                            incrementTemp();
                            if(exists(assignee)){
                                System.out.println("\t\tst\t" + gettempnum(assignee) + "\t_temp_" + result);
                                Quadruple q2=new Quadruple("st", gettempnum(assignee) ,"\t_temp_" + result,"");
                                quads.write(q2.toString());
                            }else{
                                addtoal(assignee,"_tem_"+_temp_count);
                                System.out.println("\t\tst\t" + "_temp_"+_temp_count + "\t_temp_" + result);
                                Quadruple q2=new Quadruple("st", "_temp_"+_temp_count ,"\t_temp_" + result,"");
                                quads.write(q2.toString());
                                incrementTemp();
                            }
                        }
                    }
                }
            } else if (assignednum == 3) {
                String assigned1 = ctx.getChild(1).getChild(1).getChild(0).getText();
                String tempassigned1= gettempnum(assigned1);
                String op = ctx.getChild(1).getChild(1).getChild(1).getText();
                String assigned2 = ctx.getChild(1).getChild(1).getChild(2).getText();
                String tempassigned2= gettempnum(assigned2);
                if (op.equals("+")) {
                    System.out.println("\t\tadd\t"+ "_temp_"+_temp_count +"\t"+  "\t"+gettempnum(assigned1) +   "\t"+gettempnum(assigned2) );
                    Quadruple q1=new Quadruple("add", "\t_temp_"+_temp_count,"\t"+gettempnum(assigned1),  "\t"+gettempnum(assigned2));
                    String result = _temp_count;
                    quads.write(q1.toString());
                    incrementTemp();
                    if(exists(assignee)){
                        System.out.println("\t\tst\t" + gettempnum(assignee) + "\t_temp_" + result);
                        Quadruple q2=new Quadruple("st", gettempnum(assignee) ,"\t_temp_" + result,"");
                        quads.write(q2.toString());
                    }else{
                        addtoal(assignee,"_tem_"+_temp_count);
                        System.out.println("\t\tst\t" + "_temp_"+_temp_count + "\t_temp_" + result);
                        Quadruple q2=new Quadruple("st", "_temp_"+_temp_count ,"\t_temp_" + result,"");
                        quads.write(q2.toString());
                        incrementTemp();
                    }
                } else if (op.equals("-")) {
                    System.out.println("\t\tsub\t"+ "_temp_"+_temp_count +"\t"+  "\t"+gettempnum(assigned1) +   "\t"+gettempnum(assigned2) );
                    Quadruple q1=new Quadruple("sub", "\t_temp_"+_temp_count,"\t"+gettempnum(assigned1),  "\t"+gettempnum(assigned2));
                    String result = _temp_count;
                    quads.write(q1.toString());
                    incrementTemp();
                    if(exists(assignee)){
                        System.out.println("\t\tst\t" + gettempnum(assignee) + "\t_temp_" + result);
                        Quadruple q2=new Quadruple("st", gettempnum(assignee) ,"\t_temp_" + result,"");
                        quads.write(q2.toString());
                    }else{
                        addtoal(assignee,"_tem_"+_temp_count);
                        System.out.println("\t\tst\t" + "_temp_"+_temp_count + "\t_temp_" + result);
                        Quadruple q2=new Quadruple("st", "_temp_"+_temp_count ,"\t_temp_" + result,"");
                        quads.write(q2.toString());
                        incrementTemp();
                    }


                }
                String assigned = ctx.getChild(1).getChild(1).getText();
            }
        }

        else{       //assigning to a (1)class field or (2)an array element      //ctx.getChild(0) is the left-hand-side
            if(ctx.getChild(0).getChild(1).getText().equals(".")){        //(1)class field
                String lhs= ctx.getChild(0).getText();
                String classname= ctx.getChild(0).getChild(0).getText();
                String fieldname= ctx.getChild(0).getChild(2).getText();
                String eqs= ctx.getChild(1).getChild(0).getText();

                try {
                    SymbolTableNode nod = lexer.checkScopeNode(fieldname);
                    if (nod.type.equals("int")) {
                        System.out.println("INTEGER");  //COPYI i1 i3
                        assitype = "int";
                    } else if (nod.type.equals("char")) {
                        System.out.println("CHARACTER"); //COPYC c1 c3
                        assitype = "char";
                    }
                } catch (NullPointerException e) {
                    lexer.errors.write(ctx.parent.getChild(0).getChild(0).getText() + "is not defined on line " + ctx.start.getLine());
                }

                if(ctx.getChild(1).getChild(1).getChildCount()==1){
                    String assinged = ctx.getChild(1).getChild(1).getChild(0).getText();
                    System.out.println("xxxxxxxxxxxxxxxxxx");
                    if(assitype.equals("int")){
                        System.out.println("\t\tCOPYI\t" + assinged + "\t" + ctx.getChild(0).getText());
                        addtoal(lhs,_temp_count);
                        incrementTemp();
//                        printal();
                    } else{
                        System.out.println("\t\tCOPYC\t" + assinged + "\t" + ctx.getChild(0).getText());
                    }
                }
            }

        }
        return super.visitAssignment(ctx);
    }

}