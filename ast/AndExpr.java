package while_language.ast;

import while_language.Environment;
import while_language.VariableNotDefinedException;

public class AndExpr extends BoolExpr {
	
	private BoolExpr expression1;
	private BoolExpr expression2;
	
	public AndExpr(BoolExpr expression1, BoolExpr expression2) {
		this.expression1 = expression1;
		this.expression2 = expression2;
	}
	
	@Override
	public boolean evaluate(Environment env) throws VariableNotDefinedException {
		return expression1.evaluate(env) && expression2.evaluate(env);
	}

}
