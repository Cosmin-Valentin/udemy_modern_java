package application;

import java.util.ArrayList;
import java.util.List;

public class App {

	public static void main(String[] args) {

		ArrayList<Integer> list = new ArrayList<>(List.of(1,2,3,4,5));
		
		for(var it = list.listIterator(); it.hasNext();) {
			var number = it.next();
			
			if(number.equals(2)) {
				it.remove();
			} else if (number.equals(3)) {
				it.add(10);
			} else if (number.equals(1)) {
				it.set(101);
			}
			System.out.println(number);
		}
		System.out.println();
		
		list.forEach(System.out::println);
	}
}
