package application;

import java.util.Iterator;

public class App {

	public static void main(String[] args) {

		String[] fruits = { "banana", "pear", "apple", "grape" };

		for (String fruit : fruits) {
			System.out.println(fruit);
		}

		int[] numbers = { 2, 4, 14 };
		int total = 0;
		for(int number: numbers) {
			total += number;
		}
		
		System.out.println("Total is :" + total);

	}

}
