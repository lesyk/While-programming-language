package while_language.ast;

import while_language.Environment;
import while_language.VariableNotDefinedException;

public class NotExpr extends BoolExpr {

	private BoolExpr expression;
	
	public NotExpr(BoolExpr expression) {
		this.expression = expression;
	}
	
	@Override
	public boolean evaluate(Environment env) throws VariableNotDefinedException {
		return !expression.evaluate(env);
	}

}
