package application;

import collections.Array;
import heirarchy.Cat;

public class App {

	public static void main(String[] args) {

		Array<Cat> cats = new Array<>(2);

		cats.add(new Cat("Grasu"));
		cats.add(new Cat("Turin"));

		Cat cat1 = cats.get(0);
		Cat cat2 = cats.get(1);

		System.out.println(cat1);
		System.out.println(cat2);

		System.out.println(cats);

		Cat c = find(cats, "Turins");
		System.out.println(c);
	}

	private static <T> T find(Array<T> array, String text) {

		for (int i = 0; i < array.size(); i++) {
			T value = array.get(i);

			if (value.toString().equals(text)) {
				return value;
			}
		}

		return null;
	}
}
