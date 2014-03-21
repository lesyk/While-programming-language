// $ANTLR 3.5 while_language/parsing/WhileLanguage.g 2014-03-21 14:44:12

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
			// while_language/parsing/WhileLanguage.g:23:7: ( 'else' )
			// while_language/parsing/WhileLanguage.g:23:9: 'else'
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
	// $ANTLR end "T__18"

	// $ANTLR start "T__19"
	public final void mT__19() throws RecognitionException {
		try {
			int _type = T__19;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// while_language/parsing/WhileLanguage.g:24:7: ( 'false' )
			// while_language/parsing/WhileLanguage.g:24:9: 'false'
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
	// $ANTLR end "T__19"

	// $ANTLR start "T__20"
	public final void mT__20() throws RecognitionException {
		try {
			int _type = T__20;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// while_language/parsing/WhileLanguage.g:25:7: ( 'if' )
			// while_language/parsing/WhileLanguage.g:25:9: 'if'
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
	// $ANTLR end "T__20"

	// $ANTLR start "T__21"
	public final void mT__21() throws RecognitionException {
		try {
			int _type = T__21;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// while_language/parsing/WhileLanguage.g:26:7: ( 'then' )
			// while_language/parsing/WhileLanguage.g:26:9: 'then'
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
	// $ANTLR end "T__21"

	// $ANTLR start "T__22"
	public final void mT__22() throws RecognitionException {
		try {
			int _type = T__22;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// while_language/parsing/WhileLanguage.g:27:7: ( 'true' )
			// while_language/parsing/WhileLanguage.g:27:9: 'true'
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
	// $ANTLR end "T__22"

	// $ANTLR start "T__23"
	public final void mT__23() throws RecognitionException {
		try {
			int _type = T__23;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// while_language/parsing/WhileLanguage.g:28:7: ( '{' )
			// while_language/parsing/WhileLanguage.g:28:9: '{'
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
	// $ANTLR end "T__23"

	// $ANTLR start "T__24"
	public final void mT__24() throws RecognitionException {
		try {
			int _type = T__24;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// while_language/parsing/WhileLanguage.g:29:7: ( '}' )
			// while_language/parsing/WhileLanguage.g:29:9: '}'
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
	// $ANTLR end "T__24"

	// $ANTLR start "NUM"
	public final void mNUM() throws RecognitionException {
		try {
			int _type = NUM;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// while_language/parsing/WhileLanguage.g:66:5: ( ( '0' .. '9' )+ )
			// while_language/parsing/WhileLanguage.g:66:7: ( '0' .. '9' )+
			{
			// while_language/parsing/WhileLanguage.g:66:7: ( '0' .. '9' )+
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
			// while_language/parsing/WhileLanguage.g:67:5: ( ( 'a' .. 'z' | 'A' .. 'Z' ) ( 'a' .. 'z' | 'A' .. 'Z' | '0' .. '9' )* )
			// while_language/parsing/WhileLanguage.g:67:7: ( 'a' .. 'z' | 'A' .. 'Z' ) ( 'a' .. 'z' | 'A' .. 'Z' | '0' .. '9' )*
			{
			if ( (input.LA(1) >= 'A' && input.LA(1) <= 'Z')||(input.LA(1) >= 'a' && input.LA(1) <= 'z') ) {
				input.consume();
			}
			else {
				MismatchedSetException mse = new MismatchedSetException(null,input);
				recover(mse);
				throw mse;
			}
			// while_language/parsing/WhileLanguage.g:67:26: ( 'a' .. 'z' | 'A' .. 'Z' | '0' .. '9' )*
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
			// while_language/parsing/WhileLanguage.g:69:5: ( ( ' ' | '\\t' | '\\r' | '\\n' )+ )
			// while_language/parsing/WhileLanguage.g:69:9: ( ' ' | '\\t' | '\\r' | '\\n' )+
			{
			// while_language/parsing/WhileLanguage.g:69:9: ( ' ' | '\\t' | '\\r' | '\\n' )+
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
		// while_language/parsing/WhileLanguage.g:1:8: ( T__7 | T__8 | T__9 | T__10 | T__11 | T__12 | T__13 | T__14 | T__15 | T__16 | T__17 | T__18 | T__19 | T__20 | T__21 | T__22 | T__23 | T__24 | NUM | ID | WS )
		int alt4=21;
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
		case 'e':
			{
			int LA4_11 = input.LA(2);
			if ( (LA4_11=='l') ) {
				int LA4_22 = input.LA(3);
				if ( (LA4_22=='s') ) {
					int LA4_27 = input.LA(4);
					if ( (LA4_27=='e') ) {
						int LA4_32 = input.LA(5);
						if ( ((LA4_32 >= '0' && LA4_32 <= '9')||(LA4_32 >= 'A' && LA4_32 <= 'Z')||(LA4_32 >= 'a' && LA4_32 <= 'z')) ) {
							alt4=20;
						}

						else {
							alt4=12;
						}

					}

					else {
						alt4=20;
					}

				}

				else {
					alt4=20;
				}

			}

			else {
				alt4=20;
			}

			}
			break;
		case 'f':
			{
			int LA4_12 = input.LA(2);
			if ( (LA4_12=='a') ) {
				int LA4_23 = input.LA(3);
				if ( (LA4_23=='l') ) {
					int LA4_28 = input.LA(4);
					if ( (LA4_28=='s') ) {
						int LA4_33 = input.LA(5);
						if ( (LA4_33=='e') ) {
							int LA4_37 = input.LA(6);
							if ( ((LA4_37 >= '0' && LA4_37 <= '9')||(LA4_37 >= 'A' && LA4_37 <= 'Z')||(LA4_37 >= 'a' && LA4_37 <= 'z')) ) {
								alt4=20;
							}

							else {
								alt4=13;
							}

						}

						else {
							alt4=20;
						}

					}

					else {
						alt4=20;
					}

				}

				else {
					alt4=20;
				}

			}

			else {
				alt4=20;
			}

			}
			break;
		case 'i':
			{
			int LA4_13 = input.LA(2);
			if ( (LA4_13=='f') ) {
				int LA4_24 = input.LA(3);
				if ( ((LA4_24 >= '0' && LA4_24 <= '9')||(LA4_24 >= 'A' && LA4_24 <= 'Z')||(LA4_24 >= 'a' && LA4_24 <= 'z')) ) {
					alt4=20;
				}

				else {
					alt4=14;
				}

			}

			else {
				alt4=20;
			}

			}
			break;
		case 't':
			{
			switch ( input.LA(2) ) {
			case 'h':
				{
				int LA4_25 = input.LA(3);
				if ( (LA4_25=='e') ) {
					int LA4_30 = input.LA(4);
					if ( (LA4_30=='n') ) {
						int LA4_34 = input.LA(5);
						if ( ((LA4_34 >= '0' && LA4_34 <= '9')||(LA4_34 >= 'A' && LA4_34 <= 'Z')||(LA4_34 >= 'a' && LA4_34 <= 'z')) ) {
							alt4=20;
						}

						else {
							alt4=15;
						}

					}

					else {
						alt4=20;
					}

				}

				else {
					alt4=20;
				}

				}
				break;
			case 'r':
				{
				int LA4_26 = input.LA(3);
				if ( (LA4_26=='u') ) {
					int LA4_31 = input.LA(4);
					if ( (LA4_31=='e') ) {
						int LA4_35 = input.LA(5);
						if ( ((LA4_35 >= '0' && LA4_35 <= '9')||(LA4_35 >= 'A' && LA4_35 <= 'Z')||(LA4_35 >= 'a' && LA4_35 <= 'z')) ) {
							alt4=20;
						}

						else {
							alt4=16;
						}

					}

					else {
						alt4=20;
					}

				}

				else {
					alt4=20;
				}

				}
				break;
			default:
				alt4=20;
			}
			}
			break;
		case '{':
			{
			alt4=17;
			}
			break;
		case '}':
			{
			alt4=18;
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
			alt4=19;
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
		case 'd':
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
		case 'w':
		case 'x':
		case 'y':
		case 'z':
			{
			alt4=20;
			}
			break;
		case '\t':
		case '\n':
		case '\r':
		case ' ':
			{
			alt4=21;
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
				// while_language/parsing/WhileLanguage.g:1:115: NUM
				{
				mNUM(); 

				}
				break;
			case 20 :
				// while_language/parsing/WhileLanguage.g:1:119: ID
				{
				mID(); 

				}
				break;
			case 21 :
				// while_language/parsing/WhileLanguage.g:1:122: WS
				{
				mWS(); 

				}
				break;

		}
	}



}
