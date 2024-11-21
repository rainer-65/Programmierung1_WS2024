package ch.fhnw.richards.week07_Repetition;

import java.util.ArrayList;

public class Sorting {

    static ArrayList<Integer> sort(ArrayList<Integer> listIn) {
        ArrayList<Integer> listOut = new ArrayList<>();
        while (!listIn.isEmpty()) {
            // Finding the smallest requires a second loop
            int smallest = 0; // variable to hold the index of the smallest element
            int index = 1;
            while (index < listIn.size()) {
                if (listIn.get(index) < listIn.get(smallest)) smallest = index;
                index++;
            }
            Integer smallestElement = listIn.remove(smallest);
            listOut.add(smallestElement);
        }
        return listOut;
    }

}
