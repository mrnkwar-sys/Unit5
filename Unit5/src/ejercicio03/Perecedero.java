package ejercicio03;

public class Perecedero extends Producto{
	protected int aboutToExpire;
	
	public Perecedero(String name, double price, int aboutToExpire) {
		super(name, price);
		this.aboutToExpire = aboutToExpire;
	}

	public int getAboutToExpire() {
		return aboutToExpire;
	}

	public void setAboutToExpire(int aboutToExpire) {
		this.aboutToExpire = aboutToExpire;
	}
	
	public double calculatePer(int quantity) {
		double finalPrice = 0;
		
		//If the product has 1 day left before its expiration, the final price will be reduced 4 times
		if (aboutToExpire == 1) {
			finalPrice = (double) super.calculate(quantity)/4;
		//If it has 2 days left, the final price will be reduced by a third
		} else if(aboutToExpire == 2) {
			finalPrice = (double) super.calculate(quantity)/3;
		//If it has 3 days left, the price will be cut in half 
		} else if (aboutToExpire == 3) {
			finalPrice = (double) super.calculate(quantity)/2;
		}
		
		return finalPrice;
	}
}

