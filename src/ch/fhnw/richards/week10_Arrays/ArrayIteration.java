package ch.fhnw.richards.week10_Arrays;

public class ArrayIteration {

    public static void main(String[] args) {

        // Create array
        int[] numberArray = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};

        // Iteration with while loop
        int i = 0;
        int sum = 0;
        while (i < numberArray.length) {
            sum += numberArray[i];
            i++;
        }
        double avg = (double) sum / numberArray.length;
        System.out.println("Average is: " + avg);

        // Iteration with for loop
        sum = 0;
        for (i = 0; i < numberArray.length; i++) {
            sum += numberArray[i];
        }
        System.out.println("Average is: " + avg);

        // Iteration with for each loop (enhanced for loop)
        sum = 0;
        for (int number : numberArray) {
            sum += number;
        }
        System.out.println("Average is: " + avg);
    }
}