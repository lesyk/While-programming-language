package while_language.ast;

import while_language.Environment;
import while_language.VariableNotDefinedException;

public class IfStatement extends Statement {

	private BoolExpr condition;
	private Statement ifBranch;
	private Statement elseBranch;
	
	public IfStatement(BoolExpr condition, Statement ifBranch, Statement elseBranch) {
		this.condition = condition;
		this.ifBranch = ifBranch;
		this.elseBranch = elseBranch;
	}
	
	@Override
	public void evaluate(Environment env) throws VariableNotDefinedException {
		if (condition.evaluate(env)) {
			ifBranch.evaluate(env);	
		} else {
			elseBranch.evaluate(env);
		}
	}

}
