package interfacesejercicio02;

import java.util.Arrays;

public class MainFutbolista {

	public static void main(String[] args) {
		Futbolista tablaFutbolistas[] = new Futbolista[] {
				new Futbolista(17, "Paco", 24, 6),
				new Futbolista(8, "Lola", 35, 10),
				new Futbolista(25, "Emilio", 25, 5),
				new Futbolista(17, "Tamara", 13, 7),
				new Futbolista(29, "Hugo", 10, 13)
		};
		
		Arrays.sort(tablaFutbolistas);
		
		System.out.println(Arrays.deepToString(tablaFutbolistas));

	}

}
