package gui;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;

import javax.swing.JPanel;

import model.World;

public class GamePanel extends JPanel {

	private static final long serialVersionUID = 1L;

	private final static int CELLSIZE = 50;

	private final static Color backgroundColor = Color.BLACK;
	private final static Color foregroundColor = Color.GREEN;
	private final static Color gridColor = Color.GRAY;

	private int topBottomMargin;
	private int leftRightMargin;

	public GamePanel() {

	}

	@Override
	protected void paintComponent(Graphics g) {
		Graphics2D g2 = (Graphics2D) g;

		int width = getWidth();
		int height = getHeight();

		leftRightMargin = ((width % CELLSIZE) + CELLSIZE) / 2;
		topBottomMargin = ((height % CELLSIZE) + CELLSIZE) / 2;
		
		int rows = (height - (2 * topBottomMargin)) / CELLSIZE;
		int columns = (width - (2 * leftRightMargin)) / CELLSIZE;
		
		World world = new World(rows, columns);
		world.setCell(1, 0, true);
		world.setCell(3, 5, true);

		g2.setColor(backgroundColor);
		g2.fillRect(0, 0, width, height);

		drawGrid(g2, width, height);
		
		for(int col = 0; col < columns; col++) {
			for(int row = 0; row < rows; row++) {
				boolean status = world.getCell(row, col);
				fillCell(g2, row, col, status);
			}
		}
	}

	private void fillCell(Graphics2D g2, int row, int col, boolean status) {
		
		Color color = status ? foregroundColor : backgroundColor;
		g2.setColor(color);
		
		int x = leftRightMargin + (col * CELLSIZE); 
		int y = topBottomMargin + (row * CELLSIZE); 
		
		g2.fillRect(x + 1, y + 1, CELLSIZE - 1, CELLSIZE - 1);
	}

	private void drawGrid(Graphics2D g2, int width, int height) {
		g2.setColor(gridColor);

		for (int x = leftRightMargin; x <= width - leftRightMargin; x += CELLSIZE) {
			g2.drawLine(x, topBottomMargin, x, height - topBottomMargin);
		}

		for (int y = topBottomMargin; y <= height - topBottomMargin; y += CELLSIZE) {
			g2.drawLine(leftRightMargin, y, width - leftRightMargin, y);
		}

	}
}
