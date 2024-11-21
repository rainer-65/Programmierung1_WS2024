package ch.fhnw.richards.week01_DataTypes.solutions;

public class StoppingDistance {

	public static void main(String[] args) {
		// All variables are floats - why is this the correct choice?
		double velocity = 33.333f; // 120 km/h
		double reactionTime = 0.3f; // in seconds
		
		// Calculate reaction distance
		double reactionDistance = reactionTime * velocity;
		System.out.println("Reaction distance: " + reactionDistance);
		
		// Calculate braking distance
		double brakingDistance = velocity * velocity / 16;
		
		// Calculate the stopping distance
		double totalDistance = reactionDistance + brakingDistance;
		System.out.println(totalDistance);
	}
}
