package application;

import java.util.Scanner;

public class App {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

		System.out.print("Type your password > ");
		final String USER_PASSWORD = scanner.nextLine();

		String confirmationPassword = null;
		System.out.print("Confirm password > ");
		confirmationPassword = scanner.nextLine();

		do {

			System.out.print("Access denied. Please confirm password > ");
			confirmationPassword = scanner.nextLine();

		} while (!USER_PASSWORD.equals(confirmationPassword));

		System.out.println("Access granted!");

		scanner.close();

	}

}
