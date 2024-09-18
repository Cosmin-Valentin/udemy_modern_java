package application;

import java.util.Scanner;

public class App {
	
	static void kmToMi(int km) {
		double mi = km / 1.609;
		System.out.printf("%d kilometers is %.2f miles.", km, mi);
	}

	public static void main(String[] args) {
		System.out.println("Enter Kilometer value to convert > ");
		
		Scanner scanner = new Scanner(System.in);
		
		kmToMi(scanner.nextInt());
		
		scanner.close();
	}

}
