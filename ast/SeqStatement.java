package while_language.ast;

import while_language.Environment;
import while_language.VariableNotDefinedException;

public class SeqStatement extends Statement {

	private Statement statement1;
	private Statement statement2;
	
	public SeqStatement(Statement statement1, Statement statement2) {
		this.statement1 = statement1;
		this.statement2 = statement2;
	}
	
	@Override
	public void evaluate(Environment env) throws VariableNotDefinedException {
		statement1.evaluate(env);
		statement2.evaluate(env);
	}

}
