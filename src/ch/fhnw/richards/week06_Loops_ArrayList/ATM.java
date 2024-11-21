package ch.fhnw.richards.week06_Loops_ArrayList;

import java.util.Scanner;

public class ATM {

	public static void main(String[] args) {
		final int PIN = 1234;
		
		Scanner in = new Scanner(System.in);

		int userPIN = -1;
		int numberTries = 0;
		while (userPIN != PIN && numberTries < 3) {
			System.out.println("Please enter your PIN");
			userPIN = in.nextInt();
			numberTries++;
		}
		
		// PIN is ok -or- Too many tries
		if (PIN == userPIN) {
			System.out.println("How much money do you want?");
			int amount = in.nextInt();
			
			if (amount > 0 && amount % 10 == 0) {
				System.out.println("Great, here is your money");
			} else {
				System.out.println("Sorry, bad amount");
			}
		} else {
			// Error, wrong PIN
			System.out.println("Wrong PIN, card is taken away");
		}
		in.close();
	}
}
