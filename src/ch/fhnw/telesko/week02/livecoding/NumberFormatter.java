package ch.fhnw.telesko.week02.livecoding;

import java.util.Scanner;

public class NumberFormatter {

    public static void main(String[] args) {
        // Create a Scanner object to read input
        Scanner scanner = new Scanner(System.in);

        // Read the number input from the user
        System.out.println("Enter a number: ");
        double number = scanner.nextDouble();

        // Format the number with thousands separators and 2 decimal places (if necessary)

        if (number % 1 == 0) {      // Integer
            System.out.println("Formatted Number: " + String.format("%,.0f", number));
        } else if ((number * 10) % 1 == 0) {    // One decimal place
            System.out.println("Formatted Number: " + String.format("%,.1f", number));
        } else  // Two or more decimal places
            System.out.println("Formatted Number: " + String.format("%,.2f", number));

        // Close the scanner
        scanner.close();
    }
}
