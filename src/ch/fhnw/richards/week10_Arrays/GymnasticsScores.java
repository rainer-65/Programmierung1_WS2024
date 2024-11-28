package ch.fhnw.richards.week10_Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class GymnasticsScores {
	private static final int NUM_JUDGES = 5;
	
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int[] scores = new int[NUM_JUDGES];
		
		// Read the scores
		System.out.println("Enter "+ NUM_JUDGES + " scores");
		for (int i = 0; i < scores.length; i++) {
			scores[i] = in.nextInt();
		}
		
		Arrays.sort(scores);
		
		int sum = 0;
		for (int i = 1; i < (scores.length-1); i++) {
			sum += scores[i];
		}
		
		double finalScore = (double) sum / (double) (NUM_JUDGES - 2);
		System.out.println(finalScore);
	}
}
