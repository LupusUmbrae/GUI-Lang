// $ANTLR 3.3 Nov 30, 2010 12:50:56 C:\\Users\\Robin\\eclipse\\guiLang\\gui\\src\\gsl.g 2011-07-13 17:31:36

package parser;


import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

public class gslLexer extends Lexer {
    public static final int EOF=-1;
    public static final int OPEN=4;
    public static final int WINDOW_TAG=5;
    public static final int WS=6;
    public static final int KEY_TAG=7;
    public static final int EQUALS=8;
    public static final int QUOTE=9;
    public static final int STRING_LITERAL=10;
    public static final int COMMA=11;
    public static final int CLOSE=12;
    public static final int SLASH=13;
    public static final int PANEL_TAG=14;
    public static final int TAGS=15;

    // delegates
    // delegators

    public gslLexer() {;} 
    public gslLexer(CharStream input) {
        this(input, new RecognizerSharedState());
    }
    public gslLexer(CharStream input, RecognizerSharedState state) {
        super(input,state);

    }
    public String getGrammarFileName() { return "C:\\Users\\Robin\\eclipse\\guiLang\\gui\\src\\gsl.g"; }

    // $ANTLR start "OPEN"
    public final void mOPEN() throws RecognitionException {
        try {
            int _type = OPEN;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\Robin\\eclipse\\guiLang\\gui\\src\\gsl.g:120:3: ( '<' )
            // C:\\Users\\Robin\\eclipse\\guiLang\\gui\\src\\gsl.g:121:3: '<'
            {
            match('<'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "OPEN"

    // $ANTLR start "CLOSE"
    public final void mCLOSE() throws RecognitionException {
        try {
            int _type = CLOSE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\Robin\\eclipse\\guiLang\\gui\\src\\gsl.g:125:3: ( '>' )
            // C:\\Users\\Robin\\eclipse\\guiLang\\gui\\src\\gsl.g:126:3: '>'
            {
            match('>'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "CLOSE"

    // $ANTLR start "SLASH"
    public final void mSLASH() throws RecognitionException {
        try {
            int _type = SLASH;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\Robin\\eclipse\\guiLang\\gui\\src\\gsl.g:130:3: ( '/' )
            // C:\\Users\\Robin\\eclipse\\guiLang\\gui\\src\\gsl.g:131:3: '/'
            {
            match('/'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "SLASH"

    // $ANTLR start "WINDOW_TAG"
    public final void mWINDOW_TAG() throws RecognitionException {
        try {
            int _type = WINDOW_TAG;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\Robin\\eclipse\\guiLang\\gui\\src\\gsl.g:135:3: ( 'window' )
            // C:\\Users\\Robin\\eclipse\\guiLang\\gui\\src\\gsl.g:136:3: 'window'
            {
            match("window"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "WINDOW_TAG"

    // $ANTLR start "PANEL_TAG"
    public final void mPANEL_TAG() throws RecognitionException {
        try {
            int _type = PANEL_TAG;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\Robin\\eclipse\\guiLang\\gui\\src\\gsl.g:140:3: ( 'panel' )
            // C:\\Users\\Robin\\eclipse\\guiLang\\gui\\src\\gsl.g:141:3: 'panel'
            {
            match("panel"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "PANEL_TAG"

    // $ANTLR start "COMMA"
    public final void mCOMMA() throws RecognitionException {
        try {
            int _type = COMMA;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\Robin\\eclipse\\guiLang\\gui\\src\\gsl.g:145:3: ( ',' )
            // C:\\Users\\Robin\\eclipse\\guiLang\\gui\\src\\gsl.g:146:3: ','
            {
            match(','); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "COMMA"

    // $ANTLR start "EQUALS"
    public final void mEQUALS() throws RecognitionException {
        try {
            int _type = EQUALS;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\Robin\\eclipse\\guiLang\\gui\\src\\gsl.g:150:3: ( '=' )
            // C:\\Users\\Robin\\eclipse\\guiLang\\gui\\src\\gsl.g:151:3: '='
            {
            match('='); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "EQUALS"

    // $ANTLR start "QUOTE"
    public final void mQUOTE() throws RecognitionException {
        try {
            int _type = QUOTE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\Robin\\eclipse\\guiLang\\gui\\src\\gsl.g:155:3: ( '\"' )
            // C:\\Users\\Robin\\eclipse\\guiLang\\gui\\src\\gsl.g:156:3: '\"'
            {
            match('\"'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "QUOTE"

    // $ANTLR start "TAGS"
    public final void mTAGS() throws RecognitionException {
        try {
            int _type = TAGS;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\Robin\\eclipse\\guiLang\\gui\\src\\gsl.g:160:3: ( ( 'label' | 'button' ) )
            // C:\\Users\\Robin\\eclipse\\guiLang\\gui\\src\\gsl.g:161:3: ( 'label' | 'button' )
            {
            // C:\\Users\\Robin\\eclipse\\guiLang\\gui\\src\\gsl.g:161:3: ( 'label' | 'button' )
            int alt1=2;
            int LA1_0 = input.LA(1);

            if ( (LA1_0=='l') ) {
                alt1=1;
            }
            else if ( (LA1_0=='b') ) {
                alt1=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 1, 0, input);

                throw nvae;
            }
            switch (alt1) {
                case 1 :
                    // C:\\Users\\Robin\\eclipse\\guiLang\\gui\\src\\gsl.g:162:5: 'label'
                    {
                    match("label"); 


                    }
                    break;
                case 2 :
                    // C:\\Users\\Robin\\eclipse\\guiLang\\gui\\src\\gsl.g:163:7: 'button'
                    {
                    match("button"); 


                    }
                    break;

            }


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "TAGS"

    // $ANTLR start "KEY_TAG"
    public final void mKEY_TAG() throws RecognitionException {
        try {
            int _type = KEY_TAG;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\Robin\\eclipse\\guiLang\\gui\\src\\gsl.g:168:3: ( ( 'ID' | 'id' | 'Id' | 'NAME' | 'name' | 'Name' ) )
            // C:\\Users\\Robin\\eclipse\\guiLang\\gui\\src\\gsl.g:169:3: ( 'ID' | 'id' | 'Id' | 'NAME' | 'name' | 'Name' )
            {
            // C:\\Users\\Robin\\eclipse\\guiLang\\gui\\src\\gsl.g:169:3: ( 'ID' | 'id' | 'Id' | 'NAME' | 'name' | 'Name' )
            int alt2=6;
            switch ( input.LA(1) ) {
            case 'I':
                {
                int LA2_1 = input.LA(2);

                if ( (LA2_1=='D') ) {
                    alt2=1;
                }
                else if ( (LA2_1=='d') ) {
                    alt2=3;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 2, 1, input);

                    throw nvae;
                }
                }
                break;
            case 'i':
                {
                alt2=2;
                }
                break;
            case 'N':
                {
                int LA2_3 = input.LA(2);

                if ( (LA2_3=='A') ) {
                    alt2=4;
                }
                else if ( (LA2_3=='a') ) {
                    alt2=6;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 2, 3, input);

                    throw nvae;
                }
                }
                break;
            case 'n':
                {
                alt2=5;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 2, 0, input);

                throw nvae;
            }

            switch (alt2) {
                case 1 :
                    // C:\\Users\\Robin\\eclipse\\guiLang\\gui\\src\\gsl.g:170:5: 'ID'
                    {
                    match("ID"); 


                    }
                    break;
                case 2 :
                    // C:\\Users\\Robin\\eclipse\\guiLang\\gui\\src\\gsl.g:171:7: 'id'
                    {
                    match("id"); 


                    }
                    break;
                case 3 :
                    // C:\\Users\\Robin\\eclipse\\guiLang\\gui\\src\\gsl.g:172:7: 'Id'
                    {
                    match("Id"); 


                    }
                    break;
                case 4 :
                    // C:\\Users\\Robin\\eclipse\\guiLang\\gui\\src\\gsl.g:173:7: 'NAME'
                    {
                    match("NAME"); 


                    }
                    break;
                case 5 :
                    // C:\\Users\\Robin\\eclipse\\guiLang\\gui\\src\\gsl.g:174:7: 'name'
                    {
                    match("name"); 


                    }
                    break;
                case 6 :
                    // C:\\Users\\Robin\\eclipse\\guiLang\\gui\\src\\gsl.g:175:7: 'Name'
                    {
                    match("Name"); 


                    }
                    break;

            }


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "KEY_TAG"

    // $ANTLR start "WS"
    public final void mWS() throws RecognitionException {
        try {
            int _type = WS;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\Robin\\eclipse\\guiLang\\gui\\src\\gsl.g:180:3: ( ( ' ' | '\\t' | '\\r' | '\\n' | '\\u000C' )+ )
            // C:\\Users\\Robin\\eclipse\\guiLang\\gui\\src\\gsl.g:181:3: ( ' ' | '\\t' | '\\r' | '\\n' | '\\u000C' )+
            {
            // C:\\Users\\Robin\\eclipse\\guiLang\\gui\\src\\gsl.g:181:3: ( ' ' | '\\t' | '\\r' | '\\n' | '\\u000C' )+
            int cnt3=0;
            loop3:
            do {
                int alt3=2;
                int LA3_0 = input.LA(1);

                if ( ((LA3_0>='\t' && LA3_0<='\n')||(LA3_0>='\f' && LA3_0<='\r')||LA3_0==' ') ) {
                    alt3=1;
                }


                switch (alt3) {
            	case 1 :
            	    // C:\\Users\\Robin\\eclipse\\guiLang\\gui\\src\\gsl.g:
            	    {
            	    if ( (input.LA(1)>='\t' && input.LA(1)<='\n')||(input.LA(1)>='\f' && input.LA(1)<='\r')||input.LA(1)==' ' ) {
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


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "WS"

    // $ANTLR start "STRING_LITERAL"
    public final void mSTRING_LITERAL() throws RecognitionException {
        try {
            int _type = STRING_LITERAL;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\Robin\\eclipse\\guiLang\\gui\\src\\gsl.g:191:3: ( ( 'a' .. 'z' | 'A' .. 'Z' | '0' .. '9' )+ )
            // C:\\Users\\Robin\\eclipse\\guiLang\\gui\\src\\gsl.g:192:3: ( 'a' .. 'z' | 'A' .. 'Z' | '0' .. '9' )+
            {
            // C:\\Users\\Robin\\eclipse\\guiLang\\gui\\src\\gsl.g:192:3: ( 'a' .. 'z' | 'A' .. 'Z' | '0' .. '9' )+
            int cnt4=0;
            loop4:
            do {
                int alt4=2;
                int LA4_0 = input.LA(1);

                if ( ((LA4_0>='0' && LA4_0<='9')||(LA4_0>='A' && LA4_0<='Z')||(LA4_0>='a' && LA4_0<='z')) ) {
                    alt4=1;
                }


                switch (alt4) {
            	case 1 :
            	    // C:\\Users\\Robin\\eclipse\\guiLang\\gui\\src\\gsl.g:
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
            	    if ( cnt4 >= 1 ) break loop4;
                        EarlyExitException eee =
                            new EarlyExitException(4, input);
                        throw eee;
                }
                cnt4++;
            } while (true);


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "STRING_LITERAL"

    public void mTokens() throws RecognitionException {
        // C:\\Users\\Robin\\eclipse\\guiLang\\gui\\src\\gsl.g:1:8: ( OPEN | CLOSE | SLASH | WINDOW_TAG | PANEL_TAG | COMMA | EQUALS | QUOTE | TAGS | KEY_TAG | WS | STRING_LITERAL )
        int alt5=12;
        alt5 = dfa5.predict(input);
        switch (alt5) {
            case 1 :
                // C:\\Users\\Robin\\eclipse\\guiLang\\gui\\src\\gsl.g:1:10: OPEN
                {
                mOPEN(); 

                }
                break;
            case 2 :
                // C:\\Users\\Robin\\eclipse\\guiLang\\gui\\src\\gsl.g:1:15: CLOSE
                {
                mCLOSE(); 

                }
                break;
            case 3 :
                // C:\\Users\\Robin\\eclipse\\guiLang\\gui\\src\\gsl.g:1:21: SLASH
                {
                mSLASH(); 

                }
                break;
            case 4 :
                // C:\\Users\\Robin\\eclipse\\guiLang\\gui\\src\\gsl.g:1:27: WINDOW_TAG
                {
                mWINDOW_TAG(); 

                }
                break;
            case 5 :
                // C:\\Users\\Robin\\eclipse\\guiLang\\gui\\src\\gsl.g:1:38: PANEL_TAG
                {
                mPANEL_TAG(); 

                }
                break;
            case 6 :
                // C:\\Users\\Robin\\eclipse\\guiLang\\gui\\src\\gsl.g:1:48: COMMA
                {
                mCOMMA(); 

                }
                break;
            case 7 :
                // C:\\Users\\Robin\\eclipse\\guiLang\\gui\\src\\gsl.g:1:54: EQUALS
                {
                mEQUALS(); 

                }
                break;
            case 8 :
                // C:\\Users\\Robin\\eclipse\\guiLang\\gui\\src\\gsl.g:1:61: QUOTE
                {
                mQUOTE(); 

                }
                break;
            case 9 :
                // C:\\Users\\Robin\\eclipse\\guiLang\\gui\\src\\gsl.g:1:67: TAGS
                {
                mTAGS(); 

                }
                break;
            case 10 :
                // C:\\Users\\Robin\\eclipse\\guiLang\\gui\\src\\gsl.g:1:72: KEY_TAG
                {
                mKEY_TAG(); 

                }
                break;
            case 11 :
                // C:\\Users\\Robin\\eclipse\\guiLang\\gui\\src\\gsl.g:1:80: WS
                {
                mWS(); 

                }
                break;
            case 12 :
                // C:\\Users\\Robin\\eclipse\\guiLang\\gui\\src\\gsl.g:1:83: STRING_LITERAL
                {
                mSTRING_LITERAL(); 

                }
                break;

        }

    }


    protected DFA5 dfa5 = new DFA5(this);
    static final String DFA5_eotS =
        "\4\uffff\2\20\3\uffff\6\20\2\uffff\4\20\3\37\7\20\1\uffff\7\20"+
        "\3\37\1\20\1\57\1\60\1\20\1\62\2\uffff\1\60\1\uffff";
    static final String DFA5_eofS =
        "\63\uffff";
    static final String DFA5_minS =
        "\1\11\3\uffff\1\151\1\141\3\uffff\1\141\1\165\1\104\1\144\1\101"+
        "\1\141\2\uffff\2\156\1\142\1\164\3\60\1\115\2\155\1\144\2\145\1"+
        "\164\1\uffff\1\105\2\145\1\157\2\154\1\157\3\60\1\167\2\60\1\156"+
        "\1\60\2\uffff\1\60\1\uffff";
    static final String DFA5_maxS =
        "\1\172\3\uffff\1\151\1\141\3\uffff\1\141\1\165\2\144\2\141\2\uffff"+
        "\2\156\1\142\1\164\3\172\1\115\2\155\1\144\2\145\1\164\1\uffff\1"+
        "\105\2\145\1\157\2\154\1\157\3\172\1\167\2\172\1\156\1\172\2\uffff"+
        "\1\172\1\uffff";
    static final String DFA5_acceptS =
        "\1\uffff\1\1\1\2\1\3\2\uffff\1\6\1\7\1\10\6\uffff\1\13\1\14\16"+
        "\uffff\1\12\17\uffff\1\5\1\11\1\uffff\1\4";
    static final String DFA5_specialS =
        "\63\uffff}>";
    static final String[] DFA5_transitionS = {
            "\2\17\1\uffff\2\17\22\uffff\1\17\1\uffff\1\10\11\uffff\1\6"+
            "\2\uffff\1\3\12\20\2\uffff\1\1\1\7\1\2\2\uffff\10\20\1\13\4"+
            "\20\1\15\14\20\6\uffff\1\20\1\12\6\20\1\14\2\20\1\11\1\20\1"+
            "\16\1\20\1\5\6\20\1\4\3\20",
            "",
            "",
            "",
            "\1\21",
            "\1\22",
            "",
            "",
            "",
            "\1\23",
            "\1\24",
            "\1\25\37\uffff\1\26",
            "\1\27",
            "\1\30\37\uffff\1\31",
            "\1\32",
            "",
            "",
            "\1\33",
            "\1\34",
            "\1\35",
            "\1\36",
            "\12\20\7\uffff\32\20\6\uffff\32\20",
            "\12\20\7\uffff\32\20\6\uffff\32\20",
            "\12\20\7\uffff\32\20\6\uffff\32\20",
            "\1\40",
            "\1\41",
            "\1\42",
            "\1\43",
            "\1\44",
            "\1\45",
            "\1\46",
            "",
            "\1\47",
            "\1\50",
            "\1\51",
            "\1\52",
            "\1\53",
            "\1\54",
            "\1\55",
            "\12\20\7\uffff\32\20\6\uffff\32\20",
            "\12\20\7\uffff\32\20\6\uffff\32\20",
            "\12\20\7\uffff\32\20\6\uffff\32\20",
            "\1\56",
            "\12\20\7\uffff\32\20\6\uffff\32\20",
            "\12\20\7\uffff\32\20\6\uffff\32\20",
            "\1\61",
            "\12\20\7\uffff\32\20\6\uffff\32\20",
            "",
            "",
            "\12\20\7\uffff\32\20\6\uffff\32\20",
            ""
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
            return "1:1: Tokens : ( OPEN | CLOSE | SLASH | WINDOW_TAG | PANEL_TAG | COMMA | EQUALS | QUOTE | TAGS | KEY_TAG | WS | STRING_LITERAL );";
        }
    }
 

}