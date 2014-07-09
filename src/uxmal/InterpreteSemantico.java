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

public class InterpreteSemantico {
    
    private ArrayList<Instruccion> instrucciones;
    private DefaultPieDataset data = new DefaultPieDataset();
    private DefaultCategoryDataset dataset = new DefaultCategoryDataset();
    private DefaultCategoryDataset line_chart_dataset= new DefaultCategoryDataset();
    public JPanel panel=null;
        
    public InterpreteSemantico(AnalizadorCup parser){
        
        try{
            
            parser.parse();
        }catch(java.lang.Exception el){
            JOptionPane.showMessageDialog(null, el);
        }
        this.instrucciones=parser.getInstrucciones();
    }
    
    public void generaGrafica(JFrame frame){
        
        frame.setSize(720,720);
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
        
    }
     
    private void dibujarGrafica(Instruccion instruccion, JPanel panel){
       // JOptionPane.showMessageDialog(null,"tamaño de instrucciones");
        switch(instruccion.getTipoGrafica()){
            
            case "pastel":
                //JOptionPane.showMessageDialog(null, instruccion.getInstruccion());
                    switch(instruccion.getInstruccion()){
           
                      case "agregar":
     
                         data.setValue(instruccion.getTexto1(), instruccion.getNumero());
                          break;
                          
                       case "titulo":
                          //JOptionPane.showMessageDialog(null,instruccion.getTexto1()+"--"+instruccion.getNumero());
                          JFreeChart chart = ChartFactory.createPieChart(
                            instruccion.getTitulo(),          
                            data, 
                            true, 
                            true, 
                            false);
                            ChartPanel chartPanel = new ChartPanel(chart); 
                            panel.add(chartPanel,java.awt.BorderLayout.SOUTH);          
                          break;
                    }        
                break;
                
            case "barras3d":
                    switch(instruccion.getInstruccion()){
                      case "agregar":     
                          
                            dataset.setValue(instruccion.getNumero(), instruccion.getTexto1(), instruccion.getTexto2());
                         break;
                          
                       case "titulo":     
                           JFreeChart chart = ChartFactory.createBarChart3D
                                        
                                (instruccion.getTitulo(),instruccion.getNombreGrupo(), instruccion.getNombreValor(), 
                                
                                dataset, PlotOrientation.VERTICAL, true,true, false);
                                //chart.setBackgroundPaint(Color.CYAN);
                                chart.getTitle().setPaint(Color.black); 
                                CategoryPlot p = chart.getCategoryPlot(); 
                                p.setRangeGridlinePaint(Color.red); 
                                // Mostrar Grafico
                                ChartPanel chartPanel = new ChartPanel(chart);
                                panel.add(chartPanel);
                           break;
                    }
                break;
                
            case "pastel3d":
                    switch(instruccion.getInstruccion()){
                      case "agregar":     
                           

                            data.setValue(instruccion.getTexto1(),new Double(instruccion.getNombreValord()));
                         break;
                          
                       case "titulo":     
                          JFreeChart chart = ChartFactory.createPieChart3D(instruccion.getTitulo(), data, true, true, false); 
                            PiePlot3D pieplot3d = (PiePlot3D)chart.getPlot(); 
                            pieplot3d.setDepthFactor(0.5); 
                            pieplot3d.setStartAngle(290D); 
                            pieplot3d.setDirection(Rotation.CLOCKWISE); 
                            pieplot3d.setForegroundAlpha(0.5F); 

                            // Mostrar Grafico
                            ChartPanel chartPanel = new ChartPanel(chart);
                            panel.add(chartPanel);
                           break;
                    }
                
                break;
                
            case "lineal":
                    switch(instruccion.getInstruccion()){
                      case "agregar":     
                          line_chart_dataset.addValue(instruccion.getNumero(), instruccion.getTexto1(), instruccion.getTexto2());
                        break;
                          
                       case "titulo":     
                          JFreeChart chart=ChartFactory.createLineChart(instruccion.getTitulo(),
                           instruccion.getTexto1(),instruccion.getTexto2(),line_chart_dataset,PlotOrientation.VERTICAL,
                           true,true,false);  

                            // Mostrar Grafico
                            ChartPanel chartPanel = new ChartPanel(chart);
                            panel.add(chartPanel);
                                        }
                
                break;
        }
    }
}
