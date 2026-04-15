package comparatorejercicio05;

public class Titular implements Comparable<Titular>{
	private String dni;
	private String nombre;
	private String apellidos;
	
	public Titular(String dni, String nombre, String apellidos) {
		this.dni = dni;
		this.nombre = nombre;
		this.apellidos = apellidos;
	}
	
	public String getDni() {
		return dni;
	}

	public void setDni(String dni) {
		if (dni.length() == 9) {
			this.dni = dni;
		} else {
			this.dni = "12345678O";
		}
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getApellidos() {
		return apellidos;
	}

	public void setApellidos(String apellidos) {
		this.apellidos = apellidos;
	}
	
	@Override
	public int compareTo(Titular obj) {
		//Casteo
		Titular otroTitular = (Titular) obj;
		
		return this.dni.compareToIgnoreCase(otroTitular.dni);
	}
	
	public String toString() {
		return "Apellidos: " + apellidos + " Nombre: " + nombre + " DNI: " + dni + "\n";
	}
}
