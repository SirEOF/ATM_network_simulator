/***************************************************************************
 *	ATM Network Simulator ACS. FIC. UDC. 2012/2013									*
 *	Copyright (C) 2013 by Pablo Castro and Marcos Chavarria 						*
 * <pablo.castro1@udc.es>, <marcos.chavarria@udc.es> 								*
 * 																								*
 * This program is free software; you can redistribute it and/or modify 	*
 * it under the terms of the GNU General Public License as published by 	*
 * the Free Software Foundation; either version 2 of the License, or 		*
 * (at your option) any later version. 												*
 ***************************************************************************/
package practicaacs.banco.iu;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import practicaacs.banco.Banco;

/**
 *
 * @author ch01
 */
public class DialogoNovaTarxeta extends javax.swing.JDialog {

	private static final long serialVersionUID = -8230385744067286169L;
	private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JTextField jTextField1;
	
    /**
     * Creates new form DialogoNovaTarxeta
     */
    public DialogoNovaTarxeta(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
    }
    
    public DialogoNovaTarxeta(final Banco l){
    	this(new javax.swing.JFrame(), true);
        this.addWindowListener(new java.awt.event.WindowAdapter() {
            @Override
            public void windowClosing(java.awt.event.WindowEvent e) {
                DialogoNovaTarxeta.this.setVisible(false);
            }
        });
        this.jButton2.addActionListener(new ActionListener(){

			@Override
			public void actionPerformed(ActionEvent arg0) {
				l.engadirTarxeta(DialogoNovaTarxeta.this.jTextField1.getText());
				DialogoNovaTarxeta.this.setVisible(false);
			}
        	
        });
        
        this.jButton1.addActionListener(new ActionListener(){

			@Override
			public void actionPerformed(ActionEvent e) {
				DialogoNovaTarxeta.this.setVisible(false);
			}
        	
        });
    }

    private void initComponents() {

        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jButton1.setText("Cancelar");
        jButton2.setText("Aceptar");
        jLabel1.setText("Numero de Tarxeta");


        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(0, 170, Short.MAX_VALUE)
                        .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jButton1))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(18, 18, 18)
                        .addComponent(jTextField1)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 20, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton1)
                    .addComponent(jButton2))
                .addContainerGap())
        );

        pack();
    }   
}
