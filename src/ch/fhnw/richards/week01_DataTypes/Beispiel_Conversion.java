package ch.fhnw.richards.week01_DataTypes;

public class Beispiel_Conversion {

	public static void main(String[] args) {
		int i;
		long j = 1000000000;
		j = j * 1000;
		i = (int) j;
		System.out.println(i);
	}

}
