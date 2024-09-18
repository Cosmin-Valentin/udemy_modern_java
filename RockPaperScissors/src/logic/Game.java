package logic;

import java.util.Random;
import java.util.Scanner;

public class Game {

	private int choice;
	private int tries = 3;
	private int points;
	private int computerPoints;

	public void run() {
		getChoice();
		getWinner();
	}
	
	private void getWinner() {
		String winner = "";
		if (points > computerPoints) {
			winner = "you win";
		} else if (points < computerPoints) {
			winner = "you lose";
		} else {
			winner = "it's a tie";
		}
		
		System.out.println();
		System.out.printf("Game over: %s!", winner);
	}

	private void getChoice() {
		Scanner scanner = new Scanner(System.in);

		do {
			System.out.println("Enter your choice(0. rock, 1. paper, 2.scissors) >");

			choice = scanner.nextInt();
			
			tries--;
			interpretChoice();
		} while (tries > 0);
		scanner.close();
	}

	private int otherChoice() {

		Random random = new Random();
		return random.nextInt(3);
	}
	
	private void interpretChoice() {
		
		String yourChoice = "";
		String computerChoice = "";
		int otherChoice = otherChoice();
		
		if(choice == 0) {
			yourChoice  = "rock";
		} else if (choice == 1) {
			yourChoice  = "paper";			
		} else if (choice == 2) {
			yourChoice  = "scissors";						
		}
		
		if(otherChoice == 0) {
			computerChoice  = "rock";
		} else if (otherChoice == 1) {
			computerChoice  = "paper";			
		} else if (otherChoice == 2) {
			computerChoice  = "scissors";						
		}
		
		System.out.printf("Your choice: %s -- Computer choice: %s\n", yourChoice, computerChoice);
		getOutcome(choice, otherChoice);
	}
	
	private void getOutcome(int x, int y) {
		
		if(x == 0 && y == 1) {
			System.out.println("Paper wraps rock");
			System.out.println("-> lose");
			computerPoints++;
		} else if (x == 1 && y == 0) {
			System.out.println("Paper wraps rock");			
			System.out.println("-> win");
			points++;
		} else if (x == 0 && y == 2) {
			System.out.println("Scissors get smashed");
			System.out.println("-> win");
			points++;
		} else if (x == 2 && y == 0) {
			System.out.println("Scissors get smashed");			
			System.out.println("-> lose");
			computerPoints++;
		} else if (x == 1 && y == 2) {
			System.out.println("Scissors cut paper");
			System.out.println("-> lose");
			computerPoints++;
		} else if (x == 2 && y == 1) {
			System.out.println("Scissors cut paper");			
			System.out.println("-> win");
			points++;
		} else if (x == y) {
			System.out.println("-> tie");
			points++;
			computerPoints++;
		}
		
	}

}
