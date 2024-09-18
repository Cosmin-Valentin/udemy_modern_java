package application;

public class Person {

	private String name;
	
	public Person(String name) {
		this.name = name;
		System.out.println("Person constructor...");
	}
	
	public String toString() {
		return "Person name is " + name;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
}
