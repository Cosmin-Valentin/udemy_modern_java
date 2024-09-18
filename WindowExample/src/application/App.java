package application;

public class App {
	
	public static void main(String[] args) {
		
		Window ovenWindow = new Window();
		
		ovenWindow.setHeight(40);
		ovenWindow.setWidth(50);
		ovenWindow.setFrameMaterial("aluminium");
		ovenWindow.setIsOpen(false);
		
		System.out.printf("The oven window is %dcm high by %dcm wide and has an %s frame. BTW it is %s", ovenWindow.getHeight(), ovenWindow.getWidth(), ovenWindow.getFrameMaterial(), ovenWindow.getIsOpen());
		
	}
}
