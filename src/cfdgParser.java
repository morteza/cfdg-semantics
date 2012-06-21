// $ANTLR 3.4 /Volumes/Personal HD/Workspace/CFDG-Semantics/src/cfdg.g 2012-06-22 03:43:51

import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked"})
public class cfdgParser extends Parser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "ALPHA", "BACKGROUND", "BRIGHTNESS", "CIRCLE_P", "FLIP", "HUE", "INTEGER", "LEFTBRACE", "LEFTBRACKET", "RATIONAL", "RIGHTBRACE", "RIGHTBRACKET", "ROTATE", "RULE", "SATURATION", "SIZE", "SKEW", "SQUARE_P", "STAR", "STARTSHAPE", "TARGETALPHA", "TARGETBRIGHTNESS", "TARGETHUE", "TARGETSATURATION", "TRIANGLE_P", "USER_RATIONAL", "USER_RATIONAL_TARGET", "USER_STRING", "WHITESPACE", "XSHIFT", "YSHIFT", "ZSHIFT"
    };

    public static final int EOF=-1;
    public static final int ALPHA=4;
    public static final int BACKGROUND=5;
    public static final int BRIGHTNESS=6;
    public static final int CIRCLE_P=7;
    public static final int FLIP=8;
    public static final int HUE=9;
    public static final int INTEGER=10;
    public static final int LEFTBRACE=11;
    public static final int LEFTBRACKET=12;
    public static final int RATIONAL=13;
    public static final int RIGHTBRACE=14;
    public static final int RIGHTBRACKET=15;
    public static final int ROTATE=16;
    public static final int RULE=17;
    public static final int SATURATION=18;
    public static final int SIZE=19;
    public static final int SKEW=20;
    public static final int SQUARE_P=21;
    public static final int STAR=22;
    public static final int STARTSHAPE=23;
    public static final int TARGETALPHA=24;
    public static final int TARGETBRIGHTNESS=25;
    public static final int TARGETHUE=26;
    public static final int TARGETSATURATION=27;
    public static final int TRIANGLE_P=28;
    public static final int USER_RATIONAL=29;
    public static final int USER_RATIONAL_TARGET=30;
    public static final int USER_STRING=31;
    public static final int WHITESPACE=32;
    public static final int XSHIFT=33;
    public static final int YSHIFT=34;
    public static final int ZSHIFT=35;

    // delegates
    public Parser[] getDelegates() {
        return new Parser[] {};
    }

    // delegators


    public cfdgParser(TokenStream input) {
        this(input, new RecognizerSharedState());
    }
    public cfdgParser(TokenStream input, RecognizerSharedState state) {
        super(input, state);
    }

    public String[] getTokenNames() { return cfdgParser.tokenNames; }
    public String getGrammarFileName() { return "/Volumes/Personal HD/Workspace/CFDG-Semantics/src/cfdg.g"; }


        public String getErrorMessage(RecognitionException e,String[] tokenNames) {
            List stack = getRuleInvocationStack(e, this.getClass().getName());
            String msg = null;
            if ( e instanceof NoViableAltException ) {
                NoViableAltException nvae = (NoViableAltException)e;
                msg = " no viable alt; token="+e.token+
                " (decision="+nvae.decisionNumber+
                " state "+nvae.stateNumber+")"+
                " decision=<<"+nvae.grammarDecisionDescription+">>";
            }
            else {
                msg = super.getErrorMessage(e, tokenNames);
            }
            return stack+" "+msg;
        }
        
        public String getTokenErrorDisplay(Token t) {
            return t.toString();
        }



    // $ANTLR start "document"
    // /Volumes/Personal HD/Workspace/CFDG-Semantics/src/cfdg.g:26:1: document : ( statement )+ ;
    public final void document() throws RecognitionException {
        try {
            // /Volumes/Personal HD/Workspace/CFDG-Semantics/src/cfdg.g:27:5: ( ( statement )+ )
            // /Volumes/Personal HD/Workspace/CFDG-Semantics/src/cfdg.g:27:10: ( statement )+
            {
            // /Volumes/Personal HD/Workspace/CFDG-Semantics/src/cfdg.g:27:10: ( statement )+
            int cnt1=0;
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( (LA1_0==BACKGROUND||LA1_0==RULE||LA1_0==STARTSHAPE) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // /Volumes/Personal HD/Workspace/CFDG-Semantics/src/cfdg.g:27:11: statement
            	    {
            	    pushFollow(FOLLOW_statement_in_document34);
            	    statement();

            	    state._fsp--;


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

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
        }
        return ;
    }
    // $ANTLR end "document"



    // $ANTLR start "statement"
    // /Volumes/Personal HD/Workspace/CFDG-Semantics/src/cfdg.g:30:1: statement : ( init | background | rule );
    public final void statement() throws RecognitionException {
        try {
            // /Volumes/Personal HD/Workspace/CFDG-Semantics/src/cfdg.g:31:5: ( init | background | rule )
            int alt2=3;
            switch ( input.LA(1) ) {
            case STARTSHAPE:
                {
                alt2=1;
                }
                break;
            case BACKGROUND:
                {
                alt2=2;
                }
                break;
            case RULE:
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
                    // /Volumes/Personal HD/Workspace/CFDG-Semantics/src/cfdg.g:31:10: init
                    {
                    pushFollow(FOLLOW_init_in_statement64);
                    init();

                    state._fsp--;


                    }
                    break;
                case 2 :
                    // /Volumes/Personal HD/Workspace/CFDG-Semantics/src/cfdg.g:32:10: background
                    {
                    pushFollow(FOLLOW_background_in_statement75);
                    background();

                    state._fsp--;


                    }
                    break;
                case 3 :
                    // /Volumes/Personal HD/Workspace/CFDG-Semantics/src/cfdg.g:33:10: rule
                    {
                    pushFollow(FOLLOW_rule_in_statement86);
                    rule();

                    state._fsp--;


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
        return ;
    }
    // $ANTLR end "statement"



    // $ANTLR start "init"
    // /Volumes/Personal HD/Workspace/CFDG-Semantics/src/cfdg.g:36:1: init : STARTSHAPE USER_STRING ;
    public final void init() throws RecognitionException {
        try {
            // /Volumes/Personal HD/Workspace/CFDG-Semantics/src/cfdg.g:37:5: ( STARTSHAPE USER_STRING )
            // /Volumes/Personal HD/Workspace/CFDG-Semantics/src/cfdg.g:37:10: STARTSHAPE USER_STRING
            {
            match(input,STARTSHAPE,FOLLOW_STARTSHAPE_in_init110); 

            match(input,USER_STRING,FOLLOW_USER_STRING_in_init112); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
        }
        return ;
    }
    // $ANTLR end "init"



    // $ANTLR start "background"
    // /Volumes/Personal HD/Workspace/CFDG-Semantics/src/cfdg.g:40:1: background : BACKGROUND LEFTBRACKET ( buncha_color_adjustments )? RIGHTBRACKET ;
    public final void background() throws RecognitionException {
        try {
            // /Volumes/Personal HD/Workspace/CFDG-Semantics/src/cfdg.g:41:5: ( BACKGROUND LEFTBRACKET ( buncha_color_adjustments )? RIGHTBRACKET )
            // /Volumes/Personal HD/Workspace/CFDG-Semantics/src/cfdg.g:41:10: BACKGROUND LEFTBRACKET ( buncha_color_adjustments )? RIGHTBRACKET
            {
            match(input,BACKGROUND,FOLLOW_BACKGROUND_in_background136); 

            match(input,LEFTBRACKET,FOLLOW_LEFTBRACKET_in_background138); 

            // /Volumes/Personal HD/Workspace/CFDG-Semantics/src/cfdg.g:41:33: ( buncha_color_adjustments )?
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0==ALPHA||LA3_0==BRIGHTNESS||LA3_0==HUE||LA3_0==SATURATION||(LA3_0 >= TARGETALPHA && LA3_0 <= TARGETSATURATION)) ) {
                alt3=1;
            }
            switch (alt3) {
                case 1 :
                    // /Volumes/Personal HD/Workspace/CFDG-Semantics/src/cfdg.g:41:33: buncha_color_adjustments
                    {
                    pushFollow(FOLLOW_buncha_color_adjustments_in_background140);
                    buncha_color_adjustments();

                    state._fsp--;


                    }
                    break;

            }


            match(input,RIGHTBRACKET,FOLLOW_RIGHTBRACKET_in_background143); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
        }
        return ;
    }
    // $ANTLR end "background"



    // $ANTLR start "size"
    // /Volumes/Personal HD/Workspace/CFDG-Semantics/src/cfdg.g:44:1: size : SIZE modification ;
    public final void size() throws RecognitionException {
        try {
            // /Volumes/Personal HD/Workspace/CFDG-Semantics/src/cfdg.g:45:5: ( SIZE modification )
            // /Volumes/Personal HD/Workspace/CFDG-Semantics/src/cfdg.g:45:10: SIZE modification
            {
            match(input,SIZE,FOLLOW_SIZE_in_size171); 

            pushFollow(FOLLOW_modification_in_size173);
            modification();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
        }
        return ;
    }
    // $ANTLR end "size"



    // $ANTLR start "rule"
    // /Volumes/Personal HD/Workspace/CFDG-Semantics/src/cfdg.g:49:1: rule : ( RULE USER_STRING LEFTBRACKET ( buncha_replacements )? RIGHTBRACKET | RULE USER_STRING USER_RATIONAL LEFTBRACKET ( buncha_replacements )? RIGHTBRACKET );
    public final void rule() throws RecognitionException {
        try {
            // /Volumes/Personal HD/Workspace/CFDG-Semantics/src/cfdg.g:50:5: ( RULE USER_STRING LEFTBRACKET ( buncha_replacements )? RIGHTBRACKET | RULE USER_STRING USER_RATIONAL LEFTBRACKET ( buncha_replacements )? RIGHTBRACKET )
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==RULE) ) {
                int LA6_1 = input.LA(2);

                if ( (LA6_1==USER_STRING) ) {
                    int LA6_2 = input.LA(3);

                    if ( (LA6_2==LEFTBRACKET) ) {
                        alt6=1;
                    }
                    else if ( (LA6_2==USER_RATIONAL) ) {
                        alt6=2;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 6, 2, input);

                        throw nvae;

                    }
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 6, 1, input);

                    throw nvae;

                }
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 6, 0, input);

                throw nvae;

            }
            switch (alt6) {
                case 1 :
                    // /Volumes/Personal HD/Workspace/CFDG-Semantics/src/cfdg.g:50:10: RULE USER_STRING LEFTBRACKET ( buncha_replacements )? RIGHTBRACKET
                    {
                    match(input,RULE,FOLLOW_RULE_in_rule199); 

                    match(input,USER_STRING,FOLLOW_USER_STRING_in_rule201); 

                    match(input,LEFTBRACKET,FOLLOW_LEFTBRACKET_in_rule203); 

                    // /Volumes/Personal HD/Workspace/CFDG-Semantics/src/cfdg.g:50:39: ( buncha_replacements )?
                    int alt4=2;
                    int LA4_0 = input.LA(1);

                    if ( (LA4_0==USER_STRING) ) {
                        alt4=1;
                    }
                    switch (alt4) {
                        case 1 :
                            // /Volumes/Personal HD/Workspace/CFDG-Semantics/src/cfdg.g:50:39: buncha_replacements
                            {
                            pushFollow(FOLLOW_buncha_replacements_in_rule205);
                            buncha_replacements();

                            state._fsp--;


                            }
                            break;

                    }


                    match(input,RIGHTBRACKET,FOLLOW_RIGHTBRACKET_in_rule208); 

                    }
                    break;
                case 2 :
                    // /Volumes/Personal HD/Workspace/CFDG-Semantics/src/cfdg.g:51:10: RULE USER_STRING USER_RATIONAL LEFTBRACKET ( buncha_replacements )? RIGHTBRACKET
                    {
                    match(input,RULE,FOLLOW_RULE_in_rule219); 

                    match(input,USER_STRING,FOLLOW_USER_STRING_in_rule221); 

                    match(input,USER_RATIONAL,FOLLOW_USER_RATIONAL_in_rule223); 

                    match(input,LEFTBRACKET,FOLLOW_LEFTBRACKET_in_rule225); 

                    // /Volumes/Personal HD/Workspace/CFDG-Semantics/src/cfdg.g:51:53: ( buncha_replacements )?
                    int alt5=2;
                    int LA5_0 = input.LA(1);

                    if ( (LA5_0==USER_STRING) ) {
                        alt5=1;
                    }
                    switch (alt5) {
                        case 1 :
                            // /Volumes/Personal HD/Workspace/CFDG-Semantics/src/cfdg.g:51:53: buncha_replacements
                            {
                            pushFollow(FOLLOW_buncha_replacements_in_rule227);
                            buncha_replacements();

                            state._fsp--;


                            }
                            break;

                    }


                    match(input,RIGHTBRACKET,FOLLOW_RIGHTBRACKET_in_rule230); 

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
        return ;
    }
    // $ANTLR end "rule"



    // $ANTLR start "buncha_replacements"
    // /Volumes/Personal HD/Workspace/CFDG-Semantics/src/cfdg.g:54:1: buncha_replacements : ( replacement )+ ;
    public final void buncha_replacements() throws RecognitionException {
        try {
            // /Volumes/Personal HD/Workspace/CFDG-Semantics/src/cfdg.g:55:5: ( ( replacement )+ )
            // /Volumes/Personal HD/Workspace/CFDG-Semantics/src/cfdg.g:55:10: ( replacement )+
            {
            // /Volumes/Personal HD/Workspace/CFDG-Semantics/src/cfdg.g:55:10: ( replacement )+
            int cnt7=0;
            loop7:
            do {
                int alt7=2;
                int LA7_0 = input.LA(1);

                if ( (LA7_0==USER_STRING) ) {
                    alt7=1;
                }


                switch (alt7) {
            	case 1 :
            	    // /Volumes/Personal HD/Workspace/CFDG-Semantics/src/cfdg.g:55:11: replacement
            	    {
            	    pushFollow(FOLLOW_replacement_in_buncha_replacements255);
            	    replacement();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    if ( cnt7 >= 1 ) break loop7;
                        EarlyExitException eee =
                            new EarlyExitException(7, input);
                        throw eee;
                }
                cnt7++;
            } while (true);


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
        }
        return ;
    }
    // $ANTLR end "buncha_replacements"



    // $ANTLR start "replacement"
    // /Volumes/Personal HD/Workspace/CFDG-Semantics/src/cfdg.g:58:1: replacement : ( USER_STRING modification | USER_STRING STAR modification USER_STRING modification );
    public final void replacement() throws RecognitionException {
        try {
            // /Volumes/Personal HD/Workspace/CFDG-Semantics/src/cfdg.g:59:5: ( USER_STRING modification | USER_STRING STAR modification USER_STRING modification )
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0==USER_STRING) ) {
                int LA8_1 = input.LA(2);

                if ( (LA8_1==STAR) ) {
                    alt8=2;
                }
                else if ( ((LA8_1 >= LEFTBRACE && LA8_1 <= LEFTBRACKET)) ) {
                    alt8=1;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 8, 1, input);

                    throw nvae;

                }
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 8, 0, input);

                throw nvae;

            }
            switch (alt8) {
                case 1 :
                    // /Volumes/Personal HD/Workspace/CFDG-Semantics/src/cfdg.g:59:10: USER_STRING modification
                    {
                    match(input,USER_STRING,FOLLOW_USER_STRING_in_replacement281); 

                    pushFollow(FOLLOW_modification_in_replacement283);
                    modification();

                    state._fsp--;


                    }
                    break;
                case 2 :
                    // /Volumes/Personal HD/Workspace/CFDG-Semantics/src/cfdg.g:60:10: USER_STRING STAR modification USER_STRING modification
                    {
                    match(input,USER_STRING,FOLLOW_USER_STRING_in_replacement294); 

                    match(input,STAR,FOLLOW_STAR_in_replacement296); 

                    pushFollow(FOLLOW_modification_in_replacement298);
                    modification();

                    state._fsp--;


                    match(input,USER_STRING,FOLLOW_USER_STRING_in_replacement300); 

                    pushFollow(FOLLOW_modification_in_replacement302);
                    modification();

                    state._fsp--;


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
        return ;
    }
    // $ANTLR end "replacement"



    // $ANTLR start "modification"
    // /Volumes/Personal HD/Workspace/CFDG-Semantics/src/cfdg.g:63:1: modification : ( LEFTBRACKET ( buncha_adjustments )? RIGHTBRACKET | LEFTBRACE ( buncha_adjustments )? RIGHTBRACE );
    public final void modification() throws RecognitionException {
        try {
            // /Volumes/Personal HD/Workspace/CFDG-Semantics/src/cfdg.g:64:5: ( LEFTBRACKET ( buncha_adjustments )? RIGHTBRACKET | LEFTBRACE ( buncha_adjustments )? RIGHTBRACE )
            int alt11=2;
            int LA11_0 = input.LA(1);

            if ( (LA11_0==LEFTBRACKET) ) {
                alt11=1;
            }
            else if ( (LA11_0==LEFTBRACE) ) {
                alt11=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 11, 0, input);

                throw nvae;

            }
            switch (alt11) {
                case 1 :
                    // /Volumes/Personal HD/Workspace/CFDG-Semantics/src/cfdg.g:64:10: LEFTBRACKET ( buncha_adjustments )? RIGHTBRACKET
                    {
                    match(input,LEFTBRACKET,FOLLOW_LEFTBRACKET_in_modification326); 

                    // /Volumes/Personal HD/Workspace/CFDG-Semantics/src/cfdg.g:64:22: ( buncha_adjustments )?
                    int alt9=2;
                    int LA9_0 = input.LA(1);

                    if ( (LA9_0==ALPHA||LA9_0==BRIGHTNESS||(LA9_0 >= FLIP && LA9_0 <= HUE)||LA9_0==ROTATE||(LA9_0 >= SATURATION && LA9_0 <= SKEW)||(LA9_0 >= TARGETALPHA && LA9_0 <= TARGETSATURATION)||(LA9_0 >= XSHIFT && LA9_0 <= ZSHIFT)) ) {
                        alt9=1;
                    }
                    switch (alt9) {
                        case 1 :
                            // /Volumes/Personal HD/Workspace/CFDG-Semantics/src/cfdg.g:64:22: buncha_adjustments
                            {
                            pushFollow(FOLLOW_buncha_adjustments_in_modification328);
                            buncha_adjustments();

                            state._fsp--;


                            }
                            break;

                    }


                    match(input,RIGHTBRACKET,FOLLOW_RIGHTBRACKET_in_modification331); 

                    }
                    break;
                case 2 :
                    // /Volumes/Personal HD/Workspace/CFDG-Semantics/src/cfdg.g:65:10: LEFTBRACE ( buncha_adjustments )? RIGHTBRACE
                    {
                    match(input,LEFTBRACE,FOLLOW_LEFTBRACE_in_modification342); 

                    // /Volumes/Personal HD/Workspace/CFDG-Semantics/src/cfdg.g:65:20: ( buncha_adjustments )?
                    int alt10=2;
                    int LA10_0 = input.LA(1);

                    if ( (LA10_0==ALPHA||LA10_0==BRIGHTNESS||(LA10_0 >= FLIP && LA10_0 <= HUE)||LA10_0==ROTATE||(LA10_0 >= SATURATION && LA10_0 <= SKEW)||(LA10_0 >= TARGETALPHA && LA10_0 <= TARGETSATURATION)||(LA10_0 >= XSHIFT && LA10_0 <= ZSHIFT)) ) {
                        alt10=1;
                    }
                    switch (alt10) {
                        case 1 :
                            // /Volumes/Personal HD/Workspace/CFDG-Semantics/src/cfdg.g:65:20: buncha_adjustments
                            {
                            pushFollow(FOLLOW_buncha_adjustments_in_modification344);
                            buncha_adjustments();

                            state._fsp--;


                            }
                            break;

                    }


                    match(input,RIGHTBRACE,FOLLOW_RIGHTBRACE_in_modification347); 

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
        return ;
    }
    // $ANTLR end "modification"



    // $ANTLR start "buncha_adjustments"
    // /Volumes/Personal HD/Workspace/CFDG-Semantics/src/cfdg.g:68:1: buncha_adjustments : ( adjustment )+ ;
    public final void buncha_adjustments() throws RecognitionException {
        try {
            // /Volumes/Personal HD/Workspace/CFDG-Semantics/src/cfdg.g:69:5: ( ( adjustment )+ )
            // /Volumes/Personal HD/Workspace/CFDG-Semantics/src/cfdg.g:69:10: ( adjustment )+
            {
            // /Volumes/Personal HD/Workspace/CFDG-Semantics/src/cfdg.g:69:10: ( adjustment )+
            int cnt12=0;
            loop12:
            do {
                int alt12=2;
                int LA12_0 = input.LA(1);

                if ( (LA12_0==ALPHA||LA12_0==BRIGHTNESS||(LA12_0 >= FLIP && LA12_0 <= HUE)||LA12_0==ROTATE||(LA12_0 >= SATURATION && LA12_0 <= SKEW)||(LA12_0 >= TARGETALPHA && LA12_0 <= TARGETSATURATION)||(LA12_0 >= XSHIFT && LA12_0 <= ZSHIFT)) ) {
                    alt12=1;
                }


                switch (alt12) {
            	case 1 :
            	    // /Volumes/Personal HD/Workspace/CFDG-Semantics/src/cfdg.g:69:11: adjustment
            	    {
            	    pushFollow(FOLLOW_adjustment_in_buncha_adjustments372);
            	    adjustment();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    if ( cnt12 >= 1 ) break loop12;
                        EarlyExitException eee =
                            new EarlyExitException(12, input);
                        throw eee;
                }
                cnt12++;
            } while (true);


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
        }
        return ;
    }
    // $ANTLR end "buncha_adjustments"



    // $ANTLR start "buncha_color_adjustments"
    // /Volumes/Personal HD/Workspace/CFDG-Semantics/src/cfdg.g:72:1: buncha_color_adjustments : ( color_adjustment )+ ;
    public final void buncha_color_adjustments() throws RecognitionException {
        try {
            // /Volumes/Personal HD/Workspace/CFDG-Semantics/src/cfdg.g:73:5: ( ( color_adjustment )+ )
            // /Volumes/Personal HD/Workspace/CFDG-Semantics/src/cfdg.g:73:10: ( color_adjustment )+
            {
            // /Volumes/Personal HD/Workspace/CFDG-Semantics/src/cfdg.g:73:10: ( color_adjustment )+
            int cnt13=0;
            loop13:
            do {
                int alt13=2;
                int LA13_0 = input.LA(1);

                if ( (LA13_0==ALPHA||LA13_0==BRIGHTNESS||LA13_0==HUE||LA13_0==SATURATION||(LA13_0 >= TARGETALPHA && LA13_0 <= TARGETSATURATION)) ) {
                    alt13=1;
                }


                switch (alt13) {
            	case 1 :
            	    // /Volumes/Personal HD/Workspace/CFDG-Semantics/src/cfdg.g:73:11: color_adjustment
            	    {
            	    pushFollow(FOLLOW_color_adjustment_in_buncha_color_adjustments395);
            	    color_adjustment();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    if ( cnt13 >= 1 ) break loop13;
                        EarlyExitException eee =
                            new EarlyExitException(13, input);
                        throw eee;
                }
                cnt13++;
            } while (true);


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
        }
        return ;
    }
    // $ANTLR end "buncha_color_adjustments"



    // $ANTLR start "adjustment"
    // /Volumes/Personal HD/Workspace/CFDG-Semantics/src/cfdg.g:76:1: adjustment : ( ROTATE USER_RATIONAL | FLIP USER_RATIONAL | XSHIFT USER_RATIONAL | YSHIFT USER_RATIONAL | ZSHIFT USER_RATIONAL | SIZE USER_RATIONAL | SIZE USER_RATIONAL USER_RATIONAL | SIZE USER_RATIONAL USER_RATIONAL USER_RATIONAL | SKEW USER_RATIONAL USER_RATIONAL | color_adjustment );
    public final void adjustment() throws RecognitionException {
        try {
            // /Volumes/Personal HD/Workspace/CFDG-Semantics/src/cfdg.g:77:5: ( ROTATE USER_RATIONAL | FLIP USER_RATIONAL | XSHIFT USER_RATIONAL | YSHIFT USER_RATIONAL | ZSHIFT USER_RATIONAL | SIZE USER_RATIONAL | SIZE USER_RATIONAL USER_RATIONAL | SIZE USER_RATIONAL USER_RATIONAL USER_RATIONAL | SKEW USER_RATIONAL USER_RATIONAL | color_adjustment )
            int alt14=10;
            switch ( input.LA(1) ) {
            case ROTATE:
                {
                alt14=1;
                }
                break;
            case FLIP:
                {
                alt14=2;
                }
                break;
            case XSHIFT:
                {
                alt14=3;
                }
                break;
            case YSHIFT:
                {
                alt14=4;
                }
                break;
            case ZSHIFT:
                {
                alt14=5;
                }
                break;
            case SIZE:
                {
                int LA14_6 = input.LA(2);

                if ( (LA14_6==USER_RATIONAL) ) {
                    int LA14_9 = input.LA(3);

                    if ( (LA14_9==USER_RATIONAL) ) {
                        int LA14_10 = input.LA(4);

                        if ( (LA14_10==USER_RATIONAL) ) {
                            alt14=8;
                        }
                        else if ( (LA14_10==ALPHA||LA14_10==BRIGHTNESS||(LA14_10 >= FLIP && LA14_10 <= HUE)||(LA14_10 >= RIGHTBRACE && LA14_10 <= ROTATE)||(LA14_10 >= SATURATION && LA14_10 <= SKEW)||(LA14_10 >= TARGETALPHA && LA14_10 <= TARGETSATURATION)||(LA14_10 >= XSHIFT && LA14_10 <= ZSHIFT)) ) {
                            alt14=7;
                        }
                        else {
                            NoViableAltException nvae =
                                new NoViableAltException("", 14, 10, input);

                            throw nvae;

                        }
                    }
                    else if ( (LA14_9==ALPHA||LA14_9==BRIGHTNESS||(LA14_9 >= FLIP && LA14_9 <= HUE)||(LA14_9 >= RIGHTBRACE && LA14_9 <= ROTATE)||(LA14_9 >= SATURATION && LA14_9 <= SKEW)||(LA14_9 >= TARGETALPHA && LA14_9 <= TARGETSATURATION)||(LA14_9 >= XSHIFT && LA14_9 <= ZSHIFT)) ) {
                        alt14=6;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 14, 9, input);

                        throw nvae;

                    }
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 14, 6, input);

                    throw nvae;

                }
                }
                break;
            case SKEW:
                {
                alt14=9;
                }
                break;
            case ALPHA:
            case BRIGHTNESS:
            case HUE:
            case SATURATION:
            case TARGETALPHA:
            case TARGETBRIGHTNESS:
            case TARGETHUE:
            case TARGETSATURATION:
                {
                alt14=10;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 14, 0, input);

                throw nvae;

            }

            switch (alt14) {
                case 1 :
                    // /Volumes/Personal HD/Workspace/CFDG-Semantics/src/cfdg.g:77:10: ROTATE USER_RATIONAL
                    {
                    match(input,ROTATE,FOLLOW_ROTATE_in_adjustment421); 

                    match(input,USER_RATIONAL,FOLLOW_USER_RATIONAL_in_adjustment423); 

                    }
                    break;
                case 2 :
                    // /Volumes/Personal HD/Workspace/CFDG-Semantics/src/cfdg.g:78:10: FLIP USER_RATIONAL
                    {
                    match(input,FLIP,FOLLOW_FLIP_in_adjustment434); 

                    match(input,USER_RATIONAL,FOLLOW_USER_RATIONAL_in_adjustment436); 

                    }
                    break;
                case 3 :
                    // /Volumes/Personal HD/Workspace/CFDG-Semantics/src/cfdg.g:79:10: XSHIFT USER_RATIONAL
                    {
                    match(input,XSHIFT,FOLLOW_XSHIFT_in_adjustment447); 

                    match(input,USER_RATIONAL,FOLLOW_USER_RATIONAL_in_adjustment449); 

                    }
                    break;
                case 4 :
                    // /Volumes/Personal HD/Workspace/CFDG-Semantics/src/cfdg.g:80:10: YSHIFT USER_RATIONAL
                    {
                    match(input,YSHIFT,FOLLOW_YSHIFT_in_adjustment460); 

                    match(input,USER_RATIONAL,FOLLOW_USER_RATIONAL_in_adjustment462); 

                    }
                    break;
                case 5 :
                    // /Volumes/Personal HD/Workspace/CFDG-Semantics/src/cfdg.g:81:10: ZSHIFT USER_RATIONAL
                    {
                    match(input,ZSHIFT,FOLLOW_ZSHIFT_in_adjustment473); 

                    match(input,USER_RATIONAL,FOLLOW_USER_RATIONAL_in_adjustment475); 

                    }
                    break;
                case 6 :
                    // /Volumes/Personal HD/Workspace/CFDG-Semantics/src/cfdg.g:82:10: SIZE USER_RATIONAL
                    {
                    match(input,SIZE,FOLLOW_SIZE_in_adjustment486); 

                    match(input,USER_RATIONAL,FOLLOW_USER_RATIONAL_in_adjustment488); 

                    }
                    break;
                case 7 :
                    // /Volumes/Personal HD/Workspace/CFDG-Semantics/src/cfdg.g:83:10: SIZE USER_RATIONAL USER_RATIONAL
                    {
                    match(input,SIZE,FOLLOW_SIZE_in_adjustment499); 

                    match(input,USER_RATIONAL,FOLLOW_USER_RATIONAL_in_adjustment501); 

                    match(input,USER_RATIONAL,FOLLOW_USER_RATIONAL_in_adjustment503); 

                    }
                    break;
                case 8 :
                    // /Volumes/Personal HD/Workspace/CFDG-Semantics/src/cfdg.g:84:10: SIZE USER_RATIONAL USER_RATIONAL USER_RATIONAL
                    {
                    match(input,SIZE,FOLLOW_SIZE_in_adjustment514); 

                    match(input,USER_RATIONAL,FOLLOW_USER_RATIONAL_in_adjustment516); 

                    match(input,USER_RATIONAL,FOLLOW_USER_RATIONAL_in_adjustment518); 

                    match(input,USER_RATIONAL,FOLLOW_USER_RATIONAL_in_adjustment520); 

                    }
                    break;
                case 9 :
                    // /Volumes/Personal HD/Workspace/CFDG-Semantics/src/cfdg.g:85:10: SKEW USER_RATIONAL USER_RATIONAL
                    {
                    match(input,SKEW,FOLLOW_SKEW_in_adjustment531); 

                    match(input,USER_RATIONAL,FOLLOW_USER_RATIONAL_in_adjustment533); 

                    match(input,USER_RATIONAL,FOLLOW_USER_RATIONAL_in_adjustment535); 

                    }
                    break;
                case 10 :
                    // /Volumes/Personal HD/Workspace/CFDG-Semantics/src/cfdg.g:86:10: color_adjustment
                    {
                    pushFollow(FOLLOW_color_adjustment_in_adjustment546);
                    color_adjustment();

                    state._fsp--;


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
        return ;
    }
    // $ANTLR end "adjustment"



    // $ANTLR start "color_adjustment"
    // /Volumes/Personal HD/Workspace/CFDG-Semantics/src/cfdg.g:89:1: color_adjustment : ( HUE USER_RATIONAL | SATURATION USER_RATIONAL | BRIGHTNESS USER_RATIONAL | ALPHA USER_RATIONAL | HUE USER_RATIONAL_TARGET | SATURATION USER_RATIONAL_TARGET | BRIGHTNESS USER_RATIONAL_TARGET | ALPHA USER_RATIONAL_TARGET | TARGETHUE USER_RATIONAL | TARGETSATURATION USER_RATIONAL | TARGETBRIGHTNESS USER_RATIONAL | TARGETALPHA USER_RATIONAL );
    public final void color_adjustment() throws RecognitionException {
        try {
            // /Volumes/Personal HD/Workspace/CFDG-Semantics/src/cfdg.g:90:5: ( HUE USER_RATIONAL | SATURATION USER_RATIONAL | BRIGHTNESS USER_RATIONAL | ALPHA USER_RATIONAL | HUE USER_RATIONAL_TARGET | SATURATION USER_RATIONAL_TARGET | BRIGHTNESS USER_RATIONAL_TARGET | ALPHA USER_RATIONAL_TARGET | TARGETHUE USER_RATIONAL | TARGETSATURATION USER_RATIONAL | TARGETBRIGHTNESS USER_RATIONAL | TARGETALPHA USER_RATIONAL )
            int alt15=12;
            switch ( input.LA(1) ) {
            case HUE:
                {
                int LA15_1 = input.LA(2);

                if ( (LA15_1==USER_RATIONAL) ) {
                    alt15=1;
                }
                else if ( (LA15_1==USER_RATIONAL_TARGET) ) {
                    alt15=5;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 15, 1, input);

                    throw nvae;

                }
                }
                break;
            case SATURATION:
                {
                int LA15_2 = input.LA(2);

                if ( (LA15_2==USER_RATIONAL) ) {
                    alt15=2;
                }
                else if ( (LA15_2==USER_RATIONAL_TARGET) ) {
                    alt15=6;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 15, 2, input);

                    throw nvae;

                }
                }
                break;
            case BRIGHTNESS:
                {
                int LA15_3 = input.LA(2);

                if ( (LA15_3==USER_RATIONAL) ) {
                    alt15=3;
                }
                else if ( (LA15_3==USER_RATIONAL_TARGET) ) {
                    alt15=7;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 15, 3, input);

                    throw nvae;

                }
                }
                break;
            case ALPHA:
                {
                int LA15_4 = input.LA(2);

                if ( (LA15_4==USER_RATIONAL) ) {
                    alt15=4;
                }
                else if ( (LA15_4==USER_RATIONAL_TARGET) ) {
                    alt15=8;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 15, 4, input);

                    throw nvae;

                }
                }
                break;
            case TARGETHUE:
                {
                alt15=9;
                }
                break;
            case TARGETSATURATION:
                {
                alt15=10;
                }
                break;
            case TARGETBRIGHTNESS:
                {
                alt15=11;
                }
                break;
            case TARGETALPHA:
                {
                alt15=12;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 15, 0, input);

                throw nvae;

            }

            switch (alt15) {
                case 1 :
                    // /Volumes/Personal HD/Workspace/CFDG-Semantics/src/cfdg.g:90:10: HUE USER_RATIONAL
                    {
                    match(input,HUE,FOLLOW_HUE_in_color_adjustment570); 

                    match(input,USER_RATIONAL,FOLLOW_USER_RATIONAL_in_color_adjustment572); 

                    }
                    break;
                case 2 :
                    // /Volumes/Personal HD/Workspace/CFDG-Semantics/src/cfdg.g:91:14: SATURATION USER_RATIONAL
                    {
                    match(input,SATURATION,FOLLOW_SATURATION_in_color_adjustment587); 

                    match(input,USER_RATIONAL,FOLLOW_USER_RATIONAL_in_color_adjustment589); 

                    }
                    break;
                case 3 :
                    // /Volumes/Personal HD/Workspace/CFDG-Semantics/src/cfdg.g:92:14: BRIGHTNESS USER_RATIONAL
                    {
                    match(input,BRIGHTNESS,FOLLOW_BRIGHTNESS_in_color_adjustment604); 

                    match(input,USER_RATIONAL,FOLLOW_USER_RATIONAL_in_color_adjustment606); 

                    }
                    break;
                case 4 :
                    // /Volumes/Personal HD/Workspace/CFDG-Semantics/src/cfdg.g:93:14: ALPHA USER_RATIONAL
                    {
                    match(input,ALPHA,FOLLOW_ALPHA_in_color_adjustment621); 

                    match(input,USER_RATIONAL,FOLLOW_USER_RATIONAL_in_color_adjustment623); 

                    }
                    break;
                case 5 :
                    // /Volumes/Personal HD/Workspace/CFDG-Semantics/src/cfdg.g:94:14: HUE USER_RATIONAL_TARGET
                    {
                    match(input,HUE,FOLLOW_HUE_in_color_adjustment638); 

                    match(input,USER_RATIONAL_TARGET,FOLLOW_USER_RATIONAL_TARGET_in_color_adjustment640); 

                    }
                    break;
                case 6 :
                    // /Volumes/Personal HD/Workspace/CFDG-Semantics/src/cfdg.g:95:14: SATURATION USER_RATIONAL_TARGET
                    {
                    match(input,SATURATION,FOLLOW_SATURATION_in_color_adjustment655); 

                    match(input,USER_RATIONAL_TARGET,FOLLOW_USER_RATIONAL_TARGET_in_color_adjustment657); 

                    }
                    break;
                case 7 :
                    // /Volumes/Personal HD/Workspace/CFDG-Semantics/src/cfdg.g:96:14: BRIGHTNESS USER_RATIONAL_TARGET
                    {
                    match(input,BRIGHTNESS,FOLLOW_BRIGHTNESS_in_color_adjustment673); 

                    match(input,USER_RATIONAL_TARGET,FOLLOW_USER_RATIONAL_TARGET_in_color_adjustment675); 

                    }
                    break;
                case 8 :
                    // /Volumes/Personal HD/Workspace/CFDG-Semantics/src/cfdg.g:97:14: ALPHA USER_RATIONAL_TARGET
                    {
                    match(input,ALPHA,FOLLOW_ALPHA_in_color_adjustment691); 

                    match(input,USER_RATIONAL_TARGET,FOLLOW_USER_RATIONAL_TARGET_in_color_adjustment693); 

                    }
                    break;
                case 9 :
                    // /Volumes/Personal HD/Workspace/CFDG-Semantics/src/cfdg.g:98:14: TARGETHUE USER_RATIONAL
                    {
                    match(input,TARGETHUE,FOLLOW_TARGETHUE_in_color_adjustment708); 

                    match(input,USER_RATIONAL,FOLLOW_USER_RATIONAL_in_color_adjustment710); 

                    }
                    break;
                case 10 :
                    // /Volumes/Personal HD/Workspace/CFDG-Semantics/src/cfdg.g:99:14: TARGETSATURATION USER_RATIONAL
                    {
                    match(input,TARGETSATURATION,FOLLOW_TARGETSATURATION_in_color_adjustment725); 

                    match(input,USER_RATIONAL,FOLLOW_USER_RATIONAL_in_color_adjustment727); 

                    }
                    break;
                case 11 :
                    // /Volumes/Personal HD/Workspace/CFDG-Semantics/src/cfdg.g:100:14: TARGETBRIGHTNESS USER_RATIONAL
                    {
                    match(input,TARGETBRIGHTNESS,FOLLOW_TARGETBRIGHTNESS_in_color_adjustment742); 

                    match(input,USER_RATIONAL,FOLLOW_USER_RATIONAL_in_color_adjustment744); 

                    }
                    break;
                case 12 :
                    // /Volumes/Personal HD/Workspace/CFDG-Semantics/src/cfdg.g:101:17: TARGETALPHA USER_RATIONAL
                    {
                    match(input,TARGETALPHA,FOLLOW_TARGETALPHA_in_color_adjustment762); 

                    match(input,USER_RATIONAL,FOLLOW_USER_RATIONAL_in_color_adjustment764); 

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
        return ;
    }
    // $ANTLR end "color_adjustment"

    // Delegated rules


 

    public static final BitSet FOLLOW_statement_in_document34 = new BitSet(new long[]{0x0000000000820022L});
    public static final BitSet FOLLOW_init_in_statement64 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_background_in_statement75 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule_in_statement86 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_STARTSHAPE_in_init110 = new BitSet(new long[]{0x0000000080000000L});
    public static final BitSet FOLLOW_USER_STRING_in_init112 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_BACKGROUND_in_background136 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_LEFTBRACKET_in_background138 = new BitSet(new long[]{0x000000000F048250L});
    public static final BitSet FOLLOW_buncha_color_adjustments_in_background140 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_RIGHTBRACKET_in_background143 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_SIZE_in_size171 = new BitSet(new long[]{0x0000000000001800L});
    public static final BitSet FOLLOW_modification_in_size173 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_in_rule199 = new BitSet(new long[]{0x0000000080000000L});
    public static final BitSet FOLLOW_USER_STRING_in_rule201 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_LEFTBRACKET_in_rule203 = new BitSet(new long[]{0x0000000080008000L});
    public static final BitSet FOLLOW_buncha_replacements_in_rule205 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_RIGHTBRACKET_in_rule208 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_in_rule219 = new BitSet(new long[]{0x0000000080000000L});
    public static final BitSet FOLLOW_USER_STRING_in_rule221 = new BitSet(new long[]{0x0000000020000000L});
    public static final BitSet FOLLOW_USER_RATIONAL_in_rule223 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_LEFTBRACKET_in_rule225 = new BitSet(new long[]{0x0000000080008000L});
    public static final BitSet FOLLOW_buncha_replacements_in_rule227 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_RIGHTBRACKET_in_rule230 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_replacement_in_buncha_replacements255 = new BitSet(new long[]{0x0000000080000002L});
    public static final BitSet FOLLOW_USER_STRING_in_replacement281 = new BitSet(new long[]{0x0000000000001800L});
    public static final BitSet FOLLOW_modification_in_replacement283 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_USER_STRING_in_replacement294 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_STAR_in_replacement296 = new BitSet(new long[]{0x0000000000001800L});
    public static final BitSet FOLLOW_modification_in_replacement298 = new BitSet(new long[]{0x0000000080000000L});
    public static final BitSet FOLLOW_USER_STRING_in_replacement300 = new BitSet(new long[]{0x0000000000001800L});
    public static final BitSet FOLLOW_modification_in_replacement302 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_LEFTBRACKET_in_modification326 = new BitSet(new long[]{0x0000000E0F1D8350L});
    public static final BitSet FOLLOW_buncha_adjustments_in_modification328 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_RIGHTBRACKET_in_modification331 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_LEFTBRACE_in_modification342 = new BitSet(new long[]{0x0000000E0F1D4350L});
    public static final BitSet FOLLOW_buncha_adjustments_in_modification344 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_RIGHTBRACE_in_modification347 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_adjustment_in_buncha_adjustments372 = new BitSet(new long[]{0x0000000E0F1D0352L});
    public static final BitSet FOLLOW_color_adjustment_in_buncha_color_adjustments395 = new BitSet(new long[]{0x000000000F040252L});
    public static final BitSet FOLLOW_ROTATE_in_adjustment421 = new BitSet(new long[]{0x0000000020000000L});
    public static final BitSet FOLLOW_USER_RATIONAL_in_adjustment423 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_FLIP_in_adjustment434 = new BitSet(new long[]{0x0000000020000000L});
    public static final BitSet FOLLOW_USER_RATIONAL_in_adjustment436 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_XSHIFT_in_adjustment447 = new BitSet(new long[]{0x0000000020000000L});
    public static final BitSet FOLLOW_USER_RATIONAL_in_adjustment449 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_YSHIFT_in_adjustment460 = new BitSet(new long[]{0x0000000020000000L});
    public static final BitSet FOLLOW_USER_RATIONAL_in_adjustment462 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ZSHIFT_in_adjustment473 = new BitSet(new long[]{0x0000000020000000L});
    public static final BitSet FOLLOW_USER_RATIONAL_in_adjustment475 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_SIZE_in_adjustment486 = new BitSet(new long[]{0x0000000020000000L});
    public static final BitSet FOLLOW_USER_RATIONAL_in_adjustment488 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_SIZE_in_adjustment499 = new BitSet(new long[]{0x0000000020000000L});
    public static final BitSet FOLLOW_USER_RATIONAL_in_adjustment501 = new BitSet(new long[]{0x0000000020000000L});
    public static final BitSet FOLLOW_USER_RATIONAL_in_adjustment503 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_SIZE_in_adjustment514 = new BitSet(new long[]{0x0000000020000000L});
    public static final BitSet FOLLOW_USER_RATIONAL_in_adjustment516 = new BitSet(new long[]{0x0000000020000000L});
    public static final BitSet FOLLOW_USER_RATIONAL_in_adjustment518 = new BitSet(new long[]{0x0000000020000000L});
    public static final BitSet FOLLOW_USER_RATIONAL_in_adjustment520 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_SKEW_in_adjustment531 = new BitSet(new long[]{0x0000000020000000L});
    public static final BitSet FOLLOW_USER_RATIONAL_in_adjustment533 = new BitSet(new long[]{0x0000000020000000L});
    public static final BitSet FOLLOW_USER_RATIONAL_in_adjustment535 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_color_adjustment_in_adjustment546 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_HUE_in_color_adjustment570 = new BitSet(new long[]{0x0000000020000000L});
    public static final BitSet FOLLOW_USER_RATIONAL_in_color_adjustment572 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_SATURATION_in_color_adjustment587 = new BitSet(new long[]{0x0000000020000000L});
    public static final BitSet FOLLOW_USER_RATIONAL_in_color_adjustment589 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_BRIGHTNESS_in_color_adjustment604 = new BitSet(new long[]{0x0000000020000000L});
    public static final BitSet FOLLOW_USER_RATIONAL_in_color_adjustment606 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ALPHA_in_color_adjustment621 = new BitSet(new long[]{0x0000000020000000L});
    public static final BitSet FOLLOW_USER_RATIONAL_in_color_adjustment623 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_HUE_in_color_adjustment638 = new BitSet(new long[]{0x0000000040000000L});
    public static final BitSet FOLLOW_USER_RATIONAL_TARGET_in_color_adjustment640 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_SATURATION_in_color_adjustment655 = new BitSet(new long[]{0x0000000040000000L});
    public static final BitSet FOLLOW_USER_RATIONAL_TARGET_in_color_adjustment657 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_BRIGHTNESS_in_color_adjustment673 = new BitSet(new long[]{0x0000000040000000L});
    public static final BitSet FOLLOW_USER_RATIONAL_TARGET_in_color_adjustment675 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ALPHA_in_color_adjustment691 = new BitSet(new long[]{0x0000000040000000L});
    public static final BitSet FOLLOW_USER_RATIONAL_TARGET_in_color_adjustment693 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_TARGETHUE_in_color_adjustment708 = new BitSet(new long[]{0x0000000020000000L});
    public static final BitSet FOLLOW_USER_RATIONAL_in_color_adjustment710 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_TARGETSATURATION_in_color_adjustment725 = new BitSet(new long[]{0x0000000020000000L});
    public static final BitSet FOLLOW_USER_RATIONAL_in_color_adjustment727 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_TARGETBRIGHTNESS_in_color_adjustment742 = new BitSet(new long[]{0x0000000020000000L});
    public static final BitSet FOLLOW_USER_RATIONAL_in_color_adjustment744 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_TARGETALPHA_in_color_adjustment762 = new BitSet(new long[]{0x0000000020000000L});
    public static final BitSet FOLLOW_USER_RATIONAL_in_color_adjustment764 = new BitSet(new long[]{0x0000000000000002L});

}