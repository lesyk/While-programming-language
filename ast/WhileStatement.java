package while_language.ast;

import while_language.Environment;
import while_language.VariableNotDefinedException;

public class WhileStatement extends Statement {

  private BoolExpr condition;
  private Statement workBranch;
  
  public WhileStatement(BoolExpr condition, Statement workBranch) {
    this.condition = condition;
    this.workBranch = workBranch;
  }
  
  @Override
  public void evaluate(Environment env) throws VariableNotDefinedException {
    while(condition.evaluate(env)) {
      workBranch.evaluate(env);
    }
  }

}