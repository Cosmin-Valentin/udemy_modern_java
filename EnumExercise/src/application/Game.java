package application;

import java.util.Random;
import java.util.Scanner;

public class Game {

	private Integer choice;
	private Integer tries = 3;
	private String[] options = {"rock", "paper", "scissors"};
	private Integer[][] scenarios = {{0, -1, 1}, {1, 0, -1}, {-1, 1, 0}};
	private Integer score = 0;
	
	public void run() {
		choose();
		assignWinner();
	}
	
	private void choose() {
		
		Scanner scanner = new Scanner(System.in);

		while(tries > 0) {
			System.out.println("Choose: 1.Rock 2.Paper 3.Scissors >");
			
			choice = scanner.nextInt() - 1;
			testChoice();
			
			tries--;
		}
		scanner.close();
	}
	
	private void testChoice() {
		
		Random random = new Random();
		Integer computerChoice = random.nextInt(3);
		
		System.out.println("You choose: '" + options[choice] + "'");
		System.out.println("Computer choose: '" + options[computerChoice] + "'");
		
		Integer event = scenarios[choice][computerChoice];
		if(event == -1) {
			System.out.println(options[computerChoice] + " beats "+ options[choice] + " > you loose");
			score--;
		} else if (event == 0) {
			System.out.println("drawn");
		} else {
			System.out.println(options[choice] + " beats "+ options[computerChoice] + " > you win");
			score++;
		}
		System.out.println();
	}
	
	private void assignWinner() {
		
		if(score>1) {
			System.out.println("Wou win!");
		} else if (score < 0) {
			System.out.println("You loose!");
		} else {
			System.out.println("It's a draw!");
		}
	}
	
	
}
