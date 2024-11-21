package ch.fhnw.richards.week06_Loops_ArrayList;

public class ExperimentWithWrapperClasses {

    public static void main(String[] args) {
        Integer x = 13;
        printInteger(x);

        // Mutability of Integer objects
        System.out.println("x Reference: " + System.identityHashCode(x));
        System.out.println("x Value: " + x);


        Integer y = x;
        System.out.println("y Reference: " + System.identityHashCode(y));
        System.out.println("y Value: " + y);

        x = x + 1; // or just "x++"
        System.out.println("x Reference: " + System.identityHashCode(x));
        System.out.println("x Value: " + x);

        // Dealing with null values
        Integer num = null;
        if (num != null) {
            int value = num;
            System.out.println(value);
        } else {
            System.out.println("Integer is null");
        }

    }

    // Method that prints an Integer
    private static void printInteger(Integer in) {
        System.out.println(in);
        System.out.println(Integer.toString(in));
        System.out.println(in.toString());
    }


}
