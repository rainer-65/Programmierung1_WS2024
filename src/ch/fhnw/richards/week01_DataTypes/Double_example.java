package ch.fhnw.richards.week01_DataTypes;

public class Double_example {

	public static void main(String[] args) {
		double a = 1000000;
		System.out.println(a);
		double b = (a + 1) / 1000;
		System.out.println(b);
		double c = a / 1000;
		System.out.println(c);
		double d = b - c;
		System.out.println(d);
		double e = d * 1000000;
		System.out.println(e);
		double f = e - 1000;
		System.out.println(f);
	}

}
