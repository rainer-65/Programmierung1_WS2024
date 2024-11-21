package ch.fhnw.richards.week07_Repetition.loopExercises;

import java.util.Random;

public class RandomNumbers {

	public static void main(String[] args) {
		// Initialization
		Random random = new Random();
		int count = 0;
		
		// Repeat 10 times
		while (count < 10) {
			int number = random.nextInt(6) + 1; // +1 is important!
			System.out.print(number + " ");
			count++;
		}
	}
}
