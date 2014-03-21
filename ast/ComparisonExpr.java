package while_language.ast;

import while_language.Environment;
import while_language.VariableNotDefinedException;

public class ComparisonExpr extends BoolExpr {

  private ArithExpr expression1;
  private ArithExpr expression2;
  private Integer sign;
  
  public ComparisonExpr(ArithExpr expression1, ArithExpr expression2, Integer sign) {
    this.expression1 = expression1;
    this.expression2 = expression2;
    this.sign = sign;
  }
  
  @Override
  public boolean evaluate(Environment env) throws VariableNotDefinedException {
    if(sign == 1){
      return expression1.evaluate(env) == expression2.evaluate(env);
    }else if(sign == 2){
      return expression1.evaluate(env) <= expression2.evaluate(env);
    }else if(sign == 3){
      return expression1.evaluate(env) >= expression2.evaluate(env);
    }else{
      return expression1.evaluate(env) != expression2.evaluate(env);
    }
  }

}