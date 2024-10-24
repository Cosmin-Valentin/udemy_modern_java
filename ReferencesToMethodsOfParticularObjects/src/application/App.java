package application;

import java.util.ArrayList;
import java.util.List;

public class App {

	public static void main(String[] args) {
		
		App app = new App();

		var numbers = new ArrayList<Integer>(List.of(1, 2, 4, 5, 6, 7, 8));

		numbers.removeIf(app::filter);
		numbers.replaceAll(app::map);
		numbers.forEach(app::print);

	}

	private boolean filter(int n) {
		return n < 5;
	}

	private int map(int n) {
		return n * 2;
	}
	
	private void print(int n) {
		System.out.println("Got value: " + n);
	}
}
