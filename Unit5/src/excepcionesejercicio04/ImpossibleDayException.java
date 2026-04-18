package excepcionesejercicio04;

public class ImpossibleDayException extends Exception {

	private static final long serialVersionUID = 1L;
	
	@Override
	public String toString() {
		return "ERROR: Dia fuera del rango 1-31";
	}

}
