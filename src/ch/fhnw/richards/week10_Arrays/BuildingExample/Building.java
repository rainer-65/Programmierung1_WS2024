package ch.fhnw.richards.week10_Arrays.BuildingExample;

public class Building {
	private final String name;
	private final Room[] rooms;
	
	public Building(String name, int numberOfRooms) {
		this.name = name;
		rooms = new Room[numberOfRooms];
	}
	
//	public boolean addRoom(Room room) {
//		for (int i = 0; i < rooms.length; i++) {
//			if (rooms[i] == null) {
//				rooms[i] = room;
//				return true;
//			}
//		}
//		return false;
//	}
	
	public boolean addRoom(Room newRoom) {
		boolean success = false;
		int i = 0;
		while( !success && i < rooms.length ) {
			if (rooms[i] == null) {
				rooms[i] = newRoom;
				success = true;
			}
			i++;
		}
		return success;
	}
	
	public int getNumRooms() {
		int counter = 0;
		for (Room r : rooms) {
			if (r != null) counter++;
		}
		return counter;
	}
	
	public Room getRoom(int roomNumber) {
		Room room = null;
		for (Room r : rooms) {
			if (r.getRoomNumber().equals(roomNumber)) room = r;
		}
		return room;
	}
	
	public Room getRoomByPosition(int index) {
		return rooms[index];
	}
	
	public String getName() {
		return name;
	}
}
