package interfacesejercicio02;

import java.lang.Comparable;

public class Futbolista implements Comparable<Object>{
	protected int numeroCamiseta;
	protected String nombre;
	protected int edad;
	protected int numeroGoles;
	
	public Futbolista(int numeroCamiseta, String nombre, int edad, int numeroGoles) {
		this.numeroCamiseta = numeroCamiseta;
		this.nombre = nombre;
		this.edad = edad;
		this.numeroGoles = numeroGoles;
	}
	
	public String toString() {
		return "El/La futbolista " + nombre + " de numero " + numeroCamiseta + ", con " + edad + " años, ha marcado " + numeroGoles + " goles \n";  
	}
	
	@Override
	public boolean equals(Object obj) {
		//boolean mismoFutbolista = false;
		
		//El casteo
		Futbolista otroFutbolista = (Futbolista) obj;
		
		//Dos futbolistas son iguales si tienen mismo numero de camiseta y nombre
		//if (this.nombre.equalsIgnoreCase(otroFutbolista.nombre) && this.numeroCamiseta == otroFutbolista.numeroCamiseta) {
		//	mismoFutbolista = true;
		//}
		
		if(this == obj)
			return true;
		if(obj == null)
			return false;
		if(!(obj instanceof Futbolista))
			return false;
		
		//return mismoFutbolista;
		return this.numeroCamiseta == otroFutbolista.numeroCamiseta && this.nombre.equals(otroFutbolista.nombre);
	}
	
	@Override
	public int compareTo(Object objeto) {
		int resultado;
		
		//Casteo
		Futbolista fut = (Futbolista) objeto;
		
		//Primero se considerara si tienen el mismo numeroCamiseta y, si es asi, entonces se comprobara si tambien tienen el mismo nombre
		if (this.numeroCamiseta < fut.numeroCamiseta) {
			resultado = -1;
		} else if (this.numeroCamiseta > fut.numeroCamiseta) {
			resultado = 1;
		} else {
			resultado = this.nombre.compareToIgnoreCase(fut.nombre);
		}
		
		return resultado;
	}
}
