package comparatorejercicio02;

import java.util.Comparator;

public class ComparadorEdades implements Comparator<Socio>{
	public int compare(Socio socio1, Socio socio2) {
		return Integer.compare(socio2.getEdad(), socio1.getEdad());
	}
}
