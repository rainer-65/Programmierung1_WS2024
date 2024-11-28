package ch.fhnw.richards.week10_Arrays.solutions;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;

public class ReadFiveStringsGUI extends Application {

	private Label lblString = new Label("Enter string");
	private TextField txtString = new TextField();
	private Button btnSave = new Button("Save string");
	private Label lblProgress = new Label("0 of 5 strings");
	private Label lblResult = new Label();

	private String[] strings = new String[5];
	int stringsSaved = 0;

	public static void main(String[] args) {
		launch();
	}

	@Override
	public void start(Stage stage) throws Exception {
		GridPane root = new GridPane();
		root.add(lblString, 0, 0);
		root.add(txtString, 1, 0);

		root.add(btnSave, 0, 1);
		btnSave.setOnAction(e -> saveString());
		root.add(lblProgress, 1, 1);

		root.add(lblResult, 0, 2, 2, 1);

		Scene scene = new Scene(root);
		scene.getStylesheets().add(getClass().getResource("styles.css").toExternalForm());
		stage.setScene(scene);
		stage.setTitle("Five strings example");
		stage.show();
	}

	private void saveString() {
		strings[stringsSaved++] = txtString.getText();
		txtString.setText("");
		lblProgress.setText(stringsSaved + " of 5 strings");
		if (stringsSaved >= 5) {
			btnSave.setDisable(true);
			findFirstString();
		}
	}

	private void findFirstString() {
		// Find the alphabetical first
		int first = 0;
		for (int i = 1; i < strings.length; i++) {
			if (strings[i].compareTo(strings[first]) < 0) first = i;
		}
		lblResult.setText("The first string is: " + strings[first]);
	}
}
