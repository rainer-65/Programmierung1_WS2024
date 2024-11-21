package ch.fhnw.telesko.week02.livecoding;

import java.util.Scanner;

public class Password {
    public static void main(String[] args) {
        // Create a Scanner object to read input from the console
        Scanner scanner = new Scanner(System.in);

        // Read the first name
        System.out.print("Enter your first name: ");
        String firstName = scanner.nextLine();

        // Read the last name
        System.out.print("Enter your last name: ");
        String lastName = scanner.nextLine();

        // First and last names entered
        if (firstName.length() >= 2 && lastName.length() >= 2) {
            // Get the first and last characters of the first name
            char firstCharOfFirstName = firstName.charAt(0);
            char lastCharOfFirstName = firstName.charAt(firstName.length() - 1);

            // Get the first and last characters of the last name
            char firstCharOfLastName = lastName.charAt(0);
            char lastCharOfLastName = lastName.charAt(lastName.length() - 1);

            // Create the result string
            String result = firstCharOfFirstName + String.valueOf(lastCharOfFirstName) + firstCharOfLastName + lastCharOfLastName;
            // Output the result
            System.out.println("Generated password: " + result);
        } else {
            // Information provided incomplete
            System.out.println("You must enter a first name and a last name and each name must have at least two characters!");
        }

        // Close the scanner
        scanner.close();
    }
}
