package application;

import java.util.ArrayList;
import java.util.Collections;

class Person implements Comparable<Person> {
	private String name;
	private Integer age;
	
	public Person(String name, int age) {
		this.name = name;
		this.age = age;
	}
	
	public String toString() {
		return name + ":" + age;
	}
	
	public int compareTo(Person other) {
		int compareName = name.compareTo(other.name);
		
		if(compareName == 0) {
			return age.compareTo(other.age);
		}
		return compareName;
	}
}

public class App {

	public static void main(String[] args) {

		var people = new ArrayList<Person>();
		
		people.add(new Person("Alex", 29));
		people.add(new Person("Phillip", 23));
		people.add(new Person("Bella", 31));
		people.add(new Person("Bella", 22));
		people.add(new Person("Andrei", 34));
		people.add(new Person("Andrei", 24));
		people.add(new Person("Andrei", 35));
		
		Collections.sort(people);
		
		people.forEach(System.out::println);
	}
}
