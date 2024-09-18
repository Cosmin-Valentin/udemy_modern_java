package application;

import java.util.Scanner;

public class App {
	public static void main(String[] args) {

		int input = 210;

		if (input > 100) {
			System.out.println("easter egg.");
		} else {
			switch (input) {
			case 1:
				System.out.println("hello");
				break;
			case 2:
				System.out.println("how are you?");
				break;
			case 3:
				System.out.println("exiting...");
				break;
			default:
				System.out.println("invalid option.");
				break;
			}
		}

	}
}
