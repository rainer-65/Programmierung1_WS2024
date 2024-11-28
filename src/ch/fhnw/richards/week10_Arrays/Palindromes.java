package ch.fhnw.richards.week10_Arrays;

import java.util.Scanner;

public class Palindromes {

	public static void main(String[] args) {
		System.out.println("Enter an empty string to end this program");
	    Scanner in = new Scanner(System.in);
	    boolean isEmpty = false;
	    while (!isEmpty) {
	        System.out.print("String to test: ");
	        String toTest = in.nextLine();
	        isEmpty = (toTest.length() == 0);
	        if (!isEmpty) {
	            char[] characters = toTest.toCharArray();

	            boolean isPalindrome = true; // Set to false if difference found
	            for (int i = 0 ; i < characters.length/2 ; i++) {
	            	int positionFromEnd = characters.length - i - 1;
	            	if (characters[i] != characters[positionFromEnd]) isPalindrome = false;
	            }

	            System.out.println("Is a palindrome: " + isPalindrome);
	        }
	    }
	}
}
