package ejercicio05;

public class Triangulo extends Poligono{
	protected double lado1;
	protected double lado2;
	protected double lado3;
	
	Triangulo(int lados, double lado1, double lado2, double lado3){
		super(3);
		this.lado1 = lado1;
		this.lado2 = lado2;
		this.lado3 = lado3;
	}
	
	Triangulo(int lados){
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

	public double getLado3() {
		return lado3;
	}

	public void setLado3(double lado3) {
		this.lado3 = lado3;
	}
	
	@Override
	public String toString() {
		return super.toString() + " Triángulo cuyos lado miden " + lado1 + ", " + lado2 + ", " + lado3;
	}
	
	@Override
	public double area() {
		//El resultado de la primera parte de la fórmula de Herón
		double primerResultado;
				
		//El resultado de la segunda parte de la fórmula de Herón
		double resultadoFinal;
				
		primerResultado = (lado1 + lado2 + lado3)/2;
		
		resultadoFinal = Math.sqrt(primerResultado*(primerResultado-lado1)*(primerResultado-lado2)*(primerResultado-lado3));
		
		return resultadoFinal;
	}
}
