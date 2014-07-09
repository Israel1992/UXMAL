/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package archivos;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.JTextArea;
import javax.swing.filechooser.FileNameExtensionFilter;

/**
 *
 * @author Israel
 */
public class Abrir {
    public Abrir(JTextArea jTextArea1){
          FileNameExtensionFilter filtro = new FileNameExtensionFilter("probandoAndo", "uxm");
        JFileChooser fileChooserCargar = new JFileChooser();
        fileChooserCargar.setFileFilter(filtro);
        fileChooserCargar.setDialogTitle("Abrir");
        int seleccion = fileChooserCargar.showOpenDialog(jTextArea1);

        if (seleccion == JFileChooser.APPROVE_OPTION) {
            File file = fileChooserCargar.getSelectedFile();
            Boolean encontrado = false; // Para saber si hemos encontrado el sitio que buscabamos
            try {
                BufferedReader reader = new BufferedReader(new FileReader(file));  // Cargamos el fichero
                String linea = reader.readLine(); // leemos la primera linea
                if (linea == null) {
                    JOptionPane.showMessageDialog(jTextArea1, "El fichero está vacío", "Fichero vacío", JOptionPane.INFORMATION_MESSAGE);
                } else {
                    jTextArea1.setText("");
                    do {
                       
                        if(linea != null){
                        jTextArea1.append(linea+"\n");
                        }
                         linea = reader.readLine(); // leemos la siguiente línea
                        // JOptionPane.showMessageDialog(null, "HOLA SI ENTRO"+linea);
                    } while (linea != null);  
                    //JOptionPane.showMessageDialog(this, jTextArea1.getSize());
                    //jTextArea1.remove(HEIGHT);
                }

                reader.close();// Cerramos el fichero

            } catch (IOException ex) {
                //Logger.getLogger(Consultar.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    
    }
}
