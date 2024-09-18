package ncv;

import java.util.Scanner;

public class App {

	static void convertC2F(double celsius) {
		double fahrenheit = celsius * (9.0 / 5.0) + 32;
		System.out.printf("%.2f degrees Fahrenheit is %.2f degrees Celsius.", fahrenheit, celsius);
	}

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("Enter value in C. to convert it > ");
		
		convertC2F(scanner.nextFloat());
		
	}

}
