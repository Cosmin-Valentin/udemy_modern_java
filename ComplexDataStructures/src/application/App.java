package application;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class App {

	public static void main(String[] args) {

		Set<Set<String>> setOfSets = new HashSet<>();
		
		Set<String> item = new TreeSet<>();
		
		setOfSets.add(item);
		
		item.add("one");
		item.add("two");
		item.add("three");
		
		for(var set: setOfSets) {
			System.out.println(set);
		}
		
	}
}
