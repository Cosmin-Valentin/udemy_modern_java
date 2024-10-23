package application;

import java.util.ArrayList;
import java.util.List;

public class App {

	public static void main(String[] args) {

		var numbers = new ArrayList<Integer>(List.of(1, 3, 4, 6, 7, 9, 13, 15, 76));

		numbers.replaceAll(n -> n * n);
		
		numbers.forEach(System.out::println);
		
		var strings = new ArrayList<String>(List.of("Ally", "Bob", "Ralph", "Giles", "Sue"));
		
		strings.replaceAll(name -> "Hello " + name);
		
		strings.forEach(System.out::println);
	}
}
