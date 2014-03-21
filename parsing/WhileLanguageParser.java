// $ANTLR 3.5 while_language/parsing/WhileLanguage.g 2014-03-21 18:04:49

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
		"'&&'", "'*'", "'+'", "'-'", "':='", "';'", "'<='", "'='", "'>='", "'do'", 
		"'else'", "'false'", "'if'", "'then'", "'true'", "'while'", "'{'", "'||'", 
		"'}'"
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
	public static final int T__27=27;
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
	// while_language/parsing/WhileLanguage.g:28:1: base_statement returns [Statement value] : ( ID ':=' e= arith_expr | ( 'if' c= bool_expr 'then' s1= base_statement 'else' s2= base_statement | 'while' c= bool_expr 'do' s1= base_statement ) | '{' s= statement '}' );
	public final Statement base_statement() throws RecognitionException {
		Statement value = null;


		Token ID1=null;
		ArithExpr e =null;
		BoolExpr c =null;
		Statement s1 =null;
		Statement s2 =null;
		Statement s =null;

		try {
			// while_language/parsing/WhileLanguage.g:29:5: ( ID ':=' e= arith_expr | ( 'if' c= bool_expr 'then' s1= base_statement 'else' s2= base_statement | 'while' c= bool_expr 'do' s1= base_statement ) | '{' s= statement '}' )
			int alt3=3;
			switch ( input.LA(1) ) {
			case ID:
				{
				alt3=1;
				}
				break;
			case 21:
			case 24:
				{
				alt3=2;
				}
				break;
			case 25:
				{
				alt3=3;
				}
				break;
			default:
				NoViableAltException nvae =
					new NoViableAltException("", 3, 0, input);
				throw nvae;
			}
			switch (alt3) {
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
					// while_language/parsing/WhileLanguage.g:30:7: ( 'if' c= bool_expr 'then' s1= base_statement 'else' s2= base_statement | 'while' c= bool_expr 'do' s1= base_statement )
					{
					// while_language/parsing/WhileLanguage.g:30:7: ( 'if' c= bool_expr 'then' s1= base_statement 'else' s2= base_statement | 'while' c= bool_expr 'do' s1= base_statement )
					int alt2=2;
					int LA2_0 = input.LA(1);
					if ( (LA2_0==21) ) {
						alt2=1;
					}
					else if ( (LA2_0==24) ) {
						alt2=2;
					}

					else {
						NoViableAltException nvae =
							new NoViableAltException("", 2, 0, input);
						throw nvae;
					}

					switch (alt2) {
						case 1 :
							// while_language/parsing/WhileLanguage.g:30:8: 'if' c= bool_expr 'then' s1= base_statement 'else' s2= base_statement
							{
							match(input,21,FOLLOW_21_in_base_statement162); 
							pushFollow(FOLLOW_bool_expr_in_base_statement166);
							c=bool_expr();
							state._fsp--;

							match(input,22,FOLLOW_22_in_base_statement168); 
							pushFollow(FOLLOW_base_statement_in_base_statement172);
							s1=base_statement();
							state._fsp--;

							match(input,19,FOLLOW_19_in_base_statement180); 
							pushFollow(FOLLOW_base_statement_in_base_statement184);
							s2=base_statement();
							state._fsp--;

							 value = new IfStatement(c,s1,s2); 
							}
							break;
						case 2 :
							// while_language/parsing/WhileLanguage.g:32:8: 'while' c= bool_expr 'do' s1= base_statement
							{
							match(input,24,FOLLOW_24_in_base_statement212); 
							pushFollow(FOLLOW_bool_expr_in_base_statement216);
							c=bool_expr();
							state._fsp--;

							match(input,18,FOLLOW_18_in_base_statement218); 
							pushFollow(FOLLOW_base_statement_in_base_statement222);
							s1=base_statement();
							state._fsp--;

							 value = new WhileStatement(c,s1); 
							}
							break;

					}

					}
					break;
				case 3 :
					// while_language/parsing/WhileLanguage.g:33:7: '{' s= statement '}'
					{
					match(input,25,FOLLOW_25_in_base_statement233); 
					pushFollow(FOLLOW_statement_in_base_statement237);
					s=statement();
					state._fsp--;

					match(input,27,FOLLOW_27_in_base_statement239); 
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
	// while_language/parsing/WhileLanguage.g:36:1: bool_expr returns [BoolExpr value] : e= negation_expr ( '&&' e= negation_expr | '||' e= negation_expr )* ;
	public final BoolExpr bool_expr() throws RecognitionException {
		BoolExpr value = null;


		BoolExpr e =null;

		try {
			// while_language/parsing/WhileLanguage.g:37:5: (e= negation_expr ( '&&' e= negation_expr | '||' e= negation_expr )* )
			// while_language/parsing/WhileLanguage.g:37:7: e= negation_expr ( '&&' e= negation_expr | '||' e= negation_expr )*
			{
			pushFollow(FOLLOW_negation_expr_in_bool_expr290);
			e=negation_expr();
			state._fsp--;

			 value = e; 
			// while_language/parsing/WhileLanguage.g:38:7: ( '&&' e= negation_expr | '||' e= negation_expr )*
			loop4:
			while (true) {
				int alt4=3;
				int LA4_0 = input.LA(1);
				if ( (LA4_0==9) ) {
					alt4=1;
				}
				else if ( (LA4_0==26) ) {
					alt4=2;
				}

				switch (alt4) {
				case 1 :
					// while_language/parsing/WhileLanguage.g:38:9: '&&' e= negation_expr
					{
					match(input,9,FOLLOW_9_in_bool_expr308); 
					pushFollow(FOLLOW_negation_expr_in_bool_expr312);
					e=negation_expr();
					state._fsp--;

					 value = new AndExpr(value,e); 
					}
					break;
				case 2 :
					// while_language/parsing/WhileLanguage.g:39:9: '||' e= negation_expr
					{
					match(input,26,FOLLOW_26_in_bool_expr324); 
					pushFollow(FOLLOW_negation_expr_in_bool_expr328);
					e=negation_expr();
					state._fsp--;

					 value = new OrExpr(value,e); 
					}
					break;

				default :
					break loop4;
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



	// $ANTLR start "negation_expr"
	// while_language/parsing/WhileLanguage.g:42:1: negation_expr returns [BoolExpr value] : e= literal ( '!' e= literal )* ;
	public final BoolExpr negation_expr() throws RecognitionException {
		BoolExpr value = null;


		BoolExpr e =null;

		try {
			// while_language/parsing/WhileLanguage.g:43:5: (e= literal ( '!' e= literal )* )
			// while_language/parsing/WhileLanguage.g:43:7: e= literal ( '!' e= literal )*
			{
			pushFollow(FOLLOW_literal_in_negation_expr359);
			e=literal();
			state._fsp--;

			 value = e; 
			// while_language/parsing/WhileLanguage.g:44:7: ( '!' e= literal )*
			loop5:
			while (true) {
				int alt5=2;
				int LA5_0 = input.LA(1);
				if ( (LA5_0==7) ) {
					alt5=1;
				}

				switch (alt5) {
				case 1 :
					// while_language/parsing/WhileLanguage.g:44:9: '!' e= literal
					{
					match(input,7,FOLLOW_7_in_negation_expr377); 
					pushFollow(FOLLOW_literal_in_negation_expr381);
					e=literal();
					state._fsp--;

					 value = new AndExpr(value,e); 
					}
					break;

				default :
					break loop5;
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
	// $ANTLR end "negation_expr"



	// $ANTLR start "literal"
	// while_language/parsing/WhileLanguage.g:47:1: literal returns [BoolExpr value] : ( 'true' | 'false' | (e1= arith_expr '=' e2= arith_expr |e1= arith_expr '<=' e2= arith_expr |e1= arith_expr '>=' e2= arith_expr |e1= arith_expr '!=' e2= arith_expr ) | '!' e= literal );
	public final BoolExpr literal() throws RecognitionException {
		BoolExpr value = null;


		ArithExpr e1 =null;
		ArithExpr e2 =null;
		BoolExpr e =null;

		try {
			// while_language/parsing/WhileLanguage.g:48:5: ( 'true' | 'false' | (e1= arith_expr '=' e2= arith_expr |e1= arith_expr '<=' e2= arith_expr |e1= arith_expr '>=' e2= arith_expr |e1= arith_expr '!=' e2= arith_expr ) | '!' e= literal )
			int alt7=4;
			switch ( input.LA(1) ) {
			case 23:
				{
				alt7=1;
				}
				break;
			case 20:
				{
				alt7=2;
				}
				break;
			case ID:
			case NUM:
				{
				alt7=3;
				}
				break;
			case 7:
				{
				alt7=4;
				}
				break;
			default:
				NoViableAltException nvae =
					new NoViableAltException("", 7, 0, input);
				throw nvae;
			}
			switch (alt7) {
				case 1 :
					// while_language/parsing/WhileLanguage.g:48:7: 'true'
					{
					match(input,23,FOLLOW_23_in_literal408); 
					 value = new BoolValueExpr(true); 
					}
					break;
				case 2 :
					// while_language/parsing/WhileLanguage.g:49:7: 'false'
					{
					match(input,20,FOLLOW_20_in_literal446); 
					 value = new BoolValueExpr(false); 
					}
					break;
				case 3 :
					// while_language/parsing/WhileLanguage.g:50:7: (e1= arith_expr '=' e2= arith_expr |e1= arith_expr '<=' e2= arith_expr |e1= arith_expr '>=' e2= arith_expr |e1= arith_expr '!=' e2= arith_expr )
					{
					// while_language/parsing/WhileLanguage.g:50:7: (e1= arith_expr '=' e2= arith_expr |e1= arith_expr '<=' e2= arith_expr |e1= arith_expr '>=' e2= arith_expr |e1= arith_expr '!=' e2= arith_expr )
					int alt6=4;
					alt6 = dfa6.predict(input);
					switch (alt6) {
						case 1 :
							// while_language/parsing/WhileLanguage.g:50:8: e1= arith_expr '=' e2= arith_expr
							{
							pushFollow(FOLLOW_arith_expr_in_literal486);
							e1=arith_expr();
							state._fsp--;

							match(input,16,FOLLOW_16_in_literal488); 
							pushFollow(FOLLOW_arith_expr_in_literal492);
							e2=arith_expr();
							state._fsp--;

							 value = new ComparisonExpr(e1,e2, 1); 
							}
							break;
						case 2 :
							// while_language/parsing/WhileLanguage.g:51:8: e1= arith_expr '<=' e2= arith_expr
							{
							pushFollow(FOLLOW_arith_expr_in_literal507);
							e1=arith_expr();
							state._fsp--;

							match(input,15,FOLLOW_15_in_literal509); 
							pushFollow(FOLLOW_arith_expr_in_literal513);
							e2=arith_expr();
							state._fsp--;

							 value = new ComparisonExpr(e1,e2, 2); 
							}
							break;
						case 3 :
							// while_language/parsing/WhileLanguage.g:52:8: e1= arith_expr '>=' e2= arith_expr
							{
							pushFollow(FOLLOW_arith_expr_in_literal527);
							e1=arith_expr();
							state._fsp--;

							match(input,17,FOLLOW_17_in_literal529); 
							pushFollow(FOLLOW_arith_expr_in_literal533);
							e2=arith_expr();
							state._fsp--;

							 value = new ComparisonExpr(e1,e2, 3); 
							}
							break;
						case 4 :
							// while_language/parsing/WhileLanguage.g:53:8: e1= arith_expr '!=' e2= arith_expr
							{
							pushFollow(FOLLOW_arith_expr_in_literal547);
							e1=arith_expr();
							state._fsp--;

							match(input,8,FOLLOW_8_in_literal549); 
							pushFollow(FOLLOW_arith_expr_in_literal553);
							e2=arith_expr();
							state._fsp--;

							 value = new ComparisonExpr(e1,e2, 4); 
							}
							break;

					}

					}
					break;
				case 4 :
					// while_language/parsing/WhileLanguage.g:54:7: '!' e= literal
					{
					match(input,7,FOLLOW_7_in_literal565); 
					pushFollow(FOLLOW_literal_in_literal569);
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
	// while_language/parsing/WhileLanguage.g:57:1: arith_expr returns [ArithExpr value] : e= mult_arith_expr ( '+' e= mult_arith_expr | '-' e= mult_arith_expr )* ;
	public final ArithExpr arith_expr() throws RecognitionException {
		ArithExpr value = null;


		ArithExpr e =null;

		try {
			// while_language/parsing/WhileLanguage.g:58:5: (e= mult_arith_expr ( '+' e= mult_arith_expr | '-' e= mult_arith_expr )* )
			// while_language/parsing/WhileLanguage.g:58:7: e= mult_arith_expr ( '+' e= mult_arith_expr | '-' e= mult_arith_expr )*
			{
			pushFollow(FOLLOW_mult_arith_expr_in_arith_expr594);
			e=mult_arith_expr();
			state._fsp--;

			 value = e; 
			// while_language/parsing/WhileLanguage.g:59:7: ( '+' e= mult_arith_expr | '-' e= mult_arith_expr )*
			loop8:
			while (true) {
				int alt8=3;
				int LA8_0 = input.LA(1);
				if ( (LA8_0==11) ) {
					alt8=1;
				}
				else if ( (LA8_0==12) ) {
					alt8=2;
				}

				switch (alt8) {
				case 1 :
					// while_language/parsing/WhileLanguage.g:59:9: '+' e= mult_arith_expr
					{
					match(input,11,FOLLOW_11_in_arith_expr612); 
					pushFollow(FOLLOW_mult_arith_expr_in_arith_expr616);
					e=mult_arith_expr();
					state._fsp--;

					 value = new PlusExpr(value,e); 
					}
					break;
				case 2 :
					// while_language/parsing/WhileLanguage.g:60:9: '-' e= mult_arith_expr
					{
					match(input,12,FOLLOW_12_in_arith_expr629); 
					pushFollow(FOLLOW_mult_arith_expr_in_arith_expr633);
					e=mult_arith_expr();
					state._fsp--;

					 value = new MinusExpr(value,e); 
					}
					break;

				default :
					break loop8;
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
	// while_language/parsing/WhileLanguage.g:63:1: mult_arith_expr returns [ArithExpr value] : e= base_arith_expr ( '*' e= base_arith_expr )* ;
	public final ArithExpr mult_arith_expr() throws RecognitionException {
		ArithExpr value = null;


		ArithExpr e =null;

		try {
			// while_language/parsing/WhileLanguage.g:64:5: (e= base_arith_expr ( '*' e= base_arith_expr )* )
			// while_language/parsing/WhileLanguage.g:64:7: e= base_arith_expr ( '*' e= base_arith_expr )*
			{
			pushFollow(FOLLOW_base_arith_expr_in_mult_arith_expr661);
			e=base_arith_expr();
			state._fsp--;

			 value = e; 
			// while_language/parsing/WhileLanguage.g:65:7: ( '*' e= base_arith_expr )*
			loop9:
			while (true) {
				int alt9=2;
				int LA9_0 = input.LA(1);
				if ( (LA9_0==10) ) {
					alt9=1;
				}

				switch (alt9) {
				case 1 :
					// while_language/parsing/WhileLanguage.g:65:9: '*' e= base_arith_expr
					{
					match(input,10,FOLLOW_10_in_mult_arith_expr679); 
					pushFollow(FOLLOW_base_arith_expr_in_mult_arith_expr683);
					e=base_arith_expr();
					state._fsp--;

					 value = new MultExpr(value,e); 
					}
					break;

				default :
					break loop9;
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
	// while_language/parsing/WhileLanguage.g:68:1: base_arith_expr returns [ArithExpr value] : ( NUM | ID );
	public final ArithExpr base_arith_expr() throws RecognitionException {
		ArithExpr value = null;


		Token NUM2=null;
		Token ID3=null;

		try {
			// while_language/parsing/WhileLanguage.g:69:5: ( NUM | ID )
			int alt10=2;
			int LA10_0 = input.LA(1);
			if ( (LA10_0==NUM) ) {
				alt10=1;
			}
			else if ( (LA10_0==ID) ) {
				alt10=2;
			}

			else {
				NoViableAltException nvae =
					new NoViableAltException("", 10, 0, input);
				throw nvae;
			}

			switch (alt10) {
				case 1 :
					// while_language/parsing/WhileLanguage.g:69:7: NUM
					{
					NUM2=(Token)match(input,NUM,FOLLOW_NUM_in_base_arith_expr709); 
					 value = new NumExpr(Integer.parseInt(NUM2.getText())); 
					}
					break;
				case 2 :
					// while_language/parsing/WhileLanguage.g:70:7: ID
					{
					ID3=(Token)match(input,ID,FOLLOW_ID_in_base_arith_expr719); 
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


	protected DFA6 dfa6 = new DFA6(this);
	static final String DFA6_eotS =
		"\26\uffff";
	static final String DFA6_eofS =
		"\26\uffff";
	static final String DFA6_minS =
		"\1\4\2\10\3\4\4\uffff\6\10\2\4\4\10";
	static final String DFA6_maxS =
		"\1\5\2\21\3\5\4\uffff\6\21\2\5\4\21";
	static final String DFA6_acceptS =
		"\6\uffff\1\1\1\2\1\3\1\4\14\uffff";
	static final String DFA6_specialS =
		"\26\uffff}>";
	static final String[] DFA6_transitionS = {
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

	static final short[] DFA6_eot = DFA.unpackEncodedString(DFA6_eotS);
	static final short[] DFA6_eof = DFA.unpackEncodedString(DFA6_eofS);
	static final char[] DFA6_min = DFA.unpackEncodedStringToUnsignedChars(DFA6_minS);
	static final char[] DFA6_max = DFA.unpackEncodedStringToUnsignedChars(DFA6_maxS);
	static final short[] DFA6_accept = DFA.unpackEncodedString(DFA6_acceptS);
	static final short[] DFA6_special = DFA.unpackEncodedString(DFA6_specialS);
	static final short[][] DFA6_transition;

	static {
		int numStates = DFA6_transitionS.length;
		DFA6_transition = new short[numStates][];
		for (int i=0; i<numStates; i++) {
			DFA6_transition[i] = DFA.unpackEncodedString(DFA6_transitionS[i]);
		}
	}

	protected class DFA6 extends DFA {

		public DFA6(BaseRecognizer recognizer) {
			this.recognizer = recognizer;
			this.decisionNumber = 6;
			this.eot = DFA6_eot;
			this.eof = DFA6_eof;
			this.min = DFA6_min;
			this.max = DFA6_max;
			this.accept = DFA6_accept;
			this.special = DFA6_special;
			this.transition = DFA6_transition;
		}
		@Override
		public String getDescription() {
			return "50:7: (e1= arith_expr '=' e2= arith_expr |e1= arith_expr '<=' e2= arith_expr |e1= arith_expr '>=' e2= arith_expr |e1= arith_expr '!=' e2= arith_expr )";
		}
	}

	public static final BitSet FOLLOW_statement_in_program49 = new BitSet(new long[]{0x0000000000000000L});
	public static final BitSet FOLLOW_EOF_in_program51 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_base_statement_in_statement76 = new BitSet(new long[]{0x0000000000004002L});
	public static final BitSet FOLLOW_14_in_statement94 = new BitSet(new long[]{0x0000000003200010L});
	public static final BitSet FOLLOW_base_statement_in_statement98 = new BitSet(new long[]{0x0000000000004002L});
	public static final BitSet FOLLOW_ID_in_base_statement124 = new BitSet(new long[]{0x0000000000002000L});
	public static final BitSet FOLLOW_13_in_base_statement126 = new BitSet(new long[]{0x0000000000000030L});
	public static final BitSet FOLLOW_arith_expr_in_base_statement130 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_21_in_base_statement162 = new BitSet(new long[]{0x00000000009000B0L});
	public static final BitSet FOLLOW_bool_expr_in_base_statement166 = new BitSet(new long[]{0x0000000000400000L});
	public static final BitSet FOLLOW_22_in_base_statement168 = new BitSet(new long[]{0x0000000003200010L});
	public static final BitSet FOLLOW_base_statement_in_base_statement172 = new BitSet(new long[]{0x0000000000080000L});
	public static final BitSet FOLLOW_19_in_base_statement180 = new BitSet(new long[]{0x0000000003200010L});
	public static final BitSet FOLLOW_base_statement_in_base_statement184 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_24_in_base_statement212 = new BitSet(new long[]{0x00000000009000B0L});
	public static final BitSet FOLLOW_bool_expr_in_base_statement216 = new BitSet(new long[]{0x0000000000040000L});
	public static final BitSet FOLLOW_18_in_base_statement218 = new BitSet(new long[]{0x0000000003200010L});
	public static final BitSet FOLLOW_base_statement_in_base_statement222 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_25_in_base_statement233 = new BitSet(new long[]{0x0000000003200010L});
	public static final BitSet FOLLOW_statement_in_base_statement237 = new BitSet(new long[]{0x0000000008000000L});
	public static final BitSet FOLLOW_27_in_base_statement239 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_negation_expr_in_bool_expr290 = new BitSet(new long[]{0x0000000004000202L});
	public static final BitSet FOLLOW_9_in_bool_expr308 = new BitSet(new long[]{0x00000000009000B0L});
	public static final BitSet FOLLOW_negation_expr_in_bool_expr312 = new BitSet(new long[]{0x0000000004000202L});
	public static final BitSet FOLLOW_26_in_bool_expr324 = new BitSet(new long[]{0x00000000009000B0L});
	public static final BitSet FOLLOW_negation_expr_in_bool_expr328 = new BitSet(new long[]{0x0000000004000202L});
	public static final BitSet FOLLOW_literal_in_negation_expr359 = new BitSet(new long[]{0x0000000000000082L});
	public static final BitSet FOLLOW_7_in_negation_expr377 = new BitSet(new long[]{0x00000000009000B0L});
	public static final BitSet FOLLOW_literal_in_negation_expr381 = new BitSet(new long[]{0x0000000000000082L});
	public static final BitSet FOLLOW_23_in_literal408 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_20_in_literal446 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_arith_expr_in_literal486 = new BitSet(new long[]{0x0000000000010000L});
	public static final BitSet FOLLOW_16_in_literal488 = new BitSet(new long[]{0x0000000000000030L});
	public static final BitSet FOLLOW_arith_expr_in_literal492 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_arith_expr_in_literal507 = new BitSet(new long[]{0x0000000000008000L});
	public static final BitSet FOLLOW_15_in_literal509 = new BitSet(new long[]{0x0000000000000030L});
	public static final BitSet FOLLOW_arith_expr_in_literal513 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_arith_expr_in_literal527 = new BitSet(new long[]{0x0000000000020000L});
	public static final BitSet FOLLOW_17_in_literal529 = new BitSet(new long[]{0x0000000000000030L});
	public static final BitSet FOLLOW_arith_expr_in_literal533 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_arith_expr_in_literal547 = new BitSet(new long[]{0x0000000000000100L});
	public static final BitSet FOLLOW_8_in_literal549 = new BitSet(new long[]{0x0000000000000030L});
	public static final BitSet FOLLOW_arith_expr_in_literal553 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_7_in_literal565 = new BitSet(new long[]{0x00000000009000B0L});
	public static final BitSet FOLLOW_literal_in_literal569 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_mult_arith_expr_in_arith_expr594 = new BitSet(new long[]{0x0000000000001802L});
	public static final BitSet FOLLOW_11_in_arith_expr612 = new BitSet(new long[]{0x0000000000000030L});
	public static final BitSet FOLLOW_mult_arith_expr_in_arith_expr616 = new BitSet(new long[]{0x0000000000001802L});
	public static final BitSet FOLLOW_12_in_arith_expr629 = new BitSet(new long[]{0x0000000000000030L});
	public static final BitSet FOLLOW_mult_arith_expr_in_arith_expr633 = new BitSet(new long[]{0x0000000000001802L});
	public static final BitSet FOLLOW_base_arith_expr_in_mult_arith_expr661 = new BitSet(new long[]{0x0000000000000402L});
	public static final BitSet FOLLOW_10_in_mult_arith_expr679 = new BitSet(new long[]{0x0000000000000030L});
	public static final BitSet FOLLOW_base_arith_expr_in_mult_arith_expr683 = new BitSet(new long[]{0x0000000000000402L});
	public static final BitSet FOLLOW_NUM_in_base_arith_expr709 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_ID_in_base_arith_expr719 = new BitSet(new long[]{0x0000000000000002L});
}
