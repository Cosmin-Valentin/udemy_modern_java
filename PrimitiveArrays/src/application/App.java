package application;

import java.util.Scanner;
import java.util.stream.IntStream;

public class App {
	
	public static int total = 0;
	public static void main(String[] args) {

		final int NUM_VALUES = 3;
		
		Scanner scanner = new Scanner(System.in);
		int[] numbers = new int[NUM_VALUES];
		
		
		IntStream.range(0, numbers.length).forEach(i -> {
			
			System.out.printf("Enter 3 numbers and get their sum. %d number > ", (i+1));
			numbers[i] = scanner.nextInt();
			total += numbers[i];
			
		});
		
		scanner.close();
		
		System.out.printf("Total is: %d", total);
		
	}

}
