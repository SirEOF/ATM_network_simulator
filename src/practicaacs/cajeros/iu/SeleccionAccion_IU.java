/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package cajero_iu;

import javax.swing.JFrame;

/**
 *
 * @author castrinho8
 */
public class SeleccionAccion_IU extends javax.swing.JFrame {

    JFrame parent;
    /**
     * Creates new form SeleccionAccion
     */
    public SeleccionAccion_IU(JFrame padre) {
        this.parent = padre;
        initComponents();
        this.setLocationRelativeTo(null);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        consultarSaldoButton = new javax.swing.JButton();
        consultarMovimientosButton = new javax.swing.JButton();
        realizarAbonoButton = new javax.swing.JButton();
        realizarReintegroButton = new javax.swing.JButton();
        realizarTraspasoButton = new javax.swing.JButton();
        SalirButton = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Cajero");

        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Seleccione la acción a realizar");

        consultarSaldoButton.setText("Consultar Saldo");
        consultarSaldoButton.setToolTipText("consultarSaldo");
        consultarSaldoButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                consultarSaldoButtonActionPerformed(evt);
            }
        });

        consultarMovimientosButton.setText("Consultar Movimientos");
        consultarMovimientosButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                consultarMovimientosButtonActionPerformed(evt);
            }
        });

        realizarAbonoButton.setText("Realizar Abono");
        realizarAbonoButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                realizarAbonoButtonActionPerformed(evt);
            }
        });

        realizarReintegroButton.setText("Realizar Reintegro");
        realizarReintegroButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                realizarReintegroButtonActionPerformed(evt);
            }
        });

        realizarTraspasoButton.setText("Realizar Traspaso");
        realizarTraspasoButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                realizarTraspasoButtonActionPerformed(evt);
            }
        });

        SalirButton.setText("Salir");
        SalirButton.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        SalirButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SalirButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(consultarSaldoButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(consultarMovimientosButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(94, 94, 94)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(realizarTraspasoButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(realizarReintegroButton, javax.swing.GroupLayout.DEFAULT_SIZE, 146, Short.MAX_VALUE)
                            .addComponent(realizarAbonoButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(SalirButton, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGap(31, 31, 31)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(realizarAbonoButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(consultarSaldoButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(consultarMovimientosButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(realizarReintegroButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addComponent(realizarTraspasoButton)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 27, Short.MAX_VALUE)
                .addComponent(SalirButton, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void consultarSaldoButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_consultarSaldoButtonActionPerformed
        this.setVisible(false);
        new ConsultarSaldo_IU(this).setVisible(true);
    }//GEN-LAST:event_consultarSaldoButtonActionPerformed

    private void consultarMovimientosButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_consultarMovimientosButtonActionPerformed
        this.setVisible(false);
        new ConsultarMovimientos_IU(this).setVisible(true);
    }//GEN-LAST:event_consultarMovimientosButtonActionPerformed

    private void SalirButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SalirButtonActionPerformed
        if(this.parent != null)
            this.parent.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_SalirButtonActionPerformed

    private void realizarAbonoButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_realizarAbonoButtonActionPerformed
        this.setVisible(false);
        new RealizarAbono_IU(this).setVisible(true);
    }//GEN-LAST:event_realizarAbonoButtonActionPerformed

    private void realizarReintegroButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_realizarReintegroButtonActionPerformed
        this.setVisible(false);
        new RealizarReintegro_IU(this).setVisible(true);
    }//GEN-LAST:event_realizarReintegroButtonActionPerformed

    private void realizarTraspasoButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_realizarTraspasoButtonActionPerformed
        this.setVisible(false);
        new RealizarTraspaso_IU(this).setVisible(true);
    }//GEN-LAST:event_realizarTraspasoButtonActionPerformed

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
            java.util.logging.Logger.getLogger(SeleccionAccion_IU.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(SeleccionAccion_IU.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(SeleccionAccion_IU.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(SeleccionAccion_IU.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new SeleccionAccion_IU(null).setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton SalirButton;
    private javax.swing.JButton consultarMovimientosButton;
    private javax.swing.JButton consultarSaldoButton;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JButton realizarAbonoButton;
    private javax.swing.JButton realizarReintegroButton;
    private javax.swing.JButton realizarTraspasoButton;
    // End of variables declaration//GEN-END:variables
}
