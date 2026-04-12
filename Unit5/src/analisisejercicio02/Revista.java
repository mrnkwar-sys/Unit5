package analisisejercicio02;

public class Revista implements Ficha{
	private String informacion;
	private int fechaPublicacion;
	
	public Revista(String informacion, int fechaPublicacion) {
		this.informacion = informacion;
		this.fechaPublicacion = fechaPublicacion;
	}

	public String getInformacion() {
		return informacion;
	}

	public void setInformacion(String informacion) {
		this.informacion = informacion;
	}

	public int getFechaPublicacion() {
		return fechaPublicacion;
	}

	public void setFechaPublicacion(int fechaPublicacion) {
		if (fechaPublicacion > 0) {
			this.fechaPublicacion = fechaPublicacion;
		} else {
			this.fechaPublicacion = 2000;
		}
	}
	
	public void tiempoPrestamo() {
		System.out.println("El tiempo de préstamo es de 10 días");
	}
}
