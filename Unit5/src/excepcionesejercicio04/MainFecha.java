package excepcionesejercicio04;

import java.util.Scanner;

public class MainFecha {
	
	public static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		//Indica si el dato introducido cumple con las condiciones
		boolean correcto = false;
		
		Fecha fecha = new Fecha();
		
		do {
			System.out.println("Introduzca un dia del 1 al 31: ");
			
			try {
				fecha.setDay(sc.nextInt());
				
				correcto = true;
				System.out.println("Dia guardado correctamente");
			} catch (ImpossibleDayException e) {
				System.out.println(e.toString());
			}
		} while (!correcto);
		
		correcto = false;
		
		do {
			System.out.println("Introduzca un mes del 1 al 12: ");
			
			try {
				fecha.setMonth(sc.nextInt());
				
				correcto = true;
				System.out.println("Mes guardado correctamente");
			} catch (ImpossibleMonthException e) {
				System.out.println(e.toString());
			}
		} while (!correcto);
		
		correcto = false;
		
		do {
			System.out.println("Introduzca un año: ");
			
			try {
				fecha.setYear(sc.nextInt());
				
				correcto = true;
				System.out.println("Año guardado correctamente");
			} catch (NegativeYearException e) {
				System.out.println(e.toString());
			}
		} while (!correcto);

	}

}
