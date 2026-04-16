package excepcionesejercicio02;

public class NullNameException extends Exception{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	NullNameException(){
		super("Nombre nulo insertado");
	}
}
