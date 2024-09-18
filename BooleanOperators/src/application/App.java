package application;

public class App {

	public static void main(String[] args) {
	
		boolean isRaining = true;
		boolean mightRain = false;
		boolean haveUmbrela = true;
				
		if((isRaining || mightRain) && haveUmbrela) {
			System.out.println("Take umbrella!");
		} else {
			System.out.println("Don't take umbrella.");
		}

	}

}
