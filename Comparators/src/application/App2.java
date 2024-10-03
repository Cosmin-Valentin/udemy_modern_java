package application;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class App2 {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

		ArrayList<Double> numbers = new ArrayList<>();
		
		double total = 0;
		
		while(true) {
			System.out.print("Enter a number or 'stop' >");

			String input = scanner.nextLine();

			input = input.trim();

			if (input.equalsIgnoreCase("stop")) {
				break;
			}
			try {
				double value = Double.parseDouble(input);
				numbers.add(value);
				total += value;
			} catch (NumberFormatException e) {
				System.out.println("Invalid number");
				continue;
			}
		}

		scanner.close();
		
		Collections.sort(numbers);
		System.out.println();
		
		if(numbers.size() > 0) {
			System.out.println("You entered: ");
			for(var value: numbers) {
				System.out.printf("%.2f\n",  value);
			}
			System.out.println();
			
			System.out.printf("Average value: %.2f", total/numbers.size());
		} else {
			System.out.println("No numbers entered.");
		}
	}
}
