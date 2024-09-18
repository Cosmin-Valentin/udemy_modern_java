package package2;

import package1.Person;

public class Employee extends Person {
	
	public Employee(String name) {
		super(name);
		
		System.out.println(this.name);
	}
}
