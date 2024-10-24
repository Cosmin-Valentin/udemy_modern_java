package application;

class Person {
	private String name;

	public Person(String name) {
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String toString() {
		return name;
	}
}

interface NameGetter {
	String get(Person p);
}

interface NameSetter {
	void set(Person p, String n);
}

public class App {

	public static void main(String[] args) {

		Person person = new Person("Joe");
		
		NameGetter getter1 = p -> p.getName();
		
		System.out.println(getter1.get(person));
		
		NameGetter getter2 = Person::getName;
		
		System.out.println(getter2.get(person));
		
		NameSetter setter1 = (p, n) -> {
			p.setName(n);
		};
		
		setter1.set(person, "Sue");
		
		System.out.println(getter2.get(person));
		
		NameSetter setter2 = Person::setName;
		
		setter2.set(person, "Ella");
		
		System.out.println(getter2.get(person));

	}
}
