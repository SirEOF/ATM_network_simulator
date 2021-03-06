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
package practicaacs.fap;

public abstract class MensajeDatos extends Mensaje {

	private static final long serialVersionUID = -4316897518534151364L;
	private int numcanal;
	private int nmsg;
	private boolean codonline;
	
	
	public MensajeDatos(String origen, String destino,
			CodigosMensajes tipoMensaje, int numcanal, int nmsg,
			boolean codonline) {
		
		super(origen, destino, tipoMensaje);
		assert(numcanal > 0);
		assert(numcanal < 100);
		assert(nmsg > 0);
		assert(nmsg < 32767);
		
		this.numcanal = numcanal;
		this.nmsg = nmsg;
		this.codonline = codonline;
	}
	
	public MensajeDatos(){}

	public void setNmsg(int nmsg) {
		this.nmsg = nmsg;
	}

	@Override
	protected String printCabecera() {
		return super.printCabecera() + 
				String.format("%02d%05d%1d", numcanal, nmsg, codonline ? 1 : 0);
	}

	public void setNumcanal(int numcanal) {
		this.numcanal = numcanal;
	}

	public int getNumcanal() {
		return numcanal;
	}

	public int getNmsg() {
		return nmsg;
	}

	public boolean getCodonline() {
		return codonline;
	}
	
	public void setCodonline(boolean codonline) {
		this.codonline = codonline;
	}

	@Override
	protected void parseComp(String bs) throws MensajeNoValidoException {
		super.parseComp(bs);
		
		if(bs.length() < 26){
			throw new MensajeNoValidoException("Lonxitude non válida (" + bs.length() + ") (MDatos)");
		}
		
		try{
			numcanal = new Integer(bs.toString().substring(18,20).trim());
		}catch(NumberFormatException e){
			throw new MensajeNoValidoException("Formato de número de canal non válido. (MDatos)");
		}
		
		try{
			nmsg = new Integer(bs.substring(20, 25));
		}catch(NumberFormatException e){
			throw new MensajeNoValidoException("Formato de número de mensaxe (" + bs.substring(20, 25) + ") non válido. (MDatos)");
		}
		
		if(bs.substring(25,26).equals("1") || bs.substring(25,26).equals("0")){
			this.codonline = bs.substring(25,26).equals("1");
		}else{
			throw new MensajeNoValidoException("Non hai un 1 ou un 0 no codigoOnline. (MDatos)");
		}
		
	}
	
	public String getNum_tarjeta() throws CodigoNoValidoException{
    	throw new CodigoNoValidoException("Error: El método getNumTarjeta no puede ser llamado en este tipo de mensaje.");
	}
	
	public int getNum_cuenta() throws CodigoNoValidoException{
    	throw new CodigoNoValidoException("Error: El método getNum_cuenta no puede ser llamado en este tipo de mensaje.");
	}
	
	public String getIdBancoFromTarjeta(){
		
		String tarjeta = null;
		String banco = null;
		
		//Obtiene la tarjeta
		try {
			tarjeta = this.getNum_tarjeta();
		} catch (CodigoNoValidoException e1) {
			e1.printStackTrace();
			System.exit (-1);
		}

		//Obtiene el id_banco
		try{
			banco = tarjeta.substring(0,tarjeta.length()-3);
		}catch(IndexOutOfBoundsException e){
			e.getStackTrace();
			System.exit (-1);
		}
		return banco;
	}
	
	
	protected String formatearMensaje(){
		return super.formatearMensaje();
	}
	
}
