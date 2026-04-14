package comparatorejercicio01;

import java.util.Arrays;
import java.util.Random;

public class OrdenarNumeros implements Comparador{

	public static void main(String[] args) {
		Random rand = new Random();
		
		Integer tablaNumeros[] = new Integer[20];
		
		//Se llena la tabla con números aleatorios 
		for (int i = 0; i < tablaNumeros.length; i++) {
			tablaNumeros[i] = rand.nextInt(0, 101);
		}
		
		System.out.println("Tabla sin ordenar: \n " + Arrays.toString(tablaNumeros));
		Arrays.sort(tablaNumeros, new Comparador());

	}
	
	public int compare(Integer num1, Integer num2) {
		return num1.compareTo(num2);
	}

}
