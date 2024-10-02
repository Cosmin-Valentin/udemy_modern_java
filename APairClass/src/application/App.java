package application;

import collections.Pair;
import heirarchy.Cat;

public class App {

	public static void main(String[] args) {

		Pair<Integer, Cat> p1 = new Pair<>(3, new Cat("Turin"));
		
		System.out.println(p1.getOne());
		System.out.println(p1.getTwo());
		System.out.println(p1);
	}
}
