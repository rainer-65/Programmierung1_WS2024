package ch.fhnw.richards.week05_JavaFX.solutions;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;

public class MagicSquare extends Application {
	

	@Override
	public void start(Stage primaryStage) throws Exception {
		GridPane root = new GridPane();
		
		Label lbl00 = new Label("4");
		Label lbl01 = new Label("3");
		Label lbl02 = new Label("8");
		Label lbl10 = new Label("9");
		Label lbl11 = new Label("5");
		Label lbl12 = new Label("1");
		Label lbl20 = new Label("2");
		Label lbl21 = new Label("7");
		Label lbl22 = new Label("6");	
		
		root.addColumn(0, lbl00, lbl01, lbl02);
		root.addColumn(1, lbl10, lbl11, lbl12);
		root.addColumn(2, lbl20, lbl21, lbl22);
		
		Scene scene = new Scene(root);
		scene.getStylesheets().add(
				getClass().getResource("magicSquare.css").toExternalForm());
		primaryStage.setTitle("Magic Square");
		primaryStage.setScene(scene);
		primaryStage.show();
	}

	public static void main(String[] args) {
		launch(args);
	}

}
