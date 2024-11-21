package ch.fhnw.richards.week08_ControlStructures.solutions.codeRunner;

import java.util.Scanner;

public class TestPrimes {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int number;
		do {
			System.out.println("Enter a number, or 0 to quit");
			number = in.nextInt();
			if (number >= 1) {
				boolean result = isPrime(number);
				System.out.println("The number " + number + " is" + (result ? " " : " not ") + "prime");
			}
		} while (number >= 1);
		in.close();
	}

	/**
	 * A number is prime if it is not evenly divisibly by any
	 * integer between 2 and the square-root of the number
	 * 
	 * @param number The number to check
	 * @return true if the number is prime; otherwise false
	 */
	private static boolean isPrime(int number) {
		// We do not need to check for factors higher than this
		int limit = (int) Math.sqrt(number); 
		
		boolean answer = true;
		for (int factor = 2; factor <= limit; factor++) {
			if (number % factor == 0) answer = false;
		}
		return answer;
	}
}
