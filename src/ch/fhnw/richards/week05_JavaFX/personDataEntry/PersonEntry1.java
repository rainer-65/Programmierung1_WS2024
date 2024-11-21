package ch.fhnw.richards.week05_JavaFX.personDataEntry;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.Pane;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class PersonEntry1 extends Application {
	Person person;

	public static void main(String[] args) {
		launch(args);
	}

	@Override
	public void start(Stage primaryStage) {
		VBox root = new VBox();
		root.getChildren().add(createDataEntryPane());
		root.getChildren().add(createButtonPane());
		root.getChildren().add(createDataDisplayPane());

		// Create the scene using our layout; then display it
		Scene scene = new Scene(root);
		scene.getStylesheets().add(getClass().getResource("PersonEntry1.css").toExternalForm());
		primaryStage.setTitle("Enter and display a person");
		primaryStage.setScene(scene);
		primaryStage.show();
	}

	private Pane createDataEntryPane() {
		GridPane pane = new GridPane();
		pane.setId("dataEntry"); // ID for CSS formatting		
		pane.add(new Label("Data entry area"), 0, 0);		
		return pane;
	}

	private Pane createButtonPane() {
		HBox pane = new HBox();
		pane.setId("buttonArea"); // ID for CSS formatting	
		pane.getChildren().add(new Label("Button area"));
		return pane;
	}

	private Pane createDataDisplayPane() {
		GridPane pane = new GridPane();
		pane.setId("dataDisplay"); // ID for CSS formatting		
		pane.add(new Label("Data display area"), 0, 0);		
		return pane;
	}

}
