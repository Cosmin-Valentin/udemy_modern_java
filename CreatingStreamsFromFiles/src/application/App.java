package application;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

public class App {

	public static void main(String[] args) throws IOException {
		
		Files.lines(Paths.get("greatExpectations.txt")).forEach(System.out::println);;

	}
}
