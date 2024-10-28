package application;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Arrays;
import java.util.Comparator;
import java.util.TreeMap;

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

public class App4 {

	public static void main(String[] args) throws IOException {
		// @formatter:off
		
		var wordcount = Files
			.lines(Paths.get("greatExpectations.txt"))
			.map(s -> s.split("[^a-zA-Z]"))
			.map(Arrays::asList)
			.flatMap(l -> l.stream())
			.filter(s -> !s.isBlank())
			.map(String::toLowerCase)
			.collect(
				IncrementMap::new, 
				App4::accumulate,
				App4::combine
			);
		
		// @formatter:on

		TreeMap<Integer, String> sortedMap = new TreeMap<>(Comparator.reverseOrder());

		wordcount.forEach((key, value) -> sortedMap.put(value, key));

		sortedMap.forEach((value, key) -> {
			System.out.println(key + ": " + value);
		});

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