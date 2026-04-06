package ejercicio01;

public class Hora {
	protected int hora;
	protected int minuto;
	
	Hora(int hora, int minuto){
		this.hora = hora;
		this.minuto = minuto;
	}
	public int getHora() {
		return hora;
	}
	
	public void setHora(int hora) {
		if (setHoras(hora)) {
			this.hora = hora;
		} else {
			this.hora = 0;
		}
	}
	public int getMinuto() {
		return minuto;
	}
	public void setMinuto(int minuto) {
		if(setMinutos(minuto)) {
			this.minuto = minuto;
		} else {
			this.minuto = 0;
		}
	}
	
	/**
	 * Incrementa la hora en un minuto
	 */
	public void inc() {
		this.minuto++;
		
		if (minuto == 60) {
			this.minuto = 0;
			++this.hora;
		} else if (hora == 24) {
			this.hora = 0;
		}
	}
	
	/**
	 * Comprueba si los minutos introducidos son validos
	 * @param minuto
	 * @return True si el minuto es valido, false si no
	 */
	public boolean setMinutos(int minuto) {
		return (minuto <= 59 && minuto >= 0);
	}
	
	/**
	 * Comprueba si la hora introducida es valida
	 * @param hora
	 * @return True si la hora es valida, false si no
	 */
	public boolean setHoras(int hora) {
		return (hora <=23 && hora >= 0);
	}
	
	public String toString() {
		String horas = String.format("%02d:%02d", hora, minuto);
		return horas;
	}

}
