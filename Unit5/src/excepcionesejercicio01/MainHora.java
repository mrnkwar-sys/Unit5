package excepcionesejercicio01;

public class MainHora {

	public static void main(String[] args) throws NegativeHourException, NegativeMinuteException, NegativeSecondException {
			try {
				Hora horaError = new Hora();
				horaError.setHour(-5);
				
				System.out.println("Este mensaje NO se vera si hay error");
			} catch (NegativeHourException e) {
				System.out.println("Se ha capturado el error");
				System.out.println(e.toString());
			}
			
			try {
				Hora horaError = new Hora();
				horaError.setMinute(-10);
				
				System.out.println("Este mensaje NO se vera si hay error");
			} catch (NegativeMinuteException e) {
				System.out.println("Se ha capturado el error");
				System.out.println(e.toString());
			}
	}

}
