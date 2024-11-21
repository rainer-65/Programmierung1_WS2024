package ch.fhnw.richards.week09_Comparing;

public class TestingEquals {

	public static void main(String[] args) {
		String s1 = new String("1234");
		String s2 = new String("Hello");
		String s3 = new String("1234");
		String s4 = null; // Missing object
		Integer i1 = 1234;
		
		System.out.println( s1.equals(s2) );
		System.out.println( s1.equals(s3) );
		System.out.println( s1.equals(s4) );
		System.out.println( s1.equals(i1) );
	}

}
