package model;

import java.util.Arrays;
import java.util.Random;

public class World {

	private int rows;
	private int columns;

	private boolean[][] grid;

	public World(int rows, int columns) {
		this.rows = rows;
		this.columns = columns;

		grid = new boolean[rows][columns];
	}

	public boolean getCell(int row, int column) {
		return grid[row][column];
	}

	public void setCell(int row, int column, boolean status) {
		grid[row][column] = status;
	}

	public int getRows() {
		return rows;
	}

	public int getColumns() {
		return columns;
	}

	public void randomize() {
		Random random = new Random();
		clear();
		for (int i = 0; i < (rows * columns / 10); i++) {
			int row = random.nextInt(rows);
			int col = random.nextInt(columns);

			setCell(row, col, true);
		}
	}

	public void clear() {
		for (int row = 0; row < rows; row++) {
			Arrays.fill(grid[row], false);
		}
	}

	private int countNeightbours(int row, int col) {
		int neighbours = 0;

		for (int rowOffset = -1; rowOffset <= 1; rowOffset++) {
			for (int colOffset = -1; colOffset <= 1; colOffset++) {
				if (rowOffset == 0 && colOffset == 0) {
					continue;
				}
				int gridRow = row + rowOffset;
				int gridCol = col + colOffset;

				if (gridRow < 0) {
					continue;
				} else if (gridRow == rows) {
					continue;
				}

				if (gridCol < 0 || gridCol == columns) {
					continue;
				}

				boolean status = getCell(gridRow, gridCol);
				
				if (status) {
					neighbours++;
				}
			}
		}
		
		return neighbours;
	}

	public void next() {
		for (int row = 0; row < rows; row++) {
			for (int col = 0; col < columns; col++) {
				int neighbours = countNeightbours(row, col);
				System.out.println("(" + row + ", " + col + ")" + neighbours);
			}
		}
	}
}
