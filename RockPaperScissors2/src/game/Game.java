package game;

import java.util.Random;
import java.util.Scanner;

import game.objects.Option;
import game.objects.Paper;
import game.objects.Rock;
import game.objects.Scissors;

public class Game {

	private Option[] options = { new Rock(), new Paper(), new Scissors() };

	public void run() {

		String[] outcome = { "lose", "draw", "win" };

		Random random = new Random();
		Scanner scanner = new Scanner(System.in);

		int status = 0;
		
		for (int i = 0; i < 3; i++) {
			Option obj1 = options[random.nextInt(options.length)];

			System.out.println("Choose an object.");
			System.out.println("1. Rock");
			System.out.println("2. Paper");
			System.out.println("3. Scissors");
			System.out.print("> ");

			int objectIndex = scanner.nextInt();
			Option obj2 = options[objectIndex - 1];

			System.out.println("You chose: " + obj2);
			System.out.println("The computer chose: " + obj1);

			int comparison = obj2.compareTo(obj1);
			System.out.println(outcome[comparison + 1]);
			
			status += comparison;
			
			System.out.println("\n");
		}

		scanner.close();
		System.out.println();

		if(status > 0) {
			System.out.println("You have won!");
		} else if (status < 0) {
			System.out.println("You have lost!");			
		} else {
			System.out.println("it's a draw!");
		}
	}

}
