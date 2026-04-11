package interfacesejercicio01;

import java.lang.Comparable;

public class Socio implements Comparable<Object>{
	protected int id;
	protected String nombre;
	protected int edad;
	
	public Socio(int id, String nombre, int edad) {
		super();
		this.id = id;
		this.nombre = nombre;
		this.edad = edad;
	}
	
	public String toString() {
		return "Nombre: " + nombre + " ID: " + id + " Edad: " + edad;
	}
	
	@Override
	public int compareTo(Object obj) {
		int resultado = 0;
		
		//Casteo
		Socio soc = (Socio) obj;
		
		//El criterio de ordenacion sera el id, de menor a mayor
		if (this.id < soc.id) {
			resultado = -1;
		} else if (this.id > soc.id) {
			resultado = 1;
		}
		
		return resultado;
	}
}
