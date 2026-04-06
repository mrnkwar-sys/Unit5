package ejercicio04;

public class Lavadora extends Electrodomestico{
	private double carga = 5;
	
	Lavadora(double precioBase, double peso){
		super(precioBase,peso);
	}
	
	Lavadora(String color, char letraConsumo, double precioBase, double peso, double carga){
		super(color, letraConsumo, precioBase, peso);
		this.carga = carga;
	}

	public double getCarga() {
		return carga;
	}

	public void setCarga(double carga) {
		this.carga = carga;
	}
	
	@Override
	public void precioFinal() {
		if (carga > 30) {
			setPrecioBase(precioBase+50);
		}
	}
}
