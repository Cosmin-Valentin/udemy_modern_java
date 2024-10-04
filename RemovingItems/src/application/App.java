package application;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

class Cat {
	private String name;
	
	public Cat(String name) {
		this.name = name;
	}
	
	public String toString() {
		return name;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Cat other = (Cat) obj;
		return Objects.equals(name, other.name);
	}
}

public class App {

	public static void main(String[] args) {
		
		Cat tiddles = new Cat("Tiddles");

		List<Cat> cats = new ArrayList<>(List.of(tiddles, new Cat("Bertie"), new Cat("Mathilda"), new Cat("Scruff")));
		
		cats.remove(1);
		
		cats.remove(tiddles);
		
		cats.forEach(System.out::println);
		
		
	}
}
