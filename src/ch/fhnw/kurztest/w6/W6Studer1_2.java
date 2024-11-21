package ch.fhnw.kurztest.w6;

public class W6Studer1_2 {


    public static void main(String[] args) {

        // Aufgabe 1:
        // Welches Ausgabe wird vom folgenden Code generiert?
        // Achten Sie auf die Leerzeichen!

        int num = 1;
        int max = 25;
        while (num <= max) {
            System.out.print(num + " ");
            num += 10;
        }

        System.out.println();

        // Aufgabe 2:
        // Welche Ausgabe wird vom folgenden Code generiert?

        int number = 0, maximum = 15;
        while (number <= maximum) {
            if (number % 2 == 0)
                System.out.print(number + " ");
            number++;
        }


    }


}
