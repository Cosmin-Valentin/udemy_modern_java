package application;

import java.util.Scanner;

public class App {

	public static void main(String[] args) {

		System.out.print("Enter your password > ");

		Scanner scanner = new Scanner(System.in);
		final String PASSWORD = scanner.nextLine();

		System.out.print("Confirm password > ");
		String confirmationPassword = scanner.nextLine();

		while (!PASSWORD.equals(confirmationPassword)) {
			System.out.println("Access denied.");
			System.out.print("Confirm password > ");
			confirmationPassword = scanner.nextLine();
		}

		System.out.println("Access granted.");
		scanner.close();
	}

}
