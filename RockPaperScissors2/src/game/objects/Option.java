package game.objects;

public class Option implements Comparable<Option> {

	private int id;
	private String name;
	
	private int[][] comparison = {
			{0, -1, 1},
			{1, 0, -1},
			{-1, 1, 0},
	}; 
	
	@Override
	public int compareTo(Option other) {
		return comparison[id][other.id];
	}
	
	protected int getId() {
		return id;
	}

	protected void setId(int id) {
		this.id = id;
	}

	protected String getName() {
		return name;
	}

	protected void setName(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return name;
	}
}
