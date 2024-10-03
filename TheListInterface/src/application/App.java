package application;

import java.util.ArrayList;
import java.util.List;

public class App {

	public static void main(String[] args) {
		
		List<Integer> numbers = new ArrayList<>();
		
		numbers.add(5);
		numbers.add(3);
		numbers.add(2);
		
		displayList(numbers);
		
	}

	private static void displayList(List<Integer> list) {
		list.forEach(System.out::println);
	}
}
