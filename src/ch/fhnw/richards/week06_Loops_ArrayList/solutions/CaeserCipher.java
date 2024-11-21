package ch.fhnw.richards.week06_Loops_ArrayList.solutions;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class CaeserCipher extends Application {
	private Label lblStringIn = new Label("Text to encrypt/decrypt");
	private TextField txtStringIn = new TextField();
	private Label lblNumberIn = new Label("Encoding number (1 to 25)");
	private TextField txtNumberIn = new TextField();
	private Button btnEncrypt = new Button("Encrypt");
	private Button btnDecrypt = new Button("Decrypt");
	private Label lblResult = new Label("Result");
	private TextField txtResult = new TextField();
	
	public static void main(String[] args) {
		launch(args);
	}

	@Override
	public void start(Stage primaryStage) throws Exception {
		VBox root = new VBox();
		
		HBox hBox = new HBox();
		hBox.getChildren().add(lblStringIn);
		hBox.getChildren().add(txtStringIn);
		root.getChildren().add(hBox);
		
		hBox = new HBox();
		hBox.getChildren().add(lblNumberIn);
		hBox.getChildren().add(txtNumberIn);
		root.getChildren().add(hBox);

		hBox = new HBox();
		hBox.getChildren().add(btnEncrypt);
		hBox.getChildren().add(btnDecrypt);
		root.getChildren().add(hBox);
		
		hBox = new HBox();
		hBox.getChildren().add(lblResult);
		hBox.getChildren().add(txtResult);
		root.getChildren().add(hBox);
		
		// Event handling
		btnEncrypt.setOnAction((event) -> {
			encrypt();
		});
		btnDecrypt.setOnAction((event) -> {
			decrypt();
		});
		
	    // Create the scene using our layout; then display it
	    Scene scene = new Scene(root, 500, 200);
//		scene.getStylesheets().add(getClass().getResource("styles.css").toExternalForm());
	    primaryStage.setTitle("Caeser cipher");
	    primaryStage.setScene(scene);
	    primaryStage.show();
	}

	private void encrypt() {
		int shift = Integer.parseInt(txtNumberIn.getText()); // No exception handling
		String in = txtStringIn.getText();
		String out = shiftCharacters(in, shift);
		txtResult.setText(out);
	}
	
	private void decrypt() {
		int shift = Integer.parseInt(txtNumberIn.getText()); // No exception handling
		String in = txtStringIn.getText();
		String out = shiftCharacters(in, -shift);
		txtResult.setText(out);
	}
	
	// We only encode letters A-Z, a-z and digits 0-9
	// Really, this should be done with a StringBuffer, but that is only efficiency.
	// The logic would remain the same.
	private String shiftCharacters(String in, int shift) {
		String out = "";
		for (int i = 0; i < in.length(); i++) {
			char c = in.charAt(i);
			if (c >= 'A' && c <= 'Z') {
				c = (char) (c + shift);
				if (c < 'A') c = (char) (c + 26);
				if (c > 'Z') c = (char) (c - 26);
			} else if (c >= 'a' && c <= 'z') {
				c = (char) (c + shift);
				if (c < 'a') c = (char) (c + 26);
				if (c > 'z') c = (char) (c - 26);
			} else if (c >= '0' && c <= '9') {
				c = (char) (c + shift);
				if (c < '0') c = (char) (c + 10);
				if (c > '9') c = (char) (c - 10);
			}
			out = out + c;
		}
		return out;
	}
}