
package paqueteprincipal;

import javax.swing.JOptionPane;



public class ventanaprincipal extends javax.swing.JFrame {
     
    SalaCine central;  // sala central
    SalaCine vo;       // versiones originales
    
    
    public ventanaprincipal() {
        initComponents();
        
        central = new SalaCine();
        vo = new SalaCine();
        
        central.setAforo(500);
        central.setEntrada(8.0);
        
        vo.setAforo(80);
        vo.setEntrada(6.0);
    }


    
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panelCentral = new javax.swing.JPanel();
        etiCentralPelicula = new javax.swing.JLabel();
        btnCentralCambiar = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        btnCentralNueva = new javax.swing.JButton();
        btnCentralOcupacion = new javax.swing.JButton();
        btnCentralVaciar = new javax.swing.JButton();
        btnCentralIngresos = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();
        panelVOriginal = new javax.swing.JPanel();
        etiOriginalPelicula = new javax.swing.JLabel();
        btnOriginalCambiar = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        btnOriginalNueva = new javax.swing.JButton();
        btnOriginalOcupacion = new javax.swing.JButton();
        btnOriginalVaciar = new javax.swing.JButton();
        btnOriginalIngresos = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        btnIngresosTotales = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        panelCentral.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        etiCentralPelicula.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        btnCentralCambiar.setText("Cambiar");
        btnCentralCambiar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCentralCambiarActionPerformed(evt);
            }
        });

        jLabel5.setFont(new java.awt.Font("Sitka Text", 0, 12)); // NOI18N
        jLabel5.setText("SALA CENTRAL");

        btnCentralNueva.setText("Nueva Venta");
        btnCentralNueva.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCentralNuevaActionPerformed(evt);
            }
        });

        btnCentralOcupacion.setText("% Ocupacion ");
        btnCentralOcupacion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCentralOcupacionActionPerformed(evt);
            }
        });

        btnCentralVaciar.setText("Vaciar");
        btnCentralVaciar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCentralVaciarActionPerformed(evt);
            }
        });

        btnCentralIngresos.setText("Ingresos");
        btnCentralIngresos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCentralIngresosActionPerformed(evt);
            }
        });

        jLabel7.setText("Pelicula:");

        javax.swing.GroupLayout panelCentralLayout = new javax.swing.GroupLayout(panelCentral);
        panelCentral.setLayout(panelCentralLayout);
        panelCentralLayout.setHorizontalGroup(
            panelCentralLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelCentralLayout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addGroup(panelCentralLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelCentralLayout.createSequentialGroup()
                        .addComponent(btnCentralNueva, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnCentralOcupacion, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnCentralVaciar, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnCentralIngresos, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(panelCentralLayout.createSequentialGroup()
                        .addComponent(jLabel7)
                        .addGap(18, 18, 18)
                        .addComponent(etiCentralPelicula, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnCentralCambiar)
                        .addGap(14, 14, 14))))
            .addGroup(panelCentralLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        panelCentralLayout.setVerticalGroup(
            panelCentralLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelCentralLayout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addComponent(jLabel5)
                .addGap(18, 18, 18)
                .addGroup(panelCentralLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(etiCentralPelicula, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnCentralCambiar)
                    .addComponent(jLabel7))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 37, Short.MAX_VALUE)
                .addGroup(panelCentralLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnCentralNueva)
                    .addComponent(btnCentralOcupacion)
                    .addComponent(btnCentralVaciar)
                    .addComponent(btnCentralIngresos))
                .addGap(27, 27, 27))
        );

        panelVOriginal.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        etiOriginalPelicula.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        btnOriginalCambiar.setText("Cambiar");
        btnOriginalCambiar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnOriginalCambiarActionPerformed(evt);
            }
        });

        jLabel4.setText("Pelicula:");

        btnOriginalNueva.setText("Nueva Venta");
        btnOriginalNueva.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnOriginalNuevaActionPerformed(evt);
            }
        });

        btnOriginalOcupacion.setText("% Ocupacion ");
        btnOriginalOcupacion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnOriginalOcupacionActionPerformed(evt);
            }
        });

        btnOriginalVaciar.setText("Vaciar");
        btnOriginalVaciar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnOriginalVaciarActionPerformed(evt);
            }
        });

        btnOriginalIngresos.setText("Ingresos");
        btnOriginalIngresos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnOriginalIngresosActionPerformed(evt);
            }
        });

        jLabel6.setFont(new java.awt.Font("Sitka Text", 1, 12)); // NOI18N
        jLabel6.setText("SALA VERSION ORIGINAL");

        javax.swing.GroupLayout panelVOriginalLayout = new javax.swing.GroupLayout(panelVOriginal);
        panelVOriginal.setLayout(panelVOriginalLayout);
        panelVOriginalLayout.setHorizontalGroup(
            panelVOriginalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelVOriginalLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panelVOriginalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel6)
                    .addGroup(panelVOriginalLayout.createSequentialGroup()
                        .addGap(12, 12, 12)
                        .addComponent(btnOriginalNueva, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnOriginalOcupacion)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnOriginalVaciar, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(8, 8, 8)
                        .addComponent(btnOriginalIngresos, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(panelVOriginalLayout.createSequentialGroup()
                        .addGap(8, 8, 8)
                        .addComponent(jLabel4)
                        .addGap(18, 18, 18)
                        .addComponent(etiOriginalPelicula, javax.swing.GroupLayout.PREFERRED_SIZE, 317, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnOriginalCambiar)))
                .addContainerGap(20, Short.MAX_VALUE))
        );
        panelVOriginalLayout.setVerticalGroup(
            panelVOriginalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelVOriginalLayout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addComponent(jLabel6)
                .addGroup(panelVOriginalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelVOriginalLayout.createSequentialGroup()
                        .addGap(28, 28, 28)
                        .addComponent(jLabel4)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(panelVOriginalLayout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 21, Short.MAX_VALUE)
                        .addGroup(panelVOriginalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(etiOriginalPelicula, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnOriginalCambiar, javax.swing.GroupLayout.Alignment.TRAILING))
                        .addGap(50, 50, 50)
                        .addGroup(panelVOriginalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnOriginalNueva)
                            .addComponent(btnOriginalOcupacion)
                            .addComponent(btnOriginalVaciar)
                            .addComponent(btnOriginalIngresos))
                        .addGap(25, 25, 25))))
        );

        btnIngresosTotales.setText("Ingresos Totales");
        btnIngresosTotales.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnIngresosTotalesActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(panelVOriginal, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnIngresosTotales, javax.swing.GroupLayout.PREFERRED_SIZE, 124, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(panelCentral, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(22, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addComponent(panelCentral, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(30, 30, 30)
                .addComponent(panelVOriginal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnIngresosTotales)
                .addContainerGap(22, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnIngresosTotalesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnIngresosTotalesActionPerformed
        String ingTot;
        ingTot="Ingresos Totales del Cine: "+(central.getIngresos() + vo.getIngresos())+" euros";
        JOptionPane.showMessageDialog(null,ingTot);
        
        
    }//GEN-LAST:event_btnIngresosTotalesActionPerformed

    private void btnCentralOcupacionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCentralOcupacionActionPerformed
        String info;
        
        info = "Sala central\n";
        info = info + "Pelicula: "+central.getPelicula()+"\n";
        info = info + "Aforo: "+central.getAforo()+"\n";
        info = info + "Ocupadas: "+central.getOcupadas()+"\n";
        info = info + "Libres: "+central.getLibres()+"\n";
        info = info + "Porcentaje Ocupacion: "+central.getPorcentaje()+"\n";
        
        JOptionPane.showMessageDialog(null,info);
    }//GEN-LAST:event_btnCentralOcupacionActionPerformed

    private void btnOriginalOcupacionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnOriginalOcupacionActionPerformed
        String info;
        
        info = "Sala Versiones Originales\n";
        info = info + "Pelicula: "+vo.getPelicula()+"\n";
        info = info + "Aforo: "+vo.getAforo()+"\n";
        info = info + "Ocupadas: "+vo.getOcupadas()+"\n";
        info = info + "Libres: "+vo.getLibres()+"\n";
        info = info + "Porcentaje Ocupacion: "+vo.getPorcentaje()+"\n";
        
        JOptionPane.showMessageDialog(null,info);
    }//GEN-LAST:event_btnOriginalOcupacionActionPerformed

    private void btnCentralCambiarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCentralCambiarActionPerformed
        String titulo;
        
        titulo = JOptionPane.showInputDialog(null,"Introduce el titulo de la pelicula: ");
        central.setPelicula(titulo);
        etiCentralPelicula.setText(titulo);
    }//GEN-LAST:event_btnCentralCambiarActionPerformed

    private void btnCentralNuevaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCentralNuevaActionPerformed
        central.entraUno();
    }//GEN-LAST:event_btnCentralNuevaActionPerformed

    private void btnCentralVaciarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCentralVaciarActionPerformed
        central.Vaciar();
        etiCentralPelicula.setText("");
    }//GEN-LAST:event_btnCentralVaciarActionPerformed

    private void btnCentralIngresosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCentralIngresosActionPerformed
        
        String info;
        
        info = "Ingresos de la sala: "+central.getIngresos()+" euros";
        JOptionPane.showMessageDialog(null,info);
    }//GEN-LAST:event_btnCentralIngresosActionPerformed

    private void btnOriginalCambiarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnOriginalCambiarActionPerformed
        String titulo;
        
        titulo = JOptionPane.showInputDialog(null,"Introduce el titulo de la pelicula: ");
        vo.setPelicula(titulo);
        etiOriginalPelicula.setText(titulo);
    }//GEN-LAST:event_btnOriginalCambiarActionPerformed

    private void btnOriginalNuevaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnOriginalNuevaActionPerformed
        vo.entraUno();
    }//GEN-LAST:event_btnOriginalNuevaActionPerformed

    private void btnOriginalIngresosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnOriginalIngresosActionPerformed
        String info;
        
        info = "Ingresos de la sala: "+vo.getIngresos()+" euros";
        JOptionPane.showMessageDialog(null,info);
    }//GEN-LAST:event_btnOriginalIngresosActionPerformed

    private void btnOriginalVaciarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnOriginalVaciarActionPerformed
        vo.Vaciar();
        etiOriginalPelicula.setText("");
    }//GEN-LAST:event_btnOriginalVaciarActionPerformed

    /**
     * @param args the command line arguments
     */
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
            java.util.logging.Logger.getLogger(ventanaprincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ventanaprincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ventanaprincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ventanaprincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ventanaprincipal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCentralCambiar;
    private javax.swing.JButton btnCentralIngresos;
    private javax.swing.JButton btnCentralNueva;
    private javax.swing.JButton btnCentralOcupacion;
    private javax.swing.JButton btnCentralVaciar;
    private javax.swing.JButton btnIngresosTotales;
    private javax.swing.JButton btnOriginalCambiar;
    private javax.swing.JButton btnOriginalIngresos;
    private javax.swing.JButton btnOriginalNueva;
    private javax.swing.JButton btnOriginalOcupacion;
    private javax.swing.JButton btnOriginalVaciar;
    private javax.swing.JLabel etiCentralPelicula;
    private javax.swing.JLabel etiOriginalPelicula;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel panelCentral;
    private javax.swing.JPanel panelVOriginal;
    // End of variables declaration//GEN-END:variables
}
