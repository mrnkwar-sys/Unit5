package ejercicio05;

public abstract class Poligono {
	protected int numeroLados;
	
	Poligono(int numeroLados){
		this.numeroLados = numeroLados;
	}
	
	public int getNumeroLados() {
		return numeroLados;
	}
	
	public String toString() {
		return "Número de lados " + numeroLados;
	}
	
	public abstract double area();
}
