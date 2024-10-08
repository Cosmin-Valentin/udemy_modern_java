package application;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Set;
import java.util.SortedSet;
import java.util.TreeSet;

public class Solution {

	public static void main(String[] args) throws FileNotFoundException, IOException {

		var wordsAtwFile = new File("atw.txt");
		var wordsMiFile = new File("mi.txt");

		var setAtw = loadWords(wordsAtwFile);
		var setMi = loadWords(wordsMiFile);

		System.out.println("Unique words in 'Around The World in 80 days': " + setAtw.size());
		System.out.println("Unique words in 'Mystery Island': " + setMi.size());
		
		var setOnlyInAtw = new TreeSet<String>(setAtw);
		setOnlyInAtw.removeAll(setMi);
		
		System.out.println("Only in 'Around The World in 80 days': " + setOnlyInAtw.size() + " words");
//		displayWords(setOnlyInAtw);
		
		var setOnlyInMi = new TreeSet<String>(setMi);
		setOnlyInMi.removeAll(setAtw);
		System.out.println("Only in 'Mystery Island': " + setOnlyInMi.size() + " words");
		
		var setBoth = new TreeSet<String>(setAtw);
		setBoth.retainAll(setMi);
		
		System.out.println("In both: " + setBoth.size() + " words");
	}

	private static void displayWords(Set<String> words) {

		int index = 0;
		for (var word : words) {
			System.out.printf("%-15s ",word);

			if (++index % 10 == 0) {
				System.out.println();
			}
		}
	}

	private static SortedSet<String> loadWords(File file) throws FileNotFoundException, IOException {

		TreeSet<String> wordSet = new TreeSet<>();

		try (var br = new BufferedReader(new FileReader(file))) {
			String line;

			while ((line = br.readLine()) != null) {
				String[] words = line.split("[^a-zA-Z]+");

				for (var word : words) {

					if (word.length() > 1) {
						wordSet.add(word.toLowerCase());
					}
				}
			}
		}
		return wordSet;
	}
}
