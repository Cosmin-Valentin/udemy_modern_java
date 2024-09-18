package application;

public class App {

	public static void main(String[] args) {
		
		Person person1 = new Person();
		Person person2 = new Person();
		
		person1.name = "Joe";
		person1.age = 20;
		
		person2.name ="Mary";
		person2.age = 21;
		
		System.out.printf("%s is %d years old.\n", person1.name, person1.age);
		System.out.printf("%s is %d years old.", person2.name, person2.age);

	}

}
