package application;

public class App {

	public static void main(String[] args) {
		
		Animal a1 = new Cat();
		Cat a2 = (Cat)a1;
		
		a2.speak();
		a2.jump();
		
		Object o1 = getAnimal();
		System.out.println(o1);
		
	}
	
	public static Object getAnimal() {
		return new Cat();
	}

}
