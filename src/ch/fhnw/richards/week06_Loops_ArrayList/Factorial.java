package ch.fhnw.richards.week06_Loops_ArrayList;

import java.util.Scanner;

public class Factorial {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);

		int num = 2345;
		while (num >= 1) {
			System.out.println("Enter a number, or 0 to quit");
			num = in.nextInt();
			int factorialNum = factorial(num);
			System.out.println("The factorial of " + num + " is " + factorialNum);
		}
	}
	
	public static int factorial(int valIn) {
		int answer = 1;
		
		while( valIn > 1 ) {
			answer = answer * valIn;
			valIn--; // valIn = valIn - 1;
		}
		
		return answer;
	}

}
