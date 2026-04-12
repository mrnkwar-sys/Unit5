package analisisejercicio01;

public class Motocicleta extends Vehiculo{
	private double cilindrada;

	public Motocicleta(String marca, String modelo, String color, String matricula, boolean estadoMotor,
			int marchaActual, int velocidadActual, double cilindrada) {
		super(marca, modelo, color, matricula, estadoMotor, marchaActual, velocidadActual);
		this.cilindrada = cilindrada;
	}

	public double getCilindrada() {
		return cilindrada;
	}

	public void setCilindrada(double cilindrada) {
		if (cilindrada > 0) {
			this.cilindrada = cilindrada;
		} else {
			this.cilindrada = 10;
		}
	}
	
	/**
	 * Si la cilindrada supera los 125 cm cubicos, se requiere carnet
	 * @return True si sobrepasa el limite o iguala el limite
	 */
	public boolean requiereCarnet() {
		return (cilindrada >= 125);
	}
	
	public String toString() {
		String carnet = requiereCarnet() ? "Requiere carnet" : "No requiere carnet";
		return super.toString() + "\n Cilindrada: " + cilindrada + "\n" + carnet;
	}
}
