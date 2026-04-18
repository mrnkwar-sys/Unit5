package excepcionesejercicio02;

public class NegativeBalanceException extends Exception{
	private static final long serialVersionUID = 1L;

	@Override
	public String toString() {
		return "Saldo negativo insertado";
	}
}
