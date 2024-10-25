package application;

import java.util.List;

class Person {
	private String name;

	public Person(String name) {
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String toString() {
		return "person: " + name;
	}
}

public class App {

	public static void main(String[] args) {

		var names = List.of("Olivia", "Emma", "Charlotte", "Sophia", "Aria", "Ava", "Chloe", "Zoey");

		// @formatter:off
		
		var count = names
			.stream()
			.peek(s -> System.out.println(s + ": " + s.getClass()))
			.map(s -> new Person(s))
			.peek(s -> System.out.println(s + ": " + s.getClass() + "\n"))
			.count();
		
		System.out.println(count);
		
		
		// @formatter:on
	}
}
