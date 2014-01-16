// $ANTLR 3.4 /Volumes/Personal HD/Workspace/CFDG-Semantics/src/cfdg.g 2012-06-22 03:43:52

import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked"})
public class cfdgLexer extends Lexer {
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
    // delegators
    public Lexer[] getDelegates() {
        return new Lexer[] {};
    }

    public cfdgLexer() {} 
    public cfdgLexer(CharStream input) {
        this(input, new RecognizerSharedState());
    }
    public cfdgLexer(CharStream input, RecognizerSharedState state) {
        super(input,state);
    }
    public String getGrammarFileName() { return "/Volumes/Personal HD/Workspace/CFDG-Semantics/src/cfdg.g"; }

    // $ANTLR start "STARTSHAPE"
    public final void mSTARTSHAPE() throws RecognitionException {
        try {
            int _type = STARTSHAPE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Volumes/Personal HD/Workspace/CFDG-Semantics/src/cfdg.g:105:5: ( 'startshape' )
            // /Volumes/Personal HD/Workspace/CFDG-Semantics/src/cfdg.g:105:10: 'startshape'
            {
            match("startshape"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "STARTSHAPE"

    // $ANTLR start "BACKGROUND"
    public final void mBACKGROUND() throws RecognitionException {
        try {
            int _type = BACKGROUND;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Volumes/Personal HD/Workspace/CFDG-Semantics/src/cfdg.g:107:5: ( 'background' )
            // /Volumes/Personal HD/Workspace/CFDG-Semantics/src/cfdg.g:107:11: 'background'
            {
            match("background"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "BACKGROUND"

    // $ANTLR start "RULE"
    public final void mRULE() throws RecognitionException {
        try {
            int _type = RULE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Volumes/Personal HD/Workspace/CFDG-Semantics/src/cfdg.g:109:9: ( 'rule' )
            // /Volumes/Personal HD/Workspace/CFDG-Semantics/src/cfdg.g:109:14: 'rule'
            {
            match("rule"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "RULE"

    // $ANTLR start "LEFTBRACKET"
    public final void mLEFTBRACKET() throws RecognitionException {
        try {
            int _type = LEFTBRACKET;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Volumes/Personal HD/Workspace/CFDG-Semantics/src/cfdg.g:112:5: ( '{' )
            // /Volumes/Personal HD/Workspace/CFDG-Semantics/src/cfdg.g:112:10: '{'
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
    // $ANTLR end "LEFTBRACKET"

    // $ANTLR start "RIGHTBRACKET"
    public final void mRIGHTBRACKET() throws RecognitionException {
        try {
            int _type = RIGHTBRACKET;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Volumes/Personal HD/Workspace/CFDG-Semantics/src/cfdg.g:115:5: ( '}' )
            // /Volumes/Personal HD/Workspace/CFDG-Semantics/src/cfdg.g:115:10: '}'
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
    // $ANTLR end "RIGHTBRACKET"

    // $ANTLR start "LEFTBRACE"
    public final void mLEFTBRACE() throws RecognitionException {
        try {
            int _type = LEFTBRACE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Volumes/Personal HD/Workspace/CFDG-Semantics/src/cfdg.g:117:5: ( '[' )
            // /Volumes/Personal HD/Workspace/CFDG-Semantics/src/cfdg.g:117:10: '['
            {
            match('['); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "LEFTBRACE"

    // $ANTLR start "RIGHTBRACE"
    public final void mRIGHTBRACE() throws RecognitionException {
        try {
            int _type = RIGHTBRACE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Volumes/Personal HD/Workspace/CFDG-Semantics/src/cfdg.g:119:5: ( ']' )
            // /Volumes/Personal HD/Workspace/CFDG-Semantics/src/cfdg.g:119:10: ']'
            {
            match(']'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "RIGHTBRACE"

    // $ANTLR start "STAR"
    public final void mSTAR() throws RecognitionException {
        try {
            int _type = STAR;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Volumes/Personal HD/Workspace/CFDG-Semantics/src/cfdg.g:120:9: ( '*' )
            // /Volumes/Personal HD/Workspace/CFDG-Semantics/src/cfdg.g:120:14: '*'
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
    // $ANTLR end "STAR"

    // $ANTLR start "CIRCLE_P"
    public final void mCIRCLE_P() throws RecognitionException {
        try {
            int _type = CIRCLE_P;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Volumes/Personal HD/Workspace/CFDG-Semantics/src/cfdg.g:121:9: ( 'CIRCLE' )
            // /Volumes/Personal HD/Workspace/CFDG-Semantics/src/cfdg.g:121:14: 'CIRCLE'
            {
            match("CIRCLE"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "CIRCLE_P"

    // $ANTLR start "SQUARE_P"
    public final void mSQUARE_P() throws RecognitionException {
        try {
            int _type = SQUARE_P;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Volumes/Personal HD/Workspace/CFDG-Semantics/src/cfdg.g:122:9: ( 'SQUARE' )
            // /Volumes/Personal HD/Workspace/CFDG-Semantics/src/cfdg.g:122:14: 'SQUARE'
            {
            match("SQUARE"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "SQUARE_P"

    // $ANTLR start "TRIANGLE_P"
    public final void mTRIANGLE_P() throws RecognitionException {
        try {
            int _type = TRIANGLE_P;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Volumes/Personal HD/Workspace/CFDG-Semantics/src/cfdg.g:124:5: ( 'TRIANGLE' )
            // /Volumes/Personal HD/Workspace/CFDG-Semantics/src/cfdg.g:124:10: 'TRIANGLE'
            {
            match("TRIANGLE"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "TRIANGLE_P"

    // $ANTLR start "XSHIFT"
    public final void mXSHIFT() throws RecognitionException {
        try {
            int _type = XSHIFT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Volumes/Personal HD/Workspace/CFDG-Semantics/src/cfdg.g:125:11: ( 'x' )
            // /Volumes/Personal HD/Workspace/CFDG-Semantics/src/cfdg.g:125:16: 'x'
            {
            match('x'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "XSHIFT"

    // $ANTLR start "YSHIFT"
    public final void mYSHIFT() throws RecognitionException {
        try {
            int _type = YSHIFT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Volumes/Personal HD/Workspace/CFDG-Semantics/src/cfdg.g:126:11: ( 'y' )
            // /Volumes/Personal HD/Workspace/CFDG-Semantics/src/cfdg.g:126:16: 'y'
            {
            match('y'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "YSHIFT"

    // $ANTLR start "ZSHIFT"
    public final void mZSHIFT() throws RecognitionException {
        try {
            int _type = ZSHIFT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Volumes/Personal HD/Workspace/CFDG-Semantics/src/cfdg.g:127:11: ( 'z' )
            // /Volumes/Personal HD/Workspace/CFDG-Semantics/src/cfdg.g:127:16: 'z'
            {
            match('z'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "ZSHIFT"

    // $ANTLR start "SIZE"
    public final void mSIZE() throws RecognitionException {
        try {
            int _type = SIZE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Volumes/Personal HD/Workspace/CFDG-Semantics/src/cfdg.g:129:5: ( 's' | 'size' )
            int alt1=2;
            int LA1_0 = input.LA(1);

            if ( (LA1_0=='s') ) {
                int LA1_1 = input.LA(2);

                if ( (LA1_1=='i') ) {
                    alt1=2;
                }
                else {
                    alt1=1;
                }
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 1, 0, input);

                throw nvae;

            }
            switch (alt1) {
                case 1 :
                    // /Volumes/Personal HD/Workspace/CFDG-Semantics/src/cfdg.g:129:10: 's'
                    {
                    match('s'); 

                    }
                    break;
                case 2 :
                    // /Volumes/Personal HD/Workspace/CFDG-Semantics/src/cfdg.g:129:16: 'size'
                    {
                    match("size"); 



                    }
                    break;

            }
            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "SIZE"

    // $ANTLR start "ROTATE"
    public final void mROTATE() throws RecognitionException {
        try {
            int _type = ROTATE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Volumes/Personal HD/Workspace/CFDG-Semantics/src/cfdg.g:131:5: ( 'r' | 'rotate' )
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( (LA2_0=='r') ) {
                int LA2_1 = input.LA(2);

                if ( (LA2_1=='o') ) {
                    alt2=2;
                }
                else {
                    alt2=1;
                }
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 2, 0, input);

                throw nvae;

            }
            switch (alt2) {
                case 1 :
                    // /Volumes/Personal HD/Workspace/CFDG-Semantics/src/cfdg.g:131:10: 'r'
                    {
                    match('r'); 

                    }
                    break;
                case 2 :
                    // /Volumes/Personal HD/Workspace/CFDG-Semantics/src/cfdg.g:131:16: 'rotate'
                    {
                    match("rotate"); 



                    }
                    break;

            }
            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "ROTATE"

    // $ANTLR start "BRIGHTNESS"
    public final void mBRIGHTNESS() throws RecognitionException {
        try {
            int _type = BRIGHTNESS;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Volumes/Personal HD/Workspace/CFDG-Semantics/src/cfdg.g:133:5: ( 'b' | 'brightness' )
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0=='b') ) {
                int LA3_1 = input.LA(2);

                if ( (LA3_1=='r') ) {
                    alt3=2;
                }
                else {
                    alt3=1;
                }
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 3, 0, input);

                throw nvae;

            }
            switch (alt3) {
                case 1 :
                    // /Volumes/Personal HD/Workspace/CFDG-Semantics/src/cfdg.g:133:10: 'b'
                    {
                    match('b'); 

                    }
                    break;
                case 2 :
                    // /Volumes/Personal HD/Workspace/CFDG-Semantics/src/cfdg.g:133:16: 'brightness'
                    {
                    match("brightness"); 



                    }
                    break;

            }
            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "BRIGHTNESS"

    // $ANTLR start "HUE"
    public final void mHUE() throws RecognitionException {
        try {
            int _type = HUE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Volumes/Personal HD/Workspace/CFDG-Semantics/src/cfdg.g:135:5: ( 'h' | 'hue' )
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0=='h') ) {
                int LA4_1 = input.LA(2);

                if ( (LA4_1=='u') ) {
                    alt4=2;
                }
                else {
                    alt4=1;
                }
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 4, 0, input);

                throw nvae;

            }
            switch (alt4) {
                case 1 :
                    // /Volumes/Personal HD/Workspace/CFDG-Semantics/src/cfdg.g:135:10: 'h'
                    {
                    match('h'); 

                    }
                    break;
                case 2 :
                    // /Volumes/Personal HD/Workspace/CFDG-Semantics/src/cfdg.g:135:16: 'hue'
                    {
                    match("hue"); 



                    }
                    break;

            }
            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "HUE"

    // $ANTLR start "SATURATION"
    public final void mSATURATION() throws RecognitionException {
        try {
            int _type = SATURATION;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Volumes/Personal HD/Workspace/CFDG-Semantics/src/cfdg.g:137:5: ( 'sat' )
            // /Volumes/Personal HD/Workspace/CFDG-Semantics/src/cfdg.g:137:10: 'sat'
            {
            match("sat"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "SATURATION"

    // $ANTLR start "FLIP"
    public final void mFLIP() throws RecognitionException {
        try {
            int _type = FLIP;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Volumes/Personal HD/Workspace/CFDG-Semantics/src/cfdg.g:139:5: ( 'flip' )
            // /Volumes/Personal HD/Workspace/CFDG-Semantics/src/cfdg.g:139:10: 'flip'
            {
            match("flip"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "FLIP"

    // $ANTLR start "SKEW"
    public final void mSKEW() throws RecognitionException {
        try {
            int _type = SKEW;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Volumes/Personal HD/Workspace/CFDG-Semantics/src/cfdg.g:141:5: ( 'skew' )
            // /Volumes/Personal HD/Workspace/CFDG-Semantics/src/cfdg.g:141:10: 'skew'
            {
            match("skew"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "SKEW"

    // $ANTLR start "ALPHA"
    public final void mALPHA() throws RecognitionException {
        try {
            int _type = ALPHA;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Volumes/Personal HD/Workspace/CFDG-Semantics/src/cfdg.g:143:5: ( 'a' | 'alpha' )
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0=='a') ) {
                int LA5_1 = input.LA(2);

                if ( (LA5_1=='l') ) {
                    alt5=2;
                }
                else {
                    alt5=1;
                }
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 5, 0, input);

                throw nvae;

            }
            switch (alt5) {
                case 1 :
                    // /Volumes/Personal HD/Workspace/CFDG-Semantics/src/cfdg.g:143:10: 'a'
                    {
                    match('a'); 

                    }
                    break;
                case 2 :
                    // /Volumes/Personal HD/Workspace/CFDG-Semantics/src/cfdg.g:143:16: 'alpha'
                    {
                    match("alpha"); 



                    }
                    break;

            }
            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "ALPHA"

    // $ANTLR start "TARGETHUE"
    public final void mTARGETHUE() throws RecognitionException {
        try {
            int _type = TARGETHUE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Volumes/Personal HD/Workspace/CFDG-Semantics/src/cfdg.g:145:5: ( '|hue' | '|h' )
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0=='|') ) {
                int LA6_1 = input.LA(2);

                if ( (LA6_1=='h') ) {
                    int LA6_2 = input.LA(3);

                    if ( (LA6_2=='u') ) {
                        alt6=1;
                    }
                    else {
                        alt6=2;
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
                    // /Volumes/Personal HD/Workspace/CFDG-Semantics/src/cfdg.g:145:10: '|hue'
                    {
                    match("|hue"); 



                    }
                    break;
                case 2 :
                    // /Volumes/Personal HD/Workspace/CFDG-Semantics/src/cfdg.g:145:19: '|h'
                    {
                    match("|h"); 



                    }
                    break;

            }
            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "TARGETHUE"

    // $ANTLR start "TARGETSATURATION"
    public final void mTARGETSATURATION() throws RecognitionException {
        try {
            int _type = TARGETSATURATION;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Volumes/Personal HD/Workspace/CFDG-Semantics/src/cfdg.g:147:5: ( '|sat' | '|s' )
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0=='|') ) {
                int LA7_1 = input.LA(2);

                if ( (LA7_1=='s') ) {
                    int LA7_2 = input.LA(3);

                    if ( (LA7_2=='a') ) {
                        alt7=1;
                    }
                    else {
                        alt7=2;
                    }
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 7, 1, input);

                    throw nvae;

                }
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 7, 0, input);

                throw nvae;

            }
            switch (alt7) {
                case 1 :
                    // /Volumes/Personal HD/Workspace/CFDG-Semantics/src/cfdg.g:147:10: '|sat'
                    {
                    match("|sat"); 



                    }
                    break;
                case 2 :
                    // /Volumes/Personal HD/Workspace/CFDG-Semantics/src/cfdg.g:147:19: '|s'
                    {
                    match("|s"); 



                    }
                    break;

            }
            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "TARGETSATURATION"

    // $ANTLR start "TARGETBRIGHTNESS"
    public final void mTARGETBRIGHTNESS() throws RecognitionException {
        try {
            int _type = TARGETBRIGHTNESS;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Volumes/Personal HD/Workspace/CFDG-Semantics/src/cfdg.g:149:5: ( '|brightness' | '|b' )
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0=='|') ) {
                int LA8_1 = input.LA(2);

                if ( (LA8_1=='b') ) {
                    int LA8_2 = input.LA(3);

                    if ( (LA8_2=='r') ) {
                        alt8=1;
                    }
                    else {
                        alt8=2;
                    }
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
                    // /Volumes/Personal HD/Workspace/CFDG-Semantics/src/cfdg.g:149:10: '|brightness'
                    {
                    match("|brightness"); 



                    }
                    break;
                case 2 :
                    // /Volumes/Personal HD/Workspace/CFDG-Semantics/src/cfdg.g:149:26: '|b'
                    {
                    match("|b"); 



                    }
                    break;

            }
            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "TARGETBRIGHTNESS"

    // $ANTLR start "TARGETALPHA"
    public final void mTARGETALPHA() throws RecognitionException {
        try {
            int _type = TARGETALPHA;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Volumes/Personal HD/Workspace/CFDG-Semantics/src/cfdg.g:151:5: ( '|alpha' | '|a' )
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( (LA9_0=='|') ) {
                int LA9_1 = input.LA(2);

                if ( (LA9_1=='a') ) {
                    int LA9_2 = input.LA(3);

                    if ( (LA9_2=='l') ) {
                        alt9=1;
                    }
                    else {
                        alt9=2;
                    }
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 9, 1, input);

                    throw nvae;

                }
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 9, 0, input);

                throw nvae;

            }
            switch (alt9) {
                case 1 :
                    // /Volumes/Personal HD/Workspace/CFDG-Semantics/src/cfdg.g:151:10: '|alpha'
                    {
                    match("|alpha"); 



                    }
                    break;
                case 2 :
                    // /Volumes/Personal HD/Workspace/CFDG-Semantics/src/cfdg.g:151:21: '|a'
                    {
                    match("|a"); 



                    }
                    break;

            }
            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "TARGETALPHA"

    // $ANTLR start "INTEGER"
    public final void mINTEGER() throws RecognitionException {
        try {
            int _type = INTEGER;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Volumes/Personal HD/Workspace/CFDG-Semantics/src/cfdg.g:153:12: ( ( '0' .. '9' )+ )
            // /Volumes/Personal HD/Workspace/CFDG-Semantics/src/cfdg.g:153:17: ( '0' .. '9' )+
            {
            // /Volumes/Personal HD/Workspace/CFDG-Semantics/src/cfdg.g:153:17: ( '0' .. '9' )+
            int cnt10=0;
            loop10:
            do {
                int alt10=2;
                int LA10_0 = input.LA(1);

                if ( ((LA10_0 >= '0' && LA10_0 <= '9')) ) {
                    alt10=1;
                }


                switch (alt10) {
            	case 1 :
            	    // /Volumes/Personal HD/Workspace/CFDG-Semantics/src/cfdg.g:
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
            	    if ( cnt10 >= 1 ) break loop10;
                        EarlyExitException eee =
                            new EarlyExitException(10, input);
                        throw eee;
                }
                cnt10++;
            } while (true);


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "INTEGER"

    // $ANTLR start "RATIONAL"
    public final void mRATIONAL() throws RecognitionException {
        try {
            int _type = RATIONAL;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Volumes/Personal HD/Workspace/CFDG-Semantics/src/cfdg.g:154:9: ( ( '0' .. '9' )+ '.' ( '0' .. '9' )* | '.' ( '0' .. '9' )+ )
            int alt14=2;
            int LA14_0 = input.LA(1);

            if ( ((LA14_0 >= '0' && LA14_0 <= '9')) ) {
                alt14=1;
            }
            else if ( (LA14_0=='.') ) {
                alt14=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 14, 0, input);

                throw nvae;

            }
            switch (alt14) {
                case 1 :
                    // /Volumes/Personal HD/Workspace/CFDG-Semantics/src/cfdg.g:154:14: ( '0' .. '9' )+ '.' ( '0' .. '9' )*
                    {
                    // /Volumes/Personal HD/Workspace/CFDG-Semantics/src/cfdg.g:154:14: ( '0' .. '9' )+
                    int cnt11=0;
                    loop11:
                    do {
                        int alt11=2;
                        int LA11_0 = input.LA(1);

                        if ( ((LA11_0 >= '0' && LA11_0 <= '9')) ) {
                            alt11=1;
                        }


                        switch (alt11) {
                    	case 1 :
                    	    // /Volumes/Personal HD/Workspace/CFDG-Semantics/src/cfdg.g:
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
                    	    if ( cnt11 >= 1 ) break loop11;
                                EarlyExitException eee =
                                    new EarlyExitException(11, input);
                                throw eee;
                        }
                        cnt11++;
                    } while (true);


                    match('.'); 

                    // /Volumes/Personal HD/Workspace/CFDG-Semantics/src/cfdg.g:154:26: ( '0' .. '9' )*
                    loop12:
                    do {
                        int alt12=2;
                        int LA12_0 = input.LA(1);

                        if ( ((LA12_0 >= '0' && LA12_0 <= '9')) ) {
                            alt12=1;
                        }


                        switch (alt12) {
                    	case 1 :
                    	    // /Volumes/Personal HD/Workspace/CFDG-Semantics/src/cfdg.g:
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
                    	    break loop12;
                        }
                    } while (true);


                    }
                    break;
                case 2 :
                    // /Volumes/Personal HD/Workspace/CFDG-Semantics/src/cfdg.g:154:38: '.' ( '0' .. '9' )+
                    {
                    match('.'); 

                    // /Volumes/Personal HD/Workspace/CFDG-Semantics/src/cfdg.g:154:41: ( '0' .. '9' )+
                    int cnt13=0;
                    loop13:
                    do {
                        int alt13=2;
                        int LA13_0 = input.LA(1);

                        if ( ((LA13_0 >= '0' && LA13_0 <= '9')) ) {
                            alt13=1;
                        }


                        switch (alt13) {
                    	case 1 :
                    	    // /Volumes/Personal HD/Workspace/CFDG-Semantics/src/cfdg.g:
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
                    	    if ( cnt13 >= 1 ) break loop13;
                                EarlyExitException eee =
                                    new EarlyExitException(13, input);
                                throw eee;
                        }
                        cnt13++;
                    } while (true);


                    }
                    break;

            }
            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "RATIONAL"

    // $ANTLR start "USER_STRING"
    public final void mUSER_STRING() throws RecognitionException {
        try {
            int _type = USER_STRING;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Volumes/Personal HD/Workspace/CFDG-Semantics/src/cfdg.g:156:5: ( ( 'a' .. 'z' | 'A' .. 'Z' )+ )
            // /Volumes/Personal HD/Workspace/CFDG-Semantics/src/cfdg.g:156:10: ( 'a' .. 'z' | 'A' .. 'Z' )+
            {
            // /Volumes/Personal HD/Workspace/CFDG-Semantics/src/cfdg.g:156:10: ( 'a' .. 'z' | 'A' .. 'Z' )+
            int cnt15=0;
            loop15:
            do {
                int alt15=2;
                int LA15_0 = input.LA(1);

                if ( ((LA15_0 >= 'A' && LA15_0 <= 'Z')||(LA15_0 >= 'a' && LA15_0 <= 'z')) ) {
                    alt15=1;
                }


                switch (alt15) {
            	case 1 :
            	    // /Volumes/Personal HD/Workspace/CFDG-Semantics/src/cfdg.g:
            	    {
            	    if ( (input.LA(1) >= 'A' && input.LA(1) <= 'Z')||(input.LA(1) >= 'a' && input.LA(1) <= 'z') ) {
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
            	    if ( cnt15 >= 1 ) break loop15;
                        EarlyExitException eee =
                            new EarlyExitException(15, input);
                        throw eee;
                }
                cnt15++;
            } while (true);


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "USER_STRING"

    // $ANTLR start "WHITESPACE"
    public final void mWHITESPACE() throws RecognitionException {
        try {
            int _type = WHITESPACE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Volumes/Personal HD/Workspace/CFDG-Semantics/src/cfdg.g:158:5: ( ( ' ' | '\\n' | '\\t' | '\\r' | '\\f' )+ )
            // /Volumes/Personal HD/Workspace/CFDG-Semantics/src/cfdg.g:158:10: ( ' ' | '\\n' | '\\t' | '\\r' | '\\f' )+
            {
            // /Volumes/Personal HD/Workspace/CFDG-Semantics/src/cfdg.g:158:10: ( ' ' | '\\n' | '\\t' | '\\r' | '\\f' )+
            int cnt16=0;
            loop16:
            do {
                int alt16=2;
                int LA16_0 = input.LA(1);

                if ( ((LA16_0 >= '\t' && LA16_0 <= '\n')||(LA16_0 >= '\f' && LA16_0 <= '\r')||LA16_0==' ') ) {
                    alt16=1;
                }


                switch (alt16) {
            	case 1 :
            	    // /Volumes/Personal HD/Workspace/CFDG-Semantics/src/cfdg.g:
            	    {
            	    if ( (input.LA(1) >= '\t' && input.LA(1) <= '\n')||(input.LA(1) >= '\f' && input.LA(1) <= '\r')||input.LA(1)==' ' ) {
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
            	    if ( cnt16 >= 1 ) break loop16;
                        EarlyExitException eee =
                            new EarlyExitException(16, input);
                        throw eee;
                }
                cnt16++;
            } while (true);


            _channel = HIDDEN;

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "WHITESPACE"

    // $ANTLR start "USER_RATIONAL"
    public final void mUSER_RATIONAL() throws RecognitionException {
        try {
            int _type = USER_RATIONAL;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Volumes/Personal HD/Workspace/CFDG-Semantics/src/cfdg.g:160:5: ( RATIONAL | INTEGER | '-' INTEGER | '-' RATIONAL )
            int alt17=4;
            alt17 = dfa17.predict(input);
            switch (alt17) {
                case 1 :
                    // /Volumes/Personal HD/Workspace/CFDG-Semantics/src/cfdg.g:160:10: RATIONAL
                    {
                    mRATIONAL(); 


                    }
                    break;
                case 2 :
                    // /Volumes/Personal HD/Workspace/CFDG-Semantics/src/cfdg.g:161:11: INTEGER
                    {
                    mINTEGER(); 


                    }
                    break;
                case 3 :
                    // /Volumes/Personal HD/Workspace/CFDG-Semantics/src/cfdg.g:162:10: '-' INTEGER
                    {
                    match('-'); 

                    mINTEGER(); 


                    }
                    break;
                case 4 :
                    // /Volumes/Personal HD/Workspace/CFDG-Semantics/src/cfdg.g:163:10: '-' RATIONAL
                    {
                    match('-'); 

                    mRATIONAL(); 


                    }
                    break;

            }
            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "USER_RATIONAL"

    // $ANTLR start "USER_RATIONAL_TARGET"
    public final void mUSER_RATIONAL_TARGET() throws RecognitionException {
        try {
            int _type = USER_RATIONAL_TARGET;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Volumes/Personal HD/Workspace/CFDG-Semantics/src/cfdg.g:166:5: ( RATIONAL '|' | INTEGER '|' | '-' INTEGER '|' | '-' RATIONAL '|' )
            int alt18=4;
            alt18 = dfa18.predict(input);
            switch (alt18) {
                case 1 :
                    // /Volumes/Personal HD/Workspace/CFDG-Semantics/src/cfdg.g:166:10: RATIONAL '|'
                    {
                    mRATIONAL(); 


                    match('|'); 

                    }
                    break;
                case 2 :
                    // /Volumes/Personal HD/Workspace/CFDG-Semantics/src/cfdg.g:167:10: INTEGER '|'
                    {
                    mINTEGER(); 


                    match('|'); 

                    }
                    break;
                case 3 :
                    // /Volumes/Personal HD/Workspace/CFDG-Semantics/src/cfdg.g:168:10: '-' INTEGER '|'
                    {
                    match('-'); 

                    mINTEGER(); 


                    match('|'); 

                    }
                    break;
                case 4 :
                    // /Volumes/Personal HD/Workspace/CFDG-Semantics/src/cfdg.g:169:10: '-' RATIONAL '|'
                    {
                    match('-'); 

                    mRATIONAL(); 


                    match('|'); 

                    }
                    break;

            }
            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "USER_RATIONAL_TARGET"

    public void mTokens() throws RecognitionException {
        // /Volumes/Personal HD/Workspace/CFDG-Semantics/src/cfdg.g:1:8: ( STARTSHAPE | BACKGROUND | RULE | LEFTBRACKET | RIGHTBRACKET | LEFTBRACE | RIGHTBRACE | STAR | CIRCLE_P | SQUARE_P | TRIANGLE_P | XSHIFT | YSHIFT | ZSHIFT | SIZE | ROTATE | BRIGHTNESS | HUE | SATURATION | FLIP | SKEW | ALPHA | TARGETHUE | TARGETSATURATION | TARGETBRIGHTNESS | TARGETALPHA | INTEGER | RATIONAL | USER_STRING | WHITESPACE | USER_RATIONAL | USER_RATIONAL_TARGET )
        int alt19=32;
        alt19 = dfa19.predict(input);
        switch (alt19) {
            case 1 :
                // /Volumes/Personal HD/Workspace/CFDG-Semantics/src/cfdg.g:1:10: STARTSHAPE
                {
                mSTARTSHAPE(); 


                }
                break;
            case 2 :
                // /Volumes/Personal HD/Workspace/CFDG-Semantics/src/cfdg.g:1:21: BACKGROUND
                {
                mBACKGROUND(); 


                }
                break;
            case 3 :
                // /Volumes/Personal HD/Workspace/CFDG-Semantics/src/cfdg.g:1:32: RULE
                {
                mRULE(); 


                }
                break;
            case 4 :
                // /Volumes/Personal HD/Workspace/CFDG-Semantics/src/cfdg.g:1:37: LEFTBRACKET
                {
                mLEFTBRACKET(); 


                }
                break;
            case 5 :
                // /Volumes/Personal HD/Workspace/CFDG-Semantics/src/cfdg.g:1:49: RIGHTBRACKET
                {
                mRIGHTBRACKET(); 


                }
                break;
            case 6 :
                // /Volumes/Personal HD/Workspace/CFDG-Semantics/src/cfdg.g:1:62: LEFTBRACE
                {
                mLEFTBRACE(); 


                }
                break;
            case 7 :
                // /Volumes/Personal HD/Workspace/CFDG-Semantics/src/cfdg.g:1:72: RIGHTBRACE
                {
                mRIGHTBRACE(); 


                }
                break;
            case 8 :
                // /Volumes/Personal HD/Workspace/CFDG-Semantics/src/cfdg.g:1:83: STAR
                {
                mSTAR(); 


                }
                break;
            case 9 :
                // /Volumes/Personal HD/Workspace/CFDG-Semantics/src/cfdg.g:1:88: CIRCLE_P
                {
                mCIRCLE_P(); 


                }
                break;
            case 10 :
                // /Volumes/Personal HD/Workspace/CFDG-Semantics/src/cfdg.g:1:97: SQUARE_P
                {
                mSQUARE_P(); 


                }
                break;
            case 11 :
                // /Volumes/Personal HD/Workspace/CFDG-Semantics/src/cfdg.g:1:106: TRIANGLE_P
                {
                mTRIANGLE_P(); 


                }
                break;
            case 12 :
                // /Volumes/Personal HD/Workspace/CFDG-Semantics/src/cfdg.g:1:117: XSHIFT
                {
                mXSHIFT(); 


                }
                break;
            case 13 :
                // /Volumes/Personal HD/Workspace/CFDG-Semantics/src/cfdg.g:1:124: YSHIFT
                {
                mYSHIFT(); 


                }
                break;
            case 14 :
                // /Volumes/Personal HD/Workspace/CFDG-Semantics/src/cfdg.g:1:131: ZSHIFT
                {
                mZSHIFT(); 


                }
                break;
            case 15 :
                // /Volumes/Personal HD/Workspace/CFDG-Semantics/src/cfdg.g:1:138: SIZE
                {
                mSIZE(); 


                }
                break;
            case 16 :
                // /Volumes/Personal HD/Workspace/CFDG-Semantics/src/cfdg.g:1:143: ROTATE
                {
                mROTATE(); 


                }
                break;
            case 17 :
                // /Volumes/Personal HD/Workspace/CFDG-Semantics/src/cfdg.g:1:150: BRIGHTNESS
                {
                mBRIGHTNESS(); 


                }
                break;
            case 18 :
                // /Volumes/Personal HD/Workspace/CFDG-Semantics/src/cfdg.g:1:161: HUE
                {
                mHUE(); 


                }
                break;
            case 19 :
                // /Volumes/Personal HD/Workspace/CFDG-Semantics/src/cfdg.g:1:165: SATURATION
                {
                mSATURATION(); 


                }
                break;
            case 20 :
                // /Volumes/Personal HD/Workspace/CFDG-Semantics/src/cfdg.g:1:176: FLIP
                {
                mFLIP(); 


                }
                break;
            case 21 :
                // /Volumes/Personal HD/Workspace/CFDG-Semantics/src/cfdg.g:1:181: SKEW
                {
                mSKEW(); 


                }
                break;
            case 22 :
                // /Volumes/Personal HD/Workspace/CFDG-Semantics/src/cfdg.g:1:186: ALPHA
                {
                mALPHA(); 


                }
                break;
            case 23 :
                // /Volumes/Personal HD/Workspace/CFDG-Semantics/src/cfdg.g:1:192: TARGETHUE
                {
                mTARGETHUE(); 


                }
                break;
            case 24 :
                // /Volumes/Personal HD/Workspace/CFDG-Semantics/src/cfdg.g:1:202: TARGETSATURATION
                {
                mTARGETSATURATION(); 


                }
                break;
            case 25 :
                // /Volumes/Personal HD/Workspace/CFDG-Semantics/src/cfdg.g:1:219: TARGETBRIGHTNESS
                {
                mTARGETBRIGHTNESS(); 


                }
                break;
            case 26 :
                // /Volumes/Personal HD/Workspace/CFDG-Semantics/src/cfdg.g:1:236: TARGETALPHA
                {
                mTARGETALPHA(); 


                }
                break;
            case 27 :
                // /Volumes/Personal HD/Workspace/CFDG-Semantics/src/cfdg.g:1:248: INTEGER
                {
                mINTEGER(); 


                }
                break;
            case 28 :
                // /Volumes/Personal HD/Workspace/CFDG-Semantics/src/cfdg.g:1:256: RATIONAL
                {
                mRATIONAL(); 


                }
                break;
            case 29 :
                // /Volumes/Personal HD/Workspace/CFDG-Semantics/src/cfdg.g:1:265: USER_STRING
                {
                mUSER_STRING(); 


                }
                break;
            case 30 :
                // /Volumes/Personal HD/Workspace/CFDG-Semantics/src/cfdg.g:1:277: WHITESPACE
                {
                mWHITESPACE(); 


                }
                break;
            case 31 :
                // /Volumes/Personal HD/Workspace/CFDG-Semantics/src/cfdg.g:1:288: USER_RATIONAL
                {
                mUSER_RATIONAL(); 


                }
                break;
            case 32 :
                // /Volumes/Personal HD/Workspace/CFDG-Semantics/src/cfdg.g:1:302: USER_RATIONAL_TARGET
                {
                mUSER_RATIONAL_TARGET(); 


                }
                break;

        }

    }


    protected DFA17 dfa17 = new DFA17(this);
    protected DFA18 dfa18 = new DFA18(this);
    protected DFA19 dfa19 = new DFA19(this);
    static final String DFA17_eotS =
        "\1\uffff\1\4\3\uffff\1\7\2\uffff";
    static final String DFA17_eofS =
        "\10\uffff";
    static final String DFA17_minS =
        "\1\55\1\56\1\uffff\1\56\1\uffff\1\56\2\uffff";
    static final String DFA17_maxS =
        "\2\71\1\uffff\1\71\1\uffff\1\71\2\uffff";
    static final String DFA17_acceptS =
        "\2\uffff\1\1\1\uffff\1\2\1\uffff\1\4\1\3";
    static final String DFA17_specialS =
        "\10\uffff}>";
    static final String[] DFA17_transitionS = {
            "\1\3\1\2\1\uffff\12\1",
            "\1\2\1\uffff\12\1",
            "",
            "\1\6\1\uffff\12\5",
            "",
            "\1\6\1\uffff\12\5",
            "",
            ""
    };

    static final short[] DFA17_eot = DFA.unpackEncodedString(DFA17_eotS);
    static final short[] DFA17_eof = DFA.unpackEncodedString(DFA17_eofS);
    static final char[] DFA17_min = DFA.unpackEncodedStringToUnsignedChars(DFA17_minS);
    static final char[] DFA17_max = DFA.unpackEncodedStringToUnsignedChars(DFA17_maxS);
    static final short[] DFA17_accept = DFA.unpackEncodedString(DFA17_acceptS);
    static final short[] DFA17_special = DFA.unpackEncodedString(DFA17_specialS);
    static final short[][] DFA17_transition;

    static {
        int numStates = DFA17_transitionS.length;
        DFA17_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA17_transition[i] = DFA.unpackEncodedString(DFA17_transitionS[i]);
        }
    }

    class DFA17 extends DFA {

        public DFA17(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 17;
            this.eot = DFA17_eot;
            this.eof = DFA17_eof;
            this.min = DFA17_min;
            this.max = DFA17_max;
            this.accept = DFA17_accept;
            this.special = DFA17_special;
            this.transition = DFA17_transition;
        }
        public String getDescription() {
            return "159:1: USER_RATIONAL : ( RATIONAL | INTEGER | '-' INTEGER | '-' RATIONAL );";
        }
    }
    static final String DFA18_eotS =
        "\10\uffff";
    static final String DFA18_eofS =
        "\10\uffff";
    static final String DFA18_minS =
        "\1\55\1\56\1\uffff\1\56\1\uffff\1\56\2\uffff";
    static final String DFA18_maxS =
        "\1\71\1\174\1\uffff\1\71\1\uffff\1\174\2\uffff";
    static final String DFA18_acceptS =
        "\2\uffff\1\1\1\uffff\1\2\1\uffff\1\4\1\3";
    static final String DFA18_specialS =
        "\10\uffff}>";
    static final String[] DFA18_transitionS = {
            "\1\3\1\2\1\uffff\12\1",
            "\1\2\1\uffff\12\1\102\uffff\1\4",
            "",
            "\1\6\1\uffff\12\5",
            "",
            "\1\6\1\uffff\12\5\102\uffff\1\7",
            "",
            ""
    };

    static final short[] DFA18_eot = DFA.unpackEncodedString(DFA18_eotS);
    static final short[] DFA18_eof = DFA.unpackEncodedString(DFA18_eofS);
    static final char[] DFA18_min = DFA.unpackEncodedStringToUnsignedChars(DFA18_minS);
    static final char[] DFA18_max = DFA.unpackEncodedStringToUnsignedChars(DFA18_maxS);
    static final short[] DFA18_accept = DFA.unpackEncodedString(DFA18_acceptS);
    static final short[] DFA18_special = DFA.unpackEncodedString(DFA18_specialS);
    static final short[][] DFA18_transition;

    static {
        int numStates = DFA18_transitionS.length;
        DFA18_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA18_transition[i] = DFA.unpackEncodedString(DFA18_transitionS[i]);
        }
    }

    class DFA18 extends DFA {

        public DFA18(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 18;
            this.eot = DFA18_eot;
            this.eof = DFA18_eof;
            this.min = DFA18_min;
            this.max = DFA18_max;
            this.accept = DFA18_accept;
            this.special = DFA18_special;
            this.transition = DFA18_transition;
        }
        public String getDescription() {
            return "165:1: USER_RATIONAL_TARGET : ( RATIONAL '|' | INTEGER '|' | '-' INTEGER '|' | '-' RATIONAL '|' );";
        }
    }
    static final String DFA19_eotS =
        "\1\uffff\1\34\1\37\1\42\5\uffff\3\25\1\46\1\47\1\50\1\52\1\25\1"+
        "\55\1\uffff\1\62\4\uffff\4\25\1\uffff\2\25\1\uffff\2\25\1\uffff"+
        "\3\25\3\uffff\1\25\1\uffff\2\25\6\uffff\1\107\1\uffff\1\107\1\110"+
        "\1\uffff\2\25\1\115\10\25\1\52\2\25\1\107\2\uffff\2\110\1\25\1\34"+
        "\1\uffff\1\132\2\25\1\135\4\25\1\142\1\25\1\110\1\25\1\uffff\2\25"+
        "\1\uffff\4\25\1\uffff\1\55\3\25\1\42\1\156\1\157\4\25\2\uffff\4"+
        "\25\1\170\3\25\1\uffff\1\174\1\175\1\37\2\uffff";
    static final String DFA19_eofS =
        "\176\uffff";
    static final String DFA19_minS =
        "\1\11\3\101\5\uffff\1\111\1\121\1\122\4\101\1\154\1\101\1\141\1"+
        "\56\1\60\2\uffff\1\56\1\141\1\172\1\164\1\145\1\uffff\1\143\1\151"+
        "\1\uffff\1\154\1\164\1\uffff\1\122\1\125\1\111\3\uffff\1\145\1\uffff"+
        "\1\151\1\160\6\uffff\1\60\1\uffff\1\60\1\56\1\60\1\162\1\145\1\101"+
        "\1\167\1\153\1\147\1\145\1\141\1\103\3\101\1\160\1\150\1\60\2\uffff"+
        "\2\60\1\164\1\101\1\uffff\1\101\1\147\1\150\1\101\1\164\1\114\1"+
        "\122\1\116\1\101\1\141\1\60\1\163\1\uffff\1\162\1\164\1\uffff\1"+
        "\145\2\105\1\107\1\uffff\1\101\1\150\1\157\1\156\3\101\1\114\1\141"+
        "\1\165\1\145\2\uffff\1\105\1\160\1\156\1\163\1\101\1\145\1\144\1"+
        "\163\1\uffff\3\101\2\uffff";
    static final String DFA19_maxS =
        "\1\175\3\172\5\uffff\1\111\1\121\1\122\4\172\1\154\1\172\1\163\1"+
        "\174\1\71\2\uffff\1\71\1\141\1\172\1\164\1\145\1\uffff\1\143\1\151"+
        "\1\uffff\1\154\1\164\1\uffff\1\122\1\125\1\111\3\uffff\1\145\1\uffff"+
        "\1\151\1\160\6\uffff\1\174\1\uffff\2\174\1\71\1\162\1\145\1\172"+
        "\1\167\1\153\1\147\1\145\1\141\1\103\2\101\1\172\1\160\1\150\1\174"+
        "\2\uffff\2\174\1\164\1\172\1\uffff\1\172\1\147\1\150\1\172\1\164"+
        "\1\114\1\122\1\116\1\172\1\141\1\174\1\163\1\uffff\1\162\1\164\1"+
        "\uffff\1\145\2\105\1\107\1\uffff\1\172\1\150\1\157\1\156\3\172\1"+
        "\114\1\141\1\165\1\145\2\uffff\1\105\1\160\1\156\1\163\1\172\1\145"+
        "\1\144\1\163\1\uffff\3\172\2\uffff";
    static final String DFA19_acceptS =
        "\4\uffff\1\4\1\5\1\6\1\7\1\10\14\uffff\1\35\1\36\5\uffff\1\17\2"+
        "\uffff\1\21\2\uffff\1\20\3\uffff\1\14\1\15\1\16\1\uffff\1\22\2\uffff"+
        "\1\26\1\27\1\30\1\31\1\32\1\33\1\uffff\1\40\22\uffff\1\34\1\37\4"+
        "\uffff\1\23\14\uffff\1\25\2\uffff\1\3\4\uffff\1\24\13\uffff\1\11"+
        "\1\12\10\uffff\1\13\3\uffff\1\1\1\2";
    static final String DFA19_specialS =
        "\176\uffff}>";
    static final String[] DFA19_transitionS = {
            "\2\26\1\uffff\2\26\22\uffff\1\26\11\uffff\1\10\2\uffff\1\27"+
            "\1\24\1\uffff\12\23\7\uffff\2\25\1\11\17\25\1\12\1\13\6\25\1"+
            "\6\1\uffff\1\7\3\uffff\1\21\1\2\3\25\1\20\1\25\1\17\11\25\1"+
            "\3\1\1\4\25\1\14\1\15\1\16\1\4\1\22\1\5",
            "\32\25\6\uffff\1\32\7\25\1\31\1\25\1\33\10\25\1\30\6\25",
            "\32\25\6\uffff\1\35\20\25\1\36\10\25",
            "\32\25\6\uffff\16\25\1\41\5\25\1\40\5\25",
            "",
            "",
            "",
            "",
            "",
            "\1\43",
            "\1\44",
            "\1\45",
            "\32\25\6\uffff\32\25",
            "\32\25\6\uffff\32\25",
            "\32\25\6\uffff\32\25",
            "\32\25\6\uffff\24\25\1\51\5\25",
            "\1\53",
            "\32\25\6\uffff\13\25\1\54\16\25",
            "\1\61\1\60\5\uffff\1\56\12\uffff\1\57",
            "\1\63\1\uffff\12\23\102\uffff\1\64",
            "\12\65",
            "",
            "",
            "\1\67\1\uffff\12\66",
            "\1\70",
            "\1\71",
            "\1\72",
            "\1\73",
            "",
            "\1\74",
            "\1\75",
            "",
            "\1\76",
            "\1\77",
            "",
            "\1\100",
            "\1\101",
            "\1\102",
            "",
            "",
            "",
            "\1\103",
            "",
            "\1\104",
            "\1\105",
            "",
            "",
            "",
            "",
            "",
            "",
            "\12\106\102\uffff\1\64",
            "",
            "\12\65\102\uffff\1\64",
            "\1\111\1\uffff\12\66\102\uffff\1\64",
            "\12\112",
            "\1\113",
            "\1\114",
            "\32\25\6\uffff\32\25",
            "\1\116",
            "\1\117",
            "\1\120",
            "\1\121",
            "\1\122",
            "\1\123",
            "\1\124",
            "\1\125",
            "\32\25\6\uffff\32\25",
            "\1\126",
            "\1\127",
            "\12\106\102\uffff\1\64",
            "",
            "",
            "\12\130\102\uffff\1\64",
            "\12\112\102\uffff\1\64",
            "\1\131",
            "\32\25\6\uffff\32\25",
            "",
            "\32\25\6\uffff\32\25",
            "\1\133",
            "\1\134",
            "\32\25\6\uffff\32\25",
            "\1\136",
            "\1\137",
            "\1\140",
            "\1\141",
            "\32\25\6\uffff\32\25",
            "\1\143",
            "\12\130\102\uffff\1\64",
            "\1\144",
            "",
            "\1\145",
            "\1\146",
            "",
            "\1\147",
            "\1\150",
            "\1\151",
            "\1\152",
            "",
            "\32\25\6\uffff\32\25",
            "\1\153",
            "\1\154",
            "\1\155",
            "\32\25\6\uffff\32\25",
            "\32\25\6\uffff\32\25",
            "\32\25\6\uffff\32\25",
            "\1\160",
            "\1\161",
            "\1\162",
            "\1\163",
            "",
            "",
            "\1\164",
            "\1\165",
            "\1\166",
            "\1\167",
            "\32\25\6\uffff\32\25",
            "\1\171",
            "\1\172",
            "\1\173",
            "",
            "\32\25\6\uffff\32\25",
            "\32\25\6\uffff\32\25",
            "\32\25\6\uffff\32\25",
            "",
            ""
    };

    static final short[] DFA19_eot = DFA.unpackEncodedString(DFA19_eotS);
    static final short[] DFA19_eof = DFA.unpackEncodedString(DFA19_eofS);
    static final char[] DFA19_min = DFA.unpackEncodedStringToUnsignedChars(DFA19_minS);
    static final char[] DFA19_max = DFA.unpackEncodedStringToUnsignedChars(DFA19_maxS);
    static final short[] DFA19_accept = DFA.unpackEncodedString(DFA19_acceptS);
    static final short[] DFA19_special = DFA.unpackEncodedString(DFA19_specialS);
    static final short[][] DFA19_transition;

    static {
        int numStates = DFA19_transitionS.length;
        DFA19_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA19_transition[i] = DFA.unpackEncodedString(DFA19_transitionS[i]);
        }
    }

    class DFA19 extends DFA {

        public DFA19(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 19;
            this.eot = DFA19_eot;
            this.eof = DFA19_eof;
            this.min = DFA19_min;
            this.max = DFA19_max;
            this.accept = DFA19_accept;
            this.special = DFA19_special;
            this.transition = DFA19_transition;
        }
        public String getDescription() {
            return "1:1: Tokens : ( STARTSHAPE | BACKGROUND | RULE | LEFTBRACKET | RIGHTBRACKET | LEFTBRACE | RIGHTBRACE | STAR | CIRCLE_P | SQUARE_P | TRIANGLE_P | XSHIFT | YSHIFT | ZSHIFT | SIZE | ROTATE | BRIGHTNESS | HUE | SATURATION | FLIP | SKEW | ALPHA | TARGETHUE | TARGETSATURATION | TARGETBRIGHTNESS | TARGETALPHA | INTEGER | RATIONAL | USER_STRING | WHITESPACE | USER_RATIONAL | USER_RATIONAL_TARGET );";
        }
    }
 

}