package application;

import java.util.LinkedHashSet;

public class App {

	public static void main(String[] args) {

		LinkedHashSet<String> fruits = new LinkedHashSet<>();
		
		fruits.add("apple");
		fruits.add("pear");
		fruits.add("cherry");
		fruits.add("coconut");
		
		fruits.forEach(System.out::println);
		
		System.out.println(fruits.contains("cherry"));
	}
}
