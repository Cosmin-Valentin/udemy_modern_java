package application;

import java.util.ArrayList;
import java.util.List;

public class App {

	public static void main(String[] args) {

		var list = new ArrayList<Integer>(List.of(1, 5, 9, 1000, 3, 6, -20, 4));
		
		list.removeIf(n -> n < 0 || n > 10);
		list.replaceAll(n -> n + 100);
		
		list.forEach(System.out::println);

	}
}
