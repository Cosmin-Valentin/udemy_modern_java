package application;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Arrays;
import java.util.stream.Collectors;

public class App {

	public static void main(String[] args) throws IOException {

		// @formatter:off
		
		var words = Files
			.lines(Paths.get("greatExpectations.txt"))
			.map(s-> s.split("[^a-zA-Z]"))
			.map(a -> Arrays.asList(a))
			.flatMap(l -> l.stream())
			.collect(Collectors.toList());
		
		// @formatter:on

		int count = 0;
		for (var word : words) {
			if (word.isEmpty())
				continue;
			
			System.out.printf("%-10s", word);

			if (count++ % 10 == 0) {
				System.out.println();
			}
		}
	}
}
