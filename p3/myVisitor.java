import com.sun.java_cup.internal.runtime.Symbol;
import com.sun.org.apache.xpath.internal.operations.Bool;
import org.antlr.v4.runtime.RuleContext;
import org.antlr.v4.runtime.tree.ParseTree;
import org.antlr.v4.runtime.tree.Tree;

import java.util.Arrays;

public class myVisitor extends grBaseVisitor<Void> {
    grLexer lexer;
    grParser parser;
    String type="";

    public void setLexer(grLexer lexer){
        this.lexer=lexer;
    }

    public void setParser(grParser parser) {
        this.parser=parser;
    }

    public String checkType(String x){
        try{
            Integer.parseInt(x);
            return "int";
        }catch(NumberFormatException e){
            return "char";
        }
    }

    @Override
    public Void visitProg(grParser.ProgContext ctx) {
        //ctx.getChild(0);
        System.out.println("hellooo");
        System.out.println(ctx.getText());
        System.out.println(ctx.getChild(0));
        return super.visitProg(ctx);
    }

    @Override
    public Void visitExpr(grParser.ExprContext ctx) {
        int i=0;
        /*for(ParseTree tree:ctx.children){
            System.out.println(i+" "+ctx.getChild(i).getText());
        }*/
        return super.visitExpr(ctx);
    }

    @Override
    public Void visitDesignator(grParser.DesignatorContext ctx) {
        int i=0;
        for(ParseTree tree: ctx.children){

            try{
                SymbolTableNode node=lexer.checkScopeNode(tree.getText());
                type=node.type;
            }catch(NullPointerException e){
                lexer.errors.write(tree.getText()+"is not defined\n");
            }
            i++;
        }

        return super.visitDesignator(ctx);
    }

/*
    @Override
//    public Void visitParsTemp(grParser.ParsTempContext ctx) {
//        int i=0;
//        Boolean book=lexer.checkScope("foo");
//        for(ParseTree tree: ctx.children){
//            if (i>0) break;
//            try {
//                //System.out.println(book);
//                //node.parameters.add(tree.getText());
//            }catch(NullPointerException e){
//                //lexer.printSymbolTable();
//                //System.out.println("empty: "+tree.getText());
//            }
//        }
//        return super.visitParsTemp(ctx);
//    }

//    @Override
//    public Void visitFormPars(grParser.FormParsContext ctx) {
//        String methodName=ctx.parent.getChild(1).toString();
//        SymbolTableNode node=lexer.checkScopeNode(methodName);
//        for(ParseTree tree: ctx.children){
//            //System.out.println("curr "+tree.getText());
//        }
//
//        return super.visitFormPars(ctx);
//    }
*/
//    @Override
    public Void visitMethodDecl(grParser.MethodDeclContext ctx) {
        System.out.println("l");

        for(int i=0; i<ctx.getChild(2).getChildCount(); i++){
            // System.out.println("parr "+ctx.getChild(2).getChild(0).getChild(i));
        }
        //SymbolTableNode node=lexer.checkScopeNode(methodName);
        //System.out.println("parr"+ ctx.getChild(3));
        return super.visitMethodDecl(ctx);
    }

//    @Override
//    public Void visitAssign_helper(grParser.Assign_helperContext ctx) {
//        System.out.println((ctx.parent.getChild(0).getText()));
//        return super.visitAssign_helper(ctx);
//    }

//    @Override
//    public Void visitReturnStatement(grParser.ReturnStatementContext ctx) {
//        String methodType=ctx.parent.parent.parent.getChild(0).toString();
//        String returntype=checkType(ctx.getChild(1).getText());
//        if(!methodType.equals(returntype)){
//            lexer.errors.write("Wrong return type"+ctx.start.getLine()+"\n");
//        }
//        return super.visitReturnStatement(ctx);
//    }

    //@Override
    public Void visitTerm(grParser.TermContext ctx) {
        int i=0;
        for(ParseTree tree:ctx.children){
            String temptype;
            temptype=checkType(tree.getText());
            if(type.equals("")){
                type=temptype;
            }
            if(!temptype.equals(type)){
                lexer.errors.write("Types are not equal"+ctx.start.getLine()+"\n");
            }else{
                type=temptype;
            }
            //System.out.println(i+" "+tree.getText());
            i++;
        }
        return super.visitTerm(ctx);
    }

    /*@Override
    public Void visitFactor(grParser.TermContext ctx){

    }*/

    @Override
    public Void visitFactor(grParser.FactorContext ctx) {
        //System.out.println(Arrays.toString(ctx.children.toArray()));
        //ctx.getChild(0)
        return super.visitFactor(ctx);

        //factor: designator (actPars)?
        //| TOK_INTLIT
        //| TOK_CHARLIT
        //| TOK_NEW x
        //| tok_lp expr tok_rp;
    }
}