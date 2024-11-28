package ch.fhnw.richards.week10_Arrays;

import java.util.Arrays;

public class ArrayCreation {

    public static void main(String[] args) {
        int[] numbers = new int[5];

        int[] numbers2 = new int[5];
        numbers2 = new int[]{1, 2, 3, 4, 5};

        int[] numbers3 = {1, 2, 3, 4, 5};

        int[] numbers4;
        numbers4 = new int[]{1, 2, 3, 4, 5};

        System.out.println("Arrays 2 and 3 identical: " + Arrays.equals(numbers2, numbers3));

        String[] names = {"John", "Mary", "David", "Sarah"};

        String names2[] = {"John", "Mary", "David", "Sarah"};       // so-called C-style declaration

        String[] names3;
        names3 = new String[]{"John", "Mary", "David", "Sarah"};

        boolean[] flags = new boolean[3];

        int[][] matrix;
        matrix = new int[][]{{1, 2}, {3, 4}, {5, 6}};

        int[][] matrix2 = {{1, 2}, {3, 4}, {5, 6}};


    }


}
