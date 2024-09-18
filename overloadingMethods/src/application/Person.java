package application;

public class Person {
	public void greet() {
		System.out.println("hello");
	}
	
	public void greet(String nameToGreet) {
		System.out.println("Hello " + nameToGreet);
	}
	
	public void greet(int height) {
		if(height > 185) {
			System.out.println("You are very tall!");			
		}
	}
	
	public void greet(String name, int height) {
		if(height > 185) {
			System.out.println("You are very tall, " + name);			
		}
	}
}
