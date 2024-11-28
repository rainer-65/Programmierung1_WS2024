package ch.fhnw.richards.week10_Arrays.solutions;

import java.util.ArrayList;

public class Euler010 {

	public static void main(String[] args) {
		// Generate far too many primes
		SieveOfEratosthenes.generatePrimesErastothenes(2000000);
		
		ArrayList<Long> primes = SieveOfEratosthenes.getPrimes();
		
		long sum = 0;
		for (int i = 0; i < primes.size(); i++) {
			sum += primes.get(i);
		}
		
		System.out.println("Answer = " + sum);
	}
}
