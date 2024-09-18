package application;

import java.util.Arrays;

public class App {

	public static int total = 0;
	public static void main(String[] args) {
		
		String[] animals = {"dog", "bear", "horse"};
		
		Arrays.stream(animals).forEach(animal -> {
			System.out.println(animal);
		});
		
		int[] numbers = {1,2,3,4,5,6,7,9};
		
		Arrays.stream(numbers).forEach(number -> {
			total += number;
		});
		
		System.out.printf("Total is: %d", total);
	}
}
