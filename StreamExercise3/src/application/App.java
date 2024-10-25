package application;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.stream.Collectors;

public class App {

	public static void main(String[] args) throws IOException {

		var initialWords = Files.lines(Paths.get("greatExpectations.txt"))
			.map(s -> s.split("[^a-zA-Z]"))
			.map(a -> Arrays.asList(a))
			.flatMap(l -> l.stream())
			.collect(Collectors.toList());
		
		var map = new HashMap<String, Integer>();
		
		for(var word: initialWords) {
			if (word.isEmpty())
				continue;
			
			map.put(word, map.getOrDefault(word, 0) + 1);
		}
		

		for(Map.Entry<String, Integer> entry : map.entrySet()) {
			System.out.println(entry.getKey() + ": " + entry.getValue() + " times");
		}
	}
}
