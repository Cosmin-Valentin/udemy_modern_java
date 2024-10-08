package application;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Objects;
import java.util.TreeMap;

class Person implements Comparable<Person>{
	private String name;
	
	public Person(String name) {
		this.name = name;
	}
	
	public String toString() {
		return name;
	}

	@Override
	public int hashCode() {
		return Objects.hash(name);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Person other = (Person) obj;
		return Objects.equals(name, other.name);
	}

	@Override
	public int compareTo(Person o) {
		return this.name.compareTo(o.name);
	}
}

public class App {

	public static void main(String[] args) {

		Map<Person, Integer> people1 = new HashMap<>();
		Map<Person, Integer> people2 = new LinkedHashMap<>();
		Map<Person, Integer> people3 = new TreeMap<>();
		
		addItemsAndPrint(people1);
		System.out.println();
		addItemsAndPrint(people2);
		System.out.println();
		addItemsAndPrint(people3);
		
	}

	private static void addItemsAndPrint(Map<Person, Integer> map) {
		
		map.put(new Person("Joe"), 45);
		map.put(new Person("Pip"), 20);
		map.put(new Person("Joe"), 40);
		map.put(new Person("Estella"), 19);
		
		map.forEach((k,v) -> System.out.println(k + ": " + v));
	}
}
