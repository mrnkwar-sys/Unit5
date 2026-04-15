package comparatorejercicio03;

public class Futbolista {
	private int edad;
	private int numeroGoles;
	
	public Futbolista(int edad, int numeroGoles) {
		this.edad = edad;
		this.numeroGoles = numeroGoles;
	}

	public int getEdad() {
		return edad;
	}

	public void setEdad(int edad) {
		if (edad >= 0) {
			this.edad = edad;
		} else {
			this.edad = 18;
		}
	}

	public int getNumeroGoles() {
		return numeroGoles;
	}

	public void setNumeroGoles(int numeroGoles) {
		if (numeroGoles >= 0) {
			this.numeroGoles = numeroGoles;
		} else {
			this.numeroGoles = 1;
		}
	}
	
	public String toString() {
		return "Edad del futbolista: " + edad + " Número de goles: " + numeroGoles + "\n";
	}
}
