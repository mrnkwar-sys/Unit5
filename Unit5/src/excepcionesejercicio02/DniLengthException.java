package excepcionesejercicio02;

public class DniLengthException extends Exception{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	DniLengthException() {
		super("DNI de longitud inválida");
	}
}
