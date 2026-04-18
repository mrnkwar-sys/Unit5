package comparatorejercicio03;

import java.util.Comparator;

public class ComparadorGoles implements Comparator<Futbolista>{
	@Override
	public int compare(Futbolista fut1, Futbolista fut2) {
		return Integer.compare(fut1.getNumeroGoles(), fut2.getNumeroGoles());
	}
}
