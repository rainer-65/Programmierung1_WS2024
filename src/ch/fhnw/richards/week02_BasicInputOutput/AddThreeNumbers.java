package ch.fhnw.richards.week02_BasicInputOutput;

import java.util.Scanner;

public class AddThreeNumbers {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("Please enter three integers");
		int num1 = in.nextInt();
		int num2 = in.nextInt();
		int num3 = in.nextInt();
		in.close();
		
		int total = num1 + num2 + num3;
		
		System.out.println("The total is " + total);
	}

}
