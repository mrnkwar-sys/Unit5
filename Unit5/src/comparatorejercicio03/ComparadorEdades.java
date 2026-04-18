package comparatorejercicio03;

import java.util.Comparator;

public class ComparadorEdades implements Comparator<Futbolista>{
	@Override
	public int compare(Futbolista fut1, Futbolista fut2) {
		return Integer.compare(fut1.getEdad(), fut2.getEdad());
	}
}
