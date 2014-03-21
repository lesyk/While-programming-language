// $ANTLR 3.3 Nov 30, 2010 12:45:30 /Users/lesyk/Dropbox/Universities/02141 Computer Science Modelling/mandatory assignment 2/while_language/parsing/WhileLanguage.g 2014-03-21 16:47:15

package while_language.parsing;

import while_language.ast.*;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

import org.antlr.runtime.debug.*;
import java.io.IOException;
public class WhileLanguageParser extends DebugParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "ID", "NUM", "WS", "';'", "':='", "'if'", "'then'", "'else'", "'while'", "'do'", "'{'", "'}'", "'&&'", "'true'", "'false'", "'='", "'<='", "'>='", "'!='", "'!'", "'+'", "'-'", "'*'"
    };
    public static final int EOF=-1;
    public static final int T__7=7;
    public static final int T__8=8;
    public static final int T__9=9;
    public static final int T__10=10;
    public static final int T__11=11;
    public static final int T__12=12;
    public static final int T__13=13;
    public static final int T__14=14;
    public static final int T__15=15;
    public static final int T__16=16;
    public static final int T__17=17;
    public static final int T__18=18;
    public static final int T__19=19;
    public static final int T__20=20;
    public static final int T__21=21;
    public static final int T__22=22;
    public static final int T__23=23;
    public static final int T__24=24;
    public static final int T__25=25;
    public static final int T__26=26;
    public static final int ID=4;
    public static final int NUM=5;
    public static final int WS=6;

    // delegates
    // delegators

    public static final String[] ruleNames = new String[] {
        "invalidRule", "program", "base_arith_expr", "arith_expr", "statement", 
        "mult_arith_expr", "base_statement", "literal", "bool_expr"
    };
    public static final boolean[] decisionCanBacktrack = new boolean[] {
        false, // invalid decision
        false, false, false, false, false, false, false, false, false
    };

     
        public int ruleLevel = 0;
        public int getRuleLevel() { return ruleLevel; }
        public void incRuleLevel() { ruleLevel++; }
        public void decRuleLevel() { ruleLevel--; }
        public WhileLanguageParser(TokenStream input) {
            this(input, DebugEventSocketProxy.DEFAULT_DEBUGGER_PORT, new RecognizerSharedState());
        }
        public WhileLanguageParser(TokenStream input, int port, RecognizerSharedState state) {
            super(input, state);
            DebugEventSocketProxy proxy =
                new DebugEventSocketProxy(this, port, null);
            setDebugListener(proxy);
            try {
                proxy.handshake();
            }
            catch (IOException ioe) {
                reportError(ioe);
            }
        }
    public WhileLanguageParser(TokenStream input, DebugEventListener dbg) {
        super(input, dbg, new RecognizerSharedState());

    }
    protected boolean evalPredicate(boolean result, String predicate) {
        dbg.semanticPredicate(result, predicate);
        return result;
    }


    public String[] getTokenNames() { return WhileLanguageParser.tokenNames; }
    public String getGrammarFileName() { return "/Users/lesyk/Dropbox/Universities/02141 Computer Science Modelling/mandatory assignment 2/while_language/parsing/WhileLanguage.g"; }



    // $ANTLR start "program"
    // /Users/lesyk/Dropbox/Universities/02141 Computer Science Modelling/mandatory assignment 2/while_language/parsing/WhileLanguage.g:19:1: program returns [Statement value] : s= statement EOF ;
    public final Statement program() throws RecognitionException {
        Statement value = null;

        Statement s = null;


        try { dbg.enterRule(getGrammarFileName(), "program");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(19, 1);

        try {
            // /Users/lesyk/Dropbox/Universities/02141 Computer Science Modelling/mandatory assignment 2/while_language/parsing/WhileLanguage.g:20:5: (s= statement EOF )
            dbg.enterAlt(1);

            // /Users/lesyk/Dropbox/Universities/02141 Computer Science Modelling/mandatory assignment 2/while_language/parsing/WhileLanguage.g:20:7: s= statement EOF
            {
            dbg.location(20,8);
            pushFollow(FOLLOW_statement_in_program49);
            s=statement();

            state._fsp--;

            dbg.location(20,19);
            match(input,EOF,FOLLOW_EOF_in_program51); 
            dbg.location(20,23);
             value = s; 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        dbg.location(21, 5);

        }
        finally {
            dbg.exitRule(getGrammarFileName(), "program");
            decRuleLevel();
            if ( getRuleLevel()==0 ) {dbg.terminate();}
        }

        return value;
    }
    // $ANTLR end "program"


    // $ANTLR start "statement"
    // /Users/lesyk/Dropbox/Universities/02141 Computer Science Modelling/mandatory assignment 2/while_language/parsing/WhileLanguage.g:23:1: statement returns [Statement value] : s= base_statement ( ';' s= base_statement )* ;
    public final Statement statement() throws RecognitionException {
        Statement value = null;

        Statement s = null;


        try { dbg.enterRule(getGrammarFileName(), "statement");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(23, 1);

        try {
            // /Users/lesyk/Dropbox/Universities/02141 Computer Science Modelling/mandatory assignment 2/while_language/parsing/WhileLanguage.g:24:5: (s= base_statement ( ';' s= base_statement )* )
            dbg.enterAlt(1);

            // /Users/lesyk/Dropbox/Universities/02141 Computer Science Modelling/mandatory assignment 2/while_language/parsing/WhileLanguage.g:24:7: s= base_statement ( ';' s= base_statement )*
            {
            dbg.location(24,8);
            pushFollow(FOLLOW_base_statement_in_statement76);
            s=base_statement();

            state._fsp--;

            dbg.location(24,30);
             value = s; 
            dbg.location(25,7);
            // /Users/lesyk/Dropbox/Universities/02141 Computer Science Modelling/mandatory assignment 2/while_language/parsing/WhileLanguage.g:25:7: ( ';' s= base_statement )*
            try { dbg.enterSubRule(1);

            loop1:
            do {
                int alt1=2;
                try { dbg.enterDecision(1, decisionCanBacktrack[1]);

                int LA1_0 = input.LA(1);

                if ( (LA1_0==7) ) {
                    alt1=1;
                }


                } finally {dbg.exitDecision(1);}

                switch (alt1) {
            	case 1 :
            	    dbg.enterAlt(1);

            	    // /Users/lesyk/Dropbox/Universities/02141 Computer Science Modelling/mandatory assignment 2/while_language/parsing/WhileLanguage.g:25:9: ';' s= base_statement
            	    {
            	    dbg.location(25,9);
            	    match(input,7,FOLLOW_7_in_statement94); 
            	    dbg.location(25,14);
            	    pushFollow(FOLLOW_base_statement_in_statement98);
            	    s=base_statement();

            	    state._fsp--;

            	    dbg.location(25,30);
            	     value = new SeqStatement(value,s); 

            	    }
            	    break;

            	default :
            	    break loop1;
                }
            } while (true);
            } finally {dbg.exitSubRule(1);}


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        dbg.location(26, 5);

        }
        finally {
            dbg.exitRule(getGrammarFileName(), "statement");
            decRuleLevel();
            if ( getRuleLevel()==0 ) {dbg.terminate();}
        }

        return value;
    }
    // $ANTLR end "statement"


    // $ANTLR start "base_statement"
    // /Users/lesyk/Dropbox/Universities/02141 Computer Science Modelling/mandatory assignment 2/while_language/parsing/WhileLanguage.g:28:1: base_statement returns [Statement value] : ( ID ':=' e= arith_expr | ( 'if' c= bool_expr 'then' s1= base_statement 'else' s2= base_statement | 'while' c= bool_expr 'do' s1= base_statement ) | '{' s= statement '}' );
    public final Statement base_statement() throws RecognitionException {
        Statement value = null;

        Token ID1=null;
        ArithExpr e = null;

        BoolExpr c = null;

        Statement s1 = null;

        Statement s2 = null;

        Statement s = null;


        try { dbg.enterRule(getGrammarFileName(), "base_statement");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(28, 1);

        try {
            // /Users/lesyk/Dropbox/Universities/02141 Computer Science Modelling/mandatory assignment 2/while_language/parsing/WhileLanguage.g:29:5: ( ID ':=' e= arith_expr | ( 'if' c= bool_expr 'then' s1= base_statement 'else' s2= base_statement | 'while' c= bool_expr 'do' s1= base_statement ) | '{' s= statement '}' )
            int alt3=3;
            try { dbg.enterDecision(3, decisionCanBacktrack[3]);

            switch ( input.LA(1) ) {
            case ID:
                {
                alt3=1;
                }
                break;
            case 9:
            case 12:
                {
                alt3=2;
                }
                break;
            case 14:
                {
                alt3=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 3, 0, input);

                dbg.recognitionException(nvae);
                throw nvae;
            }

            } finally {dbg.exitDecision(3);}

            switch (alt3) {
                case 1 :
                    dbg.enterAlt(1);

                    // /Users/lesyk/Dropbox/Universities/02141 Computer Science Modelling/mandatory assignment 2/while_language/parsing/WhileLanguage.g:29:7: ID ':=' e= arith_expr
                    {
                    dbg.location(29,7);
                    ID1=(Token)match(input,ID,FOLLOW_ID_in_base_statement124); 
                    dbg.location(29,10);
                    match(input,8,FOLLOW_8_in_base_statement126); 
                    dbg.location(29,16);
                    pushFollow(FOLLOW_arith_expr_in_base_statement130);
                    e=arith_expr();

                    state._fsp--;

                    dbg.location(29,49);
                     value = new AssignStatement(ID1.getText(), e); 

                    }
                    break;
                case 2 :
                    dbg.enterAlt(2);

                    // /Users/lesyk/Dropbox/Universities/02141 Computer Science Modelling/mandatory assignment 2/while_language/parsing/WhileLanguage.g:30:7: ( 'if' c= bool_expr 'then' s1= base_statement 'else' s2= base_statement | 'while' c= bool_expr 'do' s1= base_statement )
                    {
                    dbg.location(30,7);
                    // /Users/lesyk/Dropbox/Universities/02141 Computer Science Modelling/mandatory assignment 2/while_language/parsing/WhileLanguage.g:30:7: ( 'if' c= bool_expr 'then' s1= base_statement 'else' s2= base_statement | 'while' c= bool_expr 'do' s1= base_statement )
                    int alt2=2;
                    try { dbg.enterSubRule(2);
                    try { dbg.enterDecision(2, decisionCanBacktrack[2]);

                    int LA2_0 = input.LA(1);

                    if ( (LA2_0==9) ) {
                        alt2=1;
                    }
                    else if ( (LA2_0==12) ) {
                        alt2=2;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 2, 0, input);

                        dbg.recognitionException(nvae);
                        throw nvae;
                    }
                    } finally {dbg.exitDecision(2);}

                    switch (alt2) {
                        case 1 :
                            dbg.enterAlt(1);

                            // /Users/lesyk/Dropbox/Universities/02141 Computer Science Modelling/mandatory assignment 2/while_language/parsing/WhileLanguage.g:30:8: 'if' c= bool_expr 'then' s1= base_statement 'else' s2= base_statement
                            {
                            dbg.location(30,8);
                            match(input,9,FOLLOW_9_in_base_statement162); 
                            dbg.location(30,14);
                            pushFollow(FOLLOW_bool_expr_in_base_statement166);
                            c=bool_expr();

                            state._fsp--;

                            dbg.location(30,25);
                            match(input,10,FOLLOW_10_in_base_statement168); 
                            dbg.location(30,34);
                            pushFollow(FOLLOW_base_statement_in_base_statement172);
                            s1=base_statement();

                            state._fsp--;

                            dbg.location(31,7);
                            match(input,11,FOLLOW_11_in_base_statement180); 
                            dbg.location(31,16);
                            pushFollow(FOLLOW_base_statement_in_base_statement184);
                            s2=base_statement();

                            state._fsp--;

                            dbg.location(31,49);
                             value = new IfStatement(c,s1,s2); 

                            }
                            break;
                        case 2 :
                            dbg.enterAlt(2);

                            // /Users/lesyk/Dropbox/Universities/02141 Computer Science Modelling/mandatory assignment 2/while_language/parsing/WhileLanguage.g:32:9: 'while' c= bool_expr 'do' s1= base_statement
                            {
                            dbg.location(32,9);
                            match(input,12,FOLLOW_12_in_base_statement213); 
                            dbg.location(32,18);
                            pushFollow(FOLLOW_bool_expr_in_base_statement217);
                            c=bool_expr();

                            state._fsp--;

                            dbg.location(32,29);
                            match(input,13,FOLLOW_13_in_base_statement219); 
                            dbg.location(32,36);
                            pushFollow(FOLLOW_base_statement_in_base_statement223);
                            s1=base_statement();

                            state._fsp--;

                            dbg.location(32,52);
                             value = new WhileStatement(c,s1); 

                            }
                            break;

                    }
                    } finally {dbg.exitSubRule(2);}


                    }
                    break;
                case 3 :
                    dbg.enterAlt(3);

                    // /Users/lesyk/Dropbox/Universities/02141 Computer Science Modelling/mandatory assignment 2/while_language/parsing/WhileLanguage.g:33:7: '{' s= statement '}'
                    {
                    dbg.location(33,7);
                    match(input,14,FOLLOW_14_in_base_statement234); 
                    dbg.location(33,12);
                    pushFollow(FOLLOW_statement_in_base_statement238);
                    s=statement();

                    state._fsp--;

                    dbg.location(33,23);
                    match(input,15,FOLLOW_15_in_base_statement240); 
                    dbg.location(33,49);
                     value = s; 

                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        dbg.location(34, 5);

        }
        finally {
            dbg.exitRule(getGrammarFileName(), "base_statement");
            decRuleLevel();
            if ( getRuleLevel()==0 ) {dbg.terminate();}
        }

        return value;
    }
    // $ANTLR end "base_statement"


    // $ANTLR start "bool_expr"
    // /Users/lesyk/Dropbox/Universities/02141 Computer Science Modelling/mandatory assignment 2/while_language/parsing/WhileLanguage.g:36:1: bool_expr returns [BoolExpr value] : e= literal ( '&&' e= literal )* ;
    public final BoolExpr bool_expr() throws RecognitionException {
        BoolExpr value = null;

        BoolExpr e = null;


        try { dbg.enterRule(getGrammarFileName(), "bool_expr");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(36, 1);

        try {
            // /Users/lesyk/Dropbox/Universities/02141 Computer Science Modelling/mandatory assignment 2/while_language/parsing/WhileLanguage.g:37:5: (e= literal ( '&&' e= literal )* )
            dbg.enterAlt(1);

            // /Users/lesyk/Dropbox/Universities/02141 Computer Science Modelling/mandatory assignment 2/while_language/parsing/WhileLanguage.g:37:7: e= literal ( '&&' e= literal )*
            {
            dbg.location(37,8);
            pushFollow(FOLLOW_literal_in_bool_expr287);
            e=literal();

            state._fsp--;

            dbg.location(37,23);
             value = e; 
            dbg.location(38,7);
            // /Users/lesyk/Dropbox/Universities/02141 Computer Science Modelling/mandatory assignment 2/while_language/parsing/WhileLanguage.g:38:7: ( '&&' e= literal )*
            try { dbg.enterSubRule(4);

            loop4:
            do {
                int alt4=2;
                try { dbg.enterDecision(4, decisionCanBacktrack[4]);

                int LA4_0 = input.LA(1);

                if ( (LA4_0==16) ) {
                    alt4=1;
                }


                } finally {dbg.exitDecision(4);}

                switch (alt4) {
            	case 1 :
            	    dbg.enterAlt(1);

            	    // /Users/lesyk/Dropbox/Universities/02141 Computer Science Modelling/mandatory assignment 2/while_language/parsing/WhileLanguage.g:38:9: '&&' e= literal
            	    {
            	    dbg.location(38,9);
            	    match(input,16,FOLLOW_16_in_bool_expr305); 
            	    dbg.location(38,15);
            	    pushFollow(FOLLOW_literal_in_bool_expr309);
            	    e=literal();

            	    state._fsp--;

            	    dbg.location(38,24);
            	     value = new AndExpr(value,e); 

            	    }
            	    break;

            	default :
            	    break loop4;
                }
            } while (true);
            } finally {dbg.exitSubRule(4);}


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        dbg.location(39, 5);

        }
        finally {
            dbg.exitRule(getGrammarFileName(), "bool_expr");
            decRuleLevel();
            if ( getRuleLevel()==0 ) {dbg.terminate();}
        }

        return value;
    }
    // $ANTLR end "bool_expr"


    // $ANTLR start "literal"
    // /Users/lesyk/Dropbox/Universities/02141 Computer Science Modelling/mandatory assignment 2/while_language/parsing/WhileLanguage.g:41:1: literal returns [BoolExpr value] : ( 'true' | 'false' | (e1= arith_expr '=' e2= arith_expr | e1= arith_expr '<=' e2= arith_expr | e1= arith_expr '>=' e2= arith_expr | e1= arith_expr '!=' e2= arith_expr ) | '!' e= literal );
    public final BoolExpr literal() throws RecognitionException {
        BoolExpr value = null;

        ArithExpr e1 = null;

        ArithExpr e2 = null;

        BoolExpr e = null;


        try { dbg.enterRule(getGrammarFileName(), "literal");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(41, 1);

        try {
            // /Users/lesyk/Dropbox/Universities/02141 Computer Science Modelling/mandatory assignment 2/while_language/parsing/WhileLanguage.g:42:5: ( 'true' | 'false' | (e1= arith_expr '=' e2= arith_expr | e1= arith_expr '<=' e2= arith_expr | e1= arith_expr '>=' e2= arith_expr | e1= arith_expr '!=' e2= arith_expr ) | '!' e= literal )
            int alt6=4;
            try { dbg.enterDecision(6, decisionCanBacktrack[6]);

            switch ( input.LA(1) ) {
            case 17:
                {
                alt6=1;
                }
                break;
            case 18:
                {
                alt6=2;
                }
                break;
            case ID:
            case NUM:
                {
                alt6=3;
                }
                break;
            case 23:
                {
                alt6=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 6, 0, input);

                dbg.recognitionException(nvae);
                throw nvae;
            }

            } finally {dbg.exitDecision(6);}

            switch (alt6) {
                case 1 :
                    dbg.enterAlt(1);

                    // /Users/lesyk/Dropbox/Universities/02141 Computer Science Modelling/mandatory assignment 2/while_language/parsing/WhileLanguage.g:42:7: 'true'
                    {
                    dbg.location(42,7);
                    match(input,17,FOLLOW_17_in_literal335); 
                    dbg.location(42,42);
                     value = new BoolValueExpr(true); 

                    }
                    break;
                case 2 :
                    dbg.enterAlt(2);

                    // /Users/lesyk/Dropbox/Universities/02141 Computer Science Modelling/mandatory assignment 2/while_language/parsing/WhileLanguage.g:43:7: 'false'
                    {
                    dbg.location(43,7);
                    match(input,18,FOLLOW_18_in_literal373); 
                    dbg.location(43,42);
                     value = new BoolValueExpr(false); 

                    }
                    break;
                case 3 :
                    dbg.enterAlt(3);

                    // /Users/lesyk/Dropbox/Universities/02141 Computer Science Modelling/mandatory assignment 2/while_language/parsing/WhileLanguage.g:44:7: (e1= arith_expr '=' e2= arith_expr | e1= arith_expr '<=' e2= arith_expr | e1= arith_expr '>=' e2= arith_expr | e1= arith_expr '!=' e2= arith_expr )
                    {
                    dbg.location(44,7);
                    // /Users/lesyk/Dropbox/Universities/02141 Computer Science Modelling/mandatory assignment 2/while_language/parsing/WhileLanguage.g:44:7: (e1= arith_expr '=' e2= arith_expr | e1= arith_expr '<=' e2= arith_expr | e1= arith_expr '>=' e2= arith_expr | e1= arith_expr '!=' e2= arith_expr )
                    int alt5=4;
                    try { dbg.enterSubRule(5);
                    try { dbg.enterDecision(5, decisionCanBacktrack[5]);

                    try {
                        isCyclicDecision = true;
                        alt5 = dfa5.predict(input);
                    }
                    catch (NoViableAltException nvae) {
                        dbg.recognitionException(nvae);
                        throw nvae;
                    }
                    } finally {dbg.exitDecision(5);}

                    switch (alt5) {
                        case 1 :
                            dbg.enterAlt(1);

                            // /Users/lesyk/Dropbox/Universities/02141 Computer Science Modelling/mandatory assignment 2/while_language/parsing/WhileLanguage.g:44:8: e1= arith_expr '=' e2= arith_expr
                            {
                            dbg.location(44,10);
                            pushFollow(FOLLOW_arith_expr_in_literal413);
                            e1=arith_expr();

                            state._fsp--;

                            dbg.location(44,22);
                            match(input,19,FOLLOW_19_in_literal415); 
                            dbg.location(44,28);
                            pushFollow(FOLLOW_arith_expr_in_literal419);
                            e2=arith_expr();

                            state._fsp--;

                            dbg.location(44,42);
                             value = new ComparisonExpr(e1,e2, 1); 

                            }
                            break;
                        case 2 :
                            dbg.enterAlt(2);

                            // /Users/lesyk/Dropbox/Universities/02141 Computer Science Modelling/mandatory assignment 2/while_language/parsing/WhileLanguage.g:45:8: e1= arith_expr '<=' e2= arith_expr
                            {
                            dbg.location(45,10);
                            pushFollow(FOLLOW_arith_expr_in_literal434);
                            e1=arith_expr();

                            state._fsp--;

                            dbg.location(45,22);
                            match(input,20,FOLLOW_20_in_literal436); 
                            dbg.location(45,29);
                            pushFollow(FOLLOW_arith_expr_in_literal440);
                            e2=arith_expr();

                            state._fsp--;

                            dbg.location(45,42);
                             value = new ComparisonExpr(e1,e2, 2); 

                            }
                            break;
                        case 3 :
                            dbg.enterAlt(3);

                            // /Users/lesyk/Dropbox/Universities/02141 Computer Science Modelling/mandatory assignment 2/while_language/parsing/WhileLanguage.g:46:8: e1= arith_expr '>=' e2= arith_expr
                            {
                            dbg.location(46,10);
                            pushFollow(FOLLOW_arith_expr_in_literal454);
                            e1=arith_expr();

                            state._fsp--;

                            dbg.location(46,22);
                            match(input,21,FOLLOW_21_in_literal456); 
                            dbg.location(46,29);
                            pushFollow(FOLLOW_arith_expr_in_literal460);
                            e2=arith_expr();

                            state._fsp--;

                            dbg.location(46,42);
                             value = new ComparisonExpr(e1,e2, 3); 

                            }
                            break;
                        case 4 :
                            dbg.enterAlt(4);

                            // /Users/lesyk/Dropbox/Universities/02141 Computer Science Modelling/mandatory assignment 2/while_language/parsing/WhileLanguage.g:47:8: e1= arith_expr '!=' e2= arith_expr
                            {
                            dbg.location(47,10);
                            pushFollow(FOLLOW_arith_expr_in_literal474);
                            e1=arith_expr();

                            state._fsp--;

                            dbg.location(47,22);
                            match(input,22,FOLLOW_22_in_literal476); 
                            dbg.location(47,29);
                            pushFollow(FOLLOW_arith_expr_in_literal480);
                            e2=arith_expr();

                            state._fsp--;

                            dbg.location(47,42);
                             value = new ComparisonExpr(e1,e2, 4); 

                            }
                            break;

                    }
                    } finally {dbg.exitSubRule(5);}


                    }
                    break;
                case 4 :
                    dbg.enterAlt(4);

                    // /Users/lesyk/Dropbox/Universities/02141 Computer Science Modelling/mandatory assignment 2/while_language/parsing/WhileLanguage.g:48:7: '!' e= literal
                    {
                    dbg.location(48,7);
                    match(input,23,FOLLOW_23_in_literal492); 
                    dbg.location(48,12);
                    pushFollow(FOLLOW_literal_in_literal496);
                    e=literal();

                    state._fsp--;

                    dbg.location(48,21);
                     value = new NotExpr(e); 

                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        dbg.location(49, 5);

        }
        finally {
            dbg.exitRule(getGrammarFileName(), "literal");
            decRuleLevel();
            if ( getRuleLevel()==0 ) {dbg.terminate();}
        }

        return value;
    }
    // $ANTLR end "literal"


    // $ANTLR start "arith_expr"
    // /Users/lesyk/Dropbox/Universities/02141 Computer Science Modelling/mandatory assignment 2/while_language/parsing/WhileLanguage.g:51:1: arith_expr returns [ArithExpr value] : e= mult_arith_expr ( '+' e= mult_arith_expr | '-' e= mult_arith_expr )* ;
    public final ArithExpr arith_expr() throws RecognitionException {
        ArithExpr value = null;

        ArithExpr e = null;


        try { dbg.enterRule(getGrammarFileName(), "arith_expr");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(51, 1);

        try {
            // /Users/lesyk/Dropbox/Universities/02141 Computer Science Modelling/mandatory assignment 2/while_language/parsing/WhileLanguage.g:52:5: (e= mult_arith_expr ( '+' e= mult_arith_expr | '-' e= mult_arith_expr )* )
            dbg.enterAlt(1);

            // /Users/lesyk/Dropbox/Universities/02141 Computer Science Modelling/mandatory assignment 2/while_language/parsing/WhileLanguage.g:52:7: e= mult_arith_expr ( '+' e= mult_arith_expr | '-' e= mult_arith_expr )*
            {
            dbg.location(52,8);
            pushFollow(FOLLOW_mult_arith_expr_in_arith_expr521);
            e=mult_arith_expr();

            state._fsp--;

            dbg.location(52,31);
             value = e; 
            dbg.location(53,7);
            // /Users/lesyk/Dropbox/Universities/02141 Computer Science Modelling/mandatory assignment 2/while_language/parsing/WhileLanguage.g:53:7: ( '+' e= mult_arith_expr | '-' e= mult_arith_expr )*
            try { dbg.enterSubRule(7);

            loop7:
            do {
                int alt7=3;
                try { dbg.enterDecision(7, decisionCanBacktrack[7]);

                int LA7_0 = input.LA(1);

                if ( (LA7_0==24) ) {
                    alt7=1;
                }
                else if ( (LA7_0==25) ) {
                    alt7=2;
                }


                } finally {dbg.exitDecision(7);}

                switch (alt7) {
            	case 1 :
            	    dbg.enterAlt(1);

            	    // /Users/lesyk/Dropbox/Universities/02141 Computer Science Modelling/mandatory assignment 2/while_language/parsing/WhileLanguage.g:53:9: '+' e= mult_arith_expr
            	    {
            	    dbg.location(53,9);
            	    match(input,24,FOLLOW_24_in_arith_expr539); 
            	    dbg.location(53,14);
            	    pushFollow(FOLLOW_mult_arith_expr_in_arith_expr543);
            	    e=mult_arith_expr();

            	    state._fsp--;

            	    dbg.location(53,31);
            	     value = new PlusExpr(value,e); 

            	    }
            	    break;
            	case 2 :
            	    dbg.enterAlt(2);

            	    // /Users/lesyk/Dropbox/Universities/02141 Computer Science Modelling/mandatory assignment 2/while_language/parsing/WhileLanguage.g:54:9: '-' e= mult_arith_expr
            	    {
            	    dbg.location(54,9);
            	    match(input,25,FOLLOW_25_in_arith_expr556); 
            	    dbg.location(54,14);
            	    pushFollow(FOLLOW_mult_arith_expr_in_arith_expr560);
            	    e=mult_arith_expr();

            	    state._fsp--;

            	    dbg.location(54,31);
            	     value = new MinusExpr(value,e); 

            	    }
            	    break;

            	default :
            	    break loop7;
                }
            } while (true);
            } finally {dbg.exitSubRule(7);}


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        dbg.location(55, 5);

        }
        finally {
            dbg.exitRule(getGrammarFileName(), "arith_expr");
            decRuleLevel();
            if ( getRuleLevel()==0 ) {dbg.terminate();}
        }

        return value;
    }
    // $ANTLR end "arith_expr"


    // $ANTLR start "mult_arith_expr"
    // /Users/lesyk/Dropbox/Universities/02141 Computer Science Modelling/mandatory assignment 2/while_language/parsing/WhileLanguage.g:57:1: mult_arith_expr returns [ArithExpr value] : e= base_arith_expr ( '*' e= base_arith_expr )* ;
    public final ArithExpr mult_arith_expr() throws RecognitionException {
        ArithExpr value = null;

        ArithExpr e = null;


        try { dbg.enterRule(getGrammarFileName(), "mult_arith_expr");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(57, 1);

        try {
            // /Users/lesyk/Dropbox/Universities/02141 Computer Science Modelling/mandatory assignment 2/while_language/parsing/WhileLanguage.g:58:5: (e= base_arith_expr ( '*' e= base_arith_expr )* )
            dbg.enterAlt(1);

            // /Users/lesyk/Dropbox/Universities/02141 Computer Science Modelling/mandatory assignment 2/while_language/parsing/WhileLanguage.g:58:7: e= base_arith_expr ( '*' e= base_arith_expr )*
            {
            dbg.location(58,8);
            pushFollow(FOLLOW_base_arith_expr_in_mult_arith_expr588);
            e=base_arith_expr();

            state._fsp--;

            dbg.location(58,31);
             value = e; 
            dbg.location(59,7);
            // /Users/lesyk/Dropbox/Universities/02141 Computer Science Modelling/mandatory assignment 2/while_language/parsing/WhileLanguage.g:59:7: ( '*' e= base_arith_expr )*
            try { dbg.enterSubRule(8);

            loop8:
            do {
                int alt8=2;
                try { dbg.enterDecision(8, decisionCanBacktrack[8]);

                int LA8_0 = input.LA(1);

                if ( (LA8_0==26) ) {
                    alt8=1;
                }


                } finally {dbg.exitDecision(8);}

                switch (alt8) {
            	case 1 :
            	    dbg.enterAlt(1);

            	    // /Users/lesyk/Dropbox/Universities/02141 Computer Science Modelling/mandatory assignment 2/while_language/parsing/WhileLanguage.g:59:9: '*' e= base_arith_expr
            	    {
            	    dbg.location(59,9);
            	    match(input,26,FOLLOW_26_in_mult_arith_expr606); 
            	    dbg.location(59,14);
            	    pushFollow(FOLLOW_base_arith_expr_in_mult_arith_expr610);
            	    e=base_arith_expr();

            	    state._fsp--;

            	    dbg.location(59,31);
            	     value = new MultExpr(value,e); 

            	    }
            	    break;

            	default :
            	    break loop8;
                }
            } while (true);
            } finally {dbg.exitSubRule(8);}


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        dbg.location(60, 5);

        }
        finally {
            dbg.exitRule(getGrammarFileName(), "mult_arith_expr");
            decRuleLevel();
            if ( getRuleLevel()==0 ) {dbg.terminate();}
        }

        return value;
    }
    // $ANTLR end "mult_arith_expr"


    // $ANTLR start "base_arith_expr"
    // /Users/lesyk/Dropbox/Universities/02141 Computer Science Modelling/mandatory assignment 2/while_language/parsing/WhileLanguage.g:62:1: base_arith_expr returns [ArithExpr value] : ( NUM | ID );
    public final ArithExpr base_arith_expr() throws RecognitionException {
        ArithExpr value = null;

        Token NUM2=null;
        Token ID3=null;

        try { dbg.enterRule(getGrammarFileName(), "base_arith_expr");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(62, 1);

        try {
            // /Users/lesyk/Dropbox/Universities/02141 Computer Science Modelling/mandatory assignment 2/while_language/parsing/WhileLanguage.g:63:5: ( NUM | ID )
            int alt9=2;
            try { dbg.enterDecision(9, decisionCanBacktrack[9]);

            int LA9_0 = input.LA(1);

            if ( (LA9_0==NUM) ) {
                alt9=1;
            }
            else if ( (LA9_0==ID) ) {
                alt9=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 9, 0, input);

                dbg.recognitionException(nvae);
                throw nvae;
            }
            } finally {dbg.exitDecision(9);}

            switch (alt9) {
                case 1 :
                    dbg.enterAlt(1);

                    // /Users/lesyk/Dropbox/Universities/02141 Computer Science Modelling/mandatory assignment 2/while_language/parsing/WhileLanguage.g:63:7: NUM
                    {
                    dbg.location(63,7);
                    NUM2=(Token)match(input,NUM,FOLLOW_NUM_in_base_arith_expr636); 
                    dbg.location(63,11);
                     value = new NumExpr(Integer.parseInt(NUM2.getText())); 

                    }
                    break;
                case 2 :
                    dbg.enterAlt(2);

                    // /Users/lesyk/Dropbox/Universities/02141 Computer Science Modelling/mandatory assignment 2/while_language/parsing/WhileLanguage.g:64:7: ID
                    {
                    dbg.location(64,7);
                    ID3=(Token)match(input,ID,FOLLOW_ID_in_base_arith_expr646); 
                    dbg.location(64,11);
                     value = new IdExpr(ID3.getText()); 

                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        dbg.location(65, 5);

        }
        finally {
            dbg.exitRule(getGrammarFileName(), "base_arith_expr");
            decRuleLevel();
            if ( getRuleLevel()==0 ) {dbg.terminate();}
        }

        return value;
    }
    // $ANTLR end "base_arith_expr"

    // Delegated rules


    protected DFA5 dfa5 = new DFA5(this);
    static final String DFA5_eotS =
        "\26\uffff";
    static final String DFA5_eofS =
        "\26\uffff";
    static final String DFA5_minS =
        "\1\4\2\23\3\4\4\uffff\6\23\2\4\4\23";
    static final String DFA5_maxS =
        "\1\5\2\32\3\5\4\uffff\6\32\2\5\4\32";
    static final String DFA5_acceptS =
        "\6\uffff\1\1\1\2\1\3\1\4\14\uffff";
    static final String DFA5_specialS =
        "\26\uffff}>";
    static final String[] DFA5_transitionS = {
            "\1\2\1\1",
            "\1\6\1\7\1\10\1\11\1\uffff\1\4\1\5\1\3",
            "\1\6\1\7\1\10\1\11\1\uffff\1\4\1\5\1\3",
            "\1\13\1\12",
            "\1\15\1\14",
            "\1\17\1\16",
            "",
            "",
            "",
            "",
            "\1\6\1\7\1\10\1\11\1\uffff\1\4\1\5\1\3",
            "\1\6\1\7\1\10\1\11\1\uffff\1\4\1\5\1\3",
            "\1\6\1\7\1\10\1\11\1\uffff\1\4\1\5\1\20",
            "\1\6\1\7\1\10\1\11\1\uffff\1\4\1\5\1\20",
            "\1\6\1\7\1\10\1\11\1\uffff\1\4\1\5\1\21",
            "\1\6\1\7\1\10\1\11\1\uffff\1\4\1\5\1\21",
            "\1\23\1\22",
            "\1\25\1\24",
            "\1\6\1\7\1\10\1\11\1\uffff\1\4\1\5\1\20",
            "\1\6\1\7\1\10\1\11\1\uffff\1\4\1\5\1\20",
            "\1\6\1\7\1\10\1\11\1\uffff\1\4\1\5\1\21",
            "\1\6\1\7\1\10\1\11\1\uffff\1\4\1\5\1\21"
    };

    static final short[] DFA5_eot = DFA.unpackEncodedString(DFA5_eotS);
    static final short[] DFA5_eof = DFA.unpackEncodedString(DFA5_eofS);
    static final char[] DFA5_min = DFA.unpackEncodedStringToUnsignedChars(DFA5_minS);
    static final char[] DFA5_max = DFA.unpackEncodedStringToUnsignedChars(DFA5_maxS);
    static final short[] DFA5_accept = DFA.unpackEncodedString(DFA5_acceptS);
    static final short[] DFA5_special = DFA.unpackEncodedString(DFA5_specialS);
    static final short[][] DFA5_transition;

    static {
        int numStates = DFA5_transitionS.length;
        DFA5_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA5_transition[i] = DFA.unpackEncodedString(DFA5_transitionS[i]);
        }
    }

    class DFA5 extends DFA {

        public DFA5(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 5;
            this.eot = DFA5_eot;
            this.eof = DFA5_eof;
            this.min = DFA5_min;
            this.max = DFA5_max;
            this.accept = DFA5_accept;
            this.special = DFA5_special;
            this.transition = DFA5_transition;
        }
        public String getDescription() {
            return "44:7: (e1= arith_expr '=' e2= arith_expr | e1= arith_expr '<=' e2= arith_expr | e1= arith_expr '>=' e2= arith_expr | e1= arith_expr '!=' e2= arith_expr )";
        }
        public void error(NoViableAltException nvae) {
            dbg.recognitionException(nvae);
        }
    }
 

    public static final BitSet FOLLOW_statement_in_program49 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_program51 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_base_statement_in_statement76 = new BitSet(new long[]{0x0000000000000082L});
    public static final BitSet FOLLOW_7_in_statement94 = new BitSet(new long[]{0x0000000000005210L});
    public static final BitSet FOLLOW_base_statement_in_statement98 = new BitSet(new long[]{0x0000000000000082L});
    public static final BitSet FOLLOW_ID_in_base_statement124 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_8_in_base_statement126 = new BitSet(new long[]{0x0000000000000030L});
    public static final BitSet FOLLOW_arith_expr_in_base_statement130 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_9_in_base_statement162 = new BitSet(new long[]{0x0000000000860030L});
    public static final BitSet FOLLOW_bool_expr_in_base_statement166 = new BitSet(new long[]{0x0000000000000400L});
    public static final BitSet FOLLOW_10_in_base_statement168 = new BitSet(new long[]{0x0000000000005210L});
    public static final BitSet FOLLOW_base_statement_in_base_statement172 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_11_in_base_statement180 = new BitSet(new long[]{0x0000000000005210L});
    public static final BitSet FOLLOW_base_statement_in_base_statement184 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_12_in_base_statement213 = new BitSet(new long[]{0x0000000000860030L});
    public static final BitSet FOLLOW_bool_expr_in_base_statement217 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_13_in_base_statement219 = new BitSet(new long[]{0x0000000000005210L});
    public static final BitSet FOLLOW_base_statement_in_base_statement223 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_14_in_base_statement234 = new BitSet(new long[]{0x0000000000005210L});
    public static final BitSet FOLLOW_statement_in_base_statement238 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_15_in_base_statement240 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_literal_in_bool_expr287 = new BitSet(new long[]{0x0000000000010002L});
    public static final BitSet FOLLOW_16_in_bool_expr305 = new BitSet(new long[]{0x0000000000860030L});
    public static final BitSet FOLLOW_literal_in_bool_expr309 = new BitSet(new long[]{0x0000000000010002L});
    public static final BitSet FOLLOW_17_in_literal335 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_18_in_literal373 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_arith_expr_in_literal413 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_19_in_literal415 = new BitSet(new long[]{0x0000000000000030L});
    public static final BitSet FOLLOW_arith_expr_in_literal419 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_arith_expr_in_literal434 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_20_in_literal436 = new BitSet(new long[]{0x0000000000000030L});
    public static final BitSet FOLLOW_arith_expr_in_literal440 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_arith_expr_in_literal454 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_21_in_literal456 = new BitSet(new long[]{0x0000000000000030L});
    public static final BitSet FOLLOW_arith_expr_in_literal460 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_arith_expr_in_literal474 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_22_in_literal476 = new BitSet(new long[]{0x0000000000000030L});
    public static final BitSet FOLLOW_arith_expr_in_literal480 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_23_in_literal492 = new BitSet(new long[]{0x0000000000860030L});
    public static final BitSet FOLLOW_literal_in_literal496 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_mult_arith_expr_in_arith_expr521 = new BitSet(new long[]{0x0000000003000002L});
    public static final BitSet FOLLOW_24_in_arith_expr539 = new BitSet(new long[]{0x0000000000000030L});
    public static final BitSet FOLLOW_mult_arith_expr_in_arith_expr543 = new BitSet(new long[]{0x0000000003000002L});
    public static final BitSet FOLLOW_25_in_arith_expr556 = new BitSet(new long[]{0x0000000000000030L});
    public static final BitSet FOLLOW_mult_arith_expr_in_arith_expr560 = new BitSet(new long[]{0x0000000003000002L});
    public static final BitSet FOLLOW_base_arith_expr_in_mult_arith_expr588 = new BitSet(new long[]{0x0000000004000002L});
    public static final BitSet FOLLOW_26_in_mult_arith_expr606 = new BitSet(new long[]{0x0000000000000030L});
    public static final BitSet FOLLOW_base_arith_expr_in_mult_arith_expr610 = new BitSet(new long[]{0x0000000004000002L});
    public static final BitSet FOLLOW_NUM_in_base_arith_expr636 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ID_in_base_arith_expr646 = new BitSet(new long[]{0x0000000000000002L});

}