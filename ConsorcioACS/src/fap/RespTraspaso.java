package fap;

public class RespTraspaso extends MensajeRespDatos {

	private boolean signo;
	private int saldo;
	
	/**
	 * Constructor del mensaje Reespuesta Traspaso.
	 * @param origen Origen del mensaje
	 * @param destino Destino del Mensaje
	 * @param numcanal Numero de canal
	 * @param nmsg Numero de mensaje
	 * @param codonline Codigo ON-LINE
	 * @param cod_resp Codigo de Respuesta
	 * @param signo Signo del saldo
	 * @param saldo Saldo
	 */
	public RespTraspaso(String origen, String destino, int numcanal, int nmsg,
			boolean codonline, CodigosRespuesta cod_resp, boolean signo,
			int saldo) {
		super(origen, destino,CodigosMensajes.RESTRASPASO , numcanal, nmsg, codonline, cod_resp);
		this.signo = signo;
		this.saldo = saldo;
	}

	@Override
	protected String printCuerpo() {
		return String.format("%1i%10i",this.signo ? 1 : 0, this.saldo);
	}
	
	
}
