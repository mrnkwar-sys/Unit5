package excepcionesejercicio03;

public class NegativePriceException extends Exception{
	private static final long serialVersionUID = 1L;

	@Override
	public String toString() {
		return "ERROR: Precio negativo insertado";
	}
}
