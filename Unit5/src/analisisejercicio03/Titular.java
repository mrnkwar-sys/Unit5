package analisisejercicio03;

public class Titular {
	private String dni;
	private String nombre;
	private String apellidos;
	private int telefono;
	
	public Titular(String dni, String nombre, String apellidos, int telefono) {
		this.dni = dni;
		this.nombre = nombre;
		this.apellidos = apellidos;
		this.telefono = telefono;
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

	public int getTelefono() {
		return telefono;
	}

	public void setTelefono(int telefono) {
		if (telefono >= 100000000 && telefono <= 999999999) {
			this.telefono = telefono;
		} else {
			this.telefono = 123456789;
		}
	}
}
