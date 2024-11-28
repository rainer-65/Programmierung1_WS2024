package ch.fhnw.richards.week10_Arrays.solutions;

import java.util.Arrays;
import java.util.Scanner;

public class ReadFiveStrings {

    // Read five strings from the console
    static String[] stringArray = new String[5];

    public static void main(String[] args) {

        // Define scanner
        Scanner scanner = new Scanner(System.in);

        for (int i = 0; i < stringArray.length; i++) {
            System.out.println("Please enter string number " + (i + 1) + ": ");
            stringArray[i] = scanner.nextLine();
        }

        // Print for testing
        System.out.println("Unsorted array: ");
        for (String token : stringArray) {
            System.out.print(token + " ");
        }

        System.out.println();

        // Option 1: Sorting the array
        System.out.println("Sorted array:");
        Arrays.sort(stringArray, String.CASE_INSENSITIVE_ORDER);
        System.out.print(Arrays.toString(stringArray)
                .replace("[", "")
                .replace("]", "")
                .replace(", ", " "));

        System.out.println();

        // Option 2: Iterating through the array and making a pairwise comparison
        System.out.println("First element is: " + stringArray[findFirstString()]);
    }

    private static int findFirstString() {
        // Find the alphabetical first
        int first = 0;
        for (int i = 1; i < stringArray.length; i++) {
            if (stringArray[i].compareToIgnoreCase(stringArray[first]) < 0) first = i;
        }
        return first;
    }

}