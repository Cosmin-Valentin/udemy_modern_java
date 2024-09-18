package application;

import java.util.Scanner;

public class App {

	public static void main(String[] args) {
		final String START = "start";
		final String STOP = "stop";
		final String QUIT = "quit";
		Scanner scanner = new Scanner(System.in);

		System.out.println("1.Press 'Start' \n2.Press 'Stop' \n3.Press 'Quit'");

		boolean running = true;

		do {
			System.out.print("Enter a command > ");
			String command = scanner.nextLine();

			if (command.length() == 0) {
				continue;
			}

			if (command.equalsIgnoreCase(START)) {
				System.out.println("Machine starting...");
			} else if (command.equalsIgnoreCase(STOP)) {
				System.out.println("Machine stopping...");
			} else if (command.equalsIgnoreCase(QUIT)) {
				running = false;
			} else {
				System.out.println("Unrecognized command.");
				
				while (!command.equalsIgnoreCase("quit")) {
					System.out.print("Enter 'Quit' to exit > ");
					command = scanner.nextLine();
				}
				running = false;
			}

		} while (running);

		System.out.println("Exiting...");

		scanner.close();
	}
}
