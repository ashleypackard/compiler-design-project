import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.antlr.v4.runtime.tree.TerminalNode;


public class PL0Interpreter extends PL0BaseVisitor<Integer> {
	
	private Map<String, Integer> vars = new HashMap<String, Integer>();
	private Map<String, Integer> consts = new HashMap<String, Integer>();
	private Map<String, PL0Parser.BlockContext> funcs = new HashMap<String, PL0Parser.BlockContext>();
	
	@Override
	public Integer visitConsts(PL0Parser.ConstsContext ctx) {		
		List<TerminalNode> ids = ctx.Ident();
		List<TerminalNode> values = ctx.Number();
		
		// put consts values in map!
		for(int i = 0; i < ids.size(); i++) {
			consts.put(ids.get(i).getText(), new Integer(values.get(i).getText()));
		}
		return null;
	}
	
	@Override
	public Integer visitVars(PL0Parser.VarsContext ctx) {
		List<TerminalNode> idents = ctx.Ident();
		for(TerminalNode ident : idents) {
			vars.put(ident.getText(), null);
		}
		return null;
	}
	
	@Override
	public Integer visitProcedure(PL0Parser.ProcedureContext ctx) {
		funcs.put(ctx.Ident().getText(), ctx.block());
		return null;
	}
	
	@Override
	public Integer visitAssignStat(PL0Parser.AssignStatContext ctx) {
		String id = ctx.Ident().getText();
		if ( consts.containsKey(id) ) {
			throw new RuntimeException("Cannot reassign value to const " + id);
		}
		if ( !vars.containsKey(id) ) {
			throw new RuntimeException("No such variable: " + id);
		}
		
		vars.put(id, this.visit(ctx.expression()));
		return null;
	}
	
	@Override
	public Integer visitCallStat(PL0Parser.CallStatContext ctx) {
		String id = ctx.Ident().getText();
		if ( !funcs.containsKey(id) ) {
			throw new RuntimeException("Unknown function " + id + " cannot be called!");
		}
		this.visit(funcs.get(id));
		return null;
	}
	
	@Override
	public Integer visitBangStat(PL0Parser.BangStatContext ctx) {
		String id = ctx.Ident().getText();
		if ( !vars.containsKey(id) && !consts.containsKey(id) ) {
			throw new RuntimeException("Cannot print variable " + id + " because it is not found");
		}
		int result = vars.containsKey(id) ? vars.get(id) : consts.get(id);
		System.out.println(result);
		return null;
	}
	
	@Override
	public Integer visitIfStat(PL0Parser.IfStatContext ctx) {
		if ( this.visit(ctx.condition()) == 1){
			this.visit( ctx.statement() );
		}
		return null;
	}
	
	@Override
	public Integer visitWhileStat(PL0Parser.WhileStatContext ctx) {
		while( this.visit(ctx.condition()) == 1) {
			this.visit( ctx.statement() );
		}
		return null;
	}
	
	@Override
	public Integer visitCondition(PL0Parser.ConditionContext ctx) {
		int left = this.visit(ctx.expression(0));
		int right = this.visit(ctx.expression(1));
		
		boolean result = false;
		switch ( ctx.op.getType() ) {
			case PL0Parser.GT:
				result = left > right;
				break;
			case PL0Parser.GTE:
				result = left >= right;
				break;
			case PL0Parser.LT:
				result = left < right;
				break;
			case PL0Parser.LTE:
				result = left <= right;
				break;
			case PL0Parser.EQ:
				result = left == right;
				break;
			default:
				throw new RuntimeException("Expected an equality operator but got " + ctx.op.getText());
		}
		return result ? 1 : 0;
	}
	
	@Override
	public Integer visitExpression(PL0Parser.ExpressionContext ctx) {
		int result = this.visit(ctx.term());                       // initialize result to the first term
		if ( ctx.opt_sign != null && ctx.opt_sign.getText().equals("-")) {
			result *= -1;
		}
		for ( PL0Parser.Opt_termContext term : ctx.opt_term() ) {  // perform additive operation for every other term
			switch (term.op.getType()) {
				case PL0Parser.PLUS:
					result += this.visit(term.term());
					break;
				case PL0Parser.MINUS:
					result -= this.visit(term.term());
					break;
				default:
					throw new RuntimeException("Expected a '+' or '-' but got " + term.op.getText());
			}
		}
		return result;
	}
	
	@Override
	public Integer visitTerm(PL0Parser.TermContext ctx) {
		int result = this.visit(ctx.factor());                           // initialize result to the first factor
		for ( PL0Parser.Opt_factorContext factor : ctx.opt_factor() ) {  // perform operation for every other factor
			switch (factor.op.getType()) {
				case PL0Parser.DIV:
					result /= this.visit(factor.factor());
					break;
				case PL0Parser.MULT:
					result *= this.visit(factor.factor());
					break;
				default:
					throw new RuntimeException("Expected a '/' or '*' but got " + factor.op.getText());
			}
		}
		return result;
	}

	@Override
	public Integer visitIdentFactor(PL0Parser.IdentFactorContext ctx) {
		String id = ctx.Ident().getText();
		if ( !vars.containsKey(id) && !consts.containsKey(id)) {
			throw new RuntimeException("Cannot find variable " + id);
		}
		return vars.containsKey(id) ? vars.get(id) : consts.get(id);
	}
	
	@Override
	public Integer visitNumberFactor(PL0Parser.NumberFactorContext ctx) {
		return new Integer(ctx.getText());
	}
	
	@Override
	public Integer visitParExpr(PL0Parser.ParExprContext ctx) {
		return this.visit(ctx.expression());
	}
	
}
