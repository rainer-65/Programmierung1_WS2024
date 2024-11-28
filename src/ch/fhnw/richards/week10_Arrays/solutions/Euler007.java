package ch.fhnw.richards.week10_Arrays.solutions;

import java.util.ArrayList;

public class Euler007 {

	public static void main(String[] args) {
		// Generate far too many primes
		SieveOfEratosthenes.generatePrimesErastothenes(1000000);

		// Look up the 10001st element (remember: 0-based)
		ArrayList<Long> primes = SieveOfEratosthenes.getPrimes();
		long answer = primes.get(10000);
		System.out.println("Answer = " + answer);
	}
}
