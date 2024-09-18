package application;

public class Dog {
	
	private String name;
	private int id;
	private static int count;
	
	public static double averageHeight = 60.0;
	
	static {
		System.out.println("Hello");
	}
	
	public Dog(String name) {
		this.name = name;
		id = count++;
	}
	
	public String toString() {
		return String.format("Dog id: %d, name: %s\n", id, name);
	}
	
}
