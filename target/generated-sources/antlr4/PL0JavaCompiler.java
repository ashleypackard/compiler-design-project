public class PL0JavaCompiler extends PL0BaseVisitor<Integer> {
	
	@Override
	public Integer visitProgram(PL0Parser.ProgramContext ctx) {
		System.out.println("public class PL0Main {\n");
		this.visit(ctx.block());
		System.out.println("}");
		
		return null;
	}
	
	@Override
	public Integer visitBlock(PL0Parser.BlockContext ctx) {
		if(ctx.consts() != null) {
			this.visit(ctx.consts());
		}
		
		if(ctx.vars() != null){
			this.visit(ctx.vars());
		}
		
		this.visit(ctx.statement());
		
		System.out.println("}");
		
		for(int i = 0; i < ctx.procedure().size(); i++) {
			this.visit(ctx.procedure(i));
		}
		
		return null;
	}

	@Override
	public Integer visitConsts(PL0Parser.ConstsContext ctx) {
		// print out the list of consts
		for(int i = 0; i < ctx.Ident().size(); i++) {
			System.out.println("public static final int " + ctx.Ident().get(i).getText() + " = " + ctx.Number(i).getText() + ";");
		}
		System.out.println();
		
		return null;
	}

	@Override
	public Integer visitVars(PL0Parser.VarsContext ctx) {
		// print out the list of vars
		for(int i = 0; i < ctx.Ident().size(); i++) {
			System.out.println("public static int " + ctx.Ident().get(i).getText() + ";");
		}
		System.out.println("\npublic static void main(String[] args) {\n");
		
		return null;
	}
	
	@Override
	public Integer visitProcedure(PL0Parser.ProcedureContext ctx) {
		
		System.out.println("public static void " + ctx.Ident().getText().toString() + "() {\n");
		this.visit(ctx.block());
		
		return null;
	}
	
	@Override
	public Integer visitAssignStat(PL0Parser.AssignStatContext ctx) {
		System.out.print(ctx.Ident().getText().toString() + " = ");
		this.visit(ctx.expression());
		System.out.print(";\n");
		
		return null;
	}
	
	@Override
	public Integer visitCallStat(PL0Parser.CallStatContext ctx) {
		System.out.println(ctx.Ident().getText().toString() + "();");
		
		return null;
	}
	
	@Override
	public Integer visitBangStat(PL0Parser.BangStatContext ctx) {
		System.out.println("System.out.println(" + ctx.Ident().getText().toString() +");");
		return null;
	}

	@Override
	public Integer visitIfStat(PL0Parser.IfStatContext ctx) {
		System.out.print("\nif(");
		this.visit(ctx.condition());
		System.out.print(") {\n");
		this.visit(ctx.statement());
		System.out.println("}\n");
		
		return null;
	}
	
	@Override
	public Integer visitWhileStat(PL0Parser.WhileStatContext ctx) {
		System.out.print("while(" );
		
		this.visit(ctx.condition());
		System.out.print(") {\n");
		this.visit(ctx.statement());
		System.out.println("}\n");
		
		return null;
	}

	@Override
	public Integer visitCondition(PL0Parser.ConditionContext ctx) {
		
		this.visit(ctx.expression(0));
		System.out.print(" " + ctx.op.getText().toString() + " ");
		this.visit(ctx.expression(1));		

		return null;
	}	
	
	@Override
	public Integer visitExpression(PL0Parser.ExpressionContext ctx) {
		// check for optional sign
		if(ctx.opt_sign != null) {
			System.out.print(ctx.opt_sign.getText().toString());
		}
		this.visit(ctx.term());
		
		// since it's optional, check to make sure there are more terms!
		if(ctx.opt_term().size() != 0) {
			// if there are more terms, cycle through the list and and visit them all
			for(int i=0; i <ctx.opt_term().size(); i++) {
				this.visit(ctx.opt_term(i));
			}
		}
		
		return null;
	}

	@Override
	public Integer visitOpt_term(PL0Parser.Opt_termContext ctx) {
		System.out.print(" " + ctx.op.getText().toString() + " ");
		this.visit(ctx.term());
		
		return null;
	}

	@Override
	public Integer visitTerm(PL0Parser.TermContext ctx) {
		this.visit(ctx.factor());
		
		//check for optional opt_factors
		if(ctx.opt_factor().size() != 0) {
			for(int i = 0; i < ctx.opt_factor().size(); i++) {
				this.visit(ctx.opt_factor(i));				
			}
		}
		
		return null;
	}

	@Override
	public Integer visitOpt_factor(PL0Parser.Opt_factorContext ctx) {
		System.out.print(" " + ctx.op.getText().toString() + " ");
		this.visit(ctx.factor());
		
		return null;
	}

	@Override
	public Integer visitIdentFactor(PL0Parser.IdentFactorContext ctx) {
		System.out.print(ctx.Ident().getText().toString());
		
		return null;
	}
	
	@Override
	public Integer visitNumberFactor(PL0Parser.NumberFactorContext ctx) {
		System.out.print(ctx.Number().getText().toString());

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