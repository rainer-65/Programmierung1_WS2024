package ch.fhnw.richards.week02_BasicInputOutput.solutions;

import java.util.Scanner;

public class Rounding {

	public static void main(String[] args) {
		// Prompt the user
		System.out.println("Enter currency amount");
		
		// Create a Scanner, read a currency amount as a double
		Scanner in = new Scanner(System.in);		
		double amount = in.nextDouble();
		in.close();
		
		// Round to the nearest whole number, print the result
		int francs = (int) (amount + 0.5);
		System.out.println(francs);

		// Round to the nearest 10 cents, print the result
		int tenCents = (int) (10 * amount + 0.5);
		double answer = tenCents / 10.0;
		System.out.println(answer);
		
		// Round to the nearest 5 cents, print the result
		int fiveCents = (int) (20 * amount + 0.5);
		answer = fiveCents / 20.0;
		System.out.println(answer);
	}
}
