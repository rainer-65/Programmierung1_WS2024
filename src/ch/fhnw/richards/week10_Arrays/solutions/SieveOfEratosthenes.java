package ch.fhnw.richards.week10_Arrays.solutions;

import java.util.ArrayList;

public class SieveOfEratosthenes {
	private static boolean[] sieve;
	private static ArrayList<Long> primes = new ArrayList<Long>();

	public static void main(String[] args) {
		final int MAX = 100;
		
		generatePrimesErastothenes(MAX);
		
		for (int i = 2; i <= MAX; i++) {
			if (sieve[i-2]) System.out.print(i + " ");
		}
	}

	
	
	/**
	 * Generate primes using the Sieve of Erastothenes.
	 * 
	 * @param topValueToTest
	 *            The highest value to test for primeness
	 */
	public static void generatePrimesErastothenes(int topValueToTest) {
		if (sieve == null || (sieve != null && sieve.length < (topValueToTest - 1))) {

			// Our array: position 0 represents the number 2
			sieve = new boolean[topValueToTest - 1];

			// Initialize to "true" for all values
			for (int i = 0; i < sieve.length; i++)
				sieve[i] = true;

			// Max value for which we must process the array
			int maxValue = (int) Math.sqrt(topValueToTest);

			// Process the array for each value in turn
			for (int val = 2; val <= maxValue; val++) {
				int valPos = val - 2;
				if (sieve[valPos]) {
					// Mark all multiples, beginning with val-squared
					for (int pos = val * val - 2; pos < sieve.length; pos += val) {
						sieve[pos] = false;
					}
				}
			}
			
			// Place the results into our array, for use in other exercises
			primes = new ArrayList<Long>();
			for (int i = 0; i < sieve.length; i++) {
				if (sieve[i]) primes.add(new Long(i + 2));
			}
		}
	}
	
	// Getter method for the primes list
	public static ArrayList<Long> getPrimes() {
		return primes;
	}
}
