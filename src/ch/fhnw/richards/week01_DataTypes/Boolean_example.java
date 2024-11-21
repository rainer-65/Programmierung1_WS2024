package ch.fhnw.richards.week01_DataTypes;

public class Boolean_example {

	public static void main(String[] args) {
		int x = 3;
		int y = 87;
		int z = -23;
		
		boolean x_largest = x > y && x > z;
		boolean y_largest = y > x && y > z;
		boolean z_largest = z > x && z > y;

		System.out.println("X is the largest: " + x_largest);
		System.out.println("Y is the largest: " + y_largest);
		System.out.println("Z is the largest: " + z_largest);
	}

}
