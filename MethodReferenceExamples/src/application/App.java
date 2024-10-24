package application;

import java.util.ArrayList;
import java.util.List;

public class App {

	public static void main(String[] args) {

		var numbers = new ArrayList<Integer>(List.of(1,2,4,5,6,7,8,9,23,765,22));
		
		numbers.removeIf(App::filter);
		numbers.replaceAll(App::map);
		
		numbers.forEach(System.out::println);
	}
	
	private static boolean filter(int n) {
		return n < 5;
	}
	
	private static int map(int value) {
		return value * 2;
	}
}
