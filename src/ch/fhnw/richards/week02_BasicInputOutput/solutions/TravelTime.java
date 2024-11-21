package ch.fhnw.richards.week02_BasicInputOutput.solutions;

import java.util.Scanner;

public class TravelTime {
	
    public static void main(String args[] ) throws Exception {
        /* Prompt the user for inputs, read the inputs from the Scanner */
    	Scanner in = new Scanner(System.in);
    	System.out.println("How far do you have to travel (km)?");
    	int distance = in.nextInt();
    	System.out.println("How are you travelling? 1 = walk, 2 = bicycle, 3 = car, 4 = train");
    	int mode = in.nextInt();
    	in.close();

    	// Check the inputs for correctness.
    	if ( distance >= 0 && mode >= 1 && mode <= 4) {
    		// Declare an int variable "speed". Then use an
    		// "if" to set this to the correct speed of travel
    		int speed;
    		if (mode == 1) speed = 5;
    		else if (mode == 2) speed = 15;
    		else if (mode == 3) speed = 50;
    		else speed = 70; // (mode == 4)
    		
    		// Calculate the travel time. Cast variables to "double" if needed
    		double time = (double) distance / (double) speed;

    		// Get hours and minutes from the travel time
    		int hours = (int) time;
    		int minutes = (int) ((time - hours) * 60 + 0.5); // 0.5 avoids possible rounding errors
    		
    		// Print the result
    		System.out.println("Time required is " + hours + " hours and " + minutes + " minutes");
    	} else {
    		System.out.println("Error in your inputs");
    	}
    }
}