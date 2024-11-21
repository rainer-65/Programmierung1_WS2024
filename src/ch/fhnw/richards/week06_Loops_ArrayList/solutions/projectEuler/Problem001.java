package ch.fhnw.richards.week06_Loops_ArrayList.solutions.projectEuler;

public class Problem001 {

	public static void main(String[] args) {
		int num = 1;
		int sum = 0;
		while (num < 1000) {
			if (num % 3 == 0 || num % 5 == 0) {
				sum = sum + num;
			}
			num++;
		}
		System.out.println(sum);
	}
}
