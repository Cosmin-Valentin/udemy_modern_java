package application;

import java.util.ArrayList;

class RingBuffer {
	private Integer size;
	private ArrayList<Object> internalArray;
	private Integer position = 0;
	
	public RingBuffer(Integer size) {
		this.size = size;
		internalArray = new ArrayList<>(this.size);
	}
	
	public void add(Object obj) {
		if(internalArray.size() == size) {
			position = 0;
			internalArray.add(position, obj);
			internalArray.removeLast();
		} else {
			internalArray.add(position++, obj);
		}
	}
	
	public Object get(Integer index) {
		return internalArray.get(index);
	}
	
	public Integer size() {
		return internalArray.size();
	}
}

class Color {
	private String color;
	
	public Color(String color) {
		this.color = color;
	}
	
	public String toString() {
		return color;
	}
}

public class App {

	public static void main(String[] args) {

		RingBuffer b = new RingBuffer(3);
		
		b.add(new Color("blue"));
		b.add(new Color("red"));
		b.add(new Color("yellow"));
		b.add(new Color("green"));
		b.add(new Color("black"));
		
		for (int i = 0; i < b.size(); i++) {
			System.out.println(b.get(i));
		}
		
	}
}
