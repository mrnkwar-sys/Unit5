package ejercicio04;

import java.util.ArrayList;

public class MainElectrodomestico {

	public static void main(String[] args) {
		//La lista que va a contener los electrodomesticos
		ArrayList <Electrodomestico> listaElectro = new ArrayList<>();
		
		//Creamos un objeto de cada tipo
		Electrodomestico e1 = new Electrodomestico("AZUL", 'B', 90, 30);
		Electrodomestico e2 = new Electrodomestico(190, 45);
		
		Lavadora l1 = new Lavadora("BLANCO", 'C', 150, 30, 10);
		Lavadora l2 = new Lavadora(240, 56);
		
		Television t1 = new Television(30, true, "NEGRO", 'D', 120, 20);
		Television t2 = new Television(255, 35);
		
		//Añadimos un electrodoméstico de cada tipo a la lista
		listaElectro.add(e1);
		listaElectro.add(e2);
		listaElectro.add(l1);
		listaElectro.add(l2);
		listaElectro.add(t1);
		listaElectro.add(t2);
		
		calcularPrecios(listaElectro);
		
	}
	
	public static void calcularPrecios(ArrayList <Electrodomestico> listaElectro) {
		double precioElec = 0;
		double precioTel = 0;
		double precioLav = 0;
		double precioTotal = 0;
		
		for (Electrodomestico e : listaElectro) {
			if (e instanceof Television) {
				precioTel += e.getPrecioBase();
			} else if (e instanceof Lavadora) {
				precioLav += e.getPrecioBase();
			} else {
				precioElec += e.getPrecioBase();
			}
		}
		
		precioTotal = precioElec + precioTel + precioLav;
		
		mostrarPrecios(precioTel, precioLav, precioElec, precioTotal);
	}
	
	public static void mostrarPrecios(double precioTele, double precioLavadora, double precioElectro, double precioTotal) {
		System.out.println("PRECIO DE LOS ELECTRODOMÉSTICOS");
		System.out.println();
		System.out.println("Precio Total Televisiones: " + precioTele);
		System.out.println("Precio Total Lavadoras: " + precioLavadora);
		System.out.println("Precio Total Electrodomesticos sin identificar: " + precioElectro);
		System.out.println("Precio Total de todos los Electrodomésticos: " + precioTotal);
	}

}
