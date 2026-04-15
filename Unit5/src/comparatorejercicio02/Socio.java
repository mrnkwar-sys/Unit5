package comparatorejercicio02;

public class Socio {
	private String nombre;
	private int edad;
	
	public Socio(String nombre, int edad) {
		this.nombre = nombre;
		this.edad = edad;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public int getEdad() {
		return edad;
	}

	public void setEdad(int edad) {
		if (edad >= 0) {
			this.edad = edad;
		} else {
			this.edad = 2;
		}
	}
	
	public String toString() {
		return nombre + ", de " + edad + " años\n";
	}
}
