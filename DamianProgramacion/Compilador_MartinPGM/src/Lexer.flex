
import compilerTools.Token;

%%
%class Lexer
%type Token
%line
%column
%{
    private Token token(String lexeme, String lexicalComp, int line, int column){
        return new Token(lexeme, lexicalComp, line+1, column+1);
    }
%}   
/*Variables basicas de comentarios y espacios*/
    TerminadorDeLinea = \r|\n|\r\n
    EntradaDeCaracter = [^\r\n]
    EspacioEnBlanco = {TerminadorDeLinea} | [ \t\f]
    ComentarioTradicional = "/*" [^*]~"*/" | "/*" "*"+ "/"
    FinDeLineaComentario = "//" {EntradaDeCaracter}* {TerminadorDeLinea}?
    ContenidoComentario = ( [^*] | \*+ [^/*] )*
    ComentarioDeDocumentacion = "/**" {ContenidoComentario} "*"+ "/"
    
    /* comments */
    Comentario = {ComentarioTradicional} | {FinDeLineaComentario} | {ComentarioDeDocumentacion}
    // Comment can be the last line of the file, without line terminator.
    
    
    /* Identificador */
    Letra = [A-Za-zÑñ_ÁÉÍÓÚáéíóúÜü]
    Digito = [0-9]
    Identificador = {Letra}({Letra}|{Digito})*
    
    /*Numero*/
    Numero = 0 | [1-9][0-9]*
%%

{Comentario}|{EspacioEnBlanco} { /* Ignorar */ }

/* Identificador */
\${Identificador} { return token(yytext(), "IDENTIFICADOR", yyline, yycolumn); }

/* Tipos de datos */
número |
color { return token(yytext(), "TIPO_DATO", yyline, yycolumn); }

/* Número*/
{Numero} { return token(yytext(), "NUMERO", yyline, yycolumn); }

/* Colores */
#[{Letra}|{Digito}]{6} { return token(yytext(), "COLOR", yyline, yycolumn); }

/* Operadores de Agrupacion */
"(" { return token(yytext(), "PARENTESIS_A", yyline, yycolumn); }
")" { return token(yytext(), "PARENTESIS_C", yyline, yycolumn); }
"{" { return token(yytext(), "LLAVE_A", yyline, yycolumn); }
"}" { return token(yytext(), "LLAVE_C", yyline, yycolumn); }

/* Signos de Puntuacion */
"," { return token(yytext(), "COMA", yyline, yycolumn); }
";" { return token(yytext(), "PUNTO_COMA", yyline, yycolumn); }

/* Operador de Asignacion */
= { return token(yytext(), "OP_ASIG", yyline, yycolumn); }

/* Movimiento */
adelante |
atrás |
izquierda |
derecha |
norte |
sur |
este |
oeste { return token(yytext(), "MOVIMIENTO", yyline, yycolumn); }

/* Pintar */
pintar { return token(yytext(), "PINTAR", yyline, yycolumn); }

/* Detener Pintar */
detenerPintar { return token(yytext(), "DETENER_PINTAR", yyline, yycolumn); }

/* Tomar */
tomar |
poner { return token(yytext(), "TOMAR", yyline, yycolumn); }

/* lanzar Moneda */
lanzarMoneda { return token(yytext(), "LANZAR_MONEDA", yyline, yycolumn); }

/* Ver */
izquierdaEsObstáculo |
izquierdaEsClaro |
izquierdaEsBaliza |
izquierdaEsBlanco |
izquierdaEsNegro |
frenteEsObstáculo |
frenteEsClaro |
frenteEsBaliza |
frenteEsBlanco |
frenteEsNegro |
derechaEsObstáculo |
derechaEsClaro |
derechaEsBaliza |
derechaEsBlanco |
derechaEsNegro { return token(yytext(), "VER", yyline, yycolumn); }


/* Repetir */
mientras { return token(yytext(), "REPETIR", yyline, yycolumn); }

/* Detener Repetir */
break { return token(yytext(), "DETENER_REPETIR", yyline, yycolumn); }

/* Estructura Si */
if |
else { return token(yytext(), "ESTRUCTURA_SI", yyline, yycolumn); }

/* Operadores Logicos */
"&" | 
"|" { return token(yytext(), "OP_LOGICO", yyline, yycolumn); }

/* Final */
final { return token(yytext(), "FINAL", yyline, yycolumn); }

//Numero Erroneo
0{Numero} { return token(yytext(), "ERROR_1", yyline, yycolumn); }
//Identificador Erroneo
{Identificador} { return token(yytext(), "ERROR_2", yyline, yycolumn); }
. { return token(yytext(), "ERROR", yyline, yycolumn); }