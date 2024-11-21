package ch.fhnw.richards.week06_Loops_ArrayList;

import java.util.Scanner;

public class IntegerArray {

    public static void main(String[] args) {

        // Define an Integer Array with fixed size
        int[] intArray = new int[5];

        // Read in data
        Scanner in = new Scanner(System.in);
        int counter = 0;

        while (counter <= 4) {      // Attention to the index!
            System.out.println("Enter a number: ");
            intArray[counter] = in.nextInt();
            counter++;
        }
        in.close();

        // Sum all numbers
        int sum = 0;
        int position = 0;
        while (position < intArray.length) {
            sum += intArray[position];
            System.out.println("Position " + position + " is " + intArray[position]);
            position++;
        }
        System.out.println("The sum is " + sum);
        System.out.println("The average is " + (double) sum / intArray.length);
    }

}
