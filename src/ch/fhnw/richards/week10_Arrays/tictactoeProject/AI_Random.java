package ch.fhnw.richards.week10_Arrays.tictactoeProject;

/**
 * This class represents a computer player. It provides a single method
 * 
 * - GameMove getMove(GameSymbol[][] board) given a board, make a move
 * 
 * In this simple version of the game, the computer player must always make
 * moves as 'O'
 * 
 * This player simply makes random moves. Your goal is to create a different,
 * better player. You should do that in a separate class that also implements
 * the AI_API interface.
 */
public class AI_Random implements AI_API {

	/** Default constructor, shown for completeness */
	public AI_Random() {
	}

	/**
	 * We assume that this method will not be called unless a move is actually
	 * possible, i.e., the board is not completely full.
	 * 
	 * 
	 * In this AI, we just randomly search for an empty space, until we find one.
	 */
	public GameMove getMove(GameSymbol[][] board) {
		boolean moveFound = false;
		int col = 0;
		int row = 0;
		while (!moveFound) {
			col = (int) (Math.random() * 3);
			row = (int) (Math.random() * 3);
			
			moveFound = (board[col][row] == null);
		}

		return new GameMove(col, row, GameSymbol.O);
	}
}
