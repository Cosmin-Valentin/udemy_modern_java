package application;

public class App {

	public static void main(String[] args) {

		int value = 0b00010001;

		System.out.println(toBinary(value));

		int result1 = value << 3;

		System.out.println(toBinary(result1));

		int result2 = result1 >> 2;

		System.out.println(toBinary(result2));
		
		System.out.println(100 << 3); // 100 * 2^3
		System.out.println(101 >> 1); // 100 / 2^1
	}

	public static String toBinary(int value) {
		return String.format("%8s", Integer.toBinaryString(value)).replace(" ", "0");
	}
}
