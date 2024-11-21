package ch.fhnw.richards.week03_YourOwnClasses_Part1.solutions;

import java.util.Scanner;

/**
 * The main method here is not part of the solution. The task is only
 * to write the method that returns the boolean value.
 */
public class StringWithEvenCharacters {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("Enter a string to test");
		String s = in.nextLine();
		in.close();
		
		boolean result = StringIsEven(s);
		System.out.println("The answer is " + result);
	}

	public static boolean StringIsEven(String inputString) {
		int length = inputString.length();
		boolean result = (length % 2 == 0);
		return result;
	}
}
