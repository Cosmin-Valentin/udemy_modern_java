package application;

public class App {

	public static void main(String[] args) {

		int value = 0xFF;
		
		int result = value << 8;
		
		System.out.printf("%08x\n", value);
		System.out.printf("%08x\n", result);
		System.out.println();
		
		int color = 0x00123456;
		
		int red = (color & 0xFF0000) >> 16;
		int green = (color & 0xFF00) >> 8;
		int blue = color & 0xFF;
		
		System.out.printf("red: %08x\n", red);
		System.out.printf("green: %08x\n", green);
		System.out.printf("blue: %08x\n", blue);
		System.out.println();
		
		int recombinedColor = (red << 16) | (green << 8) | blue;
		
		System.out.printf("hex color: %08x\n", recombinedColor);
	}
}
