package ejercicio02;

public class Oficial extends Operario{

	public Oficial(String nombre) {
		super(nombre);
	}

	public String toStringOficial() {
		return super.toStringOperario() + " -> Oficial";
	}
}
