package analisisejercicio04;

import java.util.Date;

public class Persona extends Contacto{
	private Date cumple;

	public Persona(String nombre, int telefono, Date cumple) {
		super(nombre, telefono);
		this.cumple = cumple;
	}

	public Date getCumple() {
		return cumple;
	}

	public void setCumple(Date cumple) {
		this.cumple = cumple;
	}
}
