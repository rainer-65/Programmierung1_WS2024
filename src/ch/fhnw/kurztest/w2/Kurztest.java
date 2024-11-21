package ch.fhnw.kurztest.w2;

public class Kurztest {

    public static void main(String[] args) {
        // Question 1
        // Schreiben Sie eine Zeile Code, die die folgenden Anforderungen erfüllt:
        // Eine String-Variable str deklarieren. Diese Variable dem Inhalt eines anderen Strings name zuweisen,
        // allerdings müssen alle Kleinbuchstaben in Grossbuchstaben
        // umgewandelt werden.

        String name= "";
        String str = name.toUpperCase();

        // Question 2
        int x = 8;
        if (x > 6) {
            System.out.println("x is " + (x - 5));
        }
        if (x < 4) {
            System.out.println("x is " + x);
        }

        // Question 3
        // Das lateinische Alphabet beinhaltet 26 Zeichen. Mit Gross- und Kleinschreiben sind das 52
        // unterschiedliche Zeichen. Wenn eine Sprache 16000 unterschiedliche Zeichen verwendet,
        // wie viele Bits werden benötigt, um ein Zeichen zu speichern?

        // Number of bits=log2(N)
        // N = 16000 => log2(16000) = 14

        // Question 4
        // Sie haben ein String-Variable overview, die ein String-Objekt referenziert.
        // Sie möchten die Anzahl Zeichen in diesem String-Objekt ausgeben. Nichts anderes: nur die Zahl.
        // Schreiben Sie eine Zeile Code, um diese Aufgabe zu erledigen.
        String overview="Hallo";
        System.out.println(overview.length());

        // Question 5
        // Sie haben ein String-Variable introduction, die ein String-Objekt referenziert.
        // Sie möchten das 8. Zeichen des Strings an die Konsole ausgeben. Gehen Sie davon aus,
        // dass das String-Objekt wirklich so viele Zeichen hat.
        //Schreiben Sie eine Zeile Code, um diese Aufgabe zu erledigen.

        String introduction = "HalloWelt";
        System.out.println(introduction.charAt(7));

        // Question 6
        // Welcher Wert hat b, nachdem die folgende Code-Zeile ausgeführt worden ist?
        boolean b = (5>8) || ((3-4)<(7%3));
        System.out.println(b);

    }
}