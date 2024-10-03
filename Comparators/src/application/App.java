package application;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class App {

	public static void main(String[] args) {

		var list = new ArrayList<Integer>();
		Scanner scanner = new Scanner(System.in);
		
		boolean isRunning = true;
		while(isRunning) {
			System.out.println("Enter a number >");
			
			if(scanner.hasNextInt()) {
				list.add(scanner.nextInt());				
			} else {
				if(scanner.next().equals("stop")) {
					isRunning = false;
				}
			}
		}
		
		Collections.sort(list);
		list.forEach(e -> {
			System.out.print(e + " ");
		});
		System.out.println();
		int sum = 0;
		for(int j = 0; j < list.size(); j++) {
			sum += list.get(j);
		}
		
		System.out.println("Average value is: " + (sum/list.size()));
		
		scanner.close();
		
	}
}
