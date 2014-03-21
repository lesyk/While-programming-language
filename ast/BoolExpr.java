package while_language.ast;

import while_language.Environment;
import while_language.VariableNotDefinedException;

public abstract class BoolExpr {

	public abstract boolean evaluate(Environment env) throws VariableNotDefinedException;
	
}
