package application;

import application.exceptions.TemperatureOutOfRangeException;

public class App {

	public static void main(String[] args) {
		
		Thermostat stat = new Thermostat();
		
		try {
			stat.setTemperature(-20.2);
		} catch(TemperatureOutOfRangeException e) {
			e.printStackTrace();
			System.out.println(e.getMessage());
		}
	}
}
