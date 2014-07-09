/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package uxmal;

import java.awt.Color;
import java.util.ArrayList;
import javax.swing.JFrame;
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
import principal.Uxmal;

/** @author Israel */

public class AnalizadorSemantico {
    
    private ArrayList<Instruccion> instrucciones;
    private ArrayList<GeneracionCodigo> codigoIntermedio;
    private DefaultPieDataset data = new DefaultPieDataset();
    private DefaultCategoryDataset dataset = new DefaultCategoryDataset();
    private DefaultCategoryDataset line_chart_dataset= new DefaultCategoryDataset();
    private String codigoGenerado="";
    public JPanel panel=null;
        
    public AnalizadorSemantico(AnalizadorCup parser){
        
        try{
            
            parser.parse();
        }catch(java.lang.Exception el){
            JOptionPane.showMessageDialog(null, el);
        }
        this.instrucciones=parser.getInstrucciones();
    }
    
    public void generaGrafica(JFrame frame){
        
        codigoGenerado+="import java.awt.Color;import javax.swing.*;";
        codigoGenerado+="import org.jfree.chart.*;";
        codigoGenerado+="import org.jfree.data.general.DefaultPieDataset;import org.jfree.chart.plot.PiePlot3D;import org.jfree.util.Rotation;";
        codigoGenerado+="import org.jfree.chart.plot.CategoryPlot;";
        codigoGenerado+="import org.jfree.data.category.DefaultCategoryDataset;";
        codigoGenerado+="import org.jfree.chart.plot.PiePlot3D;";
        codigoGenerado+="import org.jfree.chart.plot.PlotOrientation;";
        
        GeneracionCodigo generacionCodigo= new GeneracionCodigo();
        
        generacionCodigo.setRutaDocumento(frame);
        codigoGenerado+="public class "+generacionCodigo.nombre+" extends JFrame{";
        codigoGenerado+="JPanel panel;";
        codigoGenerado+= "public "+generacionCodigo.nombre+"(){";
        codigoGenerado+="setTitle(\"Como Hacer Graficos con Java\");";
        codigoGenerado+="setSize(800,600);";
        codigoGenerado+="setLocationRelativeTo(null);";
        codigoGenerado+="setDefaultCloseOperation(EXIT_ON_CLOSE);";
        codigoGenerado+="setVisible(true);";
        codigoGenerado+="init();}";
        
        codigoGenerado+="private void init() {";
        codigoGenerado+="panel = new JPanel();";
        codigoGenerado+= "getContentPane().add(panel);";
        // Fuente de Datos
        codigoGenerado+="DefaultPieDataset data = new DefaultPieDataset();";
        codigoGenerado+="DefaultCategoryDataset dataset = new DefaultCategoryDataset();";
        
        //frame.setSize(720,720);
        frame.getContentPane().repaint();
        data=null;
        dataset=null;
        line_chart_dataset=null;
        data = new DefaultPieDataset();
        dataset = new DefaultCategoryDataset();
        line_chart_dataset= new DefaultCategoryDataset();
        frame.getContentPane().add(panel);
        frame.getContentPane().revalidate();
       
        // Fuente de Datos
       
        for(int i=0; i<instrucciones.size(); i++) {
            dibujarGrafica(instrucciones.get(i), panel);
        }
        codigoGenerado+="  }";
        codigoGenerado+="public static void main(String[] args) {";
        codigoGenerado+="new "+generacionCodigo.nombre+"().setVisible(true);";
        codigoGenerado+= "}";
        codigoGenerado+="}";
    }
     
