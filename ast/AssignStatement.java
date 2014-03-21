package while_language.ast;

import while_language.Environment;
import while_language.VariableNotDefinedException;

public class AssignStatement extends Statement {

	private String name;
	private ArithExpr expression;
	
	public AssignStatement(String name, ArithExpr expression) {
		this.name = name;
		this.expression = expression;
	}
	
	@Override
	public void evaluate(Environment env) throws VariableNotDefinedException {
		int value = expression.evaluate(env);
		env.setVariable(name, value);
	}

}
