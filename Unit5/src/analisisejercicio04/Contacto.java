package analisisejercicio04;

public class Contacto {
	protected String nombre;
	protected int telefono;
	
	public Contacto(String nombre, int telefono) {
		this.nombre = nombre;
		this.telefono = telefono;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public int getTelefono() {
		return telefono;
	}

	public void setTelefono(int telefono) {
		if (telefono > 10000000 && telefono < 999999999) {
			this.telefono = telefono;
		} else {
			this.telefono = 123456789;
		}
	}
	
	public boolean equals(Object obj) {
		boolean mismoContacto = false;
		
		//El casteo
		Contacto otroContacto = (Contacto) obj;
		
		//Si dos contactos tienen el mismo nombre, se considerarán el mismo
		if (this.nombre.equalsIgnoreCase(otroContacto.nombre)) {
			mismoContacto = true;
		}
		
		return mismoContacto;
	}
	
}
