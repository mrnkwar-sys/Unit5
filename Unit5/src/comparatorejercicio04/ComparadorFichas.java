package comparatorejercicio04;

import java.util.Comparator;

public class ComparadorFichas implements Comparator<Ficha>{
	public int compare(Ficha fic1, Ficha fic2) {
		return fic1.getTitulo().compareToIgnoreCase(fic2.getTitulo());
	}
}
