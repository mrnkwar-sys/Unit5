package comparatorejercicio01;

import java.util.Comparator;

public class Comparador implements Comparator<Integer>{
	public int compare(Integer num1, Integer num2) {
		return num2.compareTo(num1);
	}
}
