package ch.fhnw.richards.week05_JavaFX.solutions;

import java.util.Random;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

/**
 * In this solution, we omit the menu entries. You are welcome to add the menu
 * entries on your own.
 */
public class Spiel extends Application {
	private Random random = new Random(); // We need a random number generator!
	private int secretNumber;

	private Label lblDescription = new Label("Ich denke an eine Zahl zwischen 1 und 10");
	private Label lblInstructions = new Label("Raten Sie:");
	private TextField txtGuess = new TextField();
	private Button btnValidate = new Button("Validieren");
	private Label lblTip = new Label("Tipp:");
	private Button btnNewGame = new Button("Neues Spiel?");

	public static void main(String[] args) {
		launch();
	}

	@Override
	public void start(Stage primaryStage) throws Exception {
		// The root layout is a VBox
		VBox root = new VBox(10); // VBox with internal spacing of 10px
		root.setAlignment(Pos.CENTER); // Center the contents

		root.getChildren().addAll(lblDescription, lblInstructions, txtGuess, btnValidate, lblTip, btnNewGame);

		// Call a method to set the secret number
		createSecretNumber();
		
		// Tell the buttons what to do
		btnValidate.setOnAction(this::validateGuess);
		btnNewGame.setOnAction(this::newGame);

		Scene scene = new Scene(root);
		primaryStage.setTitle("High Low Ratespiel");
		primaryStage.setScene(scene);
		primaryStage.show();
	}

	/**
	 * Create a new secret number. We need this twice: once when the program starts,
	 * and once when the user asks for a new game. When you need the same code more
	 * than once, you should put it into a method!
	 */
	private void createSecretNumber() {
		secretNumber = random.nextInt(10) + 1;
	}
	
	private void validateGuess(ActionEvent e) {
		// Get guess from TextField, using Integer
		String contents = txtGuess.getText();
		int value = Integer.parseInt(contents);
		if (value < secretNumber)
			lblTip.setText("Tipp: zu tief");
		else if (value > secretNumber)
			lblTip.setText("Tipp: zu hoch");
		else // just right!
			lblTip.setText("Perfekt!");
	}
	
	private void newGame(ActionEvent e) {
		createSecretNumber();
		lblTip.setText("Tipp:");
		txtGuess.setText("");
	}
}
