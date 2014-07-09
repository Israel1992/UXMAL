
package principal;

import archivos.*;
import java.awt.Color;
import java.awt.Image;
import java.awt.Toolkit;
import java.io.StringReader;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import org.jfree.chart.ChartFactory;
import org.jfree.chart.ChartPanel;
import org.jfree.chart.JFreeChart;
import org.jfree.chart.plot.CategoryPlot;
import org.jfree.chart.plot.PiePlot3D;
import org.jfree.chart.plot.PlotOrientation;
import org.jfree.data.category.DefaultCategoryDataset;
import org.jfree.data.general.DefaultPieDataset;
import org.jfree.util.Rotation;
import uxmal.*;

public class Uxmal extends javax.swing.JFrame {
    private JPanel panel=null;
    private javax.swing.JScrollPane ScrollTexto;
    
    public static javax.swing.JTextArea AreaDeTexto;

    public Uxmal() {
        initComponents();
        ScrollTexto = new javax.swing.JScrollPane();
        AreaDeTexto = new javax.swing.JTextArea();
        AreaDeTexto.setColumns(20);
        AreaDeTexto.setRows(5);
        AreaDeTexto.setBackground(Color.black);
        AreaDeTexto.setForeground(Color.white);
        AreaDeTexto.setFont(new java.awt.Font("Consolas", 0, 11));
        ScrollTexto.setViewportView(AreaDeTexto);
        jPanel3.add(ScrollTexto);  
    }
    public void setTerminal(String errores) {
      AreaDeTexto.setText(errores);

    }
   @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        jInternalFrame1 = new javax.swing.JInternalFrame();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();
        jPanel2 = new javax.swing.JPanel();
        jToolBar1 = new javax.swing.JToolBar();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jToolBar2 = new javax.swing.JToolBar();
        Esqueletos = new javax.swing.JLabel();
        jButton4 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        jButton6 = new javax.swing.JButton();
        jButton7 = new javax.swing.JButton();
        jPanel4 = new javax.swing.JPanel();
        jRadioButton1 = new javax.swing.JRadioButton();
        jRadioButton2 = new javax.swing.JRadioButton();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMenuItem1 = new javax.swing.JMenuItem();
        jMenuItem3 = new javax.swing.JMenuItem();
        jMenu3 = new javax.swing.JMenu();
        jMenuItem5 = new javax.swing.JMenuItem();
        jMenuItem6 = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Uxmal IDE alfa");
        setIconImage(getIconImage());
        setMaximumSize(new java.awt.Dimension(700, 690));
        setMinimumSize(new java.awt.Dimension(500, 78));
        getContentPane().setLayout(new javax.swing.BoxLayout(getContentPane(), javax.swing.BoxLayout.Y_AXIS));

        jPanel1.setLayout(new java.awt.BorderLayout());

        jPanel3.setLayout(new javax.swing.BoxLayout(jPanel3, javax.swing.BoxLayout.LINE_AXIS));

        jInternalFrame1.setResizable(true);
        jInternalFrame1.setVisible(false);

