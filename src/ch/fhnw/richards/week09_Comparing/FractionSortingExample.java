package ch.fhnw.richards.week09_Comparing;

import java.util.ArrayList;
import java.util.Collections;

/**
 * This program will only work after the Fraction class is completed !!!
 */
public class FractionSortingExample {

	public static void main(String[] args) {
		// Create a list filled with random fractions
		ArrayList<Fraction> fractions = generateRandomFractions(10);
		
		// Sort the fractions
		Collections.sort(fractions);
		
		// Print the fractions - see if they are really sorted
		for (Fraction fraction : fractions) System.out.println(fraction);		
	}

	private static ArrayList<Fraction> generateRandomFractions(int howMany) {
		ArrayList<Fraction> fractions = new ArrayList<>();
		for (int i = 0; i < howMany; i++) {
			long numerator = (int) (Math.random() * 100) + 1;
			long denominator = (int) (Math.random() * 100) + 2;
			Fraction f = new Fraction(numerator, denominator);
			fractions.add(f);
		}
		return fractions;
	}
	
}
