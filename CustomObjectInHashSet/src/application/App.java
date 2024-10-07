package application;

import java.util.HashSet;
import java.util.Objects;

class Creature {
	public int id;
	public String name;

	public Creature(int id, String name) {
		this.id = id;
		this.name = name;
	}

	public String toString() {
		return id + ": " + name;
	}

	@Override
	public int hashCode() {
		return Objects.hash(id);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Creature other = (Creature) obj;
		return id == other.id;
	}
}

public class App {

	public static void main(String[] args) {
		
		HashSet<Creature> creatures = new HashSet<>();
		
		creatures.add(new Creature(0, "mouse"));
		creatures.add(new Creature(1, "cat"));
		creatures.add(new Creature(0, "mongoose"));
		creatures.add(new Creature(2, "dog"));
		
		creatures.forEach(System.out::println);
	}
}
