package comparatorejercicio04;

import java.util.Arrays;

public class MainFicha {

	public static void main(String[] args) {
		Ficha[] tablaFichas = new Ficha[] {
				new Ficha(15, "Clásicos"),
				new Ficha(83, "Pop de los 2000"),
				new Ficha(34, "Pop Indie"),
				new Ficha(82, "Rock"),
				new Ficha(32, "Blues"),
				new Ficha(98, "Jazz"),
		};
		
		System.out.println("Tabla sin ordenar: \n" + Arrays.deepToString(tablaFichas));
		Arrays.sort(tablaFichas);
		System.out.println("Tabla ordenada por id: \n" + Arrays.deepToString(tablaFichas));
		Arrays.sort(tablaFichas, new ComparadorFichas());
		System.out.println("Tabla ordenada por título: \n" + Arrays.deepToString(tablaFichas));

	}

}
