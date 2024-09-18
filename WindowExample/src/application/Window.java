package application;

public class Window {
	
	private int height;
	private int width;
	private String frameMaterial;
	private boolean isOpen;
	
	public void setHeight(int height) {
		this.height = height;
	}
	
	public void setWidth(int width) {
		this.width = width;
	}
	
	public void setFrameMaterial(String frameMaterial) {
		this.frameMaterial = frameMaterial;
	}
	
	public void setIsOpen(boolean isOpen) {
		this.isOpen = isOpen;
	}
	
	public int getHeight() {
		return this.height;
	}
	
	public int getWidth() {
		return this.width;
	}
	
	public String getFrameMaterial() {
		return this.frameMaterial;
	}
	
	public boolean getIsOpen() {
		return this.isOpen;
	}
}
