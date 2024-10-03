package application;

import java.util.ArrayList;

public class App {

	public static void main(String[] args) {

		ArrayList<Integer> list = new ArrayList<>();
//		var list = new ArrayList<Integer>();

		list.add(7);
		list.add(71);
		list.add(123);

		System.out.println(list.get(0));

		for (Integer n : list) {
			System.out.print(n + " ");
		}
		System.out.println();

		for (int i = 0; i < list.size(); i++) {
			Integer n = list.get(i);
			
			System.out.println(i + " : " + n);
		}
		System.out.println();
		
		list.forEach(System.out::println);
		System.out.println();
		
		list.forEach(e -> System.out.println(e));
	}
}
