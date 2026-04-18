package excepcionesejercicio01;

public class NegativeMinuteException extends Exception{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public String toString() {
		return "Minuto erróneo: valor negativo";
	}
}
