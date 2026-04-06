package ejercicio02;

public class Directivo extends Empleado{

	Directivo(String nombre){
		super(nombre);
	}
	
	public String toStringDirectivo() {
		return super.toStringEmpleado() + " -> Directivo";
	}
}

