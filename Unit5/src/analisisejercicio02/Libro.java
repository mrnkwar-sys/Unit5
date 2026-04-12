package analisisejercicio02;

public class Libro implements Ficha{
	private String autor;
	private String editorial;
	
	public Libro(String autor, String editorial) {
		this.autor = autor;
		this.editorial = editorial;
	}

	public String getAutor() {
		return autor;
	}

	public void setAutor(String autor) {
		this.autor = autor;
	}

	public String getEditorial() {
		return editorial;
	}

	public void setEditorial(String editorial) {
		this.editorial = editorial;
	}
	
	public void tiempoPrestamo() {
		System.out.println("El tiempo de préstamo es de 15 días");
	}
}
