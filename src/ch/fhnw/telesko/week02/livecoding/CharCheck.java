package ch.fhnw.telesko.week02.livecoding;

import java.util.Scanner;

public class CharCheck {
    public static void main(String[] args) {
        // Create a scanner object to read input from the console
        Scanner scanner = new Scanner(System.in);

        // Prompt the user to enter a string
        System.out.print("Enter a string: ");
        String input = scanner.nextLine();

        // Check if the input string has at least two characters
        if (input.length() >= 2) {
            // Get the first and last characters (ignoring case sensitivity)
            char firstChar = Character.toLowerCase(input.charAt(0));
            char lastChar = Character.toLowerCase(input.charAt(input.length() - 1));

            // Check if the first and last characters are the same
            if (firstChar == lastChar) {
                System.out.println("The first and last character are equal.");
            } else {
                System.out.println("The first and last character are different.");
            }
        } else {
            System.out.println("The input string is empty or has only one character!");
        }

        // Close the scanner
        scanner.close();
    }
}