    private void dibujarGrafica(Instruccion instruccion, JPanel panel){
       // JOptionPane.showMessageDialog(null,"tamaño de instrucciones");
        switch(instruccion.getTipoGrafica()){
            
            case "pastel":
                //JOptionPane.showMessageDialog(null, instruccion.getInstruccion());
                    switch(instruccion.getInstruccion()){
           
                      case "agregar":
     
                        codigoGenerado+="data.setValue(\""+instruccion.getTexto1()+"\","+ instruccion.getNumero()+");";
                        break;
                          
                       case "titulo":
                          //JOptionPane.showMessageDialog(null,instruccion.getTexto1()+"--"+instruccion.getNumero());
                           codigoGenerado+="JFreeChart chart = ChartFactory.createPieChart(\"";
                           codigoGenerado+= instruccion.getTitulo()+"\",";          
                           codigoGenerado+="data,"; 
                           codigoGenerado+= "true,";  
                           codigoGenerado+= "true,"; 
                           codigoGenerado+= "false);"; 
                           codigoGenerado+="ChartPanel chartPanel = new ChartPanel(chart);";
                           codigoGenerado+="panel.add(chartPanel,java.awt.BorderLayout.SOUTH);";          
                           break;
                    }        
                break;
                
            case "barras3d":
                    switch(instruccion.getInstruccion()){
                      case "agregar":     
                          
                        codigoGenerado+="dataset.setValue("+instruccion.getNumero()+",\""+ instruccion.getTexto1()+"\",\""+ instruccion.getTexto2()+"\");";
                        break;
                          
                       case "titulo":     
                           codigoGenerado+="JFreeChart chart = ChartFactory.createBarChart3D";
                                        
                           codigoGenerado+="(\""+instruccion.getTitulo()+"\",\""+instruccion.getNombreGrupo()+"\",\""+instruccion.getNombreValor()+"\","; 
                                
                          codigoGenerado+= "dataset, PlotOrientation.VERTICAL, true,true, false);";
                          codigoGenerado+= "chart.getTitle().setPaint(Color.black); ";
                          codigoGenerado+= "CategoryPlot p = chart.getCategoryPlot(); ";
                          codigoGenerado+= "p.setRangeGridlinePaint(Color.red); ";
                          codigoGenerado+= "ChartPanel chartPanel = new ChartPanel(chart);";
                          codigoGenerado+= "panel.add(chartPanel);";
                          break;
                    }
                break;
                
            case "pastel3d":
                    switch(instruccion.getInstruccion()){
                      case "agregar":     
                        codigoGenerado+="data.setValue(\""+instruccion.getTexto1()+"\",new Double("+instruccion.getNombreValord()+"));";
                        break;
                          
                       case "titulo":     
                          codigoGenerado+="JFreeChart chart = ChartFactory.createPieChart3D(\""+instruccion.getTitulo()+"\", data, true, true, false);";
                          codigoGenerado+="PiePlot3D pieplot3d = (PiePlot3D)chart.getPlot();"; 
                          codigoGenerado+="pieplot3d.setDepthFactor(0.5);";
                          codigoGenerado+="pieplot3d.setStartAngle(290D);";
                          codigoGenerado+="pieplot3d.setDirection(Rotation.CLOCKWISE);";
                          codigoGenerado+="pieplot3d.setForegroundAlpha(0.5F);";

                            // Mostrar Grafico
                          codigoGenerado+="  ChartPanel chartPanel = new ChartPanel(chart);";
                          codigoGenerado+="  panel.add(chartPanel);";
                          break;
                    }
                
                break;
                
            case "lineal":
                    switch(instruccion.getInstruccion()){
                      case "agregar":     
                       codigoGenerado+="dataset.addValue("+instruccion.getNumero()+",\""+ instruccion.getTexto1()+"\",\""+ instruccion.getTexto2()+"\");";
                       break;
                          
                       case "titulo":     
                         codigoGenerado+="JFreeChart chart=ChartFactory.createLineChart(\""+instruccion.getTitulo()+"\",\"";
                         codigoGenerado+=  instruccion.getTexto1()+"\",\""+instruccion.getTexto2()+"\",dataset,PlotOrientation.VERTICAL,";
                         codigoGenerado+=" true,true,false);  ";
                            // Mostrar Grafico
                         codigoGenerado+= "ChartPanel chartPanel = new ChartPanel(chart);";
                         codigoGenerado+=  "panel.add(chartPanel);";
                                        }
                
                break;
        }
    }
    
    public String getCodigoGenerado(){
        return codigoGenerado;
    
    }
    
    public void codigoGeneradoRemove(){
        codigoGenerado="";
    }

    
}
