// Generated from C:/Users/User/IdeaProjects/anotherproject/src\gr.g4 by ANTLR 4.7

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Stack;


import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link grParser}.
 */
public interface grListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link grParser#program}.
	 * @param ctx the parse tree
	 */
	void enterProgram(grParser.ProgramContext ctx);
	/**
	 * Exit a parse tree produced by {@link grParser#program}.
	 * @param ctx the parse tree
	 */
	void exitProgram(grParser.ProgramContext ctx);
	/**
	 * Enter a parse tree produced by {@link grParser#prog}.
	 * @param ctx the parse tree
	 */
	void enterProg(grParser.ProgContext ctx);
	/**
	 * Exit a parse tree produced by {@link grParser#prog}.
	 * @param ctx the parse tree
	 */
	void exitProg(grParser.ProgContext ctx);
	/**
	 * Enter a parse tree produced by {@link grParser#constDecl}.
	 * @param ctx the parse tree
	 */
	void enterConstDecl(grParser.ConstDeclContext ctx);
	/**
	 * Exit a parse tree produced by {@link grParser#constDecl}.
	 * @param ctx the parse tree
	 */
	void exitConstDecl(grParser.ConstDeclContext ctx);
	/**
	 * Enter a parse tree produced by {@link grParser#varDecl}.
	 * @param ctx the parse tree
	 */
	void enterVarDecl(grParser.VarDeclContext ctx);
	/**
	 * Exit a parse tree produced by {@link grParser#varDecl}.
	 * @param ctx the parse tree
	 */
	void exitVarDecl(grParser.VarDeclContext ctx);
	/**
	 * Enter a parse tree produced by {@link grParser#classDecl}.
	 * @param ctx the parse tree
	 */
	void enterClassDecl(grParser.ClassDeclContext ctx);
	/**
	 * Exit a parse tree produced by {@link grParser#classDecl}.
	 * @param ctx the parse tree
	 */
	void exitClassDecl(grParser.ClassDeclContext ctx);
	/**
	 * Enter a parse tree produced by {@link grParser#methodDecl}.
	 * @param ctx the parse tree
	 */
	void enterMethodDecl(grParser.MethodDeclContext ctx);
	/**
	 * Exit a parse tree produced by {@link grParser#methodDecl}.
	 * @param ctx the parse tree
	 */
	void exitMethodDecl(grParser.MethodDeclContext ctx);
	/**
	 * Enter a parse tree produced by {@link grParser#formPars}.
	 * @param ctx the parse tree
	 */
	void enterFormPars(grParser.FormParsContext ctx);
	/**
	 * Exit a parse tree produced by {@link grParser#formPars}.
	 * @param ctx the parse tree
	 */
	void exitFormPars(grParser.FormParsContext ctx);
	/**
	 * Enter a parse tree produced by {@link grParser#block}.
	 * @param ctx the parse tree
	 */
	void enterBlock(grParser.BlockContext ctx);
	/**
	 * Exit a parse tree produced by {@link grParser#block}.
	 * @param ctx the parse tree
	 */
	void exitBlock(grParser.BlockContext ctx);
	/**
	 * Enter a parse tree produced by {@link grParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterStatement(grParser.StatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link grParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitStatement(grParser.StatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link grParser#actPars}.
	 * @param ctx the parse tree
	 */
	void enterActPars(grParser.ActParsContext ctx);
	/**
	 * Exit a parse tree produced by {@link grParser#actPars}.
	 * @param ctx the parse tree
	 */
	void exitActPars(grParser.ActParsContext ctx);
	/**
	 * Enter a parse tree produced by {@link grParser#condition}.
	 * @param ctx the parse tree
	 */
	void enterCondition(grParser.ConditionContext ctx);
	/**
	 * Exit a parse tree produced by {@link grParser#condition}.
	 * @param ctx the parse tree
	 */
	void exitCondition(grParser.ConditionContext ctx);
	/**
	 * Enter a parse tree produced by {@link grParser#relop}.
	 * @param ctx the parse tree
	 */
	void enterRelop(grParser.RelopContext ctx);
	/**
	 * Exit a parse tree produced by {@link grParser#relop}.
	 * @param ctx the parse tree
	 */
	void exitRelop(grParser.RelopContext ctx);
	/**
	 * Enter a parse tree produced by {@link grParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterExpr(grParser.ExprContext ctx);
	/**
	 * Exit a parse tree produced by {@link grParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitExpr(grParser.ExprContext ctx);
	/**
	 * Enter a parse tree produced by {@link grParser#term}.
	 * @param ctx the parse tree
	 */
	void enterTerm(grParser.TermContext ctx);
	/**
	 * Exit a parse tree produced by {@link grParser#term}.
	 * @param ctx the parse tree
	 */
	void exitTerm(grParser.TermContext ctx);
	/**
	 * Enter a parse tree produced by {@link grParser#factor}.
	 * @param ctx the parse tree
	 */
	void enterFactor(grParser.FactorContext ctx);
	/**
	 * Exit a parse tree produced by {@link grParser#factor}.
	 * @param ctx the parse tree
	 */
	void exitFactor(grParser.FactorContext ctx);
	/**
	 * Enter a parse tree produced by {@link grParser#designator}.
	 * @param ctx the parse tree
	 */
	void enterDesignator(grParser.DesignatorContext ctx);
	/**
	 * Exit a parse tree produced by {@link grParser#designator}.
	 * @param ctx the parse tree
	 */
	void exitDesignator(grParser.DesignatorContext ctx);
	/**
	 * Enter a parse tree produced by {@link grParser#x}.
	 * @param ctx the parse tree
	 */
	void enterX(grParser.XContext ctx);
	/**
	 * Exit a parse tree produced by {@link grParser#x}.
	 * @param ctx the parse tree
	 */
	void exitX(grParser.XContext ctx);
	/**
	 * Enter a parse tree produced by {@link grParser#varType}.
	 * @param ctx the parse tree
	 */
	void enterVarType(grParser.VarTypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link grParser#varType}.
	 * @param ctx the parse tree
	 */
	void exitVarType(grParser.VarTypeContext ctx);
}