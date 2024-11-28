package ch.fhnw.richards.week10_Arrays.tictactoeProject;

/**
 * Represents a TicTacToe game as an array of GameSymbol objects. Where no move
 * has been made, the array entry is null. This class also defines the following
 * methods:
 * 
 * - String gameOver() returns a String with the game result, or null if the
 * game is not over
 * 
 * - GameSymbol[][] getBoard() returns a *copy* of the current board
 * 
 * - boolean makeMove(GameMove) makes the given move and returns true (if
 * valid); otherwise does nothing and returns false
 */
public class GameLogic {
	private GameSymbol[][] board = new GameSymbol[3][3];

	/** Default constructor, shown for completeness */
	public GameLogic() {
	}

	/**
	 * Return a *copy* of the game board, to prevent cheating
	 * 
	 * Step 1: Create a new array of the correct size
	 * 
	 * Step 2: Use two nested loops to copy the contents into the copy
	 * 
	 * Step 3: Return the copy
	 */
	public GameSymbol[][] getBoard() {
		return null; // TODO
	}

	/**
	 * Check columns, rows and diagonals for three identical symbols. If no winner
	 * found, check for draw.
	 * 
	 * Hint: Start simple! Just check for winners in the rows. Then add the columns.
	 * Finally, add the diagonals.
	 */
	public String getGameResult() {
		return null; // TODO
	}

	/**
	 * Place the given move onto the board, if it is valid.
	 * 
	 * A move is valid if the specified location on the board is currently null
	 * 
	 * @return true if move is valid, false if move cannot be made
	 */
	public boolean makeMove(GameMove move) {
		return false; // TODO
	}
}
