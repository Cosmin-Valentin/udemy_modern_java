package application;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class App {

	public static void main(String[] args) {

		String text = "Hello; how are, you. today' windy/rainy Nice! Don't run.";
		
		text.split("[^a-zA-Z]+");
		
		StringBuilder bookA = new StringBuilder();
		StringBuilder bookB = new StringBuilder();
		
		try(BufferedReader br = new BufferedReader(new FileReader("src/application/aroundTheWorld.txt"))) {
			String line;
			while((line = br.readLine()) != null) {
				bookA.append(line).append("\n");
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		try(BufferedReader br = new BufferedReader(new FileReader("src/application/mysteriousIsland.txt"))) {
			String line;
			while((line = br.readLine()) != null) {
				bookB.append(line).append("\n");
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
//		
		String[] bookAWords = bookA.toString().split("[^a-zA-Z]+");
		String[] bookBWords = bookB.toString().split("[^a-zA-Z]+");
		
		Set<String> aroundTheWorld = new TreeSet<>();
		Set<String> mysteriousIsland = new TreeSet<>();
		
		for(var word: bookAWords) {
			aroundTheWorld.add(word);
		}
		
		for(var word: bookBWords) {
			mysteriousIsland.add(word);
		}
		
		System.out.println("'Around the World' by Jules Verne has " + aroundTheWorld.size() + " uniquie words");
		System.out.println("'Mysterious Island' by Jules Verne has " + mysteriousIsland.size() + " uniquie words");
		
		var onlyAround = new HashSet<String>(aroundTheWorld);
		onlyAround.retainAll(mysteriousIsland);
		
		var onlyMysterious = new HashSet<String>(mysteriousIsland);
		onlyMysterious.retainAll(aroundTheWorld);
		
		System.out.println("Words found only in 'Around the World' :" + onlyAround.size());
		System.out.println("Words found only in 'Mysterious Island' :" + onlyMysterious.size());
		
		var intersection = new TreeSet<String>(aroundTheWorld);
		intersection.addAll(mysteriousIsland);
		
		intersection.forEach(System.out::println);
	}
}
