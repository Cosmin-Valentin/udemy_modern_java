package aplication;

public class App {

	public static void main(String[] args) {
		
		Person person1 = new Person("Joe");
		System.out.println(person1);
		
		Person person2 = new Person();
		System.out.println(person2);
		
		Person person3 = new Person(23);
		System.out.println(person3);
		
	}

}
