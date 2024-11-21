package ch.fhnw.richards.week01_DataTypes.solutions;

public class Zins {

	public static void main(String[] args) {
		double account_balance = 1234.50;
		double interest_rate = 0.005;

		// Nach einem Jahr
		account_balance = account_balance * (1 + interest_rate);
		System.out.println("Nach einem Jahr: " + account_balance);

		// Nach zwei Jahre
		account_balance = account_balance * (1 + interest_rate);
		System.out.println("Nach zwei Jahre: " + account_balance);

		// Nach drei Jahre
		account_balance = account_balance * (1 + interest_rate);
		System.out.println("Nach drei Jahre: " + account_balance);
	}

}
