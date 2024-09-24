package application;

public class App {

	public static void main(String[] args) {
		
		Thermostat stat = new Thermostat();
		
		try {
			stat.setTemperature(20);
		} catch(Exception e) {
			e.printStackTrace();
			System.out.println(e.getMessage());
		}
	}

}
