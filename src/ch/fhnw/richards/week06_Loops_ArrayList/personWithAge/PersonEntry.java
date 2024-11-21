package ch.fhnw.richards.week06_Loops_ArrayList.personWithAge;

import ch.fhnw.richards.week06_Loops_ArrayList.personWithAge.Person.Gender;
import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.Pane;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class PersonEntry extends Application {
	Person person = new Person("Miller", "James", Gender.MALE);

	// Controls used for data processing
	TextField lnDataIn = new TextField();
	TextField fnDataIn = new TextField();
	TextField genderDataIn = new TextField();
	TextField ageDataIn = new TextField();
	Label idData = new Label(Integer.toString(person.getID()));
	Label lnData = new Label(person.getLastName());
	Label fnData = new Label(person.getFirstName());
	Label genderData = new Label(person.getGender().toString());
	Label ageData = new Label(person.getAge().toString());
	
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
				getClass().getResource("PersonEntry.css").toExternalForm());
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
		Label ageLabel = new Label("Age: ");
		
		// Organize the layout, add in the controls (col, row)
		pane.add(lnLabel, 0, 0);		pane.add(lnDataIn, 1, 0);
		pane.add(fnLabel, 0, 1);		pane.add(fnDataIn, 1, 1);
		pane.add(genderLabel, 0, 2);	pane.add(genderDataIn, 1, 2);
		pane.add(ageLabel, 0, 3);	pane.add(ageDataIn, 1, 3);

		return pane;
	}

	private Pane createButtonPane() {
		HBox pane = new HBox();
		pane.setId("buttonArea"); // ID for CSS formatting

		Button saveButton = new Button("Save");
		pane.getChildren().add(saveButton);

		saveButton.setOnAction(this::savePerson);
		
		return pane;
	}
	
	private void savePerson(ActionEvent e) {
		String strGender = genderDataIn.getText();
		Gender gender = strGender.equals("male") ? Gender.MALE : Gender.FEMALE;
		person = new Person(lnDataIn.getText(), fnDataIn.getText(), gender);
		person.setAge(Integer.parseInt(ageDataIn.getText()));
		
		idData.setText(Integer.toString(person.getID()));
		lnData.setText(person.getLastName());
		fnData.setText(person.getFirstName());
		genderData.setText(person.getGender().toString());
		ageData.setText(person.getAge().toString());
	}

	private Pane createDataDisplayPane() {
		GridPane pane = new GridPane();
		pane.setId("dataDisplay"); // ID for CSS formatting

		// Declare the individual controls in the GUI
	    Label idLabel = new Label("ID: ");
		Label lnLabel = new Label("Last name: ");
		Label fnLabel = new Label("First name: ");
		Label genderLabel = new Label("Gender: ");
		Label ageLabel = new Label("Age: ");
		
		// Organize the layout, add in the controls (col, row)
	    pane.add(idLabel, 0, 0); pane.add(idData, 1, 0);
	    pane.add(lnLabel, 0, 1); pane.add(lnData, 1, 1);
	    pane.add(fnLabel, 0, 2); pane.add(fnData, 1, 2);
	    pane.add(genderLabel, 0, 3); pane.add(genderData, 1, 3);
	    pane.add(ageLabel, 0, 4); pane.add(ageData, 1, 4);

		return pane;
	}
}
