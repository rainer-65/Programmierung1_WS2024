package ch.fhnw.richards.week09_Comparing.solutions.name;

import java.util.ArrayList;
import java.util.Collections;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

/**
 * Graphical view of an ArrayList containing strings. Top row contains controls
 * to add and delete elements. Bottom row displays labels representing the elements
 * in the ArrayList.
 */
public class NameGUI extends Application {
	// Create controls
	private Label lblFirstName = new Label("First name");
	private TextField txtFirstName = new TextField();
	private Label lblLastName = new Label("Last name");
	private TextField txtLastName = new TextField();
	private Button btnAdd = new Button("Add");
	private Button btnSort = new Button("Sort");
	private TextArea txtContent = new TextArea();
	
	ArrayList<Name> elements = new ArrayList<>();

	public static void main(String[] args) {
		launch(args);
	}
	
	@Override
	public void start(Stage primaryStage) throws Exception {
		// Create the BorderPane
		BorderPane root = new BorderPane();

		// GridPane for data entry area
		GridPane dataEntry = new GridPane();
		dataEntry.add(lblFirstName, 0, 0);
		dataEntry.add(txtFirstName, 1, 0);
		dataEntry.add(lblLastName, 0, 1);
		dataEntry.add(txtLastName, 1, 1);
		
		// HBox for buttons
		HBox buttons = new HBox();
		buttons.getChildren().addAll(btnAdd, btnSort);

		// VBox for entire top area
		VBox topArea = new VBox();
		topArea.getChildren().addAll(dataEntry, buttons);
		
		// Add everything into the BorderPane
		root.setTop(topArea);
		root.setCenter(txtContent);

		// Add event handling
		btnAdd.setOnAction(e -> { addElement(); });
		btnSort.setOnAction(e -> { sortElements(); });
		
		// Create the scene using our layout; then display it
		Scene scene = new Scene(root);
		scene.getStylesheets().add(getClass().getResource("styles.css").toExternalForm());
		primaryStage.setTitle("Names Exercise");
		primaryStage.setScene(scene);
		primaryStage.show();		
	}
	
	private void addElement() {
		Name name = new Name(txtLastName.getText(), txtFirstName.getText());
		elements.add(name);
		displayArrayList();
	}
	
	private void sortElements() {
		Collections.sort(elements);
		displayArrayList();
	}
	
	private void displayArrayList() {
		String displayValue = "";
		for (int i = 0; i < elements.size(); i++) {
		    Name elt = elements.get(i);
			displayValue += elt.toString() + "\n";
		}
		txtContent.setText(displayValue);
	}
}
