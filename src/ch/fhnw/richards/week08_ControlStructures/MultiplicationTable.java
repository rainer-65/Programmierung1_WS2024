package ch.fhnw.richards.week08_ControlStructures;

public class MultiplicationTable {

	public static void main(String[] args) {
		for (int row = 1; row <= 9; row++) {
			for (int column = 1; column <= 9; column++) {
				int product = row * column;
				if (product < 10) System.out.print(" ");
				System.out.print(product + "  ");
			}
			System.out.println();
		}
	}

}
