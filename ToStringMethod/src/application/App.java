package application;

public class App {

	public static void main(String[] args) {

		final int toSquared = 7;
		Calculator calc = new Calculator();

		int sqared = calc.square(toSquared);
		System.out.printf("%d squared is: %d\n", toSquared, sqared);

		int added = calc.add(7, 5);
		System.out.printf("7 plus 5 is: %d\n", added);
		
		int tripled = calc.triple(toSquared);
		System.out.printf("%d tripled is: %d\n", toSquared, tripled);
	}

}
