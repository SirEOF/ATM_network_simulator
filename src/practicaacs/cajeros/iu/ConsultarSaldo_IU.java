package practicaacs.cajeros.iu;

import java.io.IOException;

import javax.swing.JFrame;

import practicaacs.cajeros.Cajero;
import practicaacs.cajeros.Envio;
import practicaacs.fap.CodigoNoValidoException;
import practicaacs.fap.CodigosMensajes;
import practicaacs.fap.CodigosRespuesta;
import practicaacs.fap.Mensaje;
import practicaacs.fap.MensajeDatos;
import practicaacs.fap.MensajeRespDatos;
import practicaacs.fap.RespAbono;
import practicaacs.fap.RespSaldo;

public class ConsultarSaldo_IU extends ConsultaAbstracta {

    JFrame parent;
    Cajero cajero;
    
    /**
     * Creates new form ConsultarSaldo
     */
    public ConsultarSaldo_IU(JFrame padre,Cajero caj,Envio env) {
        this.parent = padre;
        this.cajero = caj;
        initComponents();
		this.ConsultandoLabel.setVisible(true);
		envia_consulta(env);
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
        jLabel2 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        AceptarButton = new javax.swing.JButton();
        ConsultandoLabel = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Saldo");

        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("CONSULTA SALDO");

        jLabel2.setText("Saldo actual:");

        jTextField1.setEditable(false);

        AceptarButton.setText("Aceptar");
        AceptarButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AceptarButtonActionPerformed(evt);
            }
        });

        ConsultandoLabel.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        ConsultandoLabel.setText("Consultando...");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jTextField1)
                    .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 269, Short.MAX_VALUE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(AceptarButton))
                    .addComponent(ConsultandoLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(ConsultandoLabel)
                .addGap(1, 1, 1)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 18, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(AceptarButton)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void AceptarButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AceptarButtonActionPerformed
        if(this.parent != null)
            this.parent.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_AceptarButtonActionPerformed

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
            java.util.logging.Logger.getLogger(ConsultarSaldo_IU.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ConsultarSaldo_IU.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ConsultarSaldo_IU.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ConsultarSaldo_IU.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ConsultarSaldo_IU(null,null,null).setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton AceptarButton;
    private javax.swing.JLabel ConsultandoLabel;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JTextField jTextField1;
    // End of variables declaration//GEN-END:variables
    
	/**
	 * Método que realiza el envio de una operación.
	 * @param env El Envio a partir del cual se creará el mensaje a enviar.
	 */
	@Override
    public void envia_consulta(Envio env){
    	env.setTipoMensaje(CodigosMensajes.SOLSALDO);
    	Mensaje envio = this.cajero.crear_mensaje(env);
    	
    	this.cajero.enviar_mensaje(envio,this);
    }
    
	/**
	 * Método que actualiza la IU.
	 * @param message El mensaje recibido con el que actualizar la IU.
	 * @throws CodigoNoValidoException Excepción que se lanza cuando se utiliza el método en una consulta no debida.
	 */
	@Override
    public void actualizarIU(MensajeRespDatos respuesta){
		
		this.ConsultandoLabel.setVisible(false);
	
		String texto = "";
		
		if(respuesta!=null){
			System.out.println(respuesta.getCodonline()+"-"+respuesta.getCod_resp()+"-"+respuesta.getTipoMensaje());
			if(respuesta.getCodonline()){
				CodigosRespuesta codigo = respuesta.getCod_resp();
				
				if((codigo.equals(CodigosRespuesta.CONSACEPTADA)) && respuesta.getTipoMensaje().equals(CodigosMensajes.RESSALDO))
					texto = String.valueOf(((RespSaldo)respuesta).getSaldo());
				else
					texto = String.valueOf(codigo.getMensaje());
			}else
				texto = String.valueOf("Error: No hay conexion.");
		}else{
			texto = String.valueOf("No se puede realizar la operacion, inténtelo de nuevo más tarde.");
		}
		this.jTextField1.setText(texto);
    }

}
