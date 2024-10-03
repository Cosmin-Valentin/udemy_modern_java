package application;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class App {

	public static void main(String[] args) {

		System.out.println("Duration for ArrayList: " + timeIt(new ArrayList<Integer>()));
		System.out.println("Duration for LinkedList: " + timeIt(new LinkedList<Integer>()));
		
	}
	
	public static long timeIt(List<Integer> list) {
		
		long initialTime = System.currentTimeMillis();
		
		for(int i = 0; i < 1E5; i++) {
			list.add(0,i);
		}
		
		return System.currentTimeMillis()-initialTime;
	}
}
