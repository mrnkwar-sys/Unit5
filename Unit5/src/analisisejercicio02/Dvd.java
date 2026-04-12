package analisisejercicio02;

public class Dvd implements Ficha{
	private String director;
	private int año;
	private tipo tipoDvd;
	
	enum tipo{
		PELICULA, DOCUMENTAL, SERIE
	}

	public Dvd(String director, int año, tipo tipoDvd) {
		this.director = director;
		this.año = año;
		this.tipoDvd = tipoDvd;
	}

	public String getDirector() {
		return director;
	}

	public void setDirector(String director) {
		this.director = director;
	}

	public int getAño() {
		return año;
	}

	public void setAño(int año) {
		if (año > 0) {
			this.año = año;
		} else {
			this.año = 2000;
		}
	}

	public tipo getTipoDvd() {
		return tipoDvd;
	}

	public void setTipoDvd(tipo tipoDvd) {
		this.tipoDvd = tipoDvd;
	}
	
	public void tiempoPrestamo() {
		System.out.println("El tiempo de préstamo es de 5 días");
	}
}
