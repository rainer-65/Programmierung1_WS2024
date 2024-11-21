package ch.fhnw.kurztest.w4;

public class ApartmentTest {

    public static void main(String[] args) {

        // Generating two objects
        Apartment a1 = new Apartment();
        Apartment a2 = new Apartment();

        // Hauptgasse 23 (2 rooms)
        a1.setAddress(("Hauptgasse 23"));
        a1.setRooms(2);
        a1.setFloor(2);

        // Riggenbachstrasse 16 (3.5 rooms)
        a2.setAddress(("Riggenbachstrasse 16"));
        a2.setRooms(3.5);
        a2.setFloor(1);

        // Test for printout
        System.out.println(a1.toString());
        System.out.println(a2.toString());
    }

}
