package ch.fhnw.richards.week07_Repetition.contactList;

public class Contact {
	private static int nextID = 0;
	
	private int id;
	private String lastName;
	private String firstName;
	private String mobile;
	private String email;
	
	private static int getNextID() {
		return nextID++;
	}
	
	public Contact(String lastName, String firstName) {
		this.id = getNextID();
		this.lastName = lastName;
		this.firstName = firstName;
		this.mobile = "";
		this.email = "";
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
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

	public String getMobile() {
		return mobile;
	}

	public void setMobile(String mobile) {
		this.mobile = mobile;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}
}
