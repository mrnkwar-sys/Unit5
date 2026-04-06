package ejercicio02;

public class Tecnico extends Operario{

	Tecnico(String nombre){
		super(nombre);
	}
	
	public String toStringTecnico() {
		return super.toStringOperario() + " -> Tecnico";
	}
}
