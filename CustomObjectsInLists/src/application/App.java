package application;

import java.util.ArrayList;
import java.util.Collections;

class Person {
	private String name;
	
	public Person(String name) {
		this.name = name;
	}
	
	public String toString() {
		return name;
	}
}

public class App {

	public static void main(String[] args) {

		var people = new ArrayList<Person>();
		
		people.add(new Person("Joe"));
		people.add(new Person("Pip"));
		people.add(new Person("Estella"));
		people.add(new Person("Biddy"));
		
		people.set(1, new Person("Phillip"));
		
		people.forEach(System.out::println);
		System.out.println();
		
		ArrayList<Double> numbers = new ArrayList<>();
		numbers.add(2.34);
		numbers.add(9.98);
		numbers.add(3.45);
		numbers.add(1.23);

		Collections.sort(numbers);
		
		numbers.forEach(System.out::println);
		
	}
}
