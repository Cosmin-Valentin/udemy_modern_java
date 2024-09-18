package application;

import java.util.Scanner;

public class App {
	public static void main(String[] args) {

		
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("Type your password > ");
		final String USER_PASSWORD = scanner.nextLine();
		
		System.out.print("Confirm your password > ");
		String confirmationPassword = scanner.nextLine();
		
		int tries = 0;
		
		while (!USER_PASSWORD.equals(confirmationPassword)) {
			System.out.print("Incorrect password. Try again > ");
			confirmationPassword = scanner.nextLine();
			
			if(++tries == 3) {
				break;
			}
		}
		
		if (tries != 3) {
			System.out.println("Access granted!");
		} else {			
			System.out.println("Access denied. You daft cunt...");
		}
		
		scanner.close();
		
		
//		Scanner scanner = new Scanner(System.in);
//		
//		boolean gotVolcano = false;
//
//		for(;;) {
//			System.out.println(" > ");
//			String input = scanner.nextLine();
//			
//			if(input.equals("quit")) {
//				break;
//			} else if (input.equals("volcano")) {
//				System.out.println("eruption mate...");
//				gotVolcano = true;
//			}
//		}
//		
//		scanner.close();
//
//		if(gotVolcano) {
//			System.out.println("still eruptin' mate...");
//		} else {
//			System.out.println("all chill...");
//		}
	}
}
