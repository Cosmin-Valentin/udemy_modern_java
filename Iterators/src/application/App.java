package application;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class App {

	public static void main(String[] args) {

		ArrayList<Integer> list = new ArrayList<>(List.of(1,2,3,4,5));
		
		Iterator<Integer> it = list.iterator();
		
		while(it.hasNext()) {
			System.out.println(it.next());
		}
		
//		for (int i = 0; i < list.size(); i++) {
//			System.out.println(it.next());
//		}
		
//		for(Iterator<Integer> it = list.iterator(); it.hasNext();) {
//			Integer number = it.next();
//			
//			System.out.println(number);
//		}
	}
}
