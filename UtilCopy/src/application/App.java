package application;

import collections.Array;
import collections.Util;
import heirarchy.Cat;
import heirarchy.Creature;

public class App {

	public static void main(String[] args) {

		Array<Cat> source = new Array<>(2);
		source.add(new Cat("dog"));
		source.add(new Cat("cat"));

		Array<Creature> dest = new Array<>(2);
		Util.copy(source, dest);

		for (int i = 0; i < dest.size(); i++) {
			System.out.println(dest.get(i));
		}
	}
}
