package ejercicio05;

public class Rectangulo extends Poligono {
	protected double lado1 = 1;
	protected double lado2 = 1;
	
	Rectangulo(int lados, double lado1, double lado2){
		super(lados);
		this.lado1 = lado1;
		this.lado2 = lado2;
	}
	
	Rectangulo(int lados){
		super(lados);
	}
	
	public double getLado1() {
		return lado1;
	}

	public void setLado1(double lado1) {
		this.lado1 = lado1;
	}

	public double getLado2() {
		return lado2;
	}

	public void setLado2(double lado2) {
		this.lado2 = lado2;
	}
	
	@Override
	public String toString() {
		return super.toString() + " Rectángulo cuyos lado miden " + lado1 + " y " + lado2;
	}
	
	@Override
	public double area() {
		double totalArea;
		
		totalArea = lado1*lado2;
		
		return totalArea;
	}
}
