package application;

public class App {

	public static void main(String[] args) {
		
		Fruit fruit1 = Fruit.APPLE;
		Fruit fruit2 = Fruit.ORANGE;
		Fruit f3 = Fruit.APPLE;
		
		System.out.println(fruit1 == fruit2);
		System.out.println(fruit1 == f3);
	}

}
