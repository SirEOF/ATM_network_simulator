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
package practicaacs;

import java.io.IOException;

import javax.swing.UnsupportedLookAndFeelException;

import practicaacs.banco.Banco;
import practicaacs.cajeros.Cajero;

/**
 * Clase que ejecuta un Cajero
 */
public class AppCajero {
	
	public static void main(String[] args) {
		
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("GTK+".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (UnsupportedLookAndFeelException | IllegalAccessException | InstantiationException | ClassNotFoundException e1){
        	System.err.println("Error establecendo GTK+ como estilo da interface.");
		}
        
    	try {
    		if(args.length == 1){
    			System.out.println("Cargando configuracion...");
    			new Cajero(args[0]);
    		}else{
        		//Seleccionar la ruta local en la que se encuentra el fichero de configuracion
    			new Cajero("/home/castrinho8/Escritorio/UNI/ACS/res/cajero1.properties");
    		}
    	} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
