package ch.fhnw.richards.week09_Comparing;

public class Company {
	private int ID;
	private String name;
	private String town;
	private int numberEmployee;
	
	public Company(int ID) {
		this.ID = ID;
	}
	
	@Override                                         // Replace existing implementation
	public boolean equals(Object obj) {               // Parameter can be any object
		boolean result = false;                       // Let's be pessimists
		if (obj != null) {                            // If parameter is not null
			if (this.getClass() == obj.getClass()) {  // If parameter is our class
				Company other = (Company) obj;        // Cast parameter to our class
				result = (this.ID == other.ID);       // Compare the ID values
			}
		}
		return result;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		if (!name.isEmpty()) this.name = name;
	}

	public String getTown() {
		return town;
	}

	public void setTown(String town) {
		if (!town.isEmpty()) this.town = town;
	}

	public int getNumberEmployee() {
		return numberEmployee;
	}

	public void setNumberEmployee(int numberEmployee) {
		if (numberEmployee > 0) this.numberEmployee = numberEmployee;
	}

	public int getID() {
		return ID;
	}
	
	
}
