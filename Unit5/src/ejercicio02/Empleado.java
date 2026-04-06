package ejercicio02;

public class Empleado {
	protected String nombre;
	
	Empleado(String nombre){
		this.nombre = nombre;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
	public String toStringEmpleado() {
		String datos = "Empleado " + nombre;
		return datos;
	}
}

