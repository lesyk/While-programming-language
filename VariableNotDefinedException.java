package while_language;

public class VariableNotDefinedException extends Exception {

	private static final long serialVersionUID = 1L;

	private String variableName;
	
	public VariableNotDefinedException(String name) {
		this.variableName = name;
	}
	
	public String toString() {
		return "The variable " + variableName + " is not defined.";
	}
	
}
