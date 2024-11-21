package ch.fhnw.richards.week06_Loops_ArrayList;

import java.util.Scanner;

public class Collatz {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);

		System.out.println("Enter a number");
		int num = in.nextInt();
		int numSteps = collatzSteps(num);
		System.out.println("The number of steps for " + num + " is " + numSteps);
	}

	public static int collatzSteps(int valIn) {
		int steps = 0;
		while (valIn != 1) {
			if ( valIn % 2 == 0 ) {
				valIn = valIn / 2;
			} else {
				valIn = valIn * 3 + 1;
			}
			steps++;
		}
		return steps;
	}
}
