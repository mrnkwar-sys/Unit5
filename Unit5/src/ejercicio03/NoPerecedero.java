package ejercicio03;

public class NoPerecedero extends Producto{
	protected String type;
	
	public NoPerecedero(String name, double price, String type) {
		super(name, price);
		this.type = type;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}
	
	public double calculateNoPer(int quantity) {
		return super.calculate(quantity);
	}
}

