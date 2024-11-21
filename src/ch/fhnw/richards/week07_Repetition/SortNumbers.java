package ch.fhnw.richards.week07_Repetition;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class SortNumbers {

	public static void main(String[] args) {
		// Initialization
		Scanner in = new Scanner(System.in);
		ArrayList<Integer> numbers = new ArrayList<>();
		boolean keepReading = true;
		
		// Repeat task
		while(keepReading) {
			int nextNumber = in.nextInt();
			if (nextNumber >= 0) {
				numbers.add(nextNumber);
			} else {
				keepReading = false;
			}
		}

		// Final processing
		in.close();
		
		numbers = sort(numbers);
		System.out.println(numbers);
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
