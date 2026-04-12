package analisisejercicio01;

public abstract class Vehiculo {
	protected String marca;
	protected String modelo;
	protected String color;
	protected String matricula;
	protected boolean estadoMotor;
	protected int marchaActual;
	protected int velocidadActual;
	
	public Vehiculo(String marca, String modelo, String color, String matricula, boolean estadoMotor, int marchaActual,
			int velocidadActual) {
		this.marca = marca;
		this.modelo = modelo;
		this.color = color;
		this.matricula = matricula;
		this.estadoMotor = estadoMotor;
		this.marchaActual = marchaActual;
		this.velocidadActual = velocidadActual;
	}

	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public String getModelo() {
		return modelo;
	}

	public void setModelo(String modelo) {
		this.modelo = modelo;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public String getMatricula() {
		return matricula;
	}

	public void setMatricula(String matricula) {
		if (matricula.length() == 7) {
			this.matricula = matricula;
		} else {
			this.matricula = "0101AAA";
		}
	}

	public boolean isEstadoMotor() {
		return estadoMotor;
	}

	public void setEstadoMotor(boolean estadoMotor) {
		this.estadoMotor = estadoMotor;
	}

	public int getMarchaActual() {
		return marchaActual;
	}

	public void setMarchaActual(int marchaActual) {
		this.marchaActual = marchaActual;
	}

	public int getVelocidadActual() {
		return velocidadActual;
	}

	public void setVelocidadActual(int velocidadActual) {
		if (velocidadActual >= 0) {
			this.velocidadActual = velocidadActual;
		} else {
			this.velocidadActual = 0;
		}
	}
	
	/**
	 * Aumenta la velocidad del coche poco a poco
	 * @param velocidadPedida La velocidad que el vehiculo termina alcanzando
	 */
	public void arrancar(int velocidadPedida) {
		for (int i = 0; i < velocidadPedida; i++) {
			velocidadActual++;
			
			subirMarcha();
		}
		
		estadoMotor = true;
	}
	
	/**
	 * Va reduciendo la velocidad del vehiculo poco a poco
	 */
	public void parar() {
		for (int i = velocidadActual; i > 0; i--) {
			velocidadActual--;
			
			bajarMarcha();
		}
		
		estadoMotor = false;
	}
	
	/**
	 * Va subiendo las marchas del vehiculo segun lo va haciendo tambien la velocidad
	 */
	public void subirMarcha() {
		if (velocidadActual <= 30) {
			marchaActual = 1;
		} else if (velocidadActual <= 50) {
			marchaActual = 2;
		} else if (velocidadActual <= 70) {
			marchaActual = 3;
		} else if (velocidadActual <= 100) {
			marchaActual = 4;
		} else {
			marchaActual = 5;
		}
	}
	
	/**
	 * Va reduciendo las marchas del vehiculo segun lo va haciendo la velocidad de este
	 */
	public void bajarMarcha() {
		if (velocidadActual >= 100) {
			marchaActual = 5;
		} else if (velocidadActual >= 70) {
			marchaActual = 4;
		} else if (velocidadActual >= 50) {
			marchaActual = 3;
		} else if (velocidadActual >= 30) {
			marchaActual = 2;
		} else {
			marchaActual = 1;
		}
	}
	
	public String toString() {
		String motor = estadoMotor ? "Encendido" : "Apagado";
		
		return "Marca: " + marca + "\nModelo: " + modelo + "\nColor: " + color + "\nMatricula: " + matricula + "\nMotor: " + motor + "\nMarcha: " + marchaActual + "\nVelocidad Actual: " + velocidadActual;
	}
	
}
