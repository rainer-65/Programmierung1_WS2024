package ch.fhnw.richards.week06_Loops_ArrayList;

import java.util.ArrayList;

public class Hogwarts {

	public static void main(String[] args) {
		ArrayList<String> myStrings = new ArrayList<String>();

		// Add data to the list
		myStrings.add("Gryffindor");
		myStrings.add("Ravenclaw");
		myStrings.add("Hufflepuff");
		myStrings.add("Slytherin");

		// Check size of list
		int size = myStrings.size();
		System.out.println("ArrayList contains " + size + " elements:");

		// Print contents
		printContents(myStrings);

		// Remove an element
		myStrings.remove("Ravenclaw");

		// If not empty, print contents
		if (!myStrings.isEmpty()) printContents(myStrings);
	}

	private static void printContents(ArrayList<String> list) {
		int position = 0;
		while (position < list.size()) {
			String s = list.get(position);
			System.out.println(s);
			position++;
		}
		System.out.println();
	}
}
