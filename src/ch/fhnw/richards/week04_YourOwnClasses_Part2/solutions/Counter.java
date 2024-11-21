package ch.fhnw.richards.week04_YourOwnClasses_Part2.solutions;

// Define the Counter class
public class Counter {
    // Static variable to keep track of the count of instances
    private static int count = 0;

    // Constructor increments the static variable count
    public Counter() {
        count++;
    }

    // Static method to get the value of count
    public static int getCount() {
        return count;
    }

}
