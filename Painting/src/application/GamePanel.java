package application;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;

import javax.swing.JPanel;

public class GamePanel extends JPanel {

	private static final long serialVersionUID = 1L;

	public GamePanel() {

	}

	@Override
	protected void paintComponent(Graphics g) {
		Graphics2D g2 = (Graphics2D)g;
		
		int width = getWidth();
		int heigh = getHeight();
		
		g2.setColor(Color.GREEN);
		g2.fillRect(0, 0, width, heigh);
		
	}
	
	
	
}
