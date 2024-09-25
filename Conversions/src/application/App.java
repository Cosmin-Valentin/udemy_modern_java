package application;

public class App {

	public static void main(String[] args) {

		int intValue1 = 8;
		long longValue1 = intValue1;
		System.out.println(longValue1);
		
		long longValue2 = 12345678901234L;
		int intValue2 = (int)longValue2;
		System.out.println(intValue2);
		
		int intValue3 = 23;
		byte byteValue = (byte)intValue3;
		System.out.println(byteValue);

	}

}
