package ch.fhnw.richards.week06_Loops_ArrayList.solutions.ArrayListDisplay;

import java.util.ArrayList;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;
import javafx.stage.Stage;

/**
 * Graphical view of an ArrayList containing strings. Top row contains controls
 * to add and delete elements. Bottom row displays labels representing the elements
 * in the ArrayList.
 */
public class ArrayListDisplay extends Application {
	// Create controls
	private Label lblContent = new Label("Content");
	private TextField txtContent = new TextField();
	private Button btnAdd = new Button("Add");
	private Label lblArrayContents = new Label();
	private Label lblMessage = new Label();
	
	ArrayList<String> elements = new ArrayList<>();

	public static void main(String[] args) {
		launch(args);
	}
	@Override
	public void start(Stage primaryStage) throws Exception {
		// Create the BorderPane
		GridPane root = new GridPane();
		
		// HBox for top row
		HBox topControls = new HBox();
		topControls.getChildren().addAll(lblContent, txtContent, btnAdd);
		root.add(topControls,  0,  0);
		
		// Label for ArrayList, initially empty
		root.add(lblArrayContents, 0, 1);

		// Label for message, initially empty
		root.add(lblMessage, 0, 2);

		// Add event handling
		btnAdd.setOnAction(e -> { addElement(); });
		
		// Create the scene using our layout; then display it
		Scene scene = new Scene(root);
		scene.getStylesheets().add(getClass().getResource("styles.css").toExternalForm());
		primaryStage.setTitle("ArrayList GUI Demo");
		primaryStage.setScene(scene);
		primaryStage.show();		
	}
	
	private void addElement() {
		String text = txtContent.getText();
		elements.add(text);
		lblMessage.setText("Added '" + text + " to end of list");
		displayArrayList();
	}
	
	private void displayArrayList() {
		String displayValue = "ArrayList contents: ";
		for (int i = 0; i < elements.size(); i++) {
		    String elt = elements.get(i);
			displayValue += elt + " -> ";
		}
		lblArrayContents.setText(displayValue);
	}
}
