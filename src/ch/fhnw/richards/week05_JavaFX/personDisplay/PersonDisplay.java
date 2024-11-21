package ch.fhnw.richards.week05_JavaFX.personDisplay;

import java.util.Scanner;

import ch.fhnw.richards.week05_JavaFX.personDisplay.Person.Gender;
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;

public class PersonDisplay extends Application {

	public static void main(String[] args) {
	    launch(args);
	  }

	  @Override
	  public void start(Stage primaryStage) {
		// Read a person from System.in
		Scanner in = new Scanner(System.in);
		Person person = readPersonFromScanner(in);
		in.close();
		  
		// Declare the individual controls in the GUI
	    Label lnLabel = new Label("Last name: ");
	    Label fnLabel = new Label("First name: ");
	    Label genderLabel = new Label("Gender: ");
	    Label lnData = new Label(person.getLastName());
	    Label fnData = new Label(person.getFirstName());
	    Label genderData = new Label(person.getGender().toString());
	    
	    // Organize the layout, add in the controls (col, row)
	    GridPane root = new GridPane();
	    root.add(lnLabel, 0, 0); root.add(lnData, 1, 0);
	    root.add(fnLabel, 0, 1); root.add(fnData, 1, 1);
	    root.add(genderLabel, 0, 2); root.add(genderData, 1, 2);

	    // Create the scene using our layout; then display it
	    Scene scene = new Scene(root, 150, 100);
	    primaryStage.setTitle("Display a person");
	    primaryStage.setScene(scene);
	    primaryStage.show();
	  }
	  
		private static Person readPersonFromScanner(Scanner in) {
			System.out.println("Enter last name: ");
			String lastName = in.nextLine();

			System.out.println("Enter first name: ");
			String firstName = in.nextLine();
			
			System.out.println("Enter 'f' for female; anything else for male: ");
			String tmpString = in.nextLine();
			Gender gender = Gender.male;
			if (tmpString.equals("f")) gender = Gender.female;
			
			Person p = new Person(lastName, firstName);
			p.setGender(gender);
			return p;
		}

}
