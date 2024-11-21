package ch.fhnw.richards.week06_Loops_ArrayList;

import java.util.ArrayList;
import java.util.Scanner;

public class IntegerArrayList {

	public static void main(String[] args) {
		ArrayList<Integer> numbers = new ArrayList<>();
		
		// Read in data
		Scanner in = new Scanner(System.in);
		
		System.out.println("Enter a number: ");
		Integer number = in.nextInt();
		while(number != 0) {
			numbers.add(number);
			System.out.println("Enter a number: ");
			number = in.nextInt();
		}
		in.close();
		
		// Sum all numbers
		int sum = 0;
		int position = 0;
		while (position < numbers.size()) {
			number = numbers.get(position);
			sum = sum + number;
			System.out.println("Position " + position + " is " + number);
			position++;
		}
		System.out.println("The sum is " + sum);
	}

}
