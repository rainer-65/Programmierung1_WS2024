package ch.fhnw.richards.week10_Arrays.tictactoeProject;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class TicTacToe extends Application {	
	private Button[][] buttons = new Button[3][3];
	private Label lblResult = new Label();
	private GameLogic game;
	private AI_API ai; // Any AI implementation could be used
	
	public static void main(String[] args) {
		launch(args);
	}

	@Override
	public void start(Stage primaryStage) throws Exception {
		// Create the Game object that represents the status of the game
		game = new GameLogic();
		
		// Create the AI from a specific implementation. This could be
		// any class that implements AI_API
		ai = new AI_Random(); // TODO: create an object of your improved player
		
		GridPane grid = new GridPane();

		// Create the buttons: 3 columns & 3 rows
		for (int col = 0; col < 3; col++) {
			for (int row = 0; row < 3; row++) {
				// Create button for this position
				Button btn = new Button();
				grid.add(btn, col, row);
				buttons[col][row] = btn;
				
				// Set button size
				btn.setPrefSize(120, 120);
				
				// What happens when clicked?
				btn.setOnAction( this::doButtonClick );
			}
		}
		
		VBox root = new VBox(10, grid, lblResult);
		
		// Create the scene using our layout; then display it
		Scene scene = new Scene(root);
		scene.getStylesheets().add(
				getClass().getResource("TicTacToe.css").toExternalForm());
		primaryStage.setScene(scene);
		primaryStage.setTitle("Tic-Tac-Toe");
		primaryStage.show();
	}

	/**
	 * When a player clicks a button, the UI attempts to place an X at this position, by calling the appropriate method of the Game class.
	 * 
	 * If the move is valid, then we check if the game is over
	 * 
	 * - If the game is not over, let the AI player make a move, and check if the game is over
	 * 
	 * Update the display of the board: get the board from the game and set the button-texts
	 * 
	 * If the game is over, display the result
	 * 
	 * Note: this method does nothing, if the game is already over (lblResult contains text)
	 */
	private void doButtonClick(ActionEvent e) {
		if (lblResult.getText().length() > 0) return; // Do nothing, if game is over
		
		// Figure out which button was clicked, by column and row
		int colClicked = -1;
		int rowClicked = -1;
		Button btn = (Button) e.getSource();
		for (int col = 0; col < 3; col++) {
			for (int row = 0; row < 3; row++) {
				if (buttons[col][row] == btn) {
					colClicked = col;
					rowClicked = row;
				}
			}
		}
		
		// Game result: null if not over
		String result = null;
		
		// Create a new game move, and make the move
		GameMove move = new GameMove(colClicked, rowClicked, GameSymbol.X);
		boolean valid = game.makeMove(move);
		
		if (valid) {
			result = game.getGameResult();

			// If game not over, get AI move, and check result again
			if (result == null) {
				GameMove aiMove = ai.getMove(game.getBoard());
				game.makeMove(aiMove);
				result = game.getGameResult();
			}
		}
		
		// Update the game as displayed on the buttons
		updateDisplay(game.getBoard());
		
		// If the game is over, display the result
		if (result != null) lblResult.setText(result);
	}
	
	private void updateDisplay(GameSymbol[][] board) {
		for (int col = 0; col < 3; col++) {
			for (int row = 0; row < 3; row++) {
				GameSymbol move = board[col][row];
				buttons[col][row].setText(move == null ? "" : move.toString());
			}
		}
	}
}
