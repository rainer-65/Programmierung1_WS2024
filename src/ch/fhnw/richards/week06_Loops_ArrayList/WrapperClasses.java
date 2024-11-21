package ch.fhnw.richards.week06_Loops_ArrayList;

public class WrapperClasses {

	public static void main(String[] args) {
		wrapperClassExamples();
		immutableObjects();
	}

	private static void wrapperClassExamples() {
		int luckyNumber = 13;
		Integer luckyNumberWrapped = luckyNumber;
		System.out.println("These have the same value: "
		  + luckyNumber + " = " + luckyNumberWrapped);
		
		Double piWrapped = 3.14159265358979;
		double pi = piWrapped;
		System.out.println("These have the same value: "
		  + pi + " = " + piWrapped);
	}

	private static void immutableObjects() {
		Integer x = 13;
		Integer y = x;
		System.out.println("Are x and y the same object? " + (x == y));
		System.out.println("x = " + x + " and y = " + y);
		
		x = x + 1; // or just "x++"
		System.out.println("Are x and y the same object? " + (x == y));
		System.out.println("x = " + x + " and y = " + y);
	}
	
}
