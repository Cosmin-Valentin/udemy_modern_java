package application;

public class App {

	public static void main(String[] args) {

		System.out.println(sum(5));
		System.out.println(factorial(3));
		
		System.out.println(Math.PI);
	}

	private static int sum(int value) {
		if (value == 1) {
			return value;
		}

		return value + sum(value - 1);
	}

	private static int factorial(int value) {
		if (value == 0) {
			return 1;
		}
		
		return value * factorial(--value);
	}
}
