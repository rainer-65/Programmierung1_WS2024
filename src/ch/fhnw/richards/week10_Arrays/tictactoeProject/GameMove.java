package ch.fhnw.richards.week10_Arrays.tictactoeProject;

public class GameMove {
	private int row;
	private int col;
	private GameSymbol gameSymbol;
	
	public GameMove(int col, int row, GameSymbol move) {
		this.col = col;
		this.row = row;
		this.gameSymbol = move;
	}

	public int getRow() {
		return row;
	}

	public int getCol() {
		return col;
	}

	public GameSymbol getGameSymbol() {
		return gameSymbol;
	}
}
