package excepcionesejercicio02;

import java.util.Scanner;

public class MainCuentaCorriente {
	
	public static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		CuentaCorriente cuenta = new CuentaCorriente();
		
		//La variable para saber si el dato introducido es el indicado
		boolean correcto = false;
		
		//Se le piden los 3 datos anteriores al usuario
		do {
			System.out.println("Introduzca el nombre del titular de la cuenta: ");
			try {
				cuenta.setNombre(sc.nextLine());
				
				correcto = true;
				System.out.println("Nombre guardado correctamente");
			} catch (NullNameException e) {
				System.out.println(e.toString());
				sc.nextLine();
			}
		} while (!correcto);
		
		correcto = false;
		
		do {
			System.out.println("Introduzca el saldo inicial de la cuenta: ");
			try {
				cuenta.setSaldoInicial(sc.nextDouble());
				sc.nextLine();
				
				correcto = true;
				System.out.println("Saldo guardado correctamente");
			} catch (NegativeBalanceException e) {
				System.out.println(e.toString());
				sc.nextLine();
			}
		} while (!correcto);
		
		correcto = false;
		
		do {
			System.out.println("Introduzca el DNI del titular de la cuenta: ");
			try {
				cuenta.setDni(sc.nextLine());
				
				correcto = true;
				System.out.println("DNI guardado correctamente");
			} catch (DniLengthException e) {
				System.out.println(e.toString());
				sc.nextLine();
			}
		} while (!correcto);
		
		
	}

}
