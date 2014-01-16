 
grammar cfdg;

@members {
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
}    

document    
    :    (statement)+    
    ;
    
statement
    :    init
    |    background
    |    rule
    ;
    
init
    :    STARTSHAPE USER_STRING
    ;
    
background
    :    BACKGROUND LEFTBRACKET buncha_color_adjustments? RIGHTBRACKET
    ;
    
size    
    :    SIZE modification
    ;
 

rule    
    :    RULE USER_STRING LEFTBRACKET buncha_replacements? RIGHTBRACKET
    |    RULE USER_STRING USER_RATIONAL LEFTBRACKET buncha_replacements? RIGHTBRACKET
    ;
    
buncha_replacements
    :    (replacement)+
    ;
    
replacement
    :    USER_STRING modification
    |    USER_STRING STAR modification USER_STRING modification
    ;
    
modification
    :    LEFTBRACKET buncha_adjustments? RIGHTBRACKET
    |    LEFTBRACE buncha_adjustments? RIGHTBRACE
    ;
    
buncha_adjustments
    :    (adjustment)+
    ;

buncha_color_adjustments
    :    (color_adjustment)+
    ;
    
adjustment
    :    ROTATE USER_RATIONAL
    |    FLIP USER_RATIONAL
    |    XSHIFT USER_RATIONAL
    |    YSHIFT USER_RATIONAL
    |    ZSHIFT USER_RATIONAL
    |    SIZE USER_RATIONAL
    |    SIZE USER_RATIONAL USER_RATIONAL
    |    SIZE USER_RATIONAL USER_RATIONAL USER_RATIONAL
    |    SKEW USER_RATIONAL USER_RATIONAL
    |    color_adjustment
    ;
    
color_adjustment
    :    HUE USER_RATIONAL
        |    SATURATION USER_RATIONAL
        |    BRIGHTNESS USER_RATIONAL
        |    ALPHA USER_RATIONAL
        |    HUE USER_RATIONAL_TARGET
        |    SATURATION USER_RATIONAL_TARGET 
        |    BRIGHTNESS USER_RATIONAL_TARGET 
        |    ALPHA USER_RATIONAL_TARGET
        |    TARGETHUE USER_RATIONAL
        |    TARGETSATURATION USER_RATIONAL
        |    TARGETBRIGHTNESS USER_RATIONAL
        |       TARGETALPHA USER_RATIONAL
        ;

STARTSHAPE
    :    'startshape';
BACKGROUND 
    :     'background';
    
RULE    :    'rule';

LEFTBRACKET
    :    '{';
    
RIGHTBRACKET
    :    '}';
LEFTBRACE
    :    '[';
RIGHTBRACE
    :    ']';
STAR    :    '*';
CIRCLE_P:    'CIRCLE';
SQUARE_P:    'SQUARE';
TRIANGLE_P
    :    'TRIANGLE';
XSHIFT    :    'x';
YSHIFT    :    'y';
ZSHIFT    :    'z';
SIZE
    :    's' | 'size';
ROTATE
    :    'r' | 'rotate';
BRIGHTNESS
    :    'b' | 'brightness';
HUE
    :    'h' | 'hue';
SATURATION
    :    'sat';    
FLIP
    :    'flip';
SKEW
    :    'skew';    
ALPHA
    :    'a' | 'alpha';    
TARGETHUE
    :    '|hue' | '|h';
TARGETSATURATION
    :    '|sat' | '|s';
TARGETBRIGHTNESS
    :    '|brightness' | '|b';
TARGETALPHA
    :    '|alpha' | '|a';
    
INTEGER    :    '0'..'9'+;
RATIONAL:    '0'..'9'+'.''0'..'9'* | '.''0'..'9'+;
USER_STRING    
    :    ('a'..'z' | 'A'..'Z')+;
WHITESPACE
    :    (' '|'\n'|'\t'|'\r'|'\f')+ {$channel = HIDDEN;};
USER_RATIONAL
    :    RATIONAL 
    |     INTEGER
    |    '-' INTEGER
    |    '-' RATIONAL
    ;
USER_RATIONAL_TARGET
    :    RATIONAL '|'
    |    INTEGER '|'
    |    '-' INTEGER '|'
    |    '-' RATIONAL '|'
    ;