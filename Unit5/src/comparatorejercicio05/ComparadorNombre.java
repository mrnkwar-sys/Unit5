package comparatorejercicio05;

import java.util.Comparator;

public class ComparadorNombre implements Comparator<Titular>{
	public int compare(Titular t1, Titular t2) {
		return t1.getNombre().compareToIgnoreCase(t2.getNombre());
	}
}
