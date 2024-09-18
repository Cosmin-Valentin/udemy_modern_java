package application;

public class App {
	
	public static void main(String[] args) {
		
		Person person1 = new Person();
		person1.greet();
		person1.greet("Joe");
		person1.greet(190);
		person1.greet("Sue", 190);
		
	}
	
}
