package ch.fhnw.richards.week06_Loops_ArrayList.solutions.projectEuler;

public class Problem006 {
	
	public static void main(String[] args) {
		int num = 1;
		int sum = 0;
		int sum_of_squares = 0;
		while (num <= 100) {
			sum = sum + num;
			sum_of_squares = sum_of_squares + num * num;
			num++;
		}
		int square_of_sums = sum * sum;
		int difference = square_of_sums - sum_of_squares;
		System.out.println(difference);
	}

}
