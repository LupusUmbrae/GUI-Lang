// $ANTLR 3.3 Nov 30, 2010 12:50:56 C:\\Users\\Robin\\eclipse\\guiLang\\gui\\src\\gsl.g 2011-07-13 17:31:36

package parser;
import java.util.HashMap;
import tree.Tree;


import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

public class gslParser extends Parser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "OPEN", "WINDOW_TAG", "WS", "KEY_TAG", "EQUALS", "QUOTE", "STRING_LITERAL", "COMMA", "CLOSE", "SLASH", "PANEL_TAG", "TAGS"
    };
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


        public gslParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public gslParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return gslParser.tokenNames; }
    public String getGrammarFileName() { return "C:\\Users\\Robin\\eclipse\\guiLang\\gui\\src\\gsl.g"; }






    // $ANTLR start "window"
    // C:\\Users\\Robin\\eclipse\\guiLang\\gui\\src\\gsl.g:21:1: window returns [Tree window = new Tree();] : OPEN WINDOW_TAG ( WS )* (k= KEY_TAG ( WS )* EQUALS ( WS )* ( QUOTE )? v= STRING_LITERAL ( QUOTE )? ( WS )* ( COMMA ( WS )* k= KEY_TAG ( WS )* EQUALS ( WS )* ( QUOTE )? v= STRING_LITERAL ( QUOTE )? ( WS )* )* )? CLOSE ( WS )* ( panel )+ OPEN SLASH WINDOW_TAG CLOSE ( WS )* ;
    public final Tree window() throws RecognitionException {
        Tree window =  new Tree();;

        Token k=null;
        Token v=null;
        Tree panel1 = null;


        try {
            // C:\\Users\\Robin\\eclipse\\guiLang\\gui\\src\\gsl.g:22:3: ( OPEN WINDOW_TAG ( WS )* (k= KEY_TAG ( WS )* EQUALS ( WS )* ( QUOTE )? v= STRING_LITERAL ( QUOTE )? ( WS )* ( COMMA ( WS )* k= KEY_TAG ( WS )* EQUALS ( WS )* ( QUOTE )? v= STRING_LITERAL ( QUOTE )? ( WS )* )* )? CLOSE ( WS )* ( panel )+ OPEN SLASH WINDOW_TAG CLOSE ( WS )* )
            // C:\\Users\\Robin\\eclipse\\guiLang\\gui\\src\\gsl.g:23:3: OPEN WINDOW_TAG ( WS )* (k= KEY_TAG ( WS )* EQUALS ( WS )* ( QUOTE )? v= STRING_LITERAL ( QUOTE )? ( WS )* ( COMMA ( WS )* k= KEY_TAG ( WS )* EQUALS ( WS )* ( QUOTE )? v= STRING_LITERAL ( QUOTE )? ( WS )* )* )? CLOSE ( WS )* ( panel )+ OPEN SLASH WINDOW_TAG CLOSE ( WS )*
            {
            match(input,OPEN,FOLLOW_OPEN_in_window53); 
            match(input,WINDOW_TAG,FOLLOW_WINDOW_TAG_in_window55); 

                               window.setType("window");
                              
            // C:\\Users\\Robin\\eclipse\\guiLang\\gui\\src\\gsl.g:27:3: ( WS )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( (LA1_0==WS) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // C:\\Users\\Robin\\eclipse\\guiLang\\gui\\src\\gsl.g:27:4: WS
            	    {
            	    match(input,WS,FOLLOW_WS_in_window81); 

            	    }
            	    break;

            	default :
            	    break loop1;
                }
            } while (true);

            // C:\\Users\\Robin\\eclipse\\guiLang\\gui\\src\\gsl.g:28:3: (k= KEY_TAG ( WS )* EQUALS ( WS )* ( QUOTE )? v= STRING_LITERAL ( QUOTE )? ( WS )* ( COMMA ( WS )* k= KEY_TAG ( WS )* EQUALS ( WS )* ( QUOTE )? v= STRING_LITERAL ( QUOTE )? ( WS )* )* )?
            int alt14=2;
            int LA14_0 = input.LA(1);

            if ( (LA14_0==KEY_TAG) ) {
                alt14=1;
            }
            switch (alt14) {
                case 1 :
                    // C:\\Users\\Robin\\eclipse\\guiLang\\gui\\src\\gsl.g:29:5: k= KEY_TAG ( WS )* EQUALS ( WS )* ( QUOTE )? v= STRING_LITERAL ( QUOTE )? ( WS )* ( COMMA ( WS )* k= KEY_TAG ( WS )* EQUALS ( WS )* ( QUOTE )? v= STRING_LITERAL ( QUOTE )? ( WS )* )*
                    {
                    k=(Token)match(input,KEY_TAG,FOLLOW_KEY_TAG_in_window95); 
                    // C:\\Users\\Robin\\eclipse\\guiLang\\gui\\src\\gsl.g:29:15: ( WS )*
                    loop2:
                    do {
                        int alt2=2;
                        int LA2_0 = input.LA(1);

                        if ( (LA2_0==WS) ) {
                            alt2=1;
                        }


                        switch (alt2) {
                    	case 1 :
                    	    // C:\\Users\\Robin\\eclipse\\guiLang\\gui\\src\\gsl.g:29:16: WS
                    	    {
                    	    match(input,WS,FOLLOW_WS_in_window98); 

                    	    }
                    	    break;

                    	default :
                    	    break loop2;
                        }
                    } while (true);

                    match(input,EQUALS,FOLLOW_EQUALS_in_window102); 
                    // C:\\Users\\Robin\\eclipse\\guiLang\\gui\\src\\gsl.g:29:28: ( WS )*
                    loop3:
                    do {
                        int alt3=2;
                        int LA3_0 = input.LA(1);

                        if ( (LA3_0==WS) ) {
                            alt3=1;
                        }


                        switch (alt3) {
                    	case 1 :
                    	    // C:\\Users\\Robin\\eclipse\\guiLang\\gui\\src\\gsl.g:29:29: WS
                    	    {
                    	    match(input,WS,FOLLOW_WS_in_window105); 

                    	    }
                    	    break;

                    	default :
                    	    break loop3;
                        }
                    } while (true);

                    // C:\\Users\\Robin\\eclipse\\guiLang\\gui\\src\\gsl.g:29:34: ( QUOTE )?
                    int alt4=2;
                    int LA4_0 = input.LA(1);

                    if ( (LA4_0==QUOTE) ) {
                        alt4=1;
                    }
                    switch (alt4) {
                        case 1 :
                            // C:\\Users\\Robin\\eclipse\\guiLang\\gui\\src\\gsl.g:29:34: QUOTE
                            {
                            match(input,QUOTE,FOLLOW_QUOTE_in_window109); 

                            }
                            break;

                    }

                    v=(Token)match(input,STRING_LITERAL,FOLLOW_STRING_LITERAL_in_window114); 
                    // C:\\Users\\Robin\\eclipse\\guiLang\\gui\\src\\gsl.g:29:58: ( QUOTE )?
                    int alt5=2;
                    int LA5_0 = input.LA(1);

                    if ( (LA5_0==QUOTE) ) {
                        alt5=1;
                    }
                    switch (alt5) {
                        case 1 :
                            // C:\\Users\\Robin\\eclipse\\guiLang\\gui\\src\\gsl.g:29:58: QUOTE
                            {
                            match(input,QUOTE,FOLLOW_QUOTE_in_window116); 

                            }
                            break;

                    }


                                                                                     window.setByString((k!=null?k.getText():null), (v!=null?v.getText():null));
                                                                                    
                    // C:\\Users\\Robin\\eclipse\\guiLang\\gui\\src\\gsl.g:33:5: ( WS )*
                    loop6:
                    do {
                        int alt6=2;
                        int LA6_0 = input.LA(1);

                        if ( (LA6_0==WS) ) {
                            alt6=1;
                        }


                        switch (alt6) {
                    	case 1 :
                    	    // C:\\Users\\Robin\\eclipse\\guiLang\\gui\\src\\gsl.g:33:6: WS
                    	    {
                    	    match(input,WS,FOLLOW_WS_in_window191); 

                    	    }
                    	    break;

                    	default :
                    	    break loop6;
                        }
                    } while (true);

                    // C:\\Users\\Robin\\eclipse\\guiLang\\gui\\src\\gsl.g:34:5: ( COMMA ( WS )* k= KEY_TAG ( WS )* EQUALS ( WS )* ( QUOTE )? v= STRING_LITERAL ( QUOTE )? ( WS )* )*
                    loop13:
                    do {
                        int alt13=2;
                        int LA13_0 = input.LA(1);

                        if ( (LA13_0==COMMA) ) {
                            alt13=1;
                        }


                        switch (alt13) {
                    	case 1 :
                    	    // C:\\Users\\Robin\\eclipse\\guiLang\\gui\\src\\gsl.g:35:7: COMMA ( WS )* k= KEY_TAG ( WS )* EQUALS ( WS )* ( QUOTE )? v= STRING_LITERAL ( QUOTE )? ( WS )*
                    	    {
                    	    match(input,COMMA,FOLLOW_COMMA_in_window207); 
                    	    // C:\\Users\\Robin\\eclipse\\guiLang\\gui\\src\\gsl.g:35:13: ( WS )*
                    	    loop7:
                    	    do {
                    	        int alt7=2;
                    	        int LA7_0 = input.LA(1);

                    	        if ( (LA7_0==WS) ) {
                    	            alt7=1;
                    	        }


                    	        switch (alt7) {
                    	    	case 1 :
                    	    	    // C:\\Users\\Robin\\eclipse\\guiLang\\gui\\src\\gsl.g:35:14: WS
                    	    	    {
                    	    	    match(input,WS,FOLLOW_WS_in_window210); 

                    	    	    }
                    	    	    break;

                    	    	default :
                    	    	    break loop7;
                    	        }
                    	    } while (true);

                    	    k=(Token)match(input,KEY_TAG,FOLLOW_KEY_TAG_in_window216); 
                    	    // C:\\Users\\Robin\\eclipse\\guiLang\\gui\\src\\gsl.g:35:29: ( WS )*
                    	    loop8:
                    	    do {
                    	        int alt8=2;
                    	        int LA8_0 = input.LA(1);

                    	        if ( (LA8_0==WS) ) {
                    	            alt8=1;
                    	        }


                    	        switch (alt8) {
                    	    	case 1 :
                    	    	    // C:\\Users\\Robin\\eclipse\\guiLang\\gui\\src\\gsl.g:35:30: WS
                    	    	    {
                    	    	    match(input,WS,FOLLOW_WS_in_window219); 

                    	    	    }
                    	    	    break;

                    	    	default :
                    	    	    break loop8;
                    	        }
                    	    } while (true);

                    	    match(input,EQUALS,FOLLOW_EQUALS_in_window223); 
                    	    // C:\\Users\\Robin\\eclipse\\guiLang\\gui\\src\\gsl.g:35:42: ( WS )*
                    	    loop9:
                    	    do {
                    	        int alt9=2;
                    	        int LA9_0 = input.LA(1);

                    	        if ( (LA9_0==WS) ) {
                    	            alt9=1;
                    	        }


                    	        switch (alt9) {
                    	    	case 1 :
                    	    	    // C:\\Users\\Robin\\eclipse\\guiLang\\gui\\src\\gsl.g:35:43: WS
                    	    	    {
                    	    	    match(input,WS,FOLLOW_WS_in_window226); 

                    	    	    }
                    	    	    break;

                    	    	default :
                    	    	    break loop9;
                    	        }
                    	    } while (true);

                    	    // C:\\Users\\Robin\\eclipse\\guiLang\\gui\\src\\gsl.g:35:48: ( QUOTE )?
                    	    int alt10=2;
                    	    int LA10_0 = input.LA(1);

                    	    if ( (LA10_0==QUOTE) ) {
                    	        alt10=1;
                    	    }
                    	    switch (alt10) {
                    	        case 1 :
                    	            // C:\\Users\\Robin\\eclipse\\guiLang\\gui\\src\\gsl.g:35:48: QUOTE
                    	            {
                    	            match(input,QUOTE,FOLLOW_QUOTE_in_window230); 

                    	            }
                    	            break;

                    	    }

                    	    v=(Token)match(input,STRING_LITERAL,FOLLOW_STRING_LITERAL_in_window235); 
                    	    // C:\\Users\\Robin\\eclipse\\guiLang\\gui\\src\\gsl.g:35:72: ( QUOTE )?
                    	    int alt11=2;
                    	    int LA11_0 = input.LA(1);

                    	    if ( (LA11_0==QUOTE) ) {
                    	        alt11=1;
                    	    }
                    	    switch (alt11) {
                    	        case 1 :
                    	            // C:\\Users\\Robin\\eclipse\\guiLang\\gui\\src\\gsl.g:35:72: QUOTE
                    	            {
                    	            match(input,QUOTE,FOLLOW_QUOTE_in_window237); 

                    	            }
                    	            break;

                    	    }


                    	                                                                                   window.setByString((k!=null?k.getText():null), (v!=null?v.getText():null));
                    	                                                                                  
                    	    // C:\\Users\\Robin\\eclipse\\guiLang\\gui\\src\\gsl.g:39:7: ( WS )*
                    	    loop12:
                    	    do {
                    	        int alt12=2;
                    	        int LA12_0 = input.LA(1);

                    	        if ( (LA12_0==WS) ) {
                    	            alt12=1;
                    	        }


                    	        switch (alt12) {
                    	    	case 1 :
                    	    	    // C:\\Users\\Robin\\eclipse\\guiLang\\gui\\src\\gsl.g:39:8: WS
                    	    	    {
                    	    	    match(input,WS,FOLLOW_WS_in_window328); 

                    	    	    }
                    	    	    break;

                    	    	default :
                    	    	    break loop12;
                    	        }
                    	    } while (true);


                    	    }
                    	    break;

                    	default :
                    	    break loop13;
                        }
                    } while (true);


                    }
                    break;

            }

            match(input,CLOSE,FOLLOW_CLOSE_in_window346); 
            // C:\\Users\\Robin\\eclipse\\guiLang\\gui\\src\\gsl.g:42:9: ( WS )*
            loop15:
            do {
                int alt15=2;
                int LA15_0 = input.LA(1);

                if ( (LA15_0==WS) ) {
                    alt15=1;
                }


                switch (alt15) {
            	case 1 :
            	    // C:\\Users\\Robin\\eclipse\\guiLang\\gui\\src\\gsl.g:42:10: WS
            	    {
            	    match(input,WS,FOLLOW_WS_in_window349); 

            	    }
            	    break;

            	default :
            	    break loop15;
                }
            } while (true);

            // C:\\Users\\Robin\\eclipse\\guiLang\\gui\\src\\gsl.g:42:15: ( panel )+
            int cnt16=0;
            loop16:
            do {
                int alt16=2;
                int LA16_0 = input.LA(1);

                if ( (LA16_0==OPEN) ) {
                    int LA16_1 = input.LA(2);

                    if ( (LA16_1==PANEL_TAG) ) {
                        alt16=1;
                    }


                }


                switch (alt16) {
            	case 1 :
            	    // C:\\Users\\Robin\\eclipse\\guiLang\\gui\\src\\gsl.g:42:16: panel
            	    {
            	    pushFollow(FOLLOW_panel_in_window354);
            	    panel1=panel();

            	    state._fsp--;


            	                          window.addChild(panel1);
            	                         

            	    }
            	    break;

            	default :
            	    if ( cnt16 >= 1 ) break loop16;
                        EarlyExitException eee =
                            new EarlyExitException(16, input);
                        throw eee;
                }
                cnt16++;
            } while (true);

            match(input,OPEN,FOLLOW_OPEN_in_window382); 
            match(input,SLASH,FOLLOW_SLASH_in_window384); 
            match(input,WINDOW_TAG,FOLLOW_WINDOW_TAG_in_window386); 
            match(input,CLOSE,FOLLOW_CLOSE_in_window388); 
            // C:\\Users\\Robin\\eclipse\\guiLang\\gui\\src\\gsl.g:45:54: ( WS )*
            loop17:
            do {
                int alt17=2;
                int LA17_0 = input.LA(1);

                if ( (LA17_0==WS) ) {
                    alt17=1;
                }


                switch (alt17) {
            	case 1 :
            	    // C:\\Users\\Robin\\eclipse\\guiLang\\gui\\src\\gsl.g:45:55: WS
            	    {
            	    match(input,WS,FOLLOW_WS_in_window391); 

            	    }
            	    break;

            	default :
            	    break loop17;
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
        return window;
    }
    // $ANTLR end "window"


    // $ANTLR start "panel"
    // C:\\Users\\Robin\\eclipse\\guiLang\\gui\\src\\gsl.g:48:1: panel returns [Tree panel = new Tree();] : ( OPEN p= PANEL_TAG ( WS )* (k= KEY_TAG ( WS )* EQUALS ( WS )* ( QUOTE )? v= STRING_LITERAL ( QUOTE )? ( WS )* ( COMMA ( WS )* k= KEY_TAG ( WS )* EQUALS ( WS )* ( QUOTE )? v= STRING_LITERAL ( QUOTE )? ( WS )* )* )? CLOSE ( WS )* ( tag )+ OPEN SLASH PANEL_TAG CLOSE ( WS )* ) ;
    public final Tree panel() throws RecognitionException {
        Tree panel =  new Tree();;

        Token p=null;
        Token k=null;
        Token v=null;
        Tree tag2 = null;


        try {
            // C:\\Users\\Robin\\eclipse\\guiLang\\gui\\src\\gsl.g:49:3: ( ( OPEN p= PANEL_TAG ( WS )* (k= KEY_TAG ( WS )* EQUALS ( WS )* ( QUOTE )? v= STRING_LITERAL ( QUOTE )? ( WS )* ( COMMA ( WS )* k= KEY_TAG ( WS )* EQUALS ( WS )* ( QUOTE )? v= STRING_LITERAL ( QUOTE )? ( WS )* )* )? CLOSE ( WS )* ( tag )+ OPEN SLASH PANEL_TAG CLOSE ( WS )* ) )
            // C:\\Users\\Robin\\eclipse\\guiLang\\gui\\src\\gsl.g:50:3: ( OPEN p= PANEL_TAG ( WS )* (k= KEY_TAG ( WS )* EQUALS ( WS )* ( QUOTE )? v= STRING_LITERAL ( QUOTE )? ( WS )* ( COMMA ( WS )* k= KEY_TAG ( WS )* EQUALS ( WS )* ( QUOTE )? v= STRING_LITERAL ( QUOTE )? ( WS )* )* )? CLOSE ( WS )* ( tag )+ OPEN SLASH PANEL_TAG CLOSE ( WS )* )
            {
            // C:\\Users\\Robin\\eclipse\\guiLang\\gui\\src\\gsl.g:50:3: ( OPEN p= PANEL_TAG ( WS )* (k= KEY_TAG ( WS )* EQUALS ( WS )* ( QUOTE )? v= STRING_LITERAL ( QUOTE )? ( WS )* ( COMMA ( WS )* k= KEY_TAG ( WS )* EQUALS ( WS )* ( QUOTE )? v= STRING_LITERAL ( QUOTE )? ( WS )* )* )? CLOSE ( WS )* ( tag )+ OPEN SLASH PANEL_TAG CLOSE ( WS )* )
            // C:\\Users\\Robin\\eclipse\\guiLang\\gui\\src\\gsl.g:51:5: OPEN p= PANEL_TAG ( WS )* (k= KEY_TAG ( WS )* EQUALS ( WS )* ( QUOTE )? v= STRING_LITERAL ( QUOTE )? ( WS )* ( COMMA ( WS )* k= KEY_TAG ( WS )* EQUALS ( WS )* ( QUOTE )? v= STRING_LITERAL ( QUOTE )? ( WS )* )* )? CLOSE ( WS )* ( tag )+ OPEN SLASH PANEL_TAG CLOSE ( WS )*
            {
            match(input,OPEN,FOLLOW_OPEN_in_panel418); 
            p=(Token)match(input,PANEL_TAG,FOLLOW_PANEL_TAG_in_panel422); 

                                  panel.setType((p!=null?p.getText():null));
                                 
            // C:\\Users\\Robin\\eclipse\\guiLang\\gui\\src\\gsl.g:55:5: ( WS )*
            loop18:
            do {
                int alt18=2;
                int LA18_0 = input.LA(1);

                if ( (LA18_0==WS) ) {
                    alt18=1;
                }


                switch (alt18) {
            	case 1 :
            	    // C:\\Users\\Robin\\eclipse\\guiLang\\gui\\src\\gsl.g:55:6: WS
            	    {
            	    match(input,WS,FOLLOW_WS_in_panel453); 

            	    }
            	    break;

            	default :
            	    break loop18;
                }
            } while (true);

            // C:\\Users\\Robin\\eclipse\\guiLang\\gui\\src\\gsl.g:56:5: (k= KEY_TAG ( WS )* EQUALS ( WS )* ( QUOTE )? v= STRING_LITERAL ( QUOTE )? ( WS )* ( COMMA ( WS )* k= KEY_TAG ( WS )* EQUALS ( WS )* ( QUOTE )? v= STRING_LITERAL ( QUOTE )? ( WS )* )* )?
            int alt31=2;
            int LA31_0 = input.LA(1);

            if ( (LA31_0==KEY_TAG) ) {
                alt31=1;
            }
            switch (alt31) {
                case 1 :
                    // C:\\Users\\Robin\\eclipse\\guiLang\\gui\\src\\gsl.g:57:7: k= KEY_TAG ( WS )* EQUALS ( WS )* ( QUOTE )? v= STRING_LITERAL ( QUOTE )? ( WS )* ( COMMA ( WS )* k= KEY_TAG ( WS )* EQUALS ( WS )* ( QUOTE )? v= STRING_LITERAL ( QUOTE )? ( WS )* )*
                    {
                    k=(Token)match(input,KEY_TAG,FOLLOW_KEY_TAG_in_panel471); 
                    // C:\\Users\\Robin\\eclipse\\guiLang\\gui\\src\\gsl.g:57:17: ( WS )*
                    loop19:
                    do {
                        int alt19=2;
                        int LA19_0 = input.LA(1);

                        if ( (LA19_0==WS) ) {
                            alt19=1;
                        }


                        switch (alt19) {
                    	case 1 :
                    	    // C:\\Users\\Robin\\eclipse\\guiLang\\gui\\src\\gsl.g:57:18: WS
                    	    {
                    	    match(input,WS,FOLLOW_WS_in_panel474); 

                    	    }
                    	    break;

                    	default :
                    	    break loop19;
                        }
                    } while (true);

                    match(input,EQUALS,FOLLOW_EQUALS_in_panel478); 
                    // C:\\Users\\Robin\\eclipse\\guiLang\\gui\\src\\gsl.g:57:30: ( WS )*
                    loop20:
                    do {
                        int alt20=2;
                        int LA20_0 = input.LA(1);

                        if ( (LA20_0==WS) ) {
                            alt20=1;
                        }


                        switch (alt20) {
                    	case 1 :
                    	    // C:\\Users\\Robin\\eclipse\\guiLang\\gui\\src\\gsl.g:57:31: WS
                    	    {
                    	    match(input,WS,FOLLOW_WS_in_panel481); 

                    	    }
                    	    break;

                    	default :
                    	    break loop20;
                        }
                    } while (true);

                    // C:\\Users\\Robin\\eclipse\\guiLang\\gui\\src\\gsl.g:57:36: ( QUOTE )?
                    int alt21=2;
                    int LA21_0 = input.LA(1);

                    if ( (LA21_0==QUOTE) ) {
                        alt21=1;
                    }
                    switch (alt21) {
                        case 1 :
                            // C:\\Users\\Robin\\eclipse\\guiLang\\gui\\src\\gsl.g:57:36: QUOTE
                            {
                            match(input,QUOTE,FOLLOW_QUOTE_in_panel485); 

                            }
                            break;

                    }

                    v=(Token)match(input,STRING_LITERAL,FOLLOW_STRING_LITERAL_in_panel490); 
                    // C:\\Users\\Robin\\eclipse\\guiLang\\gui\\src\\gsl.g:57:60: ( QUOTE )?
                    int alt22=2;
                    int LA22_0 = input.LA(1);

                    if ( (LA22_0==QUOTE) ) {
                        alt22=1;
                    }
                    switch (alt22) {
                        case 1 :
                            // C:\\Users\\Robin\\eclipse\\guiLang\\gui\\src\\gsl.g:57:60: QUOTE
                            {
                            match(input,QUOTE,FOLLOW_QUOTE_in_panel492); 

                            }
                            break;

                    }


                                                                                       panel.setByString((k!=null?k.getText():null), (v!=null?v.getText():null));
                                                                                      
                    // C:\\Users\\Robin\\eclipse\\guiLang\\gui\\src\\gsl.g:61:7: ( WS )*
                    loop23:
                    do {
                        int alt23=2;
                        int LA23_0 = input.LA(1);

                        if ( (LA23_0==WS) ) {
                            alt23=1;
                        }


                        switch (alt23) {
                    	case 1 :
                    	    // C:\\Users\\Robin\\eclipse\\guiLang\\gui\\src\\gsl.g:61:8: WS
                    	    {
                    	    match(input,WS,FOLLOW_WS_in_panel571); 

                    	    }
                    	    break;

                    	default :
                    	    break loop23;
                        }
                    } while (true);

                    // C:\\Users\\Robin\\eclipse\\guiLang\\gui\\src\\gsl.g:62:7: ( COMMA ( WS )* k= KEY_TAG ( WS )* EQUALS ( WS )* ( QUOTE )? v= STRING_LITERAL ( QUOTE )? ( WS )* )*
                    loop30:
                    do {
                        int alt30=2;
                        int LA30_0 = input.LA(1);

                        if ( (LA30_0==COMMA) ) {
                            alt30=1;
                        }


                        switch (alt30) {
                    	case 1 :
                    	    // C:\\Users\\Robin\\eclipse\\guiLang\\gui\\src\\gsl.g:63:9: COMMA ( WS )* k= KEY_TAG ( WS )* EQUALS ( WS )* ( QUOTE )? v= STRING_LITERAL ( QUOTE )? ( WS )*
                    	    {
                    	    match(input,COMMA,FOLLOW_COMMA_in_panel591); 
                    	    // C:\\Users\\Robin\\eclipse\\guiLang\\gui\\src\\gsl.g:63:15: ( WS )*
                    	    loop24:
                    	    do {
                    	        int alt24=2;
                    	        int LA24_0 = input.LA(1);

                    	        if ( (LA24_0==WS) ) {
                    	            alt24=1;
                    	        }


                    	        switch (alt24) {
                    	    	case 1 :
                    	    	    // C:\\Users\\Robin\\eclipse\\guiLang\\gui\\src\\gsl.g:63:16: WS
                    	    	    {
                    	    	    match(input,WS,FOLLOW_WS_in_panel594); 

                    	    	    }
                    	    	    break;

                    	    	default :
                    	    	    break loop24;
                    	        }
                    	    } while (true);

                    	    k=(Token)match(input,KEY_TAG,FOLLOW_KEY_TAG_in_panel600); 
                    	    // C:\\Users\\Robin\\eclipse\\guiLang\\gui\\src\\gsl.g:63:31: ( WS )*
                    	    loop25:
                    	    do {
                    	        int alt25=2;
                    	        int LA25_0 = input.LA(1);

                    	        if ( (LA25_0==WS) ) {
                    	            alt25=1;
                    	        }


                    	        switch (alt25) {
                    	    	case 1 :
                    	    	    // C:\\Users\\Robin\\eclipse\\guiLang\\gui\\src\\gsl.g:63:32: WS
                    	    	    {
                    	    	    match(input,WS,FOLLOW_WS_in_panel603); 

                    	    	    }
                    	    	    break;

                    	    	default :
                    	    	    break loop25;
                    	        }
                    	    } while (true);

                    	    match(input,EQUALS,FOLLOW_EQUALS_in_panel607); 
                    	    // C:\\Users\\Robin\\eclipse\\guiLang\\gui\\src\\gsl.g:63:44: ( WS )*
                    	    loop26:
                    	    do {
                    	        int alt26=2;
                    	        int LA26_0 = input.LA(1);

                    	        if ( (LA26_0==WS) ) {
                    	            alt26=1;
                    	        }


                    	        switch (alt26) {
                    	    	case 1 :
                    	    	    // C:\\Users\\Robin\\eclipse\\guiLang\\gui\\src\\gsl.g:63:45: WS
                    	    	    {
                    	    	    match(input,WS,FOLLOW_WS_in_panel610); 

                    	    	    }
                    	    	    break;

                    	    	default :
                    	    	    break loop26;
                    	        }
                    	    } while (true);

                    	    // C:\\Users\\Robin\\eclipse\\guiLang\\gui\\src\\gsl.g:63:50: ( QUOTE )?
                    	    int alt27=2;
                    	    int LA27_0 = input.LA(1);

                    	    if ( (LA27_0==QUOTE) ) {
                    	        alt27=1;
                    	    }
                    	    switch (alt27) {
                    	        case 1 :
                    	            // C:\\Users\\Robin\\eclipse\\guiLang\\gui\\src\\gsl.g:63:50: QUOTE
                    	            {
                    	            match(input,QUOTE,FOLLOW_QUOTE_in_panel614); 

                    	            }
                    	            break;

                    	    }

                    	    v=(Token)match(input,STRING_LITERAL,FOLLOW_STRING_LITERAL_in_panel619); 
                    	    // C:\\Users\\Robin\\eclipse\\guiLang\\gui\\src\\gsl.g:63:74: ( QUOTE )?
                    	    int alt28=2;
                    	    int LA28_0 = input.LA(1);

                    	    if ( (LA28_0==QUOTE) ) {
                    	        alt28=1;
                    	    }
                    	    switch (alt28) {
                    	        case 1 :
                    	            // C:\\Users\\Robin\\eclipse\\guiLang\\gui\\src\\gsl.g:63:74: QUOTE
                    	            {
                    	            match(input,QUOTE,FOLLOW_QUOTE_in_panel621); 

                    	            }
                    	            break;

                    	    }


                    	                                                                                     panel.setByString((k!=null?k.getText():null), (v!=null?v.getText():null));
                    	                                                                                    
                    	    // C:\\Users\\Robin\\eclipse\\guiLang\\gui\\src\\gsl.g:67:9: ( WS )*
                    	    loop29:
                    	    do {
                    	        int alt29=2;
                    	        int LA29_0 = input.LA(1);

                    	        if ( (LA29_0==WS) ) {
                    	            alt29=1;
                    	        }


                    	        switch (alt29) {
                    	    	case 1 :
                    	    	    // C:\\Users\\Robin\\eclipse\\guiLang\\gui\\src\\gsl.g:67:10: WS
                    	    	    {
                    	    	    match(input,WS,FOLLOW_WS_in_panel716); 

                    	    	    }
                    	    	    break;

                    	    	default :
                    	    	    break loop29;
                    	        }
                    	    } while (true);


                    	    }
                    	    break;

                    	default :
                    	    break loop30;
                        }
                    } while (true);


                    }
                    break;

            }

            match(input,CLOSE,FOLLOW_CLOSE_in_panel740); 
            // C:\\Users\\Robin\\eclipse\\guiLang\\gui\\src\\gsl.g:70:11: ( WS )*
            loop32:
            do {
                int alt32=2;
                int LA32_0 = input.LA(1);

                if ( (LA32_0==WS) ) {
                    alt32=1;
                }


                switch (alt32) {
            	case 1 :
            	    // C:\\Users\\Robin\\eclipse\\guiLang\\gui\\src\\gsl.g:70:12: WS
            	    {
            	    match(input,WS,FOLLOW_WS_in_panel743); 

            	    }
            	    break;

            	default :
            	    break loop32;
                }
            } while (true);

            // C:\\Users\\Robin\\eclipse\\guiLang\\gui\\src\\gsl.g:70:17: ( tag )+
            int cnt33=0;
            loop33:
            do {
                int alt33=2;
                int LA33_0 = input.LA(1);

                if ( (LA33_0==OPEN) ) {
                    int LA33_1 = input.LA(2);

                    if ( (LA33_1==TAGS) ) {
                        alt33=1;
                    }


                }


                switch (alt33) {
            	case 1 :
            	    // C:\\Users\\Robin\\eclipse\\guiLang\\gui\\src\\gsl.g:70:18: tag
            	    {
            	    pushFollow(FOLLOW_tag_in_panel748);
            	    tag2=tag();

            	    state._fsp--;


            	                          panel.addChild(tag2);
            	                         

            	    }
            	    break;

            	default :
            	    if ( cnt33 >= 1 ) break loop33;
                        EarlyExitException eee =
                            new EarlyExitException(33, input);
                        throw eee;
                }
                cnt33++;
            } while (true);

            match(input,OPEN,FOLLOW_OPEN_in_panel776); 
            match(input,SLASH,FOLLOW_SLASH_in_panel778); 
            match(input,PANEL_TAG,FOLLOW_PANEL_TAG_in_panel780); 
            match(input,CLOSE,FOLLOW_CLOSE_in_panel782); 
            // C:\\Users\\Robin\\eclipse\\guiLang\\gui\\src\\gsl.g:73:53: ( WS )*
            loop34:
            do {
                int alt34=2;
                int LA34_0 = input.LA(1);

                if ( (LA34_0==WS) ) {
                    alt34=1;
                }


                switch (alt34) {
            	case 1 :
            	    // C:\\Users\\Robin\\eclipse\\guiLang\\gui\\src\\gsl.g:73:54: WS
            	    {
            	    match(input,WS,FOLLOW_WS_in_panel785); 

            	    }
            	    break;

            	default :
            	    break loop34;
                }
            } while (true);


            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return panel;
    }
    // $ANTLR end "panel"


    // $ANTLR start "tag"
    // C:\\Users\\Robin\\eclipse\\guiLang\\gui\\src\\gsl.g:77:1: tag returns [Tree tags = new Tree()] : OPEN t= TAGS ( WS )* (k= KEY_TAG ( WS )* EQUALS ( WS )* ( QUOTE )? v= STRING_LITERAL ( QUOTE )? ( WS )* ( COMMA ( WS )* k= KEY_TAG ( WS )* EQUALS ( WS )* ( QUOTE )? v= STRING_LITERAL ( QUOTE )? ( WS )* )* )? CLOSE text OPEN SLASH TAGS CLOSE ( WS )* ;
    public final Tree tag() throws RecognitionException {
        Tree tags =  new Tree();

        Token t=null;
        Token k=null;
        Token v=null;
        String text3 = null;


        try {
            // C:\\Users\\Robin\\eclipse\\guiLang\\gui\\src\\gsl.g:78:3: ( OPEN t= TAGS ( WS )* (k= KEY_TAG ( WS )* EQUALS ( WS )* ( QUOTE )? v= STRING_LITERAL ( QUOTE )? ( WS )* ( COMMA ( WS )* k= KEY_TAG ( WS )* EQUALS ( WS )* ( QUOTE )? v= STRING_LITERAL ( QUOTE )? ( WS )* )* )? CLOSE text OPEN SLASH TAGS CLOSE ( WS )* )
            // C:\\Users\\Robin\\eclipse\\guiLang\\gui\\src\\gsl.g:79:3: OPEN t= TAGS ( WS )* (k= KEY_TAG ( WS )* EQUALS ( WS )* ( QUOTE )? v= STRING_LITERAL ( QUOTE )? ( WS )* ( COMMA ( WS )* k= KEY_TAG ( WS )* EQUALS ( WS )* ( QUOTE )? v= STRING_LITERAL ( QUOTE )? ( WS )* )* )? CLOSE text OPEN SLASH TAGS CLOSE ( WS )*
            {
            match(input,OPEN,FOLLOW_OPEN_in_tag810); 
            t=(Token)match(input,TAGS,FOLLOW_TAGS_in_tag814); 

                           tags.setType((t!=null?t.getText():null));
                          
            // C:\\Users\\Robin\\eclipse\\guiLang\\gui\\src\\gsl.g:83:3: ( WS )*
            loop35:
            do {
                int alt35=2;
                int LA35_0 = input.LA(1);

                if ( (LA35_0==WS) ) {
                    alt35=1;
                }


                switch (alt35) {
            	case 1 :
            	    // C:\\Users\\Robin\\eclipse\\guiLang\\gui\\src\\gsl.g:83:4: WS
            	    {
            	    match(input,WS,FOLLOW_WS_in_tag836); 

            	    }
            	    break;

            	default :
            	    break loop35;
                }
            } while (true);

            // C:\\Users\\Robin\\eclipse\\guiLang\\gui\\src\\gsl.g:84:3: (k= KEY_TAG ( WS )* EQUALS ( WS )* ( QUOTE )? v= STRING_LITERAL ( QUOTE )? ( WS )* ( COMMA ( WS )* k= KEY_TAG ( WS )* EQUALS ( WS )* ( QUOTE )? v= STRING_LITERAL ( QUOTE )? ( WS )* )* )?
            int alt48=2;
            int LA48_0 = input.LA(1);

            if ( (LA48_0==KEY_TAG) ) {
                alt48=1;
            }
            switch (alt48) {
                case 1 :
                    // C:\\Users\\Robin\\eclipse\\guiLang\\gui\\src\\gsl.g:85:5: k= KEY_TAG ( WS )* EQUALS ( WS )* ( QUOTE )? v= STRING_LITERAL ( QUOTE )? ( WS )* ( COMMA ( WS )* k= KEY_TAG ( WS )* EQUALS ( WS )* ( QUOTE )? v= STRING_LITERAL ( QUOTE )? ( WS )* )*
                    {
                    k=(Token)match(input,KEY_TAG,FOLLOW_KEY_TAG_in_tag850); 
                    // C:\\Users\\Robin\\eclipse\\guiLang\\gui\\src\\gsl.g:85:15: ( WS )*
                    loop36:
                    do {
                        int alt36=2;
                        int LA36_0 = input.LA(1);

                        if ( (LA36_0==WS) ) {
                            alt36=1;
                        }


                        switch (alt36) {
                    	case 1 :
                    	    // C:\\Users\\Robin\\eclipse\\guiLang\\gui\\src\\gsl.g:85:16: WS
                    	    {
                    	    match(input,WS,FOLLOW_WS_in_tag853); 

                    	    }
                    	    break;

                    	default :
                    	    break loop36;
                        }
                    } while (true);

                    match(input,EQUALS,FOLLOW_EQUALS_in_tag857); 
                    // C:\\Users\\Robin\\eclipse\\guiLang\\gui\\src\\gsl.g:85:28: ( WS )*
                    loop37:
                    do {
                        int alt37=2;
                        int LA37_0 = input.LA(1);

                        if ( (LA37_0==WS) ) {
                            alt37=1;
                        }


                        switch (alt37) {
                    	case 1 :
                    	    // C:\\Users\\Robin\\eclipse\\guiLang\\gui\\src\\gsl.g:85:29: WS
                    	    {
                    	    match(input,WS,FOLLOW_WS_in_tag860); 

                    	    }
                    	    break;

                    	default :
                    	    break loop37;
                        }
                    } while (true);

                    // C:\\Users\\Robin\\eclipse\\guiLang\\gui\\src\\gsl.g:85:34: ( QUOTE )?
                    int alt38=2;
                    int LA38_0 = input.LA(1);

                    if ( (LA38_0==QUOTE) ) {
                        alt38=1;
                    }
                    switch (alt38) {
                        case 1 :
                            // C:\\Users\\Robin\\eclipse\\guiLang\\gui\\src\\gsl.g:85:34: QUOTE
                            {
                            match(input,QUOTE,FOLLOW_QUOTE_in_tag864); 

                            }
                            break;

                    }

                    v=(Token)match(input,STRING_LITERAL,FOLLOW_STRING_LITERAL_in_tag869); 
                    // C:\\Users\\Robin\\eclipse\\guiLang\\gui\\src\\gsl.g:85:58: ( QUOTE )?
                    int alt39=2;
                    int LA39_0 = input.LA(1);

                    if ( (LA39_0==QUOTE) ) {
                        alt39=1;
                    }
                    switch (alt39) {
                        case 1 :
                            // C:\\Users\\Robin\\eclipse\\guiLang\\gui\\src\\gsl.g:85:58: QUOTE
                            {
                            match(input,QUOTE,FOLLOW_QUOTE_in_tag871); 

                            }
                            break;

                    }


                                                                                     tags.setByString((k!=null?k.getText():null), (v!=null?v.getText():null));
                                                                                    
                    // C:\\Users\\Robin\\eclipse\\guiLang\\gui\\src\\gsl.g:89:5: ( WS )*
                    loop40:
                    do {
                        int alt40=2;
                        int LA40_0 = input.LA(1);

                        if ( (LA40_0==WS) ) {
                            alt40=1;
                        }


                        switch (alt40) {
                    	case 1 :
                    	    // C:\\Users\\Robin\\eclipse\\guiLang\\gui\\src\\gsl.g:89:6: WS
                    	    {
                    	    match(input,WS,FOLLOW_WS_in_tag946); 

                    	    }
                    	    break;

                    	default :
                    	    break loop40;
                        }
                    } while (true);

                    // C:\\Users\\Robin\\eclipse\\guiLang\\gui\\src\\gsl.g:90:5: ( COMMA ( WS )* k= KEY_TAG ( WS )* EQUALS ( WS )* ( QUOTE )? v= STRING_LITERAL ( QUOTE )? ( WS )* )*
                    loop47:
                    do {
                        int alt47=2;
                        int LA47_0 = input.LA(1);

                        if ( (LA47_0==COMMA) ) {
                            alt47=1;
                        }


                        switch (alt47) {
                    	case 1 :
                    	    // C:\\Users\\Robin\\eclipse\\guiLang\\gui\\src\\gsl.g:91:7: COMMA ( WS )* k= KEY_TAG ( WS )* EQUALS ( WS )* ( QUOTE )? v= STRING_LITERAL ( QUOTE )? ( WS )*
                    	    {
                    	    match(input,COMMA,FOLLOW_COMMA_in_tag962); 
                    	    // C:\\Users\\Robin\\eclipse\\guiLang\\gui\\src\\gsl.g:91:13: ( WS )*
                    	    loop41:
                    	    do {
                    	        int alt41=2;
                    	        int LA41_0 = input.LA(1);

                    	        if ( (LA41_0==WS) ) {
                    	            alt41=1;
                    	        }


                    	        switch (alt41) {
                    	    	case 1 :
                    	    	    // C:\\Users\\Robin\\eclipse\\guiLang\\gui\\src\\gsl.g:91:14: WS
                    	    	    {
                    	    	    match(input,WS,FOLLOW_WS_in_tag965); 

                    	    	    }
                    	    	    break;

                    	    	default :
                    	    	    break loop41;
                    	        }
                    	    } while (true);

                    	    k=(Token)match(input,KEY_TAG,FOLLOW_KEY_TAG_in_tag971); 
                    	    // C:\\Users\\Robin\\eclipse\\guiLang\\gui\\src\\gsl.g:91:29: ( WS )*
                    	    loop42:
                    	    do {
                    	        int alt42=2;
                    	        int LA42_0 = input.LA(1);

                    	        if ( (LA42_0==WS) ) {
                    	            alt42=1;
                    	        }


                    	        switch (alt42) {
                    	    	case 1 :
                    	    	    // C:\\Users\\Robin\\eclipse\\guiLang\\gui\\src\\gsl.g:91:30: WS
                    	    	    {
                    	    	    match(input,WS,FOLLOW_WS_in_tag974); 

                    	    	    }
                    	    	    break;

                    	    	default :
                    	    	    break loop42;
                    	        }
                    	    } while (true);

                    	    match(input,EQUALS,FOLLOW_EQUALS_in_tag978); 
                    	    // C:\\Users\\Robin\\eclipse\\guiLang\\gui\\src\\gsl.g:91:42: ( WS )*
                    	    loop43:
                    	    do {
                    	        int alt43=2;
                    	        int LA43_0 = input.LA(1);

                    	        if ( (LA43_0==WS) ) {
                    	            alt43=1;
                    	        }


                    	        switch (alt43) {
                    	    	case 1 :
                    	    	    // C:\\Users\\Robin\\eclipse\\guiLang\\gui\\src\\gsl.g:91:43: WS
                    	    	    {
                    	    	    match(input,WS,FOLLOW_WS_in_tag981); 

                    	    	    }
                    	    	    break;

                    	    	default :
                    	    	    break loop43;
                    	        }
                    	    } while (true);

                    	    // C:\\Users\\Robin\\eclipse\\guiLang\\gui\\src\\gsl.g:91:48: ( QUOTE )?
                    	    int alt44=2;
                    	    int LA44_0 = input.LA(1);

                    	    if ( (LA44_0==QUOTE) ) {
                    	        alt44=1;
                    	    }
                    	    switch (alt44) {
                    	        case 1 :
                    	            // C:\\Users\\Robin\\eclipse\\guiLang\\gui\\src\\gsl.g:91:48: QUOTE
                    	            {
                    	            match(input,QUOTE,FOLLOW_QUOTE_in_tag985); 

                    	            }
                    	            break;

                    	    }

                    	    v=(Token)match(input,STRING_LITERAL,FOLLOW_STRING_LITERAL_in_tag990); 
                    	    // C:\\Users\\Robin\\eclipse\\guiLang\\gui\\src\\gsl.g:91:72: ( QUOTE )?
                    	    int alt45=2;
                    	    int LA45_0 = input.LA(1);

                    	    if ( (LA45_0==QUOTE) ) {
                    	        alt45=1;
                    	    }
                    	    switch (alt45) {
                    	        case 1 :
                    	            // C:\\Users\\Robin\\eclipse\\guiLang\\gui\\src\\gsl.g:91:72: QUOTE
                    	            {
                    	            match(input,QUOTE,FOLLOW_QUOTE_in_tag992); 

                    	            }
                    	            break;

                    	    }


                    	                                                                                   tags.setByString((k!=null?k.getText():null), (v!=null?v.getText():null));
                    	                                                                                  
                    	    // C:\\Users\\Robin\\eclipse\\guiLang\\gui\\src\\gsl.g:95:7: ( WS )*
                    	    loop46:
                    	    do {
                    	        int alt46=2;
                    	        int LA46_0 = input.LA(1);

                    	        if ( (LA46_0==WS) ) {
                    	            alt46=1;
                    	        }


                    	        switch (alt46) {
                    	    	case 1 :
                    	    	    // C:\\Users\\Robin\\eclipse\\guiLang\\gui\\src\\gsl.g:95:8: WS
                    	    	    {
                    	    	    match(input,WS,FOLLOW_WS_in_tag1083); 

                    	    	    }
                    	    	    break;

                    	    	default :
                    	    	    break loop46;
                    	        }
                    	    } while (true);


                    	    }
                    	    break;

                    	default :
                    	    break loop47;
                        }
                    } while (true);


                    }
                    break;

            }

            match(input,CLOSE,FOLLOW_CLOSE_in_tag1101); 
            pushFollow(FOLLOW_text_in_tag1103);
            text3=text();

            state._fsp--;

            match(input,OPEN,FOLLOW_OPEN_in_tag1105); 
            match(input,SLASH,FOLLOW_SLASH_in_tag1107); 
            match(input,TAGS,FOLLOW_TAGS_in_tag1109); 
            match(input,CLOSE,FOLLOW_CLOSE_in_tag1111); 

                                                tags.setBodyText(text3);
                                               
            // C:\\Users\\Robin\\eclipse\\guiLang\\gui\\src\\gsl.g:102:3: ( WS )*
            loop49:
            do {
                int alt49=2;
                int LA49_0 = input.LA(1);

                if ( (LA49_0==WS) ) {
                    alt49=1;
                }


                switch (alt49) {
            	case 1 :
            	    // C:\\Users\\Robin\\eclipse\\guiLang\\gui\\src\\gsl.g:102:4: WS
            	    {
            	    match(input,WS,FOLLOW_WS_in_tag1154); 

            	    }
            	    break;

            	default :
            	    break loop49;
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
        return tags;
    }
    // $ANTLR end "tag"


    // $ANTLR start "text"
    // C:\\Users\\Robin\\eclipse\\guiLang\\gui\\src\\gsl.g:105:1: text returns [String text = new String();] : ( WS )* ( (t= STRING_LITERAL )+ (w= WS )+ )+ ;
    public final String text() throws RecognitionException {
        String text =  new String();;

        Token t=null;
        Token w=null;

        try {
            // C:\\Users\\Robin\\eclipse\\guiLang\\gui\\src\\gsl.g:106:3: ( ( WS )* ( (t= STRING_LITERAL )+ (w= WS )+ )+ )
            // C:\\Users\\Robin\\eclipse\\guiLang\\gui\\src\\gsl.g:107:3: ( WS )* ( (t= STRING_LITERAL )+ (w= WS )+ )+
            {
            // C:\\Users\\Robin\\eclipse\\guiLang\\gui\\src\\gsl.g:107:3: ( WS )*
            loop50:
            do {
                int alt50=2;
                int LA50_0 = input.LA(1);

                if ( (LA50_0==WS) ) {
                    alt50=1;
                }


                switch (alt50) {
            	case 1 :
            	    // C:\\Users\\Robin\\eclipse\\guiLang\\gui\\src\\gsl.g:107:4: WS
            	    {
            	    match(input,WS,FOLLOW_WS_in_text1176); 

            	    }
            	    break;

            	default :
            	    break loop50;
                }
            } while (true);

            // C:\\Users\\Robin\\eclipse\\guiLang\\gui\\src\\gsl.g:108:3: ( (t= STRING_LITERAL )+ (w= WS )+ )+
            int cnt53=0;
            loop53:
            do {
                int alt53=2;
                int LA53_0 = input.LA(1);

                if ( (LA53_0==STRING_LITERAL) ) {
                    alt53=1;
                }


                switch (alt53) {
            	case 1 :
            	    // C:\\Users\\Robin\\eclipse\\guiLang\\gui\\src\\gsl.g:109:5: (t= STRING_LITERAL )+ (w= WS )+
            	    {
            	    // C:\\Users\\Robin\\eclipse\\guiLang\\gui\\src\\gsl.g:109:5: (t= STRING_LITERAL )+
            	    int cnt51=0;
            	    loop51:
            	    do {
            	        int alt51=2;
            	        int LA51_0 = input.LA(1);

            	        if ( (LA51_0==STRING_LITERAL) ) {
            	            alt51=1;
            	        }


            	        switch (alt51) {
            	    	case 1 :
            	    	    // C:\\Users\\Robin\\eclipse\\guiLang\\gui\\src\\gsl.g:109:6: t= STRING_LITERAL
            	    	    {
            	    	    t=(Token)match(input,STRING_LITERAL,FOLLOW_STRING_LITERAL_in_text1191); 

            	    	                           text += (t!=null?t.getText():null);
            	    	                          

            	    	    }
            	    	    break;

            	    	default :
            	    	    if ( cnt51 >= 1 ) break loop51;
            	                EarlyExitException eee =
            	                    new EarlyExitException(51, input);
            	                throw eee;
            	        }
            	        cnt51++;
            	    } while (true);

            	    // C:\\Users\\Robin\\eclipse\\guiLang\\gui\\src\\gsl.g:112:27: (w= WS )+
            	    int cnt52=0;
            	    loop52:
            	    do {
            	        int alt52=2;
            	        int LA52_0 = input.LA(1);

            	        if ( (LA52_0==WS) ) {
            	            alt52=1;
            	        }


            	        switch (alt52) {
            	    	case 1 :
            	    	    // C:\\Users\\Robin\\eclipse\\guiLang\\gui\\src\\gsl.g:112:28: w= WS
            	    	    {
            	    	    w=(Token)match(input,WS,FOLLOW_WS_in_text1223); 

            	    	                                     text += (w!=null?w.getText():null);
            	    	                                    

            	    	    }
            	    	    break;

            	    	default :
            	    	    if ( cnt52 >= 1 ) break loop52;
            	                EarlyExitException eee =
            	                    new EarlyExitException(52, input);
            	                throw eee;
            	        }
            	        cnt52++;
            	    } while (true);


            	    }
            	    break;

            	default :
            	    if ( cnt53 >= 1 ) break loop53;
                        EarlyExitException eee =
                            new EarlyExitException(53, input);
                        throw eee;
                }
                cnt53++;
            } while (true);


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return text;
    }
    // $ANTLR end "text"

    // Delegated rules


 

    public static final BitSet FOLLOW_OPEN_in_window53 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_WINDOW_TAG_in_window55 = new BitSet(new long[]{0x00000000000010C0L});
    public static final BitSet FOLLOW_WS_in_window81 = new BitSet(new long[]{0x00000000000010C0L});
    public static final BitSet FOLLOW_KEY_TAG_in_window95 = new BitSet(new long[]{0x0000000000000140L});
    public static final BitSet FOLLOW_WS_in_window98 = new BitSet(new long[]{0x0000000000000140L});
    public static final BitSet FOLLOW_EQUALS_in_window102 = new BitSet(new long[]{0x0000000000000640L});
    public static final BitSet FOLLOW_WS_in_window105 = new BitSet(new long[]{0x0000000000000640L});
    public static final BitSet FOLLOW_QUOTE_in_window109 = new BitSet(new long[]{0x0000000000000400L});
    public static final BitSet FOLLOW_STRING_LITERAL_in_window114 = new BitSet(new long[]{0x0000000000001A40L});
    public static final BitSet FOLLOW_QUOTE_in_window116 = new BitSet(new long[]{0x0000000000001840L});
    public static final BitSet FOLLOW_WS_in_window191 = new BitSet(new long[]{0x0000000000001840L});
    public static final BitSet FOLLOW_COMMA_in_window207 = new BitSet(new long[]{0x00000000000000C0L});
    public static final BitSet FOLLOW_WS_in_window210 = new BitSet(new long[]{0x00000000000000C0L});
    public static final BitSet FOLLOW_KEY_TAG_in_window216 = new BitSet(new long[]{0x0000000000000140L});
    public static final BitSet FOLLOW_WS_in_window219 = new BitSet(new long[]{0x0000000000000140L});
    public static final BitSet FOLLOW_EQUALS_in_window223 = new BitSet(new long[]{0x0000000000000640L});
    public static final BitSet FOLLOW_WS_in_window226 = new BitSet(new long[]{0x0000000000000640L});
    public static final BitSet FOLLOW_QUOTE_in_window230 = new BitSet(new long[]{0x0000000000000400L});
    public static final BitSet FOLLOW_STRING_LITERAL_in_window235 = new BitSet(new long[]{0x0000000000001A40L});
    public static final BitSet FOLLOW_QUOTE_in_window237 = new BitSet(new long[]{0x0000000000001840L});
    public static final BitSet FOLLOW_WS_in_window328 = new BitSet(new long[]{0x0000000000001840L});
    public static final BitSet FOLLOW_CLOSE_in_window346 = new BitSet(new long[]{0x0000000000000050L});
    public static final BitSet FOLLOW_WS_in_window349 = new BitSet(new long[]{0x0000000000000050L});
    public static final BitSet FOLLOW_panel_in_window354 = new BitSet(new long[]{0x0000000000000050L});
    public static final BitSet FOLLOW_OPEN_in_window382 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_SLASH_in_window384 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_WINDOW_TAG_in_window386 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_CLOSE_in_window388 = new BitSet(new long[]{0x0000000000000042L});
    public static final BitSet FOLLOW_WS_in_window391 = new BitSet(new long[]{0x0000000000000042L});
    public static final BitSet FOLLOW_OPEN_in_panel418 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_PANEL_TAG_in_panel422 = new BitSet(new long[]{0x00000000000010C0L});
    public static final BitSet FOLLOW_WS_in_panel453 = new BitSet(new long[]{0x00000000000010C0L});
    public static final BitSet FOLLOW_KEY_TAG_in_panel471 = new BitSet(new long[]{0x0000000000000140L});
    public static final BitSet FOLLOW_WS_in_panel474 = new BitSet(new long[]{0x0000000000000140L});
    public static final BitSet FOLLOW_EQUALS_in_panel478 = new BitSet(new long[]{0x0000000000000640L});
    public static final BitSet FOLLOW_WS_in_panel481 = new BitSet(new long[]{0x0000000000000640L});
    public static final BitSet FOLLOW_QUOTE_in_panel485 = new BitSet(new long[]{0x0000000000000400L});
    public static final BitSet FOLLOW_STRING_LITERAL_in_panel490 = new BitSet(new long[]{0x0000000000001A40L});
    public static final BitSet FOLLOW_QUOTE_in_panel492 = new BitSet(new long[]{0x0000000000001840L});
    public static final BitSet FOLLOW_WS_in_panel571 = new BitSet(new long[]{0x0000000000001840L});
    public static final BitSet FOLLOW_COMMA_in_panel591 = new BitSet(new long[]{0x00000000000000C0L});
    public static final BitSet FOLLOW_WS_in_panel594 = new BitSet(new long[]{0x00000000000000C0L});
    public static final BitSet FOLLOW_KEY_TAG_in_panel600 = new BitSet(new long[]{0x0000000000000140L});
    public static final BitSet FOLLOW_WS_in_panel603 = new BitSet(new long[]{0x0000000000000140L});
    public static final BitSet FOLLOW_EQUALS_in_panel607 = new BitSet(new long[]{0x0000000000000640L});
    public static final BitSet FOLLOW_WS_in_panel610 = new BitSet(new long[]{0x0000000000000640L});
    public static final BitSet FOLLOW_QUOTE_in_panel614 = new BitSet(new long[]{0x0000000000000400L});
    public static final BitSet FOLLOW_STRING_LITERAL_in_panel619 = new BitSet(new long[]{0x0000000000001A40L});
    public static final BitSet FOLLOW_QUOTE_in_panel621 = new BitSet(new long[]{0x0000000000001840L});
    public static final BitSet FOLLOW_WS_in_panel716 = new BitSet(new long[]{0x0000000000001840L});
    public static final BitSet FOLLOW_CLOSE_in_panel740 = new BitSet(new long[]{0x0000000000000050L});
    public static final BitSet FOLLOW_WS_in_panel743 = new BitSet(new long[]{0x0000000000000050L});
    public static final BitSet FOLLOW_tag_in_panel748 = new BitSet(new long[]{0x0000000000000050L});
    public static final BitSet FOLLOW_OPEN_in_panel776 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_SLASH_in_panel778 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_PANEL_TAG_in_panel780 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_CLOSE_in_panel782 = new BitSet(new long[]{0x0000000000000042L});
    public static final BitSet FOLLOW_WS_in_panel785 = new BitSet(new long[]{0x0000000000000042L});
    public static final BitSet FOLLOW_OPEN_in_tag810 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_TAGS_in_tag814 = new BitSet(new long[]{0x00000000000010C0L});
    public static final BitSet FOLLOW_WS_in_tag836 = new BitSet(new long[]{0x00000000000010C0L});
    public static final BitSet FOLLOW_KEY_TAG_in_tag850 = new BitSet(new long[]{0x0000000000000140L});
    public static final BitSet FOLLOW_WS_in_tag853 = new BitSet(new long[]{0x0000000000000140L});
    public static final BitSet FOLLOW_EQUALS_in_tag857 = new BitSet(new long[]{0x0000000000000640L});
    public static final BitSet FOLLOW_WS_in_tag860 = new BitSet(new long[]{0x0000000000000640L});
    public static final BitSet FOLLOW_QUOTE_in_tag864 = new BitSet(new long[]{0x0000000000000400L});
    public static final BitSet FOLLOW_STRING_LITERAL_in_tag869 = new BitSet(new long[]{0x0000000000001A40L});
    public static final BitSet FOLLOW_QUOTE_in_tag871 = new BitSet(new long[]{0x0000000000001840L});
    public static final BitSet FOLLOW_WS_in_tag946 = new BitSet(new long[]{0x0000000000001840L});
    public static final BitSet FOLLOW_COMMA_in_tag962 = new BitSet(new long[]{0x00000000000000C0L});
    public static final BitSet FOLLOW_WS_in_tag965 = new BitSet(new long[]{0x00000000000000C0L});
    public static final BitSet FOLLOW_KEY_TAG_in_tag971 = new BitSet(new long[]{0x0000000000000140L});
    public static final BitSet FOLLOW_WS_in_tag974 = new BitSet(new long[]{0x0000000000000140L});
    public static final BitSet FOLLOW_EQUALS_in_tag978 = new BitSet(new long[]{0x0000000000000640L});
    public static final BitSet FOLLOW_WS_in_tag981 = new BitSet(new long[]{0x0000000000000640L});
    public static final BitSet FOLLOW_QUOTE_in_tag985 = new BitSet(new long[]{0x0000000000000400L});
    public static final BitSet FOLLOW_STRING_LITERAL_in_tag990 = new BitSet(new long[]{0x0000000000001A40L});
    public static final BitSet FOLLOW_QUOTE_in_tag992 = new BitSet(new long[]{0x0000000000001840L});
    public static final BitSet FOLLOW_WS_in_tag1083 = new BitSet(new long[]{0x0000000000001840L});
    public static final BitSet FOLLOW_CLOSE_in_tag1101 = new BitSet(new long[]{0x0000000000000440L});
    public static final BitSet FOLLOW_text_in_tag1103 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_OPEN_in_tag1105 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_SLASH_in_tag1107 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_TAGS_in_tag1109 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_CLOSE_in_tag1111 = new BitSet(new long[]{0x0000000000000042L});
    public static final BitSet FOLLOW_WS_in_tag1154 = new BitSet(new long[]{0x0000000000000042L});
    public static final BitSet FOLLOW_WS_in_text1176 = new BitSet(new long[]{0x0000000000000440L});
    public static final BitSet FOLLOW_STRING_LITERAL_in_text1191 = new BitSet(new long[]{0x0000000000000440L});
    public static final BitSet FOLLOW_WS_in_text1223 = new BitSet(new long[]{0x0000000000000442L});

}