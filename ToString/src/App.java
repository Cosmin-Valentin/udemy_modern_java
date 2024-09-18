
public class App {

	public static void main(String[] args) {

		Person person1 = new Person("Mary", 160.2);
		Person person2 = new Person("John", 170);
		Person person3 = new Person();

		System.out.println(person1.toString()); // Name: Mary, height: 160.2
		System.out.println(person2); // Name: John, height: 170.0
		System.out.println(person3); // Name: Blueberry, height: 3.0
	}

}
