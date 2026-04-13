package analisisejercicio03;

import java.util.ArrayList;

public abstract class CuentaBancaria {
	protected String numeroCuenta;
	protected double saldo;
	protected ArrayList <Titular> listaTitulares = new ArrayList<>();
	
	public CuentaBancaria(String numeroCuenta, double saldo, Titular primerTitular) {
		this.numeroCuenta = numeroCuenta;
		this.saldo = saldo;
		//La clase tiene que contener, como mínimo, un titular registrado
		this.listaTitulares.add(primerTitular);
	}

	public String getNumeroCuenta() {
		return numeroCuenta;
	}

	public void setNumeroCuenta(String numeroCuenta) {
		if (numeroCuenta.length() == 24) {
			this.numeroCuenta = numeroCuenta;
		} else {
			this.numeroCuenta = "AA2376852938352837293849";
		}
	}

	public double getSaldo() {
		return saldo;
	}

	public void setSaldo(double saldo) {
		if (saldo >= 0) {
			this.saldo = saldo;
		} else {
			this.saldo = 100;
		}
	}

	public ArrayList<Titular> getListaTitulares() {
		return listaTitulares;
	}

	public void setListaTitulares(ArrayList<Titular> listaTitulares) {
		this.listaTitulares = listaTitulares;
	}
	
	public void ingresar(double dineroAIngresar) {
		saldo = saldo + dineroAIngresar;
	}
	
	public void sacarDinero(double dineroASacar) {
		if (dineroASacar < saldo) {
			saldo = saldo - dineroASacar;
		} else {
			System.out.println("No se ha podido sacar dinero de la cuenta por saldo insuficiente");
		}
	}
	
	public void anadirTitular(Titular otroTitular) {
		if (listaTitulares.size() == 3 && listaTitulares.contains(otroTitular)) {
			System.out.println("No se puede añadir a otro titular porque la lista está completa");
		} else {
			listaTitulares.add(otroTitular);
		}
	}
	
	public void borrarTitular(Titular unoMenos) {
		if (listaTitulares.size() >= 1 && listaTitulares.contains(unoMenos)) {
			listaTitulares.remove(unoMenos);
		}
	}
}
