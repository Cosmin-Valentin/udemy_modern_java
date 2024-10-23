package application;

@FunctionalInterface
interface Runner {
	void execute(String text);
}

public class App {

	public static void main(String[] args) {

		Runner run1 = (String text) -> {
			System.out.println(text);
		};

		run1.execute("Hello");

		Runner run2 = (t) -> {
			System.out.println(t);
		};

		run2.execute("Hello2");

		Runner run3 = t -> {
			System.out.println(t);
		};

		run3.execute("Hello3");

		Runner run4 = t -> System.out.println(t);

		run4.execute("Hello4");
	}
}
