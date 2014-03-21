package while_language.ast;

import while_language.Environment;
import while_language.VariableNotDefinedException;

public abstract class ArithExpr {

	public abstract int evaluate(Environment env) throws VariableNotDefinedException;
	
}
