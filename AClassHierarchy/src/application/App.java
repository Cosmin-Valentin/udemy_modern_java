package application;

import heirarchy.Cat;
import heirarchy.Creature;

public class App {

	public static void main(String[] args) {

		Cat cat1 = (Cat) new Creature("Grasu");
		System.out.println(cat1);
		
	}
}
