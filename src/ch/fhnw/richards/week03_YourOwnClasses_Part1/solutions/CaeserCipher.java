package ch.fhnw.richards.week03_YourOwnClasses_Part1.solutions;

public class CaeserCipher {

	public static void main(String[] args) {
		test('A', 3);
		test('Z', 4);
	}

	public static void test(char in, int key) {
		char encoded = encode(in, key);
		char decoded = decode(encoded, key);
		System.out.println(in + " + " + key + " = " + encoded + " decodes to " + decoded);
	}
	
	public static char encode(char in, int key) {
		int charValue = in + key;
		if (charValue > 'Z') charValue = charValue - 26;
		char out = (char) charValue;
		return out;
	}

	public static char decode(char in, int key) {
		int charValue = in - key;
		if (charValue < 'A') charValue = charValue + 26;
		char out = (char) charValue;
		return out;
	}

}
