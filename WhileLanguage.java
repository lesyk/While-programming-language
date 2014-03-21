package while_language;

import org.antlr.runtime.ANTLRFileStream;
import org.antlr.runtime.CommonTokenStream;

import while_language.ast.Statement;
import while_language.parsing.WhileLanguageLexer;
import while_language.parsing.WhileLanguageParser;

public class WhileLanguage {

  public static void main(String args[]) throws Exception {
    if (args.length == 0) {
      System.out.println("Error: No program specified.");
      return;
    }
    
        WhileLanguageLexer lex = new WhileLanguageLexer(new ANTLRFileStream(args[0]));
        CommonTokenStream tokens = new CommonTokenStream(lex);

        WhileLanguageParser parser = new WhileLanguageParser(tokens);
        Statement whileProgram = parser.program();

        try {
          Environment env = new Environment();
          whileProgram.evaluate(env);
          System.out.println(env.toString());
        } catch (VariableNotDefinedException e) {
          System.out.println("Error: " + e);
        } catch (NullPointerException e) {
          System.out.println("Error parsing program.");
        }

  }
  
}