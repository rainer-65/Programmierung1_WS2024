package ch.fhnw.richards.week08_ControlStructures;

import java.util.Scanner;

public class StringTest {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        System.out.println("Wie viele 'X' bei 'Hello' voranstellen? ");
        int number = in.nextInt();


        // Option 1: Schleife
        String hello = "Hello";
        for (int i = 0; i < number; i++) {
            hello = "X" + hello;
        }
        System.out.println(hello);
        System.out.println("Länge: " + hello.length());

    }
}
