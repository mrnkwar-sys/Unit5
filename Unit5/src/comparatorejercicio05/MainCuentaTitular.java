package comparatorejercicio05;

import java.util.Arrays;
import java.util.Comparator;

public class MainCuentaTitular {

	public static void main(String[] args) {
		CuentaBancaria[] listaCuentas = new CuentaBancaria[] {
				new CuentaBancaria("KI19283947628947362784", 1000, new Titular("28392839K", "Juana", "Montero")),
				new CuentaBancaria("PG18293748394837485720", 1670.90, new Titular("82937621P", "Paco", "Calvo")),
				new CuentaBancaria("BS28392848501829463789", 550, new Titular("10284519O", "Daniela", "Murillo"))
		};
		
		Titular[] listaTitulares = new Titular[] {
				new Titular("09273829F", "Sara", "Orozco"),
				new Titular("75728394B", "Francisco", "Orozco"),
				new Titular("73628394B", "Lorena", "Zamorano")
		};
		
		System.out.println("Tabla de cuentas sin ordenar: \n" + Arrays.deepToString(listaCuentas));
		Arrays.sort(listaCuentas);
		System.out.println("Tabla de cuentas ordenada por el numero de cuenta: \n" + Arrays.deepToString(listaCuentas));
		Arrays.sort(listaCuentas, new ComparadorSaldo());
		System.out.println("Tabla de cuentas ordenada por el saldo: \n" + Arrays.deepToString(listaCuentas));

		System.out.println();
		
		System.out.println("Tabla de titulares sin ordenar: \n" + Arrays.deepToString(listaTitulares));
		Arrays.sort(listaTitulares);
		System.out.println("Tabla de titulares ordenada por el dni: \n" + Arrays.deepToString(listaTitulares));
		Arrays.sort(listaTitulares, Comparator.comparing(Titular::getApellidos).thenComparing(Titular::getNombre));
		System.out.println("Tabla de titulares ordenada por los apellidos y, en caso de empate, por el nombre: \n" + Arrays.deepToString(listaTitulares));
		Arrays.sort(listaTitulares, new ComparadorNombreApellidos());
		System.out.println("Lo mismo de antes, pero a traves de una clase ComparadorNombreApellidos: \n" + Arrays.deepToString(listaTitulares));
	}

}
