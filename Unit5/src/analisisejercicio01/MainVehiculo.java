package analisisejercicio01;

import java.util.Scanner;

import analisisejercicio01.Turismo.tipoUso;

public class MainVehiculo {
	
	public static Scanner sc = new Scanner(System.in);
	
	//Un objeto de cada tipo
	static Turismo busTur = new Turismo("Toyota", "Sienna", "Rojo", "1728UIO", false, 1, 0, 20, tipoUso.PARTICULAR);
	Camion camioncito = new Camion("Volvo", "FH", "Blanco", "8375III", false, 1, 0, 1000, false);
	Motocicleta moto = new Motocicleta("Kawasaki", "Z", "Negro", "9384OLP", false, 1, 0, 130);

	public static void main(String[] args) {
		velocidadTiempo();
	}
	
	public static void velocidadTiempo() {
		int velocidad;
		int tiempo;
		
		System.out.println("Introduzca la velocidad que debe alcanzar el vehiculo: ");
		velocidad = sc.nextInt();
		
		System.out.println("Introduzca, en segundos, por cuanto tiempo debe el vehiculo mantener dicha velocidad: ");
		tiempo = sc.nextInt();
		
		simulacionArranque(velocidad, tiempo);
	}
	
	public static void simulacionArranque(int velocidad, int tiempo) {
		System.out.println("Velocidad actual del vehiculo: " + busTur.getVelocidadActual());
		System.out.println("Marcha Actual: " + busTur.getMarchaActual());
		System.out.println();
		System.out.println("Vamos a arrancar el vehiculo");
		
		busTur.arrancar(velocidad);
		
		//Se guarda el tiempo inicial en el que se empieza a contar en una variable
		double inicio = System.currentTimeMillis();
		
		//Se calcula el momento en el que debe finalizar el tiempo de espera
		double fin = inicio + (tiempo*1000);
		
		while(System.currentTimeMillis() < fin) {
			//El tiempo restante para que el vehiculo comience a frenar
			int restante = (int)(fin - System.currentTimeMillis()) / 1000;
			
			/*
			 * Se le suma un segundo a restante porque Java trunca restante
			 * Por eso, cuando queden 0.9 segundos, mostrara que quedan 0 segundos, pero continuara trabajando por 1 segundo
			 * Para que no de la sensacion de que se ha quedado pillado, anadimos 1 segundo
			 */
			System.out.print("\rManteniendo " + velocidad + " km/h ... Quedan " + (restante + 1) + " s  ");
			
			try {
		        Thread.sleep(100); 
		    } catch (InterruptedException e) {
		        // Manejo de error opcional
		    }
		}
		
		System.out.println("\nAhora vamos a frenar el vehiculo");
		
		busTur.parar();
		
		System.out.println("Velocidad actual del vehiculo: " + busTur.getVelocidadActual());
		System.out.println("Marcha Actual: " + busTur.getMarchaActual());
	}

}
