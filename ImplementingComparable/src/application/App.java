package application;

import java.util.ArrayList;
import java.util.Collections;

class Person implements Comparable<Person>{
	private String name;
	
	public Person(String name) {
		this.name = name;
	}
	
	public String toString() {
		return name;
	}

	@Override
	public int compareTo(Person o) {
		return name.compareTo(o.name);
	}
}

public class App {

	public static void main(String[] args) {

		var people = new ArrayList<Person>();
		
		people.add(new Person("Joe"));
		people.add(new Person("Pip"));
		people.add(new Person("Estella"));
		people.add(new Person("Biddy"));

		Collections.sort(people);
		
		people.forEach(System.out::println);
		
		System.out.println();
		
		String name1 = "avb";
		String name2 = "def";
		String name3 = "def";
		
		int comparison = name1.compareTo(name2);
		System.out.println(comparison);
		
		int comparison1 = name2.compareTo(name1);
		System.out.println(comparison1);
		
		System.out.println(name2.equals(name3));
		int comparison2 = name2.compareTo(name2);
		System.out.println(comparison2);
		
		
	}
}
