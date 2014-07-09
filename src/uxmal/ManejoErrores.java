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
public class ManejoErrores {
    
    private String rollback="nada";
    
    public ManejoErrores(String simbolo){
         switch(simbolo){
                case "\n" :
                        this.rollback = "No deje linea en blanco.\n"
                                +"Ejemplo:\n"+"{\n"+
                                " <----Error\n"+
                                "agregar(\"C\",40);\n"+
                                "agregar(\"Java\",45);\n"+
                                "}\n"; 
                 break;
                case ";" :
                   this.rollback = "Despues de \";\" debe cerrar llaves o acabar con fin \n"
                          +" segun sea el caso...";     
                  break;
                   case ",":
                    this.rollback = "Despues de \",\" debe ingresar otro campo texto \n"
                     +"Ejemplo:\n"
                     +"agregar(8, \"Hombres\", \"Viernes\"); <---Despues de \",\" otro campo";
                         
                         
                  break;
                   case ".":
                    this.rollback = "Debe ser un formato completo\n"
                                +"Ejemplo:\n"
                                 +"grafica_pastel3d.datos{\n" 
                                +"<--- Aca va mas codigo (consulte el manual para mas informacion)\n"
                                +"})";
                         
                  break;
                   case "\"":
                       this.rollback = "Posibles causas:\n"
                               +"1. Acabar colocando \")\" \n"
                               +"2. Seguir codigo colocando \",\"\n"
                               +"3. Terminar parrafo con \"\"\" nuevamente ";
                  break;
                   case "(":
                        this.rollback = "Acabar codigo cerrando con \" ) \".\n"
                                +"Ejemplo:\n"
                                +"agregar(8, \"Hombres\", \"Viernes\"); <--- Antes de \";\" cierra con \")\"";
                         
                  break;
                   case ")":
                         this.rollback ="despues de \")\" colocar \";\" para acabar con el renglon"
                         +"\nEjemplo:\n agregar(7, \"Mujeres\", \"Viernes\"); <---- acabar con \";\"";
                  break;
                  case "}":
                           this.rollback = "Debe cerrar la llave e ingresar contenido dentro:\n"+"Ejemplo: { \"Contenido\" -->}";
                  case "{":
                           this.rollback = "Debe cerrar su codigo indicando un titulo\n y con fin segun la grafica que este generando:\n"+"Ejemplo: \n }\n titulo(\"Barras\",\"Genero\",\"Dias\");\n fin \n";       
                  break;
                
                  case "inicio" :
                          this.rollback = "Codigo incompleto. \n"
                          +"para aprender a crear las graficas consulte el manual";       
                  
                         
                  break;
                 
                   case "grafica_pastel"  :
                       this.rollback = "Debe ser un formato completo\n"
                                +"Ejemplo:\n"
                                 +"grafica_pastel.datos{\n" 
                                +"<--- Aca va mas codigo (consulte el manual para mas informacion)\n"
                                +"})";
                         
                  break;
                  case "grafica_barras3d"   :
                      this.rollback = "Debe ser un formato completo\n"
                                +"Ejemplo:\n"
                                 +"grafica_barras3d.datos{\n" 
                                +"<--- Aca va mas codigo (consulte el manual para mas informacion)\n"
                                +"})";
                         
                  break;
                   case "grafica_pastel3d":
                        this.rollback = "Debe ser un formato completo\n"
                                +"Ejemplo:\n"
                                 +"grafica_pastel3d.datos{\n" 
                                +"<--- Aca va mas codigo (consulte el manual para mas informacion)\n"
                                +"})";
                         
                  break;
                   case "grafica_lineal" :
                       this.rollback = "Debe ser un formato completo\n"
                                +"Ejemplo:\n"
                                 +"grafica_lineal.datos{\n" 
                                +"<--- Aca va mas codigo (consulte el manual para mas informacion)\n"
                                +"})";
                         
                  break;
                  case "titulo" :
                       this.rollback = "No es posible que solo escriba \"titulo\" debe ser un formato completo\n"
                                +"Ejemplo:\n"
                                +"titulo(\"Barras\",\"Genero\",\"Dias\"); <--- Formato completo(dependera de la grafica que este generando)";
                         
                         
                  break;
                   case "datos":
                       this.rollback = "No es posible que solo escriba \"datos\" debe ser un formato completo\n"
                                +"Ejemplo:\n"
                                +"grafica_pastel3d.datos{\n" 
                                +"<--- Aca va mas codigo (consulte el manual para mas informacion)\n"
                                +"})";
                                                
                  break;
                   case "agregar":
                         this.rollback = "No es posible que solo escriba \"agregar\" debe ser un formato completo\n"
                                +"Ejemplo:\n"
                                +"agregar(\"Redes\",2); <--- Formato completo(dependera de la grafica que este generando)";      
                  break;
                  
                  default:      
                      this.rollback = "No se reconoce como simbolo valido "+simbolo;  
                  ;
         
        }
    }
    
    public String getRollback(){
        return this.rollback;
    }
}
