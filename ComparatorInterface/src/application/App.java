package application;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

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
	
	public String getName() {
		return name;
	}
	
	public Integer getAge() {
		return age;
	}

	public int compareTo(Person other) {
		int compareName = name.compareTo(other.name);

		if (compareName == 0) {
			return age.compareTo(other.age);
		}
		return compareName;
	}
}

class PersonReverseAlpha implements Comparator<Person> {

	@Override
	public int compare(Person person1, Person person2) {
		int compareName = person2.getName().compareTo(person1.getName());
		
		if(compareName == 0) {
			return person2.getAge().compareTo(person1.getAge());
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

		Collections.sort(people, new PersonReverseAlpha());

		people.forEach(System.out::println);
		System.out.println();
		
		people.sort(new Comparator<Person>() {
			public int compare(Person p1, Person p2) {
				Integer age1 = p1.getAge();
				Integer age2 = p2.getAge();
				return age1.compareTo(age2);
			}
		});
		
		people.forEach(System.out::println);
	}
}
