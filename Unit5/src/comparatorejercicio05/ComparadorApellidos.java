package comparatorejercicio05;

import java.util.Comparator;

public class ComparadorApellidos implements Comparator<Titular>{
	public int compare(Titular t1, Titular t2) {
		return t1.getApellidos().compareToIgnoreCase(t2.getApellidos());
	}
}
