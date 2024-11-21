package ch.fhnw.richards.week06_Loops_ArrayList.solutions.codeRunner;

import java.util.Scanner;

public class CollectDigits {

	/**
	 * The "main" method only exists to test the collectDigits method.
	 */
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		String userInput = "not empty";
		while (!userInput.isEmpty()) {
			System.out.println("Enter a string, or just 'enter' to quit");
			userInput = in.nextLine();
			String digits = collectDigits(userInput);
			System.out.println("Digits in the string: " + digits);
		}
	}

	/**
	 * This method collects all of the digits in the string
	 * @param in The input string
	 * @return A new string containing only the digits
	 */
	private static String collectDigits(String in) {
		String answer = "";
		int pos = 0;
		while (pos < in.length()) {
			char c = in.charAt(pos);
			if (c >= '0' && c <= '9') {
				answer = answer + c;
			}
			pos++;
		}
		return answer;
	}
}
