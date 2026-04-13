package analisisejercicio03;

public class CuentaAhorro extends CuentaBancaria{
	private double cuotaMantenimiento;
	private double interesAnual;
	
	public CuentaAhorro(String numeroCuenta, double saldo, Titular primerTitular, double cuotaMantenimiento,
			double interesAnual) {
		super(numeroCuenta, saldo, primerTitular);
		this.cuotaMantenimiento = cuotaMantenimiento;
		this.interesAnual = interesAnual;
	}

	public double getCuotaMantenimiento() {
		return cuotaMantenimiento;
	}

	public void setCuotaMantenimiento(double cuotaMantenimiento) {
		if (cuotaMantenimiento >= 0) {
			this.cuotaMantenimiento = cuotaMantenimiento;
		} else {
			this.cuotaMantenimiento = 10;
		}
	}

	public double getInteresAnual() {
		return interesAnual;
	}

	public void setInteresAnual(double interesAnual) {
		if (interesAnual >= 0) {
			this.interesAnual = interesAnual;
		} else {
			this.interesAnual = 0.1;
		}
	}
	
	public void saldoConInteres() {
		saldo = saldo*interesAnual;
	}
	
	public void saldoSinCuota() {
		saldo = saldo - cuotaMantenimiento;
	}
}
