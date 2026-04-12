package analisisejercicio01;

public class Turismo extends Vehiculo{
	private int numeroPlazas;
	private tipoUso usoVehiculo;
	
	enum tipoUso{
		PROFESIONAL, PARTICULAR
	}

	public Turismo(String marca, String modelo, String color, String matricula, boolean estadoMotor, int marchaActual,
			int velocidadActual, int numeroPlazas, tipoUso usoVehiculo) {
		super(marca, modelo, color, matricula, estadoMotor, marchaActual, velocidadActual);
		this.numeroPlazas = numeroPlazas;
		this.usoVehiculo = usoVehiculo;
	}

	public int getNumeroPlazas() {
		return numeroPlazas;
	}

	public void setNumeroPlazas(int numeroPlazas) {
		if (numeroPlazas >= 2) {
			this.numeroPlazas = numeroPlazas;
		} else {
			this.numeroPlazas = 2;
		}
	}

	public tipoUso getUsoVehiculo() {
		return usoVehiculo;
	}

	public void setUsoVehiculo(tipoUso usoVehiculo) {
		this.usoVehiculo = usoVehiculo;
	}
	
	@Override
	public String toString() {
		String uso = usoVehiculo.equals(tipoUso.PARTICULAR) ? "Particular" : "Profesional";
		return super.toString() + "\nNumero Plazas: " + numeroPlazas + "\nUso: " + uso;
	}
}
