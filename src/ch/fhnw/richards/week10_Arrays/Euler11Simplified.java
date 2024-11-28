package ch.fhnw.richards.week10_Arrays;

public class Euler11Simplified {
	private static int[][] numbers = { { 3, 6, 2, 8, 6 },
									   { 2, 1, 9, 3, 5 },
									   { 8, 4, 8, 2, 7 },
									   { 3, 1, 7, 3, 2 },
									   { 5, 3, 2, 8, 8 } };

	public static void main(String[] args) {
		int largest = 0;
		
		// Check horizontal products
		for (int[] row : numbers) {
			for (int col = 0; col < (row.length - 1); col++) {
				int product = row[col] * row[col+1];
				if (product > largest) largest = product;
			}
		}

		// Check vertical products
		for (int col = 0; col < numbers[0].length; col++) {
			for (int row = 0; row < (numbers.length - 1); row++) {
				int product = numbers[row][col] * numbers[row+1][col];
				if (product > largest) largest = product;
			}
		}
		
		// Print the answer
		System.out.println("Largest product is " + largest);
	}
}
