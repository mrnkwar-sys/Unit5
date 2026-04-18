package excepcionesejercicio03;

public class NegativeStockException extends Exception {
	private static final long serialVersionUID = 1L;

	@Override
	public String toString() {
		return "ERROR: Cantidad de stock imposible introducida";
	}
}
