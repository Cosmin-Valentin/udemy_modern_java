package heirarchy;

public class Creature {
	
	private String name;
	
	public Creature(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return "Creature [name=" + name + "]";
	}
	
	
}