package application;

public class App {

	private int count = 1;
	
	public static void main(String[] args) {
		
		new App().run();

	}
	
	public void run() {
		
		String name = "Peter";
//		name = "Sally";
		
		class Test {
			
			public void print() {
				System.out.println(count);
				System.out.println(name);
			}
			
		}
		
		new Test().print();
		
	}

}
