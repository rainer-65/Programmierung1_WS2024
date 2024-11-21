package ch.fhnw.richards.week06_Loops_ArrayList;

import java.util.Scanner;

public class TriangleNumbers {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("enter a number of rows");
		int rows = in.nextInt();
		int answer = triangle(rows);
		System.out.println("The triangle number for " + rows + " is " + answer);
	}
	
	public static int triangle(int numRows) {
		int sum = 0;
		int row = 0;
		while ( row < numRows ) {
			row++;
			sum = sum + row;
		}
		return sum;
	}

}
