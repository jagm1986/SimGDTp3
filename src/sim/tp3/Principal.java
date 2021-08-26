
package sim.tp3;

import java.awt.Color;
import java.util.ArrayList;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import org.jfree.chart.ChartFactory;
import org.jfree.chart.ChartFrame;
import org.jfree.chart.JFreeChart;
import org.jfree.chart.plot.CategoryPlot;
import org.jfree.chart.plot.PlotOrientation;
import org.jfree.data.category.DefaultCategoryDataset;


public class Principal extends javax.swing.JFrame {

   
    private final ManejadorIntervalos manejador;
    
    public Principal() 
    {
        initComponents();
       
        manejador = new ManejadorIntervalos();
        this.setLocationRelativeTo(null);
        rdPoisson.setVisible(true);
        txtLambdaPoisson.setVisible(true);
        
        tablaNumeros.setAutoCreateRowSorter(true);
    }

   private void limpiarTextBox()
   {
     txtA.setText("");
     txtB.setText("");
     txtLambdaExp.setText("");
     txtLambdaPoisson.setText("");
     txtMedia.setText("");
     txtDesviacion.setText("");
    
   }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        grupoRdDistribuciones = new javax.swing.ButtonGroup();
        grupoCantidadIntervalos = new javax.swing.ButtonGroup();
        panel = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        rdUniforme = new javax.swing.JRadioButton();
        rdExponencial = new javax.swing.JRadioButton();
        rdPoisson = new javax.swing.JRadioButton();
        rdNormal = new javax.swing.JRadioButton();
        jLabel2 = new javax.swing.JLabel();
        txtLambdaExp = new javax.swing.JTextField();
        lblA = new javax.swing.JLabel();
        txtB = new javax.swing.JTextField();
        lblB = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        txtA = new javax.swing.JTextField();
        txtLambdaPoisson = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        txtDesviacion = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        txtN = new javax.swing.JTextField();
        rd10 = new javax.swing.JRadioButton();
        rd20 = new javax.swing.JRadioButton();
        rd15 = new javax.swing.JRadioButton();
        jLabel12 = new javax.swing.JLabel();
        txtMedia = new javax.swing.JTextField();
        jLabel13 = new javax.swing.JLabel();
        btnGenerar = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tabla = new javax.swing.JTable();
        btnGraficar = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        tablaNumeros = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        panel.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));

        jLabel1.setFont(new java.awt.Font("Cambria", 3, 18)); // NOI18N
        jLabel1.setText("Seleccione una distribución ");

        grupoRdDistribuciones.add(rdUniforme);
        rdUniforme.setSelected(true);
        rdUniforme.setText("Uniforme");
        rdUniforme.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rdUniformeActionPerformed(evt);
            }
        });

        grupoRdDistribuciones.add(rdExponencial);
        rdExponencial.setText("Exponencial");
        rdExponencial.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rdExponencialActionPerformed(evt);
            }
        });

        grupoRdDistribuciones.add(rdPoisson);
        rdPoisson.setText("Poisson");
        rdPoisson.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rdPoissonActionPerformed(evt);
            }
        });

        grupoRdDistribuciones.add(rdNormal);
        rdNormal.setText("Normal");
        rdNormal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rdNormalActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Cambria", 3, 14)); // NOI18N
        jLabel2.setText("Uniforme");

        txtLambdaExp.setEnabled(false);

        lblA.setFont(new java.awt.Font("Cambria", 3, 14)); // NOI18N
        lblA.setText("A");

        lblB.setFont(new java.awt.Font("Cambria", 3, 14)); // NOI18N
        lblB.setText("B");

        jLabel5.setFont(new java.awt.Font("Cambria", 3, 14)); // NOI18N
        jLabel5.setText("Exponencial");

        jLabel6.setFont(new java.awt.Font("Cambria", 3, 18)); // NOI18N
        jLabel6.setText("λ");

        txtLambdaPoisson.setEnabled(false);

        jLabel9.setFont(new java.awt.Font("Cambria", 3, 14)); // NOI18N
        jLabel9.setText("Normal");

        jLabel10.setFont(new java.awt.Font("Cambria", 3, 18)); // NOI18N
        jLabel10.setText("σ");

        txtDesviacion.setEnabled(false);

        jLabel11.setFont(new java.awt.Font("Cambria", 3, 18)); // NOI18N
        jLabel11.setText("μ");

        txtN.setText("5000");

        grupoCantidadIntervalos.add(rd10);
        rd10.setSelected(true);
        rd10.setText("10");

        grupoCantidadIntervalos.add(rd20);
        rd20.setText("20");

        grupoCantidadIntervalos.add(rd15);
        rd15.setText("15");

        jLabel12.setFont(new java.awt.Font("Cambria", 3, 14)); // NOI18N
        jLabel12.setText("Seleccione la cantidad de intervalos");

        txtMedia.setEnabled(false);

        jLabel13.setFont(new java.awt.Font("Cambria", 3, 18)); // NOI18N
        jLabel13.setText("N");

        btnGenerar.setText("Generar");
        btnGenerar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGenerarActionPerformed(evt);
            }
        });

        tabla.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane1.setViewportView(tabla);

        btnGraficar.setText("Graficar");
        btnGraficar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGraficarActionPerformed(evt);
            }
        });

        jScrollPane2.setViewportView(tablaNumeros);

        javax.swing.GroupLayout panelLayout = new javax.swing.GroupLayout(panel);
        panel.setLayout(panelLayout);
        panelLayout.setHorizontalGroup(
            panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelLayout.createSequentialGroup()
                .addGroup(panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelLayout.createSequentialGroup()
                        .addGap(335, 335, 335)
                        .addComponent(btnGraficar, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addGroup(panelLayout.createSequentialGroup()
                            .addGroup(panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(panelLayout.createSequentialGroup()
                                    .addGap(15, 15, 15)
                                    .addComponent(rdUniforme)
                                    .addGap(18, 18, 18)
                                    .addComponent(rdExponencial)
                                    .addGap(33, 33, 33)
                                    .addComponent(rdPoisson)
                                    .addGap(18, 18, 18)
                                    .addComponent(rdNormal))
                                .addGroup(panelLayout.createSequentialGroup()
                                    .addGap(32, 32, 32)
                                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 326, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(panelLayout.createSequentialGroup()
                                    .addContainerGap()
                                    .addGroup(panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 326, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addGroup(panelLayout.createSequentialGroup()
                                                .addGroup(panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                    .addGroup(panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                                        .addGroup(panelLayout.createSequentialGroup()
                                                            .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                            .addComponent(lblA, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                        .addGroup(panelLayout.createSequentialGroup()
                                                            .addComponent(jLabel5)
                                                            .addGap(39, 39, 39)
                                                            .addGroup(panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                                .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE))))
                                                    .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                .addGap(18, 18, 18)
                                                .addGroup(panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                    .addComponent(txtLambdaExp, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                    .addGroup(panelLayout.createSequentialGroup()
                                                        .addComponent(txtA, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addGap(18, 18, 18)
                                                        .addComponent(lblB, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addGap(18, 18, 18)
                                                        .addComponent(txtB, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                    .addComponent(txtLambdaPoisson, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                    .addGroup(panelLayout.createSequentialGroup()
                                                        .addComponent(txtMedia, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addGap(18, 18, 18)
                                                        .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addGap(18, 18, 18)
                                                        .addComponent(txtDesviacion, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                                        .addGroup(panelLayout.createSequentialGroup()
                                            .addGroup(panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addGroup(panelLayout.createSequentialGroup()
                                                    .addComponent(rd10)
                                                    .addGap(43, 43, 43)
                                                    .addComponent(rd15)
                                                    .addGap(36, 36, 36))
                                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelLayout.createSequentialGroup()
                                                    .addComponent(btnGenerar, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)))
                                            .addGroup(panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addComponent(rd20)
                                                .addGroup(panelLayout.createSequentialGroup()
                                                    .addGap(47, 47, 47)
                                                    .addComponent(jLabel13, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                    .addComponent(txtN, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)))))))
                            .addGap(36, 36, 36)
                            .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 812, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(31, Short.MAX_VALUE))
        );
        panelLayout.setVerticalGroup(
            panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelLayout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(rdUniforme)
                            .addComponent(rdExponencial)
                            .addComponent(rdPoisson)
                            .addComponent(rdNormal))
                        .addGap(18, 18, 18)
                        .addGroup(panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(lblA)
                            .addComponent(txtB, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblB)
                            .addComponent(txtA, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel6)
                            .addComponent(txtLambdaExp, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel5))
                        .addGap(22, 22, 22)
                        .addComponent(txtLambdaPoisson, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(9, 9, 9)
                        .addGroup(panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel9)
                            .addComponent(jLabel11)
                            .addComponent(jLabel10)
                            .addComponent(txtDesviacion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtMedia, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addComponent(jLabel12)
                        .addGap(9, 9, 9)
                        .addGroup(panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(rd15, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(rd10)
                            .addComponent(rd20))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel13, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(txtN, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(btnGenerar)))
                        .addGap(134, 134, 134))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelLayout.createSequentialGroup()
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)))
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 251, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnGraficar)
                .addContainerGap(22, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void rdUniformeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rdUniformeActionPerformed
           if( rdUniforme.isSelected() )
           {
             txtA.setEnabled(true);txtB.setEnabled(true);
             txtLambdaExp.setEnabled(false);
             txtLambdaPoisson.setEnabled(false);
             txtMedia.setEnabled(false);txtDesviacion.setEnabled(false);
             limpiarTextBox();
           }
    }//GEN-LAST:event_rdUniformeActionPerformed

    private void rdExponencialActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rdExponencialActionPerformed
          if( rdExponencial.isSelected() )
           {
             txtLambdaExp.setEnabled(true);
             txtA.setEnabled(false);txtB.setEnabled(false);
             txtLambdaPoisson.setEnabled(false);
             txtMedia.setEnabled(false);txtDesviacion.setEnabled(false);
             limpiarTextBox();
           }
    }//GEN-LAST:event_rdExponencialActionPerformed

    private void rdNormalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rdNormalActionPerformed
           if( rdNormal.isSelected() )
           {
             txtMedia.setEnabled(true);txtDesviacion.setEnabled(true);
             txtLambdaPoisson.setEnabled(false);
             txtLambdaExp.setEnabled(false);
             txtA.setEnabled(false);txtB.setEnabled(false);
             limpiarTextBox();
           }
    }//GEN-LAST:event_rdNormalActionPerformed

    private void btnGenerarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGenerarActionPerformed
       
        manejador.resetear();
        boolean fallo = false;
        if(Integer.parseInt(txtN.getText()) < 1000001)
        {
                    manejador.setN(Integer.parseInt(txtN.getText()));
                    fallo = false;
        }
        else
        {
            JOptionPane.showMessageDialog(new JFrame(), "N no deberia ser mayor a 1000000", "Parámetros incorrectos", JOptionPane.WARNING_MESSAGE);
            txtN.requestFocus();
            fallo = true;
        }

        if( rdUniforme.isSelected() && fallo == false)
        {
           float extremoInferior = Float.parseFloat(txtA.getText());
           float extremoSuperior = Float.parseFloat(txtB.getText());

           ///
           if(extremoInferior > extremoSuperior)
           {
               JOptionPane.showMessageDialog(new JFrame(), "A no puede ser mayor a B", "Parámetros incorrectos", JOptionPane.WARNING_MESSAGE);
               fallo = true;
           }
           else
           {
                manejador.generarDistribucionUniforme(extremoInferior, extremoSuperior);
                fallo = false;
           } 
        }
        if(rdExponencial.isSelected() && fallo == false)
        {
          float lambdaExponencial = Float.parseFloat(txtLambdaExp.getText());
          manejador.generarDistribucionExponencial(lambdaExponencial);
        }
        if(rdPoisson.isSelected() && fallo == false)
        {
            float lambdaPoisson = Float.parseFloat(txtLambdaPoisson.getText());
            manejador.generarDistribucionPoisson(lambdaPoisson);
        }
        
        if(rdNormal.isSelected() && fallo == false)
        {
            float mediaNormal = Float.parseFloat(txtMedia.getText());
            float desviacionNormal = Float.parseFloat(txtDesviacion.getText());
            if(desviacionNormal < 0)
           {
               JOptionPane.showMessageDialog(new JFrame(), "La desviacion normal debe ser mayor a 0", "Parámetros incorrectos", JOptionPane.WARNING_MESSAGE);
               fallo = true;
           }
           else
           {
                manejador.generarDistribucionNormal(mediaNormal, desviacionNormal);
                fallo = false;
           } 
            
        }
        
        if(fallo == false)
            
        {
            int cantidadIntervalos = this.getCantidadIntervalos();
        
        System.out.println("Cantidad de intervalos a generar: " + cantidadIntervalos);
        
        manejador.crearIntervalos(cantidadIntervalos); // se crean los intervalos en el manejador
        
        //manejador.mostrarIntervalos();
        
        manejador.contarFrecuenciaObservadaPorIntervalo();
        
        manejador.calcularFrecuenciaEsperadaParaIntervalos();
        
        manejador.calcularEstadisticoIntervalos();
              
        //Carga de grilla
        
        tabla.setModel(new TablaNumero(manejador.getIntervalos()));
        tablaNumeros.setModel(new TablaNumeros(manejador.getNumerosGenerados()));
        }
        
        
       
    }//GEN-LAST:event_btnGenerarActionPerformed

    private void btnGraficarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGraficarActionPerformed
        
        ArrayList<Intervalo> numerosAletorios = manejador.getIntervalos();
        
        if(numerosAletorios != null && numerosAletorios.size() > 0)
        {
            DefaultCategoryDataset dataset = new DefaultCategoryDataset();
             for (Intervalo num : numerosAletorios) 
             {
                dataset.addValue(num.getFrecuenciaObservada(),num.nombreIntervalo(),"");
             }
                 
     
                  
            // crear grafico
            JFreeChart graficoBarras = ChartFactory.createBarChart3D(
                     "Frecuencia de números aleatorios generados por intervalo",        //Título de la gráfica
                     "Intervalos",           //leyenda Eje horizontal
                     "Frecuencia observada",      //leyenda Eje vertical
                     dataset,                   //datos
                     PlotOrientation.VERTICAL,  //orientación
                     true,                      //incluir leyendas
                     true,                      //mostrar tooltips
                     true);                   

            graficoBarras.setBackgroundPaint(Color.lightGray);

            CategoryPlot plot =(CategoryPlot) graficoBarras.getPlot();
            plot.setBackgroundPaint(Color.white); //fondo del grafico
            plot.setDomainGridlinesVisible(true);//lineas de rangos, visibles
            plot.setRangeGridlinePaint(Color.BLACK);//color de las lineas de rangos
            

            // crear la ventana del grafico
            ChartFrame frame = new ChartFrame("Gráfico de barras",graficoBarras);
            frame.pack();
            frame.setVisible(true);
            frame.setLocationRelativeTo(null);
        }
        else
            JOptionPane.showMessageDialog(this,"Debe cargar numeros antes de graficar","Error",JOptionPane.INFORMATION_MESSAGE);
    }//GEN-LAST:event_btnGraficarActionPerformed

    private void rdPoissonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rdPoissonActionPerformed
        if( rdPoisson.isSelected() )
        {
            txtLambdaPoisson.setEnabled(true);
            txtLambdaExp.setEnabled(false);
            txtA.setEnabled(false);txtB.setEnabled(false);
            txtMedia.setEnabled(false);txtDesviacion.setEnabled(false);
            limpiarTextBox();
        }
    }//GEN-LAST:event_rdPoissonActionPerformed
    private int getCantidadIntervalos()
    {
        int n =0;
        if(rd10.isSelected())
            n=10;
        if(rd15.isSelected())
            n=15;
        if(rd20.isSelected())
            n=20;
        return n;
    }
    

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
        } catch (ClassNotFoundException | InstantiationException | IllegalAccessException | javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(() -> {
            new Principal().setVisible(true);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnGenerar;
    private javax.swing.JButton btnGraficar;
    private javax.swing.ButtonGroup grupoCantidadIntervalos;
    private javax.swing.ButtonGroup grupoRdDistribuciones;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JLabel lblA;
    private javax.swing.JLabel lblB;
    private javax.swing.JPanel panel;
    private javax.swing.JRadioButton rd10;
    private javax.swing.JRadioButton rd15;
    private javax.swing.JRadioButton rd20;
    private javax.swing.JRadioButton rdExponencial;
    private javax.swing.JRadioButton rdNormal;
    private javax.swing.JRadioButton rdPoisson;
    private javax.swing.JRadioButton rdUniforme;
    private javax.swing.JTable tabla;
    private javax.swing.JTable tablaNumeros;
    private javax.swing.JTextField txtA;
    private javax.swing.JTextField txtB;
    private javax.swing.JTextField txtDesviacion;
    private javax.swing.JTextField txtLambdaExp;
    private javax.swing.JTextField txtLambdaPoisson;
    private javax.swing.JTextField txtMedia;
    private javax.swing.JTextField txtN;
    // End of variables declaration//GEN-END:variables
}
