package application;

import java.util.stream.Stream;

public class App {

	public static void main(String[] args) {

		var results = Stream.of("Hello", "how", "are", "you").parallel().reduce("",
				(partial1, item) -> partial1 + " " + item, (partial1, partial2) -> partial1 + partial2);

		System.out.println(results);
	}
}
