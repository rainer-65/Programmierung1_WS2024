package ch.fhnw.richards.week02_BasicInputOutput.solutions;

import java.util.Scanner;

public class StoppingDistance {

	public static void main(String[] args) {
		double reactionTime = 0.3f; // reaction time in seconds
		
		// Read the user's input
		Scanner in = new Scanner(System.in);
		System.out.println("Enter the velocity in km/h");
		double velocity = in.nextDouble();
		in.close();

		// Calculate the stopping distance
		double velocity_mps = velocity * 1000 / 3600;
		double reactionDistance = reactionTime * velocity_mps;
		double brakingDistance = velocity_mps * velocity_mps / 16;
		double stoppingDistance = reactionDistance + brakingDistance;
		
		// Round the stopping distance to the nearest meter
		int answer = (int) (stoppingDistance + 0.5);
		
		// Print the answer: just the number, nothing else
		System.out.println(answer);
	}

}