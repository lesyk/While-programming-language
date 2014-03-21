package while_language;

import java.util.HashMap;
import java.util.Map.Entry;

public class Environment {

	private HashMap<String,Integer> variableValues = new HashMap<String,Integer>();
	
	public Environment() { }
	
	public void setVariable(String name, int value) {
		variableValues.put(name, value);
	}
	
	public int getVariable(String name) throws VariableNotDefinedException {
		Integer value = variableValues.get(name); 
		if (value == null) throw new VariableNotDefinedException(name);
		return value.intValue();
	}
	
	public String toString() {
		String table = "";
		for (Entry<String,Integer> entry : variableValues.entrySet()) {
			table += entry.getKey() + "\t-> " + entry.getValue() + "\n";
		}
		return table;
	}
	
}
