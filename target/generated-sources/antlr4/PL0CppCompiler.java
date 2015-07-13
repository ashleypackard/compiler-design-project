import java.util.List;

import org.antlr.v4.runtime.tree.TerminalNode;

public class PL0CppCompiler extends PL0BaseVisitor<Integer> {

	@Override
	public Integer visitProgram(PL0Parser.ProgramContext ctx) {
		System.out.println("#include <iostream>\nusing namespace std;\n");
		this.visit(ctx.block());
		return null;
	}
	
	@Override
	public Integer visitBlock(PL0Parser.BlockContext ctx) {
		if ( ctx.consts() != null ) { this.visit(ctx.consts()); }
		if ( ctx.vars() != null ) { this.visit(ctx.vars()); }
		for ( PL0Parser.ProcedureContext proc : ctx.procedure() ) {
			this.visit(proc);
		}
		// "The "return address" is the followState of invokingState If parent is null, this should be -1."
		// check if block is main block under "program" non-term as opposed to blocks in procedures
		if( ctx.parent.invokingState == -1 ) { System.out.print("int main() {\n"); }
		this.visit(ctx.statement());
		if( ctx.parent.invokingState == -1 ) { System.out.println("return 0;\n}"); }
		return null;
	}

	@Override
	public Integer visitProcedure(PL0Parser.ProcedureContext ctx) {
		System.out.print("void " + ctx.Ident().getText() + "() {\n");
		this.visit(ctx.block());
		System.out.print("}\n\n");
		return null;
	}
	
	@Override
	public Integer visitConsts(PL0Parser.ConstsContext ctx) {
		// start by adding the first contstant to the declaration
		System.out.print("const int " + ctx.Ident().get(0) + " = " + ctx.Number(0).getText() );
		
		List<TerminalNode> ids = ctx.Ident().subList(1, ctx.Ident().size());
		List<TerminalNode> values = ctx.Number().subList(1, ctx.Number().size());
		
		for(int i = 0; i < ids.size(); i++) {            // Add remaning consts to declaration, comma separated
			System.out.print(", " + ids.get(i).getText() + " = " + values.get(i).getText() );
		}
		System.out.println(";" );
		return null;
	}

	@Override
	public Integer visitVars(PL0Parser.VarsContext ctx) {
		System.out.print("int " + ctx.Ident(0).getText()); // first variable
		
		List<TerminalNode> vars = ctx.Ident().subList(1, ctx.Ident().size()); // for each remaining variable
		for ( TerminalNode var : vars ) {
			System.out.print(", " + var.getText());        // comma separate the variables
		}
		System.out.println(";" );
		return null;
	}

	@Override
	public Integer visitAssignStat(PL0Parser.AssignStatContext ctx) {
		String var = ctx.Ident().getText();
		System.out.print(var + " = ");
		this.visit(ctx.expression());
		System.out.println(";");
		return null;
	}
	
	@Override
	public Integer visitCallStat(PL0Parser.CallStatContext ctx) {
		System.out.println(ctx.Ident().getText() + "();");
		return null;
	}

	@Override
	public Integer visitBangStat(PL0Parser.BangStatContext ctx) {
		System.out.println("cout << " + ctx.Ident().getText() + " << endl;");
		return null;
	}

	@Override
	public Integer visitIfStat(PL0Parser.IfStatContext ctx) {
		System.out.print("if (");
		this.visit(ctx.condition());
		System.out.print(") {\n");
		this.visit(ctx.statement());
		System.out.print("}\n");
		return null;
	}

	@Override
	public Integer visitWhileStat(PL0Parser.WhileStatContext ctx) {
		System.out.print("while (");
		this.visit(ctx.condition());
		System.out.print(") {\n");
		this.visit(ctx.statement());
		System.out.print("}\n");
		return null;
	}

	@Override
	public Integer visitCondition(PL0Parser.ConditionContext ctx) {
		this.visit(ctx.expression(0));
		System.out.print(ctx.op.getText());
		this.visit(ctx.expression(1));
		return null;
	}

	@Override
	public Integer visitExpression(PL0Parser.ExpressionContext ctx) {
		if ( ctx.opt_sign != null ) {
			System.out.print( ctx.opt_sign.getText() );
		}
		this.visit(ctx.term());                                    // print first term and option sign
		for ( PL0Parser.Opt_termContext term : ctx.opt_term() ) {  // print operator and term for all remaining terms
			switch (term.op.getType()) {
				case PL0Parser.PLUS:
					System.out.print("+");
					break;
				case PL0Parser.MINUS:
					System.out.print("-");
					break;
				default:
					throw new RuntimeException("Expected a '+' or '-' but got " + term.op.getText());
			}
			this.visit(term.term());
		}
		return null;
	}

	@Override
	public Integer visitTerm(PL0Parser.TermContext ctx) {
		this.visit(ctx.factor());
		for ( PL0Parser.Opt_factorContext factor : ctx.opt_factor() ) {  // print operator and factor for all remaining factors
			switch (factor.op.getType()) {
				case PL0Parser.DIV:
					System.out.print("/");
					break;
				case PL0Parser.MULT:
					System.out.print("*");
					break;
				default:
					throw new RuntimeException("Expected a '/' or '*' but got " + factor.op.getText());
			}
			this.visit(factor.factor());
		}
		return null;
	}

	@Override
	public Integer visitIdentFactor(PL0Parser.IdentFactorContext ctx) {
		System.out.print(ctx.Ident().getText());
		return null;
	}
	
	@Override
	public Integer visitNumberFactor(PL0Parser.NumberFactorContext ctx) {
		System.out.print(ctx.getText());
		return null;
	}
	
	@Override
	public Integer visitParExpr(PL0Parser.ParExprContext ctx) {
		System.out.print("(");
		this.visit(ctx.expression());
		System.out.print(")");
		return null;
	}
}
