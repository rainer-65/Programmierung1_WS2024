package ch.fhnw.richards.week01_DataTypes.solutions;

public class CaeserCipher {

	public static void main(String[] args) {
		char in = 'z';
		int key = 3;
		
		char encoded = (char) (in + key);
		System.out.println("Input " + in + " encoded " + encoded);
		
		char decoded = (char) (encoded - key);
		System.out.println("Input " + in + " encoded " + encoded + " decoded " + decoded);
	}

}
