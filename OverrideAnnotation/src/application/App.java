package application;

public class App {

	public static void main(String[] args) {
		
		Cat cat1 = new HouseCat();
		cat1.vocalize();
		cat1.hunt();
//		Does not work
//		cat1.purr();
		((HouseCat)cat1).purr();
		
		HouseCat cat2 = new HouseCat();
		cat2.vocalize();
		cat2.hunt();
		cat2.purr();
	}

}
