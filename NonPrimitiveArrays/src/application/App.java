package application;

public class App {

	public static void main(String[] args) {

//		Multidimensional arrays

		var text = new String[][] { 
				{ "One", "Three", "Five", "Seven", "Nine", "Eleven" }, 
				{ "Two", "Four", "Six" }, 
				{ "Cow", "Ox", "Fox", "Bumblebee" } 
		};

		for (int i = 0; i < text.length; i++) {
			
			for (int j = 0; j < text[i].length; j++) {
				System.out.printf("%s\t", text[i][j]);
			}
			
			System.out.println();
		}
	}

}
