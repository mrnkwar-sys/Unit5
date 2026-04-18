package excepcionesejercicio02;

public class NullNameException extends Exception{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Override
	public String toString() {
		return "Nombre nulo insertado";
	}
}
