// $ANTLR 3.3 Nov 30, 2010 12:50:56 C:\\Users\\Robin\\eclipse\\guiLang\\gui\\src\\gss.g 2011-07-13 09:50:23

package parser;
import java.util.HashMap;


import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

public class gssParser extends Parser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "STRING_LITERAL", "OPEN", "WS", "CLOSE", "ATTRIBUTES", "EQUALS", "EOL"
    };
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


        public gssParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public gssParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return gssParser.tokenNames; }
    public String getGrammarFileName() { return "C:\\Users\\Robin\\eclipse\\guiLang\\gui\\src\\gss.g"; }






    // $ANTLR start "read"
    // C:\\Users\\Robin\\eclipse\\guiLang\\gui\\src\\gss.g:20:1: read returns [HashMap<String, HashMap<String, String>> styles = new HashMap<String, HashMap<String, String>>()] : (s= STRING_LITERAL OPEN ( WS )* ( style ) CLOSE ( WS )* )* ;
    public final HashMap<String, HashMap<String, String>> read() throws RecognitionException {
        HashMap<String, HashMap<String, String>> styles =  new HashMap<String, HashMap<String, String>>();

        Token s=null;
        HashMap<String, String> style1 = null;


        try {
            // C:\\Users\\Robin\\eclipse\\guiLang\\gui\\src\\gss.g:21:3: ( (s= STRING_LITERAL OPEN ( WS )* ( style ) CLOSE ( WS )* )* )
            // C:\\Users\\Robin\\eclipse\\guiLang\\gui\\src\\gss.g:22:3: (s= STRING_LITERAL OPEN ( WS )* ( style ) CLOSE ( WS )* )*
            {
            // C:\\Users\\Robin\\eclipse\\guiLang\\gui\\src\\gss.g:22:3: (s= STRING_LITERAL OPEN ( WS )* ( style ) CLOSE ( WS )* )*
            loop3:
            do {
                int alt3=2;
                int LA3_0 = input.LA(1);

                if ( (LA3_0==STRING_LITERAL) ) {
                    alt3=1;
                }


                switch (alt3) {
            	case 1 :
            	    // C:\\Users\\Robin\\eclipse\\guiLang\\gui\\src\\gss.g:23:5: s= STRING_LITERAL OPEN ( WS )* ( style ) CLOSE ( WS )*
            	    {
            	    s=(Token)match(input,STRING_LITERAL,FOLLOW_STRING_LITERAL_in_read61); 
            	    match(input,OPEN,FOLLOW_OPEN_in_read63); 
            	    // C:\\Users\\Robin\\eclipse\\guiLang\\gui\\src\\gss.g:23:27: ( WS )*
            	    loop1:
            	    do {
            	        int alt1=2;
            	        int LA1_0 = input.LA(1);

            	        if ( (LA1_0==WS) ) {
            	            alt1=1;
            	        }


            	        switch (alt1) {
            	    	case 1 :
            	    	    // C:\\Users\\Robin\\eclipse\\guiLang\\gui\\src\\gss.g:23:28: WS
            	    	    {
            	    	    match(input,WS,FOLLOW_WS_in_read66); 

            	    	    }
            	    	    break;

            	    	default :
            	    	    break loop1;
            	        }
            	    } while (true);

            	    // C:\\Users\\Robin\\eclipse\\guiLang\\gui\\src\\gss.g:23:33: ( style )
            	    // C:\\Users\\Robin\\eclipse\\guiLang\\gui\\src\\gss.g:23:34: style
            	    {
            	    pushFollow(FOLLOW_style_in_read71);
            	    style1=style();

            	    state._fsp--;


            	                                            styles.put((s!=null?s.getText():null), style1);
            	                                           

            	    }

            	    match(input,CLOSE,FOLLOW_CLOSE_in_read116); 
            	    // C:\\Users\\Robin\\eclipse\\guiLang\\gui\\src\\gss.g:26:49: ( WS )*
            	    loop2:
            	    do {
            	        int alt2=2;
            	        int LA2_0 = input.LA(1);

            	        if ( (LA2_0==WS) ) {
            	            alt2=1;
            	        }


            	        switch (alt2) {
            	    	case 1 :
            	    	    // C:\\Users\\Robin\\eclipse\\guiLang\\gui\\src\\gss.g:26:50: WS
            	    	    {
            	    	    match(input,WS,FOLLOW_WS_in_read119); 

            	    	    }
            	    	    break;

            	    	default :
            	    	    break loop2;
            	        }
            	    } while (true);


            	    }
            	    break;

            	default :
            	    break loop3;
                }
            } while (true);


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return styles;
    }
    // $ANTLR end "read"


    // $ANTLR start "style"
    // C:\\Users\\Robin\\eclipse\\guiLang\\gui\\src\\gss.g:30:1: style returns [HashMap<String, String> attr = new HashMap<String, String>()] : (a= ATTRIBUTES ( WS )* EQUALS ( WS )* v= STRING_LITERAL ( WS )* EOL ( WS )* )+ ;
    public final HashMap<String, String> style() throws RecognitionException {
        HashMap<String, String> attr =  new HashMap<String, String>();

        Token a=null;
        Token v=null;

        try {
            // C:\\Users\\Robin\\eclipse\\guiLang\\gui\\src\\gss.g:31:3: ( (a= ATTRIBUTES ( WS )* EQUALS ( WS )* v= STRING_LITERAL ( WS )* EOL ( WS )* )+ )
            // C:\\Users\\Robin\\eclipse\\guiLang\\gui\\src\\gss.g:32:3: (a= ATTRIBUTES ( WS )* EQUALS ( WS )* v= STRING_LITERAL ( WS )* EOL ( WS )* )+
            {
            // C:\\Users\\Robin\\eclipse\\guiLang\\gui\\src\\gss.g:32:3: (a= ATTRIBUTES ( WS )* EQUALS ( WS )* v= STRING_LITERAL ( WS )* EOL ( WS )* )+
            int cnt8=0;
            loop8:
            do {
                int alt8=2;
                int LA8_0 = input.LA(1);

                if ( (LA8_0==ATTRIBUTES) ) {
                    alt8=1;
                }


                switch (alt8) {
            	case 1 :
            	    // C:\\Users\\Robin\\eclipse\\guiLang\\gui\\src\\gss.g:33:5: a= ATTRIBUTES ( WS )* EQUALS ( WS )* v= STRING_LITERAL ( WS )* EOL ( WS )*
            	    {
            	    a=(Token)match(input,ATTRIBUTES,FOLLOW_ATTRIBUTES_in_style153); 
            	    // C:\\Users\\Robin\\eclipse\\guiLang\\gui\\src\\gss.g:33:18: ( WS )*
            	    loop4:
            	    do {
            	        int alt4=2;
            	        int LA4_0 = input.LA(1);

            	        if ( (LA4_0==WS) ) {
            	            alt4=1;
            	        }


            	        switch (alt4) {
            	    	case 1 :
            	    	    // C:\\Users\\Robin\\eclipse\\guiLang\\gui\\src\\gss.g:33:19: WS
            	    	    {
            	    	    match(input,WS,FOLLOW_WS_in_style156); 

            	    	    }
            	    	    break;

            	    	default :
            	    	    break loop4;
            	        }
            	    } while (true);

            	    match(input,EQUALS,FOLLOW_EQUALS_in_style160); 
            	    // C:\\Users\\Robin\\eclipse\\guiLang\\gui\\src\\gss.g:33:31: ( WS )*
            	    loop5:
            	    do {
            	        int alt5=2;
            	        int LA5_0 = input.LA(1);

            	        if ( (LA5_0==WS) ) {
            	            alt5=1;
            	        }


            	        switch (alt5) {
            	    	case 1 :
            	    	    // C:\\Users\\Robin\\eclipse\\guiLang\\gui\\src\\gss.g:33:32: WS
            	    	    {
            	    	    match(input,WS,FOLLOW_WS_in_style163); 

            	    	    }
            	    	    break;

            	    	default :
            	    	    break loop5;
            	        }
            	    } while (true);

            	    v=(Token)match(input,STRING_LITERAL,FOLLOW_STRING_LITERAL_in_style169); 
            	    // C:\\Users\\Robin\\eclipse\\guiLang\\gui\\src\\gss.g:33:54: ( WS )*
            	    loop6:
            	    do {
            	        int alt6=2;
            	        int LA6_0 = input.LA(1);

            	        if ( (LA6_0==WS) ) {
            	            alt6=1;
            	        }


            	        switch (alt6) {
            	    	case 1 :
            	    	    // C:\\Users\\Robin\\eclipse\\guiLang\\gui\\src\\gss.g:33:55: WS
            	    	    {
            	    	    match(input,WS,FOLLOW_WS_in_style172); 

            	    	    }
            	    	    break;

            	    	default :
            	    	    break loop6;
            	        }
            	    } while (true);

            	    match(input,EOL,FOLLOW_EOL_in_style176); 
            	    // C:\\Users\\Robin\\eclipse\\guiLang\\gui\\src\\gss.g:33:64: ( WS )*
            	    loop7:
            	    do {
            	        int alt7=2;
            	        int LA7_0 = input.LA(1);

            	        if ( (LA7_0==WS) ) {
            	            alt7=1;
            	        }


            	        switch (alt7) {
            	    	case 1 :
            	    	    // C:\\Users\\Robin\\eclipse\\guiLang\\gui\\src\\gss.g:33:65: WS
            	    	    {
            	    	    match(input,WS,FOLLOW_WS_in_style179); 

            	    	    }
            	    	    break;

            	    	default :
            	    	    break loop7;
            	        }
            	    } while (true);


            	                                                                          attr.put((a!=null?a.getText():null), (v!=null?v.getText():null));
            	                                                                         

            	    }
            	    break;

            	default :
            	    if ( cnt8 >= 1 ) break loop8;
                        EarlyExitException eee =
                            new EarlyExitException(8, input);
                        throw eee;
                }
                cnt8++;
            } while (true);


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return attr;
    }
    // $ANTLR end "style"

    // Delegated rules


 

    public static final BitSet FOLLOW_STRING_LITERAL_in_read61 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_OPEN_in_read63 = new BitSet(new long[]{0x0000000000000140L});
    public static final BitSet FOLLOW_WS_in_read66 = new BitSet(new long[]{0x0000000000000140L});
    public static final BitSet FOLLOW_style_in_read71 = new BitSet(new long[]{0x0000000000000080L});
    public static final BitSet FOLLOW_CLOSE_in_read116 = new BitSet(new long[]{0x0000000000000052L});
    public static final BitSet FOLLOW_WS_in_read119 = new BitSet(new long[]{0x0000000000000052L});
    public static final BitSet FOLLOW_ATTRIBUTES_in_style153 = new BitSet(new long[]{0x0000000000000240L});
    public static final BitSet FOLLOW_WS_in_style156 = new BitSet(new long[]{0x0000000000000240L});
    public static final BitSet FOLLOW_EQUALS_in_style160 = new BitSet(new long[]{0x0000000000000050L});
    public static final BitSet FOLLOW_WS_in_style163 = new BitSet(new long[]{0x0000000000000050L});
    public static final BitSet FOLLOW_STRING_LITERAL_in_style169 = new BitSet(new long[]{0x0000000000000440L});
    public static final BitSet FOLLOW_WS_in_style172 = new BitSet(new long[]{0x0000000000000440L});
    public static final BitSet FOLLOW_EOL_in_style176 = new BitSet(new long[]{0x0000000000000142L});
    public static final BitSet FOLLOW_WS_in_style179 = new BitSet(new long[]{0x0000000000000142L});

}