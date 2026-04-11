package interfacesejercicio01;

import java.util.Arrays;

public class MainSocio{

	public static void main(String[] args) {
		Socio soc1 = new Socio(3, "Juan", 24);
		Socio soc2 = new Socio(7, "Paula", 33);
		Socio soc3 = new Socio(7, "Manuel", 56);
		
		//El array que contendra a los socios
		Socio tablaSocios[] = new Socio[] {
				new Socio(7, "Paula", 33),
				new Socio(3, "Juan", 24),
				new Socio(7, "Manuel", 56)
		};
		
		//El resultado de la comparacion
		int comparacion = soc1.compareTo(soc3);
		
		//Muestra -1, porque el id de soc1 es menor que el de soc3
		System.out.println(comparacion);
		
		comparacion = soc2.compareTo(soc3);
		
		//Muestra 0, porque los id de soc2 y soc3 son iguales
		System.out.println(comparacion);
		
		comparacion = soc3.compareTo(soc1);
		
		//Muestra 1, porque el id de soc3 es mayor que el de soc1
		System.out.println(comparacion);
		
		Arrays.sort(tablaSocios);
		
		System.out.println(Arrays.deepToString(tablaSocios));

	}

}
