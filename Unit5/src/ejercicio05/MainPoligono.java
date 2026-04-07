package ejercicio05;

import java.util.ArrayList;
import java.util.Scanner;

public class MainPoligono {

	public static Scanner sc = new Scanner(System.in);
	//La lista que contiene los triángulos y rectángulos
	static ArrayList <Poligono> listaPoligonos = new ArrayList<>();
	
	Triangulo tri;
	Rectangulo rec;

	public static void main(String[] args) {
		
		//Opción elegida por el usuario
		int opcion;
		
		//El menú que se mostrará al usuario
		do {
			menu();
			
			opcion = sc.nextInt();
			
			switch(opcion) {
			case 1 -> datosTriangulo();
			case 2 -> datosRectangulo();
			case 3 -> mostrarListaArea();
			case 4 -> System.out.println("Gracias por utilizar el programa :D");
			}
		} while (opcion != 4);
		
	}
	
	public static void menu() {
		System.out.println();
		System.out.println("1. Introducir triángulo");
		System.out.println("2. Introducir rectangulo");
		System.out.println("3. Mostrar polígonos");
		System.out.println("4. Salir");
		System.out.println();
		System.out.println("Elija una de las opciones del menú: ");
	}
	
	public static void datosTriangulo() {
		//Las medidas de cada uno de los lados
		double lado1;
		double lado2;
		double lado3;
		
		System.out.println("Introduzca la medida del primer lado: ");
		lado1 = sc.nextDouble();
		
		System.out.println("Introduzca la medida del segundo lado: ");
		lado2 = sc.nextDouble();
		
		System.out.println("Introduzca la medida del tercer lado: ");
		lado3 = sc.nextDouble();
		
		anadirTriangulo(new Triangulo(lado1, lado2, lado3));
	}
	
	public static void datosRectangulo() {
		//Las medidas de los lados del rectangulo
		double lado1;
		double lado2;
		
		System.out.println("Introduzca la medida del primer lado: ");
		lado1 = sc.nextDouble();
		
		System.out.println("Introduzca la medida del segundo lado: ");
		lado2 = sc.nextDouble();
		
		anadirRectangulo(new Rectangulo(lado1, lado2));
	}
	
	public static void anadirTriangulo(Triangulo tri) {
		listaPoligonos.add(tri);
	}
	
	public static void anadirRectangulo(Rectangulo rec) {
		listaPoligonos.add(rec);
	}
	
	public static void mostrarListaArea() {
		for (Poligono p : listaPoligonos) {
			System.out.println(p.toString() + "El área del polígono es " + p.area() + "\n");
		}
	}

}
