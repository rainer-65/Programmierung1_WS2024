package ch.fhnw.richards.week03_YourOwnClasses_Part1.solutions;

public class Meal {
    private final String name;
    private int price;
    public Meal(String name, int price) {
        this.name = name;
        this.price = price;
    }
    // toString-Methode hier ergänzen
    @Override
    public String toString() {
    	return name + " costs Fr. " + price;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public String getName() {
        return name;
    }
}
