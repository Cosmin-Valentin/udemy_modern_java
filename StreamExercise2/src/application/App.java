package application;

import java.util.stream.IntStream;

public class App {

	public static void main(String[] args) {

		factorial(5);

	}
	
	private static void factorial(int n) {
		System.out.println(IntStream.range(1, ++n).reduce(1, (partial, item) -> partial * item));
	}
}
