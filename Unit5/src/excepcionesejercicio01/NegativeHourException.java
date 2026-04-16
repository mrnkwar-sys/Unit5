package excepcionesejercicio01;

public class NegativeHourException extends Exception{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public NegativeHourException() {
		super("Hora negativo");
	}
}
