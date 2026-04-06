package ejercicio02;

public class Operario extends Empleado{
	
	Operario(String nombre){
		super(nombre);
	}
	
	public String toStringOperario() {
		return super.toStringEmpleado() + " -> Operario";
	}
}
