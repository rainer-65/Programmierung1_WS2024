package ch.fhnw.richards.week07_Repetition.codingcontest;

import java.util.ArrayList;
import java.util.Scanner;

public class NameChecker {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<String> names = new ArrayList<>();

        System.out.println("Enter names (type 'quit' or 'stop' to stop entering names):");

        // Initial name entry loop
        String name = "";
        while (!name.equalsIgnoreCase("quit")) {
            name = scanner.nextLine();
            if (!name.equalsIgnoreCase("quit")) {
                names.add(name);
            }
        }

        System.out.println("Name entry stopped.");
        System.out.println("You can now check if a name is in the list. Type 'quit' to end the program.");

        // Name checking loop
        String checkName = "";
        while (!checkName.equalsIgnoreCase("quit")) {
            System.out.print("Enter a name to check: ");
            checkName = scanner.nextLine();
            boolean found = false;
            if (checkName.equalsIgnoreCase("quit"))
                break;
            // Case-insensitive search in the list
            for (String storedName : names) {
                if (storedName.equalsIgnoreCase(checkName)) {
                    found = true;
                    break;
                }
            }

            if (found) {
                System.out.println(checkName + " is in the list.");
            } else {
                System.out.println(checkName + " is not in the list.");
            }
        }

        System.out.println("Program ended.");
        scanner.close();
    }
}
