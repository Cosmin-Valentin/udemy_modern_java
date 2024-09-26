package model;

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
}
