package appliaction;

import java.util.Scanner;

public class App {

	public static void main(String[] args) {
		
		try(Database db = new Database("ab42")) {
			db.getData();
		} catch(Exception e) {
			System.out.println("Catching exception...");
			System.out.println(e.getMessage());
		} 
		
		try(Scanner scanner = new Scanner(System.in)) {
			System.out.println("Type something >");
			String input = scanner.nextLine();
			System.out.println("You typed: " + input);
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}
}
