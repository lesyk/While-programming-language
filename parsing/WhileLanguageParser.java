// $ANTLR 3.5 while_language/parsing/WhileLanguage.g 2014-03-21 14:44:11

package while_language.parsing;

import while_language.ast.*;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class WhileLanguageParser extends Parser {
	public static final String[] tokenNames = new String[] {
		"<invalid>", "<EOR>", "<DOWN>", "<UP>", "ID", "NUM", "WS", "'!'", "'!='", 
		"'&&'", "'*'", "'+'", "'-'", "':='", "';'", "'<='", "'='", "'>='", "'else'", 
		"'false'", "'if'", "'then'", "'true'", "'{'", "'}'"
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
	public static final int ID=4;
	public static final int NUM=5;
	public static final int WS=6;

	// delegates
	public Parser[] getDelegates() {
		return new Parser[] {};
	}

	// delegators


	public WhileLanguageParser(TokenStream input) {
		this(input, new RecognizerSharedState());
	}
	public WhileLanguageParser(TokenStream input, RecognizerSharedState state) {
		super(input, state);
	}

	@Override public String[] getTokenNames() { return WhileLanguageParser.tokenNames; }
	@Override public String getGrammarFileName() { return "while_language/parsing/WhileLanguage.g"; }



	// $ANTLR start "program"
	// while_language/parsing/WhileLanguage.g:19:1: program returns [Statement value] : s= statement EOF ;
	public final Statement program() throws RecognitionException {
		Statement value = null;


		Statement s =null;

		try {
			// while_language/parsing/WhileLanguage.g:20:5: (s= statement EOF )
			// while_language/parsing/WhileLanguage.g:20:7: s= statement EOF
			{
			pushFollow(FOLLOW_statement_in_program49);
			s=statement();
			state._fsp--;

			match(input,EOF,FOLLOW_EOF_in_program51); 
			 value = s; 
			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		return value;
	}
	// $ANTLR end "program"



	// $ANTLR start "statement"
	// while_language/parsing/WhileLanguage.g:23:1: statement returns [Statement value] : s= base_statement ( ';' s= base_statement )* ;
	public final Statement statement() throws RecognitionException {
		Statement value = null;


		Statement s =null;

		try {
			// while_language/parsing/WhileLanguage.g:24:5: (s= base_statement ( ';' s= base_statement )* )
			// while_language/parsing/WhileLanguage.g:24:7: s= base_statement ( ';' s= base_statement )*
			{
			pushFollow(FOLLOW_base_statement_in_statement76);
			s=base_statement();
			state._fsp--;

			 value = s; 
			// while_language/parsing/WhileLanguage.g:25:7: ( ';' s= base_statement )*
			loop1:
			while (true) {
				int alt1=2;
				int LA1_0 = input.LA(1);
				if ( (LA1_0==14) ) {
					alt1=1;
				}

				switch (alt1) {
				case 1 :
					// while_language/parsing/WhileLanguage.g:25:9: ';' s= base_statement
					{
					match(input,14,FOLLOW_14_in_statement94); 
					pushFollow(FOLLOW_base_statement_in_statement98);
					s=base_statement();
					state._fsp--;

					 value = new SeqStatement(value,s); 
					}
					break;

				default :
					break loop1;
				}
			}

			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		return value;
	}
	// $ANTLR end "statement"



	// $ANTLR start "base_statement"
	// while_language/parsing/WhileLanguage.g:28:1: base_statement returns [Statement value] : ( ID ':=' e= arith_expr | 'if' c= bool_expr 'then' s1= base_statement 'else' s2= base_statement | '{' s= statement '}' );
	public final Statement base_statement() throws RecognitionException {
		Statement value = null;


		Token ID1=null;
		ArithExpr e =null;
		BoolExpr c =null;
		Statement s1 =null;
		Statement s2 =null;
		Statement s =null;

		try {
			// while_language/parsing/WhileLanguage.g:29:5: ( ID ':=' e= arith_expr | 'if' c= bool_expr 'then' s1= base_statement 'else' s2= base_statement | '{' s= statement '}' )
			int alt2=3;
			switch ( input.LA(1) ) {
			case ID:
				{
				alt2=1;
				}
				break;
			case 20:
				{
				alt2=2;
				}
				break;
			case 23:
				{
				alt2=3;
				}
				break;
			default:
				NoViableAltException nvae =
					new NoViableAltException("", 2, 0, input);
				throw nvae;
			}
			switch (alt2) {
				case 1 :
					// while_language/parsing/WhileLanguage.g:29:7: ID ':=' e= arith_expr
					{
					ID1=(Token)match(input,ID,FOLLOW_ID_in_base_statement124); 
					match(input,13,FOLLOW_13_in_base_statement126); 
					pushFollow(FOLLOW_arith_expr_in_base_statement130);
					e=arith_expr();
					state._fsp--;

					 value = new AssignStatement(ID1.getText(), e); 
					}
					break;
				case 2 :
					// while_language/parsing/WhileLanguage.g:30:7: 'if' c= bool_expr 'then' s1= base_statement 'else' s2= base_statement
					{
					match(input,20,FOLLOW_20_in_base_statement161); 
					pushFollow(FOLLOW_bool_expr_in_base_statement165);
					c=bool_expr();
					state._fsp--;

					match(input,21,FOLLOW_21_in_base_statement167); 
					pushFollow(FOLLOW_base_statement_in_base_statement171);
					s1=base_statement();
					state._fsp--;

					match(input,18,FOLLOW_18_in_base_statement179); 
					pushFollow(FOLLOW_base_statement_in_base_statement183);
					s2=base_statement();
					state._fsp--;

					 value = new IfStatement(c,s1,s2); 
					}
					break;
				case 3 :
					// while_language/parsing/WhileLanguage.g:32:7: '{' s= statement '}'
					{
					match(input,23,FOLLOW_23_in_base_statement210); 
					pushFollow(FOLLOW_statement_in_base_statement214);
					s=statement();
					state._fsp--;

					match(input,24,FOLLOW_24_in_base_statement216); 
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
			// do for sure before leaving
		}
		return value;
	}
	// $ANTLR end "base_statement"



	// $ANTLR start "bool_expr"
	// while_language/parsing/WhileLanguage.g:35:1: bool_expr returns [BoolExpr value] : e= literal ( '&&' e= literal )* ;
	public final BoolExpr bool_expr() throws RecognitionException {
		BoolExpr value = null;


		BoolExpr e =null;

		try {
			// while_language/parsing/WhileLanguage.g:36:5: (e= literal ( '&&' e= literal )* )
			// while_language/parsing/WhileLanguage.g:36:7: e= literal ( '&&' e= literal )*
			{
			pushFollow(FOLLOW_literal_in_bool_expr263);
			e=literal();
			state._fsp--;

			 value = e; 
			// while_language/parsing/WhileLanguage.g:37:7: ( '&&' e= literal )*
			loop3:
			while (true) {
				int alt3=2;
				int LA3_0 = input.LA(1);
				if ( (LA3_0==9) ) {
					alt3=1;
				}

				switch (alt3) {
				case 1 :
					// while_language/parsing/WhileLanguage.g:37:9: '&&' e= literal
					{
					match(input,9,FOLLOW_9_in_bool_expr281); 
					pushFollow(FOLLOW_literal_in_bool_expr285);
					e=literal();
					state._fsp--;

					 value = new AndExpr(value,e); 
					}
					break;

				default :
					break loop3;
				}
			}

			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		return value;
	}
	// $ANTLR end "bool_expr"



	// $ANTLR start "literal"
	// while_language/parsing/WhileLanguage.g:40:1: literal returns [BoolExpr value] : ( 'true' | 'false' | (e1= arith_expr '=' e2= arith_expr |e1= arith_expr '<=' e2= arith_expr |e1= arith_expr '>=' e2= arith_expr |e1= arith_expr '!=' e2= arith_expr ) | '!' e= literal );
	public final BoolExpr literal() throws RecognitionException {
		BoolExpr value = null;


		ArithExpr e1 =null;
		ArithExpr e2 =null;
		BoolExpr e =null;

		try {
			// while_language/parsing/WhileLanguage.g:41:5: ( 'true' | 'false' | (e1= arith_expr '=' e2= arith_expr |e1= arith_expr '<=' e2= arith_expr |e1= arith_expr '>=' e2= arith_expr |e1= arith_expr '!=' e2= arith_expr ) | '!' e= literal )
			int alt5=4;
			switch ( input.LA(1) ) {
			case 22:
				{
				alt5=1;
				}
				break;
			case 19:
				{
				alt5=2;
				}
				break;
			case ID:
			case NUM:
				{
				alt5=3;
				}
				break;
			case 7:
				{
				alt5=4;
				}
				break;
			default:
				NoViableAltException nvae =
					new NoViableAltException("", 5, 0, input);
				throw nvae;
			}
			switch (alt5) {
				case 1 :
					// while_language/parsing/WhileLanguage.g:41:7: 'true'
					{
					match(input,22,FOLLOW_22_in_literal311); 
					 value = new BoolValueExpr(true); 
					}
					break;
				case 2 :
					// while_language/parsing/WhileLanguage.g:42:7: 'false'
					{
					match(input,19,FOLLOW_19_in_literal349); 
					 value = new BoolValueExpr(false); 
					}
					break;
				case 3 :
					// while_language/parsing/WhileLanguage.g:43:7: (e1= arith_expr '=' e2= arith_expr |e1= arith_expr '<=' e2= arith_expr |e1= arith_expr '>=' e2= arith_expr |e1= arith_expr '!=' e2= arith_expr )
					{
					// while_language/parsing/WhileLanguage.g:43:7: (e1= arith_expr '=' e2= arith_expr |e1= arith_expr '<=' e2= arith_expr |e1= arith_expr '>=' e2= arith_expr |e1= arith_expr '!=' e2= arith_expr )
					int alt4=4;
					alt4 = dfa4.predict(input);
					switch (alt4) {
						case 1 :
							// while_language/parsing/WhileLanguage.g:43:8: e1= arith_expr '=' e2= arith_expr
							{
							pushFollow(FOLLOW_arith_expr_in_literal389);
							e1=arith_expr();
							state._fsp--;

							match(input,16,FOLLOW_16_in_literal391); 
							pushFollow(FOLLOW_arith_expr_in_literal395);
							e2=arith_expr();
							state._fsp--;

							 value = new ComparisonExpr(e1,e2, 1); 
							}
							break;
						case 2 :
							// while_language/parsing/WhileLanguage.g:44:8: e1= arith_expr '<=' e2= arith_expr
							{
							pushFollow(FOLLOW_arith_expr_in_literal410);
							e1=arith_expr();
							state._fsp--;

							match(input,15,FOLLOW_15_in_literal412); 
							pushFollow(FOLLOW_arith_expr_in_literal416);
							e2=arith_expr();
							state._fsp--;

							 value = new ComparisonExpr(e1,e2, 2); 
							}
							break;
						case 3 :
							// while_language/parsing/WhileLanguage.g:45:8: e1= arith_expr '>=' e2= arith_expr
							{
							pushFollow(FOLLOW_arith_expr_in_literal430);
							e1=arith_expr();
							state._fsp--;

							match(input,17,FOLLOW_17_in_literal432); 
							pushFollow(FOLLOW_arith_expr_in_literal436);
							e2=arith_expr();
							state._fsp--;

							 value = new ComparisonExpr(e1,e2, 3); 
							}
							break;
						case 4 :
							// while_language/parsing/WhileLanguage.g:46:8: e1= arith_expr '!=' e2= arith_expr
							{
							pushFollow(FOLLOW_arith_expr_in_literal450);
							e1=arith_expr();
							state._fsp--;

							match(input,8,FOLLOW_8_in_literal452); 
							pushFollow(FOLLOW_arith_expr_in_literal456);
							e2=arith_expr();
							state._fsp--;

							 value = new ComparisonExpr(e1,e2, 4); 
							}
							break;

					}

					}
					break;
				case 4 :
					// while_language/parsing/WhileLanguage.g:47:7: '!' e= literal
					{
					match(input,7,FOLLOW_7_in_literal468); 
					pushFollow(FOLLOW_literal_in_literal472);
					e=literal();
					state._fsp--;

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
			// do for sure before leaving
		}
		return value;
	}
	// $ANTLR end "literal"



	// $ANTLR start "arith_expr"
	// while_language/parsing/WhileLanguage.g:50:1: arith_expr returns [ArithExpr value] : e= mult_arith_expr ( '+' e= mult_arith_expr | '-' e= mult_arith_expr )* ;
	public final ArithExpr arith_expr() throws RecognitionException {
		ArithExpr value = null;


		ArithExpr e =null;

		try {
			// while_language/parsing/WhileLanguage.g:51:5: (e= mult_arith_expr ( '+' e= mult_arith_expr | '-' e= mult_arith_expr )* )
			// while_language/parsing/WhileLanguage.g:51:7: e= mult_arith_expr ( '+' e= mult_arith_expr | '-' e= mult_arith_expr )*
			{
			pushFollow(FOLLOW_mult_arith_expr_in_arith_expr497);
			e=mult_arith_expr();
			state._fsp--;

			 value = e; 
			// while_language/parsing/WhileLanguage.g:52:7: ( '+' e= mult_arith_expr | '-' e= mult_arith_expr )*
			loop6:
			while (true) {
				int alt6=3;
				int LA6_0 = input.LA(1);
				if ( (LA6_0==11) ) {
					alt6=1;
				}
				else if ( (LA6_0==12) ) {
					alt6=2;
				}

				switch (alt6) {
				case 1 :
					// while_language/parsing/WhileLanguage.g:52:9: '+' e= mult_arith_expr
					{
					match(input,11,FOLLOW_11_in_arith_expr515); 
					pushFollow(FOLLOW_mult_arith_expr_in_arith_expr519);
					e=mult_arith_expr();
					state._fsp--;

					 value = new PlusExpr(value,e); 
					}
					break;
				case 2 :
					// while_language/parsing/WhileLanguage.g:53:9: '-' e= mult_arith_expr
					{
					match(input,12,FOLLOW_12_in_arith_expr532); 
					pushFollow(FOLLOW_mult_arith_expr_in_arith_expr536);
					e=mult_arith_expr();
					state._fsp--;

					 value = new MinusExpr(value,e); 
					}
					break;

				default :
					break loop6;
				}
			}

			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		return value;
	}
	// $ANTLR end "arith_expr"



	// $ANTLR start "mult_arith_expr"
	// while_language/parsing/WhileLanguage.g:56:1: mult_arith_expr returns [ArithExpr value] : e= base_arith_expr ( '*' e= base_arith_expr )* ;
	public final ArithExpr mult_arith_expr() throws RecognitionException {
		ArithExpr value = null;


		ArithExpr e =null;

		try {
			// while_language/parsing/WhileLanguage.g:57:5: (e= base_arith_expr ( '*' e= base_arith_expr )* )
			// while_language/parsing/WhileLanguage.g:57:7: e= base_arith_expr ( '*' e= base_arith_expr )*
			{
			pushFollow(FOLLOW_base_arith_expr_in_mult_arith_expr564);
			e=base_arith_expr();
			state._fsp--;

			 value = e; 
			// while_language/parsing/WhileLanguage.g:58:7: ( '*' e= base_arith_expr )*
			loop7:
			while (true) {
				int alt7=2;
				int LA7_0 = input.LA(1);
				if ( (LA7_0==10) ) {
					alt7=1;
				}

				switch (alt7) {
				case 1 :
					// while_language/parsing/WhileLanguage.g:58:9: '*' e= base_arith_expr
					{
					match(input,10,FOLLOW_10_in_mult_arith_expr582); 
					pushFollow(FOLLOW_base_arith_expr_in_mult_arith_expr586);
					e=base_arith_expr();
					state._fsp--;

					 value = new MultExpr(value,e); 
					}
					break;

				default :
					break loop7;
				}
			}

			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		return value;
	}
	// $ANTLR end "mult_arith_expr"



	// $ANTLR start "base_arith_expr"
	// while_language/parsing/WhileLanguage.g:61:1: base_arith_expr returns [ArithExpr value] : ( NUM | ID );
	public final ArithExpr base_arith_expr() throws RecognitionException {
		ArithExpr value = null;


		Token NUM2=null;
		Token ID3=null;

		try {
			// while_language/parsing/WhileLanguage.g:62:5: ( NUM | ID )
			int alt8=2;
			int LA8_0 = input.LA(1);
			if ( (LA8_0==NUM) ) {
				alt8=1;
			}
			else if ( (LA8_0==ID) ) {
				alt8=2;
			}

			else {
				NoViableAltException nvae =
					new NoViableAltException("", 8, 0, input);
				throw nvae;
			}

			switch (alt8) {
				case 1 :
					// while_language/parsing/WhileLanguage.g:62:7: NUM
					{
					NUM2=(Token)match(input,NUM,FOLLOW_NUM_in_base_arith_expr612); 
					 value = new NumExpr(Integer.parseInt(NUM2.getText())); 
					}
					break;
				case 2 :
					// while_language/parsing/WhileLanguage.g:63:7: ID
					{
					ID3=(Token)match(input,ID,FOLLOW_ID_in_base_arith_expr622); 
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
			// do for sure before leaving
		}
		return value;
	}
	// $ANTLR end "base_arith_expr"

	// Delegated rules


	protected DFA4 dfa4 = new DFA4(this);
	static final String DFA4_eotS =
		"\26\uffff";
	static final String DFA4_eofS =
		"\26\uffff";
	static final String DFA4_minS =
		"\1\4\2\10\3\4\4\uffff\6\10\2\4\4\10";
	static final String DFA4_maxS =
		"\1\5\2\21\3\5\4\uffff\6\21\2\5\4\21";
	static final String DFA4_acceptS =
		"\6\uffff\1\1\1\2\1\3\1\4\14\uffff";
	static final String DFA4_specialS =
		"\26\uffff}>";
	static final String[] DFA4_transitionS = {
			"\1\2\1\1",
			"\1\11\1\uffff\1\3\1\4\1\5\2\uffff\1\7\1\6\1\10",
			"\1\11\1\uffff\1\3\1\4\1\5\2\uffff\1\7\1\6\1\10",
			"\1\13\1\12",
			"\1\15\1\14",
			"\1\17\1\16",
			"",
			"",
			"",
			"",
			"\1\11\1\uffff\1\3\1\4\1\5\2\uffff\1\7\1\6\1\10",
			"\1\11\1\uffff\1\3\1\4\1\5\2\uffff\1\7\1\6\1\10",
			"\1\11\1\uffff\1\20\1\4\1\5\2\uffff\1\7\1\6\1\10",
			"\1\11\1\uffff\1\20\1\4\1\5\2\uffff\1\7\1\6\1\10",
			"\1\11\1\uffff\1\21\1\4\1\5\2\uffff\1\7\1\6\1\10",
			"\1\11\1\uffff\1\21\1\4\1\5\2\uffff\1\7\1\6\1\10",
			"\1\23\1\22",
			"\1\25\1\24",
			"\1\11\1\uffff\1\20\1\4\1\5\2\uffff\1\7\1\6\1\10",
			"\1\11\1\uffff\1\20\1\4\1\5\2\uffff\1\7\1\6\1\10",
			"\1\11\1\uffff\1\21\1\4\1\5\2\uffff\1\7\1\6\1\10",
			"\1\11\1\uffff\1\21\1\4\1\5\2\uffff\1\7\1\6\1\10"
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

	protected class DFA4 extends DFA {

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
		@Override
		public String getDescription() {
			return "43:7: (e1= arith_expr '=' e2= arith_expr |e1= arith_expr '<=' e2= arith_expr |e1= arith_expr '>=' e2= arith_expr |e1= arith_expr '!=' e2= arith_expr )";
		}
	}

	public static final BitSet FOLLOW_statement_in_program49 = new BitSet(new long[]{0x0000000000000000L});
	public static final BitSet FOLLOW_EOF_in_program51 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_base_statement_in_statement76 = new BitSet(new long[]{0x0000000000004002L});
	public static final BitSet FOLLOW_14_in_statement94 = new BitSet(new long[]{0x0000000000900010L});
	public static final BitSet FOLLOW_base_statement_in_statement98 = new BitSet(new long[]{0x0000000000004002L});
	public static final BitSet FOLLOW_ID_in_base_statement124 = new BitSet(new long[]{0x0000000000002000L});
	public static final BitSet FOLLOW_13_in_base_statement126 = new BitSet(new long[]{0x0000000000000030L});
	public static final BitSet FOLLOW_arith_expr_in_base_statement130 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_20_in_base_statement161 = new BitSet(new long[]{0x00000000004800B0L});
	public static final BitSet FOLLOW_bool_expr_in_base_statement165 = new BitSet(new long[]{0x0000000000200000L});
	public static final BitSet FOLLOW_21_in_base_statement167 = new BitSet(new long[]{0x0000000000900010L});
	public static final BitSet FOLLOW_base_statement_in_base_statement171 = new BitSet(new long[]{0x0000000000040000L});
	public static final BitSet FOLLOW_18_in_base_statement179 = new BitSet(new long[]{0x0000000000900010L});
	public static final BitSet FOLLOW_base_statement_in_base_statement183 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_23_in_base_statement210 = new BitSet(new long[]{0x0000000000900010L});
	public static final BitSet FOLLOW_statement_in_base_statement214 = new BitSet(new long[]{0x0000000001000000L});
	public static final BitSet FOLLOW_24_in_base_statement216 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_literal_in_bool_expr263 = new BitSet(new long[]{0x0000000000000202L});
	public static final BitSet FOLLOW_9_in_bool_expr281 = new BitSet(new long[]{0x00000000004800B0L});
	public static final BitSet FOLLOW_literal_in_bool_expr285 = new BitSet(new long[]{0x0000000000000202L});
	public static final BitSet FOLLOW_22_in_literal311 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_19_in_literal349 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_arith_expr_in_literal389 = new BitSet(new long[]{0x0000000000010000L});
	public static final BitSet FOLLOW_16_in_literal391 = new BitSet(new long[]{0x0000000000000030L});
	public static final BitSet FOLLOW_arith_expr_in_literal395 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_arith_expr_in_literal410 = new BitSet(new long[]{0x0000000000008000L});
	public static final BitSet FOLLOW_15_in_literal412 = new BitSet(new long[]{0x0000000000000030L});
	public static final BitSet FOLLOW_arith_expr_in_literal416 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_arith_expr_in_literal430 = new BitSet(new long[]{0x0000000000020000L});
	public static final BitSet FOLLOW_17_in_literal432 = new BitSet(new long[]{0x0000000000000030L});
	public static final BitSet FOLLOW_arith_expr_in_literal436 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_arith_expr_in_literal450 = new BitSet(new long[]{0x0000000000000100L});
	public static final BitSet FOLLOW_8_in_literal452 = new BitSet(new long[]{0x0000000000000030L});
	public static final BitSet FOLLOW_arith_expr_in_literal456 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_7_in_literal468 = new BitSet(new long[]{0x00000000004800B0L});
	public static final BitSet FOLLOW_literal_in_literal472 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_mult_arith_expr_in_arith_expr497 = new BitSet(new long[]{0x0000000000001802L});
	public static final BitSet FOLLOW_11_in_arith_expr515 = new BitSet(new long[]{0x0000000000000030L});
	public static final BitSet FOLLOW_mult_arith_expr_in_arith_expr519 = new BitSet(new long[]{0x0000000000001802L});
	public static final BitSet FOLLOW_12_in_arith_expr532 = new BitSet(new long[]{0x0000000000000030L});
	public static final BitSet FOLLOW_mult_arith_expr_in_arith_expr536 = new BitSet(new long[]{0x0000000000001802L});
	public static final BitSet FOLLOW_base_arith_expr_in_mult_arith_expr564 = new BitSet(new long[]{0x0000000000000402L});
	public static final BitSet FOLLOW_10_in_mult_arith_expr582 = new BitSet(new long[]{0x0000000000000030L});
	public static final BitSet FOLLOW_base_arith_expr_in_mult_arith_expr586 = new BitSet(new long[]{0x0000000000000402L});
	public static final BitSet FOLLOW_NUM_in_base_arith_expr612 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_ID_in_base_arith_expr622 = new BitSet(new long[]{0x0000000000000002L});
}
