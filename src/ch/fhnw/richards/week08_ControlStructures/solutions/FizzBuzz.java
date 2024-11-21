package ch.fhnw.richards.week08_ControlStructures.solutions;

public class FizzBuzz {

	public static void main(String[] args) {
		for (int i = 1; i <= 100; i++) {
			boolean isPrinted = false;
			if (i % 3 == 0) {
				System.out.print("Fizz");
				isPrinted = true;
			}
			if (i % 5 == 0) {
				System.out.print("Buzz");
				isPrinted = true;
			}
			if ( !isPrinted ) {
				System.out.print(i);
			}
			System.out.println();
		}
	}

}
