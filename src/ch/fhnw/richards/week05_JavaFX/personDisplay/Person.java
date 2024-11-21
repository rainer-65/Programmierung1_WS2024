package ch.fhnw.richards.week05_JavaFX.personDisplay;

public class Person {
	private static int nextID = 0;
	
	public enum Gender { male, female };
	
	private final int ID; // ID unchangeable after being set
	private String lastName;
	private String firstName;
	private Gender gender;
	
	private static int getNextID() {
		return nextID++;
	}

	public Person() {
		this.ID = getNextID();
	}

	public Person(String lastName, String firstName) {
		this.ID = getNextID();
		this.lastName = lastName;
		this.firstName = firstName;
	}

	@Override
	public String toString() {
		String description = this.ID + ": " + this.lastName + ", " + this.firstName;
		description += " (" + gender + ")";
		return description;
	}
	
	// Getters and setters
	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		if (!lastName.isEmpty()) this.lastName = lastName;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		if (!firstName.isEmpty()) this.firstName = firstName;
	}

	public Gender getGender() {
		return gender;
	}

	public void setGender(Gender gender) {
		this.gender = gender;
	}
	
	public int getID() {
		return ID;
	}
}
