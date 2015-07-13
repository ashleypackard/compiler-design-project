// Generated from PL0.g4 by ANTLR 4.4
import org.antlr.v4.runtime.misc.NotNull;
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link PL0Parser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface PL0Visitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by the {@code ifStat}
	 * labeled alternative in {@link PL0Parser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIfStat(@NotNull PL0Parser.IfStatContext ctx);
	/**
	 * Visit a parse tree produced by {@link PL0Parser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpression(@NotNull PL0Parser.ExpressionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code callStat}
	 * labeled alternative in {@link PL0Parser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCallStat(@NotNull PL0Parser.CallStatContext ctx);
	/**
	 * Visit a parse tree produced by {@link PL0Parser#opt_term}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOpt_term(@NotNull PL0Parser.Opt_termContext ctx);
	/**
	 * Visit a parse tree produced by {@link PL0Parser#program}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitProgram(@NotNull PL0Parser.ProgramContext ctx);
	/**
	 * Visit a parse tree produced by {@link PL0Parser#procedure}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitProcedure(@NotNull PL0Parser.ProcedureContext ctx);
	/**
	 * Visit a parse tree produced by {@link PL0Parser#consts}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitConsts(@NotNull PL0Parser.ConstsContext ctx);
	/**
	 * Visit a parse tree produced by {@link PL0Parser#opt_factor}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOpt_factor(@NotNull PL0Parser.Opt_factorContext ctx);
	/**
	 * Visit a parse tree produced by the {@code beginStat}
	 * labeled alternative in {@link PL0Parser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBeginStat(@NotNull PL0Parser.BeginStatContext ctx);
	/**
	 * Visit a parse tree produced by the {@code numberFactor}
	 * labeled alternative in {@link PL0Parser#factor}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNumberFactor(@NotNull PL0Parser.NumberFactorContext ctx);
	/**
	 * Visit a parse tree produced by the {@code parExpr}
	 * labeled alternative in {@link PL0Parser#factor}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParExpr(@NotNull PL0Parser.ParExprContext ctx);
	/**
	 * Visit a parse tree produced by {@link PL0Parser#condition}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCondition(@NotNull PL0Parser.ConditionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code identFactor}
	 * labeled alternative in {@link PL0Parser#factor}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIdentFactor(@NotNull PL0Parser.IdentFactorContext ctx);
	/**
	 * Visit a parse tree produced by {@link PL0Parser#block}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBlock(@NotNull PL0Parser.BlockContext ctx);
	/**
	 * Visit a parse tree produced by {@link PL0Parser#term}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTerm(@NotNull PL0Parser.TermContext ctx);
	/**
	 * Visit a parse tree produced by {@link PL0Parser#vars}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVars(@NotNull PL0Parser.VarsContext ctx);
	/**
	 * Visit a parse tree produced by the {@code bangStat}
	 * labeled alternative in {@link PL0Parser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBangStat(@NotNull PL0Parser.BangStatContext ctx);
	/**
	 * Visit a parse tree produced by the {@code assignStat}
	 * labeled alternative in {@link PL0Parser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAssignStat(@NotNull PL0Parser.AssignStatContext ctx);
	/**
	 * Visit a parse tree produced by the {@code whileStat}
	 * labeled alternative in {@link PL0Parser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitWhileStat(@NotNull PL0Parser.WhileStatContext ctx);
}