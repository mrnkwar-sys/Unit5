package excepcionesejercicio02;

public class CuentaCorriente {
	private double saldoInicial;
	private String dni;
	private String nombre;
	
	public CuentaCorriente(double saldoInicial, String dni, String nombre) throws NegativeBalanceException, DniLengthException, NullNameException {
		setSaldoInicial(saldoInicial);
		setDni(dni);
		setNombre(nombre);
	}
	
	public CuentaCorriente() {
	}
	

	public double getSaldoInicial() {
		return saldoInicial;
	}

	public void setSaldoInicial(double saldoInicial) throws NegativeBalanceException {
		if (saldoInicial >= 0) {
			this.saldoInicial = saldoInicial;
		} else {
			throw new NegativeBalanceException();
		}
	}

	public String getDni() {
		return dni;
	}

	public void setDni(String dni) throws DniLengthException {
		if (dni.length() == 9) {
			this.dni = dni;
		} else { 
			throw new DniLengthException();
		}
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) throws NullNameException {
		if (nombre != null) {
			this.nombre = nombre;
		} else {
			throw new NullNameException();
		}
	}

	public String toString() {
		return "CuentaCorriente [Saldo Inicial: " + saldoInicial + ", DNI: " + dni + ", Nombre: " + nombre + "]";
	}
	
}
