package ch.fhnw.richards.week08_ControlStructures.solutions.projectEuler;

/**
 * A solution to problem 4 where we use only math: see if a number
 * has the same value when reversed
 */
public class Problem004_v2 {

	public static void main(String[] args) {
		long bestAnswer = 0;
		for (long i = 100; i <= 999; i++) {
			for (long j = i; j <= 999; j++) {
				long product = i * j;
				if (isPalindrome(product)) {
					System.out.println("Palindrome found: " + product);
					if (product > bestAnswer) bestAnswer = product;
				}
			}
		}
		System.out.println("Answer = " + bestAnswer);
	}
	
	private static boolean isPalindrome(long val) {
		return (val == reversedNum(val));
	}

	/**
	 * Reverse a number: Get the last digit, using modulo.
	 * This digit becomes the first digit of the reversed number.
	 * Repeat until all digits have been processed.
	 */
	private static long reversedNum(long valIn) {
		long valReversed = 0;
		while (valIn > 0) {
			long lastDigit = valIn % 10;
			valIn = valIn / 10;
			valReversed = valReversed * 10 + lastDigit;
		}
		return valReversed;
	}
}
