package ch.fhnw.kurztest.w4;

public class Apartment {

    // Attributes
    private static int nextID = 0;
    private int ID;
    private String Address;
    private int Floor;
    private double Rooms;

    // Constructor
    public Apartment() {
        this.ID = nextID++;
    }

    // getter- und setter-Methoden
    public int getID() {
        return ID;
    }


    public String getAddress() {
        return Address;
    }

    public void setAddress(String address) {
        if (address.length() >= 5) this.Address = address;
    }

    public int getFloor() {
        return Floor;
    }

    public void setFloor(int floor) {
        if (floor >= 0) this.Floor = floor;
    }

    public double getRooms() {
        return Rooms;
    }

    public void setRooms(double rooms) {
        if (rooms >= 1.0) this.Rooms = rooms;
    }

    // toString-Methode
    @Override
    public String toString() {
        return "(" + this.getID() + ") " + this.getAddress() + " " + "(" + this.getRooms() + " rooms)";
    }
}
