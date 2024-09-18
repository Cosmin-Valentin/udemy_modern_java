package aplication;

public class Person {
	
	private String name;
	private int age;
	
	public Person(String name) {
		this.name = name;
		System.out.println("New person created");
	}
	
	public Person() {
		System.out.println("No parameter construnctor");
	}
	
	public Person(int age) {
		this.age = age;
		System.out.println("Age is " + age);
	}
	
	@Override 
	public String toString() {
		return name;
	}
	
}
