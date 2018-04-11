// Generated from C:/Users/MSE/IdeaProjects/MicroJavaParser/src\gr.g4 by ANTLR 4.7

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Stack;


import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link grParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface grVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link grParser#program}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitProgram(grParser.ProgramContext ctx);
	/**
	 * Visit a parse tree produced by {@link grParser#prog}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitProg(grParser.ProgContext ctx);
	/**
	 * Visit a parse tree produced by {@link grParser#varDecl}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVarDecl(grParser.VarDeclContext ctx);
	/**
	 * Visit a parse tree produced by {@link grParser#constDecl}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitConstDecl(grParser.ConstDeclContext ctx);
	/**
	 * Visit a parse tree produced by {@link grParser#classDecl}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitClassDecl(grParser.ClassDeclContext ctx);
	/**
	 * Visit a parse tree produced by {@link grParser#methodDecl}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMethodDecl(grParser.MethodDeclContext ctx);
	/**
	 * Visit a parse tree produced by {@link grParser#formPars}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFormPars(grParser.FormParsContext ctx);
	/**
	 * Visit a parse tree produced by {@link grParser#block}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBlock(grParser.BlockContext ctx);
	/**
	 * Visit a parse tree produced by {@link grParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStatement(grParser.StatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link grParser#actPars}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitActPars(grParser.ActParsContext ctx);
	/**
	 * Visit a parse tree produced by {@link grParser#condition}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCondition(grParser.ConditionContext ctx);
	/**
	 * Visit a parse tree produced by {@link grParser#relop}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRelop(grParser.RelopContext ctx);
	/**
	 * Visit a parse tree produced by {@link grParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpr(grParser.ExprContext ctx);
	/**
	 * Visit a parse tree produced by {@link grParser#term}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTerm(grParser.TermContext ctx);
	/**
	 * Visit a parse tree produced by {@link grParser#factor}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFactor(grParser.FactorContext ctx);
	/**
	 * Visit a parse tree produced by {@link grParser#designator}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDesignator(grParser.DesignatorContext ctx);
	/**
	 * Visit a parse tree produced by {@link grParser#x}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitX(grParser.XContext ctx);
	/**
	 * Visit a parse tree produced by {@link grParser#validarray}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitValidarray(grParser.ValidarrayContext ctx);
	/**
	 * Visit a parse tree produced by {@link grParser#invalidarray}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInvalidarray(grParser.InvalidarrayContext ctx);
	/**
	 * Visit a parse tree produced by {@link grParser#tok_lb}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTok_lb(grParser.Tok_lbContext ctx);
	/**
	 * Visit a parse tree produced by {@link grParser#tok_rb}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTok_rb(grParser.Tok_rbContext ctx);
	/**
	 * Visit a parse tree produced by {@link grParser#semi}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSemi(grParser.SemiContext ctx);
	/**
	 * Visit a parse tree produced by {@link grParser#varType}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVarType(grParser.VarTypeContext ctx);
	/**
	 * Visit a parse tree produced by {@link grParser#vartp}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVartp(grParser.VartpContext ctx);
	/**
	 * Visit a parse tree produced by {@link grParser#varArray}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVarArray(grParser.VarArrayContext ctx);
}