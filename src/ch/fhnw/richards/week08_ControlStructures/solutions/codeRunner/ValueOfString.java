package ch.fhnw.richards.week08_ControlStructures.solutions.codeRunner;

import java.util.Scanner;

public class ValueOfString {

	/** This main method is not part of the answer. It only exists to test
	 * the method below.
	 */
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		String s;
		do {
			System.out.println("Enter a string, or enter to quit");
			s = in.nextLine();
			if (!s.isEmpty()) {
				int value = calcValue(s);
				System.out.println(value);
			}
		} while(!s.isEmpty());
		in.close();
	}

	/**
	 * We may assume that the string contains only UPPER CASE letters.
	 * 
	 * Hint: use a for-loop, and retrieve characters by position, beginning
	 * with position 0 and going through strIn.length() - 1
	 * 
	 * @param strIn The input string
	 * @return The value of the string
	 */
	private static int calcValue(String strIn) {
		int value = 0;
		for (int pos = 0; pos < strIn.length(); pos++) {
			char c = strIn.charAt(pos);
			int c_value = c - 'A' + 1;
			value = value + c_value;
		}
		return value;
	}
}
