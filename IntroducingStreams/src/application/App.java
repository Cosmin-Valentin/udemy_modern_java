package application;

import java.util.ArrayList;
import java.util.List;

public class App {

	public static void main(String[] args) {

		ArrayList<Integer> numbers = new ArrayList<>(List.of(1, 3, 4, 5, 7, 9, 21, 34, 3, 7, 4));
		
		numbers.stream().forEach(n -> {
			System.out.println(n);
		});
		
		
		

	}
}
