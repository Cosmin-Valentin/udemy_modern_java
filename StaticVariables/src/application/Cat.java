package application;

public class Cat {
	private String name;
	private int id;
	public static final String FOOD = "Cat food";
	private static int count = 0;

	public Cat(String name) {
		this.name = name;
		id = count;
		count++;
	}
	
	public static int getCount() {
		return count;
	}

	@Override
	public String toString() {
		return String.format("Cat id: %d, name: %s\n", id, name);
	}

}
