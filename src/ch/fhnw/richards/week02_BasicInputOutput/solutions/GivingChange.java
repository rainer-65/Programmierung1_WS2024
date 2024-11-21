package ch.fhnw.richards.week02_BasicInputOutput.solutions;

import java.util.Scanner;

public class GivingChange {

	public static void main(String[] args) {
		System.out.println("Enter amount: ");
        // Read an amount as a "double" using a scanner.
		Scanner in = new Scanner(System.in);
		double amount = in.nextDouble();
		in.close();
		
		// Print the number of bills and coins required.
		int num20f = (int) amount / 20;
		amount = amount - 20 * num20f;
		System.out.println("Twenty franc bills: " + num20f);
		int num10f = (int) amount / 10;
		amount = amount - 10 * num10f;
		System.out.println("Ten franc bills: " + num10f);
		int num5f = (int) amount / 5;
		amount = amount - 5 * num5f;
		System.out.println("Five franc coins: " + num5f);
		int num2f = (int) amount / 2;
		amount = amount - 2 * num2f;
		System.out.println("Two franc coins: " + num2f);
		int num1f = (int) amount;
		amount = amount - num1f;
		System.out.println("One franc coins: " + num1f);
		
		// Multiply by 100, then continue with rappen
		amount *= 100;
		int num50r = (int) amount / 50;
		amount = amount - 50 * num50r;
		System.out.println("Fifty rappen coins: " + num50r);
		int num20r = (int) amount / 20;
		amount = amount - 20 * num20r;
		System.out.println("Twenty rappen coins: " + num20r);
		int num10r = (int) amount / 10;
		amount = amount - 10 * num10r;
		System.out.println("Ten rappen coins: " + num10r);
	}
}

