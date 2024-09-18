package application;

import java.util.Random;

public class RandomWord {

	private String[] words = { "tidings", "wandering", "esquire", "extinguished", "forged", "wonder" };

	private String chosenWord;
	private Random random = new Random();
	private char[] characters;

	public RandomWord() {
		chosenWord = words[random.nextInt(words.length)];
		characters = new char[chosenWord.length()];
	}

	public String toString() {

		StringBuilder text = new StringBuilder();

		for (char c : characters) {
			text.append(c == '\u0000' ? '_' : c);
			text.append(' ');
		}
		return text.toString();
	}

	public boolean addGuess(char c) {
		boolean guess = false;
		for (int x = 0; x < chosenWord.length(); x++) {
			if (chosenWord.charAt(x) == c) {
				characters[x] = c;
				guess = true;
			}
		}

		return guess;
	}

	public boolean checkIfComplete() {
		for (int x = 0; x < characters.length; x++) {
			if (characters[x] == '\u0000') {
				return false;
			}
		}

		return true;
	}

}
