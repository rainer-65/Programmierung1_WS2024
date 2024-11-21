package ch.fhnw.richards.week03_YourOwnClasses_Part1.solutions;

import java.util.Scanner;

public class StringWarmUp {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("Enter a string with at least 3 characters: ");
		// TODO Read the first string
		String s1 = in.nextLine();
		System.out.println("Enter another string with at least 3 characters: ");
		// TODO Read the secpmd string
		String s2 = in.nextLine();
		in.close();
		
		// TODO Are both strings at least 3 characters long?
		if (s1.length() >= 3 && s2.length() >= 3) {
			// TODO Yes, so concatenate the strings into a new variable
			// TODO Print the result
			String s3 = s1 + s2;
			System.out.println(s3);
			
			// TODO Get a substring, omitting the first two and last two characters
			// TODO Print the result
			String s4 = s3.substring(2, s3.length() - 2 );
			System.out.println(s4);
		} else {
			// TODO Print the error message "input error"
			System.out.println("input error");
		}	
	}
}
