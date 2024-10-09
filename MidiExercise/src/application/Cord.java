package application;

import java.util.HashSet;

public class Cord extends HashSet<Integer>{
	private static final long serialVersionUID = 1L;
	
	public enum Type {
		MAJOR,
		MINOR,
		SUS4
	}
	
	public Cord(int root, Type type) {
		add(root);
		add(root + 7);
		
		switch(type) {
		case MAJOR:
			add(root + 4);
			break;
		case MINOR:
			add(root + 3);
			break;
		case SUS4:
			add(root + 5);
			break;
		}
	}
}
