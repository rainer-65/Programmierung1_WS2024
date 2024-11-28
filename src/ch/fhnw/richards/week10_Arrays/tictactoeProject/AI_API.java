package ch.fhnw.richards.week10_Arrays.tictactoeProject;

/**
 * This interface defines the functionality (API) that an AI player must
 * provide.
 * 
 * Defining this in an interface allows the rest of the program to be written to
 * use *any* AI player that provides this functionality.
 */
public interface AI_API {
	public GameMove getMove(GameSymbol[][] board);
}
