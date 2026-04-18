package excepcionesejercicio03;

public class NullNameException extends Exception{
	private static final long serialVersionUID = 1L;

	@Override
	public String toString() {
		return "ERROR: Nombre nulo introducido";
	}
}
