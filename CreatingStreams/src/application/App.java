package application;

import java.util.List;
import java.util.stream.Stream;

public class App {

	public static void main(String[] args) {

		Stream.of(1,2,3).forEach(System.out::println);
		
		Stream.generate(() -> "Hello").limit(3).forEach(System.out::println);
		
		List.of(1,2,3).stream().forEach(System.out::println);
		
	}
}
