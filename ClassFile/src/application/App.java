package application;

import java.io.DataInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class App {

	public static void main(String[] args) {

		String classFile = "D:\\2024\\Java\\ClassFile\\bin\\application\\App.class";
		
		File file = new File(classFile);
		
		if(!file.exists()) {
			System.out.println("File does not exists: " + classFile);
		}
		
		try(var dis = new DataInputStream(new FileInputStream(file))) {
			
			int magicNumber = dis.readInt();
			
			System.out.println(Integer.toHexString(magicNumber));
//			System.out.printf("%x\n", magicNumber);
			
			int minorVersion = dis.readUnsignedShort();
			int majorVersion = dis.readUnsignedShort();
			
			System.out.println(majorVersion + ", " + minorVersion);
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		System.out.println("Completed");
		
	}

}
