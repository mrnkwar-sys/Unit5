package ejercicio04;

public class Television extends Electrodomestico{
	private double resolucion = 20;
	private boolean sintonizadorTdt = false;
	
	Television(double precio, double peso){
		super(precio, peso);
	}
	
	Television(double resolucion, boolean sintonizadorTdt, String color, char letraConsumo, double precioBase, double peso){
		super(color, letraConsumo, precioBase, peso);
		this.resolucion = resolucion;
		this.sintonizadorTdt = sintonizadorTdt;
	}

	public double getResolucion() {
		return resolucion;
	}

	public void setResolucion(double resolucion) {
		this.resolucion = resolucion;
	}

	public boolean isSintonizadorTdt() {
		return sintonizadorTdt;
	}

	public void setSintonizadorTdt(boolean sintonizadorTdt) {
		this.sintonizadorTdt = sintonizadorTdt;
	}
	
	@Override
	public void precioFinal() {
		if (resolucion > 40) {
			setPrecioBase(precioBase*1.3);
		} else if (sintonizadorTdt == true) {
			setPrecioBase(precioBase+50);
		}
	}
}
