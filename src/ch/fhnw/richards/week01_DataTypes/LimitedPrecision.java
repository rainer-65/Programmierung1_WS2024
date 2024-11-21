package ch.fhnw.richards.week01_DataTypes;

public class LimitedPrecision {

    public static void main(String[] args) {

        double a = 0.1;
        double b = 0.2;
        double sum = a + b;

        System.out.println(sum == 0.3); // false
        System.out.println(sum);        // 0.30000000000000004

    }
}
