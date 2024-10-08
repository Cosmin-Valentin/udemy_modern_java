package application;

import java.util.HashMap;

public class App {

	public static void main(String[] args) {

		HashMap<Integer, String> people = new HashMap<>();
		
		people.put(0, "John");
		people.put(3, "Mary");
		people.put(4, "Mary");
		people.put(5, "David");
		people.put(8, "Beverly");

		System.out.println(people.get(5));
		System.out.println();
		
		people.forEach((k,v) -> {
			System.out.println(k + ": " + v);
		});
	}
}
