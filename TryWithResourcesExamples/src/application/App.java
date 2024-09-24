package application;

import java.util.Scanner;

public class App {

	public static void main(String[] args) {
		
		try(Scanner scanner = new Scanner(System.in)) {
			System.out.println("Enter something integer >");
			
			int value = scanner.nextInt();
			
			System.out.println("Value: "+ value);
		} catch(Exception e) {
			System.out.println("Invalid input...");
		}
	}
}
