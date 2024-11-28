package ch.fhnw.richards.week10_Arrays;

public class MultiplicationTable {

	public static void main(String[] args) {
		int[][] products = new int[9][9];
		
		for (int row = 1; row <= 9; row++) {
			for (int col = 1; col <= 9; col++) {
				products[row-1][col-1] = row * col;
			}
		}
		
		// Print column numbers
		System.out.print("     ");
		for (int i = 1; i <= 9; i++) printNumber(i, 3);
		System.out.println(); System.out.println();
		
		// Print the products, row-by-row
		for (int row = 1; row <= 9; row++) {
			// Print row number, and following spaces
			printNumber(row, 3); System.out.print("  ");
			
			// Print row entries
			for (int col = 1; col <= 9; col++) {
				printNumber(products[row-1][col-1], 3);
			}
			
			// End the row
			System.out.println();
		}
	}

	/**
	 * Method to print a number, making sure it takes up at least n columns.
	 * If the number is too short, fill with spaces
	 */
	private static void printNumber(int number, int n) {
		int numDigits = 1;
		int tmp = number;
		while (tmp >= 10) {
			tmp = tmp / 10;
			numDigits++;
		}

		for (int i = 1; i <= (n - numDigits); i++) {
			System.out.print(" ");
		}
		
		System.out.print(number);
	}
}
