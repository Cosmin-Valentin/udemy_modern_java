package application;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Arrays;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

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
				Collectors.groupingBy(Function.identity(), Collectors.counting())
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

			if (i % 5 == 0) {
				System.out.println();
			}

			var entry = wordList.get(i);

			System.out.printf("%15s: %-5d", entry.getKey(), entry.getValue());

		}
	}
}