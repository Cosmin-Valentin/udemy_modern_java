package application;

import java.util.Scanner;

public class Hangman {

	private boolean running = true;
	private RandomWord word = new RandomWord();
	private Scanner scanner = new Scanner(System.in);
	private int triesRemaining = 5;
	private char lastGuess;

	public void run() {

		do {
			displayWord();
			getUserInput();
			checkUserInput();
		} while (running);

	}

	void displayWord() {
		System.out.println("Tries remaining: " + triesRemaining);
		System.out.println(word);
	}

	void getUserInput() {
		System.out.print("Enter a character > ");
		lastGuess = scanner.next().charAt(0);
		
	}

	void checkUserInput() {
		boolean isCorrent = word.addGuess(lastGuess);
		
		if(isCorrent) {
			if (word.checkIfComplete()) {
				System.out.println("You have won!");
				System.out.println("The word is " + word);
				running = false;
			}	
		} else {
			triesRemaining--;
			
			if(triesRemaining == 0) {
				System.out.println("You have lost!");
				running = false;
			}
		}
	}

	public void close() {
		scanner.close();

	}
}
