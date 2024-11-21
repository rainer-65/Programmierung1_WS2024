package ch.fhnw.richards.week02_BasicInputOutput;

import java.util.Scanner;

public class ATM {

	public static void main(String[] args) {
		final int PIN = 1234;
		
		Scanner in = new Scanner(System.in);
		System.out.println("Please enter your PIN");
		int userPIN = in.nextInt();
		
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
			System.out.println("Wrong PIN");
		}
		in.close();
	}
}
