package application;

public enum Fruit {
	BANANA("yellow"), ORANGE("orange"), APPLE("green");
	
	private String color;
	
	Fruit(String color) {
		this.color = color;
	}
	
	public String toString() {
		return super.toString().toLowerCase() + " (" + color + ")";
	}
}
