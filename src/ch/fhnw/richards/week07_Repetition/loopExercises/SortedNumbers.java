package ch.fhnw.richards.week07_Repetition.loopExercises;

import java.util.ArrayList;
import java.util.Random;

public class SortedNumbers {

	public static void main(String[] args) {
		// Initialization
		ArrayList<Integer> numbers = new ArrayList<>();
		Random random = new Random();
		int count = 0;
		
		// Repeat 10 times
		while (count < 10) {
			int number = random.nextInt(6) + 1; // +1 is important!
			numbers.add(number);
			count++;
		}
		
		// Print directly
		System.out.println(numbers);
		System.out.println();
		
		// Sort the numbers
		numbers = sort(numbers);
		
		// Print with a loop
		int index = 0;
		while (index < numbers.size()) {
			System.out.print(numbers.get(index) + ", ");
			index++;
		}
		System.out.println();
	}
	
	private static ArrayList<Integer> sort(ArrayList<Integer> listIn) {
		ArrayList<Integer> listOut = new ArrayList<>();
		while (!listIn.isEmpty()) {
			// Finding the smallest requires a second loop
			int smallest = 0; // variable to hold the index of the smallest element
			int index = 1;
			while (index < listIn.size()) {
				if (listIn.get(index) < listIn.get(smallest)) smallest = index;
				index++;
			}
			Integer smallestElement = listIn.remove(smallest);
			listOut.add(smallestElement);
		}
		return listOut;
	}
}
