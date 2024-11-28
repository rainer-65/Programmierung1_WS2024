package ch.fhnw.richards.week10_Arrays.BuildingExample;

public class RoomTest {

	public static void main(String[] args) {
		Building ovr = new Building("OVR", 3);
		Room r = new Room("A016", 25);
		ovr.addRoom(r);
		System.out.println("Current number of rooms " + ovr.getNumRooms() +
				" (should be 1)");
		r = new Room("B046", 15);
		ovr.addRoom(r);
		r = new Room("A041", 30);
		ovr.addRoom(r);
		System.out.println("Current number of rooms " + ovr.getNumRooms() +
				" (should be 3)");
		r = new Room("A999", 99);
		if (ovr.addRoom(r)) System.out.println("ERROR: Added a 4th room!");
		
		printRooms(ovr);
	}

	private static void printRooms(Building b) {
		System.out.println(b.getName() + " has rooms:");
		for (int i = 0; i < b.getNumRooms(); i++) {
			Room r = b.getRoomByPosition(i);
			System.out.println("Room " + r.getRoomNumber());
		}
	}

}
