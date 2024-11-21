package ch.fhnw.richards.week07_Repetition.loopExercises;

import java.util.Random;

public class RandomStars {

	public static void main(String[] args) {
		// Initialization
		Random random = new Random();
		int count = 0;
		
		// Repeat 10 times
		while (count < 10) {
			int number = random.nextInt(6) + 1; // +1 is important!
			System.out.print(number + ": ");
			count++;
			
			// Now generate the stars
			int starCount = 0;
			while (starCount < number) {
				System.out.print("*");
				starCount++;
			}
			
			// End the line
			System.out.println();
		}
	}
}
