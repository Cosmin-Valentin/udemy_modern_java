package application;

public class App {

	public static void main(String[] args) {

		int LENGTH = 12;

		int[][] multiplicationTable = new int[LENGTH][LENGTH];

		for (int i = 0; i < LENGTH; i++) {
			for (int j = 0; j < LENGTH; j++) {
				
				multiplicationTable[i][j] = (j + 1) * (i + 1);
				System.out.printf("%3d\t", multiplicationTable[i][j]);
			}

			System.out.println();
		}
	}
}
