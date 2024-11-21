package ch.fhnw.richards.week05_JavaFX.solutions;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;

public class BankingApp extends Application {
	// Our only business data: the account balance
	private double accountBalance = 3452.75;
	
	// The two labels at the top of the GUI
	private Label lblAccountOwner = new Label("Max Muster");
	private Label lblAccountBalance = new Label("Kontostand: CHF " + accountBalance);
	
	// The controls in the GridPane, for user interaction
	private TextField txtWithdraw = new TextField();
	private TextField txtDeposit = new TextField();
	private Button btnWithdraw = new Button("Abheben");
	private Button btnDeposit = new Button("Einzahlen");
	private Button btnAddInterest = new Button("Zinsen Hinzufügen");

	public static void main(String[] args) {
		launch();
	}

	@Override
	public void start(Stage primaryStage) throws Exception {
		// The root layout is a GridPane, where the two labels are
		// displayed in two combined cells (to cover the entire row).
		//
		// An alternate layout: the root could be a VBox containing
		// two Labels and a GridPane. The GridPane contains the two
		// TextFields and three buttons
		GridPane root = new GridPane();
		root.setHgap(10); // Spacing between columns
		root.setVgap(10); // Spacing between rows
		root.setPadding(new Insets(10)); // Spacing around edge of grid
		
		// Place controls in grid
		root.add(lblAccountOwner, 0, 0, 2, 1); // Position column 0, row 0, span 2 columns and 1 row
		root.add(lblAccountBalance, 0, 1, 2, 1);
		root.add(txtWithdraw, 0, 2); // Position column 0, row 2
		root.add(btnWithdraw, 1, 2);
		root.add(txtDeposit, 0, 3);
		root.add(btnDeposit, 1, 3);
		root.add(btnAddInterest, 1, 4);
		
		// Event handling for two buttons
		btnWithdraw.setOnAction(this::withdraw);
		btnDeposit.setOnAction(this::deposit);

		Scene scene = new Scene(root);
		primaryStage.setTitle("Bankkonto App");
		primaryStage.setScene(scene);
		primaryStage.show();
	}
	
	/**
	 * To withdraw money, we must:
	 * - Get the contents of the TextField
	 * - Turn the String into a double
	 * - Change the balance
	 * - Update the label showing the balance
	 */
	private void withdraw(ActionEvent e) {
		String contents = txtWithdraw.getText();
		double withdrawAmount = Double.parseDouble(contents);
		accountBalance -= withdrawAmount;
		lblAccountBalance.setText("Kontostand: CHF " + accountBalance);
	}
	
	/**
	 * To deposit money, we must:
	 * - Get the contents of the TextField
	 * - Turn the String into a double
	 * - Change the balance
	 * - Update the label showing the balance
	 */
	private void deposit(ActionEvent e) {
		String contents = txtDeposit.getText();
		double depositAmount = Double.parseDouble(contents);
		accountBalance += depositAmount;
		lblAccountBalance.setText("Kontostand: CHF " + accountBalance);
	}

}
