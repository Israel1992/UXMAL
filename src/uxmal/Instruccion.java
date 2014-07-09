/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package uxmal;

/**
 *
 * @author Israel
 */
public class Instruccion {
         //esta clase sirve para guardar los datos de cada una de las intrucciones
    String instruccion,texto1,texto2,tipoGrafica,titulo;//guarda el nombre de la instruccion: linea, circulo, rectangulo, color
    String nombre_grupos,nombre_valor;
    int valor;//guarda los numeros correspondientes de cada instruccion
    double valord;
    public Instruccion() {
   
    }
       public Instruccion(String tipoGrafica, String instruccion, int valor, String texto1 ,String texto2) {
        this.tipoGrafica = tipoGrafica;
        this.instruccion = instruccion;
        this.valor = valor;
        this.texto1 = texto1;
        this.texto2 = texto2;
    }
       
    public Instruccion(String tipoGrafica, String instruccion, String texto1, int valor) {
        this.tipoGrafica = tipoGrafica;
        this.instruccion = instruccion;
        this.texto1 = texto1;
        this.valor = valor;
    }
    
     public Instruccion(String tipoGrafica, String instruccion, String titulo) {
        this.tipoGrafica = tipoGrafica;
        this.instruccion = instruccion;
        this.titulo = titulo;
    }
     
      public Instruccion(String tipoGrafica, String instruccion, String texto1, double valor) {
        this.tipoGrafica = tipoGrafica;
        this.instruccion = instruccion;
        this.texto1 = texto1;
        this.valord=valor;
    }
     
     public Instruccion(String tipoGrafica, String instruccion, String titulo, String nombreGrupo,String nombreValor) {
     
        this.nombre_grupos=nombreGrupo;
        this.nombre_valor=nombreValor;
        this.tipoGrafica = tipoGrafica;
        this.instruccion = instruccion;
        this.titulo = titulo;
    }
    
    public String getTipoGrafica() {
        return tipoGrafica;
    }

    public String getInstruccion() {
        return instruccion;
    }

    public int getNumero() {
        return valor;
    }
    
    public String getTexto1(){
        return texto1;
    }

    public String getTexto2(){
        return texto2;
    }
    
    public String getTitulo(){
        return titulo;
    }
    
    public String getNombreValor(){
        return nombre_valor;
    }
    
    public double getNombreValord(){
        return valord;
    }
     
    public String getNombreGrupo(){
        return nombre_grupos;
    }
}