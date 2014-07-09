
package uxmal;

public class token {
    
    private int col;
    private int row;
    private String cadena, simbolo;
    private String mensaje;
    private int entero;
    
        
    public token(String simbolo,int col, int row){
        this.simbolo=simbolo;
        this.col = col;
        this.row = row;
        ManejoErrores manejoErrores=new ManejoErrores(simbolo);
        this.mensaje=manejoErrores.getRollback();
    }
    
    public token(int col, int row, String cadena ) {
        this.col = col;
        this.row = row;
        this.cadena = cadena;
         ManejoErrores manejoErrores=new ManejoErrores(cadena);
        this.mensaje=manejoErrores.getRollback();
    }
     
    public int getCol() {
        return (this.col)+1;
    }
    
    public int getRow() {
        return (this.row)+1;
    }
    
    public String getMensaje() {
        return this.mensaje;
    }
    
    public String getCadena() {
        return this.cadena;
    }
    
     public String getSimbolo() {
        return this.simbolo;
    }
    
    public void setCadena(String c) {
        cadena = c;
    }
}
