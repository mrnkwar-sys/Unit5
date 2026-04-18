package excepcionesejercicio01;

public class NegativeHourException extends Exception{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public String toString() {
		return "Hora errónea: valor negativo";
	}
}
