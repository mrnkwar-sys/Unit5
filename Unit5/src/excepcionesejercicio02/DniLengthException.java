package excepcionesejercicio02;

public class DniLengthException extends Exception{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Override
	public String toString() {
		return "DNI de longitud erronea";
	}
}
