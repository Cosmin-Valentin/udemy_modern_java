package application;

import java.io.File;

public class App {

	public static void main(String[] args) {

		String fileLocation = "D:\\2024\\Java\\FileLocations\\test.txt";
		
		System.out.println(new File(fileLocation).exists());
		
	}

}
