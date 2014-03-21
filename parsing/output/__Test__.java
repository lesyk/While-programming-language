import java.io.*;
import org.antlr.runtime.*;
import org.antlr.runtime.debug.DebugEventSocketProxy;

import while_language.parsing.*;


public class __Test__ {

    public static void main(String args[]) throws Exception {
        WhileLanguageLexer lex = new WhileLanguageLexer(new ANTLRFileStream("/Users/lesyk/Dropbox/Universities/02141 Computer Science Modelling/mandatory assignment 2/while_language/parsing/output/__Test___input.txt", "UTF8"));
        CommonTokenStream tokens = new CommonTokenStream(lex);

        WhileLanguageParser g = new WhileLanguageParser(tokens, 49100, null);
        try {
            g.program();
        } catch (RecognitionException e) {
            e.printStackTrace();
        }
    }
}