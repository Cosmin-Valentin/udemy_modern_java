package application;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Arrays;
import java.util.Map;
import java.util.TreeMap;
import java.util.stream.Collectors;

class IncrementMap extends TreeMap<String, Integer> {
	private static final long serialVersionUID = 1L;

	void putOrAdd(String key, Integer value) {
		Integer count = get(key);

		if (count == null) {
			put(key, value);
		} else {
			put(key, value + count);
		}
	}
}

public class App {

	public static void main(String[] args) throws IOException {
		// @formatter:off
		
		var wordCount = Files
			.lines(Paths.get("greatExpectations.txt"))
			.map(s -> s.split("[^a-zA-Z]"))
			.map(Arrays::asList)
			.flatMap(l -> l.stream())
			.filter(s -> !s.isBlank())
			.map(String::toLowerCase)
			.collect(
				IncrementMap::new, 
				App::accumulate,
				App::combine
			);
		

		var wordList = wordCount
				.entrySet()
				.stream()
				.sorted(Map.Entry.comparingByValue((v1,v2) -> v2.compareTo(v1)))
				.collect(
					Collectors.toList()
				);

		// @formatter:on

		for (int i = 0; i < wordList.size(); i++) {
			
			if(i % 5 == 0) {
				System.out.println();
			}
			
			var entry = wordList.get(i);
			
			System.out.printf("%15s: %-5d", entry.getKey(), entry.getValue());
			
			
		}
	}

	private static void accumulate(IncrementMap map, String word) {
		map.putOrAdd(word, 1);
	}

	private static void combine(IncrementMap map1, IncrementMap map2) {
		map2.forEach((word, count2) -> {
			map1.putOrAdd(word, count2);
		});
	}

}