package ch.fhnw.richards.week08_ControlStructures.palindromes;

import java.util.Scanner;

public class Palindrome1 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		String input;
		do {
			System.out.println("Enter a string, or hit enter to quit");
			input = in.nextLine();
			if (!input.isEmpty()) {
				if (isPalindrome(input)) {
					System.out.println("Is a palindrome!");
				} else {
					System.out.println("Is *not* a palindrome!");
				}
			}
		} while (!input.isEmpty());
		in.close();
		System.out.println("Bye...");
	}

	private static boolean isPalindrome(String text) {
		int indexStart = 0;
		int indexEnd = text.length() - 1;
		boolean answer = true;
		while (indexStart < indexEnd) {
			char c = text.charAt(indexStart++);
			char d = text.charAt(indexEnd--);
			answer = answer && (c == d);
		}
		return answer;
	}
}
