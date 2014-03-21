// $ANTLR 3.3 Nov 30, 2010 12:45:30 /Users/lesyk/Dropbox/Universities/02141 Computer Science Modelling/mandatory assignment 2/while_language/parsing/WhileLanguage.g 2014-03-21 16:47:15

package while_language.parsing;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

public class WhileLanguageLexer extends Lexer {
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

    public WhileLanguageLexer() {;} 
    public WhileLanguageLexer(CharStream input) {
        this(input, new RecognizerSharedState());
    }
    public WhileLanguageLexer(CharStream input, RecognizerSharedState state) {
        super(input,state);

    }
    public String getGrammarFileName() { return "/Users/lesyk/Dropbox/Universities/02141 Computer Science Modelling/mandatory assignment 2/while_language/parsing/WhileLanguage.g"; }

    // $ANTLR start "T__7"
    public final void mT__7() throws RecognitionException {
        try {
            int _type = T__7;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/lesyk/Dropbox/Universities/02141 Computer Science Modelling/mandatory assignment 2/while_language/parsing/WhileLanguage.g:12:6: ( ';' )
            // /Users/lesyk/Dropbox/Universities/02141 Computer Science Modelling/mandatory assignment 2/while_language/parsing/WhileLanguage.g:12:8: ';'
            {
            match(';'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__7"

    // $ANTLR start "T__8"
    public final void mT__8() throws RecognitionException {
        try {
            int _type = T__8;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/lesyk/Dropbox/Universities/02141 Computer Science Modelling/mandatory assignment 2/while_language/parsing/WhileLanguage.g:13:6: ( ':=' )
            // /Users/lesyk/Dropbox/Universities/02141 Computer Science Modelling/mandatory assignment 2/while_language/parsing/WhileLanguage.g:13:8: ':='
            {
            match(":="); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__8"

    // $ANTLR start "T__9"
    public final void mT__9() throws RecognitionException {
        try {
            int _type = T__9;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/lesyk/Dropbox/Universities/02141 Computer Science Modelling/mandatory assignment 2/while_language/parsing/WhileLanguage.g:14:6: ( 'if' )
            // /Users/lesyk/Dropbox/Universities/02141 Computer Science Modelling/mandatory assignment 2/while_language/parsing/WhileLanguage.g:14:8: 'if'
            {
            match("if"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__9"

    // $ANTLR start "T__10"
    public final void mT__10() throws RecognitionException {
        try {
            int _type = T__10;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/lesyk/Dropbox/Universities/02141 Computer Science Modelling/mandatory assignment 2/while_language/parsing/WhileLanguage.g:15:7: ( 'then' )
            // /Users/lesyk/Dropbox/Universities/02141 Computer Science Modelling/mandatory assignment 2/while_language/parsing/WhileLanguage.g:15:9: 'then'
            {
            match("then"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__10"

    // $ANTLR start "T__11"
    public final void mT__11() throws RecognitionException {
        try {
            int _type = T__11;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/lesyk/Dropbox/Universities/02141 Computer Science Modelling/mandatory assignment 2/while_language/parsing/WhileLanguage.g:16:7: ( 'else' )
            // /Users/lesyk/Dropbox/Universities/02141 Computer Science Modelling/mandatory assignment 2/while_language/parsing/WhileLanguage.g:16:9: 'else'
            {
            match("else"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__11"

    // $ANTLR start "T__12"
    public final void mT__12() throws RecognitionException {
        try {
            int _type = T__12;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/lesyk/Dropbox/Universities/02141 Computer Science Modelling/mandatory assignment 2/while_language/parsing/WhileLanguage.g:17:7: ( 'while' )
            // /Users/lesyk/Dropbox/Universities/02141 Computer Science Modelling/mandatory assignment 2/while_language/parsing/WhileLanguage.g:17:9: 'while'
            {
            match("while"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__12"

    // $ANTLR start "T__13"
    public final void mT__13() throws RecognitionException {
        try {
            int _type = T__13;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/lesyk/Dropbox/Universities/02141 Computer Science Modelling/mandatory assignment 2/while_language/parsing/WhileLanguage.g:18:7: ( 'do' )
            // /Users/lesyk/Dropbox/Universities/02141 Computer Science Modelling/mandatory assignment 2/while_language/parsing/WhileLanguage.g:18:9: 'do'
            {
            match("do"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__13"

    // $ANTLR start "T__14"
    public final void mT__14() throws RecognitionException {
        try {
            int _type = T__14;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/lesyk/Dropbox/Universities/02141 Computer Science Modelling/mandatory assignment 2/while_language/parsing/WhileLanguage.g:19:7: ( '{' )
            // /Users/lesyk/Dropbox/Universities/02141 Computer Science Modelling/mandatory assignment 2/while_language/parsing/WhileLanguage.g:19:9: '{'
            {
            match('{'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__14"

    // $ANTLR start "T__15"
    public final void mT__15() throws RecognitionException {
        try {
            int _type = T__15;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/lesyk/Dropbox/Universities/02141 Computer Science Modelling/mandatory assignment 2/while_language/parsing/WhileLanguage.g:20:7: ( '}' )
            // /Users/lesyk/Dropbox/Universities/02141 Computer Science Modelling/mandatory assignment 2/while_language/parsing/WhileLanguage.g:20:9: '}'
            {
            match('}'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__15"

    // $ANTLR start "T__16"
    public final void mT__16() throws RecognitionException {
        try {
            int _type = T__16;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/lesyk/Dropbox/Universities/02141 Computer Science Modelling/mandatory assignment 2/while_language/parsing/WhileLanguage.g:21:7: ( '&&' )
            // /Users/lesyk/Dropbox/Universities/02141 Computer Science Modelling/mandatory assignment 2/while_language/parsing/WhileLanguage.g:21:9: '&&'
            {
            match("&&"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__16"

    // $ANTLR start "T__17"
    public final void mT__17() throws RecognitionException {
        try {
            int _type = T__17;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/lesyk/Dropbox/Universities/02141 Computer Science Modelling/mandatory assignment 2/while_language/parsing/WhileLanguage.g:22:7: ( 'true' )
            // /Users/lesyk/Dropbox/Universities/02141 Computer Science Modelling/mandatory assignment 2/while_language/parsing/WhileLanguage.g:22:9: 'true'
            {
            match("true"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__17"

    // $ANTLR start "T__18"
    public final void mT__18() throws RecognitionException {
        try {
            int _type = T__18;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/lesyk/Dropbox/Universities/02141 Computer Science Modelling/mandatory assignment 2/while_language/parsing/WhileLanguage.g:23:7: ( 'false' )
            // /Users/lesyk/Dropbox/Universities/02141 Computer Science Modelling/mandatory assignment 2/while_language/parsing/WhileLanguage.g:23:9: 'false'
            {
            match("false"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__18"

    // $ANTLR start "T__19"
    public final void mT__19() throws RecognitionException {
        try {
            int _type = T__19;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/lesyk/Dropbox/Universities/02141 Computer Science Modelling/mandatory assignment 2/while_language/parsing/WhileLanguage.g:24:7: ( '=' )
            // /Users/lesyk/Dropbox/Universities/02141 Computer Science Modelling/mandatory assignment 2/while_language/parsing/WhileLanguage.g:24:9: '='
            {
            match('='); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__19"

    // $ANTLR start "T__20"
    public final void mT__20() throws RecognitionException {
        try {
            int _type = T__20;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/lesyk/Dropbox/Universities/02141 Computer Science Modelling/mandatory assignment 2/while_language/parsing/WhileLanguage.g:25:7: ( '<=' )
            // /Users/lesyk/Dropbox/Universities/02141 Computer Science Modelling/mandatory assignment 2/while_language/parsing/WhileLanguage.g:25:9: '<='
            {
            match("<="); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__20"

    // $ANTLR start "T__21"
    public final void mT__21() throws RecognitionException {
        try {
            int _type = T__21;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/lesyk/Dropbox/Universities/02141 Computer Science Modelling/mandatory assignment 2/while_language/parsing/WhileLanguage.g:26:7: ( '>=' )
            // /Users/lesyk/Dropbox/Universities/02141 Computer Science Modelling/mandatory assignment 2/while_language/parsing/WhileLanguage.g:26:9: '>='
            {
            match(">="); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__21"

    // $ANTLR start "T__22"
    public final void mT__22() throws RecognitionException {
        try {
            int _type = T__22;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/lesyk/Dropbox/Universities/02141 Computer Science Modelling/mandatory assignment 2/while_language/parsing/WhileLanguage.g:27:7: ( '!=' )
            // /Users/lesyk/Dropbox/Universities/02141 Computer Science Modelling/mandatory assignment 2/while_language/parsing/WhileLanguage.g:27:9: '!='
            {
            match("!="); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__22"

    // $ANTLR start "T__23"
    public final void mT__23() throws RecognitionException {
        try {
            int _type = T__23;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/lesyk/Dropbox/Universities/02141 Computer Science Modelling/mandatory assignment 2/while_language/parsing/WhileLanguage.g:28:7: ( '!' )
            // /Users/lesyk/Dropbox/Universities/02141 Computer Science Modelling/mandatory assignment 2/while_language/parsing/WhileLanguage.g:28:9: '!'
            {
            match('!'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__23"

    // $ANTLR start "T__24"
    public final void mT__24() throws RecognitionException {
        try {
            int _type = T__24;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/lesyk/Dropbox/Universities/02141 Computer Science Modelling/mandatory assignment 2/while_language/parsing/WhileLanguage.g:29:7: ( '+' )
            // /Users/lesyk/Dropbox/Universities/02141 Computer Science Modelling/mandatory assignment 2/while_language/parsing/WhileLanguage.g:29:9: '+'
            {
            match('+'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__24"

    // $ANTLR start "T__25"
    public final void mT__25() throws RecognitionException {
        try {
            int _type = T__25;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/lesyk/Dropbox/Universities/02141 Computer Science Modelling/mandatory assignment 2/while_language/parsing/WhileLanguage.g:30:7: ( '-' )
            // /Users/lesyk/Dropbox/Universities/02141 Computer Science Modelling/mandatory assignment 2/while_language/parsing/WhileLanguage.g:30:9: '-'
            {
            match('-'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__25"

    // $ANTLR start "T__26"
    public final void mT__26() throws RecognitionException {
        try {
            int _type = T__26;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/lesyk/Dropbox/Universities/02141 Computer Science Modelling/mandatory assignment 2/while_language/parsing/WhileLanguage.g:31:7: ( '*' )
            // /Users/lesyk/Dropbox/Universities/02141 Computer Science Modelling/mandatory assignment 2/while_language/parsing/WhileLanguage.g:31:9: '*'
            {
            match('*'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__26"

    // $ANTLR start "NUM"
    public final void mNUM() throws RecognitionException {
        try {
            int _type = NUM;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/lesyk/Dropbox/Universities/02141 Computer Science Modelling/mandatory assignment 2/while_language/parsing/WhileLanguage.g:67:5: ( ( '0' .. '9' )+ )
            // /Users/lesyk/Dropbox/Universities/02141 Computer Science Modelling/mandatory assignment 2/while_language/parsing/WhileLanguage.g:67:7: ( '0' .. '9' )+
            {
            // /Users/lesyk/Dropbox/Universities/02141 Computer Science Modelling/mandatory assignment 2/while_language/parsing/WhileLanguage.g:67:7: ( '0' .. '9' )+
            int cnt1=0;
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( ((LA1_0>='0' && LA1_0<='9')) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // /Users/lesyk/Dropbox/Universities/02141 Computer Science Modelling/mandatory assignment 2/while_language/parsing/WhileLanguage.g:67:7: '0' .. '9'
            	    {
            	    matchRange('0','9'); 

            	    }
            	    break;

            	default :
            	    if ( cnt1 >= 1 ) break loop1;
                        EarlyExitException eee =
                            new EarlyExitException(1, input);
                        throw eee;
                }
                cnt1++;
            } while (true);


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "NUM"

    // $ANTLR start "ID"
    public final void mID() throws RecognitionException {
        try {
            int _type = ID;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/lesyk/Dropbox/Universities/02141 Computer Science Modelling/mandatory assignment 2/while_language/parsing/WhileLanguage.g:68:5: ( ( 'a' .. 'z' | 'A' .. 'Z' ) ( 'a' .. 'z' | 'A' .. 'Z' | '0' .. '9' )* )
            // /Users/lesyk/Dropbox/Universities/02141 Computer Science Modelling/mandatory assignment 2/while_language/parsing/WhileLanguage.g:68:7: ( 'a' .. 'z' | 'A' .. 'Z' ) ( 'a' .. 'z' | 'A' .. 'Z' | '0' .. '9' )*
            {
            if ( (input.LA(1)>='A' && input.LA(1)<='Z')||(input.LA(1)>='a' && input.LA(1)<='z') ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            // /Users/lesyk/Dropbox/Universities/02141 Computer Science Modelling/mandatory assignment 2/while_language/parsing/WhileLanguage.g:68:26: ( 'a' .. 'z' | 'A' .. 'Z' | '0' .. '9' )*
            loop2:
            do {
                int alt2=2;
                int LA2_0 = input.LA(1);

                if ( ((LA2_0>='0' && LA2_0<='9')||(LA2_0>='A' && LA2_0<='Z')||(LA2_0>='a' && LA2_0<='z')) ) {
                    alt2=1;
                }


                switch (alt2) {
            	case 1 :
            	    // /Users/lesyk/Dropbox/Universities/02141 Computer Science Modelling/mandatory assignment 2/while_language/parsing/WhileLanguage.g:
            	    {
            	    if ( (input.LA(1)>='0' && input.LA(1)<='9')||(input.LA(1)>='A' && input.LA(1)<='Z')||(input.LA(1)>='a' && input.LA(1)<='z') ) {
            	        input.consume();

            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        recover(mse);
            	        throw mse;}


            	    }
            	    break;

            	default :
            	    break loop2;
                }
            } while (true);


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "ID"

    // $ANTLR start "WS"
    public final void mWS() throws RecognitionException {
        try {
            int _type = WS;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/lesyk/Dropbox/Universities/02141 Computer Science Modelling/mandatory assignment 2/while_language/parsing/WhileLanguage.g:70:5: ( ( ' ' | '\\t' | '\\r' | '\\n' )+ )
            // /Users/lesyk/Dropbox/Universities/02141 Computer Science Modelling/mandatory assignment 2/while_language/parsing/WhileLanguage.g:70:9: ( ' ' | '\\t' | '\\r' | '\\n' )+
            {
            // /Users/lesyk/Dropbox/Universities/02141 Computer Science Modelling/mandatory assignment 2/while_language/parsing/WhileLanguage.g:70:9: ( ' ' | '\\t' | '\\r' | '\\n' )+
            int cnt3=0;
            loop3:
            do {
                int alt3=2;
                int LA3_0 = input.LA(1);

                if ( ((LA3_0>='\t' && LA3_0<='\n')||LA3_0=='\r'||LA3_0==' ') ) {
                    alt3=1;
                }


                switch (alt3) {
            	case 1 :
            	    // /Users/lesyk/Dropbox/Universities/02141 Computer Science Modelling/mandatory assignment 2/while_language/parsing/WhileLanguage.g:
            	    {
            	    if ( (input.LA(1)>='\t' && input.LA(1)<='\n')||input.LA(1)=='\r'||input.LA(1)==' ' ) {
            	        input.consume();

            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        recover(mse);
            	        throw mse;}


            	    }
            	    break;

            	default :
            	    if ( cnt3 >= 1 ) break loop3;
                        EarlyExitException eee =
                            new EarlyExitException(3, input);
                        throw eee;
                }
                cnt3++;
            } while (true);

             _channel = HIDDEN; 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "WS"

    public void mTokens() throws RecognitionException {
        // /Users/lesyk/Dropbox/Universities/02141 Computer Science Modelling/mandatory assignment 2/while_language/parsing/WhileLanguage.g:1:8: ( T__7 | T__8 | T__9 | T__10 | T__11 | T__12 | T__13 | T__14 | T__15 | T__16 | T__17 | T__18 | T__19 | T__20 | T__21 | T__22 | T__23 | T__24 | T__25 | T__26 | NUM | ID | WS )
        int alt4=23;
        alt4 = dfa4.predict(input);
        switch (alt4) {
            case 1 :
                // /Users/lesyk/Dropbox/Universities/02141 Computer Science Modelling/mandatory assignment 2/while_language/parsing/WhileLanguage.g:1:10: T__7
                {
                mT__7(); 

                }
                break;
            case 2 :
                // /Users/lesyk/Dropbox/Universities/02141 Computer Science Modelling/mandatory assignment 2/while_language/parsing/WhileLanguage.g:1:15: T__8
                {
                mT__8(); 

                }
                break;
            case 3 :
                // /Users/lesyk/Dropbox/Universities/02141 Computer Science Modelling/mandatory assignment 2/while_language/parsing/WhileLanguage.g:1:20: T__9
                {
                mT__9(); 

                }
                break;
            case 4 :
                // /Users/lesyk/Dropbox/Universities/02141 Computer Science Modelling/mandatory assignment 2/while_language/parsing/WhileLanguage.g:1:25: T__10
                {
                mT__10(); 

                }
                break;
            case 5 :
                // /Users/lesyk/Dropbox/Universities/02141 Computer Science Modelling/mandatory assignment 2/while_language/parsing/WhileLanguage.g:1:31: T__11
                {
                mT__11(); 

                }
                break;
            case 6 :
                // /Users/lesyk/Dropbox/Universities/02141 Computer Science Modelling/mandatory assignment 2/while_language/parsing/WhileLanguage.g:1:37: T__12
                {
                mT__12(); 

                }
                break;
            case 7 :
                // /Users/lesyk/Dropbox/Universities/02141 Computer Science Modelling/mandatory assignment 2/while_language/parsing/WhileLanguage.g:1:43: T__13
                {
                mT__13(); 

                }
                break;
            case 8 :
                // /Users/lesyk/Dropbox/Universities/02141 Computer Science Modelling/mandatory assignment 2/while_language/parsing/WhileLanguage.g:1:49: T__14
                {
                mT__14(); 

                }
                break;
            case 9 :
                // /Users/lesyk/Dropbox/Universities/02141 Computer Science Modelling/mandatory assignment 2/while_language/parsing/WhileLanguage.g:1:55: T__15
                {
                mT__15(); 

                }
                break;
            case 10 :
                // /Users/lesyk/Dropbox/Universities/02141 Computer Science Modelling/mandatory assignment 2/while_language/parsing/WhileLanguage.g:1:61: T__16
                {
                mT__16(); 

                }
                break;
            case 11 :
                // /Users/lesyk/Dropbox/Universities/02141 Computer Science Modelling/mandatory assignment 2/while_language/parsing/WhileLanguage.g:1:67: T__17
                {
                mT__17(); 

                }
                break;
            case 12 :
                // /Users/lesyk/Dropbox/Universities/02141 Computer Science Modelling/mandatory assignment 2/while_language/parsing/WhileLanguage.g:1:73: T__18
                {
                mT__18(); 

                }
                break;
            case 13 :
                // /Users/lesyk/Dropbox/Universities/02141 Computer Science Modelling/mandatory assignment 2/while_language/parsing/WhileLanguage.g:1:79: T__19
                {
                mT__19(); 

                }
                break;
            case 14 :
                // /Users/lesyk/Dropbox/Universities/02141 Computer Science Modelling/mandatory assignment 2/while_language/parsing/WhileLanguage.g:1:85: T__20
                {
                mT__20(); 

                }
                break;
            case 15 :
                // /Users/lesyk/Dropbox/Universities/02141 Computer Science Modelling/mandatory assignment 2/while_language/parsing/WhileLanguage.g:1:91: T__21
                {
                mT__21(); 

                }
                break;
            case 16 :
                // /Users/lesyk/Dropbox/Universities/02141 Computer Science Modelling/mandatory assignment 2/while_language/parsing/WhileLanguage.g:1:97: T__22
                {
                mT__22(); 

                }
                break;
            case 17 :
                // /Users/lesyk/Dropbox/Universities/02141 Computer Science Modelling/mandatory assignment 2/while_language/parsing/WhileLanguage.g:1:103: T__23
                {
                mT__23(); 

                }
                break;
            case 18 :
                // /Users/lesyk/Dropbox/Universities/02141 Computer Science Modelling/mandatory assignment 2/while_language/parsing/WhileLanguage.g:1:109: T__24
                {
                mT__24(); 

                }
                break;
            case 19 :
                // /Users/lesyk/Dropbox/Universities/02141 Computer Science Modelling/mandatory assignment 2/while_language/parsing/WhileLanguage.g:1:115: T__25
                {
                mT__25(); 

                }
                break;
            case 20 :
                // /Users/lesyk/Dropbox/Universities/02141 Computer Science Modelling/mandatory assignment 2/while_language/parsing/WhileLanguage.g:1:121: T__26
                {
                mT__26(); 

                }
                break;
            case 21 :
                // /Users/lesyk/Dropbox/Universities/02141 Computer Science Modelling/mandatory assignment 2/while_language/parsing/WhileLanguage.g:1:127: NUM
                {
                mNUM(); 

                }
                break;
            case 22 :
                // /Users/lesyk/Dropbox/Universities/02141 Computer Science Modelling/mandatory assignment 2/while_language/parsing/WhileLanguage.g:1:131: ID
                {
                mID(); 

                }
                break;
            case 23 :
                // /Users/lesyk/Dropbox/Universities/02141 Computer Science Modelling/mandatory assignment 2/while_language/parsing/WhileLanguage.g:1:134: WS
                {
                mWS(); 

                }
                break;

        }

    }


    protected DFA4 dfa4 = new DFA4(this);
    static final String DFA4_eotS =
        "\3\uffff\5\24\3\uffff\1\24\3\uffff\1\36\6\uffff\1\37\4\24\1\44\1"+
        "\24\3\uffff\4\24\1\uffff\1\24\1\53\1\54\1\55\2\24\3\uffff\1\60\1"+
        "\61\2\uffff";
    static final String DFA4_eofS =
        "\62\uffff";
    static final String DFA4_minS =
        "\1\11\2\uffff\1\146\1\150\1\154\1\150\1\157\3\uffff\1\141\3\uffff"+
        "\1\75\6\uffff\1\60\1\145\1\165\1\163\1\151\1\60\1\154\3\uffff\1"+
        "\156\2\145\1\154\1\uffff\1\163\3\60\2\145\3\uffff\2\60\2\uffff";
    static final String DFA4_maxS =
        "\1\175\2\uffff\1\146\1\162\1\154\1\150\1\157\3\uffff\1\141\3\uffff"+
        "\1\75\6\uffff\1\172\1\145\1\165\1\163\1\151\1\172\1\154\3\uffff"+
        "\1\156\2\145\1\154\1\uffff\1\163\3\172\2\145\3\uffff\2\172\2\uffff";
    static final String DFA4_acceptS =
        "\1\uffff\1\1\1\2\5\uffff\1\10\1\11\1\12\1\uffff\1\15\1\16\1\17\1"+
        "\uffff\1\22\1\23\1\24\1\25\1\26\1\27\7\uffff\1\20\1\21\1\3\4\uffff"+
        "\1\7\6\uffff\1\4\1\13\1\5\2\uffff\1\6\1\14";
    static final String DFA4_specialS =
        "\62\uffff}>";
    static final String[] DFA4_transitionS = {
            "\2\25\2\uffff\1\25\22\uffff\1\25\1\17\4\uffff\1\12\3\uffff\1"+
            "\22\1\20\1\uffff\1\21\2\uffff\12\23\1\2\1\1\1\15\1\14\1\16\2"+
            "\uffff\32\24\6\uffff\3\24\1\7\1\5\1\13\2\24\1\3\12\24\1\4\2"+
            "\24\1\6\3\24\1\10\1\uffff\1\11",
            "",
            "",
            "\1\26",
            "\1\27\11\uffff\1\30",
            "\1\31",
            "\1\32",
            "\1\33",
            "",
            "",
            "",
            "\1\34",
            "",
            "",
            "",
            "\1\35",
            "",
            "",
            "",
            "",
            "",
            "",
            "\12\24\7\uffff\32\24\6\uffff\32\24",
            "\1\40",
            "\1\41",
            "\1\42",
            "\1\43",
            "\12\24\7\uffff\32\24\6\uffff\32\24",
            "\1\45",
            "",
            "",
            "",
            "\1\46",
            "\1\47",
            "\1\50",
            "\1\51",
            "",
            "\1\52",
            "\12\24\7\uffff\32\24\6\uffff\32\24",
            "\12\24\7\uffff\32\24\6\uffff\32\24",
            "\12\24\7\uffff\32\24\6\uffff\32\24",
            "\1\56",
            "\1\57",
            "",
            "",
            "",
            "\12\24\7\uffff\32\24\6\uffff\32\24",
            "\12\24\7\uffff\32\24\6\uffff\32\24",
            "",
            ""
    };

    static final short[] DFA4_eot = DFA.unpackEncodedString(DFA4_eotS);
    static final short[] DFA4_eof = DFA.unpackEncodedString(DFA4_eofS);
    static final char[] DFA4_min = DFA.unpackEncodedStringToUnsignedChars(DFA4_minS);
    static final char[] DFA4_max = DFA.unpackEncodedStringToUnsignedChars(DFA4_maxS);
    static final short[] DFA4_accept = DFA.unpackEncodedString(DFA4_acceptS);
    static final short[] DFA4_special = DFA.unpackEncodedString(DFA4_specialS);
    static final short[][] DFA4_transition;

    static {
        int numStates = DFA4_transitionS.length;
        DFA4_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA4_transition[i] = DFA.unpackEncodedString(DFA4_transitionS[i]);
        }
    }

    class DFA4 extends DFA {

        public DFA4(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 4;
            this.eot = DFA4_eot;
            this.eof = DFA4_eof;
            this.min = DFA4_min;
            this.max = DFA4_max;
            this.accept = DFA4_accept;
            this.special = DFA4_special;
            this.transition = DFA4_transition;
        }
        public String getDescription() {
            return "1:1: Tokens : ( T__7 | T__8 | T__9 | T__10 | T__11 | T__12 | T__13 | T__14 | T__15 | T__16 | T__17 | T__18 | T__19 | T__20 | T__21 | T__22 | T__23 | T__24 | T__25 | T__26 | NUM | ID | WS );";
        }
    }
 

}