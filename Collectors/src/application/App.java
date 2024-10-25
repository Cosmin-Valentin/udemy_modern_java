package application;

import java.util.List;
import java.util.stream.Collectors;

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
		
		var list = names
			.stream()
			.map(s -> new Person(s))
			.collect(Collectors.toList());
		
		System.out.println(names);
		System.out.println(list);
		
		// @formatter:on
	}
}
