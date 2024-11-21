package ch.fhnw.richards.week02_BasicInputOutput;

import java.util.Scanner;

public class StringExercises {

	public static void main(String[] args) {
		String part1 = "To be or not to be? That is the question.";
		int posQM = part1.indexOf('?');
		String toBePart = part1.substring(0, posQM+1);
		System.out.println(toBePart);

		Scanner in = new Scanner(System.in);
		System.out.println("Enter a grand-sounding name, like 'Alexander the Great'");
		String name = in.nextLine();
		in.close();
		
		int posBlank = name.indexOf(' ');
		String firstName = name.substring(0, posBlank);
		String rest = name.substring(posBlank);
		rest = rest.trim();
		
		System.out.println("This is the story of " + firstName);
		System.out.println("Some people called " + firstName + " '" + rest + "'");
	}
}
