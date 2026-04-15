package comparatorejercicio04;

import java.lang.Comparable;

public class Ficha implements Comparable<Ficha>{
	private int id;
	private String titulo;
	
	public Ficha(int id, String titulo) {
		this.id = id;
		this.titulo = titulo;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}
	
	public String toString() {
		return "Id: " + id + " Título: " + titulo + "\n";
	}
	
	@Override
	public int compareTo(Ficha obj) {
		int resultado = 0;
		
		//Casteo
		Ficha otraFicha = (Ficha) obj;
		
		if (this.id > otraFicha.id) {
			resultado = 1;
		} else if (this.id < otraFicha.id){
			resultado = -1;
		}
		
		return resultado;
	}
}
