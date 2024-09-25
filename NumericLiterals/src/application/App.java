package application;

public class App {

	public static void main(String[] args) {
		
		long lValue = 13348989876L;
		System.out.println(lValue);
		
		float fValue = 1.23f;
		System.out.println(fValue);
		
		byte bValue = (byte)128;
		System.out.println(bValue & 0xff);
		
		int iValue = 1_000_000;
		System.out.println(iValue);
		
		double dValue = 1.5E6;
		System.out.println(dValue);

	}

}
