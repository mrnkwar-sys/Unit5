package comparatorejercicio02;

import java.util.Comparator;

public class ComparadorNombres implements Comparator<Socio> {
	public int compare(Socio socio1, Socio socio2) {
		return socio1.getNombre().compareToIgnoreCase(socio2.getNombre());
	}
}
