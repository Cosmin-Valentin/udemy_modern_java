package ncv;

public class App {

	static void convertC2F(double celsius) {
		double fahrenheit = celsius * (9.0 / 5.0) + 32;
		System.out.println(fahrenheit + " degrees Fahrenheit is " + celsius + " degrees Celsius.");
	}

	public static void main(String[] args) {
		convertC2F(32);

	}

}
