package application;

import java.util.Random;
import java.util.Scanner;

public class Game {

	private String[] words = {"eleventh", "sliding", "balcony", "smoking", "accordioning", "wandered", "suddenly", "checked", "guarantor", "agent", "candidates", "tattooed", "understand", "mushrooms", "particularly"};
	private String word = "";
	private String theWord;
	private boolean running = true;
	private int lives = 5;
	
	public Game() {
		theWord = getRandomWord();
	}
	
	private String getRandomWord() {
		Random rand = new Random();
		int randomInt = rand.nextInt(0, words.length);
		return words[randomInt];
	}
	
	private void printInitialWord() {
		
		for(int j = 0; j < theWord.length(); j++) {
			word += "_";
		}
		
		printWord(word);
	}
	
	private void printWord(String text) {
		String output = "";
		
		for(int i = 0; i < text.length(); i++) {
			output += text.charAt(i);
			output += " ";
		}
		
		System.out.println(output);
		System.err.println();
	}
	
	public void run() {
		Scanner scanner = new Scanner(System.in);
		printInitialWord();
		
		do {
			System.out.print("Enter character > ");	
			char c = scanner.next().charAt(0);
			checkCharacters(c);
		} while (running);
		
		scanner.close();
	}
	
	private void checkCharacters(char c) {
		
		StringBuilder string = new StringBuilder(word);
		boolean hit = false;
		
		for (int i = 0; i < theWord.length(); i++) {
			if(theWord.charAt(i) == c) {
				string.setCharAt(i, c);
				hit = true;
			} 
		}
		
		if(!hit && lives > 1) {
			System.out.printf("Wrong... %d lives left.\n", --lives);
			return;
		} else if (!hit) {
			System.out.printf("You have lost the game... The word is: %s", theWord);
			running = false;
		} else {
			word = string.toString();		
			printWord(word);	
		}
	}
	

	@Override
	public String toString() {
		return "word: " + theWord;
	}
}
