package while_language.ast;

import while_language.Environment;
import while_language.VariableNotDefinedException;

public abstract class Statement {

	public abstract void evaluate(Environment env) throws VariableNotDefinedException;
	
}
