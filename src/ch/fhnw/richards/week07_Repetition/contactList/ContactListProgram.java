package ch.fhnw.richards.week07_Repetition.contactList;

import java.util.ArrayList;
import java.util.Collections;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class ContactListProgram extends Application {
	// Data to manage
	private ArrayList<Contact> contacts = new ArrayList<>(); // List of contacts
	private int currentIndex; // index of current contact
	
	// Important controls
	private Label lblID = new Label();
	private Label lblLastName = new Label();
	private Label lblFirstName = new Label();
	private Label lblEmail = new Label();
	private Label lblMobile = new Label();

	public static void main(String[] args) {
		launch();
	}

	@Override
	public void start(Stage primaryStage) throws Exception {
		VBox root = new VBox(10);
		root.getChildren().add(dataDisplayArea());
		root.getChildren().add(navigationArea());
		root.getChildren().add(sortArea());
		
		// Kludge - hard-coded data entered by this method
		addData(contacts);
		
		// Display an initial contact (index 0)
		displayRecord();

		// Create the scene using our layout; then display it
		Scene scene = new Scene(root);
		primaryStage.setTitle("Contact List");
		primaryStage.setScene(scene);
		primaryStage.show();
	}
	
	/**
	 * Create the first of three areas in the layout
	 */
	private GridPane dataDisplayArea() {
		GridPane gp = new GridPane();
		gp.setVgap(10);
		gp.setHgap(10);
		
		gp.addRow(0, new Label("ID: "), lblID);
		gp.addRow(1, new Label("Last name: "), lblLastName);
		gp.addRow(2, new Label("First name: "), lblFirstName);
		gp.addRow(3, new Label("Email: "), lblEmail);
		gp.addRow(4, new Label("Mobile: "), lblMobile);
		
		return gp;
	}
	
	/**
	 * Create the second of three areas in the layout
	 */
	private HBox navigationArea() {
		HBox hb = new HBox(100);		
		Button btnLeft = new Button("\u25C1");
		Button btnRight = new Button("\u25B7");
		hb.getChildren().addAll(btnLeft, btnRight);
		
		// Event handling
		btnLeft.setOnAction(this::goLeft);
		btnRight.setOnAction(this::goRight);
		
		return hb;
	}
	
	/**
	 * Event: move to previous contact
	 */
	private void goLeft(ActionEvent e) {
		if (currentIndex > 0) {
			currentIndex--;
			displayRecord();
		}
	}
	
	/**
	 * Event: move to next contact
	 */
	private void goRight(ActionEvent e) {
		if (currentIndex < contacts.size()-1) {
			currentIndex++;
			displayRecord();
		}
	}
	
	/**
	 * Create the third of three areas in the layout
	 */
	private HBox sortArea() {
		HBox hb = new HBox(20);	
		Label lblSort = new Label("Sort by:");
		Button btnSortID = new Button("ID");
		Button btnSortName = new Button("Name");
		hb.getChildren().addAll(lblSort, btnSortID, btnSortName);
		
		// Event handling
		btnSortID.setOnAction(this::sortID);
		btnSortName.setOnAction(this::sortName);
		
		return hb;
	}

	/**
	 * Event: Sort by ID
	 */
	private void sortID(ActionEvent e) {
		contacts = sort(contacts, true);
		currentIndex = 0;
		displayRecord();
	}

	/**
	 * Event: Sort by Name
	 */
	private void sortName(ActionEvent e) {
		contacts = sort(contacts, false);
		currentIndex = 0;
		displayRecord();
	}
	
	/**
	 * Update the UI with data from the current contact
	 */
	private void displayRecord() {
		Contact c = contacts.get(currentIndex);
		lblID.setText(Integer.toString(c.getId()));
		lblLastName.setText(c.getLastName());
		lblFirstName.setText(c.getFirstName());
		lblEmail.setText(c.getEmail());
		lblMobile.setText(c.getMobile());
	}

	/**
	 * Add initial, hard-coded data to the list
	 */
	private void addData(ArrayList<Contact> contacts) {
		Contact a = new Contact("Potter", "Harry");
		a.setEmail("hp@hogwarts.magic.uk");
		contacts.add(a);
		
		Contact b = new Contact("Granger", "Hermoine");
		b.setEmail("hg@hogwarts.magic.uk");
		contacts.add(b);
		
		Contact c = new Contact("Weasley", "Ron");
		c.setEmail("rw@hogwarts.magic.uk");
		contacts.add(c);
	}
	
	/**
	 * Method to sort the contact list, using selection-sort.
	 * 
	 * @param listIn The list to be sorted
	 * @param sortByID True to sort by ID, false to sort by name
	 * @return a new, sorted list
	 */
	private static ArrayList<Contact> sort(ArrayList<Contact> listIn, boolean sortByID) {
		ArrayList<Contact> listOut = new ArrayList<>();
		while (!listIn.isEmpty()) {
			// Finding the smallest requires a second loop
			int smallest = 0; // variable to hold the index of the smallest element
			int index = 1;
			while (index < listIn.size()) {
				// What we compare depends on the parameter sortByID
				if (sortByID) { // check the IDs
					if (listIn.get(index).getId() < listIn.get(smallest).getId()) smallest = index;
				} else { // check the names
					// We compare objects using the method "compareTo"
					if (listIn.get(index).getLastName().compareTo(listIn.get(smallest).getLastName()) < 0 ) smallest = index;
				}
				index++;
			}
			Contact smallestElement = listIn.remove(smallest);
			listOut.add(smallestElement);
		}
		return listOut;
	}
	
}
