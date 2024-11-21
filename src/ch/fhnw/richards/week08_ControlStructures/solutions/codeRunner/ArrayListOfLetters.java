package ch.fhnw.richards.week08_ControlStructures.solutions.codeRunner;

import java.util.ArrayList;

public class ArrayListOfLetters {

	/**
	 * This main method is not part of the answer. It exists only to call the method
	 * below, and to test the results.
	 */
	public static void main(String[] args) {
		ArrayList<Character> letters = getLetterList();
		
		// Check that the list contains 26 elements
		boolean ok = (letters.size() == 26);
		
		// Check that the first element is 'a'
		ok = ok && (letters.get(0).equals('a'));
		
		// Check that each following element has a value 1 higher
		for (int i = 0; i < 25; i++) {
			ok = ok && ((letters.get(i+1) - letters.get(i)) == 1);
		}
		
		System.out.println(ok);
	}

	/**
	 * This method creates an empty ArrayList and then adds 26 lower-case letters to it.
	 * 
	 * @return The ArrayList
	 */
	private static ArrayList<Character> getLetterList() {
		ArrayList<Character> letters = new ArrayList<>();
		for (char c = 'a'; c <= 'z'; c++) {
			letters.add(c);
		}
		return letters;
	}
}
