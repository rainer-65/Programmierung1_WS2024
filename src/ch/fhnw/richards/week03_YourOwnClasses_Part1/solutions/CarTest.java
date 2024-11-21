package ch.fhnw.richards.week03_YourOwnClasses_Part1.solutions;


public class CarTest {

    public static void main(String[] args) {
        Car c1 = new Car("FO1234", "Ford", "Mondeo", 2000);
        Car c2 = new Car("HO4564", "Honda", "Civic", 2011);
        Car c3 = new Car("TO3458", "Toyota", "Corolla", 1999);
        Car c4 = new Car("ME3247", "Mercedes", "280 SL Pagode", 1970);

        System.out.println(c1.getSerialNumber() + " " + c1.getMake() + " " + c1.getModel() + " " + c1.getYear());
        System.out.println(c2.getSerialNumber() + " " + c2.getMake() + " " + c2.getModel() + " " + c2.getYear());
        System.out.println(c3.getSerialNumber() + " " + c3.getMake() + " " + c3.getModel() + " " + c3.getYear());
        System.out.println(c4.getSerialNumber() + " " + c4.getMake() + " " + c4.getModel() + " " + c4.getYear());

        System.out.println("Toyota Corolla antique?: " + c3.isAntique());
        System.out.println("Mercedes antique?: " + c4.isAntique());
    }
}
