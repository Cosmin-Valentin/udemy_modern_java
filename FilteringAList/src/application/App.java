package application;

import java.util.ArrayList;
import java.util.List;

public class App {

	public static void main(String[] args) {

		var numbers = new ArrayList<>(List.of(3, 5, 7, 2, 10, 4, 9));

		numbers.removeIf(n -> n <= 5);

		numbers.forEach(System.out::println);
	}
}
