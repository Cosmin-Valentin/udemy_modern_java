package application;

public class App {
	
	public static void main(String[] args) {
		
		int i = 3;
		
		int a = i++;
		
		System.out.printf("a: %d, i: %d\n",a, i);
		
		int giraffes = 10;
		
		int animals = i + giraffes++;
		
		System.out.println(animals);
		
		int apples = 5;
		int bananas = 4;
		int fruits = ++apples + bananas++;
		System.out.println(fruits);
	}
	
}
