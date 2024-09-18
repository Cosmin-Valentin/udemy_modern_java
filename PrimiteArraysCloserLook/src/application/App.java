package application;

import java.util.Arrays;

public class App {

	public static void main(String[] args) {
		
		int value;
		value = 123;
		System.out.println(value);

		int[] values = null;
		System.out.println(values);
		
		values = new int[3];
		
		Arrays.stream(values).forEach(n -> {
			System.out.println(n);
		});
		
		for(int x: values) {
			System.out.println(x);
		}
	}

}
