package ch.fhnw.richards.week01_DataTypes;

public class VAT {

	public static void main(String[] args) {
		double price = 10;
		double vat_rate = 0.08;
		
		double price_before_vat = price / (1 + vat_rate);
		double vat_paid = price - price_before_vat;
		System.out.println(vat_paid);
	}

}
