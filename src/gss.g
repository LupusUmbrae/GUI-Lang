grammar gss;

options {
  language = Java;
}

@header {
package parser;
import java.util.HashMap;
}

@lexer::header {
package parser;
}

@members {

}

read returns [HashMap<String, HashMap<String, String>> styles = new HashMap<String, HashMap<String, String>>()]
  :
  (
    s=STRING_LITERAL OPEN (WS)* (style 
                                       {
                                        styles.put($s.text, $style.attr);
                                       }) CLOSE (WS)*
  )*
  ;

style returns [HashMap<String, String> attr = new HashMap<String, String>()]
  :
  (
    a=ATTRIBUTES (WS)* EQUALS (WS)* v=STRING_LITERAL (WS)* EOL (WS)* 
                                                                     {
                                                                      attr.put($a.text, $v.text);
                                                                     }
  )+
  ;

OPEN
  :
  '{'
  ;

CLOSE
  :
  '}'
  ;

EQUALS
  :
  '='
  ;

EOL
  :
  ';'
  ;

ATTRIBUTES
  :
  (
    'color'
    | 'position'
    | 'size'
    | 'layoutManager'
  )
  ;

WS
  :
  (
    ' '
    | '\t'
    | '\r'
    | '\n'
    | '\u000C'
  )+
  ;

STRING_LITERAL
  :
  (
    'a'..'z'
    | 'A'..'Z'
    | '0'..'9'
    | ','
  )+
  ;
