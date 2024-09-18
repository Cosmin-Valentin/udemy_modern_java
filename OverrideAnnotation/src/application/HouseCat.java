package application;

public class HouseCat extends Cat {
	
	@Override
	public void vocalize() {
		System.out.println("Miau!");
	}
	
	public void purr() {
		System.out.println("Purring...");
	}
}
