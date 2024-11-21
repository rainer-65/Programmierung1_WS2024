package ch.fhnw.richards.week08_ControlStructures.solutions.codeRunner;

import java.util.ArrayList;

public class CountStringsInArrayList {

	/**
	 * This main method is not part of the answer. It exists only to call the method
	 * below, and to test the results.
	 */
	public static void main(String[] args) {
		ArrayList<String> words = new ArrayList<>();
		words.add("Hello"); words.add("World");
		words.add("Hello"); words.add("Mars");
		words.add("Hello"); words.add("Jupiter");
		System.out.println(countStrings(words, "Hello"));
	}
	
	/**
	 * Count the number of times the target is found in the list
	 * 
	 * @param list A list of strings
	 * @param target A string to look for
	 * @return The number of times the target is found
	 */
	private static int countStrings(ArrayList<String> list, String target) {
		int count = 0;
		for (String s : list) {
			if (s.equals(target)) count++;
		}
		return count;
	}

}
