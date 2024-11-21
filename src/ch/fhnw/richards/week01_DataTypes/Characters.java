package ch.fhnw.richards.week01_DataTypes;

public class Characters {

	public static void main(String[] args) {
		char c1 = 'b';
		char c2 = 'r';
		char c3 = 'a';
		char c4 = 'd';
		
		int i1 = c1;
		int i2 = c2;
		int i3 = c3;
		int i4 = c4;

		System.out.println(c1 + " has the value " + i1);
		System.out.println(c2 + " has the value " + i2);
		System.out.println(c3 + " has the value " + i3);
		System.out.println(c4 + " has the value " + i4);
		
		c1 = (char) i1;
	}

}
