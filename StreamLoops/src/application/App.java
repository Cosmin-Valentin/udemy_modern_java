package application;

import java.util.stream.IntStream;

public class App {

	public static void main(String[] args) {
		
		IntStream.range(0, 10).forEach(x -> {
			System.out.println(x);
		});
	}

}
