package excepcionesejercicio01;

public class NegativeMinuteException extends Exception{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public NegativeMinuteException() {
		super("Minuto negativo");
	}
}
