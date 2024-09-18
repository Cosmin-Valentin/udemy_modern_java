package application;

public class App implements Runnable{

	private String name = "MJ";
	
	class Runner2 implements Runnable {

		@Override
		public void run() {
			System.out.println(name);
			
		}
		
	}
	
	static class Runner3 implements Runnable {

		private String name;
		
		public Runner3(String name) {
			this.name = name;
		}
		
		@Override
		public void run() {
			System.out.println(name);
			
		}
		
	}
	
	public static void main(String[] args) {
		
		new App().start();

	}
	
	public void start() {
//		Static inner class
		activate(new Runner3(name));
		
//		Non static inner class
		activate(new Runner2());
		
//		Method local inner class
		class Runner1 implements Runnable {
			public void run() {
				System.out.println(name);
			}
		}
		activate(new Runner1());
		
//		App implements Runnable
		activate(this);
		
//		Anonymous class
		activate(new Runnable() {
			public void run() {
				System.out.println(name);
			}
		});
	}
	
	public void activate(Runnable runnable) {
		runnable.run();
	}

	@Override
	public void run() {
		System.out.println(name);
		
	}

}
