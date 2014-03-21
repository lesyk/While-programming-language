package while_language.ast;

import while_language.Environment;
import while_language.VariableNotDefinedException;

public class IdExpr extends ArithExpr {

	private String name;
	
	public IdExpr(String name) {
		this.name = name;
	}
	
	@Override
	public int evaluate(Environment env) throws VariableNotDefinedException {
		return env.getVariable(name);
	}

}
