package interfacesejercicio03;

public class Gato extends AnimalDomestico{
	private static final double PROBABILIDAD_OBEDIENCIA = 0.05; 
	
	Gato(String nombre, String raza, double peso, String color){
		super(nombre, raza, peso, color);
	}
	
	@Override
	public void hacerRuido() {
		System.out.println(nombre + "¡Miau!");
	}
	
	@Override
	public boolean hacerCaso() {
		return Math.random() < PROBABILIDAD_OBEDIENCIA;
	}
	
	public void toserBolaPelo() {
		System.out.println(nombre + " está tosiendo pelo");
	}
}
