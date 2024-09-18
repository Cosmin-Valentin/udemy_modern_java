package application;

import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

public class App {

	private String name;
	
	public App() {
		name = "Elizabeth";
	}
	
	public static void main(String[] args) {
		
		new App().run();
	
	}
	
	public void run() {
		
		class Printer implements Runnable {
			public void print() {
				System.out.println(name);
			}

			@Override
			public void run() {
				print();
			}
		}
		
//		new Printer().print();
		
		ScheduledExecutorService service = Executors.newScheduledThreadPool(1);
		service.scheduleAtFixedRate(new Printer(), 0, 1, TimeUnit.SECONDS);
	}

}
