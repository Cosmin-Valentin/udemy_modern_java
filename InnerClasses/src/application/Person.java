package application;

public class Person {

	private String name;
	
	private class Printer {
		
		public void print() {
			System.out.println(name);
		}
		
	}
	
	public Person(String name) {
		this.name = name;
	}
	
	public void dispay() {
		Printer printer = new Printer();
		printer.print();
	}
	
}
