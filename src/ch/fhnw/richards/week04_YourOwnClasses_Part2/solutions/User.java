package ch.fhnw.richards.week04_YourOwnClasses_Part2.solutions;

public class User {
	private static int nextID = 0;
	
	private final int ID;
	private String userName;
	private String password;

	private static int getNextID() {
		return nextID++;
	}
	
	public User() {
		this.ID = getNextID();
	}
	
	@Override
	public String toString() {
		return userName + " " + ID;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		if (userName.contains("@"))	this.userName = userName;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		if (password.length() >= 6) this.password = password;
		String name = null;
		name = "anna";
	}

	public int getID() {
		return ID;
	}

}
