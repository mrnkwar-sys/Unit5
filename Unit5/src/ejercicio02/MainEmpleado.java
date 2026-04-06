package ejercicio02;

public class MainEmpleado {

	public static void main(String[] args) {
		Empleado E1 = new Empleado("Rafa");
		Directivo D1 = new Directivo("Mario");
		Operario OP1 = new Operario("Alfonso");
		Oficial OF1 = new Oficial("Luis");
		Tecnico T1 = new Tecnico("Pablo");
		
		System.out.println(E1.toStringEmpleado());
		System.out.println(D1.toStringDirectivo());
		System.out.println(OP1.toStringOperario());
		System.out.println(OF1.toStringOficial());
		System.out.println(T1.toStringTecnico());
	}

}

