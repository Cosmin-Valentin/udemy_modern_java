package application;

public class App {

	public static void main(String[] args) {
		
		ReturnValues values1 = new ReturnValues();
		String animal = values1.getAnimal();
		
		System.out.println(animal);
		
		System.out.println(values1.doubleNumber(3));

	}

}
