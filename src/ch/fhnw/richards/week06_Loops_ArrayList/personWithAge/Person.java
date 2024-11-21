package ch.fhnw.richards.week06_Loops_ArrayList.personWithAge;

public class Person {
	private static int nextID = 0;
	
	private final int ID;
	private String lastName;
	private String firstName;
	private Gender gender;
	private Integer age;

	public enum Gender { MALE, FEMALE };
	
	// Class method to get the next available ID
	  private static int getNextID() {
			return nextID++;
	  }
	  
	private Person() {
		this.ID = getNextID();
	}
	
	public Person(String lastName, String firstName, Gender gender) {
		this(); // Call to constructor with no parameters
		this.lastName = lastName;
		this.firstName = firstName;
		this.gender = gender;
		this.age = 0; // Default value
	}

	// --- Getters and Setters ---
	
	public int getID() {
		return ID;
	}
	
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

	public Integer getAge() {
		return age;
	}

	public void setAge(Integer age) {
		if (age >= 0) this.age = age;
	}
}
