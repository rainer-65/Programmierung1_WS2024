package ch.fhnw.richards.week06_Loops_ArrayList.solutions.codeRunner;

import java.util.ArrayList;
import java.util.Scanner;

public class MiddleString {

	public static void main(String[] args) {
		ArrayList<String> list = new ArrayList<>();
		
		Scanner in = new Scanner(System.in);
		String userInput = "not stop"; // Just to get us into the while loop
		while (!userInput.equals("stop")) {
			System.out.println("Enter a string, or just 'enter' to finish");
			userInput = in.nextLine();
			if (!userInput.equals("stop")) list.add(userInput);
		}
		
		// Can you figure out why this calculation works?
		int numStrings = list.size();
		if (numStrings % 2 == 0) numStrings--;
		int middle = numStrings / 2;
		
		// Print the middle string
		System.out.println(list.get(middle));
	}
}
