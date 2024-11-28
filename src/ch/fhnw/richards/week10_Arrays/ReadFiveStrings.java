package ch.fhnw.richards.week10_Arrays;

import java.util.Scanner;

public class ReadFiveStrings {

	public static void main(String[] args) {
		   String[] strings = new String[5];
		   System.out.println("Please enter five strings");
		   Scanner in = new Scanner(System.in);
		   for (int i = 0; i < strings.length; i++) {
		      strings[i] = in.nextLine();
		   }
		   in.close();

		   // Find the alphabetical first
		   int first = 0;
		   for (int i = 1; i < strings.length; i++) {
		      if (strings[i].compareTo(strings[first]) < 0) first = i;
		   }

		   System.out.println("Alphabetically, the first string is: "
		      + strings[first]);
		}

}
