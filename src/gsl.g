grammar gsl;

options {
  language = Java;
}

@header {
package parser;
import java.util.HashMap;
import tree.Tree;
}

@lexer::header {
package parser;
}

@members {

}

window returns [Tree window = new Tree();]
  :
  OPEN WINDOW_TAG 
                  {
                   window.setType("window");
                  }
  (WS)*
  (
    k=KEY_TAG (WS)* EQUALS (WS)* QUOTE? v=STRING_LITERAL QUOTE? 
                                                                {
                                                                 window.setByString($k.text, $v.text);
                                                                }
    (WS)*
    (
      COMMA (WS)* k=KEY_TAG (WS)* EQUALS (WS)* QUOTE? v=STRING_LITERAL QUOTE? 
                                                                              {
                                                                               window.setByString($k.text, $v.text);
                                                                              }
      (WS)*
    )*
  )?
  CLOSE (WS)* (panel 
                     {
                      window.addChild($panel.panel);
                     })+ OPEN SLASH WINDOW_TAG CLOSE (WS)*
  ;

panel returns [Tree panel = new Tree();]
  :
  (
    OPEN p=PANEL_TAG 
                     {
                      panel.setType($p.text);
                     }
    (WS)*
    (
      k=KEY_TAG (WS)* EQUALS (WS)* QUOTE? v=STRING_LITERAL QUOTE? 
                                                                  {
                                                                   panel.setByString($k.text, $v.text);
                                                                  }
      (WS)*
      (
        COMMA (WS)* k=KEY_TAG (WS)* EQUALS (WS)* QUOTE? v=STRING_LITERAL QUOTE? 
                                                                                {
                                                                                 panel.setByString($k.text, $v.text);
                                                                                }
        (WS)*
      )*
    )?
    CLOSE (WS)* (tag 
                     {
                      panel.addChild($tag.tags);
                     })+ OPEN SLASH PANEL_TAG CLOSE (WS)*
  )
  ;

tag returns [Tree tags = new Tree()]
  :
  OPEN t=TAGS 
              {
               tags.setType($t.text);
              }
  (WS)*
  (
    k=KEY_TAG (WS)* EQUALS (WS)* QUOTE? v=STRING_LITERAL QUOTE? 
                                                                {
                                                                 tags.setByString($k.text, $v.text);
                                                                }
    (WS)*
    (
      COMMA (WS)* k=KEY_TAG (WS)* EQUALS (WS)* QUOTE? v=STRING_LITERAL QUOTE? 
                                                                              {
                                                                               tags.setByString($k.text, $v.text);
                                                                              }
      (WS)*
    )*
  )?
  CLOSE text OPEN SLASH TAGS CLOSE 
                                   {
                                    tags.setBodyText($text.text);
                                   }
  (WS)*
  ;

text returns [String text = new String();]
  :
  (WS)*
  (
    (t=STRING_LITERAL 
                      {
                       text += $t.text;
                      })+ (w=WS 
                                {
                                 text += $w.text;
                                })+
  )+
  ;

OPEN
  :
  '<'
  ;

CLOSE
  :
  '>'
  ;

SLASH
  :
  '/'
  ;

WINDOW_TAG
  :
  'window'
  ;

PANEL_TAG
  :
  'panel'
  ;

COMMA
  :
  ','
  ;

EQUALS
  :
  '='
  ;

QUOTE
  :
  '"'
  ;

TAGS
  :
  (
    'label'
    | 'button'
  )
  ;

KEY_TAG
  :
  (
    'ID'
    | 'id'
    | 'Id'
    | 'NAME'
    | 'name'
    | 'Name'
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
  )+
  ;
