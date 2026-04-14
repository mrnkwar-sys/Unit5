package analisisejercicio03;

import java.util.Date;

public class Transaccion {
	private Date fecha;
	private String concepto;
	private double importe;
	
	public Transaccion(Date fecha, String concepto, double importe) {
		this.fecha = fecha;
		this.concepto = concepto;
		this.importe = importe;
	}

	public Date getFecha() {
		return fecha;
	}

	public void setFecha(Date fecha) {
		this.fecha = fecha;
	}

	public String getConcepto() {
		return concepto;
	}

	public void setConcepto(String concepto) {
		this.concepto = concepto;
	}

	public double getImporte() {
		return importe;
	}

	public void setImporte(double importe) {
		this.importe = importe;
	}
	
}
