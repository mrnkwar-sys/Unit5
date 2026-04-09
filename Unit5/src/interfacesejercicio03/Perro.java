package interfacesejercicio03;

public class Perro extends AnimalDomestico{
	private static final double PROBABILIDAD_OBEDIENCIA = 0.9; 
	
	Perro(String nombre, String raza, double peso, String color){
		super(nombre, raza, peso, color);
	}
	
	@Override
	public void hacerRuido() {
		System.out.println(nombre + "¡Guau!");
	}
	
	@Override
	public boolean hacerCaso() {
		return Math.random() < PROBABILIDAD_OBEDIENCIA;
	}
	
	public void sacaPaseo() {
		System.out.println(nombre + " está dando un paseo");
	}
}
