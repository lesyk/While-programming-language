package while_language.ast;

import while_language.Environment;
import while_language.VariableNotDefinedException;

public class NumExpr extends ArithExpr {

	private int value;
	
	public NumExpr(int value) {
		this.value = value;
	}
	
	@Override
	public int evaluate(Environment env) throws VariableNotDefinedException {
		return value;
	}

}
