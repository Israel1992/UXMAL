/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package archivos;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import javax.swing.JOptionPane;

/**
 *
 * @author Israel
 */


public class CopiarLib {
    public static int  EntraIncial=0; 
    
    public CopiarLib(String origen,String destino){
        //Fichero desde el cual se van a copiar los datos  
        File FOrigen=new File(origen);  
        //Fichero donde se van a copiar los datos  
        File FDestino=new File(destino);  
        Copiar(FOrigen,FDestino);  
        EntraIncial=0;  
    }
    
    public static void Copiar(File FOrigen,File FDestino){  
        //si el origen no es una carpeta  
        if(!FOrigen.isDirectory()){  
            //Llamo la funcion que lo copia  
            CopiarFichero(FOrigen,FDestino);  
        }else{  
           //incremento el contador de entradas a esta función   
           EntraIncial++;   
           //solo se entra acá cuando se quiera copiar una carpeta y   
           //sea la primera es decir la carpeta padre  
           if(EntraIncial==1){  
                //Cambio la ruta destino por el nombre que tenia mas el nombre de  
                //la carpeta padre  
                FDestino=new File(FDestino.getAbsolutePath()+"/"+FOrigen.getName());   
                //si la carpeta no existe la creo  
                if(!FDestino.exists()){  
                    FDestino.mkdir();  
                }  
           }   
           //obtengo el nombre de todos los archivos y carpetas que   
           //pertenecen a este fichero(FOrigen)  
           String []Rutas=FOrigen.list();  
           //recorro uno a uno el contenido de la carpeta  
             
           /*IMPORTANTE:EL HML SE DESCONFIGURA Y NO ME DEJA  
             PORNE LA LINEA FOR SIGUIENTE BIEN, TENGO PROBLEMA  
             CON EL SIGNO MENOR.SI UD LE PASA LO MISMO DESCARGE EL 
             PROGRAMA CON EL LINK DE ABAJO Y VÉALO DE FORMA SEGURA            
           */  
             for(int i=0;i<Rutas.length;i++){  
              //establezco el nombre del nuevo archivo origen   
              File FnueOri=new File(FOrigen.getAbsolutePath()+"/"+Rutas[i]);  
              //establezco el nombre del nuevo archivo destino   
              File FnueDest= new File(FDestino.getAbsolutePath()+"/"+Rutas[i]);  
              //si no existe el archivo destino lo creo  
              if(FnueOri.isDirectory() && !FnueDest.exists()){  
                  FnueDest.mkdir();                          
              }  
              //uso recursividad y llamo a esta misma funcion has llegar  
              //al ultimo elemento      
              Copiar(FnueOri,FnueDest);   
           }  
        }  
          
    }
    
    /*Funcio que copia un fichero 
 *PARAMETRO1:FOrigen:Fichero o carpeta que se desea copiar 
 *PARAMETRO2:FDestino:Carpeta destino 
 */  
public static void CopiarFichero(File FOrigen,File FDestino){  
            try {  
            //Si el archivo a copiar existe  
            if(FOrigen.exists()){  
                int opcion=0;
                String copiar="S";  
                //si el fichero destino ya existe  
                if(FDestino.exists()){  
                   opcion = JOptionPane.showConfirmDialog(null, "El fichero ya existe, Desea Sobre Escribir", "Seleccione una opción", JOptionPane.YES_NO_OPTION);
                }  
                //si puedo copiar  
                if(opcion == JOptionPane.YES_OPTION){  
                    //Flujo de lectura al fichero origen(que se va a copiar)              
                    FileInputStream LeeOrigen= new FileInputStream(FOrigen);  
                    //Flujo de lectura al fichero destino(donde se va a copiar)  
                    OutputStream Salida = new FileOutputStream(FDestino);  
                    //separo un buffer de 1MB de lectura  
                    byte[] buffer = new byte[1024];  
                    int tamaño;  
                    //leo el fichero a copiar cada 1MB  
                    while ((tamaño = LeeOrigen.read(buffer)) > 0) {  
                    //Escribe el MB en el fichero destino  
                    Salida.write(buffer, 0, tamaño);  
                    }  
                        principal.Uxmal.AreaDeTexto.setText(FOrigen.getName()+" Copiado Librerias con Exito!!"); 
                    //cierra los flujos de lectura y escritura  
                    Salida.close();  
                    LeeOrigen.close();  
                }else {
                        principal.Uxmal.AreaDeTexto.setText("No se sobreescribio"+FOrigen.getAbsolutePath()); 
                }  
                  
            }else{//l fichero a copiar no existe   
                 principal.Uxmal.AreaDeTexto.setText("El fichero a copiar no existe..."+FOrigen.getAbsolutePath());
            }  
              
        } catch (Exception ex) {  
             principal.Uxmal.AreaDeTexto.setText("Error Inesperado: \n"+ex.getMessage());
             
          
       }  
      
      
}  
    
}
