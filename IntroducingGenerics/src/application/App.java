package application;

import collections.Wrapper;
import heirarchy.Cat;

public class App {

	public static void main(String[] args) {

		Wrapper<Cat> wrapper = new Wrapper<>();
		
		Cat cat = new Cat("Grasu");
		
		wrapper.setObj(cat);
		
		Cat retreived = wrapper.getObj();
		
		System.out.println(retreived);
	}
}
