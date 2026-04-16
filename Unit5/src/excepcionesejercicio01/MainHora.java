package excepcionesejercicio01;

public class MainHora {

	public static void main(String[] args) {
		Hora hora1 = new Hora(12, 50, 45);
		
		try {
			hora1.setHour(-12);
		} catch (NegativeHourException e){
			System.out.println(e.getMessage());
		}
		
		try {
			hora1.setMinute(-12);
		} catch (NegativeMinuteException e){
			System.out.println(e.getMessage());
		}
		
		try {
			hora1.setSecond(-12);
		} catch (NegativeSecondException e){
			System.out.println(e.getMessage());
		}
		
		System.out.println(hora1.toString());
	}

}
