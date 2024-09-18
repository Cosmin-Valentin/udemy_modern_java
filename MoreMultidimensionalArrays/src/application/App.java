package application;

public class App {

	public static void main(String[] args) {

		int[][] numbers = new int[][] { 
				{ 1, 3, 5 }, 
				{ 2, 4, 6 }, 
				{ 7, 14, 21 }, 
		};

		int total = 0;
		
		for (int i = 0; i < numbers.length; i++) {

			for (int j = 0; j < numbers[i].length; j++) {
				if (i == j) {

					System.out.printf("%d\t", numbers[i][j]);
					total += numbers[i][j];

				} else {

					System.out.printf("-\t");
				}
			}

			System.out.println();
		}

		System.out.println("Diagonal total is > " + total);
	}

}
