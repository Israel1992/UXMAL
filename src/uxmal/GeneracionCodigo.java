package uxmal;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.LinkedList;
import javax.swing.JFileChooser;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.filechooser.FileNameExtensionFilter;

/* @author Israel */

public class GeneracionCodigo {
    public static File FilePath=null;
    public static File Path=null;
    public static String nombre="";
    private LinkedList textoArea = new LinkedList();
    
    public void setInstruccion(String FileContent){
        FileWriter file;
        BufferedWriter writer;     
       try {
            file = new FileWriter(FilePath+".java", !false);
            writer = new BufferedWriter(file);
            writer.write(FileContent, 0, FileContent.length());
            writer.close();
            file.close();
            
            archivos.CopiarLib librerias=new archivos.CopiarLib("src\\uxmal\\docs\\lib\\org\\",Path+"");
            principal.Uxmal.AreaDeTexto.append("\nCompilacion Correcta."); 
        } catch (IOException e) {
            JOptionPane.showMessageDialog(null, "Error al guardar el archivo", "Error guardar archivo", JOptionPane.ERROR_MESSAGE);
        }
    }
    
    public void getInstruccion(){
        
    }
    
    public void setRutaDocumento(JFrame frame){
        if(FilePath==null){
            FileNameExtensionFilter filtro = new FileNameExtensionFilter("java", "*.java");
            JFileChooser fileChooserGuardar = new JFileChooser();
            fileChooserGuardar.setFileFilter(filtro);
            fileChooserGuardar.setDialogTitle("Guardar");
            int seleccion = fileChooserGuardar.showSaveDialog(frame);
            
             if (seleccion == JFileChooser.APPROVE_OPTION) {
                FilePath = fileChooserGuardar.getSelectedFile();
                Path = fileChooserGuardar.getSelectedFile().getParentFile();
                this.nombre= fileChooserGuardar.getName(FilePath);
                //JOptionPane.showMessageDialog(null, fileChooserGuardar.getName()+" edgar");
                fileChooserGuardar.setFileSelectionMode(JFileChooser.FILES_ONLY); 
             }  
        }else{
            principal.Uxmal.AreaDeTexto.append("\n+"+FilePath+"\n+"+Path+"\n+"+this.nombre ); 
  
        }
    }
}
