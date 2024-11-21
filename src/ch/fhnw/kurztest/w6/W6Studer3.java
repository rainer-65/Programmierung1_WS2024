package ch.fhnw.kurztest.w6;

import java.util.ArrayList;
import java.util.Random;
import java.util.Iterator; // Keep this import - it is needed for a test case!!

class Numbers {

    private final ArrayList<Integer> allNumbers;
    private final ArrayList<Integer> oddNumbers;

        /*
        Ergänzen Sie die Klasse Numbers. Diese Klasse hat zwei Objektattribute, beide vom
        Typ ArrayList<Integer>. Eine wird mit Zufallszahlen gefüllt, die andere bekommt alle
        ungeraden Zahlen aus der ersten Liste.
        Ihre Aufgaben: Ergänzen Sie den Konstruktor. Der Konstruktor muss die beiden ArrayList-Objekte instanziieren.
        Ergänzen Sie die Methode createNumbers. Diese Methode speichert 100 Zufallszahlen im Bereich 1-20 (inklusiv)
        in die ArrayList allNumbers. Ergänzen Sie die Methode findOddNumbers. Diese Methode schaut alle Zahlen in
        allNumbers an. Alle ungeraden Zahlen werden der ArrayList oddNumbers hinzugefügt. Die Attributdeklarationen
        und die Getter-Methoden sind bereits vorhanden.
       */


    // Create the two ArrayLists
    public Numbers() {
        // Implement the constructor
        allNumbers = new ArrayList<>();
        oddNumbers = new ArrayList<>();
    }

    // Fill the ArrayList allNumbers with 100 random numbers in the range 1-20 (inclusive)
    public void createNumbers() {
        // Implement this method
        Random random = new Random();
        int randomNumber;
        int index = 0;
        while (index < 100) {
            randomNumber = random.nextInt(20) + 1;
            allNumbers.add(randomNumber);
            index++;
        }

    }

    // Find all odd numbers in allNumbers and put them into oddNumbers
    public void findOddNumbers() {
        int index = 0;
        while (index < 100) {
            if (allNumbers.get(index) % 2 == 1) {
                oddNumbers.add(allNumbers.get(index));
            }
            index++;
        }
    }

    // Getter methods
    public ArrayList<Integer> getAllNumbers() {
        return allNumbers;
    }

    public ArrayList<Integer> getOddNumbers() {
        return oddNumbers;
    }
}



