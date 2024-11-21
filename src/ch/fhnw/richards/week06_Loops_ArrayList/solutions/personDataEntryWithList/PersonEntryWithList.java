package ch.fhnw.richards.week06_Loops_ArrayList.solutions.personDataEntryWithList;

import java.util.ArrayList;

import ch.fhnw.richards.week06_Loops_ArrayList.solutions.personDataEntryWithList.Person.Gender;
import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.Pane;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class PersonEntryWithList extends Application {
	// Our data in this example in an ArrayList of Person objects
	ArrayList<Person> people = new ArrayList<>();
	
	// This tells us which person we are currently displaying
	// If the list is empty, this is -1
	int currentPerson = -1;

	// Controls used for data processing
	TextField lnDataIn = new TextField();
	TextField fnDataIn = new TextField();
	TextField genderDataIn = new TextField();
	Label idData = new Label();
	Label lnData = new Label();
	Label fnData = new Label();
	Label genderData = new Label();
	
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
		scene.getStylesheets().add(
				getClass().getResource("PersonEntry1.css").toExternalForm());
		primaryStage.setTitle("Enter and display a person");
		primaryStage.setScene(scene);
		primaryStage.show();
	}

	private Pane createDataEntryPane() {
		GridPane pane = new GridPane();
		pane.setId("dataEntry"); // ID for CSS formatting

		// Declare the individual controls in the GUI
		Label lnLabel = new Label("Last name: ");
		Label fnLabel = new Label("First name: ");
		Label genderLabel = new Label("Gender: ");
		
		// Organize the layout, add in the controls (col, row)
		pane.add(lnLabel, 0, 0);		pane.add(lnDataIn, 1, 0);
		pane.add(fnLabel, 0, 1);		pane.add(fnDataIn, 1, 1);
		pane.add(genderLabel, 0, 2);	pane.add(genderDataIn, 1, 2);

		return pane;
	}

	private Pane createDataDisplayPane() {
		GridPane pane = new GridPane();
		pane.setId("dataDisplay"); // ID for CSS formatting

		// Declare the individual controls in the GUI
	    Label idLabel = new Label("ID: ");
		Label lnLabel = new Label("Last name: ");
		Label fnLabel = new Label("First name: ");
		Label genderLabel = new Label("Gender: ");
		
		// Organize the layout, add in the controls (col, row)
	    pane.add(idLabel, 0, 0); pane.add(idData, 1, 0);
	    pane.add(lnLabel, 0, 1); pane.add(lnData, 1, 1);
	    pane.add(fnLabel, 0, 2); pane.add(fnData, 1, 2);
	    pane.add(genderLabel, 0, 3); pane.add(genderData, 1, 3);

		return pane;
	}

	private Pane createButtonPane() {
		HBox pane = new HBox();
		pane.setAlignment(Pos.CENTER);
		pane.setId("buttonArea"); // ID for CSS formatting

		Button saveButton = new Button("Save");
		saveButton.setOnAction(this::savePerson);

		Button btnLeft = new Button("\u2B60");
		btnLeft.setOnAction(this::moveLeft);
		
		Button btnRight = new Button("\u2B62");
		btnRight.setOnAction(this::moveRight);

		pane.getChildren().addAll(btnLeft, saveButton, btnRight);
		
		return pane;
	}
	
	private void savePerson(ActionEvent e) {
		String strGender = genderDataIn.getText();
		Gender gender = strGender.equals("male") ? Gender.MALE : Gender.FEMALE;
		Person person = new Person(lnDataIn.getText(), fnDataIn.getText(), gender);
		people.add(person);
		currentPerson = people.size() - 1;
		updateDisplay();
	}
	
	private void moveLeft(ActionEvent e) {
		if (currentPerson > 0) {
			currentPerson--;
			updateDisplay();
		}
	}
	
	private void moveRight(ActionEvent e) {
		if (currentPerson < (people.size()-1)) {
			currentPerson++;
			updateDisplay();
		}
	}
	
	private void updateDisplay() {
		if (currentPerson == -1) {
			// No person to display, so empty the display
			idData.setText("");
			lnData.setText("");
			fnData.setText("");
			genderData.setText("");
		} else {
			Person person = people.get(currentPerson);
			idData.setText(Integer.toString(person.getID()));
			lnData.setText(person.getLastName());
			fnData.setText(person.getFirstName());
			genderData.setText(person.getGender().toString());
		}
	}
}
