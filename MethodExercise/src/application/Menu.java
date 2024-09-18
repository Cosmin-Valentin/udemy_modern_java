package application;

public class Menu {

	String[] options = { "View database", "Add new item", "Delete item", "Quit program" };

	String get() {

		String menuText = "Options: \n";

		for (int i = 0; i < options.length; i++) {

//			menuText += (i + 1) + ". " + options[i] + "\n";
			menuText += String.format("%d. %s\n", i, options[i]);

		}

		return menuText;
	}

}
