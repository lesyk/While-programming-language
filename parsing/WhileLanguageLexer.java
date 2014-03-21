// $ANTLR 3.5 while_language/parsing/WhileLanguage.g 2014-03-21 18:04:49

package while_language.parsing;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
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
	public static final int T__27=27;
	public static final int ID=4;
	public static final int NUM=5;
	public static final int WS=6;

	// delegates
	// delegators
	public Lexer[] getDelegates() {
		return new Lexer[] {};
	}

	public WhileLanguageLexer() {} 
	public WhileLanguageLexer(CharStream input) {
		this(input, new RecognizerSharedState());
	}
	public WhileLanguageLexer(CharStream input, RecognizerSharedState state) {
		super(input,state);
	}
	@Override public String getGrammarFileName() { return "while_language/parsing/WhileLanguage.g"; }

	// $ANTLR start "T__7"
	public final void mT__7() throws RecognitionException {
		try {
			int _type = T__7;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// while_language/parsing/WhileLanguage.g:12:6: ( '!' )
			// while_language/parsing/WhileLanguage.g:12:8: '!'
			{
			match('!'); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__7"

	// $ANTLR start "T__8"
	public final void mT__8() throws RecognitionException {
		try {
			int _type = T__8;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// while_language/parsing/WhileLanguage.g:13:6: ( '!=' )
			// while_language/parsing/WhileLanguage.g:13:8: '!='
			{
			match("!="); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__8"

	// $ANTLR start "T__9"
	public final void mT__9() throws RecognitionException {
		try {
			int _type = T__9;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// while_language/parsing/WhileLanguage.g:14:6: ( '&&' )
			// while_language/parsing/WhileLanguage.g:14:8: '&&'
			{
			match("&&"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__9"

	// $ANTLR start "T__10"
	public final void mT__10() throws RecognitionException {
		try {
			int _type = T__10;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// while_language/parsing/WhileLanguage.g:15:7: ( '*' )
			// while_language/parsing/WhileLanguage.g:15:9: '*'
			{
			match('*'); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__10"

	// $ANTLR start "T__11"
	public final void mT__11() throws RecognitionException {
		try {
			int _type = T__11;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// while_language/parsing/WhileLanguage.g:16:7: ( '+' )
			// while_language/parsing/WhileLanguage.g:16:9: '+'
			{
			match('+'); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__11"

	// $ANTLR start "T__12"
	public final void mT__12() throws RecognitionException {
		try {
			int _type = T__12;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// while_language/parsing/WhileLanguage.g:17:7: ( '-' )
			// while_language/parsing/WhileLanguage.g:17:9: '-'
			{
			match('-'); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__12"

	// $ANTLR start "T__13"
	public final void mT__13() throws RecognitionException {
		try {
			int _type = T__13;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// while_language/parsing/WhileLanguage.g:18:7: ( ':=' )
			// while_language/parsing/WhileLanguage.g:18:9: ':='
			{
			match(":="); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__13"

	// $ANTLR start "T__14"
	public final void mT__14() throws RecognitionException {
		try {
			int _type = T__14;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// while_language/parsing/WhileLanguage.g:19:7: ( ';' )
			// while_language/parsing/WhileLanguage.g:19:9: ';'
			{
			match(';'); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__14"

	// $ANTLR start "T__15"
	public final void mT__15() throws RecognitionException {
		try {
			int _type = T__15;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// while_language/parsing/WhileLanguage.g:20:7: ( '<=' )
			// while_language/parsing/WhileLanguage.g:20:9: '<='
			{
			match("<="); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__15"

	// $ANTLR start "T__16"
	public final void mT__16() throws RecognitionException {
		try {
			int _type = T__16;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// while_language/parsing/WhileLanguage.g:21:7: ( '=' )
			// while_language/parsing/WhileLanguage.g:21:9: '='
			{
			match('='); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__16"

	// $ANTLR start "T__17"
	public final void mT__17() throws RecognitionException {
		try {
			int _type = T__17;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// while_language/parsing/WhileLanguage.g:22:7: ( '>=' )
			// while_language/parsing/WhileLanguage.g:22:9: '>='
			{
			match(">="); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__17"

	// $ANTLR start "T__18"
	public final void mT__18() throws RecognitionException {
		try {
			int _type = T__18;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// while_language/parsing/WhileLanguage.g:23:7: ( 'do' )
			// while_language/parsing/WhileLanguage.g:23:9: 'do'
			{
			match("do"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__18"

	// $ANTLR start "T__19"
	public final void mT__19() throws RecognitionException {
		try {
			int _type = T__19;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// while_language/parsing/WhileLanguage.g:24:7: ( 'else' )
			// while_language/parsing/WhileLanguage.g:24:9: 'else'
			{
			match("else"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__19"

	// $ANTLR start "T__20"
	public final void mT__20() throws RecognitionException {
		try {
			int _type = T__20;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// while_language/parsing/WhileLanguage.g:25:7: ( 'false' )
			// while_language/parsing/WhileLanguage.g:25:9: 'false'
			{
			match("false"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__20"

	// $ANTLR start "T__21"
	public final void mT__21() throws RecognitionException {
		try {
			int _type = T__21;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// while_language/parsing/WhileLanguage.g:26:7: ( 'if' )
			// while_language/parsing/WhileLanguage.g:26:9: 'if'
			{
			match("if"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__21"

	// $ANTLR start "T__22"
	public final void mT__22() throws RecognitionException {
		try {
			int _type = T__22;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// while_language/parsing/WhileLanguage.g:27:7: ( 'then' )
			// while_language/parsing/WhileLanguage.g:27:9: 'then'
			{
			match("then"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__22"

	// $ANTLR start "T__23"
	public final void mT__23() throws RecognitionException {
		try {
			int _type = T__23;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// while_language/parsing/WhileLanguage.g:28:7: ( 'true' )
			// while_language/parsing/WhileLanguage.g:28:9: 'true'
			{
			match("true"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__23"

	// $ANTLR start "T__24"
	public final void mT__24() throws RecognitionException {
		try {
			int _type = T__24;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// while_language/parsing/WhileLanguage.g:29:7: ( 'while' )
			// while_language/parsing/WhileLanguage.g:29:9: 'while'
			{
			match("while"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__24"

	// $ANTLR start "T__25"
	public final void mT__25() throws RecognitionException {
		try {
			int _type = T__25;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// while_language/parsing/WhileLanguage.g:30:7: ( '{' )
			// while_language/parsing/WhileLanguage.g:30:9: '{'
			{
			match('{'); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__25"

	// $ANTLR start "T__26"
	public final void mT__26() throws RecognitionException {
		try {
			int _type = T__26;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// while_language/parsing/WhileLanguage.g:31:7: ( '||' )
			// while_language/parsing/WhileLanguage.g:31:9: '||'
			{
			match("||"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__26"

	// $ANTLR start "T__27"
	public final void mT__27() throws RecognitionException {
		try {
			int _type = T__27;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// while_language/parsing/WhileLanguage.g:32:7: ( '}' )
			// while_language/parsing/WhileLanguage.g:32:9: '}'
			{
			match('}'); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__27"

	// $ANTLR start "NUM"
	public final void mNUM() throws RecognitionException {
		try {
			int _type = NUM;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// while_language/parsing/WhileLanguage.g:73:5: ( ( '0' .. '9' )+ )
			// while_language/parsing/WhileLanguage.g:73:7: ( '0' .. '9' )+
			{
			// while_language/parsing/WhileLanguage.g:73:7: ( '0' .. '9' )+
			int cnt1=0;
			loop1:
			while (true) {
				int alt1=2;
				int LA1_0 = input.LA(1);
				if ( ((LA1_0 >= '0' && LA1_0 <= '9')) ) {
					alt1=1;
				}

				switch (alt1) {
				case 1 :
					// while_language/parsing/WhileLanguage.g:
					{
					if ( (input.LA(1) >= '0' && input.LA(1) <= '9') ) {
						input.consume();
					}
					else {
						MismatchedSetException mse = new MismatchedSetException(null,input);
						recover(mse);
						throw mse;
					}
					}
					break;

				default :
					if ( cnt1 >= 1 ) break loop1;
					EarlyExitException eee = new EarlyExitException(1, input);
					throw eee;
				}
				cnt1++;
			}

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "NUM"

	// $ANTLR start "ID"
	public final void mID() throws RecognitionException {
		try {
			int _type = ID;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// while_language/parsing/WhileLanguage.g:74:5: ( ( 'a' .. 'z' | 'A' .. 'Z' ) ( 'a' .. 'z' | 'A' .. 'Z' | '0' .. '9' )* )
			// while_language/parsing/WhileLanguage.g:74:7: ( 'a' .. 'z' | 'A' .. 'Z' ) ( 'a' .. 'z' | 'A' .. 'Z' | '0' .. '9' )*
			{
			if ( (input.LA(1) >= 'A' && input.LA(1) <= 'Z')||(input.LA(1) >= 'a' && input.LA(1) <= 'z') ) {
				input.consume();
			}
			else {
				MismatchedSetException mse = new MismatchedSetException(null,input);
				recover(mse);
				throw mse;
			}
			// while_language/parsing/WhileLanguage.g:74:26: ( 'a' .. 'z' | 'A' .. 'Z' | '0' .. '9' )*
			loop2:
			while (true) {
				int alt2=2;
				int LA2_0 = input.LA(1);
				if ( ((LA2_0 >= '0' && LA2_0 <= '9')||(LA2_0 >= 'A' && LA2_0 <= 'Z')||(LA2_0 >= 'a' && LA2_0 <= 'z')) ) {
					alt2=1;
				}

				switch (alt2) {
				case 1 :
					// while_language/parsing/WhileLanguage.g:
					{
					if ( (input.LA(1) >= '0' && input.LA(1) <= '9')||(input.LA(1) >= 'A' && input.LA(1) <= 'Z')||(input.LA(1) >= 'a' && input.LA(1) <= 'z') ) {
						input.consume();
					}
					else {
						MismatchedSetException mse = new MismatchedSetException(null,input);
						recover(mse);
						throw mse;
					}
					}
					break;

				default :
					break loop2;
				}
			}

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "ID"

	// $ANTLR start "WS"
	public final void mWS() throws RecognitionException {
		try {
			int _type = WS;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// while_language/parsing/WhileLanguage.g:76:5: ( ( ' ' | '\\t' | '\\r' | '\\n' )+ )
			// while_language/parsing/WhileLanguage.g:76:9: ( ' ' | '\\t' | '\\r' | '\\n' )+
			{
			// while_language/parsing/WhileLanguage.g:76:9: ( ' ' | '\\t' | '\\r' | '\\n' )+
			int cnt3=0;
			loop3:
			while (true) {
				int alt3=2;
				int LA3_0 = input.LA(1);
				if ( ((LA3_0 >= '\t' && LA3_0 <= '\n')||LA3_0=='\r'||LA3_0==' ') ) {
					alt3=1;
				}

				switch (alt3) {
				case 1 :
					// while_language/parsing/WhileLanguage.g:
					{
					if ( (input.LA(1) >= '\t' && input.LA(1) <= '\n')||input.LA(1)=='\r'||input.LA(1)==' ' ) {
						input.consume();
					}
					else {
						MismatchedSetException mse = new MismatchedSetException(null,input);
						recover(mse);
						throw mse;
					}
					}
					break;

				default :
					if ( cnt3 >= 1 ) break loop3;
					EarlyExitException eee = new EarlyExitException(3, input);
					throw eee;
				}
				cnt3++;
			}

			 _channel = HIDDEN; 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "WS"

	@Override
	public void mTokens() throws RecognitionException {
		// while_language/parsing/WhileLanguage.g:1:8: ( T__7 | T__8 | T__9 | T__10 | T__11 | T__12 | T__13 | T__14 | T__15 | T__16 | T__17 | T__18 | T__19 | T__20 | T__21 | T__22 | T__23 | T__24 | T__25 | T__26 | T__27 | NUM | ID | WS )
		int alt4=24;
		switch ( input.LA(1) ) {
		case '!':
			{
			int LA4_1 = input.LA(2);
			if ( (LA4_1=='=') ) {
				alt4=2;
			}

			else {
				alt4=1;
			}

			}
			break;
		case '&':
			{
			alt4=3;
			}
			break;
		case '*':
			{
			alt4=4;
			}
			break;
		case '+':
			{
			alt4=5;
			}
			break;
		case '-':
			{
			alt4=6;
			}
			break;
		case ':':
			{
			alt4=7;
			}
			break;
		case ';':
			{
			alt4=8;
			}
			break;
		case '<':
			{
			alt4=9;
			}
			break;
		case '=':
			{
			alt4=10;
			}
			break;
		case '>':
			{
			alt4=11;
			}
			break;
		case 'd':
			{
			int LA4_11 = input.LA(2);
			if ( (LA4_11=='o') ) {
				int LA4_25 = input.LA(3);
				if ( ((LA4_25 >= '0' && LA4_25 <= '9')||(LA4_25 >= 'A' && LA4_25 <= 'Z')||(LA4_25 >= 'a' && LA4_25 <= 'z')) ) {
					alt4=23;
				}

				else {
					alt4=12;
				}

			}

			else {
				alt4=23;
			}

			}
			break;
		case 'e':
			{
			int LA4_12 = input.LA(2);
			if ( (LA4_12=='l') ) {
				int LA4_26 = input.LA(3);
				if ( (LA4_26=='s') ) {
					int LA4_33 = input.LA(4);
					if ( (LA4_33=='e') ) {
						int LA4_39 = input.LA(5);
						if ( ((LA4_39 >= '0' && LA4_39 <= '9')||(LA4_39 >= 'A' && LA4_39 <= 'Z')||(LA4_39 >= 'a' && LA4_39 <= 'z')) ) {
							alt4=23;
						}

						else {
							alt4=13;
						}

					}

					else {
						alt4=23;
					}

				}

				else {
					alt4=23;
				}

			}

			else {
				alt4=23;
			}

			}
			break;
		case 'f':
			{
			int LA4_13 = input.LA(2);
			if ( (LA4_13=='a') ) {
				int LA4_27 = input.LA(3);
				if ( (LA4_27=='l') ) {
					int LA4_34 = input.LA(4);
					if ( (LA4_34=='s') ) {
						int LA4_40 = input.LA(5);
						if ( (LA4_40=='e') ) {
							int LA4_45 = input.LA(6);
							if ( ((LA4_45 >= '0' && LA4_45 <= '9')||(LA4_45 >= 'A' && LA4_45 <= 'Z')||(LA4_45 >= 'a' && LA4_45 <= 'z')) ) {
								alt4=23;
							}

							else {
								alt4=14;
							}

						}

						else {
							alt4=23;
						}

					}

					else {
						alt4=23;
					}

				}

				else {
					alt4=23;
				}

			}

			else {
				alt4=23;
			}

			}
			break;
		case 'i':
			{
			int LA4_14 = input.LA(2);
			if ( (LA4_14=='f') ) {
				int LA4_28 = input.LA(3);
				if ( ((LA4_28 >= '0' && LA4_28 <= '9')||(LA4_28 >= 'A' && LA4_28 <= 'Z')||(LA4_28 >= 'a' && LA4_28 <= 'z')) ) {
					alt4=23;
				}

				else {
					alt4=15;
				}

			}

			else {
				alt4=23;
			}

			}
			break;
		case 't':
			{
			switch ( input.LA(2) ) {
			case 'h':
				{
				int LA4_29 = input.LA(3);
				if ( (LA4_29=='e') ) {
					int LA4_36 = input.LA(4);
					if ( (LA4_36=='n') ) {
						int LA4_41 = input.LA(5);
						if ( ((LA4_41 >= '0' && LA4_41 <= '9')||(LA4_41 >= 'A' && LA4_41 <= 'Z')||(LA4_41 >= 'a' && LA4_41 <= 'z')) ) {
							alt4=23;
						}

						else {
							alt4=16;
						}

					}

					else {
						alt4=23;
					}

				}

				else {
					alt4=23;
				}

				}
				break;
			case 'r':
				{
				int LA4_30 = input.LA(3);
				if ( (LA4_30=='u') ) {
					int LA4_37 = input.LA(4);
					if ( (LA4_37=='e') ) {
						int LA4_42 = input.LA(5);
						if ( ((LA4_42 >= '0' && LA4_42 <= '9')||(LA4_42 >= 'A' && LA4_42 <= 'Z')||(LA4_42 >= 'a' && LA4_42 <= 'z')) ) {
							alt4=23;
						}

						else {
							alt4=17;
						}

					}

					else {
						alt4=23;
					}

				}

				else {
					alt4=23;
				}

				}
				break;
			default:
				alt4=23;
			}
			}
			break;
		case 'w':
			{
			int LA4_16 = input.LA(2);
			if ( (LA4_16=='h') ) {
				int LA4_31 = input.LA(3);
				if ( (LA4_31=='i') ) {
					int LA4_38 = input.LA(4);
					if ( (LA4_38=='l') ) {
						int LA4_43 = input.LA(5);
						if ( (LA4_43=='e') ) {
							int LA4_48 = input.LA(6);
							if ( ((LA4_48 >= '0' && LA4_48 <= '9')||(LA4_48 >= 'A' && LA4_48 <= 'Z')||(LA4_48 >= 'a' && LA4_48 <= 'z')) ) {
								alt4=23;
							}

							else {
								alt4=18;
							}

						}

						else {
							alt4=23;
						}

					}

					else {
						alt4=23;
					}

				}

				else {
					alt4=23;
				}

			}

			else {
				alt4=23;
			}

			}
			break;
		case '{':
			{
			alt4=19;
			}
			break;
		case '|':
			{
			alt4=20;
			}
			break;
		case '}':
			{
			alt4=21;
			}
			break;
		case '0':
		case '1':
		case '2':
		case '3':
		case '4':
		case '5':
		case '6':
		case '7':
		case '8':
		case '9':
			{
			alt4=22;
			}
			break;
		case 'A':
		case 'B':
		case 'C':
		case 'D':
		case 'E':
		case 'F':
		case 'G':
		case 'H':
		case 'I':
		case 'J':
		case 'K':
		case 'L':
		case 'M':
		case 'N':
		case 'O':
		case 'P':
		case 'Q':
		case 'R':
		case 'S':
		case 'T':
		case 'U':
		case 'V':
		case 'W':
		case 'X':
		case 'Y':
		case 'Z':
		case 'a':
		case 'b':
		case 'c':
		case 'g':
		case 'h':
		case 'j':
		case 'k':
		case 'l':
		case 'm':
		case 'n':
		case 'o':
		case 'p':
		case 'q':
		case 'r':
		case 's':
		case 'u':
		case 'v':
		case 'x':
		case 'y':
		case 'z':
			{
			alt4=23;
			}
			break;
		case '\t':
		case '\n':
		case '\r':
		case ' ':
			{
			alt4=24;
			}
			break;
		default:
			NoViableAltException nvae =
				new NoViableAltException("", 4, 0, input);
			throw nvae;
		}
		switch (alt4) {
			case 1 :
				// while_language/parsing/WhileLanguage.g:1:10: T__7
				{
				mT__7(); 

				}
				break;
			case 2 :
				// while_language/parsing/WhileLanguage.g:1:15: T__8
				{
				mT__8(); 

				}
				break;
			case 3 :
				// while_language/parsing/WhileLanguage.g:1:20: T__9
				{
				mT__9(); 

				}
				break;
			case 4 :
				// while_language/parsing/WhileLanguage.g:1:25: T__10
				{
				mT__10(); 

				}
				break;
			case 5 :
				// while_language/parsing/WhileLanguage.g:1:31: T__11
				{
				mT__11(); 

				}
				break;
			case 6 :
				// while_language/parsing/WhileLanguage.g:1:37: T__12
				{
				mT__12(); 

				}
				break;
			case 7 :
				// while_language/parsing/WhileLanguage.g:1:43: T__13
				{
				mT__13(); 

				}
				break;
			case 8 :
				// while_language/parsing/WhileLanguage.g:1:49: T__14
				{
				mT__14(); 

				}
				break;
			case 9 :
				// while_language/parsing/WhileLanguage.g:1:55: T__15
				{
				mT__15(); 

				}
				break;
			case 10 :
				// while_language/parsing/WhileLanguage.g:1:61: T__16
				{
				mT__16(); 

				}
				break;
			case 11 :
				// while_language/parsing/WhileLanguage.g:1:67: T__17
				{
				mT__17(); 

				}
				break;
			case 12 :
				// while_language/parsing/WhileLanguage.g:1:73: T__18
				{
				mT__18(); 

				}
				break;
			case 13 :
				// while_language/parsing/WhileLanguage.g:1:79: T__19
				{
				mT__19(); 

				}
				break;
			case 14 :
				// while_language/parsing/WhileLanguage.g:1:85: T__20
				{
				mT__20(); 

				}
				break;
			case 15 :
				// while_language/parsing/WhileLanguage.g:1:91: T__21
				{
				mT__21(); 

				}
				break;
			case 16 :
				// while_language/parsing/WhileLanguage.g:1:97: T__22
				{
				mT__22(); 

				}
				break;
			case 17 :
				// while_language/parsing/WhileLanguage.g:1:103: T__23
				{
				mT__23(); 

				}
				break;
			case 18 :
				// while_language/parsing/WhileLanguage.g:1:109: T__24
				{
				mT__24(); 

				}
				break;
			case 19 :
				// while_language/parsing/WhileLanguage.g:1:115: T__25
				{
				mT__25(); 

				}
				break;
			case 20 :
				// while_language/parsing/WhileLanguage.g:1:121: T__26
				{
				mT__26(); 

				}
				break;
			case 21 :
				// while_language/parsing/WhileLanguage.g:1:127: T__27
				{
				mT__27(); 

				}
				break;
			case 22 :
				// while_language/parsing/WhileLanguage.g:1:133: NUM
				{
				mNUM(); 

				}
				break;
			case 23 :
				// while_language/parsing/WhileLanguage.g:1:137: ID
				{
				mID(); 

				}
				break;
			case 24 :
				// while_language/parsing/WhileLanguage.g:1:140: WS
				{
				mWS(); 

				}
				break;

		}
	}



}
