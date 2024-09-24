package application;

public class Thermostat {

	// Temperature is in Celsius 
	public void setTemperature(double temperature) {
		
		setMachineTemperature(temperature);
		
		System.out.println("Setting temperature to " + temperature);
		
	}
	
	private void setMachineTemperature(double temperature) {
		if(temperature < 0  || temperature > 35) {
			throw new RuntimeException("Temerature out of range");
		}
	}
	
}
