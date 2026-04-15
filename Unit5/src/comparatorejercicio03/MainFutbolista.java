package comparatorejercicio03;

import java.util.Arrays;
import java.util.Comparator;

public class MainFutbolista{

	public static void main(String[] args) {
		Futbolista[] tablaFutbolistas = new Futbolista[] {
				new Futbolista(28, 7),
				new Futbolista(16, 29),
				new Futbolista(33, 15),
				new Futbolista(16, 1),
				new Futbolista(32, 23)
		};
		
		System.out.println("Tabla sin ordenar: \n" + Arrays.deepToString(tablaFutbolistas));
		Arrays.sort(tablaFutbolistas, Comparator.comparing(Futbolista::getEdad));
		System.out.println("Tabla ordenada por edades: \n" + Arrays.deepToString(tablaFutbolistas));
		Arrays.sort(tablaFutbolistas, Comparator.comparing(Futbolista::getNumeroGoles));
		System.out.println("Tabla ordenada por número de goles: \n" + Arrays.deepToString(tablaFutbolistas));
		Arrays.sort(tablaFutbolistas, Comparator.comparing(Futbolista::getEdad).thenComparing(Futbolista::getNumeroGoles));
		System.out.println("Tabla ordenada principalmente por edades y, en caso de empate, por número de goles: \n" + Arrays.deepToString(tablaFutbolistas));
	}

}
