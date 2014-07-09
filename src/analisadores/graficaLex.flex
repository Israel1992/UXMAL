
package uxmal;

import java_cup.runtime.Symbol;
import java.util.ArrayList;

%%
/* segunda parte: declaramos las directivas y los macros */
%class AnalizadorLexico
%{ 
public static ArrayList<token> simbolos = new ArrayList();
%} 
%public
%full
%unicode
%line
%column
%char
%cup
%ignorecase

LineTerminator = \r|\n|\r\n|\n\r
WhiteSpace = {LineTerminator} | [ \t\f]
ValorEntero = [1-9][0-9]*
ValorTexto = [a-zA-Z][a-zA-Z]*[0-9]*

%%
/* OPERADORES Y SIGNOS */

";" {
simbolos.add(new token(yytext(),yycolumn, yyline));
return new Symbol(sym.PCOMA, new token(yycolumn, yyline, yytext()));}

"," {
simbolos.add(new token(yytext(),yycolumn, yyline));
return new Symbol(sym.COMA, new token(yycolumn, yyline, yytext()));}

"." {
simbolos.add(new token(yytext(),yycolumn, yyline));
return new Symbol(sym.PUNTO, new token(yycolumn, yyline, yytext()));}

"(" {
simbolos.add(new token(yytext(),yycolumn, yyline));
return new Symbol(sym.ABRIRPAR, new token(yycolumn, yyline, yytext()));}

")" {
simbolos.add(new token(yytext(),yycolumn, yyline));
return new Symbol(sym.CERRARPAR, new token(yycolumn, yyline, yytext()));}

"{" {
simbolos.add(new token(yytext(),yycolumn, yyline));
return new Symbol(sym.ABRIRLLA, new token(yycolumn, yyline, yytext()));}

"}" {
simbolos.add(new token(yytext(),yycolumn, yyline));
return new Symbol(sym.CERRARLLA, new token(yycolumn, yyline, yytext()));}

"\"" {
simbolos.add(new token(yytext(),yycolumn, yyline));
return new Symbol(sym.COMILLASDOBL, new token(yycolumn, yyline, yytext()));}


/* PALABRAS RESERVADAS */
"inicio" {
simbolos.add(new token(yytext(),yycolumn, yyline));
return new Symbol(sym.INICIO, new token(yycolumn, yyline, yytext()));}

"fin" {
simbolos.add(new token(yytext(),yycolumn, yyline));
return new Symbol(sym.FIN, new token(yycolumn, yyline, yytext()));}

"grafica_pastel" {
simbolos.add(new token(yytext(),yycolumn, yyline));
return new Symbol(sym.GRAFICA_PASTEL, new token(yycolumn, yyline, yytext()));}

"grafica_barras3d" {
simbolos.add(new token(yytext(),yycolumn, yyline));
return new Symbol(sym.GRAFICA_BARRAS3D, new token(yycolumn, yyline, yytext()));}

"grafica_pastel3d" {
simbolos.add(new token(yytext(),yycolumn, yyline));
return new Symbol(sym.GRAFICA_PASTEL3D, new token(yycolumn, yyline, yytext()));}

"grafica_lineal" {
simbolos.add(new token(yytext(),yycolumn, yyline));
return new Symbol(sym.GRAFICA_LINEAL, new token(yycolumn, yyline, yytext()));}

"titulo" {
simbolos.add(new token(yytext(),yycolumn, yyline));
return new Symbol(sym.TITULO, new token(yycolumn, yyline, yytext()));}

"datos" {
simbolos.add(new token(yytext(),yycolumn, yyline));
return new Symbol(sym.DATOS, new token(yycolumn, yyline, yytext()));}

"agregar" {
simbolos.add(new token(yytext(),yycolumn, yyline));
return new Symbol(sym.AGREGAR, new token(yycolumn, yyline, yytext()));}

/* EXPRESIONES */
{ValorEntero} {
simbolos.add(new token(yytext(),yycolumn, yyline));
return new Symbol(sym.VALINT, new token(yycolumn, yyline, yytext()));}

{ValorTexto} {
simbolos.add(new token(yytext(),yycolumn, yyline));
return new Symbol(sym.VALSTR, new token(yycolumn, yyline, yytext()));}

{LineTerminator} {
simbolos.add(new token(yytext(),yycolumn, yyline));
return new Symbol(sym.ENTER, new token(yycolumn, yyline, yytext()));}

{WhiteSpace} {/* ignorar */}
. {System.err.println("caracter invalido" + yytext() + "["+ yyline + ":"+ yycolumn + "]");}