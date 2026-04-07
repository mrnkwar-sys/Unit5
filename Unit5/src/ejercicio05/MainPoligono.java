package ejercicio05;

import java.util.ArrayList;
import java.util.Scanner;

public class MainPoligono {

	public static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		//La lista que contiene los triángulos y rectángulos
		ArrayList <Poligono> listaPoligonos = new ArrayList<>();
		
		//Opción elegida por el usuario
		int opcion;
		
		//La medida de cada uno de los lados
		double lado1;
		double lado2;
		double lado3;
		
		//El menú que se mostrará al usuario
		menu();
		
		opcion = sc.nextInt();
		
		switch(opcion) {
		case 1 -> {
			System.out.println("Introduzca la medida del primer lado: ");
			lado1 = sc.nextDouble();
			
			System.out.println("Introduzca la medida del segundo lado: ");
			lado2 = sc.nextDouble();
			
			System.out.println("Introduzca la medida del tercer lado: ");
			lado3 = sc.nextDouble();
		}
		}
		
	}
	
	public static void menu() {
		System.out.println();
		System.out.println("1. Introducir triángulo");
		System.out.println("2. Introducir rectangulo");
		System.out.println("3. Mostrar polígonos");
		System.out.println();
		System.out.println("Elija una de las opciones del menú: ");
	}

}