        javax.swing.GroupLayout jInternalFrame1Layout = new javax.swing.GroupLayout(jInternalFrame1.getContentPane());
        jInternalFrame1.getContentPane().setLayout(jInternalFrame1Layout);
        jInternalFrame1Layout.setHorizontalGroup(
            jInternalFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        jInternalFrame1Layout.setVerticalGroup(
            jInternalFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        jPanel3.add(jInternalFrame1);

        jTextArea1.setColumns(20);
        jTextArea1.setForeground(new java.awt.Color(51, 51, 51));
        jTextArea1.setRows(10);
        jScrollPane1.setViewportView(jTextArea1);

        jPanel3.add(jScrollPane1);

        jPanel1.add(jPanel3, java.awt.BorderLayout.CENTER);

        jPanel2.setLayout(new javax.swing.BoxLayout(jPanel2, javax.swing.BoxLayout.LINE_AXIS));
        jPanel1.add(jPanel2, java.awt.BorderLayout.LINE_END);

        getContentPane().add(jPanel1);

        jToolBar1.setRollover(true);

        jButton1.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/uxmal/images/iconos/abrir.png"))); // NOI18N
        jButton1.setText("Abrir");
        jButton1.setFocusable(false);
        jButton1.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButton1.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jToolBar1.add(jButton1);

        jButton2.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
        jButton2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/uxmal/images/iconos/guardar.png"))); // NOI18N
        jButton2.setText("Guardar");
        jButton2.setFocusable(false);
        jButton2.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButton2.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jToolBar1.add(jButton2);

        jButton3.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
        jButton3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/uxmal/images/iconos/play.png"))); // NOI18N
        jButton3.setText("Iniciar");
        jButton3.setFocusable(false);
        jButton3.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButton3.setMaximumSize(new java.awt.Dimension(35, 50));
        jButton3.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jButton3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                iniciar(evt);
            }
        });
        jToolBar1.add(jButton3);

        jToolBar2.setRollover(true);

        Esqueletos.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        Esqueletos.setText(" Esqueletos: ");
        jToolBar2.add(Esqueletos);

        jButton4.setText("Barras3D");
        jButton4.setFocusable(false);
        jButton4.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButton4.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jButton4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                barras3d(evt);
            }
        });
        jToolBar2.add(jButton4);

        jButton5.setText("Pastel3D");
        jButton5.setFocusable(false);
        jButton5.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButton5.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });
        jToolBar2.add(jButton5);

        jButton6.setText("Pastel");
        jButton6.setFocusable(false);
        jButton6.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButton6.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });
        jToolBar2.add(jButton6);

        jButton7.setText("Lineal");
        jButton7.setFocusable(false);
        jButton7.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButton7.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jButton7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton7ActionPerformed(evt);
            }
        });
        jToolBar2.add(jButton7);

        jToolBar1.add(jToolBar2);

        jRadioButton1.setText("Interprete");
        jRadioButton1.setName("interprete"); // NOI18N
        jRadioButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButton1ActionPerformed(evt);
            }
        });

        jRadioButton2.setText("Compilador");
        jRadioButton2.setName("compilador"); // NOI18N
        jRadioButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButton2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jRadioButton2)
                    .addComponent(jRadioButton1))
                .addContainerGap())
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                .addContainerGap(17, Short.MAX_VALUE)
                .addComponent(jRadioButton1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jRadioButton2))
        );

        jToolBar1.add(jPanel4);

        getContentPane().add(jToolBar1);

        jMenu1.setText("Archivo");

        jMenuItem1.setText("Abrir");
        jMenuItem1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem1ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem1);

        jMenuItem3.setText("Guardar como");
        jMenuItem3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem3ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem3);

        jMenuBar1.add(jMenu1);

        jMenu3.setText("Acerca");

        jMenuItem5.setText("Vercion");
        jMenuItem5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem5ActionPerformed(evt);
            }
        });
        jMenu3.add(jMenuItem5);

        jMenuItem6.setText("Creditos");
        jMenu3.add(jMenuItem6);

        jMenuBar1.add(jMenu3);

        setJMenuBar(jMenuBar1);

        pack();
    }// </editor-fold>//GEN-END:initComponents
  
    public javax.swing.JTextArea textArea(){
    return AreaDeTexto;
    }
    
    private void iniciar(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_iniciar
        StringReader reader = new StringReader(jTextArea1.getText());
        AnalizadorLexico lex = new AnalizadorLexico(reader);
        AnalizadorCup parser = new AnalizadorCup(lex); 
        
       if(jRadioButton1.isSelected() && jRadioButton2.isSelected()){
            //COMPILADOR---------------------------------------------------------
                AnalizadorSemantico semanticoCompilado = new AnalizadorSemantico(parser);
                GeneracionCodigo generacion= new GeneracionCodigo();

                try{
                   if(panel!=null){
                    getContentPane().remove(panel);
                   }
                   semanticoCompilado.panel= new JPanel();
                   panel=semanticoCompilado.panel;
                   semanticoCompilado.generaGrafica(this);
                   generacion.setInstruccion(semanticoCompilado.getCodigoGenerado());
                   semanticoCompilado.codigoGeneradoRemove();
                   jInternalFrame1.setTitle("Grafica");
                   jInternalFrame1.setVisible(false);
                   jInternalFrame1.setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

                }
                catch (java.lang.Exception el)
                {
                    System.out.print("error encontrado: "+el.getMessage());

                }
                
           
            //IMTERPRETE---------------------------------------------------------
            reader = new StringReader(jTextArea1.getText());
            lex = new AnalizadorLexico(reader);
            parser = new AnalizadorCup(lex); 
            InterpreteSemantico semantico = new InterpreteSemantico(parser);
                   try{
                      if(panel!=null){
                       getContentPane().remove(panel);
                      }
                      semantico.panel= new JPanel();
                      panel=semantico.panel;
                      semantico.generaGrafica(this);
                      jInternalFrame1.setTitle("Grafica");
                      jInternalFrame1.setVisible(false);
                      jInternalFrame1.setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
                   }
                   catch (java.lang.Exception el)
                   {
                       System.out.print("error encontrado: "+el.getMessage());
                   }
                   lex=null;
                   AnalizadorLexico.simbolos=new ArrayList(); 

   
        
       }else if(jRadioButton1.isSelected()){
           InterpreteSemantico semantico = new InterpreteSemantico(parser);
                try{
                   if(panel!=null){
                    getContentPane().remove(panel);
                   }
                   semantico.panel= new JPanel();
                   panel=semantico.panel;
                   semantico.generaGrafica(this);
                   jInternalFrame1.setTitle("Grafica");
                   jInternalFrame1.setVisible(false);
                   jInternalFrame1.setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
                }
                catch (java.lang.Exception el)
                {
                    System.out.print("error encontrado: "+el.getMessage());
                }
                lex=null;
                AnalizadorLexico.simbolos=new ArrayList();  
      }else if(jRadioButton2.isSelected()){
                AnalizadorSemantico semantico = new AnalizadorSemantico(parser);
                GeneracionCodigo generacion= new GeneracionCodigo();

                try{
                   if(panel!=null){
                    getContentPane().remove(panel);
                   }
                   semantico.panel= new JPanel();
                   panel=semantico.panel;
                  
                   semantico.generaGrafica(this);
                   generacion.setInstruccion(semantico.getCodigoGenerado());
                   semantico.codigoGeneradoRemove();
                   jInternalFrame1.setTitle("Grafica");
                   jInternalFrame1.setVisible(false);
                   jInternalFrame1.setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

                }
                catch (java.lang.Exception el)
                {
                    System.out.print("error encontrado: 2 "+el.getMessage());

                }
                lex=null;
                AnalizadorLexico.simbolos=new ArrayList();    
        }
            
    }//GEN-LAST:event_iniciar

    private void barras3d(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_barras3d
        
        String esqueleto_barras3d= "inicio\n"+
        "grafica_barras3d.datos{\n"+
        "agregar(8, \"Mujeres\", \"Lunes\");\n"+
        "agregar(7, \"Hombres\", \"Lunes\");\n"+
        "agregar(9, \"Mujeres\", \"Martes\");\n"+
        "agregar(4, \"Hombres\", \"Martes\");\n"+
        "agregar(4, \"Mujeres\", \"Miercoles\");\n"+
        "agregar(5, \"Hombres\", \"Miercoles\");\n"+
        "agregar(8, \"Mujeres\", \"Jueves\");\n"+
        "agregar(9, \"Hombres\", \"Jueves\");\n"+
        "agregar(7, \"Mujeres\", \"Viernes\");\n"+
        "agregar(8, \"Hombres\", \"Viernes\");\n"+
        "}\n"+
        "titulo(\"Barras\",\"Genero\",\"Dias\");\n"+
        "fin";
        jTextArea1.setText(esqueleto_barras3d);
        
    }//GEN-LAST:event_barras3d

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        String esqueleto_pastel3d= "inicio\n"+
        "grafica_pastel3d.datos{\n"+
        "agregar(\"Programacion\",41);\n"+
        "agregar(\"Electronica\",11);\n"+
        "agregar(\"Hacking\",19);\n"+
        "agregar(\"SEO\",30);\n"+
        "agregar(\"Redes\",2);\n"+
        "}\n"+
        "titulo(\"PastelTresD\");\n"+
        "fin";
        jTextArea1.setText(esqueleto_pastel3d);
    }//GEN-LAST:event_jButton5ActionPerformed

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
        String esqueleto_pastel= "inicio\n"+
        "grafica_pastel.datos{\n"+
        "agregar(\"C\",40);\n"+
        "agregar(\"Java\",45);\n"+
        "agregar(\"Python\",15);\n"+
        "}\n"+
        "titulo(\"Pastel\");\n"+
        "fin";
        jTextArea1.setText(esqueleto_pastel);
    }//GEN-LAST:event_jButton6ActionPerformed

    private void jButton7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton7ActionPerformed
        String esqueleto_lineal= "inicio\n"+
        "grafica_lineal.datos{\n"+
        "agregar(80, \"Visitas\", \"Julio\");\n"+
        "agregar(300, \"Visitas\", \"Agosto\");\n"+
        "agregar(600, \"Visitas\", \"Septiembre\");\n"+
        "agregar(1200, \"Visitas\", \"Octubre\");\n"+
        "agregar(2400, \"Visitas\", \"Noviembre\");\n"+
        "}\n"+
        "titulo(\"Lineal\",\"Mes\",\"Visitas\");\n"+
        "fin";
        jTextArea1.setText(esqueleto_lineal);
    }//GEN-LAST:event_jButton7ActionPerformed

    private void jMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem1ActionPerformed
      Abrir abrir=new Abrir(jTextArea1);
    }//GEN-LAST:event_jMenuItem1ActionPerformed

    private void jMenuItem5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem5ActionPerformed
        vercion vercion = new vercion();
        vercion.setVisible(true);
        vercion.setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
    }//GEN-LAST:event_jMenuItem5ActionPerformed

    private void jMenuItem3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem3ActionPerformed
       Guardar guardar=new Guardar(jTextArea1);
    }//GEN-LAST:event_jMenuItem3ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        Guardar guardar=new Guardar(jTextArea1);
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        Abrir abrir=new Abrir(jTextArea1);
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jRadioButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButton1ActionPerformed
      
    }//GEN-LAST:event_jRadioButton1ActionPerformed

    private void jRadioButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButton2ActionPerformed

    }//GEN-LAST:event_jRadioButton2ActionPerformed

    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Uxmal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Uxmal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Uxmal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Uxmal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Uxmal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Esqueletos;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JButton jButton7;
    private javax.swing.JInternalFrame jInternalFrame1;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItem3;
    private javax.swing.JMenuItem jMenuItem5;
    private javax.swing.JMenuItem jMenuItem6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JRadioButton jRadioButton1;
    private javax.swing.JRadioButton jRadioButton2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextArea jTextArea1;
    private javax.swing.JToolBar jToolBar1;
    private javax.swing.JToolBar jToolBar2;
    // End of variables declaration//GEN-END:variables
    
//***********************Codigo de la clase interna************************//
    private void getImage() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    @Override
    public Image getIconImage() {
       Image retValue = Toolkit.getDefaultToolkit().
             getImage(ClassLoader.getSystemResource("uxmal.png"));

        
       return retValue;
    }
   
}
