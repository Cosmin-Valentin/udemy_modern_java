package application;

import java.util.stream.IntStream;

public class App {

	public static void main(String[] args) {

		int[] numbers = { 2, 4, 6, 8 };
		
		System.out.println(numbers[3]);
		
		String[] staples = {"Potatoes", "Rice", "Pasta", "Bread"};
		
		staples[3] = "Corn";
		
		System.out.println(staples[3]);
		
		String[] animals = {"cat", "dog", "sloth", "cokabarooh"};
		
		IntStream.range(0, animals.length).forEach(x -> {
			System.out.printf("%d. %s\n", x, animals[x]);
		});
		

	}

}
