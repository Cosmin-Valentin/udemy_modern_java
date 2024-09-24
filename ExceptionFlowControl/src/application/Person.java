package application;

public class Person {

	public void setName(String name) throws Exception {
		if(name == null) {
			throw new Exception("Name cannot be null");
		}
		
		System.out.println("Name is set to: " + name);
	}
}
