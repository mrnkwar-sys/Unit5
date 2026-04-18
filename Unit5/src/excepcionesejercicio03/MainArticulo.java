package excepcionesejercicio03;

import java.util.Scanner;

public class MainArticulo {
	
	public static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		//Indica si se debe dejar de preguntar al usuario por un dato
		boolean correcto = false;
		
		Articulo cosa = new Articulo();
		
		do {
			System.out.println("Introduzca el nombre del articulo: ");
			
			try {
				cosa.setName(sc.nextLine());
				
				correcto = true;
				System.out.println("Nombre del articulo introducido correctamente");
			} catch (NullNameException e) {
				System.out.println(e.toString());
			}
		} while (!correcto);
		
		correcto = false;
		
		do {
			System.out.println("Introduzca el precio del articulo: ");
			
			try {
				cosa.setPrice(sc.nextDouble());
				
				correcto = true;
				System.out.println("Precio del articulo introducido correctamente");
			} catch (NegativePriceException e) {
				System.out.println(e.toString());
			}
		} while (!correcto);
		
		correcto = false;
		
		do {
			System.out.println("Introduzca el stock restante del articulo: ");
			
			try {
				cosa.setHowManyLast(sc.nextInt());
				
				correcto = true;
				System.out.println("Stock del articulo introducido correctamente");
			} catch (NegativeStockException e) {
				System.out.println(e.toString());
			}
		} while (!correcto);

	}

}
