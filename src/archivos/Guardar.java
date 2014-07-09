/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package archivos;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.LinkedList;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.JTextArea;
import javax.swing.filechooser.FileNameExtensionFilter;

/**
 *
 * @author Israel
 */
public class Guardar {
    
    private File fichero;
    private LinkedList textoArea = new LinkedList();
    
    public Guardar(JTextArea jTextArea1 ){
        
        BufferedWriter writer; //Para escribir en el fichero

        if (fichero == null) {
            //Activamos el filtro para que nos muestre, por defecto, los archivos de texto
            FileNameExtensionFilter filtro = new FileNameExtensionFilter("Archivos de texto", "uxm");
            JFileChooser fileChooserGuardar = new JFileChooser();
            fileChooserGuardar.setFileFilter(filtro);
            fileChooserGuardar.setDialogTitle("Guardar");
            int seleccion = fileChooserGuardar.showSaveDialog(jTextArea1);

            if (seleccion == JFileChooser.APPROVE_OPTION) {
                fichero = fileChooserGuardar.getSelectedFile();
                fileChooserGuardar.setFileSelectionMode(JFileChooser.FILES_ONLY);
                try {
                    textoArea.add(jTextArea1.getText());
                    writer = new BufferedWriter(new FileWriter(fichero + ".uxm")); // Ponemos .txt para darle extension al archivo que creamos
                    while (!textoArea.isEmpty()) {
                        writer.write(textoArea.poll().toString());
                        writer.newLine();
                    }
                    writer.flush();
                    writer.close();
                } catch (IOException e) {
                    JOptionPane.showMessageDialog(jTextArea1, " A Error al guardar el archivo", "Error guardar archivo", JOptionPane.ERROR_MESSAGE);
                }

                JOptionPane.showMessageDialog(jTextArea1, "B El fichero de texto se ha guardado correctamente con los datos introducidos");
            }
        } else if (!(fichero == null)) // Añadimos al fichero existente
        {
            try {
                writer = new BufferedWriter(new FileWriter(fichero, true));
                while (!textoArea.isEmpty()) {
                    writer.write(textoArea.poll().toString());
                    writer.newLine();
                }
                writer.flush();
                writer.close();
            } catch (IOException e) {
                JOptionPane.showMessageDialog(jTextArea1, "C Error al guardar el archivo", "Error guardar archivo", JOptionPane.ERROR_MESSAGE);
            }
            JOptionPane.showMessageDialog(jTextArea1, "E El fichero de texto se ha guardado correctamente con los datos introducidos");
        } else {
            JOptionPane.showMessageDialog(jTextArea1, "F ERROR: Error al guardar", "Mensaje de Error", JOptionPane.ERROR_MESSAGE);
        }
    
    }
    public void guardarInterprete(){
       /*  try {
            file = new FileWriter(FilePath+".java", !false);
            writer = new BufferedWriter(file);
            writer.write(FileContent, 0, FileContent.length());
            writer.close();
            file.close();
        } catch (IOException e) {
            JOptionPane.showMessageDialog(null, "Error al guardar el archivo", "Error guardar archivo", JOptionPane.ERROR_MESSAGE);
        }*/
    }
}
