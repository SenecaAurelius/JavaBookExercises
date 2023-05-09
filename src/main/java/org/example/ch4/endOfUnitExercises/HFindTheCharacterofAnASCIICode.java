package org.example.ch4.endOfUnitExercises;

import java.util.Scanner;

public class HFindTheCharacterofAnASCIICode {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter a character : ");
        char character = input.nextLine().charAt(0);
        int ascii = (int) character;
        System.out.println("The ASCII code for character " + character + " is " + ascii);
    }
}
