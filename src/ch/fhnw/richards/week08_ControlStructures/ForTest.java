package ch.fhnw.richards.week08_ControlStructures;

public class ForTest {

    public static void main(String[] args) {

        // Printing numbers
        for (int i = 1; i <= 10; i++) {
            System.out.print(i + " ");
        }

        // for loop with no execution
        for (int i = 0; i <= -10; i++) {
            System.out.println("Hello");
        }

        // for Infinite loop
        for (int i = 0; ;) {
            System.out.println("Hello");
        }

    }

}
