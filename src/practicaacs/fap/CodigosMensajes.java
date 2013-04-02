package practicaacs.fap;

public enum CodigosMensajes {
	SOLTRAFICOREC(01), SOLFINTRADICOREC(02),ABRIRSESION(11),DETENERTRAFICO(13),
	REANUDARTRAFICO(14),CIERRESESION(12),CONSULTARSALDO(31),CONSULTARMOVIMIENTOS(32),
	REINTEGRO(33),ABONO(34),TRASPASO(35),TRAFICOREC(91),FINREC(92),SOLABRIRSESION(81),
	SOLDETENERTRAFICO(83),SOLREANUDARTRAFICO(84),SOLCIERRESESION(82),RESCONSULTARSALDO(61),
	RESCONSULTAMOV(62),RESREINTEGRO(63),RESABONO(64),RESTRASPASO(65);
	private int numero;

	private CodigosMensajes(int numero){
		this.numero = numero;
	}
	
	public int getNum(){
		return this.numero;
	}

	public static CodigosMensajes parse(String s) throws CodigoNoValidoException {
		int numero = new Integer(s);
		for(CodigosMensajes c : CodigosMensajes.values()){
			if(c.numero == numero){
				return c;
			}
		}
		throw new CodigoNoValidoException(s);
	}
}
