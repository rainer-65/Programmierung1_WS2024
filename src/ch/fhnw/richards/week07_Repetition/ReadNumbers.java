package ch.fhnw.richards.week07_Repetition;

import java.util.Scanner;

public class ReadNumbers {

	public static void main(String[] args) {
		// Initialization
		Scanner in = new Scanner(System.in);
		int sum = 0;
		boolean keepReading = true;
		
		// Repeat task
		while(keepReading) {
			int nextNumber = in.nextInt();
			if (nextNumber >= 0) {
				sum += nextNumber;
			} else {
				keepReading = false;
			}
		}

		// Final processing
		in.close();
		System.out.println("The sum is " + sum);
	}

}
