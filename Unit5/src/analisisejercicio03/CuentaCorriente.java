package analisisejercicio03;

import java.util.ArrayList;

public class CuentaCorriente extends CuentaBancaria{
	private double porcentajeTransaccion;
	private ArrayList <Transaccion> listaTransacciones = new ArrayList<>();
	
	public CuentaCorriente(String numeroCuenta, double saldo, Titular primerTitular, double porcentajeTransaccion,
			ArrayList<Transaccion> listaTransacciones) {
		super(numeroCuenta, saldo, primerTitular);
		this.porcentajeTransaccion = porcentajeTransaccion;
		this.listaTransacciones = listaTransacciones;
	}

	public double getPorcentajeTransaccion() {
		return porcentajeTransaccion;
	}

	public void setPorcentajeTransaccion(double porcentajeTransaccion) {
		this.porcentajeTransaccion = porcentajeTransaccion;
	}

	public ArrayList<Transaccion> getListaTransacciones() {
		return listaTransacciones;
	}

	public void setListaTransacciones(ArrayList<Transaccion> listaTransacciones) {
		this.listaTransacciones = listaTransacciones;
	}
	
}
