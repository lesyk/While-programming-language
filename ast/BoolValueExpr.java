package while_language.ast;

import while_language.Environment;
import while_language.VariableNotDefinedException;

public class BoolValueExpr extends BoolExpr {

	private boolean value;
	
	public BoolValueExpr(boolean value) {
		this.value = value;
	}
	
	@Override
	public boolean evaluate(Environment env) throws VariableNotDefinedException {
		return value;
	}

}
