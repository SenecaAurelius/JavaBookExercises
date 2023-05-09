package org.example.ch4.endOfUnitExercises;

import java.util.Scanner;

public class IFindTheUnicodeOfACharacter {
    public static void main(String[] args) {
//        PFFFFFFF all wrong???
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter the character to convert into unicode : ");
        char character = input.nextLine().charAt(0);
        //String s = String.format("\\u%04x", (int) character);
        String s = Integer.toHexString(character);
        System.out.println("The unicode for character " + character + " is " + s);

    }
}
