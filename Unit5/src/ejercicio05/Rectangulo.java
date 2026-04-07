package ejercicio05;

public class Rectangulo extends Poligono {
	protected double lado1 = 1;
	protected double lado2 = 1;
	
	Rectangulo(double lado1, double lado2){
		super(4);
		this.lado1 = lado1;
		this.lado2 = lado2;
	}
	
	Rectangulo(){
		super(2);
	}
	
	public double getLado1() {
		return lado1;
	}

	public void setLado1(double lado1) {
		if (lado1 > 0) {
			this.lado1 = lado1;
		} else {
			System.out.println("Error: El lado debe ser mayor que 0. Se mantiene el valor predeterminado (1).");
		}
	}

	public double getLado2() {
		return lado2;
	}

	public void setLado2(double lado2) {
		if (lado2 > 0) {
			this.lado2 = lado2;
		} else {
			System.out.println("Error: El lado debe ser mayor que 0. Se mantiene el valor predeterminado (1).");
		}
	}
	
	@Override
	public String toString() {
		return super.toString() + "Rectángulo cuyos lado miden " + lado1 + " y " + lado2 + "\n";
	}
	
	@Override
	public double area() {
		double totalArea;
		
		totalArea = lado1*lado2;
		
		return totalArea;
	}
}
