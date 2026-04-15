package comparatorejercicio05;

import java.lang.Comparable;
import java.util.ArrayList;

public class CuentaBancaria implements Comparable<CuentaBancaria>{
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
	
	@Override
	public int compareTo(CuentaBancaria obj) {
		//Casteo
		CuentaBancaria otraCuenta = (CuentaBancaria) obj;
		
		return this.numeroCuenta.compareToIgnoreCase(otraCuenta.numeroCuenta);
	}
	
	public String toString() {
		return "Numero de cuenta: " + numeroCuenta + " Saldo disponible: " + saldo + "\n";
	}
}
