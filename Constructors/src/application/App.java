package application;

public class App {

	public static void main(String[] args) {
		
		Person person1 = new Person("Mary", 160.2);
		Person person2 = new Person("John", 170);
		Person person3 = new Person();
		
		System.out.println(person1.getName()); // Mary
		System.out.println(person2.getName()); // John
		System.out.println(person3.getName()); // Blueberry 
	}

}
