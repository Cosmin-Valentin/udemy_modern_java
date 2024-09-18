package application;

import java.util.Timer;
import java.util.TimerTask;

public class App {

	public static void main(String[] args) {
		
		Timer timer = new Timer();
		timer.scheduleAtFixedRate(new Task(), 0, 500);
		

	}

}

class Task extends TimerTask {

	@Override
	public void run() {
		System.out.println("Hello.");
		
	}
	
}
