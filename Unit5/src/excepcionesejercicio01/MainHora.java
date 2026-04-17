package excepcionesejercicio01;

public class MainHora {

	public static void main(String[] args) 
		throws NegativeHourException, NegativeMinuteException, NegativeSecondException {
			Hora hora1 = new Hora(25, -70, 99);
			
			try {
				hora1.setHour(12);
			} catch (NegativeHourException e){
				System.out.println(e.getMessage());
			}
			
			try {
				hora1.setMinute(30);
			} catch (NegativeMinuteException e){
				System.out.println(e.getMessage());
			}
			
			try {
				hora1.setSecond(57);
			} catch (NegativeSecondException e){
				System.out.println(e.getMessage());
			}
			
			System.out.println(hora1.toString());
	}

}
