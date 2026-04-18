package excepcionesejercicio03;

public class Articulo {
	private String name;
	private double price;
	private int howManyLast;
	
	public Articulo() {
	}
	
	public Articulo(String name, double price, int howManyLast) throws NullNameException, NegativePriceException, NegativeStockException {
		setName(name);
		setPrice(price);
		setHowManyLast(howManyLast);
	}

	public String getName() {
		return name;
	}

	public void setName(String name) throws NullNameException {
		if (name != null) {
			this.name = name;
		} else {
			throw new NullNameException();
		}
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) throws NegativePriceException {
		if (price >= 0) {
			this.price = price;
		} else {
			throw new NegativePriceException();
		}
	}

	public int getHowManyLast() {
		return howManyLast;
	}

	public void setHowManyLast(int howManyLast) throws NegativeStockException {
		if (howManyLast >= 0) {
			this.howManyLast = howManyLast;
		} else {
			throw new NegativeStockException();
		}
	}
	
	public String toString() {
		String chain = "Nombre del artículo: " + name + " | Precio del artículo: " + price + " | Cantidad en almacén: " + howManyLast;
		return chain;
	}
	
	public boolean equals(Object objeto) {
		//The boolean that will indicate if two articles are the same or not
		boolean sameArticle = false;
		
		//The cast
		Articulo otherArticle = (Articulo) objeto;
		
		if (this.name.equalsIgnoreCase(otherArticle.name)) {
			sameArticle = true;
		}
		
		return sameArticle;
	}
}
