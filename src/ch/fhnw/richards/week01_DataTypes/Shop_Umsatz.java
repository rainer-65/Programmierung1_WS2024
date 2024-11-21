package ch.fhnw.richards.week01_DataTypes;

/**
 * Shop Umsatz: 52 Wochen
 * Montag-Freitag: 20 Artikel zum Preis 10
 * Samstag: 30 Artikel zum Preis 8
 */
public class Shop_Umsatz {

	public static void main(String[] args) {
		int wochen = 52;
		int wochentag_artikel = 20;
		int wochentag_preis = 10;
		int samstag_artikel = 30;
		int samstag_preis = 8;
		
		int umsatz_wochentage = 5 * wochentag_artikel * wochentag_preis;
		int umsatz_pro_samstag = samstag_artikel * samstag_preis;
		int umsatz_pro_woche = umsatz_wochentage + umsatz_pro_samstag;
		
		int jahresumsatz = wochen * umsatz_pro_woche;
		System.out.println("Jahresumsatz ist " + jahresumsatz);
	}

}
