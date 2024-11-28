package ch.fhnw.richards.week10_Arrays.mastermind;

import java.util.Scanner;

/**
 * Simplified version of the Mastermind game:
 * https://de.wikipedia.org/wiki/Mastermind_(Spiel)
 * 
 * We only have four possible colors, and we only tell the
 * user when colors are in the correct position (red pegs).
 */
public class mastermind {
	public enum Colors {
		BLUE, GREEN, YELLOW, RED
	};

	private static final int numColors = 4;

	public static void main(String[] args) {
		// Create a scanner to talk to the user
		Scanner in = new Scanner(System.in);
		System.out.println("Welcome to Mastermind!");

		// Create the puzzle
		Colors[] puzzle = createPuzzle();

		// While game not over, read and evaluate guess from user
		boolean gameOver = false;
		while (!gameOver) {
			Colors[] guess = readGuess(in);
			gameOver = evaluateGuess(puzzle, guess);
		}

		// Game over
		printPuzzle(puzzle);
		System.out.println("Game over!");
		in.close();
	}

	/**
	 * Create puzzle
	 */
	private static Colors[] createPuzzle() {
		Colors[] puzzle = new Colors[numColors];
		Colors[] allColors = Colors.values();

		for (int i = 0; i < numColors; i++) {
			int randomInt = (int) (Math.random() * allColors.length);
			puzzle[i] = allColors[randomInt];
		}
		return puzzle;
	}

	/**
	 * Print puzzle
	 */
	private static void printPuzzle(Colors[] puzzle) {
		for (Colors color : puzzle)
			System.out.print(color + " ");
	}

	/**
	 * Read guess from user
	 */
	private static Colors[] readGuess(Scanner in) {
		Colors[] guess = new Colors[numColors];
		System.out.println("Enter four colors separated by spaces (blue green yellow red)");
		for (int i = 0; i < numColors; i++) {
			String s = in.next();
			char c = s.toLowerCase().charAt(0);
			if (c == 'b')
				guess[i] = Colors.BLUE;
			else if (c == 'g')
				guess[i] = Colors.GREEN;
			else if (c == 'y')
				guess[i] = Colors.YELLOW;
			else
				guess[i] = Colors.RED;
		}
		in.nextLine();
		return guess;
	}

	/**
	 * Evaluate guess, give feedback, determine whether game is over
	 */
	private static boolean evaluateGuess(Colors[] puzzle, Colors[] guess) {
		int numCorrect = 0;
		for (int i = 0; i < numColors; i++) {
			if (puzzle[i] == guess[i]) numCorrect++;
		}
		System.out.println("You have " + numCorrect + " correct colors");
		return (numColors == numCorrect);
	}
}
