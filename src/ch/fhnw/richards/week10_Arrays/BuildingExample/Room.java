package ch.fhnw.richards.week10_Arrays.BuildingExample;

public class Room {
	private final String roomNumber;
	private int capacity;
	
	public Room(String roomNumber, int capacity) {
		this.roomNumber = roomNumber;
		this.capacity = capacity;
	}

	public int getCapacity() {
		return capacity;
	}

	public void setCapacity(int capacity) {
		this.capacity = capacity;
	}

	public String getRoomNumber() {
		return roomNumber;
	}
	
}
