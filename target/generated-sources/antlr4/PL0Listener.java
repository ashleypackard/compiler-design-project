// Generated from PL0.g4 by ANTLR 4.4
import org.antlr.v4.runtime.misc.NotNull;
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link PL0Parser}.
 */
public interface PL0Listener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by the {@code ifStat}
	 * labeled alternative in {@link PL0Parser#statement}.
	 * @param ctx the parse tree
	 */
	void enterIfStat(@NotNull PL0Parser.IfStatContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ifStat}
	 * labeled alternative in {@link PL0Parser#statement}.
	 * @param ctx the parse tree
	 */
	void exitIfStat(@NotNull PL0Parser.IfStatContext ctx);
	/**
	 * Enter a parse tree produced by {@link PL0Parser#expression}.
	 * @param ctx the parse tree
	 */
	void enterExpression(@NotNull PL0Parser.ExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link PL0Parser#expression}.
	 * @param ctx the parse tree
	 */
	void exitExpression(@NotNull PL0Parser.ExpressionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code callStat}
	 * labeled alternative in {@link PL0Parser#statement}.
	 * @param ctx the parse tree
	 */
	void enterCallStat(@NotNull PL0Parser.CallStatContext ctx);
	/**
	 * Exit a parse tree produced by the {@code callStat}
	 * labeled alternative in {@link PL0Parser#statement}.
	 * @param ctx the parse tree
	 */
	void exitCallStat(@NotNull PL0Parser.CallStatContext ctx);
	/**
	 * Enter a parse tree produced by {@link PL0Parser#opt_term}.
	 * @param ctx the parse tree
	 */
	void enterOpt_term(@NotNull PL0Parser.Opt_termContext ctx);
	/**
	 * Exit a parse tree produced by {@link PL0Parser#opt_term}.
	 * @param ctx the parse tree
	 */
	void exitOpt_term(@NotNull PL0Parser.Opt_termContext ctx);
	/**
	 * Enter a parse tree produced by {@link PL0Parser#program}.
	 * @param ctx the parse tree
	 */
	void enterProgram(@NotNull PL0Parser.ProgramContext ctx);
	/**
	 * Exit a parse tree produced by {@link PL0Parser#program}.
	 * @param ctx the parse tree
	 */
	void exitProgram(@NotNull PL0Parser.ProgramContext ctx);
	/**
	 * Enter a parse tree produced by {@link PL0Parser#procedure}.
	 * @param ctx the parse tree
	 */
	void enterProcedure(@NotNull PL0Parser.ProcedureContext ctx);
	/**
	 * Exit a parse tree produced by {@link PL0Parser#procedure}.
	 * @param ctx the parse tree
	 */
	void exitProcedure(@NotNull PL0Parser.ProcedureContext ctx);
	/**
	 * Enter a parse tree produced by {@link PL0Parser#consts}.
	 * @param ctx the parse tree
	 */
	void enterConsts(@NotNull PL0Parser.ConstsContext ctx);
	/**
	 * Exit a parse tree produced by {@link PL0Parser#consts}.
	 * @param ctx the parse tree
	 */
	void exitConsts(@NotNull PL0Parser.ConstsContext ctx);
	/**
	 * Enter a parse tree produced by {@link PL0Parser#opt_factor}.
	 * @param ctx the parse tree
	 */
	void enterOpt_factor(@NotNull PL0Parser.Opt_factorContext ctx);
	/**
	 * Exit a parse tree produced by {@link PL0Parser#opt_factor}.
	 * @param ctx the parse tree
	 */
	void exitOpt_factor(@NotNull PL0Parser.Opt_factorContext ctx);
	/**
	 * Enter a parse tree produced by the {@code beginStat}
	 * labeled alternative in {@link PL0Parser#statement}.
	 * @param ctx the parse tree
	 */
	void enterBeginStat(@NotNull PL0Parser.BeginStatContext ctx);
	/**
	 * Exit a parse tree produced by the {@code beginStat}
	 * labeled alternative in {@link PL0Parser#statement}.
	 * @param ctx the parse tree
	 */
	void exitBeginStat(@NotNull PL0Parser.BeginStatContext ctx);
	/**
	 * Enter a parse tree produced by the {@code numberFactor}
	 * labeled alternative in {@link PL0Parser#factor}.
	 * @param ctx the parse tree
	 */
	void enterNumberFactor(@NotNull PL0Parser.NumberFactorContext ctx);
	/**
	 * Exit a parse tree produced by the {@code numberFactor}
	 * labeled alternative in {@link PL0Parser#factor}.
	 * @param ctx the parse tree
	 */
	void exitNumberFactor(@NotNull PL0Parser.NumberFactorContext ctx);
	/**
	 * Enter a parse tree produced by the {@code parExpr}
	 * labeled alternative in {@link PL0Parser#factor}.
	 * @param ctx the parse tree
	 */
	void enterParExpr(@NotNull PL0Parser.ParExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code parExpr}
	 * labeled alternative in {@link PL0Parser#factor}.
	 * @param ctx the parse tree
	 */
	void exitParExpr(@NotNull PL0Parser.ParExprContext ctx);
	/**
	 * Enter a parse tree produced by {@link PL0Parser#condition}.
	 * @param ctx the parse tree
	 */
	void enterCondition(@NotNull PL0Parser.ConditionContext ctx);
	/**
	 * Exit a parse tree produced by {@link PL0Parser#condition}.
	 * @param ctx the parse tree
	 */
	void exitCondition(@NotNull PL0Parser.ConditionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code identFactor}
	 * labeled alternative in {@link PL0Parser#factor}.
	 * @param ctx the parse tree
	 */
	void enterIdentFactor(@NotNull PL0Parser.IdentFactorContext ctx);
	/**
	 * Exit a parse tree produced by the {@code identFactor}
	 * labeled alternative in {@link PL0Parser#factor}.
	 * @param ctx the parse tree
	 */
	void exitIdentFactor(@NotNull PL0Parser.IdentFactorContext ctx);
	/**
	 * Enter a parse tree produced by {@link PL0Parser#block}.
	 * @param ctx the parse tree
	 */
	void enterBlock(@NotNull PL0Parser.BlockContext ctx);
	/**
	 * Exit a parse tree produced by {@link PL0Parser#block}.
	 * @param ctx the parse tree
	 */
	void exitBlock(@NotNull PL0Parser.BlockContext ctx);
	/**
	 * Enter a parse tree produced by {@link PL0Parser#term}.
	 * @param ctx the parse tree
	 */
	void enterTerm(@NotNull PL0Parser.TermContext ctx);
	/**
	 * Exit a parse tree produced by {@link PL0Parser#term}.
	 * @param ctx the parse tree
	 */
	void exitTerm(@NotNull PL0Parser.TermContext ctx);
	/**
	 * Enter a parse tree produced by {@link PL0Parser#vars}.
	 * @param ctx the parse tree
	 */
	void enterVars(@NotNull PL0Parser.VarsContext ctx);
	/**
	 * Exit a parse tree produced by {@link PL0Parser#vars}.
	 * @param ctx the parse tree
	 */
	void exitVars(@NotNull PL0Parser.VarsContext ctx);
	/**
	 * Enter a parse tree produced by the {@code bangStat}
	 * labeled alternative in {@link PL0Parser#statement}.
	 * @param ctx the parse tree
	 */
	void enterBangStat(@NotNull PL0Parser.BangStatContext ctx);
	/**
	 * Exit a parse tree produced by the {@code bangStat}
	 * labeled alternative in {@link PL0Parser#statement}.
	 * @param ctx the parse tree
	 */
	void exitBangStat(@NotNull PL0Parser.BangStatContext ctx);
	/**
	 * Enter a parse tree produced by the {@code assignStat}
	 * labeled alternative in {@link PL0Parser#statement}.
	 * @param ctx the parse tree
	 */
	void enterAssignStat(@NotNull PL0Parser.AssignStatContext ctx);
	/**
	 * Exit a parse tree produced by the {@code assignStat}
	 * labeled alternative in {@link PL0Parser#statement}.
	 * @param ctx the parse tree
	 */
	void exitAssignStat(@NotNull PL0Parser.AssignStatContext ctx);
	/**
	 * Enter a parse tree produced by the {@code whileStat}
	 * labeled alternative in {@link PL0Parser#statement}.
	 * @param ctx the parse tree
	 */
	void enterWhileStat(@NotNull PL0Parser.WhileStatContext ctx);
	/**
	 * Exit a parse tree produced by the {@code whileStat}
	 * labeled alternative in {@link PL0Parser#statement}.
	 * @param ctx the parse tree
	 */
	void exitWhileStat(@NotNull PL0Parser.WhileStatContext ctx);
}