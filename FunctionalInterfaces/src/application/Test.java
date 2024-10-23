package application;

@FunctionalInterface
public interface Test {
	void run();
	public default void run2() {};
}
