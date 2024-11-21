package ch.fhnw.richards.week03_YourOwnClasses_Part1.solutions;

import java.util.Scanner;

public class MiddleValue {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("Enter three integers");
		int i1 = in.nextInt();
		int i2 = in.nextInt();
		int i3 = in.nextInt();
		in.close();

		int middleValue = middleInteger(i1, i2, i3);
		System.out.println(middleValue);
	}

	// This solution takes a simple approach:
	// check all possible arrangements for i1 and i2,
	// otherwise the answer is i3.
	public static int middleInteger(int i1, int i2, int i3) {
		// Is the middle value i1?
		if (i2 <= i1 && i1 <= i3)
			return i1;
		if (i3 <= i1 && i1 <= i2)
			return i1;

		// Is the middle value i2?
		if (i1 <= i2 && i2 <= i3)
			return i2;
		if (i3 <= i2 && i2 <= i1)
			return i2;
			
		// If it wasn't i1 or i2, then it is i3
		return i3;
	}
}
