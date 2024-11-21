package ch.fhnw.richards.week08_ControlStructures.solutions.projectEuler;

/**
 * A solution to problem 4: turn products into strings, and then
 * check to see if the string is a palindrome
 */
public class Problem004_v1 {

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
	
	/**
	 * Turn the value into a string. Then we compare two characters
	 * at a time, to see if they are the same. We begin at the start
	 * and the end, and move towards the middle.
	 */
	private static boolean isPalindrome(long val) {
		String sVal = Long.toString(val);
		
		boolean isPalindrome = true;
		for (int start = 0; start < sVal.length()/2; start++) {
			int end = sVal.length() - 1 - start;
			char leftChar = sVal.charAt(start);
			char rightChar = sVal.charAt(end);
			if (leftChar != rightChar) isPalindrome = false;
		}
		return isPalindrome;
	}

}
