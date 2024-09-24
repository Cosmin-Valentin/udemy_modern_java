package application;

import application.exceptions.TemperatureTooHighException;
import application.exceptions.TemperatureTooLowException;

public class App {

	public static void main(String[] args) {
		
		Thermostat stat = new Thermostat();
		
		try {
			stat.setTemperature(200.2);			
		} catch(TemperatureTooLowException e) {
			System.out.println(e.getMessage());
		} catch(TemperatureTooHighException e) {
			System.out.println(e.getMessage());
		}
	}
}
