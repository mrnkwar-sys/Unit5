package analisisejercicio01;

public class Camion extends Vehiculo{
	private double pesoMaximo;
	private boolean mercanciaPeligrosa;
	
	public Camion(String marca, String modelo, String color, String matricula, boolean estadoMotor, int marchaActual,
			int velocidadActual, double pesoMaximo, boolean mercanciaPeligrosa) {
		super(marca, modelo, color, matricula, estadoMotor, marchaActual, velocidadActual);
		this.pesoMaximo = pesoMaximo;
		this.mercanciaPeligrosa = mercanciaPeligrosa;
	}

	public double getPesoMaximo() {
		return pesoMaximo;
	}

	public void setPesoMaximo(double pesoMaximo) {
		if (pesoMaximo > 0) {
			this.pesoMaximo = pesoMaximo;
		} else {
			this.pesoMaximo = 10;
		}
	}

	public boolean isMercanciaPeligrosa() {
		return mercanciaPeligrosa;
	}

	public void setMercanciaPeligrosa(boolean mercanciaPeligrosa) {
		this.mercanciaPeligrosa = mercanciaPeligrosa;
	}
	
	@Override
	public String toString() {
		String peligro = mercanciaPeligrosa ? "Porta mercancia peligrosa" : "No porta mercancia peligrosa";
		return super.toString() + "\nPeso Maximo: " + pesoMaximo + "\n" + peligro;
	}
}
