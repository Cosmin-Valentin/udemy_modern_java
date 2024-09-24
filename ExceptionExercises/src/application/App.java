package application;

import java.util.Scanner;

public class App {

	public static Scanner scanner = new Scanner(System.in);
	
	public static void main(String[] args) {

		int number = getNumber();
		System.out.println("You entered: " + number);
		scanner.close();
	}
	
	private static int getNumber() {
		
		boolean isNumber = false;
		int value = 0;
		
		while(!isNumber) {
			System.out.println("Please enter a number > ");
			String line = scanner.nextLine();

			try {
				value = Integer.parseInt(line);
				isNumber = true;
			} catch(NumberFormatException e) {
				System.out.println("Not a number. Try again.");
			}
		}
		
		return value;
	}

}
