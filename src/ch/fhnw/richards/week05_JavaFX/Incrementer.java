package ch.fhnw.richards.week05_JavaFX;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;

public class Incrementer extends Application {
	private Integer value = 1; // the value to be displayed

	// If a control will be accessed from various places,
	// then declare it as an instance attribute
	Label valueLabel = new Label();

	public static void main(String[] args) {
		launch(args);
	}

	@Override
	public void start(Stage primaryStage) {
		GridPane root = new GridPane();

		Button btn = new Button("Increment");

		root.add(valueLabel, 0, 0);
		root.add(btn, 0, 1);

		setValueLabel();

		btn.setOnAction(this::onClick);

		// Create the scene using our layout; then display it
		Scene scene = new Scene(root);
		primaryStage.setTitle("Incrementer");
		primaryStage.setScene(scene);
		primaryStage.show();
	}

	private void setValueLabel() {
		valueLabel.setText(value.toString());
	}
	
	private void onClick(ActionEvent e) {
		value++;
		setValueLabel();
	}
}
