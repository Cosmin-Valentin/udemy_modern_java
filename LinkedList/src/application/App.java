package application;

import java.util.Collections;
import java.util.LinkedList;

public class App {

	public static void main(String[] args) {

		LinkedList<String> texts = new LinkedList<>();
		
		texts.add("dog");
		texts.add("cat");
		texts.add("rat");
		
		Collections.sort(texts);

		for(var text: texts) {
			System.out.println(text);
		}
		
		 
		
	}
}
