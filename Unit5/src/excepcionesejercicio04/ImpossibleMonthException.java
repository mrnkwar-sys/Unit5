package excepcionesejercicio04;

public class ImpossibleMonthException extends Exception {

	private static final long serialVersionUID = 1L;
	
	@Override
	public String toString() {
		return "ERROR: Mes introducido fuera del rango 1-12";
	}

}
