package ejercicio04;

public class Electrodomestico {
	enum consumo {
		A, B, C, D, E, F
	}
	
	enum colores {
		BLANCO, NEGRO, ROJO, AZUL, GRIS
	}
	
	protected double precioBase = 100;
	protected colores color = colores.BLANCO;
	protected consumo consumoEnergetico = consumo.F;
	protected double peso = 5;
	
	
	Electrodomestico (String color, char letraConsumo, double precioBase, double peso) {
		comprobarColor(color);
		comprobarConsumoEnergetico(letraConsumo);
		this.precioBase = precioBase;
		this.peso = peso;
	}
	
	Electrodomestico (double precioBase, double peso) {
		this.precioBase = precioBase;
		this.peso = peso;
	}

	public double getPrecioBase() {
		return precioBase;
	}

	public void setPrecioBase(double precioBase) {
		this.precioBase = precioBase;
	}

	public colores getColor() {
		return color;
	}

	public void setColor(colores color) {
		this.color = color;
	}

	public consumo getConsumoEnergetico() {
		return consumoEnergetico;
	}

	public void setConsumoEnergetico(consumo consumoEnergetico) {
		this.consumoEnergetico = consumoEnergetico;
	}

	public double getPeso() {
		return peso;
	}

	public void setPeso(double peso) {
		this.peso = peso;
	}
	
	private void comprobarConsumoEnergetico (char letra) {
		if (letra == 'A' || letra == 'B' || letra == 'C' || letra == 'D' || letra == 'E' || letra == 'F') {
			this.consumoEnergetico = consumo.valueOf(String.valueOf(letra));
		}
	}
	
	private void comprobarColor (String color) {
		if (color.equals("BLANCO") || color.equals("NEGRO") || color.equals("ROJO") || color.equals("AZUL") || color.equals("GRIS")) {
			this.color = colores.valueOf(color);
		}
	}
	
	public void precioFinal() {
		switch(consumoEnergetico) {
		case A -> setPrecioBase(precioBase+100);
		case B -> setPrecioBase(precioBase+80);
		case C -> setPrecioBase(precioBase+60);
		case D -> setPrecioBase(precioBase+50);
		case E -> setPrecioBase(precioBase+30);
		case F -> setPrecioBase(precioBase+10);
		}
		
		if (this.peso > 0 && this.peso <= 19) {
			setPrecioBase(precioBase+10);
		} else if (this.peso > 19 && this.peso <= 49) {
			setPrecioBase(precioBase+50);
		} else if (this.peso > 49 && this.peso <=79) {
			setPrecioBase(precioBase+80);
		} else {
			setPrecioBase(precioBase+100);
		}
	}
}
