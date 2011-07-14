// $ANTLR 3.3 Nov 30, 2010 12:50:56 C:\\Users\\Robin\\eclipse\\guiLang\\gui\\src\\gss.g 2011-07-13 09:50:23

package parser;


import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

public class gssLexer extends Lexer {
    public static final int EOF=-1;
    public static final int STRING_LITERAL=4;
    public static final int OPEN=5;
    public static final int WS=6;
    public static final int CLOSE=7;
    public static final int ATTRIBUTES=8;
    public static final int EQUALS=9;
    public static final int EOL=10;

    // delegates
    // delegators

    public gssLexer() {;} 
    public gssLexer(CharStream input) {
        this(input, new RecognizerSharedState());
    }
    public gssLexer(CharStream input, RecognizerSharedState state) {
        super(input,state);

    }
    public String getGrammarFileName() { return "C:\\Users\\Robin\\eclipse\\guiLang\\gui\\src\\gss.g"; }

    // $ANTLR start "OPEN"
    public final void mOPEN() throws RecognitionException {
        try {
            int _type = OPEN;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\Robin\\eclipse\\guiLang\\gui\\src\\gss.g:41:3: ( '{' )
            // C:\\Users\\Robin\\eclipse\\guiLang\\gui\\src\\gss.g:42:3: '{'
            {
            match('{'); 

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
            // C:\\Users\\Robin\\eclipse\\guiLang\\gui\\src\\gss.g:46:3: ( '}' )
            // C:\\Users\\Robin\\eclipse\\guiLang\\gui\\src\\gss.g:47:3: '}'
            {
            match('}'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "CLOSE"

    // $ANTLR start "EQUALS"
    public final void mEQUALS() throws RecognitionException {
        try {
            int _type = EQUALS;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\Robin\\eclipse\\guiLang\\gui\\src\\gss.g:51:3: ( '=' )
            // C:\\Users\\Robin\\eclipse\\guiLang\\gui\\src\\gss.g:52:3: '='
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

    // $ANTLR start "EOL"
    public final void mEOL() throws RecognitionException {
        try {
            int _type = EOL;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\Robin\\eclipse\\guiLang\\gui\\src\\gss.g:56:3: ( ';' )
            // C:\\Users\\Robin\\eclipse\\guiLang\\gui\\src\\gss.g:57:3: ';'
            {
            match(';'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "EOL"

    // $ANTLR start "ATTRIBUTES"
    public final void mATTRIBUTES() throws RecognitionException {
        try {
            int _type = ATTRIBUTES;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\Robin\\eclipse\\guiLang\\gui\\src\\gss.g:61:3: ( ( 'color' | 'position' | 'size' | 'layoutManager' ) )
            // C:\\Users\\Robin\\eclipse\\guiLang\\gui\\src\\gss.g:62:3: ( 'color' | 'position' | 'size' | 'layoutManager' )
            {
            // C:\\Users\\Robin\\eclipse\\guiLang\\gui\\src\\gss.g:62:3: ( 'color' | 'position' | 'size' | 'layoutManager' )
            int alt1=4;
            switch ( input.LA(1) ) {
            case 'c':
                {
                alt1=1;
                }
                break;
            case 'p':
                {
                alt1=2;
                }
                break;
            case 's':
                {
                alt1=3;
                }
                break;
            case 'l':
                {
                alt1=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 1, 0, input);

                throw nvae;
            }

            switch (alt1) {
                case 1 :
                    // C:\\Users\\Robin\\eclipse\\guiLang\\gui\\src\\gss.g:63:5: 'color'
                    {
                    match("color"); 


                    }
                    break;
                case 2 :
                    // C:\\Users\\Robin\\eclipse\\guiLang\\gui\\src\\gss.g:64:7: 'position'
                    {
                    match("position"); 


                    }
                    break;
                case 3 :
                    // C:\\Users\\Robin\\eclipse\\guiLang\\gui\\src\\gss.g:65:7: 'size'
                    {
                    match("size"); 


                    }
                    break;
                case 4 :
                    // C:\\Users\\Robin\\eclipse\\guiLang\\gui\\src\\gss.g:66:7: 'layoutManager'
                    {
                    match("layoutManager"); 


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
    // $ANTLR end "ATTRIBUTES"

    // $ANTLR start "WS"
    public final void mWS() throws RecognitionException {
        try {
            int _type = WS;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\Robin\\eclipse\\guiLang\\gui\\src\\gss.g:71:3: ( ( ' ' | '\\t' | '\\r' | '\\n' | '\\u000C' )+ )
            // C:\\Users\\Robin\\eclipse\\guiLang\\gui\\src\\gss.g:72:3: ( ' ' | '\\t' | '\\r' | '\\n' | '\\u000C' )+
            {
            // C:\\Users\\Robin\\eclipse\\guiLang\\gui\\src\\gss.g:72:3: ( ' ' | '\\t' | '\\r' | '\\n' | '\\u000C' )+
            int cnt2=0;
            loop2:
            do {
                int alt2=2;
                int LA2_0 = input.LA(1);

                if ( ((LA2_0>='\t' && LA2_0<='\n')||(LA2_0>='\f' && LA2_0<='\r')||LA2_0==' ') ) {
                    alt2=1;
                }


                switch (alt2) {
            	case 1 :
            	    // C:\\Users\\Robin\\eclipse\\guiLang\\gui\\src\\gss.g:
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
            	    if ( cnt2 >= 1 ) break loop2;
                        EarlyExitException eee =
                            new EarlyExitException(2, input);
                        throw eee;
                }
                cnt2++;
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
            // C:\\Users\\Robin\\eclipse\\guiLang\\gui\\src\\gss.g:82:3: ( ( 'a' .. 'z' | 'A' .. 'Z' | '0' .. '9' | ',' )+ )
            // C:\\Users\\Robin\\eclipse\\guiLang\\gui\\src\\gss.g:83:3: ( 'a' .. 'z' | 'A' .. 'Z' | '0' .. '9' | ',' )+
            {
            // C:\\Users\\Robin\\eclipse\\guiLang\\gui\\src\\gss.g:83:3: ( 'a' .. 'z' | 'A' .. 'Z' | '0' .. '9' | ',' )+
            int cnt3=0;
            loop3:
            do {
                int alt3=2;
                int LA3_0 = input.LA(1);

                if ( (LA3_0==','||(LA3_0>='0' && LA3_0<='9')||(LA3_0>='A' && LA3_0<='Z')||(LA3_0>='a' && LA3_0<='z')) ) {
                    alt3=1;
                }


                switch (alt3) {
            	case 1 :
            	    // C:\\Users\\Robin\\eclipse\\guiLang\\gui\\src\\gss.g:
            	    {
            	    if ( input.LA(1)==','||(input.LA(1)>='0' && input.LA(1)<='9')||(input.LA(1)>='A' && input.LA(1)<='Z')||(input.LA(1)>='a' && input.LA(1)<='z') ) {
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
    // $ANTLR end "STRING_LITERAL"

    public void mTokens() throws RecognitionException {
        // C:\\Users\\Robin\\eclipse\\guiLang\\gui\\src\\gss.g:1:8: ( OPEN | CLOSE | EQUALS | EOL | ATTRIBUTES | WS | STRING_LITERAL )
        int alt4=7;
        alt4 = dfa4.predict(input);
        switch (alt4) {
            case 1 :
                // C:\\Users\\Robin\\eclipse\\guiLang\\gui\\src\\gss.g:1:10: OPEN
                {
                mOPEN(); 

                }
                break;
            case 2 :
                // C:\\Users\\Robin\\eclipse\\guiLang\\gui\\src\\gss.g:1:15: CLOSE
                {
                mCLOSE(); 

                }
                break;
            case 3 :
                // C:\\Users\\Robin\\eclipse\\guiLang\\gui\\src\\gss.g:1:21: EQUALS
                {
                mEQUALS(); 

                }
                break;
            case 4 :
                // C:\\Users\\Robin\\eclipse\\guiLang\\gui\\src\\gss.g:1:28: EOL
                {
                mEOL(); 

                }
                break;
            case 5 :
                // C:\\Users\\Robin\\eclipse\\guiLang\\gui\\src\\gss.g:1:32: ATTRIBUTES
                {
                mATTRIBUTES(); 

                }
                break;
            case 6 :
                // C:\\Users\\Robin\\eclipse\\guiLang\\gui\\src\\gss.g:1:43: WS
                {
                mWS(); 

                }
                break;
            case 7 :
                // C:\\Users\\Robin\\eclipse\\guiLang\\gui\\src\\gss.g:1:46: STRING_LITERAL
                {
                mSTRING_LITERAL(); 

                }
                break;

        }

    }


    protected DFA4 dfa4 = new DFA4(this);
    static final String DFA4_eotS =
        "\5\uffff\4\12\2\uffff\12\12\1\31\1\12\1\31\1\12\1\uffff\5\12\1"+
        "\31\5\12\1\31";
    static final String DFA4_eofS =
        "\46\uffff";
    static final String DFA4_minS =
        "\1\11\4\uffff\2\157\1\151\1\141\2\uffff\1\154\1\163\1\172\1\171"+
        "\1\157\1\151\1\145\1\157\1\162\1\164\1\54\1\165\1\54\1\151\1\uffff"+
        "\1\164\1\157\1\115\1\156\1\141\1\54\1\156\1\141\1\147\1\145\1\162"+
        "\1\54";
    static final String DFA4_maxS =
        "\1\175\4\uffff\2\157\1\151\1\141\2\uffff\1\154\1\163\1\172\1\171"+
        "\1\157\1\151\1\145\1\157\1\162\1\164\1\172\1\165\1\172\1\151\1\uffff"+
        "\1\164\1\157\1\115\1\156\1\141\1\172\1\156\1\141\1\147\1\145\1\162"+
        "\1\172";
    static final String DFA4_acceptS =
        "\1\uffff\1\1\1\2\1\3\1\4\4\uffff\1\6\1\7\16\uffff\1\5\14\uffff";
    static final String DFA4_specialS =
        "\46\uffff}>";
    static final String[] DFA4_transitionS = {
            "\2\11\1\uffff\2\11\22\uffff\1\11\13\uffff\1\12\3\uffff\12\12"+
            "\1\uffff\1\4\1\uffff\1\3\3\uffff\32\12\6\uffff\2\12\1\5\10\12"+
            "\1\10\3\12\1\6\2\12\1\7\7\12\1\1\1\uffff\1\2",
            "",
            "",
            "",
            "",
            "\1\13",
            "\1\14",
            "\1\15",
            "\1\16",
            "",
            "",
            "\1\17",
            "\1\20",
            "\1\21",
            "\1\22",
            "\1\23",
            "\1\24",
            "\1\25",
            "\1\26",
            "\1\27",
            "\1\30",
            "\1\12\3\uffff\12\12\7\uffff\32\12\6\uffff\32\12",
            "\1\32",
            "\1\12\3\uffff\12\12\7\uffff\32\12\6\uffff\32\12",
            "\1\33",
            "",
            "\1\34",
            "\1\35",
            "\1\36",
            "\1\37",
            "\1\40",
            "\1\12\3\uffff\12\12\7\uffff\32\12\6\uffff\32\12",
            "\1\41",
            "\1\42",
            "\1\43",
            "\1\44",
            "\1\45",
            "\1\12\3\uffff\12\12\7\uffff\32\12\6\uffff\32\12"
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
            return "1:1: Tokens : ( OPEN | CLOSE | EQUALS | EOL | ATTRIBUTES | WS | STRING_LITERAL );";
        }
    }
 

}