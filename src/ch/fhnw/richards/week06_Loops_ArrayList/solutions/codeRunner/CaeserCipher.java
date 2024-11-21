package ch.fhnw.richards.week06_Loops_ArrayList.solutions.codeRunner;

import java.util.Scanner;

public class CaeserCipher {

	/**
	 * The "main" method only exists to test the caeserCipher method.
	 */
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		String userInput = "not empty";
		while (!userInput.isEmpty()) {
			System.out.println("Enter a string to encode, or just 'enter' to quit");
			userInput = in.nextLine();
			if (!userInput.isEmpty()) {
				System.out.println("Enter an encoding key 1-25");
				int key = in.nextInt();
				in.nextLine(); // get rid of the "enter" key
				
				String encoded = caeserCipher(userInput, key);
				System.out.println(encoded);
			}
		}
	}
	
	/**
	 * Method to encode a complete String.
	 * 
	 * @param in The String to encode
	 * @param key The encoding key
	 * @return The encoded string
	 */
	private static String caeserCipher(String in, int key) {
		String answer = ""; // Begin with an empty answer
		int charPos = 0; // Begin at start of string
		while (charPos < in.length()) { // As long as we have characters left
			char c = in.charAt(charPos); // Get the current character
			char e = encodeCharacter(c, key); // Encode this character
			answer = answer + e; // Add encoded character to our answer
			charPos++; // Move to next position
		}
		return answer;
	}

	/**
	 * Method to encode a single character. We only encode letters.
	 * Other characters remain unchanged.
	 * 
	 * @param c The character to encode
	 * @param key The encoding key
	 * @return The encoded character
	 */
	private static char encodeCharacter(char c, int key) {
		char e = c; // This variable will contain the encoded character
		if (c >= 'A' && c <= 'Z') { // upper-case
			e = (char) (c + key); // Encode
			if (e > 'Z') e = (char) (e - 26); // If past end of alphabet
		} else if (c >= 'a' && c <= 'z') { // lower-case
			e = (char) (c + key); // Encode
			if (e > 'z') e = (char) (e - 26); // If past end of alphabet
		} else {
			// Leave the character unchanged
			e = c;
		}
		return e;
	}
}
