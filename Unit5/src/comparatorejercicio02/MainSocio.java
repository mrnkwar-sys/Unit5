package comparatorejercicio02;

import java.util.Arrays;

public class MainSocio {

	public static void main(String[] args) {
		Socio[] tablaSocios = new Socio[]{
			new Socio("Pedro", 42),
			new Socio("Miguel", 23),
			new Socio("Ana", 93),
			new Socio("Lola", 56),
			new Socio("Marcos", 18),
			new Socio("Nina", 33)
		};
		
		System.out.println("Tabla de socios sin ordenar: \n" + Arrays.deepToString(tablaSocios));
		Arrays.sort(tablaSocios, new ComparadorEdades());
		System.out.println("Tabla de socios ordenada por edades: \n" + Arrays.deepToString(tablaSocios));
		Arrays.sort(tablaSocios, new ComparadorNombres());
		System.out.println("Tabla ordenada por nombres: \n" + Arrays.deepToString(tablaSocios));
	}

}
